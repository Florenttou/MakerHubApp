package be.technobel.florent.makerhub.models.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class Annonce {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "annonce_id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private LocalDateTime dateDeCreation;
    @Column(nullable = false)
    private String titre;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private double prix;

    @ManyToMany
    private Set<Categorie> categories = new LinkedHashSet<>();;
}
