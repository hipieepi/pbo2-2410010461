/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package id.ac.uniska.pbo2.p06;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JOptionPane;
import java.awt.event.ItemEvent;

/**
 *
 * @author Asus
 */
public class FormAnggotaPerpustakaan extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormAnggotaPerpustakaan.class.getName());

    /**
     * Creates new form FormAnggotaPerpustakaan
     */
    public FormAnggotaPerpustakaan() {
        initComponents();
        
        npmField.putClientProperty(
            "JTextField.placeholderText", "Contoh: 2410010461"
        );

        namaField.putClientProperty(
            "JTextField.placeholderText", "Masukkan nama lengkap"
        );

        emailField.putClientProperty(
            "JTextField.placeholderText", "Contoh: nama@email.com"
        );

        hpField.putClientProperty(
            "JTextField.placeholderText", "Contoh: 081255346936"
        );

        npmPesanLabel.setForeground(java.awt.Color.RED);
        namaPesanLabel.setForeground(java.awt.Color.RED);
        prodiPesanLabel.setForeground(java.awt.Color.RED);
        emailPesanLabel.setForeground(java.awt.Color.RED);
        hpPesanLabel.setForeground(java.awt.Color.RED);
        statusLabel.setForeground(java.awt.Color.RED);

        getRootPane().setDefaultButton(daftarButton);
        pack();
        setMinimumSize(getSize());
        setLocationRelativeTo(null);
    }
    
    private boolean periksaNpm() {
    return tandai(
        npmField,
        npmPesanLabel,
        Validator.npm(npmField.getText())
        );
    }
    
    private boolean periksaNama() {
    return tandai(
        namaField,
        namaPesanLabel,
        Validator.nama(namaField.getText())
        );
    }

    private boolean periksaEmail() {
        return tandai(
            emailField,
            emailPesanLabel,
            Validator.email(emailField.getText())
            );
        }

    private boolean periksaHp() {
        return tandai(
            hpField,
            hpPesanLabel,
            Validator.nomorHp(hpField.getText())
            );
        }  

    private boolean periksaProdi() {
    String kesalahan = null;

    if (prodiCombo.getSelectedIndex() == 0) {
        kesalahan = "Pilih salah satu program studi";
    }

    return tandai(prodiCombo, prodiPesanLabel, kesalahan);
  }
    
    private boolean tandai(
        javax.swing.JComponent isian,
        javax.swing.JLabel pesan,
        String kesalahan) {

    isian.putClientProperty(
        "JComponent.outline",
        (kesalahan == null) ? null : "error"
    );

    pesan.setText((kesalahan == null) ? " " : kesalahan);

    return kesalahan == null;
}
    
    private String jenisAnggota() {
    if (dosenRadio.isSelected()) {
        return "Dosen";
    } else if (umumRadio.isSelected()) {
        return "Umum";
    } else {
        return "Mahasiswa";
    }
}
    

    private void batal() {
        if (adaIsian()) {
            int jawab = JOptionPane.showConfirmDialog(
                    this,
                    "Data yang sudah diisi akan dihapus. Lanjutkan?",
                    "Konfirmasi",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE
            );

            if (jawab != JOptionPane.YES_OPTION) {
                return;
            }
        }

        kosongkan();
    }
   
    
    private boolean adaIsian() {
        return !npmField.getText().isBlank()
                || !namaField.getText().isBlank()
                || !emailField.getText().isBlank()
                || !hpField.getText().isBlank()
                || !alamatArea.getText().isBlank();
    }



    private void daftar() {
        java.util.List<javax.swing.JComponent> salah =
                new java.util.ArrayList<>();

        if (!periksaNpm()) {
            salah.add(npmField);
        }
        if (!periksaNama()) {
            salah.add(namaField);
        }
        if (!periksaProdi()) {
            salah.add(prodiCombo);
        }
        if (!periksaEmail()) {
            salah.add(emailField);
        }
        if (!periksaHp()) {
            salah.add(hpField);
        }

        if (!salah.isEmpty()) {
            statusLabel.setText(
                    salah.size() + " isian perlu diperbaiki"
            );
            salah.get(0).requestFocusInWindow();
            return;
        }

        statusLabel.setText(" ");

        String pesan = "Pendaftaran berhasil."
                + "\n\nNPM: " + npmField.getText()
                + "\nNama: " + namaField.getText().trim()
                + "\nJenis anggota: " + jenisAnggota();

        JOptionPane.showMessageDialog(
                this,
                pesan,
                "Pendaftaran Berhasil",
                JOptionPane.INFORMATION_MESSAGE
        );

        kosongkan();
    }





    private void kosongkan() {
        npmField.setText("");
        namaField.setText("");
        emailField.setText("");
        hpField.setText("");
        alamatArea.setText("");

        prodiCombo.setSelectedIndex(0);
        mahasiswaRadio.setSelected(true);
        setujuCheck.setSelected(false);

        tandai(npmField, npmPesanLabel, null);
        tandai(namaField, namaPesanLabel, null);
        tandai(prodiCombo, prodiPesanLabel, null);
        tandai(emailField, emailPesanLabel, null);
        tandai(hpField, hpPesanLabel, null);

        statusLabel.setText(" ");
        npmField.requestFocusInWindow();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jenisAnggotaGroup = new javax.swing.ButtonGroup();
        headerPanel = new javax.swing.JPanel();
        judulLabel = new javax.swing.JLabel();
        keteranganLabel = new javax.swing.JLabel();
        isiPanel = new javax.swing.JPanel();
        formPanel = new javax.swing.JPanel();
        dataAnggotaLabel = new javax.swing.JLabel();
        npmLabel = new javax.swing.JLabel();
        namaLabel = new javax.swing.JLabel();
        prodiLabel = new javax.swing.JLabel();
        jenisAnggotaLabel = new javax.swing.JLabel();
        npmField = new javax.swing.JTextField();
        namaField = new javax.swing.JTextField();
        prodiCombo = new javax.swing.JComboBox<>();
        emailLabel = new javax.swing.JLabel();
        jumlahDigitLabel = new javax.swing.JLabel();
        nomorHpLabel = new javax.swing.JLabel();
        alamatLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        hpField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamatArea = new javax.swing.JTextArea();
        kontakLabel = new javax.swing.JLabel();
        setujuCheck = new javax.swing.JCheckBox();
        namaPesanLabel = new javax.swing.JLabel();
        prodiPesanLabel = new javax.swing.JLabel();
        emailPesanLabel = new javax.swing.JLabel();
        hpPesanLabel = new javax.swing.JLabel();
        npmPesanLabel = new javax.swing.JLabel();
        jenisPanel = new javax.swing.JPanel();
        umumRadio = new javax.swing.JRadioButton();
        dosenRadio = new javax.swing.JRadioButton();
        mahasiswaRadio = new javax.swing.JRadioButton();
        bawahPanel = new javax.swing.JPanel();
        statusLabel = new javax.swing.JLabel();
        tombolPanel = new javax.swing.JPanel();
        batalButton = new javax.swing.JButton();
        daftarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Data Anggota Perpustakaan");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        headerPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(16, 8, 16, 8));
        headerPanel.setLayout(new javax.swing.BoxLayout(headerPanel, javax.swing.BoxLayout.Y_AXIS));

        judulLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        judulLabel.setText("Data Anggota Perpustakaan");
        headerPanel.add(judulLabel);

        keteranganLabel.setForeground(new java.awt.Color(153, 153, 153));
        keteranganLabel.setText("Lengkapi data berikut sesuai Kartu Tanda Mahasiswa");
        headerPanel.add(keteranganLabel);

        getContentPane().add(headerPanel, java.awt.BorderLayout.PAGE_START);

        isiPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        isiPanel.setLayout(new java.awt.BorderLayout());

        formPanel.setLayout(new java.awt.GridBagLayout());

        dataAnggotaLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dataAnggotaLabel.setText("Data Anggota");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 8, 5, 8);
        formPanel.add(dataAnggotaLabel, gridBagConstraints);

        npmLabel.setDisplayedMnemonic('P');
        npmLabel.setText("NPM");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 8, 3, 8);
        formPanel.add(npmLabel, gridBagConstraints);

        namaLabel.setDisplayedMnemonic('N');
        namaLabel.setText("Nama Lengkap");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 8, 3, 8);
        formPanel.add(namaLabel, gridBagConstraints);

        prodiLabel.setDisplayedMnemonic('R');
        prodiLabel.setText("Program Studi");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 8, 3, 8);
        formPanel.add(prodiLabel, gridBagConstraints);

        jenisAnggotaLabel.setDisplayedMnemonic('J');
        jenisAnggotaLabel.setText("Jenis Anggota");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 8, 3, 8);
        formPanel.add(jenisAnggotaLabel, gridBagConstraints);

        npmField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                npmFieldFocusLost(evt);
            }
        });
        npmField.addActionListener(this::npmFieldActionPerformed);
        npmField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                npmFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                npmFieldKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 8, 3, 8);
        formPanel.add(npmField, gridBagConstraints);

        namaField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                namaFieldFocusLost(evt);
            }
        });
        namaField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                namaFieldKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 8, 3, 8);
        formPanel.add(namaField, gridBagConstraints);

        prodiCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teknik Informatika", "Sistem Informasi" }));
        prodiCombo.addItemListener(this::prodiComboItemStateChanged);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 8, 3, 8);
        formPanel.add(prodiCombo, gridBagConstraints);

        emailLabel.setDisplayedMnemonic('E');
        emailLabel.setText("Email");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 8, 3, 8);
        formPanel.add(emailLabel, gridBagConstraints);

        jumlahDigitLabel.setText("0 dari 10 digit");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 8, 2, 0);
        formPanel.add(jumlahDigitLabel, gridBagConstraints);

        nomorHpLabel.setDisplayedMnemonic('H');
        nomorHpLabel.setText("Nomor HP");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 8, 3, 8);
        formPanel.add(nomorHpLabel, gridBagConstraints);

        alamatLabel.setDisplayedMnemonic('L');
        alamatLabel.setText("Alamat");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(3, 8, 3, 8);
        formPanel.add(alamatLabel, gridBagConstraints);

        emailField.setForeground(new java.awt.Color(204, 204, 204));
        emailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFieldFocusLost(evt);
            }
        });
        emailField.addActionListener(this::emailFieldActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 8, 3, 8);
        formPanel.add(emailField, gridBagConstraints);

        hpField.setForeground(new java.awt.Color(204, 204, 204));
        hpField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                hpFieldFocusLost(evt);
            }
        });
        hpField.addActionListener(this::hpFieldActionPerformed);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 8, 3, 8);
        formPanel.add(hpField, gridBagConstraints);

        alamatArea.setColumns(20);
        alamatArea.setRows(5);
        jScrollPane1.setViewportView(alamatArea);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 15;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 8, 3, 8);
        formPanel.add(jScrollPane1, gridBagConstraints);

        kontakLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        kontakLabel.setText("Kontak");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 8, 5, 8);
        formPanel.add(kontakLabel, gridBagConstraints);

        setujuCheck.setMnemonic('T');
        setujuCheck.setText("Setuju dengan tata tertib perpustakaan");
        setujuCheck.addItemListener(this::setujuCheckItemStateChanged);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(3, 8, 3, 8);
        formPanel.add(setujuCheck, gridBagConstraints);

        namaPesanLabel.setLabelFor(namaField);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 8, 8, 0);
        formPanel.add(namaPesanLabel, gridBagConstraints);

        prodiPesanLabel.setLabelFor(prodiCombo);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 8, 8, 0);
        formPanel.add(prodiPesanLabel, gridBagConstraints);

        emailPesanLabel.setLabelFor(emailField);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 8, 8, 0);
        formPanel.add(emailPesanLabel, gridBagConstraints);

        hpPesanLabel.setLabelFor(hpField);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 8, 8, 0);
        formPanel.add(hpPesanLabel, gridBagConstraints);

        npmPesanLabel.setLabelFor(npmField);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(2, 8, 8, 0);
        formPanel.add(npmPesanLabel, gridBagConstraints);

        jenisAnggotaGroup.add(umumRadio);
        umumRadio.setText("Umum");
        umumRadio.addActionListener(this::umumRadioActionPerformed);
        jenisPanel.add(umumRadio);

        jenisAnggotaGroup.add(dosenRadio);
        dosenRadio.setText("Dosen");
        dosenRadio.addActionListener(this::dosenRadioActionPerformed);
        jenisPanel.add(dosenRadio);

        jenisAnggotaGroup.add(mahasiswaRadio);
        mahasiswaRadio.setSelected(true);
        mahasiswaRadio.setText("Mahasiswa");
        jenisPanel.add(mahasiswaRadio);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        formPanel.add(jenisPanel, gridBagConstraints);

        isiPanel.add(formPanel, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(isiPanel, java.awt.BorderLayout.CENTER);

        bawahPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 16, 8, 16));
        bawahPanel.setLayout(new java.awt.BorderLayout());

        statusLabel.setText(" ");
        bawahPanel.add(statusLabel, java.awt.BorderLayout.CENTER);

        tombolPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(8, 16, 16, 16));
        tombolPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        batalButton.setMnemonic('B');
        batalButton.setText("Batal");
        batalButton.addActionListener(this::batalButtonActionPerformed);
        tombolPanel.add(batalButton);

        daftarButton.setText("Daftar");
        daftarButton.setEnabled(false);
        daftarButton.addActionListener(this::daftarButtonActionPerformed);
        tombolPanel.add(daftarButton);

        bawahPanel.add(tombolPanel, java.awt.BorderLayout.EAST);

        getContentPane().add(bawahPanel, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void npmFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_npmFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_npmFieldActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void hpFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hpFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hpFieldActionPerformed

    private void dosenRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dosenRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dosenRadioActionPerformed

    private void umumRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umumRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_umumRadioActionPerformed

    private void setujuCheckItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_setujuCheckItemStateChanged
        // TODO add your handling code here:
        daftarButton.setEnabled(setujuCheck.isSelected());
        
    }//GEN-LAST:event_setujuCheckItemStateChanged

    private void npmFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_npmFieldKeyReleased
        // TODO add your handling code here:
        int jumlah = npmField.getText().length();
        jumlahDigitLabel.setText(jumlah + " dari 10 digit");
    }//GEN-LAST:event_npmFieldKeyReleased

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        int jawab = JOptionPane.showConfirmDialog(this, 
            "Keluar dari aplikasi?", "Konfirmasi", JOptionPane.YES_NO_OPTION); 
        if (jawab == JOptionPane.YES_OPTION) { 
            dispose(); 
        }
    }//GEN-LAST:event_formWindowClosing

    private void batalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalButtonActionPerformed
        batal();   // TODO add your handling code here:
    }//GEN-LAST:event_batalButtonActionPerformed

    private void daftarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarButtonActionPerformed
        daftar();
        // TODO add your handling code here:
    }//GEN-LAST:event_daftarButtonActionPerformed

    private void npmFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_npmFieldKeyTyped
        // TODO add your handling code here:
        boolean penuh = npmField.getText().length() >= 10
            && npmField.getSelectedText() == null;
        if (!Character.isDigit(evt.getKeyChar()) || penuh) {
            evt.consume(); // karakter tidak dimasukkan ke isian
        }
    }//GEN-LAST:event_npmFieldKeyTyped

    private void namaFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namaFieldKeyTyped
        if (Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_namaFieldKeyTyped

    private void hpFieldKeyTyped(java.awt.event.KeyEvent evt) {
        boolean penuh = hpField.getText().length() >= 13
                && hpField.getSelectedText() == null;

        if (!Character.isDigit(evt.getKeyChar()) || penuh) {
            evt.consume();
        }
    }

    private void npmFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_npmFieldFocusLost
        // TODO add your handling code here:
        if (!npmField.getText().isBlank()) {
            periksaNpm();
        }
    }//GEN-LAST:event_npmFieldFocusLost

    private void namaFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_namaFieldFocusLost
        // TODO add your handling code here:
        if (!namaField.getText().isBlank()) {
            periksaNama();
        }
    }//GEN-LAST:event_namaFieldFocusLost

    private void prodiComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_prodiComboItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            periksaProdi();
        }
    }//GEN-LAST:event_prodiComboItemStateChanged

    private void emailFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFieldFocusLost
        // TODO add your handling code here:
        if (!emailField.getText().isBlank()) {
            periksaEmail();
        }
    }//GEN-LAST:event_emailFieldFocusLost

    private void hpFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_hpFieldFocusLost
        // TODO add your handling code here:
        if (!hpField.getText().isBlank()) {
            periksaHp();
        }
    }//GEN-LAST:event_hpFieldFocusLost

    
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        FlatLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FormAnggotaPerpustakaan().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamatArea;
    private javax.swing.JLabel alamatLabel;
    private javax.swing.JButton batalButton;
    private javax.swing.JPanel bawahPanel;
    private javax.swing.JButton daftarButton;
    private javax.swing.JLabel dataAnggotaLabel;
    private javax.swing.JRadioButton dosenRadio;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emailPesanLabel;
    private javax.swing.JPanel formPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JTextField hpField;
    private javax.swing.JLabel hpPesanLabel;
    private javax.swing.JPanel isiPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup jenisAnggotaGroup;
    private javax.swing.JLabel jenisAnggotaLabel;
    private javax.swing.JPanel jenisPanel;
    private javax.swing.JLabel judulLabel;
    private javax.swing.JLabel jumlahDigitLabel;
    private javax.swing.JLabel keteranganLabel;
    private javax.swing.JLabel kontakLabel;
    private javax.swing.JRadioButton mahasiswaRadio;
    private javax.swing.JTextField namaField;
    private javax.swing.JLabel namaLabel;
    private javax.swing.JLabel namaPesanLabel;
    private javax.swing.JLabel nomorHpLabel;
    private javax.swing.JTextField npmField;
    private javax.swing.JLabel npmLabel;
    private javax.swing.JLabel npmPesanLabel;
    private javax.swing.JComboBox<String> prodiCombo;
    private javax.swing.JLabel prodiLabel;
    private javax.swing.JLabel prodiPesanLabel;
    private javax.swing.JCheckBox setujuCheck;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JPanel tombolPanel;
    private javax.swing.JRadioButton umumRadio;
    // End of variables declaration//GEN-END:variables
}
