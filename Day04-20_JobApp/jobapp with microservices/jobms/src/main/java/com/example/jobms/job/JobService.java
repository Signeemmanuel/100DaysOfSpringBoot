package com.example.jobms.job;

import com.example.jobms.job.dto.JobDTO;

import java.util.List;

public interface JobService {
    List<JobDTO> findAll();

    void createJob(Job job);

    JobDTO getJobById(Long id);

    Boolean deleteJobById(Long id);

    Boolean updateJob(Long id, Job updatedJob);

}
