package com.codebooth.springusercommentstaff.userPackage.dao;

import com.codebooth.springusercommentstaff.userPackage.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {

}
