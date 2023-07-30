package com.example.Vaccination.Booking.System1.Controller;

import com.example.Vaccination.Booking.System1.Enum.DoseType;
import com.example.Vaccination.Booking.System1.Model.Dose;
import com.example.Vaccination.Booking.System1.Service.DoseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dose")
public class DoseController {

    @Autowired
    DoseService doseService;
    @PostMapping("/get_dose1")
    public ResponseEntity getDose1(@RequestParam("id") int personId,
                                   @RequestParam("doseType")DoseType doseType)
    {
        try {
            Dose doseTaken = doseService.getDose1(personId,doseType);
            return new ResponseEntity<>(doseTaken,HttpStatus.CREATED);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
