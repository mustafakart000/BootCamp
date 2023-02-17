package com.saferent.controller;


import com.saferent.domain.ContactMessage;
import com.saferent.dto.ContactMessageDTO;
import com.saferent.dto.request.ContactMessageRequest;
import com.saferent.dto.response.SfResponse;
import com.saferent.mapper.ContactMessageMapper;
import com.saferent.service.ContactMessageService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

//@AllArgsConstructor
@RestController
@RequestMapping("/contactmessage")
public class ContactMessageController {


    public ContactMessageController(ContactMessageMapper contactMessageMapper,
                                    ContactMessageService contactMessageService) {
        this.contactMessageMapper = contactMessageMapper;
        this.contactMessageService = contactMessageService;
    }

    private final ContactMessageMapper contactMessageMapper;
    private final ContactMessageService contactMessageService;

//Create ContactMessage

    @PostMapping("/visitors")
    public ResponseEntity<SfResponse> createMessage(@Valid @RequestBody ContactMessageRequest contactMessageRequest){

        //bana gelen dto 'u pojo 'ya çevirmek için mapStruct yapısını kullancağım

      ContactMessage contactMessage=
              contactMessageMapper.contactMessageRequestToContactMessage(contactMessageRequest);
      contactMessageService.saveMessage(contactMessage);
      SfResponse response = new SfResponse("ContactMessage successfully created", true);
      return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    //!!! getAll ContactMessages

    @GetMapping
    public ResponseEntity<List<ContactMessageDTO>> getAllContactMessages() {
        List<ContactMessage> contactMessageList =  contactMessageService.getAll();
        //mapStruct
        List<ContactMessageDTO> contactMessageDTOList = contactMessageMapper.map(contactMessageList);
        return ResponseEntity.ok(contactMessageDTOList);
//      OR  return new ResponseEntity<>(contactMessageDTOList, HttpStatus.OK);
    }

    //!!! pageable

    @GetMapping("/pageable")
    private ResponseEntity<Page<ContactMessageDTO>> getAllContactMessageWithPage(
            @RequestParam("page") int page,
            @RequestParam("size") int size,
            @RequestParam("sort") String prop,
            @RequestParam(value="direction",
                                                required = false, defaultValue = "DESC")Sort.Direction direction
                                                                                )
    {
       Pageable pageable = PageRequest.of(page, size, Sort.by(direction, prop));
      Page<ContactMessage> contactMessagePage= contactMessageService.getAll(pageable);

       Page<ContactMessageDTO> pageDTO= getPageDTO(contactMessagePage);
       return ResponseEntity.ok(pageDTO);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ContactMessageDTO> getContactMessageById(@PathVariable("id") Long id){

        ContactMessage contactMessage= contactMessageService.getById(id);

       ContactMessageDTO contactMessageDTO = contactMessageMapper.contactMessageToDTO(contactMessage);

       return ResponseEntity.ok(contactMessageDTO);

    }






















    //!!! getPageDTO

    private Page<ContactMessageDTO> getPageDTO(Page<ContactMessage>contactMessagePage){
        return contactMessagePage.
                map(contactMessage -> contactMessageMapper.contactMessageToDTO(contactMessage));
            //burada ki map page den geliyor.
    }


}
