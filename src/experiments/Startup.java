/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiments;

/**
 *
 * @author ritu
 */
public class Startup {
    public static void main(String[] args) {
        Language[] languages = new Language[2];
        languages[0] = new Spanish();
        languages[1] = new French();

        for(Language l : languages) {
            l.setLanguageFamily("Romance");
            System.out.println(l.getLanguageFamily());
        }
    }
}
