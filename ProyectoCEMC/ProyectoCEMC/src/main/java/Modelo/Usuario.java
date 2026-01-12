package Modelo;

import java.time.*;
import java.sql.*;

/* Autores:
 * Jose Mario Peña Ledesma
 * Omar Balderas Cabral 
 * Froy Martinez Fernandez
 * Jeffrey Dasaev Rivas Delgado
 */
public class Usuario {
    // Atributos de clase Usuario
    protected int idusuario;
    protected String nombre;
    protected String ap_paterno;
    protected String ap_materno;
    protected String correo;
    protected String telefono;
    protected String direccion;
    protected String usuario;
    protected String contrasena;
    protected String pregunta_recuperacion;
    protected String respuesta_recuperacion;
    protected String rol;
    protected String estatus;
    protected Date fecha_registro;
    protected LocalDateTime ultimo_acceso;
    protected int intentos_fallidos;

    // Constructores
    public Usuario() {
    }

    public Usuario(String nombre, String ap_paterno, String ap_materno, String correo, String telefono,
            String direccion, String usuario, String contrasena, String pregunta_recuperacion,
            String respuesta_recuperacion, String rol) {
        this.nombre = nombre;
        this.ap_paterno = ap_paterno;
        this.ap_materno = ap_materno;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.pregunta_recuperacion = pregunta_recuperacion;
        this.respuesta_recuperacion = respuesta_recuperacion;
        this.rol = rol;
        this.estatus = "Activa";
        this.fecha_registro = Date.valueOf(LocalDate.now());
        this.ultimo_acceso = LocalDateTime.now();
        this.intentos_fallidos = 0;
    }

    // Getters y setters

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAp_paterno() {
        return ap_paterno;
    }

    public void setAp_paterno(String ap_paterno) {
        this.ap_paterno = ap_paterno;
    }

    public String getAp_materno() {
        return ap_materno;
    }

