package Modelo;

import java.sql.*;

public class Entrenadores extends Usuario {
    
    //Atributos de clase Entrenadores
    private String especialidad;
    private int usuario_idusuario;
    
    //Constructores
    public Entrenadores() {}

    public Entrenadores(String especialidad, String nombre, String ap_paterno, String ap_materno, String correo, String telefono, String direccion, String usuario, String contrasena, String pregunta_recuperacion, String respuesta_recuperacion, String rol) {
        super(nombre, ap_paterno, ap_materno, correo, telefono, direccion, usuario, contrasena, pregunta_recuperacion, respuesta_recuperacion, rol);
        this.especialidad = especialidad;
    }

    
    //Getters y Setters
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getUsuario_idusuario() {
        return usuario_idusuario;
    }

    public void setUsuario_idusuario(int usuario_idusuario) {
        this.usuario_idusuario = usuario_idusuario;
    }
    
    public void Guardar_entrenador() throws SQLException {
        Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental","root","");
        PreparedStatement Sen = CON.prepareStatement("INSERT INTO entrenadores VALUES (?, ?)");
        
        Sen.setString(1, especialidad);
        Sen.setInt(2, usuario_idusuario);
        
        Sen.executeUpdate();
        
        
    }
    
    public boolean Buscar() throws SQLException {
        Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental","root","");
        PreparedStatement SQL = CON.prepareStatement("SELECT * FROM entrenadores WHERE usuario_idusuario = ?");
        
        SQL.setInt(1, usuario_idusuario);
        ResultSet RS = SQL.executeQuery();
        
        if (RS.next()){
            especialidad = RS.getString("especialidad");
            usuario_idusuario = RS.getInt("usuario_idusuario");
            return true;
        } else {
            return false;
        }
    }
    
    public void Actualizar() throws SQLException {
        Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental","root","");
        PreparedStatement Sen = CON.prepareStatement("UPDATE entrenadores SET especialidad = ?");
        
        Sen.setString(1,especialidad);
        
        Sen.executeUpdate();
    }
    
    public void Borrar() throws SQLException {
        Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental","root","");
        PreparedStatement Sen = CON.prepareStatement("DELETE FROM entrenadores WHERE usuario_idusuario = ?");
        
        Sen.setInt(1, usuario_idusuario);
        Sen.executeUpdate();
    }
    
    public ResultSet Mostrar_entrenadores() throws SQLException{
       Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental","root","");
       PreparedStatement SQL = CON.prepareStatement(
               "SELECT idusuario,"
                       + "nombre,"
                       + "ap_paterno,"
                       + "ap_materno,"
                       + "correo,"
                       + "telefono,"
                       + "direccion,"
                       + "usuario,"
                       + "estatus,"
                       + "fecha_registro,"
                       + "especialidad "
                       + "FROM usuario JOIN entrenadores "
                       + "ON (usuario.idusuario = entrenadores.usuario_idusuario)");
       
       ResultSet Res = SQL.executeQuery();
       return Res;
    }
}