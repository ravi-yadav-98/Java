public class MultiDimensionArray {
    public static void main(String[] args) {
        int[][] flats;
        flats = new int[3][3];
        flats[0][0] = 001;
        flats[0][1] = 002;
        flats[0][2] = 003;
        flats[1][0] = 101;
        flats[1][1] = 102;
        flats[1][2] = 103;
        flats[2][0] = 201;
        flats[2][1] = 202;
        flats[2][2] = 203;

        //print
        for(int i=0; i<flats.length; i++)
        {
            for(int j=0; j<flats[0].length; j++)
            {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }


    }
}
