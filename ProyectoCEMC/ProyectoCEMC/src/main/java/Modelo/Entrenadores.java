package Modelo;

import java.sql.*;

public class Entrenadores extends Usuario {

    // Atributos de clase Entrenadores
    private String especialidad;

    // Constructores
    public Entrenadores() {
    }

    public Entrenadores(String especialidad, String nombre, String ap_paterno, String ap_materno, String correo,
            String telefono, String direccion, String usuario, String contrasena, String pregunta_recuperacion,
            String respuesta_recuperacion, String rol) {
        super(nombre, ap_paterno, ap_materno, correo, telefono, direccion, usuario, contrasena, pregunta_recuperacion,
                respuesta_recuperacion, rol);
        this.especialidad = especialidad;
    }

    // Getters y Setters
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getUsuario_idusuario() {
        return idusuario;
    }

    public void setUsuario_idusuario(int usuario_idusuario) {
        this.idusuario = usuario_idusuario;
    }

    public void Guardar_entrenador() throws SQLException {
        int id = super.Guardar(); // Guarda en usuario
        this.idusuario = id; // Usa el mismo ID
        Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental", "root", "");
        PreparedStatement Sen = CON
                .prepareStatement("INSERT INTO entrenadores (especialidad, usuario_idusuario) VALUES (?, ?)");

        Sen.setString(1, especialidad);
        Sen.setInt(2, idusuario);

        Sen.executeUpdate();
    }

    @Override
    public boolean Buscar() throws SQLException {
        if (super.Buscar()) {
            return Buscar_entrenador();
        }
        return false;
    }

    @Override
    public boolean BuscarPorUsuario() throws SQLException {
        if (super.BuscarPorUsuario()) {
            return Buscar_entrenador();
        }
        return false;
    }

    public boolean Buscar_entrenador() throws SQLException {
        Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental", "root", "");
        PreparedStatement SQL = CON.prepareStatement("SELECT * FROM entrenadores WHERE usuario_idusuario = ?");

        SQL.setInt(1, idusuario);
        ResultSet RS = SQL.executeQuery();

        if (RS.next()) {
            especialidad = RS.getString("especialidad");
            idusuario = RS.getInt("usuario_idusuario");
            return true;
        } else {
            return false;
        }
    }

    public boolean ActualizarEntrenador() {
        try {
            Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental", "root", "");

            PreparedStatement Sen = CON.prepareStatement(
                    "UPDATE entrenadores SET especialidad=? WHERE usuario_idusuario=?");

            Sen.setString(1, especialidad);
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
        PreparedStatement Sen = CON.prepareStatement("DELETE FROM entrenadores WHERE usuario_idusuario = ?");

        Sen.setInt(1, idusuario);
        Sen.executeUpdate();
    }

    // Cuando el usuario sea admin
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
                        + "estatus,"
                        + "fecha_registro,"
                        + "especialidad "
                        + "FROM usuario JOIN entrenadores "
                        + "ON (usuario.idusuario = entrenadores.usuario_idusuario)");

        ResultSet Res = SQL.executeQuery();
        return Res;
    }

    // Cuando el usuario sea paciente
    public ResultSet Mostrar_paciente(int idusuario) throws SQLException {
        Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental", "root", "");
        PreparedStatement SQL = CON.prepareStatement(
                "SELECT idusuario, \n" +
                        "nombre,\n" +
                        "ap_paterno,\n" +
                        "ap_materno,\n" +
                        "correo,\n" +
                        "telefono,\n" +
                        "direccion,\n" +
                        "usuario,\n" +
                        "usuario.estatus,\n" +
                        "fecha_registro,\n" +
                        "especialidad\n" +
                        "FROM usuario JOIN entrenadores\n" +
                        "ON (usuario.idusuario = entrenadores.usuario_idusuario)\n" +
                        "JOIN asigna_ejecuta \n" +
                        "ON (entrenadores.usuario_idusuario = asigna_ejecuta.entrenadores_usuario_idusuario)\n" +
                        "JOIN pacientes\n" +
                        "ON (pacientes.usuario_idusuario = asigna_ejecuta.pacientes_usuario_idusuario)\n" +
                        "WHERE asigna_ejecuta.pacientes_usuario_idusuario = ?");
        SQL.setInt(1, idusuario);
        ResultSet Res = SQL.executeQuery();
        return Res;
    }
}