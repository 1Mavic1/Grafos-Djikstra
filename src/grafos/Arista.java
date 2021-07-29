package grafos;

public class Arista 
{
    private Vertice origen;
    private Vertice destino;
    private int distancia;

    public Arista(Vertice origen, Vertice destino,int distancia) 
    {
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
    }
 
    public Vertice getOrigen() 
    {
        return origen;
    }
 
    public void setOrigen(Vertice origen) 
    {
        this.origen = origen;
    }
 
    public Vertice getDestino() 
    {
        return destino;
    }
 
    public void setDestino(Vertice destino) 
    {
        this.destino = destino;
    }

    public int getDistancia()
    {
        return distancia;
    }
    public void setDistancia(int distancia)
    {
        this.distancia = distancia;
    }
 
    @Override
    public String toString() 
    {
        return "{"+ origen +"," +destino+ "," + distancia+"km}";
    }
 
}
