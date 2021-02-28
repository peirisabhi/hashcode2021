/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package littleMatej;

import java.util.regex.Pattern;

/**
 *
 * @author abhi
 */
public class A {

    static String[] pattern1 = {"3", "3", "aaa", "abc", "aba", "a*a", "aaa*", "*aaa"};
    static String[] pattern2 = {"5", "3", "eedecc", "ebdecb", "eaba", "ebcddc", "eb", "e*", "*dca", "e*c"};

    public static void main(String[] args) {

        m(pattern1);
    }

    public static void m(String[] pattern) {
        int N = Integer.parseInt(pattern[0]);
        int Q = Integer.parseInt(pattern[1]);

        int count = 2 + N;
        int count2 = count + Q;

        for (int x = count; x < count2; x++) {
//                System.out.println(pattern[x]);

//            String[] split = pattern[x].split("*");
//            String regexPattern = "";
//            for (String element : split) {
//                regexPattern +=
//            }
            String regexPattern = "";

            for (int charCount = 0; charCount < pattern[x].toCharArray().length; charCount++) {
                
//               ^a.a$
                int tempCharCount = 1 + charCount;
                
                if(charCount == 0){
                    regexPattern += "^";
                }
                
                if (pattern[x].toCharArray()[charCount] == '*' && charCount != 0 && tempCharCount != pattern[x].toCharArray().length) {
                     regexPattern += ".";
                }else{
                    regexPattern += pattern[x].toCharArray()[charCount];
                }
                
                
                if(tempCharCount == pattern[x].toCharArray().length){
                    regexPattern += "$";
                }
            }
            
            System.out.println(regexPattern);

            int matcherCount = 0;
            
            for (int i = 2; i < count; i++) {
//            System.out.println(pattern[i]);

                if(Pattern.compile(regexPattern).matcher(pattern[i]).matches()){
                    matcherCount ++;
                }

            }
            System.out.println(matcherCount);
        }

    }

}
