package com.votingSystem.demo.service;

import com.votingSystem.demo.model.User;
import com.votingSystem.demo.web.dto.UserRegistrationDto;

public interface UserService {
    User save(UserRegistrationDto registrationDto);
}
