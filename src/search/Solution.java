package search;

import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String sortSentence(String s) {
        String arr[] = new String[s.split(" ").length];
        for(String s1 : s.split(" ")){
            int index = Integer.parseInt(s1.substring(s1.length()-1,s1.length()));
            arr[index-1] = s1.substring(0,s1.length()-1);
        }
        //ThreadPoolExecutor
     return Arrays.stream(arr).collect(Collectors.joining(" "));
    }
}