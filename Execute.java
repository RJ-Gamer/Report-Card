class Execute{
    public static void main(String[] args) {
        Maindata obj = new Maindata();
        obj.input();
        // obj.sortbycol(obj.info, 2);
        obj.showinfo();

        obj.termone();
        obj.sortbycol(obj.firstterm, 14);
        obj.assignrank(obj.firstterm, 15);
        obj.sortbycol(obj.firstterm, 16);

        obj.termtwo();
        obj.sortbycol(obj.secondterm, 14);
        obj.assignrank(obj.secondterm, 15);
        obj.sortbycol(obj.secondterm, 16);

        obj.cummulative();
        obj.sortbycol(obj.cum, 7);
        obj.assignrank(obj.cum, 8);
        obj.sortbycol(obj.cum, 9);

        obj.showresults();
    }
}
