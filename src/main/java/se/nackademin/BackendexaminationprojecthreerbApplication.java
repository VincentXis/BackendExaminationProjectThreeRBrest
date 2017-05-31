package se.nackademin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.CrudRepository;
import se.nackademin.model.Contact;
import se.nackademin.model.ContactRepository;

@SpringBootApplication
public class BackendexaminationprojecthreerbApplication implements CommandLineRunner {
    @Autowired
    private ContactRepository contactRepository;

    public static void main(String[] args) {
        SpringApplication.run(BackendexaminationprojecthreerbApplication.class, args);
    }

    // Mock setup function for instant db population
    @Override
    public void run(String... args) throws Exception {
        Contact contact1 = new Contact()
                .firstName("wawa")
                .lastName("gaga")
                .email("wawa.gaga@mail.com")
                .phoneNumber("5")
                .address("home")
                .city("speezTown");

        Contact contact2 = new Contact()
                .firstName("wawa")
                .lastName("gaga")
                .email("@mail.com")
                .phoneNumber("5")
                .address("home")
                .city("speezTown");

        Contact contact3 = new Contact()
                .firstName("John")
                .lastName("Doe")
                .email("john.doe@mail.com")
                .phoneNumber("5")
                .address("main street")
                .city("cool town");

        Contact contact4 = new Contact()
                .firstName("Jane")
                .lastName("Doe")
                .email("jane.doe@mail.com")
                .phoneNumber("6")
                .address("sub main street")
                .city("cool town");
        contactRepository.save(contact1);
        contactRepository.save(contact2);
        contactRepository.save(contact3);
        contactRepository.save(contact4);

    }
}
