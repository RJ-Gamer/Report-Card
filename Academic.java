import java.util.Scanner;

class Academic{
    int n;
    int std;
    char sec;
    String teacher;
    String[][] info;
    float[][] termone;
    float[][] termtwo;
    float[][] cum;
    String academicyr;

    Scanner in = new Scanner(System.in);

    public void input(){
        System.out.println("Enter number of Students:");
        this.n = in.nextInt();
        in.nextLine();

        this.info = new String[this.n][3];
        for(int i = 0; i < this.info.length; i++){
            System.out.println("Roll Number :");
            this.info[i][0] = in.nextLine();

            System.out.println("Enter Students Name :");
            this.info[i][1] = in.nextLine();

            System.out.println("Enter Computer Code :");
            this.info[i][2] = in.nextLine();
        }

        System.out.println("Enter your std :");
        this.std = in.nextInt();
        in.nextLine();

        System.out.println("Enter your Section :");
        this.sec = in.nextLine().charAt(0);

        System.out.println("Enter Teacher's Name:");
        this.teacher = in.nextLine();

        System.out.println("Enter your Academic Year, Ex: 2019-2020");
        this.academicyr = in.nextLine();
    }

    public void validmarks(float marks){
        if(marks > 0 && marks <= 100){
            System.out.println("You Entered : " + marks);
        }
        else{
            System.out.println("Marks must be between 1 and 100. Try Again !!");
        }
    }
    public void showinfo(){
        System.out.println("Roll No"+"\t"+"Student Name :"+"\t"+"Computer Code");
        System.out.println("=======================================================================");
        for(int i = 0; i < this.info.length; i++){
            for(int j = 0; j < this.info[0].length; j++){
                System.out.print(this.info[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public void termone(){
        termone = new float[this.n][16];
        for(int i = 0; i < this.termone.length; i++){
            System.out.println("Enter Term One marks for :"+this.info[i][1]);
            System.out.println("Enter marks for English Language :");
            this.termone[i][0] = in.nextInt();
            in.nextLine();
            this.validmarks(this.termone[i][0]);


            System.out.println("Enter marks for English Literature :");
            this.termone[i][1] = in.nextInt();
            in.nextLine();
            this.validmarks(this.termone[i][1]);

            this.termone[i][2] = ((this.termone[i][0] + this.termone[i][1])/2);
            float english  = this.termone[i][2];

            System.out.println("Enter marks for Hindi :");
            this.termone[i][3] = in.nextInt();
            in.nextLine();
            float hindi = this.termone[i][3];

            System.out.println("Enter marks for Maths :");
            this.termone[i][4] = in.nextInt();
            in.nextLine();
            float maths = this.termone[i][4];

            System.out.println("Enter marks for History :");
            this.termone[i][5] = in.nextInt();
            in.nextLine();

            System.out.println("Enter marks for Geography :");
            this.termone[i][6] = in.nextInt();
            in.nextLine();

            this.termone[i][7] = ((this.termone[i][5] + this.termone[i][6])/2);
            float social_studies = this.termone[i][7];

            System.out.println("Enter marks for Physics :");
            this.termone[i][8] = in.nextInt();
            in.nextLine();

            System.out.println("Enter marks for Chemistry :");
            this.termone[i][9] = in.nextInt();
            in.nextLine();

            System.out.println("Enter marks for Biology :");
            this.termone[i][10] = in.nextInt();
            in.nextLine();

            this.termone[i][11] = ((this.termone[i][8] + this.termone[i][9] + this.termone[i][10])/3);
            float science = this.termone[i][11];

            System.out.println("Enter marks for Computer / P.Ed. :");
            this.termone[i][12] = in.nextInt();
            in.nextLine();
            float computer = this.termone[i][12];

            float total = english + hindi + maths + social_studies + science + computer;
            this.termone[i][13] = total;

            float percentage = ((this.termone[i][13]) / 6);
            this.termone[i][14] = percentage;

            this.termone[i][15] = 1;
        }
    }

    public void termtwo(){
        termtwo = new float[this.n][16];
        for(int i = 0; i < this.termtwo.length; i++){
            System.out.println("Enter Term Two marks for :"+this.info[i][1]);
            System.out.println("Enter marks for English Language :");
            this.termtwo[i][0] = in.nextInt();
            in.nextLine();

            System.out.println("Enter marks for English Literature :");
            this.termtwo[i][1] = in.nextInt();
            in.nextLine();

            this.termtwo[i][2] = ((this.termtwo[i][0] + this.termtwo[i][1])/2);
            float english  = this.termtwo[i][2];

            System.out.println("Enter marks for Hindi :");
            this.termtwo[i][3] = in.nextInt();
            in.nextLine();
            float hindi = this.termtwo[i][3];

            System.out.println("Enter marks for Maths :");
            this.termtwo[i][4] = in.nextInt();
            in.nextLine();
            float maths = this.termtwo[i][4];

            System.out.println("Enter marks for History :");
            this.termtwo[i][5] = in.nextInt();
            in.nextLine();

            System.out.println("Enter marks for Geography :");
            this.termtwo[i][6] = in.nextInt();
            in.nextLine();

            this.termtwo[i][7] = ((this.termtwo[i][5] + this.termtwo[i][6])/2);
            float social_studies = this.termtwo[i][7];

            System.out.println("Enter marks for Physics :");
            this.termtwo[i][8] = in.nextInt();
            in.nextLine();

            System.out.println("Enter marks for Chemistry :");
            this.termtwo[i][9] = in.nextInt();
            in.nextLine();

            System.out.println("Enter marks for Biology :");
            this.termtwo[i][10] = in.nextInt();
            in.nextLine();

            this.termtwo[i][11] = ((this.termtwo[i][8] + this.termtwo[i][9] + this.termtwo[i][10])/3);
            float science = this.termtwo[i][11];

            System.out.println("Enter marks for Computer / P.Ed. :");
            this.termtwo[i][12] = in.nextInt();
            in.nextLine();
            float computer = this.termtwo[i][12];

            float total = english + hindi + maths + social_studies + science + computer;
            this.termtwo[i][13] = total;

            float percentage = ((this.termtwo[i][13]) / 6);
            this.termtwo[i][14] = percentage;

            this.termtwo[i][15] = 1;
        }
    }

    public void cummulative(){
        cum = new float[this.n][9];
        for(int i = 0; i < cum.length; i++){
            cum[i][0] = (termone[i][2] + termtwo[i][2])/2;
            cum[i][1] = (termone[i][3] + termtwo[i][3])/2;
            cum[i][2] = (termone[i][4] + termtwo[i][4])/2;
            cum[i][3] = (termone[i][7] + termtwo[i][7])/2;
            cum[i][4] = (termone[i][11] + termtwo[i][11])/2;
            cum[i][5] = (termone[i][12] + termtwo[i][12])/2;
            cum[i][6] = (termone[i][13] + termtwo[i][13])/2;
            cum[i][7] = (termone[i][14] + termtwo[i][14])/2;
            cum[i][8] = 1;
        }
    }
    public void showtermone(){
        for(int i=0;i<this.termone.length;i++){
            for(int j=0;j < this.termone[0].length;j++){
                System.out.print(this.termone[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public void showcumm(){
        for (int i=0; i< cum.length; i++){
            for(int j=0; j < cum[0].length;j++){
                System.out.print(cum[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
