package com.example.scheduler.repository.target;

import com.example.scheduler.domain.target.AFunction;
import com.example.scheduler.domain.target.ARole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ARoleRepository extends JpaRepository<ARole, Integer>, JpaSpecificationExecutor<ARole> {

}
