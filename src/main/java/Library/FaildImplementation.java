//package Library;
//
////import java.io.FileInputStream;
//import java.io.IOException;
////import java.io.ObjectInputStream;
//import java.util.Scanner;
//
//public class MainLibrary {
//
//
//
//    public static void main(String[] args) throws IOException {
//        boolean running = true;
//        while (running){
//            System.out.println("\nEnter 0 for add Novels to Library"
//                    + "\nEnter 1 for add Albums to Library"
//                    + "\nEnter 2 for delete Novels from Library"
//                    + "\nEnter 3 for delete Albums from Library"
//                    + "\nEnter 4 for list all book from Library");
//
//            Scanner in = new Scanner(System.in);
//            int answer = in.nextInt();
//
//            switch (answer){
//                case 0:
//                    String title,author;
//                    String type;
//                    double pages;
//
//                    System.out.println("Enter title: ");
//                    title = in.next();
//
//                    System.out.println("Enter author: ");
//                    author = in.next();
//
//                    System.out.println("Enter type: ");
//                    type = in.next();
//
//                    System.out.println("Enter pages: ");
//                    pages = in.nextDouble();
//
//                    Books a = new Books(title, author, type, pages);
//
//                    lib.addBooks(a);
//
//                    break;
//
//                case 1:
//
//                    break;
//
//                case 2:
//
//                    break;
//
//                case 3:
//
//                    break;
//
//                case 4:
//                    System.out.println(lib.toString());
//                    break;
//
//            }
//
//        }
//        System.exit(0);
//    }
//}
