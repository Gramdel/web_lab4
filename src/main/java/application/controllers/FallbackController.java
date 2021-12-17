package application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FallbackController {
    @RequestMapping(method = {RequestMethod.OPTIONS, RequestMethod.GET}, path = {"/main", "/auth", "/"})
    public String forwardVuePaths() {
        return "forward:/index.html";
    }
}