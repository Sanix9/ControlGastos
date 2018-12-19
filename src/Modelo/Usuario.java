/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Sanix
 */
public class Usuario extends Persona{

    private String username;
    private String password;

    public Usuario(String username, String password, String cedula, String nombre, String apellido, String direccion, int telefono) {
        super(cedula, nombre, apellido, direccion, telefono);
        this.username = username;
        this.password = password;
    }
    
    

}
