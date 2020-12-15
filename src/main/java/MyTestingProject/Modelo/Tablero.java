package MyTestingProject.Modelo;

public class Tablero {
	int tablero[][];
	int horizontal;
	int vertical;
	boolean created= true;

	public Tablero(int horizontal,int vertical, MyRandom myr, int totalMinas) {
	if(horizontal==99||vertical==99 || horizontal<3|| vertical<3 ) {
		created=false;
	    System.out.println("Tama�o invalido de tablero");
	}
	
	int size_array =horizontal*vertical;
	if(size_array>=99*99|| size_array <=9) {
		
		created=false;
	    System.out.println("Tama�o invalido de tablero");
	}
	if(created==true) {
		this.horizontal=horizontal;
		this.vertical=vertical;
		
		tablero= new int[horizontal][vertical];
		
		double w=0;
		double z=0;
		int ntminas=0;
		
	
		CasillaTablero cT = new Valor();
	
		for(int j=0;j<horizontal;j++)
			for (int i=0;i<vertical;i++)
				tablero [j][i]=0;
		
		do  {  
				
				if(myr.getRandom() == true) {
					
					w=Math.random()*horizontal;
		    		z=Math.random()*vertical;  
		       		w=(int)w;
		       		z=(int)z;
		       		if  (z!=0 && w!=0 && z!=horizontal-1 && w!=vertical-1){
		         	tablero[(int)w][(int) z ]=1;
		          	ntminas++;
		          	
		       		}
				}	
				if(myr.getRandom() == false) {
					w= cT.getValor();
					z= cT.getValor();
					/*
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
					*/
					/*
						This code simulates a mock object using the same concept as the programmers of the original code
						We want to test opening the four corners with mines surrounding them in different positions
						Game to test:
							TC_CornerMine_01
							TC_CornerMine_02
							TC_CornerMine_03
							TC_CornerMine_04
							
							TC_MiddleMine_01
							TC_MiddleMine_02							
					*/
					
					//Open 0,0 with a mine on the right (Playing we should open the position 1,1)
					tablero[0][1]=1;
					
					//Open 0,7 with a mine down below (Playing we should open the position 1,8)
					tablero[1][7]=1;
					
					//Open 7,0 with a diagonal right mine (Playing we should open the position 1,8)
					tablero[6][1]=1;
					
					//Open 7,7 with a mine on the left (Playing we should open the position 8,8)
					tablero[7][6]=1;
					
					//Open 3,2 with 2 surrounding mines -> TC_MiddleMine_01
					tablero[2][1]=1;					
					tablero[2][2]=1;
					
					//Open 3,5 with 3 surrounding mines -> TC_MiddleMine_02
					tablero[4][4]=1;
					tablero[3][6]=1;
					tablero[4][6]=1;
					
					//value to make 10 mines
					tablero[7][3]=1;
					
					ntminas=11;
					
					/*
						This code simulates a mock object using the same concept as the programmers of the original code
						We want to test opening the four corners with mines surrounding them in different positions
						Game to test:
							TC_MiddleMine_03							
					*/
					/*
					//Open 3,2 with 7 surrounding mines
					tablero[2][1]=1;
					tablero[2][2]=1;
					tablero[2][3]=1;
					tablero[3][1]=1;
					tablero[3][3]=1;
					tablero[4][1]=1;
					tablero[4][2]=1;
					
					//value to make 10 mines
					tablero[7][3]=1;
					tablero[7][4]=1;
					tablero[7][5]=1;
					ntminas=11;
					*/
					/*
					This code simulates a mock object using the same concept as the programmers of the original code
					We want to test opening the four corners with mines surrounding them in different positions
					Game to test:
						TC_MiddleMine_04							
					*/
				
					//Open 3,2 with 8 surrounding mines
					/*
					tablero[2][1]=1;
					tablero[2][2]=1;
					tablero[2][3]=1;
					tablero[3][1]=1;
					tablero[3][3]=1;
					tablero[4][1]=1;
					tablero[4][2]=1;
					tablero[4][3]=1;
					
					//value to make 10 mines
					tablero[7][3]=1;
					tablero[7][4]=1;
					ntminas=11;
					*/
			    }
       			
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
		
		  
}