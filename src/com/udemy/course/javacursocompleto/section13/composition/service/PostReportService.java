package com.udemy.course.javacursocompleto.section13.composition.service;

import com.udemy.course.javacursocompleto.section13.composition.model.entities.Comment;
import com.udemy.course.javacursocompleto.section13.composition.model.entities.Post;

import java.text.SimpleDateFormat;

public class PostReportService {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public static void generatePostReport(Post post) {
        if (post == null) return;
        System.out.println(post.getTitle());
        System.out.printf("%d likes - %s\n", post.getLikes(), sdf.format(post.getMoment()));
        System.out.println(post.getContent());

        if (post.getComments().isEmpty()) return;
        System.out.println("Comments:");
        for (Comment comment : post.getComments()) {
            System.out.println(comment.getText());
        }
        System.out.println();
    }
}
