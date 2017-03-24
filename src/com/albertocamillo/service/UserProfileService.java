package com.albertocamillo.service;

import java.util.List;

import com.albertocamillo.model.UserProfile;


public interface UserProfileService {

	UserProfile findById(int id);

	UserProfile findByType(String type);
	
	List<UserProfile> findAll();
	
}
