package com.fishermenz.services;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.fishermenz.repositories.UserRepository;

@Service
public class FisherMenzUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;
	private static final Logger logger = LoggerFactory.getLogger(FisherMenzUserDetailsService.class);

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		logger.info("===================loadByUserName============== :" + username);
		com.fishermenz.entities.User user = userRepository.findByEmailAddress(username);
		System.out.println("------------loadByUserName  User---------:  " + user);
		return new User(user.getEmailAddress(), user.getPassword(), Arrays.asList(new GrantedAuthority[]{new SimpleGrantedAuthority("user")}));
	}

	
}