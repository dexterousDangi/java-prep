class Get_roundOFF_number {
    public static void main( String args[] ) {
      double num1 = 74.65;
     
      //we can get roundoff number by using Math.round(args) method
      System.out.println(Math.round(num1));

      float num2 = 1337.345523f;
      System.out.println(Math.round(num2));
      
      DateFormat df = new SimpleDateFormat(""dd/MM/yy HH:mm:ss"");
      Date dateobj = new Date();
      System.out.println(df.format(dateobj));
      
    }
}
