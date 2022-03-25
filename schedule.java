import java.util.*;

class Day {
    private String work;
    public void set(String work) { this.work = work; }
    public String get() { return work; }
    public void show() {
        if(work == null) System.out.println("없습니다.");
        else System.out.println(work + "입니다.");
    }
}

public class MonthSchedule {
    private int nDay;
    private Day [] day;
    Scanner scanner;

    public MonthSchedule(int nDay) {
        this.nDay = nDay;
        day = new Day [nDay];
        for(int i=0; i < day.length; i++)
            day[i] = new Day();
        scanner = new Scanner(System.in);
    }

    private void input() {
        System.out.print("날짜(1~" + nDay + ")?");
        int date = scanner.nextInt();
        date--;

        if(date >= 0 && date <= nDay - 1) {
            System.out.print("할일(빈칸없이입력)?");
            String work = scanner.next();
            day[date].set(work);
        }
        else {
            System.out.println("잘못된 날짜를 입력하셨습니다.");
            return;
        }
    }

    private void view() {
        System.out.print("날짜(1~" + nDay + ")?");
        int date = scanner.nextInt();
        date--;

        if(date >= 0 && date <= nDay - 1) {
            System.out.print((date+1) + "일의 할 일은 ");
            day[date].show();
        }
        else {
            System.out.println("잘못된 날짜를 입력하셨습니다.");
            return;
        }
    }

    private void finish() {
        System.out.println("프로그램을 종료합니다.");
        scanner.close();
    }

    public void run() {
        System.out.println("이번달 스케쥴 관리 프로그램.");

        while(true) {
            System.out.print("할일(입력:1, 보기:2, 끝내기:3) >>");
            int act = scanner.nextInt();
            switch (act) {
                case 1: input(); break;
                case 2: view(); break;
                case 3: finish(); return;
                default:
                    System.out.println("잘못된 수를 입력하셨습니다.");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MonthSchedule april = new MonthSchedule(30);
        april.run();
    }
}