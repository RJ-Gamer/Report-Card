import java.util.Scanner;

class Maindata{
    int n;
    int std;
    char sec;
    float [][] firstterm;
    float [][] secondterm;
    float [][] cum;
    String teacher;
    String academicyr;
    String [][] info;
    String [] subjects = {
        " English Literature",
        " English Language",
        " English",
        " Hindi",
        " Maths",
        " History & Civics",
        " Geography",
        " social Studies",
        " Physics",
        " Chemistry",
        " Biology",
        " science",
        " Computer/P. Ed.",
        " Total",
        " Percentage",
        " Rank",
        " Roll Number"
    };
    Scanner in = new Scanner(System.in);

    public void input(){
        // Get Number of students
        System.out.println("Enter Number of Students :");
        n = in.nextInt();
        in.nextLine();

        // initialize info with n * 3
        info = new String[n][3];

        // Get Roll no., Name, Computer code
        for (int i = 0;i < info.length; i++) {
            info[i][0] = Integer.toString(i + 1);

            System.out.println("Enter Student's Name :");
            info[i][1] = in.nextLine();

            System.out.println("Enter Six Digit Computer Code :");
            info[i][2] = in.nextLine();
            if(info[i][2].length() != 6) {
                System.out.println("Computer Code Must Be Six Digits Number, Try Again :");
                info[i][2] = in.nextLine();
            }
        }
        System.out.println("Enter Your Standard :");
        std = in.nextInt();
        in.nextLine();

        System.out.println("Enter Your Section :");
        sec = in.nextLine().charAt(0);

        System.out.println("Enter Your Class Teacher's Name :");
        teacher = in.nextLine();

        System.out.println("Enter Academic Year : Ex. 2019-2020");
        academicyr = in.nextLine();
    }

    public void showinfo(){

        System.out.println("================================================================");
        System.out.println("Class Teacher : " + teacher);
        System.out.println("Academic Year : " + academicyr);
        System.out.println("Class : " + std + " " + sec);
        System.out.println("================================================================");
        System.out.printf("%10s %25s %15s", " Roll Number:", " Student's Name:", " Computer Code:");
        System.out.println();
        System.out.println("================================================================");
        for (int i = 0; i < info.length; i++) {
            System.out.printf("%10s %25s %15s", info[i][0], info[i][1], info[i][2]);
            System.out.println();
        }
        System.out.println("================================================================");
    }

    public float getmarks(){
        float marks = in.nextInt();
        if (!((marks >= 0) && (marks <= 100))){
            System.out.println("Marks must be between 0 and 100, Try Again!");
            marks = in.nextInt();
        }
        return marks;
    }

    public void termone(){
        firstterm = new float[n][17];

        for (int i = 0; i < firstterm.length; i++) {
            System.out.println("================================================================");
            System.out.println("Enter First Term Marks For : " + info[i][1]);
            System.out.println("================================================================");

            System.out.println("Enter First Term Marks For : " + subjects[0]);
            firstterm[i][0] = getmarks();
            in.nextLine();

            System.out.println("Enter First Term Marks For : " + subjects[1]);
            firstterm[i][1] = getmarks();
            in.nextLine();

            float english = firstterm[i][2] = Math.round((firstterm[i][0] + firstterm[i][1])/2);

            System.out.println("Enter First Term Marks For : " + subjects[3]);
            float hindi = firstterm[i][3] = getmarks();
            in.nextLine();

            System.out.println("Enter First Term Marks For : " + subjects[4]);
            float maths = firstterm[i][4] = getmarks();
            in.nextLine();

            System.out.println("Enter First Term Marks For : " + subjects[5]);
            firstterm[i][5] = getmarks();
            in.nextLine();

            System.out.println("Enter First Term Marks For : " + subjects[6]);
            firstterm[i][6] = getmarks();
            in.nextLine();

            float social_studies = firstterm[i][7] = Math.round((firstterm[i][5] + firstterm[i][6])/2);

            System.out.println("Enter First Term Marks For : " + subjects[8]);
            firstterm[i][8] = getmarks();
            in.nextLine();

            System.out.println("Enter First Term Marks For : " + subjects[9]);
            firstterm[i][9] = getmarks();
            in.nextLine();

            System.out.println("Enter First Term Marks For : " + subjects[10]);
            firstterm[i][10] = getmarks();
            in.nextLine();

            float science = firstterm[i][11] = Math.round((firstterm[i][8] + firstterm[i][9] + firstterm[i][10])/3);

            System.out.println("Enter First Term Marks For : " + subjects[12]);
            float comp_ped = firstterm[i][12] = getmarks();
            in.nextLine();

            float total = firstterm[i][13] = english + hindi + maths + social_studies + science + comp_ped;

            firstterm[i][14] = total / 6;

            firstterm[i][15] = 1;

            firstterm[i][16] = Float.valueOf(info[i][2]);
        }
    }

