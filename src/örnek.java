import java.util.Scanner;
public class örnek {
    public static void main(String[] args)
    {
        double sonpara;
        double leblebi= 3.5;
        double findik=15.7;
        double badem=22;
        int kira=500;
        double maliyet=(12*leblebi)+(findik*25)+(40*badem);
        double kazanc=((12*leblebi)*1.5)+((25*findik)*1.4)+((40*badem)*1.6);
        System.out.println(kazanc);
        System.out.println(maliyet);

        if(kazanc>500)
        {
            sonpara=kazanc-(kira+maliyet);
            System.out.println("kiranız ödenmiştir");
            System.out.println("geriye kalan paranız:"+sonpara+"TL");
        }
        else
        {
            sonpara=kazanc-maliyet;
            System.out.println("kiraya para yetmedi farklı yöntemlerle ödemeyi deneyiniz ;)");
            System.out.println("geriye kalan paranız: "+sonpara+"TL");

        }
    }
}
