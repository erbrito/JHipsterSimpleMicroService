package com.ebrito.poc.serv3.service.mapper;

import com.ebrito.poc.serv3.domain.Person;
import com.ebrito.poc.serv3.service.dto.PersonDTO;
import com.ebrito.poc.serv3.domain.*;

import org.mapstruct.*;
import java.util.List;

/**
 * Mapper for the entity Person and its DTO PersonDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface PersonMapper {

    PersonDTO personToPersonDTO(Person person);

    List<PersonDTO> peopleToPersonDTOs(List<Person> people);

    Person personDTOToPerson(PersonDTO personDTO);

    List<Person> personDTOsToPeople(List<PersonDTO> personDTOs);
    /**
     * generating the fromId for all mappers if the databaseType is sql, as the class has relationship to it might need it, instead of
     * creating a new attribute to know if the entity has any relationship from some other entity
     *
     * @param id id of the entity
     * @return the entity instance
     */

    default Person personFromId(Long id) {
        if (id == null) {
            return null;
        }
        Person person = new Person();
        person.setId(id);
        return person;
    }


}
