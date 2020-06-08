package com.example.site.ems.dao;

import com.example.site.ems.domain.Job;

import java.util.List;

public interface JobDao {

    boolean add(Job job);

    Job findById(long id);

    List<Job> findAll();

   boolean update(Job updatedJob);

    boolean delete(long id);

}
