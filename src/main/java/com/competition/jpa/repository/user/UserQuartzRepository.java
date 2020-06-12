package com.competition.jpa.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.competition.jpa.model.user.User;

@Repository
public interface UserQuartzRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
