package id.go.beacukai.bcperak.ap.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Attachment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne
    private Submission submission;

    @ManyToOne
    private Response response;

    private String path;

    private String mimeType;

    private Boolean isDeleted = false;

    private String uploadAt;

    private String uploadBy;
}
