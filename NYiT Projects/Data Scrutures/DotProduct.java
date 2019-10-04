public class DotProduct {
    public static void main(String[] args) {
        int[] v1 = {3,5,7,2,8};
        int[] v2 = {2,6,9,4,3};
        int dotProd = 0;

        for (int i = 0; i < v1.length; i++) {
            dotProd += v1[i] * v2[i];
        }

        System.out.print("The dot product of the two vectors is: " + dotProd);
    }
}
