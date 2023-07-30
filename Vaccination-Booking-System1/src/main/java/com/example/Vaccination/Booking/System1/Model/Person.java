package com.example.Vaccination.Booking.System1.Model;

import com.example.Vaccination.Booking.System1.Enum.Gender;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.List;


@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String name;
    int age;
    @Column (unique=true,nullable = false) // email to be unique and compulsory present
    String emailId;
    @Enumerated(EnumType.STRING)
    Gender gender;

    boolean isDose1Taken;
    boolean isDose2Taken;

//    @OneToMany(mappedBy = "person",cascade = CascadeType.ALL)
//    // one person can have multiple doses so a list of doses
//    List<Dose> doseTaken = new ArrayList<>();
//
//    @OneToOne(mappedBy = "person",cascade = CascadeType.ALL)
//    Certificate certificate;
}
