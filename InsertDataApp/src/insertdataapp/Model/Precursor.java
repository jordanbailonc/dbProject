package insertdataapp.Model;

import java.util.Date;
import java.util.Objects;

public class Precursor {
    private int id;
    private String nombre;
    private Date fecha_inicio;
    private boolean continuo;
    private String ultima_escuela;

    public Precursor() {
    }

    public Precursor(int id, String nombre, Date fecha_inicio, boolean continuo, String ultima_escuela) {
        this.id = id;
        this.nombre = nombre;
        this.fecha_inicio = fecha_inicio;
        this.continuo = continuo;
        this.ultima_escuela = ultima_escuela;
    }
    
    public Precursor(Precursor other){
        this.id = other.id;
        this.nombre = other.nombre;
        this.fecha_inicio = other.fecha_inicio;
        this.continuo = other.continuo;
        this.ultima_escuela = other.ultima_escuela;
    }
    
    //getter & setter
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

    public boolean isContinuo() {
        return continuo;
    }

    public void setContinuo(boolean continuo) {
        this.continuo = continuo;
    }

    public String getUltima_escuela() {
        return ultima_escuela;
    }

    public void setUltima_escuela(String ultima_escuela) {
        this.ultima_escuela = ultima_escuela;
    }

    //equals & hash code
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.id;
        hash = 37 * hash + Objects.hashCode(this.nombre);
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
        final Precursor other = (Precursor) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Precursor{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", fecha_inicio=").append(fecha_inicio);
        sb.append(", continuo=").append(continuo);
        sb.append(", ultima_escuela=").append(ultima_escuela);
        sb.append('}');
        return sb.toString();
    }
    
    
}
