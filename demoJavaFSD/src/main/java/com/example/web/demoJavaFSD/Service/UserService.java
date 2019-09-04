package com.example.web.demoJavaFSD.Service;

public interface UserService {
	 UserDto getUserById(Integer userId);
	 void saveUser(UserDto userDto);
	 List < UserDto > getAllUsers();
	}
