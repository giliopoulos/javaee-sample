package gr.giliopoulos.sample.services.jpa;

import gr.giliopoulos.sample.domain.Employee;
import gr.giliopoulos.sample.services.GenericRepository;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
@LocalBean
public class EmployeeRepository implements GenericRepository<Employee, Long> {

    @PersistenceContext(unitName = "employeesPersistenceUnit")
    private EntityManager em;

    @Override
    public Employee create(Employee employee) {
        em.persist(employee);
        return employee;
    }

    @Override
    public Employee modify(Employee employee) {
        return em.merge(employee);
    }

    @Override
    public void delete(Employee employee) {
        em.remove(employee);
    }

    @Override
    public Employee findById(Long id) {
       return em.find(Employee.class, id);
    }

    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> findAllUsersQuery = em.createNamedQuery("gr.giliopoulos.sample.domain.Employee.findAllEmployees", Employee.class);
        findAllUsersQuery.setMaxResults(100);
        List<Employee> resultList = ((TypedQuery) findAllUsersQuery).getResultList();
        return resultList;
    }
}
