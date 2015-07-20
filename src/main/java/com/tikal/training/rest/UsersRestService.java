package com.tikal.training.rest;

import com.tikal.training.model.ExampleEntity;
import com.tikal.training.model.Users;
import com.tikal.training.services.ExampleBusinessService;
import com.tikal.training.services.UsersBusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.*;

@Service
@Path("/users")
@Produces("application/json")
public class UsersRestService {

    @Autowired
    private UsersBusinessService usersBusinessService;


    /* Ecample:
    {"name":"shmulik6", "phones":[
             {"type":"MOBILE", "phoneNumber":"1234"},
             {"type":"HOME"  , "phoneNumber":"5678"}
    ]}
     */
    @POST
    public boolean addUser(Users user) throws Exception {

        usersBusinessService.saveUser(user);

        return true;
    }

    @GET
    @Path("/{id}")
    public Users GetById(@PathParam("id") Integer id) {

        return usersBusinessService.getById(id);
    }


    @PUT
    public Users updateEntity(Users entity) {

        usersBusinessService.update(entity);

        return usersBusinessService.getById(entity.getUser_id());
    }
}
