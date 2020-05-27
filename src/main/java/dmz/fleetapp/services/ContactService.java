package dmz.fleetapp.services;

import dmz.fleetapp.models.Contact;
import dmz.fleetapp.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    //Get All Contacts
    public List<Contact> getContacts(){
        return contactRepository.findAll();
    }

    public List<Contact> findAll(){
        return contactRepository.findAll();
    }

    //Get Contact By Id
    public Optional<Contact> findById(int id) {
        return contactRepository.findById(id);
    }

    //Delete Contact
    public void delete(int id) {
        contactRepository.deleteById(id);
    }

    //Update Contact
    public void save( Contact contact) {
        contactRepository.save(contact);
    }

}
