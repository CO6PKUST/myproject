package ru.fortech.ahub.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

/*
 *
 * Это тестовый класс контроллер, для отладки
 *
 *
 */
@RestController
@RequiredArgsConstructor
@Slf4j
public class MainController {
    @GetMapping("/secured")
    public String returnSecuredData() {
        return "securedData";
    }

    @GetMapping("/")
    public String returnUnsecuredData() {
        return "unsecuredData";
    }

    @GetMapping("/info")
    public String returnInfo(Principal principal) {
        return principal.getName();
    }

}
