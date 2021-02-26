package com.ns;

import com.ns.model.Tutorial;

import io.quarkus.hibernate.orm.rest.data.panache.PanacheEntityResource;
import io.quarkus.rest.data.panache.ResourceProperties;

@ResourceProperties(path = "tutorials")
public interface TutorialResource extends PanacheEntityResource<Tutorial, Long> {
}
