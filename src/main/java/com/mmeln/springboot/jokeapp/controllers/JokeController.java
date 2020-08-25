package com.mmeln.springboot.jokeapp.controllers;

import com.mmeln.springboot.jokeapp.services.JokeService;
import com.mmeln.springboot.jokeapp.services.impl.JokeServiceJavaBaseConfigImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokeController {

    private JokeService jokeService;

    @Autowired
    public JokeController(@Qualifier("jokeServiceJavaBaseConfigImpl") JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/", ""})
    public String showJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());
        return "chucknorris";
    }

}
