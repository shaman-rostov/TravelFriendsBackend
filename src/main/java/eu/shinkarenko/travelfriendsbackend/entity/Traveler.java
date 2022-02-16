package eu.shinkarenko.travelfriendsbackend.entity;

import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@ToString
@Entity
@AllArgsConstructor
@Table(name="traveler")
public class Traveler {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name="id", nullable =false)
    private long id;
    @Column(name = "travelNo", length = 64, nullable = false)
    private String tvlNo;
    @Column(name = "name", length = 64, nullable = false)
    private String name;
    @Column(name = "position", length = 64, nullable = false)
    private String position;

    public Traveler() {

    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
//        Traveler traveler = (Traveler) o;
//        return id != null && Objects.equals(id, traveler.id);
//    }
//
//    @Override
//    public int hashCode() {
//        return getClass().hashCode();
//    }
}
