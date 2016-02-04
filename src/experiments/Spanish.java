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
public class Spanish implements Language{
    private String languageFamily;
    private int numAlphabetCharacters;
    
        
    @Override
    public String getLanguageFamily() {
        return languageFamily;
    }
    
    @Override
    public void setLanguageFamily(String languageFamily) {
        this.languageFamily = languageFamily;
    }
    
    @Override
    public int getNumAlphabetCharacters() {
        return numAlphabetCharacters;
    }
    
    @Override
    public void setNumAlphabetCharacters(int numAlphabetCharacters) {
        this.numAlphabetCharacters = numAlphabetCharacters;
    }
}
