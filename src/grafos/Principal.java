/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor Manuel
 */
public class Principal {
    public static void main(String args[])
    {
        
        Ventana f = new Ventana();
        f.setVisible(true);
        JOptionPane.showMessageDialog(null,"Bienvenido");
        
        ArrayList<String> ciudades = new ArrayList<>();
        ciudades.add("MONTERREY");
        ciudades.add("ZACATECAS");
        ciudades.add("GUADALAJARA");
        ciudades.add("GUANAJUATO");
        ciudades.add("SANTIAGO DE QUERETARO");
        ciudades.add("MORELIA");
        ciudades.add("CIUDAD DE MEXICO");
        ciudades.add("PUEBLA");
        ciudades.add("XALAPA ENRIQUEZ");
        ciudades.add("OXACA DE JUAREZ");
        ciudades.add("MERIDA");
        ciudades.add("CHIAPAS");
     
        
		Grafo g = new Grafo();
		
		Vertice monterrey = new Vertice(ciudades.get(0));
		Vertice zacatecas = new Vertice(ciudades.get(1));
		Vertice guadalajara = new Vertice(ciudades.get(2));
		Vertice guanajuato = new Vertice(ciudades.get(3));
		Vertice queretaro = new Vertice(ciudades.get(4));
		Vertice morelia = new Vertice(ciudades.get(5));
		Vertice ciudademex = new Vertice(ciudades.get(6));
		Vertice puebla = new Vertice(ciudades.get(7));
		Vertice xalapa = new Vertice(ciudades.get(8));
		Vertice oxaca = new Vertice(ciudades.get(9));
		Vertice merida = new Vertice(ciudades.get(10));
		Vertice chiapas = new Vertice(ciudades.get(11));
		
		Arista e1 = new Arista(monterrey,zacatecas,466);
		Arista e2 = new Arista(monterrey,guanajuato,684);
		Arista e3 = new Arista(monterrey,xalapa,931);
		Arista e4 = new Arista(monterrey,merida,1998);
		Arista e5 = new Arista(zacatecas,monterrey,466);
		Arista e6 = new Arista(zacatecas,guadalajara,340);
		Arista e7 = new Arista(zacatecas,guanajuato,299);
		Arista e8 = new Arista(zacatecas,queretaro,407);
		Arista e9 = new Arista(guadalajara,zacatecas,340);
		Arista e10 = new Arista(guadalajara,guanajuato,274);
		Arista e11 = new Arista(guadalajara,morelia,288);
		Arista e12 = new Arista(guanajuato,monterrey,684);
		Arista e13 = new Arista(guanajuato,zacatecas,299);
		Arista e14 = new Arista(guanajuato,guadalajara,274);
		Arista e15 = new Arista(guanajuato,morelia,175);
		Arista e16 = new Arista(guanajuato,queretaro,148);
		Arista e17 = new Arista(queretaro,zacatecas,407);
		Arista e18 = new Arista(queretaro,guanajuato,148);
		Arista e19 = new Arista(queretaro,ciudademex,213);
		Arista e20 = new Arista(queretaro,puebla ,333);
		Arista e21 = new Arista(queretaro,xalapa,463);
		Arista e22 = new Arista(morelia,guadalajara,288);
		Arista e23 = new Arista(morelia,guanajuato,175);
		Arista e24 = new Arista(morelia,ciudademex,175);
		Arista e25 = new Arista(ciudademex,queretaro,213);
		Arista e26 = new Arista(ciudademex,morelia,299);
		Arista e27 = new Arista(ciudademex,puebla,135);
		Arista e28 = new Arista(ciudademex,xalapa,282);
		Arista e29 = new Arista(puebla,ciudademex,135);
		Arista e30 = new Arista(puebla,xalapa,170);
		Arista e31 = new Arista(puebla,oxaca,337);
		Arista e32 = new Arista(puebla,merida,1193);
		Arista e33 = new Arista(puebla,chiapas,911);
		Arista e34 = new Arista(xalapa,monterrey,931);
		Arista e35 = new Arista(xalapa,queretaro,463);
		Arista e36 = new Arista(xalapa,ciudademex,282);
		Arista e37 = new Arista(xalapa,puebla,170);
		Arista e38 = new Arista(xalapa,merida,1133);
		Arista e39 = new Arista(xalapa,chiapas,841);
		Arista e40 = new Arista(oxaca,puebla,337);
		Arista e41 = new Arista(oxaca,chiapas,735);
		Arista e42 = new Arista(merida,monterrey,1998);
		Arista e43 = new Arista(merida,puebla,1193);
		Arista e44 = new Arista(merida,xalapa,1133);
		Arista e45 = new Arista(merida,chiapas,778);
		Arista e46 = new Arista(chiapas,oxaca,735);
		Arista e47 = new Arista(chiapas,merida,778);
		
		g.AddVertice(monterrey);
		g.AddVertice(zacatecas);
		g.AddVertice(guadalajara);
		g.AddVertice(guanajuato);
		g.AddVertice(queretaro);
		g.AddVertice(morelia);
		g.AddVertice(ciudademex);
		g.AddVertice(puebla);
		g.AddVertice(xalapa);
		g.AddVertice(oxaca);
		g.AddVertice(merida);
		g.AddVertice(chiapas);
		
		g.AddArista(e1);
		g.AddArista(e2);
		g.AddArista(e3);
		g.AddArista(e4);
		g.AddArista(e5);
		g.AddArista(e6);
		g.AddArista(e7);
		g.AddArista(e8);
		g.AddArista(e9);
		g.AddArista(e10);
		g.AddArista(e11);
		g.AddArista(e12);
		g.AddArista(e13);
		g.AddArista(e14);
		g.AddArista(e15);
		g.AddArista(e16);
		g.AddArista(e17);
		g.AddArista(e18);
		g.AddArista(e19);
		g.AddArista(e20);
		g.AddArista(e21);
		g.AddArista(e22);
		g.AddArista(e23);
		g.AddArista(e24);
		g.AddArista(e25);
		g.AddArista(e26);
		g.AddArista(e27);
		g.AddArista(e28);
		g.AddArista(e29);
		g.AddArista(e30);
		g.AddArista(e31);
		g.AddArista(e32);
		g.AddArista(e33);
		g.AddArista(e34);
		g.AddArista(e35);
		g.AddArista(e36);
		g.AddArista(e37);
		g.AddArista(e38);
		g.AddArista(e39);
		g.AddArista(e40);
		g.AddArista(e41);
		g.AddArista(e42);
		g.AddArista(e43);
		g.AddArista(e44);
		g.AddArista(e45);
		g.AddArista(e46);
		g.AddArista(e47);
	//	JOptionPane.showMessageDialog(null,g.toString());
		String origen;
		do
		{
			origen = JOptionPane.showInputDialog(null,"Origen");
		}while(!ciudades.contains(origen));
		
		for(Vertice v :  g.GetVertices() )
		{
			if(v.getvertice().equals(origen))
			{
				Djikstra o = new Djikstra(g,v);
				String destino;
				do
				{
					destino= JOptionPane.showInputDialog(null,"Destino");
				}while(!ciudades.contains(destino));
				for(Vertice vf :  g.GetVertices() )
				{
					if(vf.getvertice().equals(destino))
					{
						JOptionPane.showMessageDialog(null,o.printDistancia(g.GetVertices().indexOf(vf))+ "\nRecorrido\n"+ o.print(g.GetVertices().indexOf(vf),g," "));
					}
				}
			}
		}
		
        
    }
    
}
