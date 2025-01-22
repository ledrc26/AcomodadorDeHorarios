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
public class RangoHoras
{

    private LocalTime inicio;
    private LocalTime fin;

    public RangoHoras(LocalTime inicio, LocalTime fin)
    {
        if (inicio.isAfter(fin))
        {
            throw new IllegalArgumentException("El tiempo de inicio no puede ser después del tiempo de fin");
        }
        this.inicio = inicio;
        this.fin = fin;
    }

    /**
     * @return the inicio
     */
    public LocalTime getInicio()
    {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(LocalTime inicio)
    {
        this.inicio = inicio;
    }

    /**
     * @return the fin
     */
    public LocalTime getFin()
    {
        return fin;
    }

    /**
     * @param fin the fin to set
     */
    public void setFin(LocalTime fin)
    {
        this.fin = fin;
    }

    public boolean chocaCon(RangoHoras otro)
    {
        return this.inicio.isBefore(otro.fin) && this.fin.isAfter(otro.inicio);
    }
}
