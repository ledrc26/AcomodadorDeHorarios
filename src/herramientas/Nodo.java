/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herramientas;

/**
 *
 * @author LIPIM
 */
public class Nodo <T>
{
    private T obj;
    private String etiqueta;
    private Nodo<T> siguiente;

    public Nodo(T obj, String etiqueta)
    {
        this.obj = obj;
        this.etiqueta = etiqueta;
        this.siguiente = null;
    }

    public Nodo()
    {
    }

    @Override
    public String toString()
    {
        return "Nodo{" + "et=" + etiqueta + '}';
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
     * @return the et
     */
    public String getEtiqueta()
    {
        return etiqueta;
    }

    /**
     * @param et the et to set
     */
    public void setEt(String etiqueta)
    {
        this.etiqueta = etiqueta;
    }

    /**
     * @return the sig
     */
    public Nodo getSiguiente()
    {
        return siguiente;
    }

    /**
     * @param sig the sig to set
     */
    public void setSiguiente(Nodo siguiente)
    {
        this.siguiente = siguiente;
    }
    
    
}
