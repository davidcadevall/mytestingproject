package MyTestingProject.Modelo;

public class Tablero {
	int tablero[][];
	int horizontal;
	int vertical;
	boolean created= true;
	public static final int   MAX_VALUE = 0x7fffffff;
	public Tablero() {}
	public Tablero(int horizontal,int vertical) {
	if(horizontal==MAX_VALUE||vertical==MAX_VALUE || horizontal<0||vertical<0) {
		created=false;
	    System.out.println("Tamaño invalido de tablero");
	}
	
	int size_array =horizontal*vertical;
	if(size_array>=99*99|| size_array <=9) {
		
		created=false;
	    System.out.println("Tamaño invalido de tablero");
	}
	if(created==true) {
		this.horizontal=horizontal;
		this.vertical=vertical;
		
		tablero= new int[horizontal][vertical];
		
		double w=0;
		double z=0;
		
		int ntminas=0;
		
		
		
		
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

	
	
}	
	public int [][] getTablero(){
		return tablero;
	}
	public int  getHorizontal(){
		return horizontal;
	}
	public int getVertical(){
		return vertical;
	}
	public boolean getCreated(){
		return created;
	}
		
		  
}
