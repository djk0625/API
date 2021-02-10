package com.example.test.controller;

import com.example.test.model.Info2;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/articles")
public class PostController {

    @RequestMapping(method = RequestMethod.POST, path = "/list")
    public Info2 list(@RequestBody Info2 info2)
    {
        return info2;
    }
}
