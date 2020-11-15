package Library;

//public class Novels{
//    private String Title;
//    private String Author;
//    private String Type;
//    private String Pages;
//
//    public Novels(String title, String author, String type, String pages){
//        Title = title;
//        Author = author;
//        Type = type;
//        Pages = pages;
//    }
//
//    @Override
//    public String toString() {
//        return "Novels{" +
//                "Title='" + Title + '\'' +
//                ", Author='" + Author + '\'' +
//                ", Type='" + Type + '\'' +
//                ", Pages='" + Pages + '\'' +
//                '}';
//    }
//}

public class Novels extends Books{
    String Type;

    public Novels(String Title, String Author, Integer noPages, String Type) {

        super(Title, Title, Author, noPages);
        this.Type = Type;
    }

    @Override
    public String toString() {
        return "Book " + Title +
                " written by " + Author + " Has "
                + noPages + " novel";
    }
}