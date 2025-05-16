package com.example.scheduler.service;

import com.example.scheduler.domain.target.ARole;
import com.example.scheduler.domain.target.TargetCitizen;
import com.example.scheduler.repository.target.ARoleRepository;
import com.example.scheduler.repository.target.TargetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TargetWriter {
    @Autowired
    TargetRepository repo;

    @Autowired
    ARoleRepository aRoleRepository;

    public void write(List<TargetCitizen> users) {
        repo.saveAll(users);
    }

    public void writeArole(List<ARole> aRole) {
        aRoleRepository.saveAll(aRole);
    }
}