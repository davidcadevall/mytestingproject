package MyTestingProject;

public class Tablero {
	int tablero[][];
public Tablero() {
	int horizontal=8;
	int vertical=8;
	
	tablero= new int[horizontal][vertical];
	
	double w=0;
	double z=0;
	
	int ntminas=0;
	
	
	int tminas = 2;
	
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
 
	
}	
	public int [][] getTablero(){
		return tablero;
	}
		  
}
