package com.example.demo.service;

import com.example.demo.dao.UserDAO;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserDAO userDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public User findById (Long id){
        return userDAO.getOne(id);
    }
    public List<User> findAll(){
        return userDAO.findAll();
    }
    public User saveUser (User user){
        return userDAO.save(user);
    }
    public void deleteById(Long id){
        userDAO.deleteById(id);
    }

}