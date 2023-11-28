package com.example.FacturacionSegundaEntrega.DellaBernarda.models;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="factura")
public class FacturaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="clientes_id")
    private ClienteModel cliente;
    @Column(name="fecha_creacion")
    private Date fechaCreacion;
    private double total;

    @OneToMany(mappedBy = "factura", cascade = CascadeType.ALL)
    private List<DetallesFacturaModel> detallesFactura;
}
