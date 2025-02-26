/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LoadSaveMemoryDialog.java
 *
 * Created on 19-dic-2011, 13:01:51
 */
package com.github.jspeccyremastered.gui;

import java.awt.Component;
import java.awt.Dialog.ModalityType;
import java.awt.Frame;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;
import javax.swing.filechooser.FileNameExtensionFilter;
import com.github.jspeccyremastered.machine.MachineTypes;
import com.github.jspeccyremastered.machine.Memory;

/**
 *
 * @author jsanchez
 */
public class LoadSaveMemoryDialog extends javax.swing.JPanel {

    private JDialog loadSaveMemoryDialog;
    private JFileChooser fileDlg;
    FileNameExtensionFilter binExtension;
    private Memory memory;
    private File filename;
    private boolean saveDialog;

    /** Creates new form LoadSaveMemoryDialog */
    public LoadSaveMemoryDialog(Memory memory) {
        this.memory = memory;
        initComponents();
        binExtension = new FileNameExtensionFilter(
            java.util.ResourceBundle.getBundle("com/github/jspeccyremastered/gui/Bundle").getString("BINARY_EXTENSION_TYPE"), "bin");
    }

    public boolean showLoadDialog(Component parent, File file) {
        Frame owner = null;
        if (parent instanceof Frame) {
            owner = (Frame) parent;
        } else {
            owner = (Frame) SwingUtilities.getAncestorOfClass(Frame.class, parent);
        }

        if (loadSaveMemoryDialog == null) {
            loadSaveMemoryDialog = new JDialog(owner, false);
            loadSaveMemoryDialog.setModalityType(ModalityType.APPLICATION_MODAL);
            loadSaveMemoryDialog.getContentPane().add(this);
            loadSaveMemoryDialog.pack();
            loadSaveMemoryDialog.setLocationRelativeTo(parent);
        }

        saveDialog = false;
        filename = file;
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("com/github/jspeccyremastered/gui/Bundle"); // NOI18N
        loadSaveMemoryDialog.setTitle(bundle.getString("LoadSaveMemoryDialog.LoadTitle.text"));
        fileChoosedLabel.setText(bundle.getString("LoadSaveMemoryDialog.fileChoosedLabel.text"));
        addressSpinner.setEnabled(false);
        sizeSpinner.setEnabled(false);
        sizeSpinner.getModel().setValue(0);
        rangeCombobox.setEnabled(false);
        loadSaveButton.setEnabled(false);
        loadSaveButton.setText(bundle.getString("LoadSaveMemoryDialog.loadButton.text"));
        if (filename != null) {
            fileChoosedLabel.setText(filename.getName());
            addressSpinner.setEnabled(true);
            sizeSpinner.setEnabled(true);
            if (!saveDialog) {
                sizeSpinner.setModel(new javax.swing.SpinnerNumberModel(filename.length(), 0, filename.length(), 1));
            }
            
            rangeCombobox.setSelectedIndex(0);
            rangeCombobox.setEnabled(memory.getSpectrumModel().codeModel != MachineTypes.CodeModel.SPECTRUM48K);
            loadSaveButton.setEnabled(true);
        }
        loadSaveMemoryDialog.setVisible(true);
        return true;
    }

