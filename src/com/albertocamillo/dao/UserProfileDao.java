package com.albertocamillo.dao;

import java.util.List;

import com.albertocamillo.model.UserProfile;


public interface UserProfileDao {

	List<UserProfile> findAll();
	
	UserProfile findByType(String type);
	
	UserProfile findById(int id);
}
