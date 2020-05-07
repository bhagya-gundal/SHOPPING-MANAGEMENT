/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VendorRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.InventoryOrganization;
import Business.Product.Product;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrderWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class VendorWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private InventoryOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public VendorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, InventoryOrganization organization, Enterprise enterprise) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        valueLabel.setText(enterprise.getName());
        populateRequestTable();
    }

    public void populateRequestTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);
        for (WorkRequest request : userAccount.getWorkQueue().getWorkRequestList()) {
            Object[] row = new Object[4];
            row[0] = request.getMessage();
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            String result = ((OrderWorkRequest) request).getorderResult();
            row[3] = result == null ? "Waiting" : result;

            model.addRow(row);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        requestTestJButton = new javax.swing.JButton();
        refreshTestJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        manageProductsJButton = new javax.swing.JButton();
        addProductsExcelJButton = new javax.swing.JButton();

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Receiver", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
        }

        requestTestJButton.setText("Request Test");
        requestTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestTestJButtonActionPerformed(evt);
            }
        });

        refreshTestJButton.setText("Refresh");
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("EnterPrise :");

        valueLabel.setText("<value>");

        manageProductsJButton.setText("Manage Products");
        manageProductsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageProductsJButtonActionPerformed(evt);
            }
        });

        addProductsExcelJButton.setText("Add Products (Excel)");
        addProductsExcelJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addProductsExcelJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(192, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refreshTestJButton)
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addProductsExcelJButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(manageProductsJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(requestTestJButton)
                        .addGap(86, 86, 86))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(refreshTestJButton)
                        .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(requestTestJButton)
                    .addComponent(manageProductsJButton))
                .addGap(18, 18, 18)
                .addComponent(addProductsExcelJButton)
                .addContainerGap(136, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void requestTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestTestJButtonActionPerformed

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("RequestLabTestJPanel", new RequestJPanel(userProcessContainer, userAccount, enterprise));
        layout.next(userProcessContainer);

    }//GEN-LAST:event_requestTestJButtonActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();

    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void manageProductsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageProductsJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manageProductsJButtonActionPerformed

    private void addProductsExcelJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addProductsExcelJButtonActionPerformed
        try {
            // TODO add your handling code here:
            JFileChooser j = new JFileChooser();
            j.showOpenDialog(userProcessContainer);
            String filePath = j.getSelectedFile().getAbsolutePath();
            HashMap<String, ArrayList<Product>> productsMap = ReadFromProductsExcel(filePath);
            userAccount.getEmployee().setProductsHashMap(productsMap);
        } catch (IOException ex) {
            Logger.getLogger(VendorWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addProductsExcelJButtonActionPerformed

    private HashMap<String, ArrayList<Product>> ReadFromProductsExcel(String pathToCsv) throws FileNotFoundException, IOException {
        String[] categoryArray = {"Newly Added", "Electronics", "Mobiles", "Kids Corner"};
        String[] collections = {"products", "productCategory"};
        HashMap<String, ArrayList<Product>> productsListMap = new HashMap<String, ArrayList<Product>>();
        String row = "";
        BufferedReader csvReader = new BufferedReader(new FileReader(pathToCsv));
        int rowCount = 0;
        Product lastAddedProduct = null;
        while ((row = csvReader.readLine()) != null) {
            if (rowCount == 0) {
                rowCount++;
                continue;
            }
            String[] data = row.split(",");
            if (data.length == 1) {
                lastAddedProduct.getDescription().add(data[0]);
                continue;
            }
            if (data.length == 2) {
                lastAddedProduct.getDescription().add(data[0] + " " + data[1]);
                continue;
            }
            String category = data[6];
            // DBObject dbObject = getDocumentByProperty(categoryCol, "name", category);
            // String id = dbObject.get("_id").toString();
            Product product = new Product();
            product.setBrand_name(data[1]);
            //  product.setCategoryId(id);
            product.getDescription().add(data[7]);
            product.setImageFileName(data[5]);
            product.setModel(data[2]);
            product.setPrice(Integer.parseInt(data[3]));
            product.setStock(Integer.parseInt(data[4]));
            if (productsListMap.containsKey(category)) {
                ArrayList<Product> arrayList = productsListMap.get(category);
                arrayList.add(product);
                lastAddedProduct = product;
            } else {
                ArrayList<Product> arrayList = new ArrayList<Product>();
                arrayList.add(product);
                lastAddedProduct = product;
                productsListMap.put(category, arrayList);
            }
            rowCount++;
            // do something with the data
        }
        csvReader.close();
        return productsListMap;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addProductsExcelJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton manageProductsJButton;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JButton requestTestJButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
