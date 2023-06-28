package com.example.apikeys.services.impl;

import com.example.apikeys.dtos.UserDTO;
import com.example.apikeys.entities.Apikeys;
import com.example.apikeys.repository.ApiKeysRepository;
import com.example.apikeys.services.ApiKeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApiKeyServiceImpl implements ApiKeyService {

    @Autowired
    private ApiKeysRepository apiKeysRepository;


    @Override
    public List<Apikeys> getApiKeyByUser(String username) {
        return apiKeysRepository.findByUsername(username);
    }
}
