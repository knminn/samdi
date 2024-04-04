package samdi2.samdi2.mapper;

import org.springframework.stereotype.Component;
import samdi2.samdi2.dto.Board;
import samdi2.samdi2.entity.BoardEntity;
import samdi2.samdi2.request.BoardRequest;

@Component
public class BoardMapper {

    public BoardEntity toEntity(BoardRequest boardRequest){
        return BoardEntity.builder()
                .title(boardRequest.getTitle())
                .content(boardRequest.getContent())
                .build();
    }

    public Board toDto(BoardEntity boardEntity){

        return null;
    }
}
