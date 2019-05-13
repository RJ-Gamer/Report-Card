import java.util.Scanner;

class Academics{
    int n;
    String[][] info;
    int std;
    char sec;
    String teacher;
    String academicyr;
    float [][] firstterm;
    float [][] secondterm;
    float [][] cum;

    Scanner in = new Scanner(System.in);

    public void input(){
        System.out.println("Enther number of students");
        n = in.nextInt();
        in.nextLine();

        info = new String[n][3];
        for (int i=0; i < info.length; i++){
            info[i][0] = Integer.toString(i+1);

            System.out.println("Enter students name :");
            info[i][1] = in.nextLine();

            System.out.println("Enter Your Six Digit Computer Code :");
            info[i][2] = in.nextLine();
            while(info[i][2].length() != 6){
                System.out.println("Your Computer Code must be six digits, try again");
                info[i][2] = in.nextLine();
            }
        }
        System.out.println("Enter Your Standard :");
        std = in.nextInt();
        in.nextLine();

        System.out.println("Enter Your Section :");
        sec = in.nextLine().charAt(0);
        // System.out.println(sec);

        System.out.println("Enter Your Class Teacher's Name :");
        teacher = in.nextLine();

        System.out.println("Enter Your Academic Year(Ex. 2019-2020)");
        academicyr = in.nextLine();
    }

    public void showinfo(){
        System.out.println("Roll Number:" + "\t" + "Student's Name :" + "\t" + "Computer Code :");
        for(int i=0; i < info.length; i++){
            for(int j=0; j < info[0].length; j++){
                System.out.print(info[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Standard :" + std +" " + sec);
        System.out.println("Class Teacher :" + teacher);
        System.out.println("Academic Year :" + academicyr);
    }

    public float getmarks(){
        float marks = in.nextInt();
        in.nextLine();
        while (!((marks > 0) && (marks <= 100))){
            System.out.println("Marks Must be between 1 to 100 :");
            marks = in.nextInt();
            in.nextLine();
        }
        return marks;
    }
    public void termone(){
        firstterm = new float[n][16];
        for (int i = 0; i < firstterm.length; i++) {
            System.out.println(" Enter First Term Marks For :" + info[i][1]);

            System.out.println("Enter Marks For English Literature :");
            firstterm[i][0] = getmarks();

            System.out.println("Enter Marks For English Language :");
            firstterm[i][1] = getmarks();

            firstterm[i][2] = Math.round((firstterm[i][0] + firstterm[i][1]) / 2);
            float english = firstterm[i][2];

            System.out.println("Enter Math For Hindi :");
            float hindi = firstterm[i][3] = getmarks();

            System.out.println("Enter Marks For Maths :");
            float maths = firstterm[i][4] = getmarks();

            System.out.println("Enter Marks For History & Civics :");
            firstterm[i][5] = getmarks();

            System.out.println("Enter Marks For Geography :");
            firstterm[i][6] = getmarks();

            firstterm[i][7] = Math.round((firstterm[i][5] + firstterm[i][6]) / 2);
            float social_science = firstterm[i][7];

            System.out.println("Enter Marks For Physics :");
            firstterm[i][8] = getmarks();

            System.out.println("Enter Marks For Chemistry :");
            firstterm[i][9] = getmarks();

            System.out.println("Enter Marks For Biology :");
            firstterm[i][10] = getmarks();

            firstterm[i][11] = Math.round((firstterm[i][8] + firstterm[i][9] + firstterm[i][10]) / 3);
            float science = firstterm[i][11];

            System.out.println("Enter Marks For Computer / P. Ed. :");
            float comp_ped = firstterm[i][12] = getmarks();

            float total = Math.round(english + hindi + maths + social_science + science + comp_ped);
            firstterm[i][13] = total;

            firstterm[i][14] = total / 6;

            firstterm[i][15] = (i+1);
        }
    }

    public void termtwo(){
        secondterm = new float[n][16];
        for (int i = 0; i < secondterm.length; i++) {
            System.out.println(" Enter First Term Marks For :" + info[i][1]);

            System.out.println("Enter Marks For English Literature :");
            secondterm[i][0] = getmarks();

            System.out.println("Enter Marks For English Language :");
            secondterm[i][1] = getmarks();

            secondterm[i][2] = Math.round((secondterm[i][0] + secondterm[i][1]) / 2);
            float english = secondterm[i][2];

            System.out.println("Enter Math For Hindi :");
            float hindi = secondterm[i][3] = getmarks();

            System.out.println("Enter Marks For Maths :");
            float maths = secondterm[i][4] = getmarks();

            System.out.println("Enter Marks For History & Civics :");
            secondterm[i][5] = getmarks();

            System.out.println("Enter Marks For Geography :");
            secondterm[i][6] = getmarks();

            secondterm[i][7] = Math.round((secondterm[i][5] + secondterm[i][6]) / 2);
            float social_science = secondterm[i][7];

            System.out.println("Enter Marks For Physics :");
            secondterm[i][8] = getmarks();

            System.out.println("Enter Marks For Chemistry :");
            secondterm[i][9] = getmarks();

            System.out.println("Enter Marks For Biology :");
            secondterm[i][10] = getmarks();

            secondterm[i][11] = Math.round((secondterm[i][8] + secondterm[i][9] + secondterm[i][10]) / 3);
            float science = secondterm[i][11];

            System.out.println("Enter Marks For Computer / P. Ed. :");
            float comp_ped = secondterm[i][12] = getmarks();

            float total = Math.round(english + hindi + maths + social_science + science + comp_ped);
            secondterm[i][13] = total;

            secondterm[i][14] = total / 6;

            secondterm[i][15] = (i+1);
        }
    }

    public void showtermmarks(float [][] term){
        for(int i = 0; i < term.length; i++){
            System.out.println("Showing First Term Marks For :" + info[i][1]);
            for(int j = 0; j < term[0].length; j++){
                System.out.println(term[i][j]);
            }
            System.out.println();
        }
    }

    public void cummulative(){
        cum = new float[n][9];
        for (int i = 0; i < cum.length; i++){
            float english = cum[i][0] = Math.round((firstterm[i][2] + secondterm[i][2])/2);
            float hindi = cum[i][1] = Math.round((firstterm[i][3] + secondterm[i][3]) / 2);
            float maths = cum[i][2] = Math.round((firstterm[i][4] + secondterm[i][4]) / 2);
            float social_science = cum[i][3] = Math.round((firstterm[i][7] + secondterm[i][7]) / 2);
            float science = cum[i][4] = Math.round((firstterm[i][11] + secondterm[i][11]) / 2);
            float comp_ped = cum[i][5] = Math.round((firstterm[i][12] + secondterm[i][12]) / 2);
            float total = cum[i][6] = english + hindi + maths + social_science + science + comp_ped;
            cum[i][7] = total / 6;
            cum[i][8] = (i+1);
        }
    }

    public void showcumm(){
        for(int i = 0; i < cum.length; i++){
            System.out.println("Showing Final Results for :" + info[i][1]);
            for (int j = 0;j < cum[0].length; j++) {
                System.out.println(cum[i][j]);
            }
            System.out.println("----------------------------------------");
        }
    }

    public void printavg(float[][] marks, int col){
        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i][col]);
        }
        System.out.println();
    }
}
