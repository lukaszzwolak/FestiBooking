package pl.lukasz.festibooking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.lukasz.festibooking.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
