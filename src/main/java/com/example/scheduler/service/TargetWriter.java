package com.example.scheduler.service;

import com.example.scheduler.domain.TargetCitizen;
import com.example.scheduler.repository.national.TargetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TargetWriter {
    @Autowired
    TargetRepository repo;

    public void write(List<TargetCitizen> users) {
        repo.saveAll(users);
    }
}