package com.example.FacturacionSegundaEntrega.DellaBernarda.controller;

import com.example.FacturacionSegundaEntrega.DellaBernarda.models.FacturaModel;
import com.example.FacturacionSegundaEntrega.DellaBernarda.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/facturas")
public class FacturaController {

    @Autowired
    private FacturaService facturaService;

    @GetMapping("/{id}")
    public ResponseEntity<FacturaModel> getFactura(@PathVariable Integer id) {
        FacturaModel factura = facturaService.getFactura(id);
        return new ResponseEntity<>(factura, HttpStatus.OK);
    }


}
