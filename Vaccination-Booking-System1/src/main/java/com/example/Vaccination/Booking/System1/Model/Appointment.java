package com.example.Vaccination.Booking.System1.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class Appointment {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    int id;

    String appointmentId;
    //UUId

    Date appointmentDate;

    int doseNumber;

}
