package ru.itis.controllers.simple;/* 30.05.2017
ChatController @author Victoria Noumenko 
@version v1.0 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import ru.itis.models.Chat;
import ru.itis.services.ChatService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class ChatController implements Controller {
    @Autowired
    private ChatService chatService;

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        if (httpServletRequest.getMethod().equals("GET")) {
            ModelAndView result = new ModelAndView("chatView");
            List<Chat> chat = chatService.findAll();
            result.addObject("chatModel", chat);
            return result;
        } else throw new IllegalArgumentException("BAD REQUEST");
    }
}
