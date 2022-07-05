package com.codebooth.springusercommentstaff.userCommentPackage.service.entityservice;

import com.codebooth.springusercommentstaff.userCommentPackage.dao.UserCommentDao;
import com.codebooth.springusercommentstaff.userCommentPackage.usercomment.UserComment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserCommentEntityService {

    private final UserCommentDao userCommentDao;

    public List<UserComment> findAll() {
        return userCommentDao.findAll();
    }

    public UserComment save(UserComment userComment){
        return userCommentDao.save(userComment);
    }

    public void delete(Long id){
        userCommentDao.deleteById(id);
    }

    public boolean isExist(Long id){
        return userCommentDao.existsById(id);
    }

}
