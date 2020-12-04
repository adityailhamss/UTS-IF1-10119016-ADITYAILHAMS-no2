package uts.if1.pkg10119016.adityailhams.no2;

/**
 *
 * @author aditi
 */
public class Tabungan {
    private int saldo;
    
       public Tabungan (int saldo){
           this.saldo = saldo;
       }
       public int ambilTabungan(int jumlah){
           return saldo-jumlah;
       }
}
