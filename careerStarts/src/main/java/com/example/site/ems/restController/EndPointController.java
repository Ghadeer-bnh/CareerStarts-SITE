package com.example.site.ems.restController;

import com.example.site.ems.domain.Job;

import java.util.List;

public interface EndPointController {

    Job findById(long id);

    List<Job> findAll();

    boolean update(Job job);

    boolean delete(long id);

    boolean add(Job job);

}
