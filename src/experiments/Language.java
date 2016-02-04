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
public interface Language {

    public abstract String getLanguageFamily();

    public abstract void setLanguageFamily(String languageFamily);

    public abstract int getNumAlphabetCharacters();

    public abstract void setNumAlphabetCharacters(int numAlphabetCharacters);
    
    
}