    public boolean showSaveDialog(Component parent) {
        Frame owner = null;
        if (parent instanceof Frame) {
            owner = (Frame) parent;
        } else {
            owner = (Frame) SwingUtilities.getAncestorOfClass(Frame.class, parent);
        }

        if (loadSaveMemoryDialog == null) {
            loadSaveMemoryDialog = new JDialog(owner, false);
            loadSaveMemoryDialog.setModalityType(ModalityType.APPLICATION_MODAL);
            loadSaveMemoryDialog.getContentPane().add(this);
            loadSaveMemoryDialog.pack();
        }

        saveDialog = true;
        filename = null;
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("com/github/jspeccyremastered/gui/Bundle"); // NOI18N
        loadSaveMemoryDialog.setTitle(bundle.getString("LoadSaveMemoryDialog.SaveTitle.text"));
        fileChoosedLabel.setText(bundle.getString("LoadSaveMemoryDialog.fileChoosedLabel.text"));
        addressSpinner.setEnabled(false);
        sizeSpinner.setEnabled(false);
        sizeSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 65536, 1));
        rangeCombobox.setEnabled(false);
        loadSaveButton.setText(bundle.getString("LoadSaveMemoryDialog.saveButton.text"));
        loadSaveButton.setEnabled(false);
        loadSaveMemoryDialog.setVisible(true);
        return true;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChoosedLabel = new javax.swing.JLabel();
        browseButton = new javax.swing.JButton();
        addressLabel = new javax.swing.JLabel();
        addressSpinner = new javax.swing.JSpinner();
        sizeLabel = new javax.swing.JLabel();
        sizeSpinner = new javax.swing.JSpinner();
        rangeLabel = new javax.swing.JLabel();
        rangeCombobox = new javax.swing.JComboBox();
        closeButton = new javax.swing.JButton();
        archiveLabel = new javax.swing.JLabel();
        loadSaveButton = new javax.swing.JButton();

        fileChoosedLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("com/github/jspeccyremastered/gui/Bundle"); // NOI18N
        fileChoosedLabel.setText(bundle.getString("LoadSaveMemoryDialog.fileChoosedLabel.text")); // NOI18N

        browseButton.setText(bundle.getString("LoadSaveMemoryDialog.browseButton.text")); // NOI18N
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });

        addressLabel.setText(bundle.getString("LoadSaveMemoryDialog.addressLabel.text")); // NOI18N

        addressSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 65535, 1));

        sizeLabel.setText(bundle.getString("LoadSaveMemoryDialog.sizeLabel.text")); // NOI18N

        sizeSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 65535, 1));

        rangeLabel.setText(bundle.getString("LoadSaveMemoryDialog.rangeLabel.text")); // NOI18N

        rangeCombobox.setMaximumRowCount(9);
        rangeCombobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0x0000-0xFFFF", "RAM 0", "RAM 1", "RAM 2", "RAM 3", "RAM 4", "RAM 5", "RAM 6", "RAM 7" }));

        closeButton.setText(bundle.getString("LoadSaveMemoryDialog.closeButton.text")); // NOI18N
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        archiveLabel.setText(bundle.getString("LoadSaveMemoryDialog.archiveLabel.text")); // NOI18N

        loadSaveButton.setText(bundle.getString("LoadSaveMemoryDialog.loadButton.text")); // NOI18N
        loadSaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadSaveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(archiveLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(fileChoosedLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rangeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rangeCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sizeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(addressSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sizeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(browseButton)
                    .addComponent(loadSaveButton)
                    .addComponent(closeButton))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(archiveLabel)
                    .addComponent(fileChoosedLabel)
                    .addComponent(browseButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(addressSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sizeLabel)
                    .addComponent(sizeSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loadSaveButton))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeButton)
                    .addComponent(rangeCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rangeLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed
        if (fileDlg == null) {
            fileDlg = new JFileChooser("/home/jsanchez/Spectrum");
            fileDlg.addChoosableFileFilter(binExtension);
            fileDlg.setFileFilter(binExtension);
        }
        
        int status;
        if (saveDialog) {
            status = fileDlg.showSaveDialog(this);
        } else {
            status = fileDlg.showOpenDialog(this);
        }
        
        if (status == JFileChooser.APPROVE_OPTION) {
            if (binExtension.accept(fileDlg.getSelectedFile())) {
                filename = fileDlg.getSelectedFile();
            } else {
                String saveName = fileDlg.getSelectedFile().getAbsolutePath() + ".bin";
                filename = new File(saveName);
            }
            
            fileChoosedLabel.setText(filename.getName());
            addressSpinner.setEnabled(true);
            sizeSpinner.setEnabled(true);
            if (!saveDialog) {
                sizeSpinner.setModel(new javax.swing.SpinnerNumberModel(filename.length(), 0, filename.length(), 1));
            }
            
            rangeCombobox.setSelectedIndex(0);
            rangeCombobox.setEnabled(memory.getSpectrumModel().codeModel != MachineTypes.CodeModel.SPECTRUM48K);
            loadSaveButton.setEnabled(true);
        }
    }//GEN-LAST:event_browseButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        loadSaveMemoryDialog.setVisible(false);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void loadSaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadSaveButtonActionPerformed
        ResourceBundle bundle = ResourceBundle.getBundle("com/github/jspeccyremastered/gui/Bundle"); // NOI18N
        SpinnerNumberModel snmAddress = (SpinnerNumberModel) addressSpinner.getModel();
        SpinnerNumberModel snmSize = (SpinnerNumberModel) sizeSpinner.getModel();
        int start = snmAddress.getNumber().intValue();
        int size = snmSize.getNumber().intValue();
        int maxSize = rangeCombobox.getSelectedIndex() == 0 ? 0x10000 : 0x4000;
        String error;

        if (size == 0)
            return;
        
        if (start + size > maxSize) {
            error = String.format(bundle.getString("SIZE_BINARY_ERROR"), maxSize);
            JOptionPane.showMessageDialog(this, error,
                    bundle.getString("SIZE_BINARY_ERROR_TITLE"), JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (saveDialog) {
            BufferedOutputStream fOut = null;
            try {
                fOut = new BufferedOutputStream(new FileOutputStream(filename));

                if (rangeCombobox.getSelectedIndex() == 0) {
                    // Range 0x0000-0xFFFF
                    for (int addr = start; addr < start + size; addr++) {
                        fOut.write(memory.readByte(addr));
                    }
                } else {
                    // Page Range
                    for (int addr = start; addr < start + size; addr++) {
                        fOut.write(memory.readByte(rangeCombobox.getSelectedIndex() - 1, addr));
                    }
                }
                JOptionPane.showMessageDialog(this, bundle.getString("SAVE_BINARY_OK"),
                        bundle.getString("SAVE_BINARY_OK_TITLE"), JOptionPane.INFORMATION_MESSAGE);

            } catch (FileNotFoundException excpt) {
                Logger.getLogger(LoadSaveMemoryDialog.class.getName()).log(Level.SEVERE, null, excpt);
            } catch (IOException ioExcpt) {
                Logger.getLogger(LoadSaveMemoryDialog.class.getName()).log(Level.SEVERE, null, ioExcpt);
            } finally {
                try {
                    if (fOut != null)
                        fOut.close();
                } catch (IOException ex) {
                    Logger.getLogger(LoadSaveMemoryDialog.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            return;
        } else {
            BufferedInputStream fIn = null;
            try {
                fIn = new BufferedInputStream(new FileInputStream(filename));
                if (rangeCombobox.getSelectedIndex() == 0) {
                    // Range 0x0000-0xFFFF
                    for (int addr = start; addr < start + size; addr++) {
                        memory.writeByte(addr, (byte)(fIn.read() & 0xff));
                    }
                } else {
                    // Page Range
                    for (int addr = start; addr < start + size; addr++) {
                        memory.writeByte(rangeCombobox.getSelectedIndex() - 1,
                                addr, (byte)(fIn.read() & 0xff));
                    }
                }
                JOptionPane.showMessageDialog(this, bundle.getString("LOAD_BINARY_OK"),
                        bundle.getString("LOAD_BINARY_OK_TITLE"), JOptionPane.INFORMATION_MESSAGE);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(LoadSaveMemoryDialog.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(LoadSaveMemoryDialog.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    if (fIn != null)
                        fIn.close();
                } catch (IOException ex) {
                    Logger.getLogger(LoadSaveMemoryDialog.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_loadSaveButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JSpinner addressSpinner;
    private javax.swing.JLabel archiveLabel;
    private javax.swing.JButton browseButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel fileChoosedLabel;
    private javax.swing.JButton loadSaveButton;
    private javax.swing.JComboBox rangeCombobox;
    private javax.swing.JLabel rangeLabel;
    private javax.swing.JLabel sizeLabel;
    private javax.swing.JSpinner sizeSpinner;
    // End of variables declaration//GEN-END:variables
}
