package ru.itis.controllers.simple;/* 30.05.2017
MessageController @author Victoria Noumenko 
@version v1.0 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import ru.itis.models.Message;
import ru.itis.services.MessageService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public class MessageController implements Controller {
    @Autowired
    private MessageService messageService;

    @Override
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        if (httpServletRequest.getMethod().equals("GET")) {
            ModelAndView result = new ModelAndView("messageView");
            List<Message> message = messageService.findAll();
            result.addObject("messageModel", message);
            return result;
        } else throw new IllegalArgumentException("BAD REQUEST");
    }
}
