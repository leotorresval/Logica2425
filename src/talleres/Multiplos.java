package talleres;

public class Multiplos {
    public static void main(String[] args) {
        int acu=0, i=1;
        while(i<=5){
            if(i%3==0 )
                acu+=i;
            if(i%5==0 )
                acu+=i;
            i++;
        }
        System.out.println("Acumulacion: "+acu);
    }
}
