package objetoNegocio;

import java.util.List;
import objetoServicio.Fecha;

/**
 *
 * @author Carlos Eduardo
 */
public class Comunidad {
    
    public String nombre, descripcion,propietario;
    public List<Usuario> Usuarios;
    public Fecha Actividad;
    public List<Evento> Eventos;
    public List<Publicacion> Publicaciones;

    public Comunidad(String nombre, String descripcion, String propietario, List<Usuario> Usuarios, Fecha Actividad, List<Evento> Eventos, List<Publicacion> Publicaciones) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.propietario = propietario;
        this.Usuarios = Usuarios;
        this.Actividad = Actividad;
        this.Eventos = Eventos;
        this.Publicaciones = Publicaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public List<Usuario> getUsuarios() {
        return Usuarios;
    }

    public void setUsuarios(List<Usuario> Usuarios) {
        this.Usuarios = Usuarios;
    }

    public Fecha getActividad() {
        return Actividad;
    }

    public void setActividad(Fecha Actividad) {
        this.Actividad = Actividad;
    }

    public List<Evento> getEventos() {
        return Eventos;
    }

    public void setEventos(List<Evento> Eventos) {
        this.Eventos = Eventos;
    }

    public List<Publicacion> getPublicaciones() {
        return Publicaciones;
    }

    public void setPublicaciones(List<Publicacion> Publicaciones) {
        this.Publicaciones = Publicaciones;
    }

    @Override
    public String toString() {
        return "Comunidad{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", propietario=" + propietario + ", Usuarios=" + Usuarios + ", Actividad=" + Actividad + ", Eventos=" + Eventos + ", Publicaciones=" + Publicaciones + '}';
    }
    
    
   
}
