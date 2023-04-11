package be.technobel.florent.makerhub.models.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
@Getter
@Setter
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categorie_id", nullable = false)
    private Long id;

    @Column(nullable = false)
    private String name;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Categorie categorie = (Categorie) o;

        return Objects.equals(id, categorie.id);
    }
    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

}
