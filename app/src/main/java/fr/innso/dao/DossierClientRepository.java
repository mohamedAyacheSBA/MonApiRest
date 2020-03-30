package fr.innso.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

import fr.innso.entities.DossierClient;

@RepositoryRestResource
public interface DossierClientRepository extends JpaRepository<DossierClient, Long> {

}
