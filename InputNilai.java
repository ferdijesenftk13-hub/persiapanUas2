package javaapplication_oopjey;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author jey
 */
public class InputNilai extends javax.swing.JFrame {

    java.util.ArrayList<Student> listMahasiswa = new java.util.ArrayList<>();
    java.util.ArrayList<Course> listMK = new java.util.ArrayList<>();
    java.util.ArrayList<Lecturer> listLecture = new java.util.ArrayList<>();
    final String[] semester = {"1", "2", "3"};
    final javax.swing.DefaultComboBoxModel comboModelSM = new javax.swing.DefaultComboBoxModel(semester);
    javax.swing.DefaultComboBoxModel<Student> comboModelMhs = new javax.swing.DefaultComboBoxModel<>();
    javax.swing.DefaultComboBoxModel<Course> comboModelCourse = new javax.swing.DefaultComboBoxModel<>();
    javax.swing.DefaultComboBoxModel<Lecturer> comboModelLecture = new javax.swing.DefaultComboBoxModel<>();
    
    Student selectedStudent;
    Course selectedCourse;
    KRS krs;
   Lecturer selectedLecture;
    public InputNilai() {
        initComponents();
        listMahasiswa.add(new Student("199000299", "Jeyy", "001", "Ilmu Komputer"));
        listMahasiswa.add(new Student("19920992", "Briel", "002", "Ilmu Komputer"));
        listMahasiswa.add(new Student("19912992", "Paulus", "003", "Ilmu Komputer"));
        listMK.add(new Course("010", "Math", 3, 2));
        listMK.add(new Course("011", "English", 3, 2));
        listMK.add(new Course("012", "Web", 3, 2));
        listMK.add(new Course("013", "Mobile", 3, 2));
        listLecture.add(new Lecturer("ID01", "Agus Seputra", "092999", "Web"));
        listLecture.add(new Lecturer("ID02", "Delpita ", "088889", "Mobile"));
        for (Student s : listMahasiswa) {
            comboModelMhs.addElement(s);
        }
        for (Course c : listMK) {
            comboModelCourse.addElement(c);
        }
        for (Lecturer l : listLecture) { 
            comboModelLecture.addElement(l);
        } 
        jComboBoxMhs.setModel(comboModelMhs);
        jComboBoxMK.setModel(comboModelCourse);
        jComboBoxSM.setModel(comboModelSM);
        jComboBoxDosen.setModel(comboModelLecture);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxMhs = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelKodeSKS = new javax.swing.JLabel();
        jComboBoxSM = new javax.swing.JComboBox<>();
        jComboBoxMK = new javax.swing.JComboBox<>();
        jButtonAdd = new javax.swing.JButton();
        jTextFieldSIKAP = new javax.swing.JTextField();
        jTextFieldUTS = new javax.swing.JTextField();
        jTextFieldUAS = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxDosen = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableNilai = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Identitas Mahasiswa");

        jLabel2.setText("NAMA");

        jLabel3.setText("NIM & PRODI");

        jComboBoxMhs.setModel(comboModelMhs);
        jComboBoxMhs.addActionListener(this::jComboBoxMhsActionPerformed);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 255, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jComboBoxMhs, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxMhs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel4.setText("Identitas Matakuliah");

        jLabel5.setText("MataKuliah");

        jLabel14.setText("Kode dan SKS");

        jLabel6.setText("Nilai");

        jLabel7.setText("Semester");

        jLabel8.setText("Nilai Huruf");

        jLabelKodeSKS.setText("KODE SKS");

        jComboBoxSM.setModel(comboModelSM);
        jComboBoxSM.addActionListener(this::jComboBoxSMActionPerformed);

        jComboBoxMK.setModel(comboModelCourse);
        jComboBoxMK.addActionListener(this::jComboBoxMKActionPerformed);

        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(this::jButtonAddActionPerformed);

        jTextFieldSIKAP.setText("0");

        jTextFieldUTS.setText("0");

        jTextFieldUAS.setText("0");

        jLabel9.setText("Pengampu");

        jComboBoxDosen.setModel(comboModelLecture);
        jComboBoxDosen.addActionListener(this::jComboBoxDosenActionPerformed);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jComboBoxMK, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextFieldSIKAP, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldUTS, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldUAS, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jComboBoxDosen, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBoxSM, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(59, 59, 59))))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jLabelKodeSKS)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxMK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabelKodeSKS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldSIKAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldUTS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldUAS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jComboBoxSM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jComboBoxDosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAdd)
                    .addComponent(jLabel8))
                .addGap(150, 150, 150))
        );

        jButton1.setText("FORM INPUT NILAI");

        jTableNilai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIM", "NAMA", "Matakuliah", "SKS", "NILAI", "Dosen"
            }
        ));
        jScrollPane2.setViewportView(jTableNilai);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(184, 184, 184)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 21, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxMhsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMhsActionPerformed
        this.selectedStudent = (Student) jComboBoxMhs.getSelectedItem();
        if (selectedStudent != null) {
            jLabel3.setText(selectedStudent.getNim() + " | Prodi: " + selectedStudent.getStudyProgram());
        }
    }//GEN-LAST:event_jComboBoxMhsActionPerformed
        private void setKRS() {
        try {
            int uas = Integer.parseInt(jTextFieldUAS.getText());
            int uts = Integer.parseInt(jTextFieldUTS.getText());
            int sikap = Integer.parseInt(jTextFieldSIKAP.getText());
            double rataRata = (uas + uts + sikap) / 3.0;
            this.krs = new KRS(selectedCourse, rataRata);
            this.krs.setLecture(selectedLecture);
            this.krs.setSemester(jComboBoxSM.getSelectedIndex());  
        } catch (Exception e) {
            System.out.println("Error input nilai: " + e.getMessage());
        }
}
    private void jComboBoxMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMKActionPerformed
        this.selectedCourse = (Course) jComboBoxMK.getSelectedItem();
        if (selectedCourse != null) {
            jLabelKodeSKS.setText(selectedCourse.getCode() + " | SKS: " + selectedCourse.getSKS());
            setKRS();
            if (krs != null) {
                jLabel8.setText("Nilai Huruf: " + krs.getGrade());
            }
        }
    }//GEN-LAST:event_jComboBoxMKActionPerformed

    private void jComboBoxSMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSMActionPerformed
        setKRS();
        if (krs != null) {
            jLabel8.setText("Nilai Huruf: " + krs.getGrade());
        }
    }//GEN-LAST:event_jComboBoxSMActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        try {
            setKRS(); 
            if (selectedStudent != null && krs != null) {
                selectedStudent.addKRS(krs);
                Object[] row = {
                    selectedStudent.getNim(),
                    selectedStudent.getName(),
                    krs.getCourse().getCourseName(),
                    krs.getCourse().getSKS(),
                    krs.getGrade(),
                    this.selectedLecture != null ? this.selectedLecture.toString() : "-"
                };
                DefaultTableModel model = (DefaultTableModel) jTableNilai.getModel();
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jComboBoxDosenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDosenActionPerformed
        this.selectedLecture = (Lecturer) jComboBoxDosen.getSelectedItem();
    }//GEN-LAST:event_jComboBoxDosenActionPerformed

        public static void main(String args[]) {
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            java.awt.EventQueue.invokeLater(() -> {
                new InputNilai().setVisible(true);
            });
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JComboBox<Lecturer> jComboBoxDosen;
    private javax.swing.JComboBox<Course> jComboBoxMK;
    private javax.swing.JComboBox<Student> jComboBoxMhs;
    private javax.swing.JComboBox<String> jComboBoxSM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelKodeSKS;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableNilai;
    private javax.swing.JTextField jTextFieldSIKAP;
    private javax.swing.JTextField jTextFieldUAS;
    private javax.swing.JTextField jTextFieldUTS;
    // End of variables declaration//GEN-END:variables
}
