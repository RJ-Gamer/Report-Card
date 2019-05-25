class Execute{
    public static void main(String[] args) {
        Maindata obj = new Maindata();
        obj.input();
        obj.showinfo();

        obj.termone();
        obj.ranksort(obj.firstterm, 14, 15);
        obj.termtwo();
        obj.ranksort(obj.secondterm, 14, 15);
        obj.cummulative();
        obj.ranksort(obj.cum, 7, 8);

        obj.showresults();
    }
}
