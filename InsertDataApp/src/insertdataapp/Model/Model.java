package insertdataapp.Model;

import insertdataapp.Model.persist.MatriculadoDAO;
import insertdataapp.Model.persist.UserDAO;

public class Model {
    
    private final UserDAO userDao;
    private final MatriculadoDAO matriculadoDao;
    
    public Model(){
        userDao = new UserDAO();
        matriculadoDao = new MatriculadoDAO();
    }
    
    public User buscarUsuarioPorId(int id){
        return userDao.listarPorID(id);
    }
    
}
