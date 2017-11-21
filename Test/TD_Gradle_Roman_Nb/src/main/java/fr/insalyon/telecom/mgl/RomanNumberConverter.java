/*package fr.insalyon.telecom.mgl;*/

public class RomanNumberConverter {

  public static void main(String[] args){
    int res =  convert(args[0]);
    System.out.println(res);
  }

    public static int convert(String romanNumber) {
      int rNumber=0;
      for(int i=0;i<romanNumber.length();i++)
      {
        switch(romanNumber.charAt(i)){
          case 'I':  rNumber+=1;break;
          case 'V':  rNumber+=5;break;
          case 'X':  rNumber+=10;break;
          case 'L':  rNumber+=50;break;
          case 'C':  rNumber+=100;break;
          case 'D':  rNumber+=500;break;
          case 'M':  rNumber+=1000;break;
          default:  System.out.println("Not managed");
        }
      }
      return rNumber;
    }


 /* public String convert(int number){

}*/

}
