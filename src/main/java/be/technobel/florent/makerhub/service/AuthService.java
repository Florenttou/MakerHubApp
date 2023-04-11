package be.technobel.florent.makerhub.service;

import be.technobel.florent.makerhub.models.dto.AuthDTO;
import be.technobel.florent.makerhub.models.form.LoginForm;

public interface AuthService {

    AuthDTO login(LoginForm form);


    AuthDTO refreshJWT(String refreshToken);

}