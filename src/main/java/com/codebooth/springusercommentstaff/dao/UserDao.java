package com.codebooth.springusercommentstaff.dao;

import com.codebooth.springusercommentstaff.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {

}
