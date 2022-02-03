package eu.shinkarenko.travelfriendsbackend.dao;

import eu.shinkarenko.travelfriendsbackend.entity.Traveler;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TravelerDAO extends CrudRepository<Traveler, Long> {





    // private static final Map<String, Traveler> tvlMap = new HashMap<>();

//    static {
//        inittvls();
//    }

//    private static void inittvls() {
//        Traveler tvl1 = new Traveler(1l,"E01", "Smith", "Clerk");
//        Traveler tvl2 = new Traveler(2l,"E02", "Allen", "Salesman");
//        Traveler tvl3 = new Traveler(3l, "E03", "Jones", "Manager");
//
//        tvlMap.put(tvl1.getTvlNo(),tvl1);
//        tvlMap.put(tvl2.getTvlNo(),tvl2);
//        tvlMap.put(tvl3.getTvlNo(),tvl3);
//    }
//
//    public Traveler getTravelerNo(String tvlNo) {
//        return tvlMap.get(tvlNo);
//    }
//
//    public Traveler addTraveler(Traveler tvl) {
//        tvlMap.put(tvl.getTvlNo(), tvl);
//        return tvl;
//    }
//
//    public Traveler updateTraveler(Traveler tvl) {
//        tvlMap.put(tvl.getTvlNo(), tvl);
//        return tvl;
//    }
//
//    public void deleteTraveler(String tvlNo) {
//        tvlMap.remove(tvlNo);
//    }
//
//    public List<Traveler> getAllTravelers() {
//        Collection<Traveler> c = tvlMap.values();
//        return new ArrayList<>(c);
//    }
}
