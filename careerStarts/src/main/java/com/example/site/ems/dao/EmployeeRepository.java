package com.example.site.ems.dao;

import com.example.site.ems.domain.Job;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Job, Long> {
}
