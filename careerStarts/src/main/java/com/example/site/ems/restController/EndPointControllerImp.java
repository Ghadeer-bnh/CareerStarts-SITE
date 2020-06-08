package com.example.site.ems.restController;

import com.example.site.ems.domain.Job;

import com.example.site.ems.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/job")
public class EndPointControllerImp implements EndPointController {

    @Autowired
    private JobService service;


    @GetMapping("/{jobId}")
    @Override
    public Job findById(@PathVariable long jobId) {

        return service.findById(jobId);
    }

    @GetMapping
    @Override
    public List<Job> findAll() {

        return service.findAll();
    }

    @PostMapping(produces = "application/json")
    @Override
    public boolean add(@RequestBody @Valid Job job) {

        return service.add(job);
    }

    @DeleteMapping("/{jobId}")
    @Override
    public boolean delete(@PathVariable long jobId) {
        return service.delete(jobId);
    }

    @PutMapping("/{jobId}")
    @Override
    public boolean update(@RequestBody @Valid Job job){//}, @PathVariable long jobId) {
       // se
        return service.update(job);
    }
}
