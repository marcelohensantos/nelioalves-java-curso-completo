package com.udemy.course.javacursocompleto.section13.composition.application;

import com.udemy.course.javacursocompleto.section13.composition.model.entities.Comment;
import com.udemy.course.javacursocompleto.section13.composition.model.entities.Post;
import com.udemy.course.javacursocompleto.section13.composition.service.PostReportService;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class PostApp01 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Post post1 = new Post(fmt.parse("21/06/2018 13:05:44"), "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);
        Post post2 = new Post(fmt.parse("28/07/2018 23:14:19"), "Good night guys", "See you tomorrow", 5);

        post1.addComment(new Comment("Have a nice trip"));
        post1.addComment(new Comment("Wow that's awesome!"));

        post2.addComment(new Comment("Good night"));
        post2.addComment(new Comment("May the Force be with you"));

        PostReportService.generatePostReport(post1);
        PostReportService.generatePostReport(post2);
    }
}
