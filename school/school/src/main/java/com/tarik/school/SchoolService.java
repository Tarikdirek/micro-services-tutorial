package com.tarik.school;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {
    private final SchoolRepository studentRepository;

    public void saveSchool(School school) {
        studentRepository.save(school);
    }

    public List<School> findAllSchools() {
        return studentRepository.findAll();
    }
}
