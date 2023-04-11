package be.technobel.florent.makerhub.service;

import be.technobel.florent.makerhub.models.form.UserRegisterForm;

public interface UserService {
    void signUp(UserRegisterForm form);
    void validateRegistration(Long registrationId);
}
