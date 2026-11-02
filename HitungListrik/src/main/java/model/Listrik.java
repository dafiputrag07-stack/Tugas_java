package model;

import java.math.BigDecimal;

public class Listrik {
    private BigDecimal pemakaianKWh;
    private BigDecimal tarifPerKWh;

    public Listrik(BigDecimal pemakaianKWh,
                             BigDecimal tarifPerKWh) {
        if (pemakaianKWh == null
                || pemakaianKWh.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException(
                    "Pemakaian listrik harus lebih besar dari 0.");
        }

        if (tarifPerKWh == null
                || tarifPerKWh.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException(
                    "Tarif listrik harus lebih besar dari 0.");
        }

        this.pemakaianKWh = pemakaianKWh;
        this.tarifPerKWh = tarifPerKWh;
    }

    public BigDecimal hitungTagihan() {
        return pemakaianKWh.multiply(tarifPerKWh);
    }

    public BigDecimal getPemakaianKWh() {
        return pemakaianKWh;
    }

    public BigDecimal getTarifPerKWh() {
        return tarifPerKWh;
    }
}
