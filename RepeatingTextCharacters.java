import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
import java.lang.*;
class RepeatingTextCharacters {
    public static void main(String[] args) {
    String str = "allahbabah";
    char dst[];
    char mem[];
    dst = new char[str.length()];
    mem = new char[str.length()];
    str.getChars(0, str.length(), dst, 0);
    
    int m;
    int memElNum = 0;
    for (int i = 0; i < str.length(); i++){
        m = 0;
        for (int j = 0; j < str.length(); j++){
            if (dst[i] != mem[j]){
                m = m + 1;
                if (m == str.length()){
                    mem[memElNum] = dst[i]; 
                    memElNum = memElNum + 1;
                }
            }
        }
    }
    System.out.println(mem);
    }
}
