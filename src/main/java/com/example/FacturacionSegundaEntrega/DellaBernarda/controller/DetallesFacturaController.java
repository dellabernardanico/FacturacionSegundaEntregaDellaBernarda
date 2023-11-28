package com.example.FacturacionSegundaEntrega.DellaBernarda.controller;

import com.example.FacturacionSegundaEntrega.DellaBernarda.models.DetallesFacturaModel;
import com.example.FacturacionSegundaEntrega.DellaBernarda.service.DetallesFacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/detallesFactura")
public class DetallesFacturaController {

    @Autowired
    private DetallesFacturaService detallesFacturaService;

    @GetMapping("/{id}")
    public ResponseEntity<DetallesFacturaModel> getDetallesFactura(@PathVariable Integer id) {
        DetallesFacturaModel detallesFactura = detallesFacturaService.getDetallesFactura(id);
        return new ResponseEntity<>(detallesFactura, HttpStatus.OK);
    }


}

