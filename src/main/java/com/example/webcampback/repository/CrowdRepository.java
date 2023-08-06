package com.example.webcampback.repository;

import com.example.webcampback.domain.Crowd;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class CrowdRepository {

    private final EntityManager em;

    public List<Crowd> getCrowd() {
        return em.createQuery("select c from Crowd c", Crowd.class)
                .getResultList();
    }
}
