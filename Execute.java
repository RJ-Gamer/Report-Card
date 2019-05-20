class Execute{
    public static void main(String[] args) {
        Maindata obj = new Maindata();
        obj.input();
        obj.showinfo();
        obj.termone();
        obj.sortbypercent(obj.firstterm, 14, 15);
        // obj.assignrank(obj.firstterm, 15);
        obj.termtwo();
        obj.sortbypercent(obj.secondterm, 14, 15);
        // obj.assignrank(obj.secondterm, 15);
        obj.cummulative();
        obj.sortbypercent(obj.cum, 7, 8);
        // obj.assignrank(obj.cum, 8);
        obj.showtermmarks(obj.firstterm);
        obj.showresults();
    }
}
