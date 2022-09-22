package micronaut.mongodb.demo.repository;

import io.micronaut.data.mongodb.annotation.MongoRepository;
import io.micronaut.data.repository.CrudRepository;
import micronaut.mongodb.demo.pojo.Employee;

@MongoRepository
public interface EmpoyeeRepository extends CrudRepository<Employee, Integer> {
}
