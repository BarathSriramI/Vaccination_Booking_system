package com.example.Vaccination.Booking.System1.Model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class Certificate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    int id;

    String certificateNo;

    String confirmationMessage;

    @OneToOne
    @JoinColumn
    Person person;
}
