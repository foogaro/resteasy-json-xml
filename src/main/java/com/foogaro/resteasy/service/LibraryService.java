package com.foogaro.resteasy.service;

import com.foogaro.resteasy.model.Result;
import com.foogaro.resteasy.model.dto.LibraryRequest;
import org.jboss.resteasy.annotations.Form;
import org.jboss.resteasy.annotations.providers.jaxb.json.Mapped;
import org.jboss.resteasy.annotations.providers.jaxb.json.XmlNsMap;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author l.fugaro@gmail.com
 */

@Path("library")
public interface LibraryService {

    /*
        When serializing the response in JSON format, to avoid this error:

            09:14:48,143 ERROR [org.jboss.resteasy.core.SynchronousDispatcher.handleFailure] Failed executing POST /library/authors.json
            org.jboss.resteasy.spi.WriterException: java.lang.IllegalStateException: Invalid JSON namespace: http://www.w3.org/2001/XMLSchema-instance

        Annotate the method specifying the namespace as follow:

            @Mapped(namespaceMap = {
                    @XmlNsMap(namespace = "http://www.w3.org/2001/XMLSchema-instance",jsonName = "")
            })

    */

    @GET
    @Path("books")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Mapped(namespaceMap = {@XmlNsMap(namespace = "http://www.w3.org/2001/XMLSchema-instance",jsonName = "")})
    public Result getAllBooks();

    @POST
    @Path("books")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Mapped(namespaceMap = {@XmlNsMap(namespace = "http://www.w3.org/2001/XMLSchema-instance",jsonName = "")})
    public Result findByBook(@Form LibraryRequest libraryRequest);

    @POST
    @Path("authors")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Mapped(namespaceMap = {@XmlNsMap(namespace = "http://www.w3.org/2001/XMLSchema-instance",jsonName = "")})
    public Result findByAuthor(@Form LibraryRequest libraryRequest);

}
