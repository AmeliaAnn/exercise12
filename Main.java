package exercise12.com;

import java.io.*;
import java.util.*;
public class Main {

  public static void main(String[] args) {
  
  
   Scanner in = new Scanner(System.in);
   System.out.println("Введите строку: ");
   String S = in.nextLine();
   String Str = S.replaceAll("\\s","");
   System.out.println("Строка без пробелов: " + Str);
   
  
  }
}
