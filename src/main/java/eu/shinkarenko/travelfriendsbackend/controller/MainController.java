package eu.shinkarenko.travelfriendsbackend.controller;

//import eu.shinkarenko.travelfriendsbackend.dao.TravelerDAO;

import eu.shinkarenko.travelfriendsbackend.entity.Traveler;
import eu.shinkarenko.travelfriendsbackend.repository.TravelerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    //  private TravelerDAO travelerDAO;
    @Autowired
    private TravelerRepository travelerRepository;

    @ResponseBody
    @RequestMapping("/")
    public String index() {
        Iterable<Traveler> all = travelerRepository.findAll();
        StringBuilder sb = new StringBuilder();
        all.forEach(p -> sb.append(p.getName() + "<br>"));
        return sb.toString();
    }
}
