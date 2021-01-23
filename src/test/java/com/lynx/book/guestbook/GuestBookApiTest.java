package com.lynx.book.guestbook;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@WebMvcTest
@AutoConfigureMockMvc
public class GuestBookApiTest {

    @Autowired
    MockMvc mvc;

    //Any visitor can post their name and a comment to the Guestbook.
    /*@Test
    public void postCommentSuccessTest(){
        mvc.perform(post)
    }*/

    //All visitors can see a list of every entry in the Guestbook.
    @Test
    public void getAllComments() throws Exception {
        mvc.perform(get("/guest/book/allComments"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].name").value("Srijan"))
                .andExpect(jsonPath("$[0].comment").value("Good Place"))
                .andExpect(jsonPath("$[1].name").value("Jose"))
                .andExpect(jsonPath("$[1].comment").value("Nice Place"));
    }


}
