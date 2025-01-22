/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adh;

import java.util.ArrayList;

/**
 *
 * @author ledrc
 */
public class Grupo
{
    private String grupo;
    private ArrayList<RangoHoras> horasClasse;
    private ArrayList<Dias> dias;
    private String profesor;

    public Grupo(String grupo, ArrayList<RangoHoras> horasClasse, ArrayList<Dias> dias, String profesor)
    {
        this.grupo = grupo;
        this.horasClasse = horasClasse;
        this.dias = dias;
        this.profesor = profesor;
    }

    public String getGrupo()
    {
        return grupo;
    }

    public ArrayList<RangoHoras> getHorasClasse()
    {
        return horasClasse;
    }

    public ArrayList<Dias> getDias()
    {
        return dias;
    }

    public void setGrupo(String grupo)
    {
        this.grupo = grupo;
    }

    public void setHorasClasse(ArrayList<RangoHoras> horasClasse)
    {
        this.horasClasse = horasClasse;
    }

    public void setDias(ArrayList<Dias> dias)
    {
        this.dias = dias;
    }

    public String getProfesor()
    {
        return profesor;
    }

    public void setProfesor(String profesor)
    {
        this.profesor = profesor;
    }
    
    public boolean chocaCon (Grupo grupo)
    {
        for (int i = 0; i < dias.size(); i++)
        {
            for (int j = 0; j < grupo.dias.size(); j++)
            {
                if (dias.get(i) == grupo.dias.get(j))
                {
                    if(horasClasse.get(i).chocaCon(grupo.getHorasClasse().get(j)))
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
