package BasicLanguage;
//switch--case语句
public class Level2 {
    public static void main(String[] args) {
        int score;
        score = 100;
        int quotient = score/10;
        char level;
        switch (quotient){
            case 10:
            case 9:
                level = 'A';
                break;
            case 8:
                level = 'B';
                break;
            case 7:
                level = 'C';
                break;
            case 6:
                level = 'D';
                break;
                default:
                    level = 'E';
        }
        System.out.printf("得分等级：%c%n",level);
    }
}
