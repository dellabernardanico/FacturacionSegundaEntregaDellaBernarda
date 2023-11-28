package com.example.FacturacionSegundaEntrega.DellaBernarda.controller;

import com.example.FacturacionSegundaEntrega.DellaBernarda.models.ProductoModel;
import com.example.FacturacionSegundaEntrega.DellaBernarda.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/productos")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/{id}")
    public ResponseEntity<ProductoModel> getProducto(@PathVariable Integer id) {
        ProductoModel producto = productoService.getProducto(id);
        return new ResponseEntity<>(producto, HttpStatus.OK);
    }


}

