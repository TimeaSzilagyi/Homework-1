package Library;

//public class Books {
//    public static <Novels> void main(String[] args) {


//       Novels library1;
//       Novels library2;
//       Novels library3;
//       Albums library4;

//       library1 = new Novels("GreenLights","Matthew McConaughey","Mystery","304");
//       library2 = new Novels("Heroes' Feast","Kyle Newman","Fantasy","240");
//       library3 = new Novels("Price of Valor","Susan May Warren","Adventure","368");
//       library4 = new Albums("The Photographer's Eye", "Glossy", "156");

//       System.out.println(library1);
//       System.out.println(library2);
//       System.out.println(library3);
//       System.out.println(library4);
//    }
//}

public class Books{
   String Title;
   String Author;
   Integer noPages;

   public Books(String title, String Title, String Author, Integer noPages){
      this.Title = Title;
      this.Author = Author;
      this.noPages = noPages;
   }
}