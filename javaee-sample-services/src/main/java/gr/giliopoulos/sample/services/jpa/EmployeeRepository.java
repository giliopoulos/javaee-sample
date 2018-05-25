package gr.giliopoulos.sample.services.jpa;

import gr.giliopoulos.sample.domain.Employee;

import javax.enterprise.inject.Model;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Model
public class EmployeeRepository {

    @PersistenceContext(unitName = "employeesPersistenceUnit")
    private EntityManager em;

    public Employee create(Employee employee) {
        em.persist(employee);
        return employee;
    }

    public Employee modify(Employee employee) {
        return em.merge(employee);
    }

    public void delete(Employee employee) {
        em.remove(employee);
    }

    public Employee findById(Long id) {
       return em.find(Employee.class, id);
    }

    public List<Employee> findAll() {
        TypedQuery<Employee> findAllUsersQuery = em.createNamedQuery("gr.giliopoulos.sample.domain.Employee.findAllEmployees", Employee.class);
        findAllUsersQuery.setMaxResults(100);
        List<Employee> resultList = ((TypedQuery) findAllUsersQuery).getResultList();
        return resultList;
    }
}
