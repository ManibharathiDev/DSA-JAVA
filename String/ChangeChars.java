package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ChangeChars {
    public static void main(String[] args)
    {
        String A = "abcabbcce";
        //String A = "umeaylnlfd";
        int B = 3;
        System.out.println(solve(A, B));
    }

    private static int solve(String A, int B)
    {
        if(A.length() == 1)
            return 1;
        int[] arr = new int[26];
        Arrays.fill(arr, 0);
        int ans = 0;
        for(int i = 0; i < A.length(); i++)
        {
            int idx = A.charAt(i)-'a';
            arr[idx]++;
        }
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]>0)
                ans++;
        }

        for(int i = 0; i < 26; i++)
        {
            if(arr[i]>0 && B >= arr[i])
            {
                ans--;
                B -= arr[i];
            }
        }
        return ans;
    }

    

    // private static int solve(String A, int B)
    // {
    //     char[] As = A.toCharArray();
    //     HashMap<Character,Integer> hm = new HashMap<>();
    //     for(int i = 0; i < As.length; i++)
    //     {
    //         if(hm.containsKey(As[i]))
    //         {
    //             int value = hm.get(As[i]);
    //             hm.put(As[i],value+1);
    //         }
    //         else{
    //             hm.put(As[i],1);
    //         }
    //     }
        
    //     System.out.println(hm);
    //     ArrayList<String> list = new ArrayList<>();
    //     for (Map.Entry<Character, Imt> entry : hm.entrySet()) {
    //         list.add(entry.getValue());
    //     }
    //     Collections.sort(list, new Comparator<String>() {
    //         public int compare(String str, String str1) {
    //             return (str).compareTo(str1);
    //         }
    //     });
    //     for (String str : list) {
    //         for (Entry<String, String> entry : map.entrySet()) {
    //             if (entry.getValue().equals(str)) {
    //                 sortedMap.put(entry.getKey(), str);
    //             }
    //         }
    //     }

    //     // for(int i = 0; i < As.length; i++)
    //     // {
    //     //     if(hm.containsKey(As[i]))
    //     //     {
    //     //         int value = hm.get(As[i]);
    //     //         if(value <= B)
    //     //         {
    //     //             int val = value-B;
    //     //             hm.put(As[i], val);
    //     //             if(val == 0 || value == -1)
    //     //                 hm.remove(As[i]);
    //     //             B -= value;
    //     //         }
    //     //     }
            
    //     // }
    //     // System.out.println(hm);
    //     return 0;

    // }

    // private static int solve(String A, int B)
    // {
    //     HashMap<Character,Integer> hm = new HashMap<>();
    //     char[] As = A.toCharArray();
    //     for(int i = 0; i < As.length; i++)
    //     {
    //         if(hm.containsKey(As[i]))
    //         {
    //             int value = hm.get(As[i]);
    //             hm.put(As[i],value+1);
    //         }
    //         else{
    //             hm.put(As[i],1);
    //         }
    //     }
    //     System.out.println(hm);
    //     int count = hm.size();
    //     System.out.println(count);

    //     for(Entry<Character, Integer> entry : hm.entrySet()) {
    //         Character key = entry.getKey();
    //         Integer value = entry.getValue();
    //         System.out.println("Value are =>"+value);
    //         if(value < B)
    //             count -=value;
    //     }
        
    //     return count;
    // }

    public static int getMin(int current, int previous)
    {
        if(current < previous)
            return current;
        return previous;
    }
}
