//import javax.xml.bind.JAXBException;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) throws JAXBException, IOException {
//        List<CD> list = new ArrayList<CD>();
//        list.add(new CD("Thunderstrik",
//                new Artist("Imagine dragons", Instruments.CIMBALS),
//                2010,
//                34.5));
//        list.add(new CD("Четырехглавый орет",
//                new Artist("Каста", Instruments.CIMBALS),
//                2019,
//                30.25));
//        list.add(new CD());
//        Converter.conertToXml(new Catalog(list), "cds.xml");
//        Catalog catalog = Converter.readFromXml("cds.xml");
//        for (CD cd : catalog.getCds()) {
//            System.out.println(cd.toString());
//        }
//
//        catalog.getCds().add(new CD("SLY", new Artist("Scorpions", Instruments.GUITAR), 1988, 100.0));
//
//        Converter.convertToJson(catalog, "cds.json");
//        System.out.println();
//        catalog = Converter.readFromJson("cds.json");
//        for (CD cd : catalog.getCds()) {
//            System.out.println(cd.toString());
//        }
//
//    }
//}
