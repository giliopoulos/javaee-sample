package gr.giliopoulos.sample.services.jpa;

import gr.giliopoulos.sample.domain.Employee;
import gr.giliopoulos.sample.services.GenericRepository;

import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class EmployeeRepository implements GenericRepository {


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
        return null;
    }

    @Override
    public List findAll() {
       // TypedQuery<Employee> findAllUsersQuery = em.createNamedQuery("gr.giliopoulos.sample.domain.Employee.findAllEmployees", Employee.class);
       // List<Employee> resultList = ((TypedQuery) findAllUsersQuery).getResultList();
        List<Employee> resultList = new ArrayList<>();
        return resultList;
    }
}
