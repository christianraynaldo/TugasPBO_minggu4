package week4;
import java.util.Scanner;

public class Mainquiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        Quiz quiz = new Quiz();

        System.out.println("Selamat datang di quiz pengehtahuan umum");

        //looping untuk setiap pertayaan
    for( int i=0; i<quiz.getQuestionCount(); i++) {
        quiz.displayQuestion(i);
        System.out.println("Jawaban:");
        int userAnswer = scanner.nextInt();
        quiz.checkAnswer(i, userAnswer);

        //total skor
        System.out.println("skor kamu:" + quiz.getScore());
        
        //pernyataan skor
        if (quiz.getScore() >80) {
            System.out.println("nilaimu sudah aman");
        } else {
            System.out.println("nilaimu kurang bagus coba lagi");
        }
        
    }


    }
}