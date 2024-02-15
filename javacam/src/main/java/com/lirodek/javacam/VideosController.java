package com.lirodek.javacam;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class VideosController {

    @RequestMapping(value = "/videos", method=RequestMethod.GET)
    public String index() {
        return "강좌 리스트";
    }

}
