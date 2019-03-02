package repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import model.Company;

/** This interface is Repository for DB operations.*/
@Repository
public interface Dbops extends CrudRepository<Company, Integer> {

}