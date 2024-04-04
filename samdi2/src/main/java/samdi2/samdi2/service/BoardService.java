package samdi2.samdi2.service;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import samdi2.samdi2.dto.Board;
import samdi2.samdi2.entity.BoardEntity;
import samdi2.samdi2.mapper.BoardMapper;
import samdi2.samdi2.repository.BoardRepository;
import samdi2.samdi2.request.BoardRequest;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;
    private final BoardMapper boardMapper;

    public void register(BoardRequest request) {
        boardRepository.save(boardMapper.toEntity(request));
    }

    public void deletePost(Long postId) {
        Optional<BoardEntity> boardEntity = boardRepository.findById(postId);
        if (boardEntity.isPresent()) {
            boardRepository.delete(boardEntity.get());
        }
    }

    public Board getPost(Long id) {
        Optional<BoardEntity> board = boardRepository.findById(id);



        return Board.get();
    }
}
