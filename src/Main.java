import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        int n;
        String ime,jachina,forma,nd1,nd2,proizvoditel;
        ArrayList<Lek> lek = new ArrayList<Lek>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Vnesi broj na lekovi : ");
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Ime na lekot : ");
            ime=sc.next();
            System.out.println("Jachina na lekot : ");
            jachina=sc.next();
            System.out.println("Farmacevtska forma na lekot : ");
            forma=sc.next();
            System.out.println("Prvo nesakano dejstvo na lekot : ");
            nd1=sc.next();
            System.out.println("Vtoro nesakano dejstvo na lekot : ");
            nd2=sc.next();
            System.out.println("Proizvoditel na lekot : ");
            proizvoditel=sc.next();

            Lek l = new Lek(ime,jachina,forma,nd1,nd2,proizvoditel);
            lek.add(l);
        }
        XMLLekovi lekovi = new XMLLekovi();
        lekovi.kreirajXML(lek);
        for(int i=0;i<lek.size();i++)
        {
            System.out.println(lek.get(i).getIme()+" "+lek.get(i).getJachina()+" "+lek.get(i).getForma()+" "+lek.get(i).getNd1()+" "+lek.get(i).getNd1()+" "+lek.get(i).getNd2()+" ");
        }
    }
}