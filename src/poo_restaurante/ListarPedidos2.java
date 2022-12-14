package poo_restaurante;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Cphyros
 */
public class ListarPedidos2 extends javax.swing.JInternalFrame {

    //ATRIBUTOS
    DefaultTableModel modelo;
    IngresarP formIngresarP;

    //CONSTRUCTOR
    public ListarPedidos2(IngresarP form) {
        initComponents();
        formIngresarP = form;
        modelo = new DefaultTableModel();
        modelo.addColumn("Cliente");
        modelo.addColumn("Identificación");
        modelo.addColumn("Dirección");
        modelo.addColumn("Pedido");
        modelo.addColumn("Precio");
        this.CargarTabla();
    }

    //SE LISTAN LOS DATOS EN TABLA DEL PEDIDO HASTA EL MOMENTO
    public void CargarTabla() {
        listado.setModel(modelo);
        modelo.getDataVector().clear();
        int i = 0;
        Pedido e[] = formIngresarP.deliArray;
        Object[] fila = new Object[5];
        while (i < formIngresarP.cont) {
            fila[0] = e[i].getClienteNombre().getNombre();
            fila[1] = e[i].getId();
            fila[2] = e[i].getDireccion();
            fila[3] = e[i].getPedido();
            fila[4] = e[i].getPrecio();
            modelo.addRow(fila);
            i++;
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listado = new javax.swing.JTable();
        NombreLogo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(145, 31, 39));
        setClosable(true);
        setTitle("Listado de Pedidos en Tabla");

        jPanel1.setBackground(new java.awt.Color(145, 31, 39));
        jPanel1.setForeground(new java.awt.Color(145, 31, 39));

        listado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(listado);

        NombreLogo.setFont(new java.awt.Font("Cooper Black", 0, 48)); // NOI18N
        NombreLogo.setForeground(new java.awt.Color(250, 206, 127));
        NombreLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NombreLogo.setText("Listado de Pedido");
        NombreLogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenés/gestionarPedidos2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(NombreLogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NombreLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NombreLogo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listado;
    // End of variables declaration//GEN-END:variables
}
