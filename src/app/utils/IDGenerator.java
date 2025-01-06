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
    private static int currentID = 0;
    
    public static synchronized int generateID() {
        return currentID++;
    }
}
