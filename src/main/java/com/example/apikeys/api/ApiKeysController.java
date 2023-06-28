package com.example.apikeys.api;

import com.example.apikeys.dtos.UserDTO;
import com.example.apikeys.entities.Apikeys;
import com.example.apikeys.services.ApiKeyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ApiKeysController  {
    private final ApiKeyService apiKeyService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE , path = "/v1/keys")
    public ResponseEntity<List<Apikeys>> apiKey(@RequestParam(required = false) String username){
        if (Objects.isNull(username)){

            username = SecurityContextHolder.getContext().getAuthentication().getName();
            System.out.println(username);
        }
        List<Apikeys> apiKeyByUser = apiKeyService.getApiKeyByUser(username);
        return ResponseEntity.ok(apiKeyByUser);
    }
}
