package week4;

public class Quiz {
    private String[] questions = {
        "Ibu kota Indonesia adalah?",
        "Hewan apa yang paling pendiam?",
        "Planet terbesar di tata surya?",
        "Udinus warna apa?",
        "Tari saman berasal dari mana?",
        "Wayang kulit berasal dari kebudayaan suku apa?",
        "Berapa jumlah pemain dalam satu tim sepak bola?",
        "Michael Jordan terkenal dalam olahraga apa?",
        "Sebuah segitiga memiliki sudut 90°, maka segitiga tersebut disebut?",
        "Sungai terpanjang di dunia adalah?"
    };
    
    private String[][] options = {
        {"1. Jakarta", "2. Bandung", "3. Surabaya", "4. Bali"},
        {"1. Harimau", "2. Semute", "3. Gajah", "4. Kucing"},
        {"1. Mars", "2. Bumi", "3. Jupiter", "4. Saturnus"},
        {"1. Biru", "2. Merah", "3. Kuning", "4.Hijau"},
        {"1. Sumatra Barat", "2. Aceh", "3. Bali", "4. Kalimantan"},
        {"1. Dayak", "2. Minang", "3. Jawa", "4. Bugis"},
        {"1. 11", "2. 13", "3. 15", "4. 20"},
        {"1. Sepak bola", "2. Basket", "3. Renang", "4. Tenis"},
        {"1. Segitiga sama kaki", "2. Segitiga sama sisi", "3. Segitiga siku-siku", "4. Segitiga sembarang"},
        {"1. Nil", "2. Kapuas", "3. Amazon", "4. Missisippi"}

    };
    
    private int[] correctAnswers = {1, 2, 3, 1, 2, 3, 1, 2, 3, 1}; 
    private int score = 0;
    
   
    public int getQuestionCount() {
        return questions.length;
    }
    
    
    public void displayQuestion(int index) {
        System.out.println("\nPertanyaan " + (index + 1) + ": " + questions[index]);
        for (int j = 0; j < options[index].length; j++) {
            System.out.println(options[index][j]);
        }
    }
    
    public void checkAnswer(int index, int userAnswer) {
        if (userAnswer == correctAnswers[index]) {
            System.out.println("Benar!");
            score += 10;
        } else {
            System.out.println("Salah! Jawaban yang benar adalah: " + 
                options[index][correctAnswers[index] - 1]);
        }
    }
    
    // Method untuk mendapatkan skor
    public int getScore() {
        return score;
    }
}
