package com.example.apikeys.dtos;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserDTO {
    private String username;
    private String email;
}
