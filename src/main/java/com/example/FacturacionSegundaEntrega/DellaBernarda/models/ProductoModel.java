package com.example.FacturacionSegundaEntrega.DellaBernarda.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="productos")
public class ProductoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descripcion;
    private String codigo;
    private int stock;
    @Column(name="price")
    private double precio;

    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    private List<DetallesFacturaModel> detallesFactura;

}
