public class Punctul3 {
    public static void main(String[] args) {
        int[] lista = new int[]{32,44,56,22,11,66,7,2,47,98,27,99,35,94,5,38};
        int maxim = lista[0];

        for (int j : lista) {
            if (j > maxim)
                maxim = j;

        }

        System.out.println("Cel mai mare numar din lista este: " + maxim);
    }
}
