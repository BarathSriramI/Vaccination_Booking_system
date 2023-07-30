package com.example.Vaccination.Booking.System1.Repository;

import com.example.Vaccination.Booking.System1.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository  extends JpaRepository<Person,Integer> {

}
