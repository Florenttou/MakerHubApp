package be.technobel.florent.makerhub.models.dto;

import be.technobel.florent.makerhub.models.entity.Annonce;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.stream.Collectors;

@Data
public class AnnonceDTO {

    private final Long id;
    private final LocalDateTime dateDeCreation;
    private final String titre;
    private final String description;
    private final Double prix;
    private  final Set<CategorieDTO> categories;

    public static AnnonceDTO toDto(Annonce entity){
        if( entity == null )
            return null;

        return new AnnonceDTO(
                entity.getId(),
                entity.getDateDeCreation(),
                entity.getTitre(),
                entity.getDescription(),
                entity.getPrix(),
                entity.getCategories().stream()
                        .map( CategorieDTO::toDto )
                        .collect(Collectors.toSet())
        );
    }

}
