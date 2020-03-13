package org.sultangazibelediye.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class Deneme {
    @GetMapping("/novel")
    public String getValues() {
        return "{\n" +
                "  \"name\": \"Araba Sevdası\",\n" +
                "  \"author\": \"Recaizade Mahmut Ekrem\",\n" +
                "  \"hasbook\": 1\n" +
                "}";
    }
}
