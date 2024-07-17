package com.example.basic.day7_0717;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BoardPostService {
    List<BoardPost> boardPosts = new ArrayList<>();
    private Long nextPostId = 1L;
    private Long currentPostId = 1L;

    public BoardPostDto createBoardPost(BoardPostDto boardPostDto) {
        return null;
    }
}