    public void setAp_materno(String ap_materno) {
        this.ap_materno = ap_materno;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getPregunta_recuperacion() {
        return pregunta_recuperacion;
    }

    public void setPregunta_recuperacion(String pregunta_recuperacion) {
        this.pregunta_recuperacion = pregunta_recuperacion;
    }

    public String getRespuesta_recuperacion() {
        return respuesta_recuperacion;
    }

    public void setRespuesta_recuperacion(String respuesta_recuperacion) {
        this.respuesta_recuperacion = respuesta_recuperacion;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public LocalDateTime getUltimo_acceso() {
        return ultimo_acceso;
    }

    public void setUltimo_acceso(LocalDateTime ultimo_acceso) {
        this.ultimo_acceso = ultimo_acceso;
    }

    public int getIntentos_fallidos() {
        return intentos_fallidos;
    }

    public void setIntentos_fallidos(int intentos_fallidos) {
        this.intentos_fallidos = intentos_fallidos;
    }

    public int Guardar() throws SQLException { // Que retorne idusuario
        Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental", "root", "");
        PreparedStatement Sen = CON.prepareStatement(
                "INSERT INTO usuario (nombre, ap_paterno, ap_materno, correo, telefono, direccion, usuario, contrasena, pregunta_recuperacion, respuesta_recuperacion, rol, estatus, fecha_registro, ultimo_acceso, intentos_fallidos) "
                        +
                        "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, now(), 0)",
                Statement.RETURN_GENERATED_KEYS);
        Sen.setString(1, nombre);
        Sen.setString(2, ap_paterno);
        Sen.setString(3, ap_materno);
        Sen.setString(4, correo);
        Sen.setString(5, telefono);
        Sen.setString(6, direccion);
        Sen.setString(7, usuario);
        Sen.setString(8, contrasena);
        Sen.setString(9, pregunta_recuperacion);
        Sen.setString(10, respuesta_recuperacion);
        Sen.setString(11, rol);
        Sen.setString(12, estatus);
        Sen.setDate(13, fecha_registro);
        // Sen.setTimestamp(14, Timestamp.valueOf(ultimo_acceso));
        // Sen.setInt(15, intentos_fallidos);
        Sen.executeUpdate();
        ResultSet rs = Sen.getGeneratedKeys();
        if (rs.next()) {
            idusuario = rs.getInt(1);
        }
        return idusuario;
    }

    public boolean Buscar() throws SQLException {
        Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental", "root", "");
        PreparedStatement SQL = CON.prepareStatement("SELECT * FROM usuario WHERE idusuario = ?");
        SQL.setInt(1, idusuario);
        ResultSet RS = SQL.executeQuery();
        if (RS.next()) {
            idusuario = RS.getInt("idusuario");
            nombre = RS.getString("nombre");
            ap_paterno = RS.getString("ap_paterno");
            ap_materno = RS.getString("ap_materno");
            correo = RS.getString("correo");
            telefono = RS.getString("telefono");
            direccion = RS.getString("direccion");
            usuario = RS.getString("usuario");
            contrasena = RS.getString("contrasena");
            pregunta_recuperacion = RS.getString("pregunta_recuperacion");
            respuesta_recuperacion = RS.getString("respuesta_recuperacion");
            rol = RS.getString("rol");
            estatus = RS.getString("estatus");
            fecha_registro = RS.getDate("fecha_registro");
            ultimo_acceso = RS.getTimestamp("ultimo_acceso").toLocalDateTime();
            intentos_fallidos = RS.getInt("intentos_fallidos");
            return true;
        } else {
            return false;
        }
    }

    public boolean Buscar_id() throws SQLException {
        Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental", "root", "");
        PreparedStatement SQL = CON.prepareStatement("SELECT * FROM usuario WHERE idusuario = ?");

        SQL.setInt(1, idusuario);
        ResultSet RS = SQL.executeQuery();

        if (RS.next()) {
            idusuario = RS.getInt("idusuario");
            nombre = RS.getString("nombre");
            ap_paterno = RS.getString("ap_paterno");
            ap_materno = RS.getString("ap_materno");
            correo = RS.getString("correo");
            telefono = RS.getString("telefono");
            direccion = RS.getString("direccion");
            usuario = RS.getString("usuario");
            contrasena = RS.getString("contrasena");
            pregunta_recuperacion = RS.getString("pregunta_recuperacion");
            respuesta_recuperacion = RS.getString("respuesta_recuperacion");
            rol = RS.getString("rol");
            estatus = RS.getString("estatus");
            fecha_registro = RS.getDate("fecha_registro");
            ultimo_acceso = RS.getTimestamp("ultimo_acceso").toLocalDateTime();
            intentos_fallidos = RS.getInt("intentos_fallidos");
            return true;
        } else {
            return false;
        }
    }

    public boolean BuscarPorUsuario() throws SQLException {
        Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental", "root", "");
        PreparedStatement SQL = CON.prepareStatement("SELECT * FROM usuario WHERE usuario = ?");
        SQL.setString(1, usuario);
        ResultSet RS = SQL.executeQuery();
        if (RS.next()) {
            idusuario = RS.getInt("idusuario");
            nombre = RS.getString("nombre");
            ap_paterno = RS.getString("ap_paterno");
            ap_materno = RS.getString("ap_materno");
            correo = RS.getString("correo");
            telefono = RS.getString("telefono");
            direccion = RS.getString("direccion");
            usuario = RS.getString("usuario");
            contrasena = RS.getString("contrasena");
            pregunta_recuperacion = RS.getString("pregunta_recuperacion");
            respuesta_recuperacion = RS.getString("respuesta_recuperacion");
            rol = RS.getString("rol");
            estatus = RS.getString("estatus");
            fecha_registro = RS.getDate("fecha_registro");
            ultimo_acceso = RS.getTimestamp("ultimo_acceso").toLocalDateTime();
            intentos_fallidos = RS.getInt("intentos_fallidos");
            
            if(estatus.equals("Eliminada")) {
                return false;
            }else{
                return true;
            }
        } else {
            return false;
        }
    }

    public boolean Actualizar() {
        try {
            Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental", "root", "");

            PreparedStatement Sen = CON.prepareStatement(
                    "UPDATE usuario SET nombre=?, ap_paterno=?, ap_materno=?, correo=?, contrasena=?, direccion=?, telefono=?, usuario=?, pregunta_recuperacion=?, respuesta_recuperacion=? WHERE idusuario=?");

            Sen.setString(1, nombre);
            Sen.setString(2, ap_paterno);
            Sen.setString(3, ap_materno);
            Sen.setString(4, correo);
            Sen.setString(5, contrasena);
            Sen.setString(6, direccion);
            Sen.setString(7, telefono);
            Sen.setString(8, usuario);
            Sen.setString(9, pregunta_recuperacion);
            Sen.setString(10, respuesta_recuperacion);
            Sen.setInt(11, idusuario);

            Sen.executeUpdate();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean Actualizar_estatus() {
        try {
            Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental", "root", "");

            PreparedStatement Sen = CON.prepareStatement(
                    "UPDATE usuario SET estatus=? WHERE idusuario=?");

            Sen.setString(1, estatus);
            Sen.setInt(2, idusuario);

            Sen.executeUpdate();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void Borrar() throws SQLException {
        Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental", "root", "");
        PreparedStatement Sen = CON.prepareStatement("DELETE FROM usuario WHERE idusuario = ?");
        Sen.setInt(1, idusuario);
        Sen.executeUpdate();
    }

    public ResultSet Mostrar() throws SQLException {
        Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental", "root", "");
        PreparedStatement SQL = CON.prepareStatement(
                "SELECT idusuario,"
                        + "nombre,"
                        + "ap_paterno,"
                        + "ap_materno,"
                        + "correo,"
                        + "telefono,"
                        + "direccion,"
                        + "usuario,"
                        + "pregunta_recuperacion,"
                        + "respuesta_recuperacion,"
                        + "rol,"
                        + "estatus,"
                        + "fecha_registro,"
                        + "ultimo_acceso "
                        + "FROM usuario "
                        + "WHERE estatus = 'Activa'");
        ResultSet Res = SQL.executeQuery();
        return Res;
    }

    public void ActualizarUltimoAcceso() throws SQLException {
        // Calcular ultimo acceso
        this.ultimo_acceso = LocalDateTime.now();
        Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental", "root", "");
        PreparedStatement Sen = CON.prepareStatement("UPDATE usuario SET ultimo_acceso = ? WHERE idusuario = ?");
        Sen.setTimestamp(1, Timestamp.valueOf(ultimo_acceso));
        Sen.setInt(2, idusuario);
        Sen.executeUpdate();
    }

    public void ActualizarIntentosFallidos() throws SQLException {
        Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental", "root", "");
        PreparedStatement Sen = CON.prepareStatement("UPDATE usuario SET intentos_fallidos = ? WHERE idusuario = ?");
        Sen.setInt(1, intentos_fallidos);
        Sen.setInt(2, idusuario);
        Sen.executeUpdate();
    }
}
