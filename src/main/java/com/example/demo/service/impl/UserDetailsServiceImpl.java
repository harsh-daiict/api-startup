package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	
	@Autowired
	UserRepository userRepository;
	
	
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    	User user = null;

        try {
            user = userRepository.findByEmail(username);
        }catch (Exception ex){
            ex.printStackTrace();
        }

        if(user == null) throw new UsernameNotFoundException("User does not exists");
        
        return user;
    }
}

