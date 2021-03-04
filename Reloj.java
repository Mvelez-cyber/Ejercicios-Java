public class Reloj {
public static void main(String[] args)
{
 	int hora=23;
 	if (hora<=12){
	    System.out.println("Buenos dias");
	}
 	 if ((hora>12)&&(hora<=18)){
 		System.out.println("Buenas tardes");
     }
	  if ((hora>18)&&(hora<=12)){
		System.out.println("bueras noches");
	  }
	   if (hora==23){
		System.out.println("Feliz año");
	   }
}
}