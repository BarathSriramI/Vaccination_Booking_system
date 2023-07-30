package com.example.Vaccination.Booking.System1.Model;


import com.example.Vaccination.Booking.System1.Enum.CenterType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter

public class VaccinationCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    int id;

    CenterType centertype;

    String centerName;
    String address;
}
