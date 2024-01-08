package med.voll.api.controller;

import jakarta.validation.Valid;
import med.voll.api.patient.CreatePatientData;
import med.voll.api.patient.Patient;
import med.voll.api.patient.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    PatientRepository patientRepository;

    @PostMapping
    public Patient create(@RequestBody @Valid CreatePatientData body) {
        return this.patientRepository.save(new Patient(body));
    }
}
