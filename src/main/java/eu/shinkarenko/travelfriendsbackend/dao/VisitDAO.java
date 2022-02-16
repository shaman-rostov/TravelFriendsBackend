package eu.shinkarenko.travelfriendsbackend.dao;

import eu.shinkarenko.travelfriendsbackend.model.Visit;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.*;

@Repository
public class VisitDAO {
    private static final Map<String, Visit> visitMap = new HashMap<>();
    static {
        initvisits();
    }
    private static void initvisits() {
        Visit visit1 = new Visit(1, "qwerty", LocalDate.of(2022,1,1), LocalDate.of(2022, 1,10), "Russia", "Auto");
        Visit visit2 = new Visit(1, "asdfg", LocalDate.of(2022,2,1), LocalDate.of(2022, 2,10), "Russia", "Auto");
        Visit visit3 = new Visit(1, "zxcvb", LocalDate.of(2022,3,1), LocalDate.of(2022, 3,10), "Russia", "Auto");

      //  visitMap.put(visit1.getVisitID(),visit1);
      //  visitMap.put(visit2.getVisitID(),visit2);
      //  visitMap.put(visit3.getVisitID(),visit3);

    }

    public Visit getVisitByID(String visitID) {
        return visitMap.get(visitID);
    }

    public Visit addVisit(Visit visit) {
        visitMap.put(visit.getVisitID(), visit);
        return visit;
    }

    public Visit updateVisit(Visit visit) {
        visitMap.put(visit.getVisitID(), visit);
        return visit;
    }

    public void deleteVisit(String visitID) {
        visitMap.remove(visitID);
    }

    public List<Visit> getAllVisits() {
        Collection<Visit> c = visitMap.values();
        return new ArrayList<>(c);
    }
}

