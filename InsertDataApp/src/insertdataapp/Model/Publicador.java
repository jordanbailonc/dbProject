package insertdataapp.Model;

import java.util.Date;
import java.util.Objects;

public class Publicador {
    //attributes
    private int id;
    private String nombre;
    private Date fecha_inicio;
    private int grupo;
    private Date fecha_bautismo;
    private boolean precursor_auxiliar;
    private boolean precursor_regular;
    private boolean ppoc;
    
    //Constructor
    public Publicador() {
    }

    public Publicador(int id, String nombre, Date fecha_inicio, int grupo, Date fecha_bautismo, boolean precursor_auxiliar, boolean precursor_regular, boolean ppoc) {
        this.id = id;
        this.nombre = nombre;
        this.fecha_inicio = fecha_inicio;
        this.grupo = grupo;
        this.fecha_bautismo = fecha_bautismo;
        this.precursor_auxiliar = precursor_auxiliar;
        this.precursor_regular = precursor_regular;
        this.ppoc = ppoc;
    }
    
    public Publicador(Publicador other){
        this.id = other.id;
        this.nombre = other.nombre;
        this.fecha_inicio = other.fecha_inicio;
        this.grupo = other.grupo;
        this.fecha_bautismo = other.fecha_bautismo;
        this.precursor_auxiliar = other.precursor_auxiliar;
        this.precursor_regular = other.precursor_regular;
        this.ppoc = other.ppoc;
    }
    
    //getters & setters
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

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public Date getFecha_bautismo() {
        return fecha_bautismo;
    }

    public void setFecha_bautismo(Date fecha_bautismo) {
        this.fecha_bautismo = fecha_bautismo;
    }

    public boolean isPrecursor_auxiliar() {
        return precursor_auxiliar;
    }

    public void setPrecursor_auxiliar(boolean precursor_auxiliar) {
        this.precursor_auxiliar = precursor_auxiliar;
    }

    public boolean isPrecursor_regular() {
        return precursor_regular;
    }

    public void setPrecursor_regular(boolean precursor_regular) {
        this.precursor_regular = precursor_regular;
    }

    public boolean isPpoc() {
        return ppoc;
    }

    public void setPpoc(boolean ppoc) {
        this.ppoc = ppoc;
    }

    //equals & hash code
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + this.id;
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + this.grupo;
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
        final Publicador other = (Publicador) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Publicador{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", fecha_inicio=").append(fecha_inicio);
        sb.append(", grupo=").append(grupo);
        sb.append(", fecha_bautismo=").append(fecha_bautismo);
        sb.append(", precursor_auxiliar=").append(precursor_auxiliar);
        sb.append(", precursor_regular=").append(precursor_regular);
        sb.append(", ppoc=").append(ppoc);
        sb.append('}');
        return sb.toString();
    }
    
    
}
