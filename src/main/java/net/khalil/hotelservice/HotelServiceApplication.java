package net.khalil.hotelservice;

import net.khalil.hotelservice.entities.Reservation;
import net.khalil.hotelservice.entities.ReservationStatus;
import net.khalil.hotelservice.repository.ReservationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class HotelServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotelServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(ReservationRepository reservationRepository){
        return args -> {
            reservationRepository.save(Reservation.builder().title("RES 1").price(2000).status(ReservationStatus.CREATED).build());
            reservationRepository.save(Reservation.builder().title("RES 2").price(1400).status(ReservationStatus.CANCELED).build());
            reservationRepository.save(Reservation.builder().title("RES 3").price(1800).status(ReservationStatus.PENDING).build());
        };
    }

}
