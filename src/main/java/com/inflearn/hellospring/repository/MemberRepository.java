package com.inflearn.hellospring.repository;

import com.inflearn.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    //Optional => null을 반환하는 경우도 있기 때문에 Optional로 감싸서 반환함
    //java8부터 지원함
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}