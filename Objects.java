class Objects{
    public static void main(String[] args) {
        Academics obj = new Academics();
        obj.input();
        obj.showinfo();
        obj.termone();
        obj.termtwo();
        obj.showtermmarks(obj.secondterm);
        obj.cummulative();
        obj.sortbycol(obj.firstterm, 14);
        obj.assignrank(obj.firstterm, 15);
        obj.showtermmarks(obj.firstterm);
        obj.sortbycol(obj.secondterm, 14);
        obj.assignrank(obj.secondterm, 15);
        obj.showtermmarks(obj.secondterm);
        obj.sortbycol(obj.cum, 7);
        obj.assignrank(obj.cum, 8);
        obj.showtermmarks(obj.cum);
        obj.showresults();
    }
}
