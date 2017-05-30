package ru.itis.converter;/* 30.05.2017
ChatConverter @author Victoria Noumenko 
@version v1.0 */

import ru.itis.dto.ChatDto;
import ru.itis.models.Chat;

import java.util.ArrayList;
import java.util.List;

public class ChatConverter {
    public static ChatDto convert(Chat chat) {

    ChatDto chatDto = new ChatDto.Builder()
            .id(chat.getId())
            .name(chat.getName())
            .creator(chat.getCreator())
            .build();
        return chatDto;
}

    public static List<ChatDto> convertListChats(List<Chat> chats){
        List<ChatDto> chatsDto = new ArrayList<ChatDto>();
        for(Chat chat: chats){
            ChatDto newChatDto = new ChatDto.Builder()
                    .id(chat.getId())
                    .name(chat.getName())
                    .creator(chat.getCreator())
                    .build();
            chatsDto.add(newChatDto);
        }
        return chatsDto;
    }
}
