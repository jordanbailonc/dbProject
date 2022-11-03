package insertdataapp.Model;

import java.util.Objects;

public class Matriculado extends User{
    private int id;
    private String nombre;
    private boolean lectura;
    private boolean conversacion;
    private boolean discurso;
    private boolean preferencia_conversar;
    private boolean preferencia_baja;

    //Getters & setters
    public int MatriculaGetId() {
        return id;
    }

    public void MatriculaSetId(int id) {
        this.id = id;
    }

    public String MatriculaGetNombre() {
        return nombre;
    }

    public void MatriculaSetNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isLectura() {
        return lectura;
    }

    public void setLectura(boolean lectura) {
        this.lectura = lectura;
    }

    public boolean isConversacion() {
        return conversacion;
    }

    public void setConversacion(boolean conversacion) {
        this.conversacion = conversacion;
    }

    public boolean isDiscurso() {
        return discurso;
    }

    public void setDiscurso(boolean discurso) {
        this.discurso = discurso;
    }

    public boolean isPreferencia_conversar() {
        return preferencia_conversar;
    }

    public void setPreferencia_conversar(boolean preferencia_discursar) {
        this.preferencia_conversar = preferencia_discursar;
    }

    public boolean isPreferencia_baja() {
        return preferencia_baja;
    }

    public void setPreferencia_baja(boolean preferencia_baja) {
        this.preferencia_baja = preferencia_baja;
    }

    //Constructor
    public Matriculado() {
    }

    public Matriculado(int id, String nombre, boolean lectura, boolean conversacion, boolean discurso, boolean preferencia_discursar, boolean preferencia_baja) {
        this.id = id;
        this.nombre = nombre;
        this.lectura = lectura;
        this.conversacion = conversacion;
        this.discurso = discurso;
        this.preferencia_conversar = preferencia_discursar;
        this.preferencia_baja = preferencia_baja;
    }
    
    public Matriculado (Matriculado other){
        this.id = other.id;
        this.nombre = other.nombre;
        this.lectura = other.lectura;
        this.conversacion = other.conversacion;
        this.discurso = other.discurso;
        this.preferencia_conversar = other.preferencia_conversar;
        this.preferencia_baja = other.preferencia_baja;
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final Matriculado other = (Matriculado) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Matriculado{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", lectura=").append(lectura);
        sb.append(", conversacion=").append(conversacion);
        sb.append(", discurso=").append(discurso);
        sb.append(", preferencia_conversar=").append(preferencia_conversar);
        sb.append(", preferencia_baja=").append(preferencia_baja);
        sb.append('}');
        return sb.toString();
    }
}
