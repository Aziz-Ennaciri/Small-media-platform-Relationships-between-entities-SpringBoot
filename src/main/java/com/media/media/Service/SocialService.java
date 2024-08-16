package com.media.media.Service;

import com.media.media.Beans.SocialUser;
import com.media.media.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocialService{

    @Autowired
    private UserRepository userRepository;

    public List<SocialUser> getAllUsers() {
        return userRepository.findAll();
    }

    public SocialUser saveUser(SocialUser user) {
        return userRepository.save(user);
    }
}
