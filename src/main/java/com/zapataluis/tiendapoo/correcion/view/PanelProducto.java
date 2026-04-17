package com.zapataluis.tiendapoo.correcion.view;

import com.zapataluis.tiendapoo.correcion.model.Producto;
import com.zapataluis.tiendapoo.servicio.IProductoServicio;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class PanelProducto extends javax.swing.JPanel {

   
    private final IProductoServicio productoServicio;
    private int idProductoEnEdicion = -1;
    private final DefaultTableModel modelo;

    public PanelProducto(IProductoServicio productoServicio) {
        this.productoServicio = productoServicio;
        initComponents();
        txtCodigo.setPreferredSize(new java.awt.Dimension(200, 25));
        txtNombre.setPreferredSize(new java.awt.Dimension(200, 25));
        txtTalla.setPreferredSize(new java.awt.Dimension(200, 25));
        txtColor.setPreferredSize(new java.awt.Dimension(200, 25));
        txtPrecio.setPreferredSize(new java.awt.Dimension(200, 25));
        txtStock.setPreferredSize(new java.awt.Dimension(200, 25));
        modelo = new DefaultTableModel();
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Talla");
        modelo.addColumn("Color");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        tablaProductos.setModel(modelo);
        cargarTabla();
        tablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
        cargarProductoEnFormulario();
    }
});
    }
    
    private void cargarProductoEnFormulario() {
    int fila = tablaProductos.getSelectedRow();
    if (fila == -1) return;

    idProductoEnEdicion = (int) modelo.getValueAt(fila, 0);
    txtNombre.setText(modelo.getValueAt(fila, 1).toString());
    txtTalla.setText(modelo.getValueAt(fila, 2).toString());
    txtColor.setText(modelo.getValueAt(fila, 3).toString());
    txtPrecio.setText(modelo.getValueAt(fila, 4).toString());
    txtStock.setText(modelo.getValueAt(fila, 5).toString());
}

    public void cargarTabla() {
        modelo.setRowCount(0);
        for (Producto p : productoServicio.getProductos()) {
            Object[] fila = {
                p.getId(),
                p.getNombre(),
                p.getTalla(),
                p.getColor(),
                p.getPrecio(),
                p.getStock()
            };
           
            modelo.addRow(fila);
        }
    }

    private void limpiarFormulario() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtTalla.setText("");
        txtColor.setText("");
        txtPrecio.setText("");
        txtStock.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelNombre = new javax.swing.JLabel();
        labelTalla = new javax.swing.JLabel();
        labelColor = new javax.swing.JLabel();
        labelPrecio = new javax.swing.JLabel();
        labelStock = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        labelCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtTalla = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        labelNombre.setText("Nombre:");

        labelTalla.setText("Talla:");

        labelColor.setText("Color:");

        labelPrecio.setText("Precio:");

        labelStock.setText("Stock:");

        btnRegistrar.setBackground(new java.awt.Color(51, 255, 0));
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(this::btnRegistrarActionPerformed);

        labelCodigo.setText("Codigo:");

        txtCodigo.addActionListener(this::txtCodigoActionPerformed);

        btnLimpiar.setBackground(new java.awt.Color(51, 204, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(this::btnLimpiarActionPerformed);

        tablaProductos.setBackground(new java.awt.Color(204, 204, 255));
        tablaProductos.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Talla", "Color", "precio", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaProductos);

        btnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);

        btnEditar.setBackground(new java.awt.Color(255, 255, 0));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(this::btnEditarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelPrecio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelStock)
                                .addGap(18, 18, 18)
                                .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelNombre)
                                    .addComponent(labelCodigo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelTalla)
                                    .addComponent(labelColor))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(txtTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegistrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelCodigo)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelTalla)
                            .addComponent(txtTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelColor)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPrecio)
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar)
                            .addComponent(btnEditar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelStock)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnLimpiar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try {
            String nombre = txtNombre.getText().trim();
            String talla = txtTalla.getText().trim();
            String color = txtColor.getText().trim();
            String codigo = txtCodigo.getText().trim();
            int precio = Integer.parseInt(txtPrecio.getText().trim());
            int stock = Integer.parseInt(txtStock.getText().trim());

            if (nombre.isEmpty() || codigo.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Nombre y código no pueden estar vacíos.");
                return;
            }

            int idProducto = productoServicio.registrarProducto(codigo, nombre, talla, color, precio, stock);
            JOptionPane.showMessageDialog(this, "Producto registrado con éxito. ID: " + idProducto,
                    "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
            cargarTabla();
            limpiarFormulario();

        } catch (IllegalArgumentException e) {
    // Captura las validaciones del servicio
    JOptionPane.showMessageDialog(this, e.getMessage());
}
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarFormulario();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int filaSeleccionada = tablaProductos.getSelectedRow();

if (filaSeleccionada == -1) {
    JOptionPane.showMessageDialog(this, "Selecciona un producto de la tabla primero.");
    return;
}

int id = (int) modelo.getValueAt(filaSeleccionada, 0);
int confirmacion = JOptionPane.showConfirmDialog(this,
        "¿Estás seguro de eliminar este producto?", "Confirmar",
        JOptionPane.YES_NO_OPTION);

if (confirmacion == JOptionPane.YES_OPTION) {
    productoServicio.eliminarProducto(id);
    cargarTabla();
    limpiarFormulario();
    JOptionPane.showMessageDialog(this, "Producto eliminado correctamente.");
}
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        
        
        if (idProductoEnEdicion == -1) {
        JOptionPane.showMessageDialog(this, 
            "Primero haz clic en un cliente de la tabla para seleccionarlo.");
        return;
    }

    try {
            String nombre = txtNombre.getText().trim();
            String talla = txtTalla.getText().trim();
            String color = txtColor.getText().trim();
            String codigo = txtCodigo.getText().trim();
            int precio = Integer.parseInt(txtPrecio.getText().trim());
            int stock = Integer.parseInt(txtStock.getText().trim());

        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El nombre no puede estar vacío.");
            return;
        }

        boolean exito = productoServicio.editarProducto(idProductoEnEdicion, codigo, nombre, talla, color, precio, stock);

        if (exito) {
            JOptionPane.showMessageDialog(this, "Cliente actualizado correctamente.");
            cargarTabla();
            limpiarFormulario();
            idProductoEnEdicion = -1; // resetear
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró el cliente.");
        }

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "La edad debe ser un número válido.");
    }

    }//GEN-LAST:event_btnEditarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelColor;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelPrecio;
    private javax.swing.JLabel labelStock;
    private javax.swing.JLabel labelTalla;
    private javax.swing.JTable tablaProductos;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtTalla;
    // End of variables declaration//GEN-END:variables
}
