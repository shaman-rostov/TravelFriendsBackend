package eu.shinkarenko.travelfriendsbackend.init;

//import eu.shinkarenko.travelfriendsbackend.dao.TravelerDAO;
import eu.shinkarenko.travelfriendsbackend.repository.TravelerRepository;
import eu.shinkarenko.travelfriendsbackend.entity.Traveler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInit implements ApplicationRunner {

    private TravelerRepository travelerRepository;
    @Autowired
    public DataInit(TravelerRepository travelerRepository){
        this.travelerRepository = travelerRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        long count = travelerRepository.count();

        if(count==0){

            Traveler traveler1 = new Traveler(1L, "a", "Petrovich", "dj");
            Traveler traveler2 = new Traveler(2L, "b", "Andrey", "dj");
            Traveler traveler3 = new Traveler(3L, "c", "Sergey", "dj");
        travelerRepository.saveAndFlush(traveler1);
        travelerRepository.saveAndFlush(traveler2);
        travelerRepository.saveAndFlush(traveler3);
        }
    }
}
