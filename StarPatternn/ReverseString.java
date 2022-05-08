class ReverseString
{
public static void main(String []args)
{
String pitti="GicchiGannya";
char [] ch = pitti.toCharArray(); // ->[G i c c h i G a n n y a]
         
for(int i=ch.length-1; i>=0; i--)
{
System.out.print(ch[i]);
}
}
}