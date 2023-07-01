package net.javaguides.springboot.usecase;

import org.springframework.security.core.userdetails.UserDetailsService;

import net.javaguides.springboot.entity.User;
import net.javaguides.springboot.controller.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {

	User save(UserRegistrationDto registrationDto);
}
