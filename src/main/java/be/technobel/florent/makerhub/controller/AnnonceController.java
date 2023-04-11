package be.technobel.florent.makerhub.controller;

import be.technobel.florent.makerhub.models.dto.AnnonceDTO;
import be.technobel.florent.makerhub.models.form.AnnonceForm;
import be.technobel.florent.makerhub.service.AnnonceService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/annonce")
public class AnnonceController {
    private final AnnonceService annonceService;

    public AnnonceController(AnnonceService annonceService) {
        this.annonceService = annonceService;
    }
    @GetMapping
    public List<AnnonceDTO> getAll(){
        return annonceService.getAll();
    }
    @GetMapping("/{id:[0-9]+}")
    public AnnonceDTO getOne(@PathVariable long id){
        return annonceService.getOne(id);
    }
    @PostMapping
    public void create(@RequestBody @Valid AnnonceForm form){
        annonceService.createAnnonce(form);
    }
}
