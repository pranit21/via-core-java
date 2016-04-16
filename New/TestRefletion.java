
import java.lang.reflect.Method;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
public class TestRefletion {
    public static void main(String[] args) {
        String str="hello";
        Class c=str.getClass();
        Method[] m=c.getMethods();
        for(int i=0;i<m.length;i++)
            System.out.println(m[i].getName());
    }
}
