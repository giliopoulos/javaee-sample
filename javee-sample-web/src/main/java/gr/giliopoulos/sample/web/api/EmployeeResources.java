package gr.giliopoulos.sample.web.api;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Stateless
@Path("employees")
@Produces(MediaType.APPLICATION_JSON)
public class EmployeeResources {

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response findAll(){
        return Response.ok().entity(new String("hello")).build();
    }
}
