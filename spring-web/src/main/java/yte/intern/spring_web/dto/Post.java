package yte.intern.spring_web.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {

    private Long userId;
    private Long id;
    private String title;
    private String body;
}
