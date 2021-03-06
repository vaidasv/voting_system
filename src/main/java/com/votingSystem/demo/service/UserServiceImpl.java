package com.votingSystem.demo.service;

import com.votingSystem.demo.model.Role;
import com.votingSystem.demo.model.User;
import com.votingSystem.demo.repository.UserRepository;
import com.votingSystem.demo.web.dto.UserRegistrationDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }

    @Override
    public User save(UserRegistrationDto registrationDto) {
        User user = new User(registrationDto.getFirstName(),
                            registrationDto.getLastName(),
                            registrationDto.getEmail(),
                            registrationDto.getPassword(),
                            Arrays.asList(new Role("ROLE_USER")));

        return userRepository.save(user);

    }
}
