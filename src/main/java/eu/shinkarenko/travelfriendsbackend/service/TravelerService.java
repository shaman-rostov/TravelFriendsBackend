package eu.shinkarenko.travelfriendsbackend.service;

import eu.shinkarenko.travelfriendsbackend.entity.Traveler;

import java.util.List;

public interface TravelerService {

    Traveler addTraveler (Traveler traveler);
    void delete (long id);
    Traveler getByName(String name);
    Traveler editTraveler (Traveler traveler);
    List<Traveler> getAll();
}
