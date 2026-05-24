package com.example.demo.dto;

import lombok.Data;

@Data
public class UpdateUserRequest {
    private String username;
    private String email;
    private String phoneNumber;
    private Integer age;
}
