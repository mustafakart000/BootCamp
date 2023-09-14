package com.saferent.exception;


import com.saferent.exception.message.ApiResponseError;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.List;
import java.util.stream.Collectors;

//-Bu class daki amacımız custom bir exception sistemini kurmak
//-Gelebilecek olan exception 'ları override ederek istediğimiz yapıda (APIresponse) cevap verilmeisini sağlamak

@ControllerAdvice//merkezi exception'ları handle etmek için
public class SafeRentExceptionHandler extends ResponseEntityExceptionHandler {

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------

    //Loglamayı genel manada ne için kullanırız ??
    //user ve user kaydı için ancak genel de exceptionlar yani hatalarla ilgilidir hangi method çalışırken almış
    // olduğumuz hatalar alırız
    //Loglamayi hangi class'ın içinde oluştururuz ??
    //@ControllerAdvice annotation'ını kullanarak nereden exception fırlarsa fırlasın bu annotaton'ın olduğu
    // class'a gireceksin anlamına gelir ve bu yuzden centralize exception mechanism'ın avataj'larından biride bu oluyor
    // tüm loglama işlemlerini bu class'ın içerisine yapabiliyoruz.
    Logger logger = LoggerFactory.getLogger(SafeRentExceptionHandler.class); //log'lanmasını istediğimiz bu class'ın
                                                                                                        // adını yazarız
    private ResponseEntity<Object> buildResponseEntity(ApiResponseError error){
        logger.error(error.getMessage());//burada logger'ı kullanarak paremetresi error class bazında olan
        // ApiResonseError'u dataType kullanarak aşağıdaki exceptionların bu methodu return etmesiyle logger'u
        // tüm exceptionlara işlemiş yani enject'e etmiş oluyoruz
        return new ResponseEntity<>(error,error.getStatus());
    }
//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
    //LOCAL EXCEPTIONS

    @ExceptionHandler(ResourceNotFoundException.class)
    protected ResponseEntity<Object> handleResourceNotFoundException(ResourceNotFoundException ex, WebRequest request){

    ApiResponseError error = new ApiResponseError(HttpStatus.NOT_FOUND,
            ex.getMessage(),
            request.getDescription(false));

    return  buildResponseEntity(error);
}

//----------------------------------------------------------------------------------------------------------------------

    @ExceptionHandler(ConflictException.class)
    protected ResponseEntity<Object> handleConflictException(
            ConflictException ex, WebRequest request){

        ApiResponseError error = new ApiResponseError(HttpStatus.CONFLICT,
                ex.getMessage(), request.getDescription(false));
        return buildResponseEntity(error);
    }


//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
    //DEFAULT (HANDLE) EXCEPTION

    //MethodArgumentNotValidException ' dan gelen  birden fazla exception'ları alabilmek için DATA TYPE List Yapıyoruz
    // ve  gelecek tüm exception'ları da  getBindingResult() methodu ile class lar  olarak çekiyoruz.
    //getFieldErrors() hata alınan class'lar içinden fieldleri getiriyor.

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers,
                                                                  HttpStatus  status,
                                                                  WebRequest  request) {

        List<String> errors = ex.getBindingResult().
                    getFieldErrors().
                            stream().map(e-> e.getDefaultMessage()).
                                    collect(Collectors.toList());

        ApiResponseError error = new ApiResponseError(HttpStatus.BAD_REQUEST,
                                                            errors.get(0).toString(),
                                                                request.getDescription(false));

        return  buildResponseEntity(error);    }
//----------------------------------------------------------------------------------------------------------------------

    @Override
    protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
                                                                  HttpHeaders headers,
                                                                  HttpStatus status, WebRequest request) {

        ApiResponseError error = new ApiResponseError(HttpStatus.BAD_REQUEST,
                ex.getMessage(),
                request.getDescription(false));

        return  buildResponseEntity(error);
    }
//----------------------------------------------------------------------------------------------------------------------
    @Override
    protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(HttpMediaTypeNotSupportedException ex,
                                                                     HttpHeaders headers, HttpStatus status,
                                                                     WebRequest request) {
        ApiResponseError error = new ApiResponseError(HttpStatus.BAD_REQUEST,
               ex.getMessage(),
                request.getDescription(false));

        return  buildResponseEntity(error);

    }

    //Unique isimlerin çakışma durumu için olabilir.
    //Bunu custom olarak sonra yapacağız

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------
    //GLOBAL EXCEPTIONS

    @ExceptionHandler(RuntimeException.class)
protected ResponseEntity<Object> handleRuntimeException(RuntimeException ex, WebRequest request){
        ApiResponseError error = new ApiResponseError(HttpStatus.INTERNAL_SERVER_ERROR,
                                                        ex.getMessage(), request.getDescription(false));
        return  buildResponseEntity(error);
    }
//----------------------------------------------------------------------------------------------------------------------
    @ExceptionHandler(Exception.class)
    protected ResponseEntity<Object> handleGeneralException(Exception ex, WebRequest request){

        ApiResponseError error = new ApiResponseError(HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage(),
                                                        request.getDescription(false));
        return  buildResponseEntity(error);
    }

//----------------------------------------------------------------------------------------------------------------------
//----------------------------------------------------------------------------------------------------------------------

}
