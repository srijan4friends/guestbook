package com.lynx.book.guestbook.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuestBookAPIController {

    @GetMapping("/guest/book/allComments")
    public String getAllComments(){

        return "Jose";
    }
}
