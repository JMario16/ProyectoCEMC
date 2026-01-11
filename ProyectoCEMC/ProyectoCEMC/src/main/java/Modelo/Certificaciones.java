package Modelo;
import java.sql.*;

/* Autores:
 * Jose Mario Peña Ledesma
 * Omar Balderas Cabral 
 * Froy Martinez Fernandez
 * Jeffrey Dasaev Rivas Delgado
 */
public class Certificaciones {
    //Atributos de la clase certificaciones
    private int idcertificaciones;
    private String certificaciones;
    private int entrenadores_usuario_idusuario;
    
    //Constructores

    public Certificaciones() {
    }

    public Certificaciones(String certificaciones) {
        this.certificaciones = certificaciones;
    }
    
    //Getters y setters

    public int getIdcertificaciones() {
        return idcertificaciones;
    }

    public void setIdcertificaciones(int idcertificaciones) {
        this.idcertificaciones = idcertificaciones;
    }

    public String getCertificaciones() {
        return certificaciones;
    }

    public void setCertificaciones(String certificaciones) {
        this.certificaciones = certificaciones;
    }

    public int getEntrenadores_usuario_idusuario() {
        return entrenadores_usuario_idusuario;
    }

    public void setEntrenadores_usuario_idusuario(int entrenadores_usuario_idusuario) {
        this.entrenadores_usuario_idusuario = entrenadores_usuario_idusuario;
    }
    
    public void Guardar() throws SQLException{
        Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental","root","");
        PreparedStatement Sen = CON.prepareStatement("INSERT INTO certificaciones VALUES (?, ?, ?)");
        Sen.setInt(1, idcertificaciones);
        Sen.setString(2, certificaciones);
        Sen.setInt(3, entrenadores_usuario_idusuario);
        Sen.executeUpdate();
    }
    
    public boolean Buscar() throws SQLException{
        Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental","root","");
        PreparedStatement SQL = CON.prepareStatement("SELECT * FROM certificaciones WHERE idcertificaciones = ? AND entrenadores_usuario_idusuario");
        SQL.setInt(1, idcertificaciones);
        SQL.setInt(2, entrenadores_usuario_idusuario);
        ResultSet RS = SQL.executeQuery();
        if (RS.next()){
            idcertificaciones = RS.getInt("idcertificaciones");
            certificaciones = RS.getString("certificaciones");
            entrenadores_usuario_idusuario = RS.getInt("entrenadores_usuario_idusuario");
            return true;
        } else {
            return false;
        }
    }
    
    public void Actualizar() throws SQLException{
        Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental","root","");
        PreparedStatement Sen = CON.prepareStatement("UPDATE certificaciones SET certificaciones = ? WHERE idcertificaciones = ? AND entrenadores_usuario_idusuario = ?");
        Sen.setString(1, certificaciones);
        Sen.setInt(2, idcertificaciones);
        Sen.setInt(3, entrenadores_usuario_idusuario);
        Sen.executeUpdate();
    }
    
    public void Borrar() throws SQLException{
        Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental","root","");
        PreparedStatement Sen = CON.prepareStatement("DELETE FROM certificaciones WHERE entrenadores_usuario_idusuario=?");
        Sen.setInt(1, entrenadores_usuario_idusuario);
        Sen.executeUpdate();
    }
    
    public ResultSet Mostrar() throws SQLException{
        Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental","root","");
        PreparedStatement SQL = CON.prepareStatement("SELECT * FROM certificaciones");
        ResultSet Res = SQL.executeQuery();
        return Res;
    }
    
    public ResultSet Mostrar_entrenador() throws SQLException{
        Connection CON = DriverManager.getConnection("jdbc:mysql://localhost:3306/centro_mental","root","");
        PreparedStatement SQL = CON.prepareStatement("SELECT * FROM certificaciones WHERE entrenadores_usuario_idusuario=?");
        SQL.setInt(1, entrenadores_usuario_idusuario);
        ResultSet Res = SQL.executeQuery();
        return Res;
    }
}