package MyTestingProject;

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.util.*;

public class Buscaminas{
	public static boolean coorvalidas(int x, int y, int minas, int intentos) {
		boolean valid=false;
		if (minas < x*y &&intentos < x+y) {
			valid=true;
		}
		return valid;
		
	}
	public static void main(String[] args){
		Scanner leer = new Scanner (System.in);
		int horizontal=0;
				
		int vertical=0;
		int intentos=0;
		int minas=0;
		do {
			
			horizontal= leer.nextInt();
			vertical= leer.nextInt();
			
		}while(coorvalidas(horizontal,vertical,intentos, minas));
		
		int tablero [][]= new int[horizontal][vertical];
		
		double w=0;
  		double z=0;
		
		int ntminas=0;
		
		int intento=75;
		
		int tminas=2;
		
		for(int j=0;j<horizontal;j++)
			for (int i=0;i<vertical;i++)
				tablero [j][i]=0;
		
		do  {  
     			w=Math.random()*horizontal;
        		z=Math.random()*vertical;  
           		w=(int)w;
           		z=(int)z;
           		if  (z!=0 && w!=0 && z!=horizontal-1 && w!=vertical-1){
             	tablero[(int)w][(int) z ]=1;
              	ntminas++;
           			}
       		}while (ntminas<=10);
       
     
       	System.out.println("\n-x----------------------------------------------------x-");
       	System.out.println("  Ingresa las coordenas entre "+horizontal+ " y "+ vertical);
       	do {
       		int x=0,y=0;
       		int nminas = 0;
       		
       		do{
       			 System.out.println("\n-x----------------------------------------------------x-");
       			 System.out.println("\n	Intento :"+intento+" , Cual es su coordenada? \n");
       			 System.out.print("		Fila:  ");
       			 x=leer.nextInt();
       			 System.out.println();
       			 System.out.print("		Columna:  ");
       			 y=leer.nextInt();
       			 
       			 if(x==0 || y==0 || x>horizontal || y>vertical)
       			 	System.out.println("\n	==>Coordenadas incorrectas<== \n");
       		}while (x==0 || y==0 || x>horizontal || y>vertical);
       		
       		x=x-1;
       		y=y-1;
       		
       		if(tablero [x][y]==0){
       			
       			if (x==0&&y==0){
       				if(x+1>=0 && x+1<horizontal && y<vertical)
       					nminas=nminas+tablero [x+1][y];
       				if(x+1>=0 && x+1<horizontal && y+1<vertical && y+1>=0)
       					nminas=nminas+tablero [x+1][y+1];
       				if(x>=0 && x<horizontal && y+1<vertical && y+1>= 0)
       					nminas=nminas+tablero [x][y+1];
       			}
       			else {
       				if(y==0){
       					if(x+1>=0 && x+1<horizontal && y<vertical)
       						nminas=nminas+tablero [x+1][y];
       					if(x-1>=0 && x-1<horizontal && y<vertical)
       						nminas=nminas+tablero [x-1][y];
       					if(x-1>=0 && x-1<horizontal && y+1<vertical && y+1>=0)
       						nminas=nminas+tablero [x-1][y+1];
       					if(x>=0 && x<horizontal && y+1<vertical && y+1>= 0)
       						nminas=nminas+tablero [x][y+1];
       					if(x+1>=0 && x+1<horizontal && y+1<vertical && y+1>=0)
       						nminas=nminas+tablero [x+1][y+1];
       					
       				}
       				
       				else{
       				
       					if(x-1>=0 && x-1<horizontal && y-1<vertical)
       						nminas=nminas+tablero [x-1][y-1];
       					if(x>=0 && x<horizontal && y-1<vertical)
       						nminas=nminas+tablero [x][y-1];
       					if(x+1>=0 && x+1<horizontal && y-1<vertical)
       						nminas=nminas+tablero [x+1][y-1];
       					if(x+1>=0 && x+1<horizontal && y<vertical)
       						nminas=nminas+tablero [x+1][y];
       					if(x-1>=0 && x-1<horizontal && y<vertical)
       						nminas=nminas+tablero [x-1][y];
       					if(x-1>=0 && x-1<horizontal && y+1<vertical && y+1>=0)
       						nminas=nminas+tablero [x-1][y+1];
       					if(x>=0 && x<horizontal && y+1<vertical && y+1>= 0)
       						nminas=nminas+tablero [x][y+1];
       					if(x+1>=0 && x+1<horizontal && y+1<vertical && y+1>=0)
       						nminas=nminas+tablero [x+1][y+1];
       					}
       			 }
       			 System.out.print("\n	Mina no encontrada. ");
       			 
       			 if(intento>tminas)
       			 	 System.out.print("	Alrededor hay: "+ nminas);
       			 System.out.println("\n	Intentos restantes: "+(intento-1));
       		}
       		else
       			{
       				tminas = tminas-1;
       				System.out.println("\n	Acertaste!, Mina Eliminada Restan "+tminas+" Minas");
       				System.out.println("\n	Intentos restantes: "+(intento-1));
       			}
       	
          intento=intento-1;
      }while (intento>=tminas && intento>0 && tminas>0);	
 	   
       	if(tminas==0)
       		System.out.println("		GANASTE!");
       	
       	if(tminas>intento)
       		System.out.println("		PERDISTE!    (Exceso de minas restantes "+tminas+")\n\n");
       	
       	if(intento==0)
       		System.out.println("		PERDISTE!");
 	   }
}