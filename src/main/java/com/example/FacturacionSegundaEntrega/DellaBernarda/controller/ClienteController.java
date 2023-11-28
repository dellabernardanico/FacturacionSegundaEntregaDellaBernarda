package com.example.FacturacionSegundaEntrega.DellaBernarda.controller;

import com.example.FacturacionSegundaEntrega.DellaBernarda.models.ClienteModel;
import com.example.FacturacionSegundaEntrega.DellaBernarda.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/{id}")
    public ResponseEntity<ClienteModel> getCliente(@PathVariable Integer id) {
        ClienteModel cliente = clienteService.getCliente(id);
        return new ResponseEntity<>(cliente, HttpStatus.OK);
    }


}

