/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.utils;

/**
 *
 * @author henri
 */
public class IDGenerator {
    private static int currentServicoId = 1;
;
    private static int currentVeiculoId = 1;
    
    public static synchronized int generateServicoID() {
        return currentServicoId++;
    }
    
    public static synchronized int generateVeiculoID() {
        return currentVeiculoId++;
    }
}
