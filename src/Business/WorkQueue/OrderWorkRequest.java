/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author raunak
 */
public class OrderWorkRequest extends WorkRequest{
    
    private String orderResult;

    public String getorderResult() {
        return orderResult;
    }

    public void setorderResult(String orderResult) {
        this.orderResult = orderResult;
    }
    
    
}
