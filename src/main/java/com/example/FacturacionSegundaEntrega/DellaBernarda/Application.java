package com.example.FacturacionSegundaEntrega.DellaBernarda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.example.FacturacionSegundaEntrega.DellaBernarda.repository.*;

@SpringBootApplication
@EntityScan(basePackages = "com.example.models")
public class Application implements CommandLineRunner {

	@Autowired
	ClienteRepository clienteRepository;

	@Autowired
	DetallesFacturaRepository detallesFacturaRepository;

	@Autowired
	FacturaRepository facturaRepository;

	@Autowired
	ProductoRepository productoRepository;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}
}
