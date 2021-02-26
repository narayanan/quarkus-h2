package com.ns;

import java.util.Set;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Produces;

import com.ns.model.Tutorial;
import com.ns.service.TutorialService;

import io.quarkus.rest.data.panache.ResourceProperties;

@Path("/tutorials")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ExtendedTutorialsResource {
    @Inject
    TutorialService tutorialService;

    @GET
    @Path("/published")
    public Set<Tutorial> findPublished() {
        return tutorialService.findPublished();
    }
}
