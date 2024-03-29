package com.jsoftware.platform.controller;

import com.jsoftware.platform.model.Board;
import com.jsoftware.platform.service.BoardService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class BoardController {

    BoardService service;

    @GetMapping()
    public List<Board> boards(String size) {
        List<Board> boards = service.getBoards(size);
        return boards;
    }

    @GetMapping("count")
    public int count() {
        return BoardService.getDbCount();
    }

}