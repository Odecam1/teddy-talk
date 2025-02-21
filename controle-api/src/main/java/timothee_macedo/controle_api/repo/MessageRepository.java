package timothee_macedo.controle_api.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import timothee_macedo.controle_api.model.Message;

public interface MessageRepository extends JpaRepository<Message, Integer> {

}
