package sample;

import org.joda.time.DateTime;

/**
 *
 * @author Rajith
 */
public class Interpreter {

    private DateTime birthday;
    private boolean voter;
    private String gender;
    
    
    
    public void interpret (NICProp nicProp){
        //the interpretting logic is inserted here
    }

    public NICProp createNICProp(String id) throws InvalidNICPropException {

        try {
            return new NICProp(id);
        } catch (Exception e) {
            throw new InvalidNICPropException();
        }
    }

    public boolean validate(NICProp nicProp) {

        if (nicProp.getId().length() != 10) {
            return false;
        }

        try {
            Long.parseLong(nicProp.getId().substring(0, 9));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public DateTime getBirthday() {
        return birthday;
    }

    public boolean isVoter() {
        return voter;
    }

    public String getGender() {
        return gender;
    }
}
