package be.technobel.florent.makerhub.exceptions;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

@Getter
public class NotFoundExeption extends ResponseStatusException {

    private final Class<?> ressourceType;
    private final Object id;

    public NotFoundExeption(Class<?> ressourceType, Object id){
        this(
                String.format("%s not found with id %s", ressourceType.getSimpleName(), id.toString()),
                       ressourceType,
                       id
        );
    }
    protected NotFoundExeption(String message, Class<?> ressourceType, Object id) {
        super(HttpStatus.NOT_FOUND, message);
        this.ressourceType = ressourceType;
        this.id = id;
    }
}
