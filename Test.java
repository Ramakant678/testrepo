import java.util.*;

class A{
public static void main(String[] args){
String str="aabbcdde";
//String str1="My name is khan My name";
//Find the frequency or above String
char []c=str.toCharArray();
HashMap<Character,Integer> hm=new HashMap();
for(char x:c){
if(hm.containsKey(x)){
hm.put(x,hm.get(x)+1);
}
else
hm.put(x,1);
}
System.out.println(hm);

}

}