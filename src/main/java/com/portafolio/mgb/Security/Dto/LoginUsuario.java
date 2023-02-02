/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolio.mgb.Security.Dto;

import javax.validation.constraints.NotBlank;

/**
 *
 * @author Gabriel Habano
 */
public class LoginUsuario {
     @NotBlank
    private String nombreUsuario;
    @NotBlank
    private String password;

    
    // G y S
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
