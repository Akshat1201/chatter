package com.chatter.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chatter.app.enitty.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {

}
