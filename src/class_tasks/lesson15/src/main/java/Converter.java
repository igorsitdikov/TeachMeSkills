//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.SerializationFeature;
//
//import javax.xml.bind.JAXBContext;
//import javax.xml.bind.JAXBException;
//import javax.xml.bind.Marshaller;
//import javax.xml.bind.Unmarshaller;
//import java.io.File;
//import java.io.IOException;
//
//public class Converter {
//
//    private static final String PATH = "/home/mizuro/IdeaProjects/TeachMeSkills/src/class_tasks/lesson15/src/main/resources/";
//
//    public static void conertToXml(Catalog catalog, String fileName) throws JAXBException {
//        JAXBContext context = JAXBContext.newInstance(Catalog.class);
//        Marshaller marshaller = context.createMarshaller();
//        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//        marshaller.marshal(catalog, new File(PATH + "/" + fileName));
//    }
//
//    public static Catalog readFromXml(String fileName) throws JAXBException {
//        JAXBContext context = JAXBContext.newInstance(Catalog.class);
//        Unmarshaller unmarshaller = context.createUnmarshaller();
//        return (Catalog) unmarshaller.unmarshal(new File(PATH + "/" + fileName));
//    }
//
//    public static void convertToJson(Catalog catalog, String fileName) throws IOException {
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.enable(SerializationFeature.INDENT_OUTPUT);
//        System.out.println(mapper.writeValueAsString(catalog));
//        mapper.writeValue(new File(PATH + "/" + fileName), catalog);
//    }
//
//    public static Catalog readFromJson(String fileName) throws IOException {
//        ObjectMapper mapper = new ObjectMapper();
//        return mapper.readValue(new File(PATH + "/" + fileName), Catalog.class);
//    }
//}
