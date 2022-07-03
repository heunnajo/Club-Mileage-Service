package triple.review.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
public class ReviewItem {

    @Id @GeneratedValue
    @Column(name = "review_item_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    @ManyToOne
    @JoinColumn(name = "review_id     ")
    private Review review;
}
