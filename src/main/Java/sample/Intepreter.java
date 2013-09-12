
package sample;

/**
 *
 * @author Rajith
 */
public class Intepreter {
    

    public NICProp createBmiProp (String id) throws InvalidNICPropException{
        
        try {
            return new NICProp(id);
        }
        catch (Exception e){
            throw new InvalidNICPropException();
        }
    }
    
    public boolean validate (NICProp nicProp) {
        
        if (nicProp.getId().length()!=10){
            return false;
        }
        
        try{
            Long.parseLong(nicProp.getId().substring(0, 9));
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    
    
}
