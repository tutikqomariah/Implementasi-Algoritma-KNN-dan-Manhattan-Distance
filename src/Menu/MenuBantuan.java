/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author arief budiman
 */
public class MenuBantuan extends javax.swing.JPanel {

    
    /**
     * Creates new form MenuBantuan
     */
    public MenuBantuan() {
        initComponents();
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        String info = ""
                + "1. DATASET \n"
                + "   a)Dataset Model\n"
                + "     Dataset Model memiliki fungsi untuk meng-import Dataset nilai yang akan dijadikan sebagai"
                + "model ke dalam database. \n"
                + "     Langkah-langkah: \n"
                + "     -Cari File yang ingin dipilih dengan mengklik button Cari \n"
                + "     -Pilih Tahun Ajaran \n"
                + "     -Klik Button Simpan \n"
                + "     -Klik button Data untuk mengecek data yang sudah tersimpan, Klik 2x pada kolom dataset model jika ingin menghapus \n\n"
                + "   b)Dataset Uji\n"
                + "     Dataset Uji memiliki fungsi untuk meng-import Dataset nilai yang akan di ujikan ke dalam "
                + "database. \n"
                + "     Langkah-langkah: \n"
                + "     -Cari File yang ingin dipilih dengan mengklik button Cari \n"
                + "     -Klik Button Simpan \n"
                + "     -Klik button Data untuk mengecek data yang sudah tersimpan, Klik 2x pada kolom dataset Uji jika ingin menghapus \n\n"
             
                + "2. EVALUASI\n"
                + "   layar Evaluasi terdapat dua tab yaitu Dataset Pengujian dan Hasil Evaluasi, dimana setiap"
                + "yang tab memiliki fungsi yang berbeda. Tab Dataset Pengujian , digunakan untuk memilih"
                + "dataset akan digunakan pada proses pengujian (dataset model / dataset training dan dataset"
                + "uji) beserta dengan parameter yang digunakan. Sedangkan untuk tab Hasil Evaluasi digunakan"
                + "untuk menampilkan hasil pengujian dataset.\n"
                + "   Langkah-langkah: \n"
                + "   -Klik chekbox pada tahun ajaran yang ingin digunakan \n"
                + "   -Pilih Single Testing jika ingin menggunakan 1(satu) nilai K \n"
                + "   -Pilih Multi Testing jika ingin membandingkan lebih dari 1(satu) nilai K sekaligus \n\n"
                
                + "3. KLASIFIKASI\n"
                + "   layar Klasifikasi ini terdapat dua tab yaitu Klasifikasi Kelulusan UN dan Hasil Klasifikasi"
                + "Kelulusan UN, dimana setiap tab memiliki fungsi yang berbeda. Pada tab Klasifikasi Kelulusan"
                + "UN, digunakan user untuk memilih dan menginput dataset siswa yang  akan dilakukan klasifikasi,"
                + "Sedangkan tab Hasil Klasifikasi Kelulusan UN, digunakan untuk menampilkan hasil klasifikasi"
                + "   yang telah dilakukan oleh user. \n"
                + "   Langkah-langkah: \n"
                + "   -Pilih file yang ingin di ujikan dengan mengklik button Cari \n"
                + "   -Masukan nilai K ganjil pada kolom Number of Nearest Neighbor (k) \n"
                + "   -Klik button proses";
        jTextArea1.setText(info);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dynamicpanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(59, 102, 145));
        setPreferredSize(new java.awt.Dimension(1141, 735));

        dynamicpanel.setBackground(new java.awt.Color(104, 141, 171));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout dynamicpanelLayout = new javax.swing.GroupLayout(dynamicpanel);
        dynamicpanel.setLayout(dynamicpanelLayout);
        dynamicpanelLayout.setHorizontalGroup(
            dynamicpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dynamicpanelLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 762, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        dynamicpanelLayout.setVerticalGroup(
            dynamicpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dynamicpanelLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(dynamicpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addComponent(dynamicpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel dynamicpanel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}