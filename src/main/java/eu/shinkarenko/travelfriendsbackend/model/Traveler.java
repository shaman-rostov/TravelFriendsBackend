package eu.shinkarenko.travelfriendsbackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Traveler {

    private String tvlNo;
    private String tvlName;
    private String position;

}
