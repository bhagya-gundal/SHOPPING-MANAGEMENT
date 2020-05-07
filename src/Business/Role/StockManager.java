/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.InventoryOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.VendorRole.VendorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class StockManager extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new VendorWorkAreaJPanel(userProcessContainer, account, (InventoryOrganization)organization, enterprise);
    }
    
    
}
