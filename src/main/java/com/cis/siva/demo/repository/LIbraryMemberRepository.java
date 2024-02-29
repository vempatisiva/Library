package com.cis.siva.demo.repository;


import com.cis.siva.demo.entity.LibraryMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LIbraryMemberRepository extends JpaRepository<LibraryMember, Integer> {

}