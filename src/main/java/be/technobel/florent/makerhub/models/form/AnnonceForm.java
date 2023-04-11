package be.technobel.florent.makerhub.models.form;

import be.technobel.florent.makerhub.models.entity.Annonce;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class AnnonceForm {
    @NotBlank
    private String titre;
    @NotBlank
    private String description;
    @Positive
    private double prix;

    private Long categorieId;

    public Annonce toEntity(){
        Annonce annonce = new Annonce();

        annonce.setTitre(titre);
        annonce.setDescription(description);
        annonce.setPrix(prix);

        return annonce;
    }
}
