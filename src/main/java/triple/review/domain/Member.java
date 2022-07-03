package triple.review.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    private String name;
    private int contentScore;
    private int bonusScore;

    @OneToMany(mappedBy = "member")//연관 관계 거울 : 매핑된 거울일 뿐!
    private List<Review> reviews = new ArrayList<>();

}
