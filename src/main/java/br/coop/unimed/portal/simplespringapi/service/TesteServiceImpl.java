package br.coop.unimed.portal.simplespringapi.service;

import br.coop.unimed.portal.simplespringapi.dto.ResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TesteServiceImpl implements TesteService {

    public ResponseEntity<?> getTeste() {
        return ResponseEntity.ok(new ResponseDTO("Hello World!!"));
    }

}
