package eu.shinkarenko.travelfriendsbackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class Visit {
    private Integer TravelerID;
    private String VisitID;
    private LocalDate StartDate;
    private LocalDate EndDate;
    private String Country;
    private String Transport;

}
