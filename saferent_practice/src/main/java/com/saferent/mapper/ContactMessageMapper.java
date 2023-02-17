package com.saferent.mapper;



import com.saferent.domain.ContactMessage;
import com.saferent.dto.ContactMessageDTO;
import com.saferent.dto.request.ContactMessageRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring") //herhangi bir sınıfı eject'e edip kullanabilirim
public interface ContactMessageMapper {

    //!!! ContactMessage--> ContactMessageDTO
    ContactMessageDTO contactMessageToDTO(ContactMessage contactMessage);

    //!!! ContactMessageRequest--> ContactMessage
    //map'lerken id DTO da olmadığı için hata verecek bu yüzden hata vermemesi için @Mapping(target="id", ignore= true)
    // kullanırız
    @Mapping(target="id", ignore= true)
    ContactMessage contactMessageRequestToContactMessage(ContactMessageRequest contactMessageRequest);

    //!!! List<ContactMessage> ---> List<ContactMessageDTO>

    List<ContactMessageDTO> map(List<ContactMessage> contactMessageList); //getAllContactMessage()
    //dezavantajları sizi bazı yapılara zorlar mesala pojo veya dto classlarınız da field'ların dataType larını sonrada
    // değişmek istediğimiz de exception verebiliyor ve id için @ Mapping annotation kullanmak zorundayız.



}
