package samdi2.samdi2.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Board {

    private Long id;
    private String title;
    private String content;

    public static Board get() {
        return null;
    }
}
