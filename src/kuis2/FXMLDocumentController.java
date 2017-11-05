/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2;

import com.jfoenix.controls.JFXButton;
import javafx.scene.control.Button;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author SMK TELKOM
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private JFXButton simpan;
    @FXML
    private JFXButton bersihkan;
    @FXML
    private JFXButton perbarui;
    @FXML
    private JFXButton hapus;
    @FXML
    private JFXButton keluar;
    @FXML
    private TextField namab;
    @FXML
    private TextField harga;
    @FXML
    private JFXTextField kodeb;
       @FXML
    private Label kode3;

    @FXML
    private Label kode1;

    @FXML
    private Label kode4;

    @FXML
    private Label kode2;

    @FXML
    private Label nama1;

    @FXML
    private Label nama2;

    @FXML
    private Label nama3;

    @FXML
    private Label nama4;

    @FXML
    private Label jenis1;

    @FXML
    private Label jenis2;

    @FXML
    private Label jenis3;

    @FXML
    private Label jenis4;

    @FXML
    private Label kategori1;

    @FXML
    private Label kategori2;

    @FXML
    private Label kategori3;

    @FXML
    private Label kategori4;

    @FXML
    private Label harga1;

    @FXML
    private Label harga2;

    @FXML
    private Label harga3;

    @FXML
    private Label harga4;
    @FXML
    private Button hapus1;

    @FXML
    private Button hapus2;

    @FXML
    private Button hapus3;

    @FXML
    private Button hapus4;

    @FXML
    private JFXComboBox kategori;
    ObservableList<String> KategoriList = FXCollections.observableArrayList("Makanan","Barang Lain");
    @FXML
    private JFXComboBox jenis;
    ObservableList<String> JenisList = FXCollections.observableArrayList("Pack");
    
    int kodecek, namacek, jeniscek, kategoricek, hargacek;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        kategori.setItems(KategoriList);
        jenis.setItems(JenisList);
    }    

    @FXML
    private void tekanSimpan(ActionEvent event) {
        cek();
        
    }

    @FXML
    private void tekanBersihkan(ActionEvent event) {
        kodeb.setText("");
        namab.setText("");
        kategori.setValue("");
        jenis.setValue("");
        harga.setText("");
    }

    @FXML
    private void tekanHapus(ActionEvent event) {
        kode1.setText("");
        nama1.setText("");
        kategori1.setText("");
        jenis1.setText("");
        harga1.setText("");
        kode2.setText("");
           nama2.setText("");
            kategori2.setText("");
            jenis2.setText("");
            harga2.setText("");
            kode3.setText("");
            nama3.setText("");
            kategori3.setText("");
            jenis3.setText("");
            harga3.setText("");
             kode4.setText("");
            nama4.setText("");
            kategori4.setText("");
            jenis4.setText("");
            harga4.setText("");
    }

    @FXML
    private void tekanKeluar(ActionEvent event) {
        System.exit(0);
    }
    
    void cek(){
        String kode=kodeb.getText();
        String nama=namab.getText();
        String kategorih=(String) kategori.getValue();
        String jenish=(String) jenis.getValue();
        String hargah=harga.getText();
       
        
        
        if(kode1.getText().length() == 0 && nama1.getText().length() == 0 && kategori1.getText().length() == 0 && jenis1.getText().length() == 0 && harga1.getText().length() == 0){
            kode1.setText(kode);
            nama1.setText(nama);
            kategori1.setText(kategorih);
            jenis1.setText(jenish);
            harga1.setText(hargah);
        }else if(kode2.getText().length() == 0 && nama2.getText().length() == 0 && kategori2.getText().length() == 0 && jenis2.getText().length() == 0 && harga2.getText().length() == 0){
            kode2.setText(kode);
            nama2.setText(nama);
            kategori2.setText(kategorih);
            jenis2.setText(jenish);
            harga2.setText(hargah);
        }else if(kode3.getText().length() == 0 && nama3.getText().length() == 0 && kategori3.getText().length() == 0 && jenis3.getText().length() == 0 && harga3.getText().length() == 0){
            kode3.setText(kode);
            nama3.setText(nama);
            kategori3.setText(kategorih);
            jenis3.setText(jenish);
            harga3.setText(hargah);
        }
        else if(kode4.getText().length() == 0 && nama4.getText().length() == 0 && kategori4.getText().length() == 0 && jenis4.getText().length() == 0 && harga4.getText().length() == 0){
            kode4.setText(kode);
            nama4.setText(nama);
            kategori4.setText(kategorih);
            jenis4.setText(jenish);
            harga4.setText(hargah);
        }
        
    }
    @FXML
    void tekanHapus1(ActionEvent event) {
            kode1.setText("");
            nama1.setText("");
            kategori1.setText("");
            jenis1.setText("");
            harga1.setText("");
    }

    @FXML
    void tekanHapus2(ActionEvent event) {
            kode2.setText("");
            nama2.setText("");
            kategori2.setText("");
            jenis2.setText("");
            harga2.setText("");
    }

    @FXML
    void tekanHapus3(ActionEvent event) {
             kode3.setText("");
            nama3.setText("");
            kategori3.setText("");
            jenis3.setText("");
            harga3.setText("");
    }

    @FXML
    void tekanHapus4(ActionEvent event) {
             kode4.setText("");
            nama4.setText("");
            kategori4.setText("");
            jenis4.setText("");
            harga4.setText("");
    }
}
