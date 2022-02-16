package eu.shinkarenko.travelfriendsbackend.repository;

import eu.shinkarenko.travelfriendsbackend.entity.Traveler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TravelerRepository extends JpaRepository<Traveler, Long> {

    @Query("select t from Traveler t where t.name= :name")
    Traveler findByName(@Param("name") String name);


   // void delete(long id);
}