package eu.shinkarenko.travelfriendsbackend.service.impl;

import eu.shinkarenko.travelfriendsbackend.entity.Traveler;
import eu.shinkarenko.travelfriendsbackend.repository.TravelerRepository;
import eu.shinkarenko.travelfriendsbackend.service.TravelerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelerServiceImpl implements TravelerService {

    @Autowired
    private TravelerRepository travelerRepository;

    @Override
    public Traveler addTraveler(Traveler traveler) {
        return travelerRepository.saveAndFlush(traveler);
    }

    @Override
    public void delete(long id) {
        travelerRepository.deleteById(id);
    }

    @Override
    public Traveler getByName(String name) {
        return travelerRepository.findByName(name);
    }

    @Override
    public Traveler editTraveler(Traveler traveler) {
        return travelerRepository.saveAndFlush(traveler);
    }

    @Override
    public List<Traveler> getAll() {
        return (List<Traveler>) travelerRepository.findAll();
    }
}
