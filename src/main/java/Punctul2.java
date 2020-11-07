public class Punctul2 {
    public static void main(String[] args) {
        int[] lista = new int[]{32,44,56,22,11,66,7,2,47,98,27,99,35,94,5,38};
        int minim = lista[0];

        for (int j : lista) {
            if (j < minim)
                minim = j;

        }

        System.out.println("Cel mai mic numar din lista este: " + minim);
    }
}
