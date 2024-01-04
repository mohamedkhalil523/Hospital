package net.khalil.hotelservice.controller;

import lombok.AllArgsConstructor;
import net.khalil.hotelservice.entities.Reservation;
import net.khalil.hotelservice.repository.ReservationRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ReservationController {
    private ReservationRepository reservationRepository;
    @GetMapping("/reservation")
    public List<Reservation> reservationList(){
        return reservationRepository.findAll();
    }
}
