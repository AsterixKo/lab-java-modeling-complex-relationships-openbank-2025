package com.example.demo.nursesassociation.repositories;

import com.example.demo.nursesassociation.models.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
}
