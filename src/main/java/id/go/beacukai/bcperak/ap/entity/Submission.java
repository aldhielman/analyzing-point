package id.go.beacukai.bcperak.ap.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Submission {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String car;

    @Column(name = "officer_id")
    private String officerId;

    @Column(name = "customer_id")
    private String customerId;

    @Enumerated(EnumType.ORDINAL)
    private final Status status = Status.DRAFT;

    @OneToMany(mappedBy = "submission")
    private List<Response> responses;

    @OneToMany(mappedBy = "submission")
    private List<Attachment> attachments;

    @ManyToMany(mappedBy = "submissions")
    private List<Tag> tags;

}
