/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Charlie
 */
public class ParseCardsException extends Exception{
    
    public ParseCardsException(String problema){
        super(problema);
    }
    
    public ParseCardsException(){}
    
}
