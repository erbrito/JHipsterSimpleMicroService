package com.ebrito.poc.serv3.repository;

import com.ebrito.poc.serv3.domain.Person;

import org.springframework.data.jpa.repository.*;

/**
 * Spring Data JPA repository for the Person entity.
 */
@SuppressWarnings("unused")
public interface PersonRepository extends JpaRepository<Person,Long> {

}
