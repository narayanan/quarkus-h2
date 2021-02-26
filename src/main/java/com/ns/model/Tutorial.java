package com.ns.model;

import java.util.List;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Tutorial extends PanacheEntity {
	public String title;
	public String description;
	public boolean published;

    public static Tutorial findByTitle(String title){
        return find("title", title).firstResult();
    }

    public static List<Tutorial> findPublished(){
        return list("published", true);
    }
}
