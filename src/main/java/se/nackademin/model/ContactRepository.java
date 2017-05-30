package se.nackademin.model;

import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Long> {

    Iterable<Contact> findContactByEmailContains(String email);

    Iterable<Contact> findContactByFirstNameContains(String firstName);
}
