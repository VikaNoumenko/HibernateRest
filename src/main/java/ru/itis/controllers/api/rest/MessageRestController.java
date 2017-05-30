package ru.itis.controllers.api.rest;/* 30.05.2017
MessageRestController @author Victoria Noumenko 
@version v1.0 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itis.dto.MessageDto;
import ru.itis.models.Message;
import ru.itis.services.MessageService;

import java.util.List;

public class MessageRestController {

    @Autowired
    private MessageService messageService;

    @GetMapping(value = "/message/{chatId}/", params = "filter = message")
    public List<MessageDto> getAllMessages(@PathVariable("chat-id") int chatId,
                                           @RequestParam("chat") );
    List<Message> message= messageService.findAll();
}
