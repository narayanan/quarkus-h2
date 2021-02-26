package com.ns.repository;

import com.ns.model.Tutorial;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import java.util.stream.Stream;

import javax.enterprise.context.ApplicationScoped;

import static io.quarkus.panache.common.Parameters.with;

@ApplicationScoped
public class TutorialRepository implements PanacheRepository<Tutorial> {
    public Stream<Tutorial> findPublished() {
        return find("published = :published", with("published", true)).stream();
    }    

    public Stream<Tutorial> findByTitle(String title) {
        return find("title", title).stream();
    }    
}
