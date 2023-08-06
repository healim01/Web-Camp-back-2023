package com.example.webcampback.controller;

import com.example.webcampback.domain.Crowd;
import com.example.webcampback.service.CrowdService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CrowdController {

    private final CrowdService crowdService;

    @GetMapping("/")
    public ResponseEntity<List<Crowd>> getCrowd(){
        return ResponseEntity.ok(crowdService.getCrowd());
    }
}
