/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MemoryBrowser.java
 *
 * Created on 23-nov-2011, 21:35:48
 */
package com.github.jspeccyremastered.gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingUtilities;
import com.github.jspeccyremastered.machine.MachineTypes;
import com.github.jspeccyremastered.machine.Memory;
import com.github.jspeccyremastered.porst.jhexview.IHexViewListener;
import com.github.jspeccyremastered.porst.jhexview.JHexView;
import com.github.jspeccyremastered.porst.jhexview.JHexView.DefinitionStatus;

/**
 *
 * @author jsanchez
 */
public class MemoryBrowserDialog extends javax.swing.JPanel {

    private JDialog memoryBrowserDialog;
    private JHexView hexView;
    private Memory memory;
    private MachineTypes spectrumModel;
    private String formatInfo;

    /** Creates new form MemoryBrowser */
    public MemoryBrowserDialog(Memory memory) {
        initComponents();
        this.memory = memory;
        hexView = new JHexView();
        hexView.setData(memory.getMemoryDataProvider());
        hexView.setDefinitionStatus(DefinitionStatus.DEFINED);
        hexView.setBytesPerColumn(1);
        hexView.setEnabled(true);
        hexView.addHexListener(new SelectionChangedListener());
        hexViewPanel.add(hexView);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("com/github/jspeccyremastered/gui/Bundle"); // NOI18N
        formatInfo = bundle.getString("MemoryBrowserDialog.informationLabel.txt");
    }

