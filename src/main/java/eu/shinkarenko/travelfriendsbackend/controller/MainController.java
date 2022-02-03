package eu.shinkarenko.travelfriendsbackend.controller;

import eu.shinkarenko.travelfriendsbackend.dao.TravelerDAO;
import eu.shinkarenko.travelfriendsbackend.entity.Traveler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @Autowired
    private TravelerDAO travelerDAO;

    @ResponseBody
    @RequestMapping("/")
    public String index(){
        Iterable<Traveler> all = travelerDAO.findAll();
        StringBuilder sb = new StringBuilder();
        all.forEach(p->sb.append(p.getTvlName()+"<br>"));
        return sb.toString();
    }
}
