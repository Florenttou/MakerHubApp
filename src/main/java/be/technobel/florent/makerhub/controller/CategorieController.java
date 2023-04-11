package be.technobel.florent.makerhub.controller;

import be.technobel.florent.makerhub.models.dto.CategorieDTO;
import be.technobel.florent.makerhub.service.CategorieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/categorie")
public class CategorieController {
    private final CategorieService categorieService;

    public CategorieController(CategorieService categorieService) {
        this.categorieService = categorieService;
    }
    @GetMapping
    public List<CategorieDTO> getAll(){
        return categorieService.getAll();
    }

    @GetMapping("/{id:[0-9]+}")
    public CategorieDTO getOne(@PathVariable long id){
        return categorieService.getOne(id);
    }



}

