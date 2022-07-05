package com.codebooth.springusercommentstaff.service.entitiyservice;

import com.codebooth.springusercommentstaff.dao.UserDao;
import com.codebooth.springusercommentstaff.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserEntityService {

    private final UserDao userDao;

    public List<User> findAll(){
        return userDao.findAll();
    }

    public Optional<User> findById(Long id){
        return userDao.findById(id);
    }

    public User save(User user){
        return userDao.save(user);
    }

    public void delete(Long id){
        userDao.deleteById(id);
    }

    public void delete(User user){
        userDao.delete(user);
    }

    public boolean isExist(Long id){
        return userDao.existsById(id);
    }
}
