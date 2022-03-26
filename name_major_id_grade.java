import java.util.*;

class Student {
    private String name;
    private String major;
    private int id;
    private double grade;
    public Student(String name, String major, int id, double grade) {
        this.name = name;
        this.major = major;
        this.id = id;
        this.grade = grade;
    }
    public String getName() { return name; }
    public String getMajor() { return major; }
    public int getId() { return id; }
    public double getGrade() { return grade; }
}

public class ArrayListStudent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> per = new ArrayList<Student>();

        System.out.println("학생 이름,학과,학번,학점평균 입력하세요.");
        for(int i=0; i<4; i++) {
            System.out.print(">> ");
            String a = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(a, ",");
            String name = st.nextToken().trim();
            String major = st.nextToken().trim();
            int id = Integer.parseInt(st.nextToken().trim());
            double grade = Double.parseDouble(st.nextToken().trim());
            Student student = new Student(name, major, id, grade);

            per.add(student);
        }

        System.out.println("-------------------------------");

        Iterator<Student> it = per.iterator();
        while(it.hasNext()) {
            Student n = it.next();
            System.out.println("이름:" + n.getName());
            System.out.println("학과:" + n.getMajor());
            System.out.println("학번:" + n.getId());
            System.out.println("학점평균:" + n.getGrade());
            System.out.println("-------------------------------");
        }

        while(true) {
            System.out.print("학생 이름 >> ");
            String b = scanner.next();
            if(b.equals("그만"))
                break;
            for(int i=0; i<per.size(); i++) {
                Student student = per.get(i);
                if(b.equals(student.getName())) {
                    System.out.println(student.getName() + ", " + student.getMajor() + ", "
                            + student.getId() + ", " + student.getGrade());
                }
            }
        }
        scanner.close();
    }
}