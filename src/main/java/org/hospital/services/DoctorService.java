package org.hospital.services;


import org.hospital.dao.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.hospital.entities.Doctor;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    public Doctor getDoctorById(Long id) {
        return doctorRepository.findById(id).orElse(null);
    }

    public Doctor saveOrUpdateDoctor(Doctor doctor) {
        return doctorRepository.save(doctor);
    }

    public void deleteDoctor(Long id) {
        doctorRepository.deleteById(id);
    }
}