package com.example.Vaccination.Booking.System1.Repository;

import com.example.Vaccination.Booking.System1.Model.Dose;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoseRepository  extends JpaRepository<Dose,Integer> {
}
