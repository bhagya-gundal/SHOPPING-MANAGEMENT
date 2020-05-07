/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Product;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kesha
 */
public class Order {
   //private UserAccount userAcc;
    List<Item> itemlist=new ArrayList<Item>();
   private int totalprice;
   public void addItem(Item item){
       this.itemlist.add(item);
       this.totalprice+=(item.getCost()*item.getQuantity());
   }

    public List<Item> getItemlist() {
        return itemlist;
    }

    public void setItemlist(List<Item> itemlist) {
        this.itemlist = itemlist;
    }

    public int getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }
   
   
    
    
}
