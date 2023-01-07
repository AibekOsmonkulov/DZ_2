public class Main {

  public static void main (String[] args){
      double number [] = {1.2, 3.5, -2.2, 1.7, 23.67, -43.5, -14.2, 7.7, -6.54, 85.2, -92.4, 66.4, 2.3, -33.3, 99.8,};
      double summa = 0;
      int col = 0;
      boolean proverka = false;
      for (double forEach : number) {
          if (forEach < 0) {
              proverka = true;
          }else if (forEach > 0 && proverka){
              summa+=forEach;
              col++;
              System.out.println(forEach);
          }
      }

    }
}