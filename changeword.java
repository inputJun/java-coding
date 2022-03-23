import java.util.*;

public class ChangeWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(">>");
        String sent = scanner.nextLine();
        StringBuffer sb = new StringBuffer(sent);

        while(true) {
            System.out.print("명령: ");
            String ord = scanner.nextLine();
            if(ord.equals("그만")) {
                System.out.println("종료합니다.");
                break;
            }
            String s[] = ord.split("!");
            if(s.length != 2) {
                System.out.println("잘못된 명령입니다!");
            }
            else {
                if(s[0].length() == 0 || s[1].length() == 0) {
                    System.out.println("잘못된 명령입니다.");
                    continue;
                }
                int a = sb.indexOf(s[0]);
                if(a == -1) {
                    System.out.println("찾을 수 없습니다!");
                    continue;
                }
                else {
                    sb.replace(a, a + s[0].length(), s[1]);
                    System.out.println(sb);
                    continue;
                }
            }
        }
        scanner.close();
    }
}