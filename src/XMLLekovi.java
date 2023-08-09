import java.io.File;
import java.io.IOException;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.util.ArrayList;
public class XMLLekovi {
    public void kreirajXML(ArrayList<Lek> lekovi)
    {
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document d = db.newDocument();
            Element root=(Element)d.createElement("Lekovi");
            d.appendChild(root);

            for(int i=0;i<lekovi.size();i++)
            {
                Element lek = (Element)d.createElement("Lek");
                root.appendChild(lek);
                Element ime = (Element)d.createElement("Ime");
                lek.appendChild(ime);
                Element jachina = (Element)d.createElement("Jachina");
                lek.appendChild(jachina);
                Element forma = (Element)d.createElement("Forma");
                lek.appendChild(forma);
                Element nd1 = (Element)d.createElement("nd1");
                lek.appendChild(nd1);
                Element nd2 = (Element)d.createElement("nd2");
                lek.appendChild(nd2);
                Element proizvoditel = (Element)d.createElement("Proizvoditel");

                lek.appendChild(proizvoditel);
                ime.appendChild(d.createTextNode(lekovi.get(i).getIme()));
                jachina.appendChild(d.createTextNode(lekovi.get(i).getJachina()));
                forma.appendChild(d.createTextNode(lekovi.get(i).getForma()));
                nd1.appendChild(d.createTextNode(lekovi.get(i).getNd1()));
                nd2.appendChild(d.createTextNode(lekovi.get(i).getNd2()));
                proizvoditel.appendChild(d.createTextNode(lekovi.get(i).getProizvoditel()));
            }
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer t = tf.newTransformer();
            DOMSource source = new DOMSource(d);
            File file = new File("LekoviXML.xml");
            Result result = new StreamResult(file);
            t.transform(source,result);
            System.out.println("Dokumentot e kreiran.");
        }
        catch (Exception ex)
        {
            ex.toString();
        }
    }
}
