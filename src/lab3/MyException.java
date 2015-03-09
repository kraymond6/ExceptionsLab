/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Kallie
 */
public class MyException extends Exception {
    private String msg = "You've encountered my exception";
    /**
     * Creates a new instance of <code>MyException</code> without detail
     * message.
     */
    public MyException() {
    }

    /**
     * Constructs an instance of <code>MyException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public MyException(String msg) {
        super(msg);
        this.msg = msg;
    }
    
    @Override
    public String getMessage(){
        return msg;
    }
}
