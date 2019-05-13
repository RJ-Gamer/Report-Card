class Objects{
    public static void main(String[] args) {
        Academics obj = new Academics();
        obj.input();
        obj.showinfo();
        obj.termone();
        obj.termtwo();
        obj.showtermmarks(obj.firstterm);
        obj.showtermmarks(obj.secondterm);
        obj.cummulative();
        obj.showcumm();
        obj.printavg(obj.firstterm, 14);
    }
}
