package BasicLanguage;

public class BreakContinue4 {
    public static void main(String[] args) {
        back1 :
        for (int i = 0;i < 10;i++){
            back2:
            for (int j = 0;j < 10;j++){
                if (j == 9){
                    continue back2;
                }
            }
            System.out.printf("test"+'\n');
        }
    }
}
