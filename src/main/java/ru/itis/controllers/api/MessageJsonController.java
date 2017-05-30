package ru.itis.controllers.api;/* 30.05.2017
MessageJsonController @author Victoria Noumenko 
@version v1.0 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.itis.converter.MessageConverter;
import ru.itis.dto.MessageDto;
import ru.itis.models.Message;
import ru.itis.services.MessageService;

import java.util.List;

public class MessageJsonController {
    @Autowired
    MessageService messageService;

    @RequestMapping(value = "/annotation/message/json", method =  RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public List<MessageDto> findAll(){
        List<Message> messages = messageService.findAll();
        List<MessageDto> messageDtoList = MessageConverter.convertListMessages(messages);
        return messageDtoList;
    }
}
