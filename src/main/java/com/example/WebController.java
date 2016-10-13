package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by icanon on 13/10/16.
 */
@Controller
public class WebController {

    @RequestMapping(method = RequestMethod.GET, value = {"/", "/hello"})
    public String showsome() {
        return "hello";
    }

    @RequestMapping(method = RequestMethod.GET, value = {"/saymyname/{name}"})
    public ModelAndView saymyname(@PathVariable("name") String name) {
        return new ModelAndView("name").
                addObject("name", name);
    }
}
