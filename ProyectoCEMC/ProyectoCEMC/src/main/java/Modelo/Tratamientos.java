package Modelo;
import java.sql.*;

/* Autores:
 * Jose Mario Peña Ledesma
 * Omar Balderas Cabral 
 * Froy Martinez Fernandez
 * Jeffrey Dasaev Rivas Delgado
 */
public class Tratamientos {
    //Atributos de la clase tratamientos
    private int idtratamientos;
    private String medicacion;
    private String descripcion;
    private int pacientes_usuario_idusuario;

    //Constructores
    public Tratamientos() {
    }

    public Tratamientos(String medicacion, String descripcion) {
        this.medicacion = medicacion;
        this.descripcion = descripcion;
    }
    
    //Getters y Setters

    public int getIdtratamientos() {
        return idtratamientos;
    }

    public void setIdtratamientos(int idtratamientos) {
        this.idtratamientos = idtratamientos;
    }

    public String getMedicacion() {
        return medicacion;
    }

    public void setMedicacion(String medicacion) {
        this.medicacion = medicacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPacientes_usuario_idusuario() {
        return pacientes_usuario_idusuario;
    }

    public void setPacientes_usuario_idusuario(int pacientes_usuario_idusuario) {
        this.pacientes_usuario_idusuario = pacientes_usuario_idusuario;
    }
    
    public void Guardar() throws SQLException{
        Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental","root","");
        PreparedStatement Sen = CON.prepareStatement("INSERT INTO tratamientos (medicacion, descripcion, pacientes_usuario_idusuario) VALUES (?, ?, ?)");
        Sen.setString(1, medicacion);
        Sen.setString(2, descripcion);
        Sen.setInt(3, pacientes_usuario_idusuario);
        Sen.executeUpdate();
    }
    
    public boolean Buscar() throws SQLException{
        Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental","root","");
        PreparedStatement SQL = CON.prepareStatement("SELECT * FROM tratamientos WHERE idtratamientos = ? AND pacientes_usuario_idusuario = ?");
        SQL.setInt(1, idtratamientos);
        SQL.setInt(2, pacientes_usuario_idusuario);
        ResultSet RS = SQL.executeQuery();
        if(RS.next()){
            idtratamientos = RS.getInt("idtratamientos");
            medicacion = RS.getString("medicacion");
            descripcion = RS.getString("descripcion");
            pacientes_usuario_idusuario = RS.getInt("pacientes_usuario_idusuario");
            return true;
        } else {
            return false;
        }
    }
    
    public void Actualizar() throws SQLException{
        Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental","root","");
        PreparedStatement Sen = CON.prepareStatement("UPDATE tratamientos SET medicacion = ?, descripcion = ? WHERE idtratamientos = ?");
        Sen.setString(1, medicacion);
        Sen.setString(2, descripcion);
        Sen.setInt(3, idtratamientos);
        Sen.executeUpdate();
    }
    
    public void Borrar() throws SQLException{
        Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental","root","");
        PreparedStatement Sen = CON.prepareStatement("DELETE FROM tratamientos WHERE idtratamiento = ? AND pacientes_usuario_idusuario = ?");
        Sen.setInt(1, idtratamientos);
        Sen.setInt(2, pacientes_usuario_idusuario);
        Sen.executeUpdate();
    }
    
    public ResultSet Mostrar() throws SQLException{
        Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental","root","");
        PreparedStatement SQL = CON.prepareStatement("SELECT * FROM tratamientos");
        ResultSet Res = SQL.executeQuery();
        return Res;
    }

    public ResultSet Mostrar_paciente() throws SQLException{
        Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental","root","");
        PreparedStatement SQL = CON.prepareStatement("SELECT * FROM tratamientos WHERE pacientes_usuario_idusuario=?");
        SQL.setInt(1, pacientes_usuario_idusuario);
        ResultSet Res = SQL.executeQuery();
        return Res;
    }
}
