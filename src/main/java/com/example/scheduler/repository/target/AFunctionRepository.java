package com.example.scheduler.repository.target;

import com.example.scheduler.domain.target.AFunction;
import com.example.scheduler.domain.target.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface AFunctionRepository extends JpaRepository<AFunction, Integer>, JpaSpecificationExecutor<AFunction> {

}
