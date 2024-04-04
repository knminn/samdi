package samdi2.samdi2.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import samdi2.samdi2.request.BoardRequest;
import samdi2.samdi2.service.BoardService;

@RestController
@RequiredArgsConstructor
@RequestMapping("//board")
public class BoardController {

    private final BoardService boardService;

    @PostMapping
    public void register(BoardRequest boardRequest) {
        boardService.register(boardRequest);
    }

    @DeleteMapping
    public void deletePost(@RequestParam final Long id) {
        boardService.deletePost(id);
    }
    @GetMapping
    public void getPost(@RequestParam final Long id) {
        boardService.getPost(id);
    }
}


