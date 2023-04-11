package be.technobel.florent.makerhub.service.Impl;

import be.technobel.florent.makerhub.exceptions.NotFoundExeption;
import be.technobel.florent.makerhub.models.dto.AnnonceDTO;
import be.technobel.florent.makerhub.models.entity.Annonce;
import be.technobel.florent.makerhub.models.form.AnnonceForm;
import be.technobel.florent.makerhub.repository.AnnonceRepository;
import be.technobel.florent.makerhub.repository.CategorieRepository;
import be.technobel.florent.makerhub.service.AnnonceService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
@Service
public class AnnonceServiceImpl implements AnnonceService {

    private final AnnonceRepository annonceRepository;
    private final CategorieRepository categorieRepository;

    public AnnonceServiceImpl(AnnonceRepository annonceRepository, CategorieRepository categorieRepository) {
        this.annonceRepository = annonceRepository;
        this.categorieRepository = categorieRepository;
    }

    @Override
    public List<AnnonceDTO> getAll() {
        return annonceRepository.findAll().stream()
                .map(AnnonceDTO::toDto)
                .toList();
    }

    @Override
    public AnnonceDTO getOne(Long id) {
        return annonceRepository.findById(id)
                .map(AnnonceDTO::toDto)
                .orElseThrow(() -> new NotFoundExeption(Annonce.class, id));
    }

    @Override
    public void createAnnonce (AnnonceForm form) {
        Annonce annonce = form.toEntity();
        annonce.setCategories(new LinkedHashSet<>(categorieRepository.findAllById(Collections.singleton(form.getCategorieId()))) );
        annonce.setDateDeCreation(LocalDateTime.now());
        annonceRepository.save(annonce);
    }
}
