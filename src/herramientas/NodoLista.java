/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herramientas;

/**
 *
 * @author ledrc
 */
public class NodoLista<T>
{

    private String etiqueta;
    private T obj;
    private NodoLista siguiente;
    private NodoLista atras;
    private NodoLista arriba;
    private NodoLista abajo;

    public NodoLista(String etiqueta, T obj)
    {
        this.etiqueta = etiqueta;
        this.obj = obj;
        this.siguiente = null;
        this.atras = null;
        this.arriba = null;
        this.abajo = null;
    }

    /**
     * @return the etiqueta
     */
    public String getEtiqueta()
    {
        return etiqueta;
    }

    /**
     * @param etiqueta the etiqueta to set
     */
    public void setEtiqueta(String etiqueta)
    {
        this.etiqueta = etiqueta;
    }

    /**
     * @return the obj
     */
    public T getObj()
    {
        return obj;
    }

    /**
     * @param obj the obj to set
     */
    public void setObj(T obj)
    {
        this.obj = obj;
    }

    /**
     * @return the siguiente
     */
    public NodoLista getSiguiente()
    {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoLista siguiente)
    {
        this.siguiente = siguiente;
    }

    /**
     * @return the atras
     */
    public NodoLista getAtras()
    {
        return atras;
    }

    /**
     * @param atras the atras to set
     */
    public void setAtras(NodoLista atras)
    {
        this.atras = atras;
    }

    /**
     * @return the arriba
     */
    public NodoLista getArriba()
    {
        return arriba;
    }

    /**
     * @param arriba the arriba to set
     */
    public void setArriba(NodoLista arriba)
    {
        this.arriba = arriba;
    }

    /**
     * @return the abajo
     */
    public NodoLista getAbajo()
    {
        return abajo;
    }

    /**
     * @param abajo the abajo to set
     */
    public void setAbajo(NodoLista abajo)
    {
        this.abajo = abajo;
    }

    
}
