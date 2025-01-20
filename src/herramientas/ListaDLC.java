/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herramientas;

/**
 *
 * @author ledrc
 */
public class ListaDLC<T>
{

    private NodoLista<T> raiz;

    public ListaDLC()
    {
    }

    public ListaDLC(NodoLista<T> raiz)
    {
        this.raiz = raiz;
    }

    public boolean insertar(NodoLista<T> nodo)
    {
        if (nodo == null)
        {
            System.out.println("Lista llena o no se puede insertar el objeto");
            return false;
        }
        if (raiz == null)
        {
            raiz = nodo;
            raiz.setSiguiente(nodo);
            raiz.setAtras(nodo);
            return true;
        }
        if (raiz.getEtiqueta().compareTo(nodo.getEtiqueta()) > 0 || raiz.getAtras().getEtiqueta().compareTo(nodo.getEtiqueta()) < 0)
        {
            nodo.setSiguiente(raiz);
            nodo.setAtras(raiz.getAtras());
            raiz.getAtras().setSiguiente(nodo);
            raiz.setAtras(nodo);
            raiz = raiz.getEtiqueta().compareTo(nodo.getEtiqueta()) > 0 ? nodo : raiz;
            return true;
        }
        NodoLista aux = raiz;
        while (true)
        {
            if (aux.getSiguiente().getEtiqueta().compareTo(nodo.getEtiqueta()) >= 0)
            {
                nodo.setSiguiente(aux.getSiguiente());
                nodo.setAtras(aux);
                aux.getSiguiente().setAtras(nodo);
                aux.setSiguiente(nodo);
                return true;
            }
            aux = aux.getSiguiente();
        }
    }
    
    public NodoLista<T> eliminar(String etiqueta)
    {
        if (raiz == null)
        {
            System.out.println("Lista vacia");
            return null;
        }
        if (raiz.getAtras().getEtiqueta().compareTo(etiqueta) < 0 || raiz.getEtiqueta().compareTo(etiqueta) > 0)
        {
            System.out.println("Dato no encontrado");
            return null;
        }
        NodoLista nodo = null;
        if (raiz.getEtiqueta().equals(etiqueta))
        {
            nodo = raiz;
            raiz = nodo.getSiguiente();
            raiz.setAtras(nodo.getAtras());
            raiz.getAtras().setSiguiente(raiz);
            nodo.setSiguiente(null);
            nodo.setAtras(null);
            if (nodo == raiz)
            {
                raiz = null;
            }
            return nodo;
        }
        NodoLista aux = raiz;
        while (aux != raiz.getAtras())
        {
            if (aux.getSiguiente().getEtiqueta().equals(etiqueta))
            {
                nodo = aux.getSiguiente();
                aux.setSiguiente(nodo.getSiguiente());
                nodo.getSiguiente().setAtras(aux);
                nodo.setSiguiente(null);
                nodo.setAtras(null);
                return nodo;
            }
            if (aux.getSiguiente().getEtiqueta().compareTo(etiqueta) > 0)
            {
                return null;
            }
            aux = aux.getSiguiente();
        }
        return nodo;
    }
    
    public static NodoLista busca(NodoLista raiz, String etiqueta)
    {
        if (raiz != null)
        {
            if (raiz.getAtras().getEtiqueta().compareTo(etiqueta) < 0 || raiz.getEtiqueta().compareTo(etiqueta) > 0)
            {
                return null;
            }
            NodoLista aux = raiz;
            do
            {
                if (aux.getEtiqueta().equals(etiqueta))
                {
                    return aux;
                }
                if (aux.getEtiqueta().compareTo(etiqueta) > 0)
                {
                    return null;
                }
                aux = aux.getSiguiente();
            } while (aux != raiz);
        }
        return null;
    }

    /**
     * @return the raiz
     */
    public NodoLista<T> getRaiz()
    {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(NodoLista<T> raiz)
    {
        this.raiz = raiz;
    }

}
