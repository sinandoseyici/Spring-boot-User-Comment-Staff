package com.codebooth.springusercommentstaff.userCommentPackage.dao;

import com.codebooth.springusercommentstaff.userCommentPackage.usercomment.UserComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserCommentDao extends JpaRepository<UserComment, Long> {
}
