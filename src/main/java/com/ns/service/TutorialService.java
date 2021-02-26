package com.ns.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.ns.model.Tutorial;
import com.ns.repository.TutorialRepository;

import java.util.Set;

import static java.util.stream.Collectors.toSet;

@Transactional
@ApplicationScoped
public class TutorialService {
    
    @Inject
    TutorialRepository tutorialRepository;

    public Set<Tutorial> findPublished() {
        return tutorialRepository.findPublished().collect(toSet());
    }

    public Set<Tutorial> findByTitle(String title) {
        return tutorialRepository.findByTitle(title).collect(toSet());
    }
}
