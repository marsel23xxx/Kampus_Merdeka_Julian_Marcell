/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package kampus_merdeka;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Julian Marcell
 */
public class coba {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String e;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input email ? ");
        e = sc.nextLine();
        String regex = "^([_a-z0-9-]+(\\.[_a-z0-9-]+)@[a-z0-9-]+(\\.[a-z0-9-]+)(\\.[a-z]{2,4})){0,20}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(e);
        if(!m.matches() && e.length()>=20){
            System.out.println("email salah");   
        }else{
        System.out.println("emailmu : "+e);
        }
    }
    
}
