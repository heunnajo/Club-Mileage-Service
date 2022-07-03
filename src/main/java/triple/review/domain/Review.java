package triple.review.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter @Setter
public class Review {
    @Id @GeneratedValue
    @Column(name = "order_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")//외래키
    private Member member;

    @OneToMany(mappedBy = "review")
    private List<ReviewItem> reviewItems = new ArrayList<>();

    private LocalDateTime reviewDate;//Hibernate의 자동 지원


}
