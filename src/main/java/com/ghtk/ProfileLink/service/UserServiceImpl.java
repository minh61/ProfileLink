package com.ghtk.ProfileLink.service;

import com.ghtk.ProfileLink.model.entity.UserEntity;
import com.ghtk.ProfileLink.model.exception.NotFoundException;
import com.ghtk.ProfileLink.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class UserServiceImpl implements UserService{
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private UserRepository userRepository;

    public UserEntity getUserByUsername(String username) {
        UserEntity userEntity = userRepository.findByUsername(username);
        System.out.println(userEntity.getId());
        if(userEntity == null) {
           throw new NotFoundException("Khong tim thay nguoi dung");
        }
        return userEntity;
    }
}
