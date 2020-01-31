//import com.fasterxml.jackson.annotation.JsonProperty;
//
//import javax.xml.bind.annotation.XmlElement;
//
//public class CD {
//    @JsonProperty("Album name")
//    private String title;
//    private Artist artist;
//    private Integer year;
//    private Double price;
//
//    public CD() {
//    }
//
//    public CD(String title, Artist artist, Integer year, Double price) {
//        this.title = title;
//        this.artist = artist;
//        this.year = year;
//        this.price = price;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    @XmlElement(name = "title", defaultValue = "rrr")
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public Artist getArtist() {
//        return artist;
//    }
//
//    @XmlElement(name = "Artist")
//    public void setArtist(Artist artist) {
//        this.artist = artist;
//    }
//
//    public Integer getYear() {
//        return year;
//    }
//
//    @XmlElement
//    public void setYear(Integer year) {
//        this.year = year;
//    }
//
////    @XmlElement
//    public Double getPrice() {
//        return price;
//    }
//
//    @XmlElement
//    public void setPrice(Double price) {
//        this.price = price;
//    }
//
//    @Override
//    public String toString() {
//        return title + " " + year + " " + price;
//    }
//}
