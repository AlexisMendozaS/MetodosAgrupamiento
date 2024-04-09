
public class distanciaminima {

    public Coordenadas(int x, int y)
            {
                int x; 
                int y;
                this.x = x; 
                this.y =y; 
            }
    public static void main(String[] args) {
            Scanner leer=new Scanner(System.in); 
            Lectura leer=new Lectura(); 
            System.out.println("Ingrese la los objetos de la Clase 1 "); 
            System.out.println("(x,y)"); 

             
            Coordenada[] coordenada = new Coordenadas[3]; 

            Coordenada[0] coordenada = new Coordenadas[1,3];
            Coordenada[1] coordenada = new Coordenadas[2,3];
            Coordenada[2] coordenada = new Coordenadas[3,3];

             for (Coordenada c : coordenadas) 
            {
                 System.out.println(c);
            }
}

}