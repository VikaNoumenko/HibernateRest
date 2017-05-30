package ru.itis.controllers.api;/* 30.05.2017
ChatJsonController @author Victoria Noumenko 
@version v1.0 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.itis.converter.ChatConverter;
import ru.itis.dao.UsersDao;
import ru.itis.dto.ChatDto;
import ru.itis.models.Chat;
import ru.itis.services.ChatService;

import java.util.List;

public class ChatJsonController {
    @Autowired
    ChatService chatService;

    @RequestMapping(value = "/annotation/chat/json", method =  RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody
    public List<ChatDto> findAll(){
        List<Chat> chats = chatService.findAll();
        List<ChatDto> chatDtoList = ChatConverter.convertListChats(chats);
        return chatDtoList;
    }
}
