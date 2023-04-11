package be.technobel.florent.makerhub.models.dto;

import be.technobel.florent.makerhub.models.entity.Categorie;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategorieDTO {
    private final Long id;
    private final String nom;

    public static CategorieDTO toDto(Categorie entity){
        if( entity == null )
            return null;

        return CategorieDTO.builder()
                .id(entity.getId())
                .nom(entity.getName())
                .build();
    }

}
