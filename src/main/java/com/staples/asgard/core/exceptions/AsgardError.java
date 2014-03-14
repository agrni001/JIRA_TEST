/**
 * 
 */
package com.staples.asgard.core.exceptions;

/**
 * This class encapsulates the error codes and messages for all errors in the system
 * @author Sapient
 *
 */
public class AsgardError {

    private String code;
       private String customMessage;

    public AsgardError(String code, String message) {
        this.code = code;
        this.customMessage = message;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getCustomMessage() {
        return customMessage;
    }
    public void setCustomMessage(String message) {
        this.customMessage = message;
    }
    @Override
    public String toString(){
    	StringBuffer exception = new StringBuffer();
    	exception.append(getCode()).append(" : ").append(getCustomMessage());
    	return exception.toString();
    }

}
