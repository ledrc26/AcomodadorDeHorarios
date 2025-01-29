/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herramientas;

/**
 *
 * @author PC
 */
public class ColaCD <T>
{
    private Nodo<T> atras = null;
    
    public boolean vacia()
    {
        return atras==null;
    }

    public boolean llena()
    {
        return false;
    }

    public boolean inserta(Nodo<T> nodo)
    {
        if (nodo == null)
        {
            System.out.println("Cola llena o no se puede insertar el objeto");
            return false;
        }
        if (atras == null)
        {
            atras = nodo;
            atras.setSiguiente(nodo);
            return true;
        }
        nodo.setSiguiente(atras.getSiguiente());
        atras.setSiguiente(nodo);
        atras = nodo;
        return true;
    }

    public Nodo<T> elimina()
    {
        if (vacia())
        {
            System.out.println("Cola vacia");
            return null;
        }
        Nodo nodo = atras.getSiguiente();
        if (atras == nodo)
        {
            atras = null;
        } else
        {
            atras.setSiguiente(nodo.getSiguiente());
        }
        nodo.setSiguiente(null);
        return nodo;
    }

    /**
     * @return the a
     */
    public Nodo<T> getAtras()
    {
        return atras;
    }

    /**
     * @param a the a to set
     */
    public void setAtras(Nodo<T> atras)
    {
        this.atras = atras;
    }
    
}
