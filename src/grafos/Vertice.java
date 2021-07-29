
package grafos;

public class Vertice 
{
    private String vertice;

    public Vertice(String vertice)
    {
        this.vertice = vertice;
    }
    
    public String getvertice() 
    {
        return vertice;
    }
 
    public void setvertice(String vertice) 
    {
        this.vertice = vertice;
    }
 
    @Override
    public String toString() 
    {
        return vertice;
    }
}
