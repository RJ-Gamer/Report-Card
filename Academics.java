import java.util.Scanner;

class Academics{
    int n;
    String[][] info;

    Scanner in = new Scanner(System.in);
    public void input(){

    }
    public static void main(String[] args) {
        Academics obj = new Academics();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter No. of Students");
        obj.n = in.nextInt();
        in.nextLine();
        obj.info = new String[obj.n][3];
        for(int i = 0; i < obj.info.length;i++){
            System.out.println("Enter Roll :");
            obj.info[i][0] = in.nextLine();

            System.out.println("Enter Student Name:");
            obj.info[i][1] = in.nextLine();

            System.out.println("Enter Computer Code :");
            obj.info[i][2] = in.nextLine();
        }
        in.close();
    }
}


// for(int studentNo = 0 ; studentNo < marksTable.length ; studentNo++) {
//       System.out.print("Enter marks for student no " +(studentNo+1));
//       for (int moduleNo = 0 ; moduleNo < marksTable[studentNo].length ; moduleNo++) {
//           System.out.print("Mark for student "+(studentNo+1)+" for module no "+(moduleNo+1+":");
//           ...
//       }
// }
