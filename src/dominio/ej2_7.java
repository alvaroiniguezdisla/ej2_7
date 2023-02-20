package dominio;

public class ej2_7 {

    public static int sumapares(int n) {

        if(n%2!=0) {
            n=n-1;
        }

        if(n==0) {
            return n;



        }else {
            return n+sumapares(n-2);
        }

    }


}




