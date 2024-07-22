package pl.lukasz.festibooking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.lukasz.festibooking.entities.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
