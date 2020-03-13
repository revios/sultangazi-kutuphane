package org.sultangazibelediye.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getBooks")
public class Deneme {
    @RequestMapping("/novel")
    public String getValues(){
        return "{\n" +
                "  \"name\": \"Araba Sevdası\",\n" +
                "  \"author\": \"Recaizade Mahmut Ekrem\",\n" +
                "  \"hasbook\": 1\n" +
                "}";
    }
}
