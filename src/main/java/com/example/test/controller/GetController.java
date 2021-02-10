package com.example.test.controller;

import com.example.test.model.Info;
import com.example.test.model.Info2;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/articles")
public class GetController {
    @RequestMapping(method = RequestMethod.GET, path = "/author")
    public Info2 author(Info2 info2)
    {
        return info2;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/id")
    public String id(Info info)
    {
        return "id= "+info.getId()+", name = "+info.getName()+", content = "+info.getContent()+", author = "+info.getAuthor();
    }
}


// @RequestParam("createDate") @DateTimeformat(pattern = "yyyy-MM-dd HH:mm:ss") Date startdate
// 날짜 관련 메서드 동작 X
