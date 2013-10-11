package objetoNegocio;

import java.util.List;

/**
 *
 * @author Carlos Eduardo
 */
public class Usuario {
    
    public String nombre,nicjname,contraseña,correo;
    public int tipo;
    public List<String> Afiliadas;
    public List<Integer> Preferencias;

    public Usuario(String nombre, String nicjname, String contraseña, String correo, int tipo, List<String> Afiliadas, List<Integer> Preferencias) {
        this.nombre = nombre;
        this.nicjname = nicjname;
        this.contraseña = contraseña;
        this.correo = correo;
        this.tipo = tipo;
        this.Afiliadas = Afiliadas;
        this.Preferencias = Preferencias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNicjname() {
        return nicjname;
    }

    public void setNicjname(String nicjname) {
        this.nicjname = nicjname;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public List<String> getAfiliadas() {
        return Afiliadas;
    }

    public void setAfiliadas(List<String> Afiliadas) {
        this.Afiliadas = Afiliadas;
    }

    public List<Integer> getPreferencias() {
        return Preferencias;
    }

    public void setPreferencias(List<Integer> Preferencias) {
        this.Preferencias = Preferencias;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", nicjname=" + nicjname + ", contrase\u00f1a=" + contraseña + ", correo=" + correo + ", tipo=" + tipo + ", Afiliadas=" + Afiliadas + ", Preferencias=" + Preferencias + '}';
    }
    
    
}
