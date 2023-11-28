package com.example.FacturacionSegundaEntrega.DellaBernarda.service;

import com.example.FacturacionSegundaEntrega.DellaBernarda.models.*;
import com.example.FacturacionSegundaEntrega.DellaBernarda.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public ClienteModel getCliente(Integer id) {
        return clienteRepository.findById(id).orElse(null);
    }


}

