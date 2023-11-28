package com.example.FacturacionSegundaEntrega.DellaBernarda.service;

import com.example.FacturacionSegundaEntrega.DellaBernarda.models.DetallesFacturaModel;
import com.example.FacturacionSegundaEntrega.DellaBernarda.repository.DetallesFacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetallesFacturaService {

    @Autowired
    private DetallesFacturaRepository detallesFacturaRepository;

    public DetallesFacturaModel getDetallesFactura(Integer id) {
        return detallesFacturaRepository.findById(id).orElse(null);
    }

}
