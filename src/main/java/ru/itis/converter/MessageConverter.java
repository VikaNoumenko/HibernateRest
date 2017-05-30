package ru.itis.converter;/* 30.05.2017
MessageConverter @author Victoria Noumenko 
@version v1.0 */

import ru.itis.dto.MessageDto;
import ru.itis.models.Message;

import java.util.ArrayList;
import java.util.List;

public class MessageConverter {

    public static MessageDto convert(Message message) {

        MessageDto messageDto = new MessageDto.Builder()
                .id(message.getId())
                .text(message.getText())
                .chat(message.getChat())
                .author(message.getAuthor())
                .build();
        return messageDto;
    }

    public static List<MessageDto> convertListMessages(List<Message> messages){
        List<MessageDto> messagesDto = new ArrayList<MessageDto>();
        for(Message message: messages){
            MessageDto newMessageDto = new MessageDto.Builder()
                    .id(message.getId())
                    .text(message.getText())
                    .chat(message.getChat())
                    .author(message.getAuthor())
                    .build();
            messagesDto.add(newMessageDto);
        }
        return messagesDto;
    }
}
