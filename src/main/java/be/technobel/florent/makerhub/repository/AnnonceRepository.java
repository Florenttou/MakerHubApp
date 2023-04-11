package be.technobel.florent.makerhub.repository;

import be.technobel.florent.makerhub.models.entity.Annonce;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnonceRepository extends JpaRepository<Annonce, Long> {
}
