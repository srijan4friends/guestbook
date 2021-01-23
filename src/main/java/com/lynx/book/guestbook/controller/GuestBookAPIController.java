package com.lynx.book.guestbook.controller;

import com.lynx.book.guestbook.model.Comments;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuestBookAPIController {



    @GetMapping("/guest/book/allComments")
    public Comments getAllComments(){
        Comments comments = new Comments();
        comments.setName("Jose");
        comments.setComment("Nice Place");

        return comments;
    }
}
