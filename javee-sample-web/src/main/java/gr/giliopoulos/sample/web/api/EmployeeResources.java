package gr.giliopoulos.sample.web.api;

import gr.giliopoulos.sample.domain.Employee;
import gr.giliopoulos.sample.services.jpa.EmployeeRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Stateless
@Path("employees")
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeResources {

    @Inject
    private EmployeeRepository employeeRepository;


    @GET
    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }
}
