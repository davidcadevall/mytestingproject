package MyTestingProject.Modelo;


public class TableroTDD {
	int tablero[][]=null;
	int horizontal;
	int vertical;
	boolean created= true;


	public TableroTDD(int horizontal,int vertical,boolean aleatorio, int totalMinas) {
	if(horizontal==99||vertical==99 || horizontal<3|| vertical<3 ) {
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
		
		int ntminas=0;
		CasillaTableroTDD cT = new ValorTDD();
		
	
		for(int j=0;j<horizontal;j++)
			for (int i=0;i<vertical;i++)
				tablero [j][i]=0;
		
		do  {  
				
			ntminas=llenarTablero(aleatorio,ntminas,cT);
       			
	   		}while (ntminas<=totalMinas);
	 
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
	
	public int llenarTablero(boolean aleatorio,int ntminas,CasillaTableroTDD cT) {
		
		double w=0;
		double z=0;
		if(aleatorio==true) {
			
			w=Math.random()*horizontal;
    		z=Math.random()*vertical;  
       		w=(int)w;
       		z=(int)z;
       		if  (z!=0 && w!=0 && z!=horizontal-1 && w!=vertical-1){
         	tablero[(int)w][(int) z ]=1;
          	ntminas++;
          	
       		}
		}	
		if(aleatorio==false) {
			w= cT.getValor();
			z= cT.getValor();
			tablero[(int)w][(int) z ]=1;

		
			tablero[2][1]=1;
			tablero[3][1]=1;
			tablero[4][1]=1;
			tablero[0][1]=1;
			tablero[0][0]=1;
			tablero[1][0]=1;
			tablero[2][0]=1;
			tablero[3][0]=1;
			tablero[4][0]=1;
			
			ntminas=10+1;
			
	    }
		return ntminas;
	}
		  
}