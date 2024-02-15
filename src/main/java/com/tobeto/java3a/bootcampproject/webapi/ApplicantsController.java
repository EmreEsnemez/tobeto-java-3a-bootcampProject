package com.tobeto.java3a.bootcampproject.webapi;

import com.tobeto.java3a.bootcampproject.dataaccess.ApplicantRepository;
import com.tobeto.java3a.bootcampproject.entities.Applicant;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/applicants")
public class ApplicantsController {

    private ApplicantRepository applicantRepository;

    public ApplicantsController(ApplicantRepository applicantRepository) {
        this.applicantRepository = applicantRepository;
    }

    @RequestMapping("/")
    public List<Applicant> findAll() {
        return applicantRepository.findAll();
    }

    @RequestMapping("/add")
    public void add() {
        Applicant applicant = new Applicant();
        applicant.setUserName("doejane");
        applicant.setEmail("doejane@gmail.com");
        applicant.setAbout("Software Developer");
        applicantRepository.save(applicant);
    }
}
