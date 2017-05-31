package ru.itis.controllers.api.rest;/* 30.05.2017
ChatRestController @author Victoria Noumenko 
@version v1.0 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itis.dto.ChatDto;
import ru.itis.models.Chat;
import ru.itis.services.ChatService;

import java.util.List;


public class ChatRestController {
    @Autowired
    private ChatService chatService;

    @GetMapping(value = "/chat/{chat-id}", params = "filter = chat")
    public List<ChatDto> getMessages(@PathVariable("chat-id") int chatId,
                                     @RequestParam("chat") Chat chat);
        List<Chat> chat= chatService.findAll();

}
