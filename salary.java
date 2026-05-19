public class salary {
    public static void main(String[] args) {
        int sal = 5000;

        int hra = 0;
        int da = 0;

        if(sal<10000)
        {
            hra = (sal*20)/100;
            da = (sal*80)/100;
        }else if(sal>=10000&&sal<20000)
        {
            hra = (sal*25)/100;
            da = (sal*90)/100;
        }else if(sal>=20000)
        {
            hra = (sal*30)/100;
            da = (sal*95)/100;
        }

        int gross = sal + hra + da;
        System.out.println("Gross salary is " + gross);
    }
}
