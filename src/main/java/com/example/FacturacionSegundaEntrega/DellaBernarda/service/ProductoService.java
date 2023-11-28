package com.example.FacturacionSegundaEntrega.DellaBernarda.service;

import com.example.FacturacionSegundaEntrega.DellaBernarda.models.ProductoModel;
import com.example.FacturacionSegundaEntrega.DellaBernarda.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public ProductoModel getProducto(Integer id) {
        return productoRepository.findById(id).orElse(null);
    }

}
