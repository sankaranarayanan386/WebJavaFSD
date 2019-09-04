package com.example.web.demoJavaFSD.Service;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceimpl implements UserService {
 @Autowired
 UserRepository userRepository;
 @Override
 public UserDto getUserById(Integer userId) {
  return UserConverter.entityToDto(userRepository.getOne(userId));
 }
 @Override
 public void saveUser(UserDto userDto) {
  userRepository.save(UserConverter.dtoToEntity(userDto));
 }
 @Override
 public List < UserDto > getAllUsers() {
  return userRepository.findAll().stream().map(UserConverter::entityToDto).collect(Collectors.toList());
 }
@Override
public UserDto getUserById(Integer userId) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public com.example.web.demoJavaFSD.Service.List<UserDto> getAllUsers() {
	// TODO Auto-generated method stub
	return null;
}
}
