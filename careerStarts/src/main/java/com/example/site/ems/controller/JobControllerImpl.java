package com.example.site.ems.controller;

import com.example.site.ems.domain.Job;
import com.example.site.ems.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/job")
public class JobControllerImpl implements JobController {

    @Autowired
    private JobService service;

    @GetMapping("/add")
    @Override
    public String add(Model model) {
        model.addAttribute(new Job());

        return "add";
    }

    @PostMapping("/create")
    @Override
    public String create(Job job) {
        service.add(job);

        return "redirect:/job/list";
    }

    @GetMapping("/{id}")
    @Override
    public String findById(@PathVariable long id, Model model) {

        Job job = service.findById(id);

        model.addAttribute("job", job);

        return "job";

    }

    @GetMapping("/list")
    @Override
    public String findAll(Model model) {
        // Need model object
        List<Job> allJobs = service.findAll();

        model.addAttribute("allJobs", allJobs);

        return "list";
    }


    @Override
    @GetMapping("/update/{id}")
    public String update(@PathVariable long id, Model model) {

        Job job = service.findById(id);

        if (job != null) {
            model.addAttribute("job", job);

            return "update";
        }

        return "redirect:/";
    }


    @Override
    @PostMapping("/save")
    public String save(Job job) {

        service.update(job);

        return "redirect:/job/list";
    }

    @Override
    @GetMapping("delete/{id}")
    public String delete(@PathVariable long id) {
        boolean result = service.delete(id);

        System.out.println("delete result: " + result);

        return "redirect:/job/list";
    }
}
