package be.technobel.florent.makerhub.service;

import be.technobel.florent.makerhub.models.dto.AnnonceDTO;
import be.technobel.florent.makerhub.models.form.AnnonceForm;

import java.util.List;

public interface AnnonceService {
    List<AnnonceDTO> getAll();
    AnnonceDTO getOne(Long id);

    void createAnnonce(AnnonceForm form);
}
