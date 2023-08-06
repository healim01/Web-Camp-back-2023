package com.example.webcampback.repository;

import com.example.webcampback.domain.Crowd;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class CrowdRepository {

    private final EntityManager em;

    public List<Crowd> getCrowd() {
        return em.createQuery("select c from Crowd c", Crowd.class)
                .getResultList();
    }

    public Crowd getCrowdOne(int fundingId) {
        return em.createQuery("select c from Crowd c where id = :id", Crowd.class)
                .setParameter("id", fundingId)
                .getResultList().get(0);
    }
}
