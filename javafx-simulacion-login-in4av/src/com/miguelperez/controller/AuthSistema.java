/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.miguelperez.controller;

import com.miguelperez.model.Rol;
import com.miguelperez.model.Usuario;
import java.util.ArrayList;

/**
 *
 * @author informatica
 */
public class AuthSistema {
    private static ArrayList <Usuario> listaUsuarios = new ArrayList<>();
    
    public AuthSistema(){
        Usuario usuarioAdmin = new Usuario("admin", 
                                "admin", "admin", Rol.ADMIN);
        Usuario usuarioUser = new Usuario("user", 
                                "user", "user", Rol.USER);
        Usuario usuarioYo = new Usuario("Miguel", 
                                "233", "Miguel Antonio Perez Charuc", Rol.ADMIN);
        
        listaUsuarios.add(usuarioAdmin);
        listaUsuarios.add(usuarioUser);
        listaUsuarios.add(usuarioYo);
    }
    
    public Usuario login (String nombreUsuario, String clave){
        for (Usuario usuarioBuscado : listaUsuarios){
            if (usuarioBuscado.getNombreUsuario().equals(nombreUsuario)
                && usuarioBuscado.getPassword().equals(clave))
            return usuarioBuscado;
        }
        
        return null;
    }
    
    public static ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public static void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        AuthSistema.listaUsuarios = listaUsuarios;
    }
    
    
}
