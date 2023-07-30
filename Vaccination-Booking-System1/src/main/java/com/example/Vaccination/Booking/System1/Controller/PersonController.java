package com.example.Vaccination.Booking.System1.Controller;

import com.example.Vaccination.Booking.System1.Model.Person;
import com.example.Vaccination.Booking.System1.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonService personService;
    @PostMapping("/addstudent")
    public ResponseEntity addperson(@RequestBody Person person)
    {
        try {
            Person personresponse = personService.addperson(person);
            return new ResponseEntity<>(personresponse, HttpStatus.CREATED);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>("EmailId already exits",HttpStatus.BAD_REQUEST);
        }
    }
}
