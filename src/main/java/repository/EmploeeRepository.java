package repository;

import entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface EmploeeRepository extends JpaRepository<Employee, Integer> {

    @Query(value = "select e from Employee e where e.Job = 'Doctor'",nativeQuery = true)
    List<Employee> findEmployeeByJobs();

    @Transactional
    @Modifying
    @Query(value = "delete from Employee where firstName = 'John'",nativeQuery = true)
    void deleteEmployeeByFirstName();

}
