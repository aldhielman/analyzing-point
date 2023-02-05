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
public class Tag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    @Column(name = "account_id")
    private String accountId;

    @Column(name = "is_actived")
    private Boolean isActived = true;

    private String color;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Submission> submissions;
}
