 public class moneda{
public static void main(String[] args){
/*        double moneda = (Math.random()*20);{

        if (moneda>=.5){
            System.out.println("cara");
        }
    
        else
        {
            System.out.println("cruz");
        }
    }
}
}
*/
//System.out.println((Math.random()>=.5)?"muy bien!":"______");

int opcion =2;
int a=5, b = 7,c;
switch(opcion){
case 1: c= a+b;
    System.out.println("la suma de a y b es "+c);
    break;
case 2: c= a*b;
    System.out.println("la multiplicacion de a y b es "+c);
    break;
case 3: c= a/b;
    System.out.println("la division de a y b es "+c);
    break;
}
}
}