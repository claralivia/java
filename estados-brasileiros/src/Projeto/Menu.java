package Projeto;

import java.awt.Toolkit;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("made in Brazil");
        setBackground(java.awt.Color.blue);
        setLocation(new java.awt.Point(350, 210));

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));

        jTree1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTree1.setForeground(new java.awt.Color(255, 255, 255));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Regiões");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Norte");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Acre");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Amapá");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Amazonas");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Pará");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Rondônia");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Roraima");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Tocantis");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Nordeste");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Alagoas");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Bahia");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Ceará");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Maranhão");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Paraíba");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Pernambuco");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Piauí");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Rio Grande do Norte");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Sergipe");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Centroeste");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Distrito Federal (!)");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Goiás");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Mato Grosso");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Mato Grosso do Sul");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Sudeste");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Espírito Santo");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Minas Gerais");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Rio de Janeiro");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("São Paulo");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Sul");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Paraná");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Rio Grande do Sul");
        treeNode2.add(treeNode3);
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("Santa Catarina");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        jTree1.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jTree1.setAlignmentX(0.0F);
        jTree1.setAlignmentY(0.0F);
        jTree1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTree1.setEditable(true);
        jTree1.setRootVisible(false);
        jTree1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTree1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTree1);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projeto/Imagens/Página Inicial.jpg"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Projeto/Imagens/Título.jpg"))); // NOI18N
        jLabel2.setAlignmentY(0.0F);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTree1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTree1MouseClicked
        
        String menu = jTree1.getLastSelectedPathComponent().toString();
        
        if(menu.equals("Acre")){
            new jAcre().setVisible(true);
        }
        
        if(menu.equals("Alagoas")){
            new jAlagoas().setVisible(true);
        }
        
        if(menu.equals("Amapá")){
            new jAmapa().setVisible(true);
        }
        
        if(menu.equals("Amazonas")){
            new jAmazonas().setVisible(true);
        }
        
        if(menu.equals("Bahia")){
            new jBahia().setVisible(true);
        }
        
        if(menu.equals("Ceará")){
            new jCeara().setVisible(true);
        }
        
        if(menu.equals("Distrito Federal (!)")){
            new jDistritoFederal().setVisible(true);
        }
        
        if(menu.equals("Espírito Santo")){
            new jEspiritoSanto().setVisible(true);
        }
        
        if(menu.equals("Goiás")){
            new jGoias().setVisible(true);
        }
        
        if(menu.equals("Maranhão")){
            new jMaranhao().setVisible(true);
        }
        
        if(menu.equals("Mato Grosso")){
            new jMatoGrosso().setVisible(true);
        }
        
        if(menu.equals("Mato Grosso do Sul")){
            new jMatoGrossoDoSul().setVisible(true);
        }
        
        if(menu.equals("Minas Gerais")){
            new jMinasGerais().setVisible(true);
        }
        
        if(menu.equals("Pará")){
            new jPara().setVisible(true);
        }
        
        if(menu.equals("Paraíba")){
            new jParaiba().setVisible(true);
        }
        
        if(menu.equals("Paraná")){
            new jParana().setVisible(true);
        }
        
        if(menu.equals("Pernambuco")){
            new jPernambuco().setVisible(true);
        }
        
        if(menu.equals("Piauí")){
            new jPiaui().setVisible(true);
        }
        
        if(menu.equals("Rio de Janeiro")){
            new jRioDeJaneiro().setVisible(true);
        }
        
        if(menu.equals("Rio Grande do Norte")){
            new jRioGrandeDoNorte().setVisible(true);
        }
        
        if(menu.equals("Rio Grande do Sul")){
            new jRioGrandeDoSul().setVisible(true);
        }
        
        if(menu.equals("Rondônia")){
            new jRondonia().setVisible(true);
        }
        
        if(menu.equals("Santa Catarina")){
            new jSantaCatarina().setVisible(true);
        }
        
        if(menu.equals("São Paulo")){
            new jSaoPaulo().setVisible(true);
        }
        
        if(menu.equals("Sergipe")){
            new jSergipe().setVisible(true);
        }
        
        if(menu.equals("Tocantis")){
            new jTocantins().setVisible(true);
        }
    }//GEN-LAST:event_jTree1MouseClicked

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables

    
}
