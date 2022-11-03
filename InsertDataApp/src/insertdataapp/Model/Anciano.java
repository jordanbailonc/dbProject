package insertdataapp.Model;

import java.util.Date;
import java.util.Objects;

public class Anciano {
    private int id;
    private String nombre;
    private Date fecha_inicio;
    private int responsable_grupo;
    private String responsable;

    public Anciano() {
    }

    public Anciano(int id, String nombre, Date fecha_inicio, int responsable_grupo, String responsable) {
        this.id = id;
        this.nombre = nombre;
        this.fecha_inicio = fecha_inicio;
        this.responsable_grupo = responsable_grupo;
        this.responsable = responsable;
    }
    
    public Anciano(Anciano other){
        this.id = other.id;
        this.nombre = other.nombre;
        this.fecha_inicio = other.fecha_inicio;
        this.responsable_grupo =other.responsable_grupo;
        this.responsable = other.responsable;
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

    public int getResponsable_grupo() {
        return responsable_grupo;
    }

    public void setResponsable_grupo(int responsable_grupo) {
        this.responsable_grupo = responsable_grupo;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.id;
        hash = 47 * hash + Objects.hashCode(this.nombre);
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
        final Anciano other = (Anciano) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Anciano{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", fecha_inicio=").append(fecha_inicio);
        sb.append(", responsable_grupo=").append(responsable_grupo);
        sb.append(", responsable=").append(responsable);
        sb.append('}');
        return sb.toString();
    }
    
    
}
