package be.technobel.florent.makerhub.controller;

import be.technobel.florent.makerhub.models.dto.AuthDTO;
import be.technobel.florent.makerhub.models.form.LoginForm;
import be.technobel.florent.makerhub.service.AuthService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/auth")
public class AuthController {
    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }
    @PostMapping("/login")
    public AuthDTO login(@RequestBody LoginForm form){
        return authService.login(form);
    }
}
