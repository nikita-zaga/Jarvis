package avengers.Jarvis.repository;

import avengers.Jarvis.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
