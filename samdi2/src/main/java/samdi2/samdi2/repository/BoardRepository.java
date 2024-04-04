package samdi2.samdi2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import samdi2.samdi2.entity.BoardEntity;

public interface BoardRepository extends JpaRepository<BoardEntity,Long> {
}
