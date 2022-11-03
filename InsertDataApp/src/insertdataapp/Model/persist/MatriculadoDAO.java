package insertdataapp.Model.persist;

import java.util.HashMap;
import java.util.Map;

public class MatriculadoDAO {
    
    private Map<String,String> consultas;
    
    public MatriculadoDAO(){
        this.consultas = new HashMap<>();
        initConsultas();
    }

    private void initConsultas() {
        consultas.put("","");
    }
    
}