    public void termtwo(){
        secondterm = new float[n][17];

        for (int i = 0; i < secondterm.length; i++) {
            System.out.println("================================================================");
            System.out.println("Enter Second Term Marks For : " + info[i][1]);
            System.out.println("================================================================");

            System.out.println("Enter Second Term Marks For : " + subjects[0]);
            secondterm[i][0] = getmarks();
            in.nextLine();

            System.out.println("Enter Second Term Marks For : " + subjects[1]);
            secondterm[i][1] = getmarks();
            in.nextLine();

            float english = secondterm[i][2] = Math.round((secondterm[i][0] + secondterm[i][1])/2);

            System.out.println("Enter Second Term Marks For : " + subjects[3]);
            float hindi = secondterm[i][3] = getmarks();
            in.nextLine();

            System.out.println("Enter Second Term Marks For : " + subjects[4]);
            float maths = secondterm[i][4] = getmarks();
            in.nextLine();

            System.out.println("Enter Second Term Marks For : " + subjects[5]);
            secondterm[i][5] = getmarks();
            in.nextLine();

            System.out.println("Enter Second Term Marks For : " + subjects[6]);
            secondterm[i][6] = getmarks();
            in.nextLine();

            float social_studies = secondterm[i][7] = Math.round((secondterm[i][5] + secondterm[i][6])/2);

            System.out.println("Enter Second Term Marks For : " + subjects[8]);
            secondterm[i][8] = getmarks();
            in.nextLine();

            System.out.println("Enter Second Term Marks For : " + subjects[9]);
            secondterm[i][9] = getmarks();
            in.nextLine();

            System.out.println("Enter Second Term Marks For : " + subjects[10]);
            secondterm[i][10] = getmarks();
            in.nextLine();

            float science = secondterm[i][11] = Math.round((secondterm[i][8] + secondterm[i][9] + secondterm[i][10])/3);

            System.out.println("Enter Second Term Marks For : " + subjects[12]);
            float comp_ped = secondterm[i][12] = getmarks();
            in.nextLine();

            float total = secondterm[i][13] = english + hindi + maths + social_studies + science + comp_ped;

            secondterm[i][14] = total / 6;

            secondterm[i][15] = 1;

            secondterm[i][16] = Float.valueOf(info[i][2]);
        }
    }

    public void cummulative(){
        cum = new float[n][10];
        for (int i = 0; i < cum.length; i++) {
            cum[i][0] = Math.round((firstterm[i][2] + secondterm[i][2])/2);
            cum[i][1] = Math.round((firstterm[i][3] + secondterm[i][3])/2);
            cum[i][2] = Math.round((firstterm[i][4] + secondterm[i][4])/2);
            cum[i][3] = Math.round((firstterm[i][7] + secondterm[i][7])/2);
            cum[i][4] = Math.round((firstterm[i][11] + secondterm[i][11])/2);
            cum[i][5] = Math.round((firstterm[i][12] + secondterm[i][12])/2);
            cum[i][6] = cum[i][0] + cum[i][1] + cum[i][2] + cum[i][3] + cum[i][4] + cum[i][5];
            cum[i][7] = Math.round(cum[i][6]/6);
            cum[i][8] = 1;
            cum[i][9] = Float.valueOf(info[i][2]);
        }
    }

    public void showtermmarks(float[][] term){
        for(int i = 0; i < term.length; i++){
            System.out.println("Showing Marks For :" + info[i][1]);
            for(int j = 0; j < term[0].length; j++){
                System.out.println(term[i][j]);
            }
            System.out.println();
        }
    }

    public void sortbypercent(float[][] marks, int col, int rankcol){
        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < (marks.length-i)-1; j++) {
                int rank = 1;
                if(marks[j][col] < marks[j+1][col]){
                    float temp = rank;
                    marks[j][rankcol] = rank+1;
                    marks[j+1][rankcol] = temp;
                }
            }
        }
    }

    // public void assignrank(float[][] marks, int col){
    //     int rank = 1;
    //     for (int i = 0; i < marks.length; i++) {
    //         marks[i][col] = rank;
    //         rank += 1;
    //     }
    // }

    public void showresults(){
        for(int i = 0; i < n; i++){
            System.out.println("===============================================================================================");
            System.out.println("               Student's Name: " + info[i][1] + "            ");
            System.out.println("===============================================================================================");
            System.out.println("     Roll Number:       " + info[i][0] + "   Class :      " + std + " " + sec);
            System.out.printf(" %18s  %14s  %14s ", "Computer Code:", "Class Teacher:", "Academic Yr:");
            System.out.println();
            System.out.printf(" %18s  %14s  %14s ", info[i][2], teacher, academicyr);
            System.out.println();
            System.out.println("===============================================================================================");
            System.out.printf(" %20s  %14s  %14s %18s", "Subjects:", "First Term: ", "Second Term: ", "Final Result :");
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------------");

            int cum_count = -1;
            for (int j = 0;j < subjects.length; j++) {
                if (j == 2 || j == 3 || j == 4 || j == 7 || j == 11 || j ==12 || j == 13 || j == 14 || j == 15){
                    cum_count += 1;
                    System.out.printf(" %20s  %14s  %14s %18s ", subjects[j], firstterm[i][j], secondterm[i][j], cum[i][cum_count]);
                    System.out.println();
                    System.out.println("-----------------------------------------------------------------------------------------------");
                }
                else{
                    System.out.printf(" %20s  %14s  %14s %18s ", subjects[j], firstterm[i][j], secondterm[i][j], " ");
                    System.out.println();
                }
            }
            System.out.println("===============================================================================================");
        }
    }
}
