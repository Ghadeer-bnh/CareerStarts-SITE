package com.example.site.ems.service;

import com.example.site.ems.domain.Job;

import java.util.List;

public interface JobService {

    boolean add(Job job);

    Job findById(long id);

    List<Job> findAll();

  boolean update(Job updatedJob);

    boolean delete(long id);

}
