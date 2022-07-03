package triple.review.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Location {

    @Id @GeneratedValue
    @Column(name = "location_id")
    private Long id;

    private String name;

    private List<Review> reviewList = new ArrayList<>();
}
