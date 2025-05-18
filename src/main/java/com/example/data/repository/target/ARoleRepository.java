package com.example.data.repository.target;

import com.example.data.domain.target.ARole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ARoleRepository extends JpaRepository<ARole, Integer>, JpaSpecificationExecutor<ARole> {

}
