import java.util.Scanner;
public class SetBits {
    static int countSetBits(int n, int m) {
        int count = 0;
        count = count | 1 << n;
        count = count | 1 << m;
        return count;
    }
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int A= scanner.nextInt();
        int B=scanner.nextInt();
        int setBits=countSetBits(A,B);
        System.out.println(setBits);
    }
}
