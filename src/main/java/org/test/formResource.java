package org.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.netty.handler.codec.http.cookie.CookieHeaderNames.PATH;

@Path("/form")
public class formResource {

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String getForm() throws IOException {
        String fullPath = "src/main/java/org/test/form.html";

        return Files.readString(Paths.get(fullPath));
    }
}
