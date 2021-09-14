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

    @Query(value = "select * from Employee where Job = 'Teacher'",nativeQuery = true)
    List<Employee> findEmployeeByJob();

    @Transactional
    @Modifying
    @Query(value = "delete from Employee where id = :id",nativeQuery = true)
    void deleteEmployeeById(int id);

    @Transactional
    @Modifying
    @Query(value = "update Employee  set Job= ?1 where id = ?2",nativeQuery = true)
    void updateEmployee(String job,int id);

}
