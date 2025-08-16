//Inverted_number_halfPyramid
public class Inverted_number_halfPyramid {
    public static void inverted_number_halfPyramid(int n){
        //outer
        for(int i=1;i<=n; i++){
            //inner
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        inverted_number_halfPyramid(5);
    }
}
