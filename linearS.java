import java.util.Scanner;
/**
 * linearS
 */
public class linearS {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the size of array that you want to make:");
        int s=scan.nextInt();
        int a[]=new  int[s];
        System.out.println("enter the array:");
        for(int i=0;i<s;i++){
            a[i]=scan.nextInt();
        }
        System.out.println("enter the new element whos index you want to search:");
        int e=scan.nextInt();
        int index=-1;
        for(int i=0;i<s;i++){
            if(a[i]==e){
                index=i;
                break;
            }
        }
        if(index==-1){
            System.out.println("element not found!");
        }else{
            System.out.println("index="+i);
        }
    }
}
/* output
enter the size of array that you want to make:
5
enter the array:
1 2 3 4 5
enter the new element whos index you want to search:
2
index=1
*/