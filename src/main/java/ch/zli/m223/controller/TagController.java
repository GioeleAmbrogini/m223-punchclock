package ch.zli.m223.controller;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.openapi.annotations.Operation;

import ch.zli.m223.model.Tag;
import ch.zli.m223.service.TagService;

@Path("/tag")
@org.eclipse.microprofile.openapi.annotations.tags.Tag(name = "Tags", description = "Handling of tags")
public class TagController {

    @Inject
    TagService tagService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Index all Tags.", description = "Returns a list of all Tags.")
    public List<Tag> index() {
        return tagService.findAll();
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Operation(summary = "Creates a new", description = "Creates a new and returns the newly added")
    public Tag create(Tag tag) { 
       return tagService.createTag(tag);
    }

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/delete/{id}")
    @Operation(summary = "Deletes", description = "Deletes by its id")
    public void delete(@PathParam("id") Long id) {
        tagService.deleteTag(id);
    }

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    @Operation(summary = "Updates", description = "Updates by its id")
    public Tag update(@PathParam("id") Long id, Tag tag) {
        return tagService.updateTag(id, tag);
    }
}
