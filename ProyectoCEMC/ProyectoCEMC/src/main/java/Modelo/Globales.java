package Modelo;

public class Globales {
    
    //Variables Globales
    private static int cont_idusuario = 1;
    private static int cont_idpacientes = 1;
    private static int cont_identrenadores = 1;
    private static int cont_idprogramas = 1;
    private static int cont_idcertificaciones = 1;
    private static int cont_idtratamientos = 1;
    
    public static int getIdusuario() {
        return cont_idusuario;
    }
    
    public static void aumentarIdusuario() {
        cont_idusuario = cont_idusuario + 1;
    }
   
    public static int getIdpacientes() {
        return cont_idpacientes;
    }
    
    public static void aumentarIdpacientes() {
        cont_idpacientes = cont_idpacientes + 1;
    }
    
    public static int getIdentrenadores() {
        return cont_identrenadores;
    }
    
    public static void aumentarIdentrenadores() {
        cont_identrenadores = cont_identrenadores + 1;
    }
    
    public static int getIdprogramas() {
        return cont_idprogramas;
    }
    
    public static void aumentarIdprogramas() {
        cont_idprogramas = cont_idprogramas + 1;
    }
    
    public static int getIdcertificaciones() {
        return cont_idcertificaciones;
    }
    
    public static void aumentarIdcertificaciones() {
        cont_idcertificaciones = cont_idcertificaciones + 1;
    }
    
    public static int getIdtratamientos() {
        return cont_idtratamientos;
    }
    
    public static void aumentarIdtratamientos() {
        cont_idtratamientos = cont_idtratamientos + 1;
    }
}
