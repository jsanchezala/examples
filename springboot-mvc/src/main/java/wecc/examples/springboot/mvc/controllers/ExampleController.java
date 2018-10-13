package wecc.examples.springboot.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ExampleController {

    @RequestMapping("/greeting")
    public ModelAndView greeting(){
        return new ModelAndView("greeting")
                .addObject("name",  "World");
    }

}

