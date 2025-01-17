package com.example.cheerdo.post.dto.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
public class LetterResponseDto {
    @ApiModelProperty("letter의 고유번호")
    private final Long letterId;
    @ApiModelProperty("보낸사람 이름")
    private final String senderName;
    @ApiModelProperty("편지제목")
    private final String title;
    @ApiModelProperty("편지내용")
    private final String message;
    // 열람되었는지 확인하는 변수 이건 entity에 추가하는게 맞을 듯 싶다.
    // private boolean isOpened;
    @ApiModelProperty("관계 교유키")
    private final Long relationId;

    @ApiModelProperty("관계 교유키")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private final LocalDate sendDate;

    @Builder
    public LetterResponseDto(Long letterId, String senderName, String title, String message, Long relationId, LocalDate sendDate) {
        this.letterId = letterId;
        this.senderName = senderName;
        this.title = title;
        this.message = message;
        this.relationId = relationId;
        this.sendDate = sendDate;
    }
}
