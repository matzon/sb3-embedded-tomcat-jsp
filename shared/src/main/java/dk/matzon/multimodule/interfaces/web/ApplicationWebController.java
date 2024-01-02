package dk.matzon.multimodule.interfaces.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ApplicationWebController {

    @GetMapping("/")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("templates/index");
        modelAndView.getModel().put("name", "bacon");
        return modelAndView;
    }

    @GetMapping("/other")
    public String other() {
        return "templates/other";
    }

    @GetMapping("/external")
    public String external() {
        return "external/file";
    }
}
