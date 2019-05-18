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
    String [] subjects = {"Eng. Literature", "Eng. Language", "English",
                        "Hindi", "Maths", "History & Civics", "Geography", "social Studies",
                        "Physics", "Chemistry", "Biology", "science", "Computer", "Total", "Percentage", "Rank"};
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

        System.out.println("Enter Your Class Teacher's Name :");
        teacher = in.nextLine();

        System.out.println("Enter Your Academic Year(Ex. 2019-2020)");
        academicyr = in.nextLine();
    }

    public void showinfo(){
        System.out.println("==============================================================");
        System.out.printf("%15s %25s %15s ", "Roll Number :", "Student's Name :", "Computer Code :");
        System.out.println();
        System.out.println("==============================================================");
        System.out.println();
        for (int i = 0;i < info.length; i++) {
            System.out.printf(" %15s %25s %15s ", info[i][0], info[i][1], info[i][2]);
            System.out.println();
        }
        System.out.println("==============================================================");
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
            float english_t1 = firstterm[i][2];

            System.out.println("Enter Math For Hindi :");
            float hindi_t1 = firstterm[i][3] = getmarks();

            System.out.println("Enter Marks For Maths :");
            float maths_t1 = firstterm[i][4] = getmarks();

            System.out.println("Enter Marks For History & Civics :");
            firstterm[i][5] = getmarks();

            System.out.println("Enter Marks For Geography :");
            firstterm[i][6] = getmarks();

            firstterm[i][7] = Math.round((firstterm[i][5] + firstterm[i][6]) / 2);
            float social_science_t1 = firstterm[i][7];

            System.out.println("Enter Marks For Physics :");
            firstterm[i][8] = getmarks();

            System.out.println("Enter Marks For Chemistry :");
            firstterm[i][9] = getmarks();

            System.out.println("Enter Marks For Biology :");
            firstterm[i][10] = getmarks();

            firstterm[i][11] = Math.round((firstterm[i][8] + firstterm[i][9] + firstterm[i][10]) / 3);
            float science_t1 = firstterm[i][11];

            System.out.println("Enter Marks For Computer / P. Ed. :");
            float comp_ped_t1 = firstterm[i][12] = getmarks();

            float total = Math.round(english_t1 + hindi_t1 + maths_t1 + social_science_t1 + science_t1 + comp_ped_t1);
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
            float english_t2 = secondterm[i][2];

            System.out.println("Enter Math For Hindi :");
            float hindi_t2 = secondterm[i][3] = getmarks();

            System.out.println("Enter Marks For Maths :");
            float maths_t2 = secondterm[i][4] = getmarks();

            System.out.println("Enter Marks For History & Civics :");
            secondterm[i][5] = getmarks();

            System.out.println("Enter Marks For Geography :");
            secondterm[i][6] = getmarks();

            secondterm[i][7] = Math.round((secondterm[i][5] + secondterm[i][6]) / 2);
            float social_science_t2 = secondterm[i][7];

            System.out.println("Enter Marks For Physics :");
            secondterm[i][8] = getmarks();

            System.out.println("Enter Marks For Chemistry :");
            secondterm[i][9] = getmarks();

            System.out.println("Enter Marks For Biology :");
            secondterm[i][10] = getmarks();

            secondterm[i][11] = Math.round((secondterm[i][8] + secondterm[i][9] + secondterm[i][10]) / 3);
            float science_t2 = secondterm[i][11];

            System.out.println("Enter Marks For Computer / P. Ed. :");
            float comp_ped_t2 = secondterm[i][12] = getmarks();

            float total = Math.round(english_t2 + hindi_t2 + maths_t2 + social_science_t2 + science_t2 + comp_ped_t2);
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

    public void sortbycol(float[][] marks, int col){
        for(int i = 0; i < marks.length; i++){
            for(int j = 1; j < marks.length; j++){
                if(marks[j-1][col] < marks[j][col]){
                    float [] temp = marks[j-1];
                    marks[j-1] = marks[j];
                    marks[j] = temp;
                }
            }
        }
    }

    public void assignrank(float[][] marks, int col){
        int rank = 1;
        for(int i = 0; i < marks.length; i++){
            marks[i][col] = rank;
            rank = rank + 1;
        }
    }

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
            System.out.printf(" %18s  %14s  %14s %18s", "Subjects:", "First Term: ", "Second Term: ", "Final Result :");
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------------");

            int cum_count = -1;
            for (int j = 0;j < subjects.length; j++) {
                if (j == 2 || j == 3 || j == 4 || j == 7 || j == 11 || j ==12 || j == 13 || j == 14 || j == 15){
                    cum_count += 1;
                    System.out.printf(" %18s  %14s  %14s %18s ", subjects[j], firstterm[i][j], secondterm[i][j], cum[i][cum_count]);
                    System.out.println();
                    System.out.println("-----------------------------------------------------------------------------------------------");
                }
                else{
                    System.out.printf(" %18s  %14s  %14s %18s ", subjects[j], firstterm[i][j], secondterm[i][j], " ");
                    System.out.println();
                }
            }
            System.out.println("===============================================================================================");
        }
    }
}
