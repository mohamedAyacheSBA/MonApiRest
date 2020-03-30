package fr.innso.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import fr.innso.entities.Message;

@RepositoryRestResource
public interface MessageRepository extends JpaRepository<Message, Long> {

}
