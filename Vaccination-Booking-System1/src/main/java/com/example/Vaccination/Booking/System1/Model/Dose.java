package com.example.Vaccination.Booking.System1.Model;

import com.example.Vaccination.Booking.System1.Enum.DoseType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class Dose {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String doseId;
    // created using UUID

    @Enumerated(value = EnumType.STRING)
    DoseType doseType;
    //by user

    @CreationTimestamp
    Date vaccinationDate;
    // from clock


    @ManyToOne
    @JoinColumn
    Person person;
    // taking the person Id
}
