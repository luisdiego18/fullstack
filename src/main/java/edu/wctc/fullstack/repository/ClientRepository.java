package edu.wctc.fullstack.repository;

import edu.wctc.fullstack.model.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Integer> {
}
