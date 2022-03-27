package avengers.Jarvis.repository;

import avengers.Jarvis.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepository extends JpaRepository<User,String> {
}
