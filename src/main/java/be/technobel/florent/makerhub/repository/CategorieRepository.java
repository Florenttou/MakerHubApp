package be.technobel.florent.makerhub.repository;


import be.technobel.florent.makerhub.models.entity.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {
}
