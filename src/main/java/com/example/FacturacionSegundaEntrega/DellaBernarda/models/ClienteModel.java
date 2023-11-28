package com.example.FacturacionSegundaEntrega.DellaBernarda.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name="clientes")
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String nombre;
    private String apellido;

    @Column(name="numero_documento")
    private String numeroDocumento;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<FacturaModel> facturas;

}
