package com.example.city;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//hangi adreste yayinlansin;
@RequestMapping("/mesaj")
public class RestApi {
    //mesaj adresine get yapildiginda merhaba metodu calissin
    @GetMapping
    //restful controller olarak acacak

    public String sayHello() {
        return "Hello";
    }
}
