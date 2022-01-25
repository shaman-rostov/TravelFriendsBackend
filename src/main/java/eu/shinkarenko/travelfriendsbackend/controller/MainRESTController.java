package eu.shinkarenko.travelfriendsbackend.controller;

import eu.shinkarenko.travelfriendsbackend.dao.TravelerDAO;
import eu.shinkarenko.travelfriendsbackend.model.Traveler;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainRESTController {

    @Autowired
    private TravelerDAO travelerDAO;

    @RequestMapping("/")
    @ResponseBody
    public String welcome(){
        return "Welcome";
    }

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        return "{greeting: 'Hello'}";
    }

    // URL:
    // http://localhost:8080/travelers
    @Tag(name="Список путешественников", description="Позволяет получить список путешественников")
    @GetMapping(value = "/travelers", //
         //   method = RequestMethod.GET, //
            produces = { MediaType.APPLICATION_JSON_VALUE, //
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public List<Traveler> getTravelers() {
        return travelerDAO.getAllTravelers();
    }

    // URL:
    // http://localhost:8080/travelers/{tvlNo}
    @Tag(name="Путешественник по ID", description="Позволяет получить путешественника по ID")
    @GetMapping(value = "/travelers/{tvlNo}", //
           // method = RequestMethod.GET, //
            produces = { MediaType.APPLICATION_JSON_VALUE, //
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public Traveler getTraveler(@PathVariable("tvlNo") String tvlNo) {
        return (Traveler) travelerDAO.getAllTravelers();
    }

    // URL:
    // http://localhost:8080/employee
    @Tag(name="Путешественник", description="Позволяет создать аккаунт путешественника")
    @PostMapping(value = "/traveler", //
           // method = RequestMethod.POST, //
            produces = { MediaType.APPLICATION_JSON_VALUE, //
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public Traveler addEmployee(@RequestBody Traveler tvl) {

        System.out.println("(Service Side) Creating employee: " + tvl.getTvlNo());

        return travelerDAO.addTraveler(tvl);
    }

    // URL:
    // http://localhost:8080/employee
    @RequestMapping(value = "/traveler", //
            method = RequestMethod.PUT, //
            produces = { MediaType.APPLICATION_JSON_VALUE, //
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public Traveler updateTraveler(@RequestBody Traveler tvl) {

        System.out.println("(Service Side) Editing traveler: " + tvl.getTvlNo());

        return travelerDAO.updateTraveler(tvl);
    }
    // URL:
    // http://localhost:8080/traveler/{tvlNo}
    @RequestMapping(value = "/traveler/{tvlNo}", //
            method = RequestMethod.DELETE, //
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public void deleteTraveler(@PathVariable("tvlNo") String tvlNo) {

        System.out.println("(Service Side) Deleting traveler: " + tvlNo);

        travelerDAO.deleteTraveler(tvlNo);
    }
}
