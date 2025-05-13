package com.mashisdev.ecommerce.service.user;

import com.mashisdev.ecommerce.dto.UserDto;
import com.mashisdev.ecommerce.model.User;
import com.mashisdev.ecommerce.request.CreateUserRequest;
import com.mashisdev.ecommerce.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);
}
