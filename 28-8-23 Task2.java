import java.io.*;
class HelloWorld {
    public static void main(String[] args) {
    String str = "Hello";
    char dst[];
    dst = new char[str.length()];
    str.getChars(0, str.length(), dst, 0);
    for(int i=0; i<dst.length; i++) {
         for (int j=i+1; j<dst.length; j++) {
            if(dst[i] == dst[j]) {
               System.out.println(dst[j]);
            }
         }
      }
    }
}