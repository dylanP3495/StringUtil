
/**
 * Write a description of class StringUtil here.
 *
 * @author Dylan Palafox
 * @version 10/19/17
 */
public class StringUtil 
{
    public static String apcsReplaceAll(){
        String str = "aaaaa";
        String oldStr = "aaa";
        String newStr = "b";
        String firstPart = "";
        String lastPart = str;
        int pos = lastPart.indexOf(oldStr);
        while (pos >= 0){
         firstPart += lastPart.substring(0, pos);
         firstPart += newStr;
         lastPart = lastPart.substring(pos+ oldStr.length());
         pos = lastPart.indexOf(oldStr);
        }
        return firstPart + lastPart;
}
}