package BasicLanguage;

public class BreakContinue3 {
    public static void main(String[] args) {
        back:{
        for(int i = 0; i < 10;i++){
            System.out.printf("break"+'\n');
            break back;
            }
        }
        System.out.printf("test");
    }
}