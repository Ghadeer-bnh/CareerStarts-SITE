package com.example.site.ems.dao;

import com.example.site.ems.domain.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Repository
public class JobDaoImpl implements JobDao {


    @Autowired
    private EmployeeRepository repository;


    @Override
    public boolean add(Job job) {

        System.out.println("*** add() ***");

        if (!repository.existsById(job.getJobId())) {
            repository.save(job);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Job findById(long id) {
        System.out.println("*** findById(" + id + ") ***");

        Optional<Job> result = repository.findById(id);

        if (result.isPresent()) {
            return result.get();
        } else {
            return null;
        }
    }

    @Override
    public List<Job> findAll() {
        System.out.println("*** findAll() ***");

        Iterable<Job> result = repository.findAll();
        List<Job> jobs = new ArrayList<>();
        for (Job job : result) {
            jobs.add(job);
        }

        return jobs;
    }

    @Override
    public boolean update(Job updatedJob) {

        System.out.println("*** update(" + updatedJob.getJobId() + ") ***");

        if (repository.existsById(updatedJob.getJobId())) {
            repository.save(updatedJob);
            return true;
        } else {
            return false;
        }

    }

    @Override
    public boolean delete(long id) {

        System.out.println("*** update(" + id + ") ***");

        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        } else {
            return false;
        }

    }
}
