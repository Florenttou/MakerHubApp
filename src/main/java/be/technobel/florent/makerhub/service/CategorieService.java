package be.technobel.florent.makerhub.service;

import be.technobel.florent.makerhub.models.dto.CategorieDTO;

import java.util.List;

public interface CategorieService {
    List<CategorieDTO> getAll();
    CategorieDTO getOne(Long id);
}
