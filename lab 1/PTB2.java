import java.util.Scanner;
public class PTB2{
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Nhap he so a: ");
        float a = PTB2.scanner.nextFloat();
        System.out.print("Nhap he so b: ");
        float b = PTB2.scanner.nextFloat();
        System.out.print("Nhap he so c: ");
        float c = PTB2.scanner.nextFloat();
        PTB2.Giai(a,b,c);
    }
    public static void Giai(float a, float b, float c){
        if(a == 0){
            if(b == 0 && c == 0){
                System.out.println("PT VSN");
            }
            else if(b == 0 && c != 0){
                System.out.println("PT VN");
            }
            else{
                System.out.println("PT co 1 no: x = " + (-c/b));
            }
        }
        else{
            float delta = b*b - 4*a*c;
            if(delta < 0){
                System.out.println("PT VN");
            }
            else if(delta == 0){
                System.out.println("PT co no kep: x = " + (-b/2*a));
            }
            else{
                System.out.println("PT co 2 no pb: " + "x1 = " + (-b + Math.sqrt(delta))/2*a + " x2 = " + (-b - Math.sqrt(delta))/2*a);
            }
        }
    }
}