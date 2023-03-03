package com.example.cheerdo.repository;

import com.example.cheerdo.entity.Post;
import com.example.cheerdo.entity.PostRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PostRequestRepository extends JpaRepository<PostRequest, Long> {
    Optional<List<PostRequest>> findAllByReceiverId (String friendId);
}