package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import model.Company;
import repository.Dbops;

import java.util.List;

/** Controller Class.*/
@EnableJpaRepositories("repository")
@EntityScan("model")
@RestController
public class Controller {

/** Autowiring Repository.*/
@Autowired
private Dbops db;

/** Function to list all companies.*/
/** @return (List<Company>) db.findAll() **this returns Company Details**.*/
@RequestMapping(value = "/company/getAll", method = RequestMethod.GET)
public final List<Company> getAll() {
return (List<Company>) db.findAll();
}
}