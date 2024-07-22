package pl.lukasz.festibooking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.lukasz.festibooking.entities.Festival;

@Repository
public interface FestivalRepository extends JpaRepository<Festival, Long> {
}
