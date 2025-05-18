package com.example.data.service;

import com.example.data.domain.target.ARole;
import com.example.data.domain.target.TargetCitizen;
import com.example.data.repository.target.ARoleRepository;
import com.example.data.repository.target.TargetRepository;
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