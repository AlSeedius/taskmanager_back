package so.ups.taskmanager.dev.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import so.ups.taskmanager.dev.entitites.Company;
@Repository
public interface CompanyRepository extends CrudRepository <Company, Integer> {
}
