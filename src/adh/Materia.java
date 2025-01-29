/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adh;

import herramientas.ColaCD;
import java.util.ArrayList;

/**
 *
 * @author ledrc
 */
public class Materia implements Cloneable
{
    private String nombre;
    private ColaCD<Grupo> grupos;
    private boolean optativa;

    public Materia(String nombre, ColaCD<Grupo> grupos, boolean optativa)
    {
        this.nombre = nombre;
        this.grupos = grupos;
        this.optativa = optativa;
    }

    /**
     * @return the nombre
     */
    public String getNombre()
    {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * @return the grupos
     */
    public ColaCD<Grupo> getGrupos()
    {
        return grupos;
    }

    /**
     * @param grupos the grupos to set
     */
    public void setGrupos(ColaCD<Grupo> grupos)
    {
        this.grupos = grupos;
    }

    /**
     * @return the optativa
     */
    public boolean isOptativa()
    {
        return optativa;
    }

    /**
     * @param optativa the optativa to set
     */
    public void setOptativa(boolean optativa)
    {
        this.optativa = optativa;
    }
    
    
    

    @Override
    public String toString()
    {
        return "Materia{" + "nombre=" + nombre + ", grupos=" + grupos + ", optativa=" + optativa + '}';
    }
    
    
}
