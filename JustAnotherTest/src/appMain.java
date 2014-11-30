
public class appMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Esto es solo una prueba de como se integra GitHub & Eclipse");
		System.out.println("Ya realice mi primer cambio");
		
		System.out.println("Yuju!!!!");
		System.out.println("Y si señores!!!!");
		
		
		DBconn_JavaMySQL DBConnect = new DBconn_JavaMySQL();
		
		DBConnect.getData();
		
	}
	
	static void ConstructGraph(int n)
	{
		double xPos[] = new double [n];
		double yPos[] = new double [n];
		
		//Creación de los nodos
		for (int i=0; i<n; i++){
			xPos[i]=(100*Math.random());
			yPos[i]=(100*Math.random());
		}
		
		// Creación de los Arcos 
		for (int i=0; i<n; i++){
			for (int j=0; j<n; j++){
				if(i!=j){
					if(Math.random()>0.1){
						// Se crea el arco
						
					}
					
				}
			}		
		}
		
		
	}

}
