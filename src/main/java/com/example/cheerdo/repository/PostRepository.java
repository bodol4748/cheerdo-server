package com.example.cheerdo.repository;

import com.example.cheerdo.entity.FriendRelation;
import com.example.cheerdo.entity.Post;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Long> {

    Optional<List<Post>> findAllByReceiverIdAndIsOpenOrderBySendDateTime(@Param("memberId") String memberId, @Param("isOpen") boolean isOpen);
    Optional<List<Post>> findAllByReceiverIdAndIsOpenAndSendDateTimeBetween(@Param("memberId") String memberId,
                                                      @Param("isOpen") boolean isOpen,
                                                      @Param("startDate") LocalDate startDate,
                                                      @Param("endDate") LocalDate endDate,
                                                      Sort sort);
    Optional<Integer> countAllByReceiverIdAndIsOpen(@Param("memberId") String memberId,
                                                    @Param("isOpen") boolean isOpen);
}