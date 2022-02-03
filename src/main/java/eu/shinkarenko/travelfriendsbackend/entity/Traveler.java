package eu.shinkarenko.travelfriendsbackend.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Getter
@Setter
@ToString
@Entity
@AllArgsConstructor
@Table(name="TRAVELER")
public class Traveler {
    @Id
    @Column(name="ID", nullable =false)
    private Long Id;
    @Column(name = "TravelNo", length = 64, nullable = false)
    private String tvlNo;
    @Column(name = "Name", length = 64, nullable = false)
    private String tvlName;
    @Column(name = "Position", length = 64, nullable = false)
    private String position;

    public Traveler() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Traveler traveler = (Traveler) o;
        return Id != null && Objects.equals(Id, traveler.Id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
