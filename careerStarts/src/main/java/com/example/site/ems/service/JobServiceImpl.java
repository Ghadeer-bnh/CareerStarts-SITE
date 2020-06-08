package com.example.site.ems.service;

import com.example.site.ems.dao.JobDao;
import com.example.site.ems.domain.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private JobDao dao;

    @Override
    public boolean add(Job job) {
        return dao.add(job);
    }

    @Override
    public Job findById(long id) {
        return dao.findById(id);
    }

    @Override
    public List<Job> findAll() {
        return dao.findAll();
    }

    @Override
    public boolean update(Job updatedJob) {
        return dao.update(updatedJob);
    }

    @Override
    public boolean delete(long id) {
        return dao.delete(id);
    }
}
