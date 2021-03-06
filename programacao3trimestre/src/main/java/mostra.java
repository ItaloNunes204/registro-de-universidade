
import java.util.ArrayList;
import javax.swing.DefaultListModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cliente
 */
public class mostra extends javax.swing.JFrame {
    ArrayList<Tecnico> listaTec=new ArrayList();
    ArrayList<Aluno> listaAluno=new ArrayList();
    ArrayList<Funcionario> listaFunci=new ArrayList();
    ArrayList<Professor> listaPro=new ArrayList();
    ArrayList<Curso> listaCurso = new ArrayList();
    ArrayList<Diciplinas> listaDic = new ArrayList();
    /**
     * Creates new form mostra
     */
    public mostra() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public mostra(ArrayList<Aluno> listaAlun, ArrayList<Tecnico> listaTecn, 
    ArrayList<Funcionario> listaFun, ArrayList<Professor> listaProf,ArrayList<Curso> listaCursos,
    int nus,ArrayList<Diciplinas> listaDici) {
        initComponents();
        listaAluno=listaAlun;
        listaTec=listaTecn;
        listaFunci=listaFun;
        listaPro=listaProf;
        listaCurso=listaCursos;
        listaDic=listaDici;
        mostraDados(nus);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listas = new javax.swing.JList<>();
        retorna = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(listas);

        retorna.setText("retorna");
        retorna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retornaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(284, Short.MAX_VALUE)
                .addComponent(retorna)
                .addGap(272, 272, 272))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(retorna)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void retornaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retornaActionPerformed
        // TODO add your handling code here:
        principal prin=new principal(listaAluno,listaTec,listaFunci,listaPro,listaCurso,listaDic);
        prin.setLocationRelativeTo(null);
        prin.setVisible(true); 
        dispose();
    }//GEN-LAST:event_retornaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mostra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new mostra().setVisible(true);
        });
    }
    public void mostraDados(int nu){
         DefaultListModel lista = new  DefaultListModel ();
        switch(nu){
            case 1:
                        for(int i=0;i<listaAluno.size();i++){
                        lista.addElement(listaAluno.get(i));
                        }
                        listas.setModel(lista);
            break;
            case 2:
                        for(int i=0;i<listaTec.size();i++){
                        lista.addElement(listaTec.get(i));
                        }
                        listas.setModel(lista);
            break;
            case 3:
                        for(int i=0;i<listaFunci.size();i++){
                        lista.addElement(listaFunci.get(i));
                        }
                        listas.setModel(lista);
            break;
            case 4:
                        for(int i=0;i<listaPro.size();i++){
                        lista.addElement(listaPro.get(i));
                        }
                        listas.setModel(lista);
            break;
            case 5:
                        for(int i=0;i<listaCurso.size();i++){
                        lista.addElement(listaCurso.get(i));
                        }
                        listas.setModel(lista);
            break;
            case 6:
                        for(int i=0;i<listaDic.size();i++){
                        lista.addElement(listaDic.get(i));
                        }
                        listas.setModel(lista);
            break;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listas;
    private javax.swing.JButton retorna;
    // End of variables declaration//GEN-END:variables
}
