package String;

public class Asci {
    public static void main(String[] args){
        String name = "SUgUNA";
        char[] nameArr = name.toCharArray();
        for(int i = 0; i < nameArr.length; i++)
        {
            //nameArr[i] = (char) (nameArr[i]+32);
            if(nameArr[i]>=65 && nameArr[i] <=90)
                {
                    nameArr[i] = (char) ((nameArr[i]^(1<<5)));
                    
                }
            //System.out.println(nameArr[i]);
        }
        System.out.println(String.valueOf(nameArr));
        
    }
}
