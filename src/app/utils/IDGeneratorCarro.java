/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.utils;

/**
 *
 * @author derickandrade
 */
public class IDGeneratorCarro {
    private static int currentCarroID = 0;
    
    public static synchronized int generateCarroID() {
        return currentCarroID++;
    }
}
