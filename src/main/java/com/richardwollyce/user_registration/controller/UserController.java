package com.richardwollyce.user_registration.controller;

import com.richardwollyce.user_registration.business.UserService;
import com.richardwollyce.user_registration.infrastructure.entities.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public ResponseEntity<?> saveUser(@RequestBody User user) {
        try {
            User savedUser = userService.saveUser(user);
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(Map.of(
                            "message", "User successfully registered!",
                            "data", savedUser
                    ));
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(Map.of("message", "User registration failed!"));
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> searchUserById(@PathVariable Integer id) {
        try {
            User user = userService.searchUserById(id);
            return ResponseEntity.ok(Map.of(
                    "message", "User found successfully!",
                    "data", user
                    ));
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(Map.of("message", "Search failed: User not found!"));
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUserById(@PathVariable Integer id) {
        try {
            userService.deleteUserById(id);
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(Map.of("message", "User successfully deleted!"));
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(Map.of("message", "Delete failed: User not found!"));
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateUserById(@PathVariable Integer id,
                                            @RequestBody User user) {
        try {
            User updatedUser = userService.updateUserById(id, user);
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(Map.of(
                            "message", "User successfully updated!",
                            "data", updatedUser
                    ));
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(Map.of("message", "Update failed: User not found!"));
        }
    }
}
