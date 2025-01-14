/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adh;

import java.time.LocalTime;

/**
 *
 * @author ledrc
 */
public class Materia
{
    private String nombre;
    private String grupo;
    private LocalTime [] horaEntrada;
    private LocalTime [] horaSalida;
    private Dias dias[];
    private String profesor;
    private boolean optativa;

    public Materia(String nombre, String grupo, LocalTime [] horaEntrada, LocalTime [] horaSalida, Dias[] dias, String profesor)
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
    public LocalTime [] getHoraEntrada()
    {
        return horaEntrada;
    }

    /**
     * @param horaEntrada the horaEntrada to set
     */
    public void setHoraEntrada(LocalTime [] horaEntrada)
    {
        this.horaEntrada = horaEntrada;
    }

    /**
     * @return the horaSalida
     */
    public LocalTime [] getHoraSalida()
    {
        return horaSalida;
    }

    /**
     * @param horaSalida the horaSalida to set
     */
    public void setHoraSalida(LocalTime [] horaSalida)
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
