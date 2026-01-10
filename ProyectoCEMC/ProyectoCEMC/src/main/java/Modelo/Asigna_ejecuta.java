package Modelo;

import java.sql.*;

public class Asigna_ejecuta {

    // Atributos de la clase Asigna_ejecuta
    private int programas_cognitivos_idprogramas_cognitivos;
    private int pacientes_usuario_idusuario;
    private int entrenadores_usuario_idusuario;
    private Date fecha_pago;
    private Double monto_pago;
    private String metodo_pago;
    private String estatus_pago;
    private String folio;
    private String observaciones;
    private Date fecha_inicio;
    private Date fecha_fin;
    private String estatus;

    // Constructores
    public Asigna_ejecuta() {
    }

    public Asigna_ejecuta(String metodo_pago, String estatus, String estatus_pago, String folio, String observaciones,
            int programas_cognitivos_idprogramas_cognitivos, int pacientes_usuario_idusuario,
            int entrenadores_usuario_idusuario, double monto_pago, Date fecha_pago, Date fecha_inicio, Date fecha_fin) {
        this.metodo_pago = metodo_pago;
        this.estatus = estatus;
        this.estatus_pago = estatus_pago;
        this.folio = folio;
        this.observaciones = observaciones;
        this.programas_cognitivos_idprogramas_cognitivos = programas_cognitivos_idprogramas_cognitivos;
        this.pacientes_usuario_idusuario = pacientes_usuario_idusuario;
        this.entrenadores_usuario_idusuario = entrenadores_usuario_idusuario;
        this.monto_pago = monto_pago;
        this.fecha_pago = fecha_pago;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    public Asigna_ejecuta(int programas_cognitivos_idprogramas_cognitivos, int pacientes_usuario_idusuario,
            int entrenadores_usuario_idusuario) {
        this.programas_cognitivos_idprogramas_cognitivos = programas_cognitivos_idprogramas_cognitivos;
        this.pacientes_usuario_idusuario = pacientes_usuario_idusuario;
        this.entrenadores_usuario_idusuario = entrenadores_usuario_idusuario;
    }

    // Getters y Setters
    public int getProgramas_cognitivos_idprogramas_cognitivos() {
        return programas_cognitivos_idprogramas_cognitivos;
    }

    public void setProgramas_cognitivos_idprogramas_cognitivos(int programas_cognitivos_idprogramas_cognitivos) {
        this.programas_cognitivos_idprogramas_cognitivos = programas_cognitivos_idprogramas_cognitivos;
    }

    public int getPacientes_usuario_idusuario() {
        return pacientes_usuario_idusuario;
    }

    public void setPacientes_usuario_idusuario(int pacientes_usuario_idusuario) {
        this.pacientes_usuario_idusuario = pacientes_usuario_idusuario;
    }

    public int getEntrenadores_usuario_idusuario() {
        return entrenadores_usuario_idusuario;
    }

    public void setEntrenadores_usuario_idusuario(int entrenadores_usuario_idusuario) {
        this.entrenadores_usuario_idusuario = entrenadores_usuario_idusuario;
    }

    public Date getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(Date fecha_pago) {
        this.fecha_pago = fecha_pago;
    }

    public Double getMonto_pago() {
        return monto_pago;
    }

    public void setMonto_pago(Double monto_pago) {
        this.monto_pago = monto_pago;
    }

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

    public String getEstatus_pago() {
        return estatus_pago;
    }

    public void setEstatus_pago(String estatus_pago) {
        this.estatus_pago = estatus_pago;
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }

    public void Guardar() throws SQLException {
        Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental", "root", "");
        PreparedStatement Sen = CON
                .prepareStatement("INSERT INTO asigna_ejecuta values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

        Sen.setInt(1, programas_cognitivos_idprogramas_cognitivos);
        Sen.setInt(2, pacientes_usuario_idusuario);
        Sen.setInt(3, entrenadores_usuario_idusuario);
        Sen.setDate(4, fecha_pago);
        Sen.setDouble(5, monto_pago);
        Sen.setString(6, metodo_pago);
        Sen.setString(7, estatus_pago);
        Sen.setString(8, folio);
        Sen.setString(9, observaciones);
        Sen.setDate(10, fecha_inicio);
        Sen.setDate(11, fecha_fin);
        Sen.setString(12, estatus);

        Sen.executeUpdate();
    }

    public boolean Buscar() throws SQLException {
        Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental", "root", "");
        PreparedStatement SQL = CON.prepareStatement(
                "SELECT * FROM asigna_ejecuta where programas_cognitivos_idprogramas_cognitivos = ? AND pacientes_usuario_idusuario = ? AND entrenadores_usuario_idusuario = ?");

        SQL.setInt(1, programas_cognitivos_idprogramas_cognitivos);
        SQL.setInt(2, pacientes_usuario_idusuario);
        SQL.setInt(3, entrenadores_usuario_idusuario);
        ResultSet RS = SQL.executeQuery();

        if (RS.next()) {
            metodo_pago = RS.getString("metodo_pago");
            estatus_pago = RS.getString("estatus_pago");
            folio = RS.getString("folio");
            observaciones = RS.getString("observaciones");
            estatus = RS.getString("estatus");
            fecha_pago = RS.getDate("fecha_pago");
            fecha_inicio = RS.getDate("fecha_inicio");
            fecha_fin = RS.getDate("fecha_fin");
            pacientes_usuario_idusuario = RS.getInt("pacientes_usuario_idusuario");
            programas_cognitivos_idprogramas_cognitivos = RS.getInt("programas_cognitivos_idprogramas_cognitivos");
            entrenadores_usuario_idusuario = RS.getInt("entrenadores_usuario_idusuario");
            monto_pago = RS.getDouble("monto_pago");

            return true;
        } else {
            return false;
        }
    }

    public boolean Buscar_paciente_entrenador() throws SQLException {
        Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental", "root", "");
        PreparedStatement SQL = CON.prepareStatement(
                "SELECT * FROM asigna_ejecuta where pacientes_usuario_idusuario = ? AND entrenadores_usuario_idusuario = ?");

        SQL.setInt(1, pacientes_usuario_idusuario);
        SQL.setInt(2, entrenadores_usuario_idusuario);
        ResultSet RS = SQL.executeQuery();

        if (RS.next()) {
            metodo_pago = RS.getString("metodo_pago");
            estatus_pago = RS.getString("estatus_pago");
            folio = RS.getString("folio");
            observaciones = RS.getString("observaciones");
            estatus = RS.getString("estatus");
            fecha_pago = RS.getDate("fecha_pago");
            fecha_inicio = RS.getDate("fecha_inicio");
            fecha_fin = RS.getDate("fecha_fin");
            pacientes_usuario_idusuario = RS.getInt("pacientes_usuario_idusuario");
            programas_cognitivos_idprogramas_cognitivos = RS.getInt("programas_cognitivos_idprogramas_cognitivos");
            entrenadores_usuario_idusuario = RS.getInt("entrenadores_usuario_idusuario");
            monto_pago = RS.getDouble("monto_pago");

            return true;
        } else {
         return Re    }

    public void Actualizar() throws SQLException {
        Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental", "root", "");
        PreparedStatement Sen = CON.prepareStatement(
                "UPDATE asigna_ejecuta SET fecha_fin = ?, fecha_inicio = ?, estatus = ?, fecha_pago =  ?, monto_pago = ?, metodo_pago = ?, estatus_pago = ?, folio = ?, observaciones = ? WHERE programas_cognitivos_idprogramas_cognitivos = ? AND pacientes_usuario_idusuario = ? AND entrenadores_usuario_idusuario = ?");

        Sen.setDate(4, fecha_pago);
        Sen.setString(6, metodo_pago);
        Sen.setString(3, estatus);
        Sen.setString(7, estatus_pago);
        Sen.setString(8, folio);
        Sen.setString(9, observaciones);
        Sen.setDate(2, fecha_inicio);
        Sen.setDate(1, fecha_fin);
        Sen.setDouble(5, monto_pago);
        Sen.setInt(11, pacientes_usuario_idusuario);
        Sen.setInt(10, programas_cognitivos_idprogramas_cognitivos);
        Sen.setInt(12, entrenadores_usuario_idusuario);
        Sen.executeUpdate();
    }

    public void Borrar() throws SQLException {
        Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental", "root", "");
        PreparedStatement Sen = CON.prepareStatement(
                "DELETE FROM asigna_ejecuta where programas_cognitivos_idprogramas_cognitivos = ? AND pacientes_usuario_idusuario = ? AND entrenadores_usuario_idusuario = ?");

        Sen.setInt(2, pacientes_usuario_idusuario);
        Sen.setInt(1, programas_cognitivos_idprogramas_cognitivos);
        Sen.setInt(3, entrenadores_usuario_idusuario);
        Sen.executeUpdate();
    }

    public ResultSet Mostrar() throws SQLException {
        Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental", "root", "");
        PreparedStatement SQL = CON.prepareStatement("SELECT * FROM asigna_ejecuta");

        ResultSet Res = SQL.executeQuery();
        return Res;
    }
}