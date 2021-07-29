
package grafos;

import java.util.*;
public class Djikstra
{
	int[] prev;
	int[] distancia;
	public Djikstra(Grafo g,Vertice inicial)
	{
		distancia = new int[g.GetVertices().size()];
		prev = new int[g.GetVertices().size()];
		for(int i = 0; i< g.GetVertices().size() ;i++)
		{
			distancia[i] = 1200000000;
			prev[i] = -1;
		}
		Queue<Vertice> q = new LinkedList<Vertice>();
		q.add(inicial);
		int pos = g.GetVertices().indexOf(inicial);
		distancia[pos] = 0;
		
		while(q.isEmpty() == false)
		{
			Vertice v = q.poll();
				for(Vertice v2 : g.GetVertices()) // v2 recorre en orden los vertices {1,2,3,4,5}
				{	
					// v2 = 1 
					for (Arista e : g.GetArista()) // recorremos todas las aristas buscando al vertice v como origen 
					{
						if( v == e.getOrigen() && v2 == e.getDestino() ) // v2 es el destino -> nos garantiza (v,v2) es una arista , v2 esta en orden
						{	

							int alt = distancia[g.GetVertices().indexOf(v)] + e.getDistancia();
								if(alt < distancia[g.GetVertices().indexOf(v2)])
									{
										
										distancia[g.GetVertices().indexOf(v2)] = alt;
										prev[g.GetVertices().indexOf(v2)] = g.GetVertices().indexOf(v);
										q.add(v2); // agregamos a la cola
									}
								}
							}
						}
					}
}
	
	public String print( int destino ,Grafo g,String resultado)
	{
   		if( prev[ destino ] != -1 )    //si aun poseo un vertice previo
   			resultado += print(prev[destino],g,resultado);  //recursivamente sigo explorando
   		return resultado + ">" + g.GetVertices().get(destino).toString();
   	}

	public String printDistancia(int destino)
	{
			return "Distancia minima :" + distancia[destino] +"km";
	}
}
	