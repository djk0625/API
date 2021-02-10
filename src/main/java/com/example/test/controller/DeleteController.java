package com.example.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/articles")
public class DeleteController {
    @RequestMapping(method = RequestMethod.DELETE, path = "{id}")
    {
    }
}
