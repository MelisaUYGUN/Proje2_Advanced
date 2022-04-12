package Projects_02;

public class sumTotal {

    /*
        Create String 2D array

        {{"$12" , "$22" , "5"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}

        if the String has $ multiply by 3.2

        if the String has € multiply by 4.2

        return the double

     */


    /*
        String 2D array oluştur

       {{"$12" , "$22" , "5$"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}

       String de $ varsa 3.2 ile çarp

       String de € varsa 4.2 ile çarp

       double return et

    */
    public static void main(String[] args) {

//        Koda burdan başlayın

        String  arr [][] = {{"$12" , "$22" , "5$"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}};
         double toplam = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                if (arr[i][j].contains("$")) {
                    toplam += Double.parseDouble((arr[i][j].replace("$", ""))) * 3.2;
                } else if ((arr[i][j].contains("€"))) {
                    toplam += Double.parseDouble((arr[i][j].replace("€", " "))) * 4.2;
                }

        }
        System.out.println("toplam :" + toplam);
    }
}



