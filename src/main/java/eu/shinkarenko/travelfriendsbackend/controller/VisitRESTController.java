package eu.shinkarenko.travelfriendsbackend.controller;

import eu.shinkarenko.travelfriendsbackend.dao.VisitDAO;
import eu.shinkarenko.travelfriendsbackend.model.Traveler;
import eu.shinkarenko.travelfriendsbackend.model.Visit;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VisitRESTController {

    @Autowired
    private VisitDAO VisitDAO;



    // URL:
    // http://localhost:8080/visits
    @Tag(name="Список визитов", description="Позволяет получить список визитов")
    @GetMapping(value = "/visits", //
            //   method = RequestMethod.GET, //
            produces = { MediaType.APPLICATION_JSON_VALUE, //
                    MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public List<Visit> getVisits() {
        return VisitDAO.getAllVisits();
    }

}
