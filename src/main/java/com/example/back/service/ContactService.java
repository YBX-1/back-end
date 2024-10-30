package com.example.back.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.back.entity.Contacts;
import com.example.back.repository.ContactRepository;

@Service
public class ContactService {

    // @Resource
    // private contactMapper contactMapper;
    @Autowired
    private ContactRepository ContactRepository;

    public List<Contacts> getAllContacts() {
        return ContactRepository.findAll();
    }

    // String contactName, String phoneNumber
    public Contacts addContact(Contacts contacts) {
        return ContactRepository.save(contacts);
    }

    public void deleteContact(Long id) {
        ContactRepository.deleteById(id);
    }

    public Contacts updateContacts(Long id, Contacts contactsDetails) {
        Contacts contacts = ContactRepository.findById(id).orElseThrow(() -> new RuntimeException("Contact not found"));
        contacts.setName(contactsDetails.getName());
        contacts.setNumber(contactsDetails.getNumber());
        return ContactRepository.save(contacts);
    }

}
