package Modelo;

import java.time.*;
import java.sql.*;

/* Autores:
 * Jose Mario Peña Ledesma
 * Omar Balderas Cabral 
 * Froy Martinez Fernandez
 * Jeffrey Dasaev Rivas Delgado
 */
public class Pacientes extends Usuario {
    // Atributos de la clase pacientes
    private int usuario_idusuario;
    private int edad;
    private String genero;
    private String escolaridad;
    private String ocupacion;
    private String antecedentes_medicos;
    private String alergias;
    private String observaciones;
    private String estado_tratamiento;
    private Date fecha_ingreso;
    private int entrenadores_usuario_idusuario;

    // Constructores

    public Pacientes() {
    }

    public Pacientes(int edad, String genero, String escolaridad, String ocupacion, String antecedentes_medicos,
            String alergias, String observaciones, String estado_tratamiento, int entrenadores_usuario_idusuario,
            String nombre, String ap_paterno, String ap_materno, String correo, String telefono, String direccion,
            String usuario, String contrasena, String pregunta_recuperacion, String respuesta_recuperacion,
            String rol) {
        super(nombre, ap_paterno, ap_materno, correo, telefono, direccion, usuario, contrasena, pregunta_recuperacion,
                respuesta_recuperacion, rol);
        this.edad = edad;
        this.genero = genero;
        this.escolaridad = escolaridad;
        this.ocupacion = ocupacion;
        this.antecedentes_medicos = antecedentes_medicos;
        this.alergias = alergias;
        this.observaciones = observaciones;
        this.estado_tratamiento = estado_tratamiento;
        this.fecha_ingreso = Date.valueOf(LocalDate.now());
        this.entrenadores_usuario_idusuario = entrenadores_usuario_idusuario;
    }

    // Getters y Setters

    public int getUsuario_idusuario() {
        return usuario_idusuario;
    }

