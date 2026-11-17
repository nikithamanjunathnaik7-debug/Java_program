import java.util.Scanner;

    public class Student_ {
        String usn, name, branch;
        long phone;

        void getDetails() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter USN: ");
            usn = sc.nextLine();

            System.out.print("Enter Name: ");
            name = sc.nextLine();

            System.out.print("Enter Branch: ");
            branch = sc.nextLine();

            System.out.print("Enter Phone: ");
            phone = sc.nextLong();
            sc.nextLine();
        }

        void display() {
            System.out.println(usn + "\t" + name + "\t" + branch + "\t" + phone);
        }
    }

    class Main2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of students: ");
            int n = sc.nextInt();
            sc.nextLine();

            Student_ s[] = new Student_ [n];

            for (int i = 0; i < n; i++) {
                s[i] = new Student_();
                s[i].getDetails();
            }

            System.out.println("\nUSN\tName\tBranch\tPhone");

            for (int i = 0; i < n; i++) {
                s[i].display();
            }
        }
    }

