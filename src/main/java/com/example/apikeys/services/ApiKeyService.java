package com.example.apikeys.services;

import com.example.apikeys.dtos.UserDTO;
import com.example.apikeys.entities.Apikeys;

import java.util.List;

public interface ApiKeyService {
    List<Apikeys> getApiKeyByUser(String username);
}
