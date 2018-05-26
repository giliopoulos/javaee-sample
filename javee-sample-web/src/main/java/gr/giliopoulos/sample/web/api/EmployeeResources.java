package gr.giliopoulos.sample.web.api;

import gr.giliopoulos.sample.domain.Employee;
import gr.giliopoulos.sample.services.jpa.EmployeeRepository;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("employees")
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeResources {

    @Inject
    private EmployeeRepository repository;

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Employee> findAll(){
        return repository.findAll();
    }

    @GET
    @Path("{id}")
    public Employee getById(@PathParam("id") Long id){
        System.out.println("called");
        return repository.findById(id);
    }
}
