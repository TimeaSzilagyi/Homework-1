package Library;

//public class Albums {
//        private String Title;
//        private String PaperQuality;
//        private String Pages;
//
//        public Albums(String title, String paperQuality, String pages){
//            Title = title;
//            PaperQuality = paperQuality;
//            Pages = pages;
//        }
//
//    @Override
//    public String toString() {
//        return "Albums{" +
//                "Title='" + Title + '\'' +
//                ", PaperQuality='" + PaperQuality + '\'' +
//                ", Pages='" + Pages + '\'' +
//                '}';
//    }
//}

public class Albums extends Books{
    String PaperQuality;

    public Albums(String Title, String Author, Integer noPages, String PaperQuality) {

        super(Title, Title, Author, noPages);
        this.PaperQuality = PaperQuality;
    }

    @Override
    public String toString() {
        return "Book: " + Title + " written by " + Author
                + ", has " + noPages + " pages and it is a"
                + PaperQuality + " paperQuality";
    }
}
