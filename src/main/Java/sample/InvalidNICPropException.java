/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

/**
 *
 * @author Rajith
 */
public class InvalidNICPropException extends Exception{
    
    private static final long serialVersionId = 1L;

    public InvalidNICPropException() {
        super("Invalid data entered");
    }
    
}
