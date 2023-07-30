package com.example.Vaccination.Booking.System1.Service;

import com.example.Vaccination.Booking.System1.Enum.DoseType;
import com.example.Vaccination.Booking.System1.Exception.DoseAlreadytakenException;
import com.example.Vaccination.Booking.System1.Exception.PersonNotFoundException;
import com.example.Vaccination.Booking.System1.Model.Dose;
import com.example.Vaccination.Booking.System1.Model.Person;
import com.example.Vaccination.Booking.System1.Repository.DoseRepository;
import com.example.Vaccination.Booking.System1.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class DoseService {

    @Autowired
    DoseRepository doseRepository;

    @Autowired
    PersonRepository personRepository;

    public Dose getDose1(int personId, DoseType doseType) {
        // need to check whether the personId is present in the person database
        Optional<Person> optionalPerson= personRepository.findById(personId);
        // if not present through exception
        if(!optionalPerson.isPresent()) {
            throw new PersonNotFoundException("Invalid PersonId");
        }

        Person person= optionalPerson.get();

        if(person.isDose1Taken())
        {
            throw  new DoseAlreadytakenException("Dose 1 already Taken");
        }

        Dose dose= new Dose();
        dose.setDoseId(String.valueOf(UUID.randomUUID()));
        dose.setDoseType(doseType);
        dose.setPerson(person);

        person.setDose1Taken(true);
        personRepository.save(person);

        doseRepository.save(dose);

        return doseRepository.save(dose);
    }
}
