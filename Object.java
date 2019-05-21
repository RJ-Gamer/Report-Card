class Object{
    public static void main(String[] args) {
        Academics obj = new Academics();

        obj.input();
        obj.showinfo();
        obj.termone();
        obj.sortbycol(obj.firstterm, 14);
        obj.assignrank(obj.firstterm, 15);
        obj.termtwo();
        obj.sortbycol(obj.secondterm, 14);
        obj.assignrank(obj.secondterm, 15);
        obj.cummulative();
        obj.sortbycol(obj.cum, 7);
        obj.assignrank(obj.cum, 8);
        obj.showresults();
    }
}
