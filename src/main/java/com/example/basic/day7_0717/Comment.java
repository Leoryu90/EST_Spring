package com.example.basic.day7_0717;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Comment {

    private Long id;
    private String content;
    private String author;
    private LocalDateTime createdAt;
    private BoardPost boardPost;
}