import java.util.HashMap;
import java.util.Set;
public class Ques4
{
       public HashMap<String,String> dat(HashMap<String,Integer> a)
       {
              HashMap<String,String> medal = new HashMap<>();
              Set<String> set = a.keySet();
              for(String s:set)
              {
                     Integer marks = a.get(s);
                     if(marks>=90)
                     {
                           medal.put(s,"Gold");
                     }
                     else if(marks >=80)
                     {
                           medal.put(s,"Silver");
                     }
                     else if(marks>=70)
                     {
                           medal.put(s,"Bronze");
                     }
              }
              return medal;
       }
       public static void main(String[] ar)
       {
              HashMap<String,Integer> emp = new HashMap<>();
              Ques4 c = new Ques4();
    
              emp.put("1",60);
              emp.put("2",75);
              emp.put("3",80);
              emp.put("4",90);
              emp.put("5",100);
              System.out.println();
              System.out.println(c.dat(emp));
       }
}