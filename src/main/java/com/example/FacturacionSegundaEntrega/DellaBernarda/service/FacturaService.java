package com.example.FacturacionSegundaEntrega.DellaBernarda.service;

import com.example.FacturacionSegundaEntrega.DellaBernarda.models.FacturaModel;
import com.example.FacturacionSegundaEntrega.DellaBernarda.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    public FacturaModel getFactura(Integer id) {
        return facturaRepository.findById(id).orElse(null);
    }


}