    public void setUsuario_idusuario(int usuario_idusuario) {
        this.usuario_idusuario = usuario_idusuario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEscolaridad() {
        return escolaridad;
    }

    public void setEscolaridad(String escolaridad) {
        this.escolaridad = escolaridad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getAntecedentes_medicos() {
        return antecedentes_medicos;
    }

    public void setAntecedentes_medicos(String antecedentes_medicos) {
        this.antecedentes_medicos = antecedentes_medicos;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEstado_tratamiento() {
        return estado_tratamiento;
    }

    public void setEstado_tratamiento(String estado_tratamiento) {
        this.estado_tratamiento = estado_tratamiento;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date Fecha_ingreso) {
        this.fecha_ingreso = Fecha_ingreso;
    }

    public int getEntrenadores_usuario_idusuario() {
        return entrenadores_usuario_idusuario;
    }

    public void setEntrenadores_usuario_idusuario(int entrenadores_usuario_idusuario) {
        this.entrenadores_usuario_idusuario = entrenadores_usuario_idusuario;
    }

    public void Guardar_paciente() throws SQLException {
        Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental", "root", "");
        PreparedStatement Sen = CON.prepareStatement("INSERT INTO pacientes VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ? ,?)");
        Sen.setInt(1, idusuario);
        Sen.setInt(2, edad);
        Sen.setString(3, genero);
        Sen.setString(4, escolaridad);
        Sen.setString(5, ocupacion);
        // Verificar para atributos que pueden ser null
        if (antecedentes_medicos.contains("Ingrese sus antecedentes") || antecedentes_medicos.isEmpty()) {
            Sen.setNull(6, Types.VARCHAR);
        } else {
            Sen.setString(6, antecedentes_medicos);
        }
        if (alergias.contains("Ingrese sus alergias") || alergias.isEmpty()) {
            Sen.setNull(7, Types.VARCHAR);
        } else {
            Sen.setString(7, alergias);
        }
        if (observaciones.contains("Observaciones") || observaciones.isEmpty()) {
            Sen.setNull(8, Types.VARCHAR);
        } else {
            Sen.setString(8, observaciones);
        }
        Sen.setString(9, estado_tratamiento);
        Sen.setDate(10, fecha_ingreso);
        Sen.setNull(11, java.sql.Types.INTEGER);
        Sen.executeUpdate();
    }

    @Override
    public boolean Buscar() throws SQLException {
        if (super.Buscar()) {
            return Buscar_paciente();
        }
        return false;
    }

    public boolean Buscar_paciente() throws SQLException {
        Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental", "root", "");
        PreparedStatement SQL = CON.prepareStatement("SELECT * FROM pacientes WHERE usuario_idusuario = ?");
        SQL.setInt(1, idusuario);
        ResultSet RS = SQL.executeQuery();
        if (RS.next()) {
            usuario_idusuario = RS.getInt("usuario_idusuario");
            edad = RS.getInt("edad");
            genero = RS.getString("genero");
            escolaridad = RS.getString("escolaridad");
            ocupacion = RS.getString("ocupacion");
            antecedentes_medicos = RS.getString("antecedentes_medicos");
            alergias = RS.getString("alergias");
            observaciones = RS.getString("observaciones");
            estado_tratamiento = RS.getString("estado_tratamiento");
            fecha_ingreso = RS.getDate("fecha_ingreso");
            entrenadores_usuario_idusuario = RS.getInt("entrenadores_usuario_idusuario");
            return true;
        } else {
            return false;
        }
    }

    public void Actualizar_paciente() throws SQLException {
        Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental", "root", "");
        PreparedStatement Sen = CON.prepareStatement(
                "UPDATE pacientes SET edad = ?, genero = ?, escolaridad = ?, ocupacion = ?, antecedentes_medicos = ?, alergias = ?, observaciones = ?, estado_tratamiento = ? WHERE usuario_idusuario = ?");
        Sen.setInt(1, edad);
        Sen.setString(2, genero);
        Sen.setString(3, escolaridad);
        Sen.setString(4, ocupacion);
        Sen.setString(5, antecedentes_medicos);
        Sen.setString(6, alergias);
        Sen.setString(7, observaciones);
        Sen.setString(8, estado_tratamiento);
        Sen.setInt(9, idusuario);
        Sen.executeUpdate();
    }

    public void AsignarEntrenador(int idEntrenador) throws SQLException {
        Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental", "root", "");
        PreparedStatement Sen = CON.prepareStatement(
                "UPDATE pacientes SET entrenadores_usuario_idusuario = ? WHERE usuario_idusuario = ?");
        Sen.setInt(1, idEntrenador);
        Sen.setInt(2, idusuario);
        Sen.executeUpdate();
    }

    public void Borrar_paciente() throws SQLException {
        Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental", "root", "");
        PreparedStatement Sen = CON.prepareStatement("DELETE FROM pacientes WHERE usuario_idusuario = ?");
        Sen.setInt(1, idusuario);
        Sen.executeUpdate();
    }

    public ResultSet Mostrar_admin() throws SQLException {
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
                        + "edad,"
                        + "genero,"
                        + "escolaridad,"
                        + "ocupacion,"
                        + "fecha_ingreso "
                        + "FROM usuario JOIN pacientes "
                        + "ON (usuario.idusuario = pacientes.usuario_idusuario)");
        ResultSet Res = SQL.executeQuery();
        return Res;
    }

    public ResultSet Mostrar_entrenador(int idEntrenador) throws SQLException {
        Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental", "root", "");
        PreparedStatement SQL = CON.prepareStatement(
                "SELECT idusuario, " +
                        "nombre, " +
                        "ap_paterno, " +
                        "ap_materno, " +
                        "correo, " +
                        "telefono, " +
                        "direccion, " +
                        "usuario, " +
                        "edad, " +
                        "genero, " +
                        "escolaridad, " +
                        "ocupacion, " +
                        "fecha_ingreso " +
                        "FROM usuario JOIN asigna_ejecuta " +
                        "ON (usuario.idusuario = asigna_ejecuta.pacientes_usuario_idusuario) " +
                        "JOIN pacientes ON (usuario.idusuario = pacientes.usuario_idusuario)" +
                        "WHERE asigna_ejecuta.entrenadores_usuario_idusuario = ?");
        SQL.setInt(1, idEntrenador);
        ResultSet Res = SQL.executeQuery();
        return Res;
    }
}