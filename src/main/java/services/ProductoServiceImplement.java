package services;

import models.Productos;

import java.util.Arrays;
import java.util.List;

public class ProductoServiceImplement implements ProductoService {
    @Override
    public List<Productos> listar() {
        return Arrays.asList(
                new Productos(1, "Jose Perez", "Calles 123", "CI", "12345678", "9746323"),
                new Productos(2, "Ana Lopez", "Av. Principal 45", "Pasaporte", "A1234567", "5123456"),
                new Productos(3, "Carlos Gómez", "Calle Secundaria 789", "CI", "87654321", "78974312")
        );
    }
}
