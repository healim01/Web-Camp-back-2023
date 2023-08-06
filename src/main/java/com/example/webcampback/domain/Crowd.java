package com.example.webcampback.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Crowd {
    @Id
    private Long id;
    private String name;

}
