import java.util.*;

public class Q104_QuizApplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String []Questions={"1. What is the capital of India?",
                            "2. Which keyword is used for creating an Object?",
                            "3. Which language is used for Android development?",
                            "4. Who developed Java?",
                            "5. Which one is used for styling?"};
        String [][]Options={
                {"A. Lucknow","B. New Delhi","C. Uttar Pradesh","D. Kanpur"},
                {"A. object","B. new","C. make","C. create"},
                {"A. Java","B. Python","C. C++","D. C"},
                {"A. Microsoft","B. Google","C. Sum Microsystem","D. Android"},
                {"A. HTML","B. CSS","C. Javascript","D. Python"}
        };
        
        char answer[]={'B','B','A','C','B'};
        int count=1;
        int score=0;
        for(int i=0;i<Questions.length;i++){
            System.out.printf("\n============ Question '%d' ============\n",count);
            System.out.println(Questions[i]);
            for(int j=0;j<Options[0].length;j++){
                System.out.println(Options[i][j]);
            }
            System.out.println("Enter Your Answer:");
            char enteredAnswer=Character.toUpperCase(sc.next().charAt(0));

            if(enteredAnswer==answer[i]){
                System.out.println("__Correct Answer__");
                score++;
            }
            else{
                System.out.println("Wrong! Correct Answer is "+answer[i]);
            }
            count++;
        }
        System.out.println("\n============ Quiz Result ============\n");
        System.out.println("Total Questions : "+Questions.length);
        System.out.println("Correct Answer = "+score);
        System.out.println("Wrong Answer = "+(Questions.length-score));
        System.out.println("Score = "+score+"/"+Questions.length);
        double percentage=(score*100)/Questions.length;
        System.out.println("Percentage = "+percentage);

    }
}
