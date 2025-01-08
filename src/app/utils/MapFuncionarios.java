/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.utils;

import app.model.Funcionario;
import java.util.HashMap;

/**
 *
 * @author henri
 */
public class MapFuncionarios {
    public static HashMap<String, Funcionario> funcionarios;

    public MapFuncionarios() {
        funcionarios = new HashMap<>();
        adicionarFuncionariosAleatorios();
    }

    private void adicionarFuncionariosAleatorios() {
        funcionarios.put("admin1", new Funcionario(5000.0, "senha123", 1, "João Silva", "123.456.789-00", "joao@gmail.com", "11999999999"));
        funcionarios.put("admin2", new Funcionario(4500.0, "senha456", 2, "Maria Oliveira", "987.654.321-00", "maria@gmail.com", "21988888888"));
        funcionarios.put("horista1", new Funcionario("senha789", 3, "Pedro Santos", "111.222.333-44", "pedro@gmail.com", "31977777777"));
        funcionarios.put("horista2", new Funcionario("senha321", 4, "Ana Clara", "444.555.666-77", "ana@gmail.com", "41966666666"));
        funcionarios.put("admin3", new Funcionario(6000.0, "senha654", 5, "Carlos Pereira", "999.888.777-66", "carlos@gmail.com", "51955555555"));
    }
}
