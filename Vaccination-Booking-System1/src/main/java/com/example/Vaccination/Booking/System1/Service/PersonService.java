package com.example.Vaccination.Booking.System1.Service;

import com.example.Vaccination.Booking.System1.Model.Person;
import com.example.Vaccination.Booking.System1.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    PersonRepository personRepository;
    public Person addperson(Person person) {

        person.setDose1Taken(false);
        person.setDose2Taken(false);
       Person savedperson= personRepository.save(person);
       return savedperson;
    }
}
