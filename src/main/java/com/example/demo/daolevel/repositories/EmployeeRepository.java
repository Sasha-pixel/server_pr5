package com.example.demo.daolevel.repositories;

import com.example.demo.businesslevel.domainlayer.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * jpa репозиторий для работников компании
 *
 * @author kanenkovaa
 * @version 0.1
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    /**
     * Метод поиска сотрудников по подстроке их имени или фамилии
     * @param employeeName подстрока имени и фамилии
     * @return список сотрудников
     */
    List<Employee> findByNameContainingIgnoreCase(String employeeName);

    /**
     * Метод поиска сотрудника по имени и фамилии
     * @param name имя и фамилия
     * @return объект сотрудника
     */
    Employee findByName(String name);
}
