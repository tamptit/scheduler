package com.example.data.repository.target;

import com.example.data.domain.target.AFunction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface AFunctionRepository extends JpaRepository<AFunction, Integer>, JpaSpecificationExecutor<AFunction> {

}
