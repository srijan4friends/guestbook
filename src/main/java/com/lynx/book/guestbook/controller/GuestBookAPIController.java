package com.lynx.book.guestbook.controller;

import com.lynx.book.guestbook.model.Comments;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GuestBookAPIController {

    public List<Comments> commentList;


    public void setup(){
        commentList = new ArrayList<Comments>();
        //1st comment
        Comments comments = new Comments();
        comments.setName("Srijan");
        comments.setComment("Good Place");
        commentList.add(comments);
        //2nd comment
        Comments comments1 = new Comments();
        comments1.setName("Jose");
        comments1.setComment("Nice Place");
        commentList.add(comments1);
    }


    @GetMapping("/guest/book/allComments")
    public List<Comments> getAllComments(){
        setup();
        return commentList;
    }

    @PostMapping("/guest/book/addComment")
    public String addComment(@RequestBody Comments comments){
        commentList = new ArrayList<Comments>();
        commentList.add(comments);
        if(commentList.size()>0)
            return "Comment Added.";
        return "Comment failed.";

    }
}
