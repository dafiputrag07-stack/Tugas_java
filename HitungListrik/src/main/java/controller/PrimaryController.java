
package controller;

import java.math.BigDecimal;
import java.text.DecimalFormat;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;

import model.Listrik;

public class PrimaryController {

    @FXML
    private TextField getTarifPerKWh;

    @FXML
    private TextField getPemakaianKWh;

    @FXML
    private Label tampilkanHasil;

    @FXML
    private void hitungTagihan(ActionEvent event) {

        try {
            String tarif = getTarifPerKWh.getText().trim();
            String pemakaian = getPemakaianKWh.getText().trim();

            BigDecimal tarifPerKWh =
                new BigDecimal(tarif.replace(",", "."));

            BigDecimal pemakaianKWh =
                new BigDecimal(pemakaian.replace(",", "."));

            Listrik listrik = new Listrik(
                pemakaianKWh,
                tarifPerKWh
            );

            BigDecimal hasil = listrik.hitungTagihan();

            DecimalFormat format = new DecimalFormat("#,##0.##");

            tampilkanHasil.setText(
                "Total Tagihan: Rp " + format.format(hasil)
            );

        } catch (NumberFormatException e) {

            tampilkanHasil.setText(
                "Masukkan angka yang valid!"
            );

        } catch (IllegalArgumentException e) {

            tampilkanHasil.setText(e.getMessage());

        }
    }
}
