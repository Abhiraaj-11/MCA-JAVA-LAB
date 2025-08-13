import java.util.Scanner;

class Sample{
    void show() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name school program and batch: ");
        String name=sc.nextLine();
        String school=sc.nextLine();
        String program=sc.nextLine();
        int batch = sc.nextInt();
        sc.close();
        System.out.println("NAME:" + name + "\nSchool: " + school + "\nProgram: " + program + "\nBatch: " + batch);
    }

    public static void main(String[] args) {
        Sample obj = new Sample();
        obj.show();
    }
}
