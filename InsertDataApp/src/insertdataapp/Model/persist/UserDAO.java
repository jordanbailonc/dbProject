
package insertdataapp.Model.persist;

import insertdataapp.Model.User;
import java.util.HashMap;
import java.util.Map;
import java.sql.*;

public class UserDAO {
    private Map<String,String> consultas;

    public UserDAO() {
        this.consultas = new HashMap<>();
        initConsultas();
    }
    
    private String obtenerQuery(String queryName){
        return consultas.getOrDefault(queryName, "");
    }

    private void initConsultas() {
        consultas.put("listarTodos", "select * from usuario");
        consultas.put("listarPorID", "select * from usuario where id = ?");
        consultas.put("listarPorNombre", "select * from usuario where nombre like ?");
        consultas.put("listarPorCorreo", "select * from usuario where correo like ?");
        consultas.put("añadirUsuario", "insert into usuario values (null, ?, ?, ?)");
        consultas.put("modificarUsuario", "update usuario set nombre = ?, correo = ?, contraseña = ? where id = ?");
        consultas.put("borrarUsuario", "delete from usuario where id = ?");
    }
    
    private User resultsetToUser(ResultSet resultSet)throws SQLException{
        User result = null;
        int id = resultSet.getInt("id");
        String name = resultSet.getString("nombre");
        String correo = resultSet.getString("correo");
        String contra = resultSet.getString("contraseña");
        result = new User(id, name, correo,contra);
        return result;
    }
    
    public User listarPorID(int id){
        User result = null;
        try{
            DBConnect db = new DBConnect();
            Connection conn = db.getConnection();
            if(conn !=null){
                String consulta = obtenerQuery("listarPorID");
                PreparedStatement st = conn.prepareStatement(consulta);
                st.setInt(1, id);
                ResultSet rs = st.executeQuery();
                rs.next();
                result = resultsetToUser(rs);
            }
        }catch(SQLException | ClassNotFoundException e){
            result = null;
        }
        return result;
    }
    
}
