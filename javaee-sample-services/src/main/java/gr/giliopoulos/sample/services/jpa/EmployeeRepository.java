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
public class EmployeeRepository implements GenericRepository {

    @PersistenceContext(unitName = "employeesPersistenceUnit")
    private EntityManager em;

    @Override
    public Object create(Object entity) {
        return null;
    }

    @Override
    public Object modify(Object entity) {
        return null;
    }

    @Override
    public void delete(Object entity) {

    }

    @Override
    public Object findById(Object id) {
       return em.find(Employee.class, id);
    }

    @Override
    public List findAll() {
        TypedQuery<Employee> findAllUsersQuery = em.createNamedQuery("gr.giliopoulos.sample.domain.Employee.findAllEmployees", Employee.class);
        findAllUsersQuery.setMaxResults(100);
        List<Employee> resultList = ((TypedQuery) findAllUsersQuery).getResultList();
        return resultList;
    }
}
