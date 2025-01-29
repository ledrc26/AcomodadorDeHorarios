/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herramientas;

import java.util.ArrayList;

/**
 *
 * @author ledrc
 */
public class Multilista <T>
{
    private NodoLista<T> raiz;

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
    
    public NodoLista inserta(NodoLista raiz, NodoLista nodo, ArrayList<String> etiquetas, int nivel)
    {
        if (nivel == etiquetas.size() - 1)
        {
            ListaDLC obj = new ListaDLC();
            obj.setRaiz(raiz);
            obj.insertar(nodo);
            return obj.getRaiz();
        } else
        {
            NodoLista aux = ListaDLC.busca(raiz, etiquetas.get(nivel));
            if (aux != null)
            {
                aux.setAbajo(inserta(aux.getAtras(), nodo, etiquetas, nivel + 1));
                if (nodo.getArriba() == null)
                {
                    nodo.setArriba(aux);
                }
            }
            return raiz;
        }
    }
    
    public void elimina(NodoLista r, String s[], int nivel, NodoLista n[])
    {
        if (nivel == s.length - 1)
        {
            ListaDLC obj = new ListaDLC();
            obj.setRaiz(r);
            n[1] = obj.eliminar(s[nivel]);
            n[0] = obj.getRaiz();
        } else
        {
            NodoLista aux = ListaDLC.busca(r, s[nivel]);
            if (aux != null)
            {
                elimina(aux.getAbajo(), s, nivel+1, n);
                aux.setAbajo(n[0]);
            }
            n[0] = r;
        }
    }
}
