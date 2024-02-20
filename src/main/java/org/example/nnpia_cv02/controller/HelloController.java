package org.example.nnpia_cv02.controller;

import org.springframework.web.bind.annotation.*;

/*
    Anotace @Controller je určena pro tradiční webové aplikace, které generují HTML obsah a pracují s pohledy (views).
    Anotace @RestController je specializovaná pro tvorbu RESTful služeb a
        automaticky serializuje výstupy metod do formátu odpovědí (například JSON), místo HTML stránek.

    YAML:
        YAML je snadno čitelný a psaný pro člověka. Používá méně závorek než JSON a XML a často se používá pro konfigurační soubory.

    JSON:
        JSON (JavaScript Object Notation)
        je formát založený na textu, který je často používán pro výměnu dat mezi serverem a klientem.
        Je založený na syntaktickém formátu JavaScriptu, ale je nezávislý na programovacím jazyku. Je snadno čitelný a psaný strojem, ale může být pro člověka méně čitelný než YAML.

    XML:
        XML (Extensible Markup Language)
        je značkovací jazyk, který je často používán pro reprezentaci strukturovaných dat.
        Je založen na hierarchické struktuře elementů značkovaných značkami.
        Často vyžaduje značný počet značek, což může způsobit, že je méně čitelný než YAML a JSON.
*/

@RestController
public class HelloController {
    @GetMapping("")
    public String helloWorld(){
        return "Hello world from Spring Boot application.";
    }

    // Endpoint přijímající libovolný řetězec v path parametru pomocí @GetMapping
    // http://localhost:9000/BooksAppAPI/endpointA/test
    @GetMapping("/endpointA/{param}")
    public String endpointAPathVariable(@PathVariable String param) {
        return "Parametr v cestě: " + param;
    }

    // Endpoint přijímající libovolný řetězec v path parametru pomocí @RequestMapping s GET metodou
    // http://localhost:9000/BooksAppAPI/endpointB/test
    @RequestMapping(value = "/endpointB/{param}", method = RequestMethod.GET)
    public String endpointBPathVariable(@PathVariable String param) {
        return "Parametr v cestě: " + param;
    }

    // Endpoint přijímající libovolný řetězec v query parametru
    // http://localhost:9000/BooksAppAPI/endpointC?param=test
    @GetMapping("/endpointC")
    public String endpointCQueryParam(@RequestParam String param) {
        return "Parametr v query: " + param;
    }

}
