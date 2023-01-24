package com.example.cheerdo.post.service;

import com.example.cheerdo.post.dto.request.LetterRequestDto;
import com.example.cheerdo.post.dto.request.PostRequestDto;
import com.example.cheerdo.post.dto.response.LetterResponseDto;
import com.example.cheerdo.post.dto.response.PostResponseDto;

import java.util.List;

public interface PostService {
    List<PostResponseDto> getMyPosts(PostRequestDto postRequestDto) throws Exception;

    LetterResponseDto readPost(Long letterId);

    void writeLetter(LetterRequestDto letterRequestDto);
}