    public boolean showDialog(Component parent, String title) {
        Frame owner = null;
        if (parent instanceof Frame) {
            owner = (Frame) parent;
        } else {
            owner = (Frame) SwingUtilities.getAncestorOfClass(Frame.class, parent);
        }

        if (memoryBrowserDialog == null) {
            memoryBrowserDialog = new JDialog(owner, false);
            memoryBrowserDialog.setMinimumSize(new Dimension(30, 200));
            memoryBrowserDialog.setMaximumSize(new Dimension(520, 800));
            memoryBrowserDialog.getContentPane().add(this);
            memoryBrowserDialog.pack();
            memoryBrowserDialog.setLocationRelativeTo(parent);
        }

        if (spectrumModel != memory.getSpectrumModel()) {
            spectrumModel = memory.getSpectrumModel();
            memoryComboBox.setEnabled(memory.isModel128k());
            memoryComboBox.setSelectedIndex(0);
            memory.setPageModeBrowser(8);
            hexView.setData(memory.getMemoryDataProvider());
            gotoAddress.setModel(new javax.swing.SpinnerNumberModel(0, 0, 65535, 16));
            if (markPrintableCharacters.isSelected()) {
                SwingUtilities.invokeLater(new Runnable() {

                        @Override
                        public void run() {
                            markPrintableCharacters();
                        }
                    });
            }
        }
        
        memoryBrowserDialog.setTitle(title);
        memoryBrowserDialog.setVisible(true);
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

        headerBrowserPanel = new javax.swing.JPanel();
        addressLabel = new javax.swing.JLabel();
        hexViewLabel = new javax.swing.JLabel();
        asciiViewLabel = new javax.swing.JLabel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(16, 21), new java.awt.Dimension(16, 21), new java.awt.Dimension(16, 21));
        hexViewPanel = new javax.swing.JPanel();
        informationPanel = new javax.swing.JPanel();
        informationLabel = new javax.swing.JLabel();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(25, 24), new java.awt.Dimension(25, 24), new java.awt.Dimension(25, 24));
        markPrintableCharacters = new javax.swing.JCheckBox();
        optionsPanel = new javax.swing.JPanel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(16, 25), new java.awt.Dimension(16, 25), new java.awt.Dimension(16, 25));
        gotoAddressLabel = new javax.swing.JLabel();
        gotoAddress = new javax.swing.JSpinner();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(16, 25), new java.awt.Dimension(16, 25), new java.awt.Dimension(16, 25));
        memoryRangeLabel = new javax.swing.JLabel();
        memoryComboBox = new javax.swing.JComboBox();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(16, 25), new java.awt.Dimension(16, 25), new java.awt.Dimension(16, 25));
        closePanel = new javax.swing.JPanel();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        closeButton = new javax.swing.JButton();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25), new java.awt.Dimension(25, 25));

        setMaximumSize(new java.awt.Dimension(520, 800));
        setMinimumSize(new java.awt.Dimension(30, 200));
        setPreferredSize(new java.awt.Dimension(512, 425));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        headerBrowserPanel.setPreferredSize(new java.awt.Dimension(512, 21));
        headerBrowserPanel.setLayout(new javax.swing.BoxLayout(headerBrowserPanel, javax.swing.BoxLayout.LINE_AXIS));

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("com/github/jspeccyremastered/gui/Bundle"); // NOI18N
        addressLabel.setText(bundle.getString("MemoryBrowserDialog.addressLabel.txt")); // NOI18N
        addressLabel.setToolTipText(bundle.getString("MemoryBrowserDialog.addressTooltipLabel.txt")); // NOI18N
        addressLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addressLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addressLabelMouseClicked(evt);
            }
        });
        headerBrowserPanel.add(addressLabel);

        hexViewLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hexViewLabel.setText(bundle.getString("MemoryBrowserDialog.hexViewLabel.txt")); // NOI18N
        hexViewLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hexViewLabel.setMaximumSize(new java.awt.Dimension(330, 21));
        headerBrowserPanel.add(hexViewLabel);

        asciiViewLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        asciiViewLabel.setText(bundle.getString("MemoryBrowserDialog.asciiViewLabel.txt")); // NOI18N
        asciiViewLabel.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        asciiViewLabel.setMaximumSize(new java.awt.Dimension(150, 21));
        headerBrowserPanel.add(asciiViewLabel);
        headerBrowserPanel.add(filler4);

        add(headerBrowserPanel);

        hexViewPanel.setMinimumSize(new java.awt.Dimension(50, 50));
        hexViewPanel.setPreferredSize(new java.awt.Dimension(512, 300));
        hexViewPanel.setLayout(new javax.swing.BoxLayout(hexViewPanel, javax.swing.BoxLayout.LINE_AXIS));
        add(hexViewPanel);

        informationPanel.setMinimumSize(new java.awt.Dimension(513, 34));
        informationPanel.setPreferredSize(new java.awt.Dimension(512, 34));

        informationLabel.setForeground(new java.awt.Color(255, 0, 0));
        informationLabel.setText(bundle.getString("MemoryBrowserDialog.informationLabel.txt")); // NOI18N
        informationPanel.add(informationLabel);
        informationPanel.add(filler5);

        markPrintableCharacters.setText(bundle.getString("MemoryBrowserDialog.markPrintableCharacters.txt")); // NOI18N
        markPrintableCharacters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markPrintableCharactersActionPerformed(evt);
            }
        });
        informationPanel.add(markPrintableCharacters);

        add(informationPanel);

        optionsPanel.setMaximumSize(new java.awt.Dimension(32767, 25));
        optionsPanel.setPreferredSize(new java.awt.Dimension(512, 50));
        optionsPanel.setLayout(new javax.swing.BoxLayout(optionsPanel, javax.swing.BoxLayout.LINE_AXIS));
        optionsPanel.add(filler2);

        gotoAddressLabel.setText(bundle.getString("MemoryBrowserDialog.gotoAddress.txt")); // NOI18N
        optionsPanel.add(gotoAddressLabel);

        gotoAddress.setModel(new javax.swing.SpinnerNumberModel(0, 0, 65535, 16));
        gotoAddress.setMaximumSize(new java.awt.Dimension(100, 24));
        gotoAddress.setMinimumSize(new java.awt.Dimension(70, 24));
        gotoAddress.setPreferredSize(new java.awt.Dimension(70, 24));
        gotoAddress.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                gotoAddressStateChanged(evt);
            }
        });
        optionsPanel.add(gotoAddress);
        optionsPanel.add(filler1);

        memoryRangeLabel.setText(bundle.getString("MemoryBrowserDialog.memoryRangeLabel.txt")); // NOI18N
        optionsPanel.add(memoryRangeLabel);

        memoryComboBox.setMaximumRowCount(9);
        memoryComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0x0000-0xFFFF", "RAM 0", "RAM 1", "RAM 2", "RAM 3", "RAM 4", "RAM 5", "RAM 6", "RAM 7" }));
        memoryComboBox.setMaximumSize(new java.awt.Dimension(150, 24));
        memoryComboBox.setMinimumSize(new java.awt.Dimension(50, 24));
        memoryComboBox.setPreferredSize(new java.awt.Dimension(60, 24));
        memoryComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoryComboBoxActionPerformed(evt);
            }
        });
        optionsPanel.add(memoryComboBox);
        optionsPanel.add(filler3);

        add(optionsPanel);

        closePanel.setPreferredSize(new java.awt.Dimension(512, 70));
        closePanel.setLayout(new javax.swing.BoxLayout(closePanel, javax.swing.BoxLayout.LINE_AXIS));
        closePanel.add(filler6);

        closeButton.setText(bundle.getString("MemoryBrowser.closeButton.text")); // NOI18N
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        closePanel.add(closeButton);
        closePanel.add(filler7);

        add(closePanel);
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        memoryBrowserDialog.setVisible(false);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void gotoAddressStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_gotoAddressStateChanged
        SpinnerNumberModel snmAddress = (SpinnerNumberModel) gotoAddress.getModel();
        hexView.gotoOffset(snmAddress.getNumber().longValue() & 0xffff);
    }//GEN-LAST:event_gotoAddressStateChanged

    private void memoryComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memoryComboBoxActionPerformed
        JComboBox cbx = (JComboBox) evt.getSource();

        hexView.setDefinitionStatus(DefinitionStatus.UNDEFINED);

        if (cbx.getSelectedIndex() == 0) {
            memory.setPageModeBrowser(8);
            gotoAddress.setModel(new javax.swing.SpinnerNumberModel(0, 0, 65535, 16));
        } else {
            memory.setPageModeBrowser(cbx.getSelectedIndex() - 1);
            gotoAddress.setModel(new javax.swing.SpinnerNumberModel(0, 0, 16383, 16));
        }

        hexView.setData(memory.getMemoryDataProvider());
        hexView.setDefinitionStatus(DefinitionStatus.DEFINED);
        if (markPrintableCharacters.isSelected()) {
            SwingUtilities.invokeLater(new Runnable() {

                        @Override
                        public void run() {
                            markPrintableCharacters();
                        }
                    });
        }
    }//GEN-LAST:event_memoryComboBoxActionPerformed

    private void addressLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addressLabelMouseClicked
        hexView.setAddressMode(hexView.getAddressMode() == JHexView.AddressMode.HEXADECIMAL
            ? JHexView.AddressMode.DECIMAL : JHexView.AddressMode.HEXADECIMAL);
    }//GEN-LAST:event_addressLabelMouseClicked

    private void markPrintableCharactersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markPrintableCharactersActionPerformed
        if (markPrintableCharacters.isSelected()) {
            SwingUtilities.invokeLater(new Runnable() {

                        @Override
                        public void run() {
                            markPrintableCharacters();
                        }
                    });
        } else {
            hexView.uncolorizeAll(0);
        }
    }//GEN-LAST:event_markPrintableCharactersActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel asciiViewLabel;
    private javax.swing.JButton closeButton;
    private javax.swing.JPanel closePanel;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.JSpinner gotoAddress;
    private javax.swing.JLabel gotoAddressLabel;
    private javax.swing.JPanel headerBrowserPanel;
    private javax.swing.JLabel hexViewLabel;
    private javax.swing.JPanel hexViewPanel;
    private javax.swing.JLabel informationLabel;
    private javax.swing.JPanel informationPanel;
    private javax.swing.JCheckBox markPrintableCharacters;
    private javax.swing.JComboBox memoryComboBox;
    private javax.swing.JLabel memoryRangeLabel;
    private javax.swing.JPanel optionsPanel;
    // End of variables declaration//GEN-END:variables

    private void markPrintableCharacters() {
        hexView.uncolorizeAll(0);
        
        int end, page;
        if (memoryComboBox.getSelectedIndex() == 0) {
            end = 0x10000;
            page = 8;
        } else {
            end = 0x4000;
            page = memoryComboBox.getSelectedIndex() - 1;
        }
        
        int value;
        for (int address = 0, start = 0, length = 0; address < end; address++) {
            if (page > 7) {
                value = memory.readByte(address) & 0xff;
            } else {
                value = memory.readByte(page, address) & 0xff;
            }
            
            if (value < ' ' || value > '~') {
                if (length > 0) {
                    hexView.colorize(0, start, length, Color.YELLOW, Color.BLUE);
                    length = 0;
                }
            } else {
                if (length == 0)
                    start = address;
                length++;
            }
        }
    }
    
    private class SelectionChangedListener implements IHexViewListener {

        @Override
        public void selectionChanged(long start, long length) {

            if (spectrumModel != memory.getSpectrumModel()) {
                spectrumModel = memory.getSpectrumModel();
                memoryComboBox.setEnabled(memory.isModel128k());
                memoryComboBox.setSelectedIndex(0);
                memory.setPageModeBrowser(8);
                hexView.setData(memory.getMemoryDataProvider());
                gotoAddress.setModel(new javax.swing.SpinnerNumberModel(0, 0, 65535, 16));
                if (markPrintableCharacters.isSelected()) {
                    SwingUtilities.invokeLater(new Runnable() {

                        @Override
                        public void run() {
                            markPrintableCharacters();
                        }
                    });
                }
            }
            
            if (length == 1) {
                int address = (int) (start / 2) & 0xffff;
                int value;

                if (memoryComboBox.getSelectedIndex() == 0) {
                    value = memory.readByte(address) & 0xff;
                } else {
                    value = memory.readByte(memoryComboBox.getSelectedIndex() - 1, address) & 0xff;
                }

                informationLabel.setText(String.format(formatInfo, address, address, value, value));
                gotoAddress.getModel().setValue(address);
            }
        }
    }
}
