package Modelo;

import java.sql.*;

public class Programa {
    
    // Atributos de clase Programa
    private int idprogramas_cognitivos;
    private String nombre;
    private String descripcion;
    private String tipo;
    private String nivel;
    private int duracion_semanas;
    private int numero_sesiones;
    private double costo;
    private String objetivos;
    private String version;
    private Date fecha_actualizacion;
    private int entrenadores_usuario_idusuario;

    //Constructores
    public Programa() {}
    
    public Programa(String nombre, String descripcion, String tipo, String nivel, int duracion_semanas, int numero_sesiones, double costo, String objetivos, String version, Date fecha_actualizacion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.nivel = nivel;
        this.duracion_semanas = duracion_semanas;
        this.numero_sesiones = numero_sesiones;
        this.costo = costo;
        this.objetivos = objetivos;
        this.version = version;
        this.fecha_actualizacion = fecha_actualizacion;
    }

    //Getters y setters
    public int getIdprogramas_cognitivos() {
        return idprogramas_cognitivos;
    }

    public void setIdprogramas_cognitivos(int idprogramas_cognitivos) {
        this.idprogramas_cognitivos = idprogramas_cognitivos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getDuracion_semanas() {
        return duracion_semanas;
    }

    public void setDuracion_semanas(int duracion_semanas) {
        this.duracion_semanas = duracion_semanas;
    }

    public int getNumero_sesiones() {
        return numero_sesiones;
    }

    public void setNumero_sesiones(int numero_sesiones) {
        this.numero_sesiones = numero_sesiones;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Date getFecha_actualizacion() {
        return fecha_actualizacion;
    }

    public void setFecha_actualizacion(Date fecha_actualizacion) {
        this.fecha_actualizacion = fecha_actualizacion;
    }

    public int getEntrenadores_usuario_idusuario() {
        return entrenadores_usuario_idusuario;
    }

    public void setEntrenadores_usuario_idusuario(int entrenadores_usuario_idusuario) {
        this.entrenadores_usuario_idusuario = entrenadores_usuario_idusuario;
    }
    
    public void Guardar() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental","root","");
        PreparedStatement sen = con.prepareStatement("INSERT INTO programas_cognitivos VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        
        sen.setInt(1, idprogramas_cognitivos);
        sen.setString(2, nombre);
        sen.setString(3, descripcion);
        sen.setString(4, tipo);
        sen.setString(5, nivel);
        sen.setInt(6, duracion_semanas);
        sen.setInt(7, numero_sesiones);
        sen.setDouble(8, costo);
        sen.setString(9, objetivos);
        sen.setString(10, version);
        sen.setDate(11, fecha_actualizacion);
        sen.setInt(12, entrenadores_usuario_idusuario);
        
        sen.executeUpdate();
    }
    
    public boolean Buscar() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental","root","");
        PreparedStatement sql = con.prepareStatement("SELECT * FROM programas_cognitivos WHERE idprogramas_cognitivos=?");
        
        sql.setInt(1, idprogramas_cognitivos);
        ResultSet rs = sql.executeQuery();
        
        if(rs.next()) {
            idprogramas_cognitivos = rs.getInt("idprogramas_cognitivos");
            nombre = rs.getString("nombre");
            descripcion = rs.getString("descripcion");
            tipo = rs.getString("tipo");
            nivel = rs.getString("nivel");
            duracion_semanas = rs.getInt("duracion_semanas");
            costo = rs.getDouble("costo");
            objetivos = rs.getString("objetivos");
            version = rs.getString("version");
            fecha_actualizacion = rs.getDate("fecha_actualizacion");
            entrenadores_usuario_idusuario = rs.getInt("entrenadores_usuario_idusuario");
            numero_sesiones = rs.getInt("numero_sesiones");
            
            if(version.equals("Eliminada")) {
                return false;
            }else{
                return true;
            }
        }else {
            return false;
        }
    }

    public boolean Buscar_entrenador() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental","root","");
        PreparedStatement sql = con.prepareStatement("SELECT * FROM programas_cognitivos WHERE idprogramas_cognitivos=? AND entrenadores_usuario_idusuario=?");
        
        sql.setInt(1, idprogramas_cognitivos);
        sql.setInt(2, entrenadores_usuario_idusuario);
        ResultSet rs = sql.executeQuery();
        
        if(rs.next()) {
            idprogramas_cognitivos = rs.getInt("idprogramas_cognitivos");
            nombre = rs.getString("nombre");
            descripcion = rs.getString("descripcion");
            tipo = rs.getString("tipo");
            nivel = rs.getString("nivel");
            duracion_semanas = rs.getInt("duracion_semanas");
            costo = rs.getDouble("costo");
            objetivos = rs.getString("objetivos");
            version = rs.getString("version");
            fecha_actualizacion = rs.getDate("fecha_actualizacion");
            entrenadores_usuario_idusuario = rs.getInt("entrenadores_usuario_idusuario");
            
            if(version.equals("Eliminada")) {
                return false;
            }else{
                return true;
            }
        }else {
            return false;
        }
    }
    
    public void Actualizar() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental","root","");
        PreparedStatement sen = con.prepareStatement("UPDATE programas_cognitivos SET nombre=?, descripcion=?, tipo=?, nivel=?, duracion_semanas=?, numero_sesiones=?, costo=?, objetivos=?, version=?, fecha_actualizacion=? WHERE idprogramas_cognitivos=?");

        sen.setString(1, nombre);
        sen.setString(2, descripcion);
        sen.setString(3, tipo);
        sen.setString(4, nivel);
        sen.setInt(5, duracion_semanas);
        sen.setInt(6, numero_sesiones);
        sen.setDouble(7, costo);
        sen.setString(8, objetivos);
        sen.setString(9, version);
        sen.setDate(10, fecha_actualizacion);
        sen.setInt(11, idprogramas_cognitivos);

        sen.executeUpdate();
    }
    
    public void Borrar() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental","root","");
        PreparedStatement sql = con.prepareStatement("DELETE FROM programas_cognitivos WHERE idprogramas_cognitivos=?");
        
        sql.setInt(1, idprogramas_cognitivos);
        sql.executeUpdate();
    }
    
    //Metodo para mostrar cuando el usuario actual es admin
    public ResultSet Mostrar_admin() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental","root","");
        PreparedStatement sql = con.prepareStatement("SELECT * FROM programas_cognitivos WHERE version <> 'Eliminada'");
        
        ResultSet res = sql.executeQuery();
        return res;
    }
    
    //Metodo para mostra cuando el usuario actual es entrenador
    public ResultSet Mostrar_entrenador(int id_entrenador) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental","root","");
        PreparedStatement sql = con.prepareStatement(
        "SELECT DISTINCT pc.*\n" +
        "FROM programas_cognitivos pc\n" +
        "JOIN asigna_ejecuta ae\n" +
        "  ON pc.idprogramas_cognitivos = ae.programas_cognitivos_idprogramas_cognitivos\n" +
        "WHERE ae.entrenadores_usuario_idusuario = ? AND pc.version <> 'Eliminada'");
        
        sql.setInt(1, id_entrenador);
        ResultSet res = sql.executeQuery();
        return res;
    }
}
