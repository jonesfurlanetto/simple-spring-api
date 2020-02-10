package br.coop.unimed.portal.simplespringapi.controller;

import br.coop.unimed.portal.simplespringapi.dto.ResponseDTO;
import br.coop.unimed.portal.simplespringapi.service.TesteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teste")
public class TesteController {

    @Autowired
    private TesteService testeService;

    @GetMapping("/hello-world")
    public ResponseEntity<?> getTeste() {
        return ResponseEntity.ok(testeService.getTeste());
    }
}
