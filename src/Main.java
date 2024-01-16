import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float grades[] = new float[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your 10 grades:");
        for(int i = 0;i<10;i++){
            grades[i] = scanner.nextInt();;
        }

        float min = grades[0], max = grades[0], sum = grades[0];
        for (int i = 1;i<10;i++){
            if(min > grades[i]){
                min = grades[i];
            }
            if(max < grades[i]){
                max = grades[i];
            }
            sum += grades[i];
        }
        System.out.println("Grade average = "+(sum/10));
        System.out.println("Highest Grade = "+max);
        System.out.println("Lowest Grade = "+min);


    }

}