package se.nackademin.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ContactController {
    @Autowired
    private ContactRepository contactRepository;

    @GetMapping("/contacts")
    public Iterable<Contact> findAllContacts() {
        return contactRepository.findAll();
    }

    @PostMapping("/contact/add")
    public String addContact(@RequestBody Contact contact) {
        contactRepository.save(contact);
        return "Contact Added";
    }

    @DeleteMapping(value = "/contact/delete")
    public String deleteContact(@RequestParam("id") Long id) {
        contactRepository.delete(id);
        return "Contact Deleted";
    }

    @GetMapping(value = "/contact/find", params = {"id"})
    public Contact findContact1(@RequestParam Long id) {
        return contactRepository.findOne(id);
    }

    @GetMapping(value = "/contact/find", params = {"email"})
    public Iterable<Contact> findContactByEmail1(@RequestParam String email) {
        return contactRepository.findContactByEmailContains(email);
    }

    @GetMapping(value = "/contact/find", params = {"firstName"})
    public Iterable<Contact> findContactByFirstName1(@RequestParam String firstName) {
        return contactRepository.findContactByFirstNameContains(firstName);
    }

}