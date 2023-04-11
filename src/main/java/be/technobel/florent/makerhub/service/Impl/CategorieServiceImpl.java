package be.technobel.florent.makerhub.service.Impl;

import be.technobel.florent.makerhub.exceptions.NotFoundExeption;
import be.technobel.florent.makerhub.models.dto.CategorieDTO;
import be.technobel.florent.makerhub.models.entity.Categorie;
import be.technobel.florent.makerhub.repository.CategorieRepository;
import be.technobel.florent.makerhub.service.CategorieService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class CategorieServiceImpl implements CategorieService {

    private final CategorieRepository categorieRepository;

    public CategorieServiceImpl(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }

    @Override
    public List<CategorieDTO> getAll() {
        return categorieRepository.findAll()
                .stream()
                .map(CategorieDTO::toDto)
                .toList();
    }

    @Override
    public CategorieDTO getOne(Long id) {
        return categorieRepository.findById(id)
                .map(CategorieDTO::toDto)
                .orElseThrow(() -> new NotFoundExeption(Categorie.class, id));
        }
    }

