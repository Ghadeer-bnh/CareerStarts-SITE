package com.example.site.ems.domain;


import org.hibernate.annotations.Generated;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;

@Entity
public class Job {

    @Id
    @GeneratedValue
    private long jobId;

    @Column
    @NotBlank
    @Size(min = 10, max = 200, message
            = "Job description must be between 30 and 200 characters")
   @Pattern(regexp = "^[A-Za-z0-9]+$")
    private String jobDescription;
    @NotBlank
    @Size(min = 5, max = 30, message
            = "Job Name must be between 10 and 30 characters")
   @Pattern(regexp = "^[A-Za-z0-9]+$")
    private String jobName;
   // @NotBlank
    //@Future
    @NotNull
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dueDate;
   @Positive
    private float salary;


    public Job() {
    }

    public Job(String jobDescription, String jobName, Date dueDate, float salary) {
        this.jobDescription = jobDescription;
        this.jobName = jobName;
        this.dueDate = dueDate;

        this.salary = salary;

    }

    public long getJobId() {
        return jobId;
    }

    public void setJobId(long employeeId) {
        this.jobId = employeeId;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String firstName) {
        this.jobDescription = firstName;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String lastName) {
        this.jobName = lastName;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date hireDate) {
        this.dueDate = hireDate;
    }





    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Job {" +
                "jobId=" + jobId +
                ", JobDescription='" + jobDescription + '\'' +
                ", Job Name='" + jobName + '\'' +
                ", Job application due date=" + dueDate +
                ", job salary=" + salary +
                '}';
    }
}
