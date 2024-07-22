package pl.lukasz.festibooking.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.lukasz.festibooking.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
