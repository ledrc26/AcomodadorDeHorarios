/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adh;

import java.util.Date;

/**
 *
 * @author ledrc
 */
public class Materia
{
    private String nombre;
    private String grupo;
    private Date[] horaEntrada;
    private Date[] horaSalida;
    private Dias dias[];
    private String profesor;
    private boolean optativa;

    public Materia(String nombre, String grupo, Date[] horaEntrada, Date[] horaSalida, Dias[] dias, String profesor)
    {
        this.nombre = nombre;
        this.grupo = grupo;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.dias = dias;
        this.profesor = profesor;
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
     * @return the grupo
     */
    public String getGrupo()
    {
        return grupo;
    }

    /**
     * @param grupo the grupo to set
     */
    public void setGrupo(String grupo)
    {
        this.grupo = grupo;
    }

    /**
     * @return the horaEntrada
     */
    public Date[] getHoraEntrada()
    {
        return horaEntrada;
    }

    /**
     * @param horaEntrada the horaEntrada to set
     */
    public void setHoraEntrada(Date[] horaEntrada)
    {
        this.horaEntrada = horaEntrada;
    }

    /**
     * @return the horaSalida
     */
    public Date[] getHoraSalida()
    {
        return horaSalida;
    }

    /**
     * @param horaSalida the horaSalida to set
     */
    public void setHoraSalida(Date[] horaSalida)
    {
        this.horaSalida = horaSalida;
    }

    /**
     * @return the dias
     */
    public Dias[] getDias()
    {
        return dias;
    }

    /**
     * @param dias the dias to set
     */
    public void setDias(Dias[] dias)
    {
        this.dias = dias;
    }

    /**
     * @return the profesor
     */
    public String getProfesor()
    {
        return profesor;
    }

    /**
     * @param profesor the profesor to set
     */
    public void setProfesor(String profesor)
    {
        this.profesor = profesor;
    }
    
    
}
