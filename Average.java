import java.io.*;
import java.util.Scanner;

class Numbers{
    public static int avg(int x,int y,int z){
        int avg=(x+y+z)/3;
        return avg;
    }

}
public class Average {
    public static void main(String[] args) {
Numbers obj=new Numbers();
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        System.out.println("The averagae of three numbers given by user is ");
        int res=obj.avg(x,y,z);
        System.out.println(res);

    }
}
