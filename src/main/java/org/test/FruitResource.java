package org.test;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/fruits")
public class FruitResource {

    @Inject FruitService fruitService;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public List<Fruit> list() {
        return fruitService.list();
    }

    @GET
    @Path("/addFruit")
    @Produces(MediaType.TEXT_PLAIN)
    public List<Fruit> add(@QueryParam("name") String name, @QueryParam("description") String description) {
        Fruit fruit = new Fruit(name, description);

        fruitService.add(fruit);
        return list();
    }
}
