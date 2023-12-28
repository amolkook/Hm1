//R-1.2
 public class GameEntry {
    int score;

    public GameEntry(int score) {
        this.score = score;
    }


//public class Main {
    public static void main(String[] args) {
        // إنشاء مصفوفة A من كائنات GameEntry
        GameEntry[] A = new GameEntry[5];

        // ملء مصفوفة A بكائنات GameEntry
        for (int i = 0; i < A.length; i++) {
            A[i] = new GameEntry(i * 100); // تعيين قيمة مؤقتة للحقل score
        }

        // نسخ مصفوفة A إلى مصفوفة B
        GameEntry[] B = A.clone();

        // تعيين قيمة الحقل score لكائن GameEntry في المؤشر A[4] إلى 550
        A[4].score = 550;
        //A[3].score = 345;

        // قراءة قيمة الحقل score لكائن GameEntry في المؤشر B[4]
        int scoreOfB4 = B[4].score;
        System.out.println("Score value of B[4]: " + scoreOfB4);
    }
}
