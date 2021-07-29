
package grafos;

import java.util.ArrayList;

public class Grafo
{
    private ArrayList<Vertice> vertices;
    private ArrayList<Arista> aristas ; 
    public Grafo()
    {
        vertices = new ArrayList<Vertice>();
        aristas = new ArrayList<Arista>();
    }
    public void AddVertice(Vertice v) 
    {
        vertices.add(v);
    }
    public void AddArista(Arista e)
    {
        aristas.add(e);
    }
    public ArrayList<Vertice> GetVertices()
    {
        return vertices;
    } 
    public ArrayList<Arista> GetArista()
    {
        return aristas;
    }
 
    public String toString() 
    {
        String mostrarvertices = " ";
        for (Vertice v : vertices)
        {
            mostrarvertices += v.toString() + " , ";
        }
        String mostrararistas = " ";
        for (Arista e : aristas )
        {
            mostrararistas+= e.toString()+","; 
        }
        return "\nVertices : " + mostrarvertices + "\n" + "Aristas:" + mostrararistas;
    }
}
