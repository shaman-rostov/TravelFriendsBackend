package eu.shinkarenko.travelfriendsbackend.dao;

import eu.shinkarenko.travelfriendsbackend.model.Traveler;
import org.springframework.stereotype.Repository;

import java.util.*;


@Repository
public class TravelerDAO {
    private static final Map<String, Traveler> tvlMap = new HashMap<>();

    static {
        inittvls();
    }

    private static void inittvls() {
        Traveler tvl1 = new Traveler("E01", "Smith", "Clerk");
        Traveler tvl2 = new Traveler("E02", "Allen", "Salesman");
        Traveler tvl3 = new Traveler("E03", "Jones", "Manager");

        tvlMap.put(tvl1.getTvlNo(),tvl1);
        tvlMap.put(tvl2.getTvlNo(),tvl2);
        tvlMap.put(tvl3.getTvlNo(),tvl3);
    }

    public Traveler getTravelerNo(String tvlNo) {
        return tvlMap.get(tvlNo);
    }

    public Traveler addTraveler(Traveler tvl) {
        tvlMap.put(tvl.getTvlNo(), tvl);
        return tvl;
    }

    public Traveler updateTraveler(Traveler tvl) {
        tvlMap.put(tvl.getTvlNo(), tvl);
        return tvl;
    }

    public void deleteTraveler(String tvlNo) {
        tvlMap.remove(tvlNo);
    }

    public List<Traveler> getAllTravelers() {
        Collection<Traveler> c = tvlMap.values();
        return new ArrayList<>(c);
    }
}
