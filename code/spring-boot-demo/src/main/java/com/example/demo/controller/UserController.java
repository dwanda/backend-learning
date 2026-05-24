package com.example.demo.controller;

import com.example.demo.common.R;
import com.example.demo.dto.*;
import com.example.demo.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public R<UserResponse> create(@Valid @RequestBody CreateUserRequest request) {
        UserResponse response = userService.createUser(request);
        return R.ok(response);
    }

    @GetMapping("/{id}")
    public R<UserResponse> getById(@PathVariable Long id) {
        UserResponse response = userService.getUserById(id);
        return R.ok(response);
    }

    @GetMapping
    public R<Page<UserResponse>> list(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        Page<UserResponse> responses = userService.getAllUsers(page, size);
        return R.ok(responses);
    }

    @PutMapping("/{id}")
    public R<UserResponse> update(
            @PathVariable Long id,
            @RequestBody UpdateUserRequest request) {
        UserResponse response = userService.updateUser(id, request);
        return R.ok(response);
    }

    @DeleteMapping("/{id}")
    public R<Void> delete(@PathVariable Long id) {
        userService.deleteUser(id);
        return R.ok();
    }
}
