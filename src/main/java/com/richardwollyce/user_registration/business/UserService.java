package com.richardwollyce.user_registration.business;

import com.richardwollyce.user_registration.infrastructure.entities.User;
import com.richardwollyce.user_registration.infrastructure.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository repository;
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User saveUser(User user){
        return repository.saveAndFlush(user);
    }

    public User searchUserByEmail(String email){
        return repository.findByEmail(email).orElseThrow(
                () -> new RuntimeException("Email not found!")
        );
    }
    public User searchUserById(Integer id){
        return repository.findById(id).orElseThrow(
                () -> new RuntimeException("User not found!")
        );
    }

    public void deleteUserById(Integer id){
        User user = repository.findById(id).orElseThrow(
                () -> new RuntimeException("User not found!")
        );
        repository.delete(user);
    }

    public User updateUserById(Integer id, User user){
        User userEntity = repository.findById(id).orElseThrow(
                () -> new RuntimeException("User not found!")
        );
        if (user.getEmail() != null) {
            userEntity.setEmail(user.getEmail());
        }
        if (user.getName() != null) {
            userEntity.setName(user.getName());
        }
        return repository.saveAndFlush(userEntity);
    }
}
