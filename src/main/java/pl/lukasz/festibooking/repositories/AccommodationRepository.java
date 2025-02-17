package pl.lukasz.festibooking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.lukasz.festibooking.entities.Accommodation;

@Repository
public interface AccommodationRepository extends JpaRepository<Accommodation, Long> {
}
