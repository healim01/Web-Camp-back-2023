package com.example.webcampback.service;

import com.example.webcampback.domain.Crowd;
import com.example.webcampback.repository.CrowdRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CrowdService {

    private final CrowdRepository crowdRepository;

    public List<Crowd> getCrowd() {
        return crowdRepository.getCrowd()
;    }

    public Crowd getCrowdOne(int fundingId) {
        return crowdRepository.getCrowdOne(fundingId)
                ;    }
}
