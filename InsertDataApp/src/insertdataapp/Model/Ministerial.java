package insertdataapp.Model;

import java.util.Date;
import java.util.Objects;

public class Ministerial {
    //attributes
    private int id;
    private String nombre;
    private Date fecha_inicio;
    private int auxiliar_grupo;

    //Constructor
    public Ministerial() {
    }

    public Ministerial(int id, String nombre, Date fecha_inicio, int auxiliar_grupo) {
        this.id = id;
        this.nombre = nombre;
        this.fecha_inicio = fecha_inicio;
        this.auxiliar_grupo = auxiliar_grupo;
    }
    
    public Ministerial(Ministerial other){
        this.id = other.id;
        this.nombre = other.nombre;
        this.fecha_inicio = other.fecha_inicio;
        this.auxiliar_grupo = other.auxiliar_grupo;
    }

    //Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(Date fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public int getAuxiliar_grupo() {
        return auxiliar_grupo;
    }

    public void setAuxiliar_grupo(int auxiliar_grupo) {
        this.auxiliar_grupo = auxiliar_grupo;
    }

    //equals & hash code
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.id;
        hash = 71 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ministerial other = (Ministerial) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ministerial{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", fecha_inicio=").append(fecha_inicio);
        sb.append(", auxiliar_grupo=").append(auxiliar_grupo);
        sb.append('}');
        return sb.toString();
    }
    
}
