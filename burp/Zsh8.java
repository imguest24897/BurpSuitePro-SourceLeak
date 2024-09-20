package burp;

import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public interface Zsh8 extends Zk5_, Zgpi<Zsh8> {
  public static final Zk_u ZA = new Zk_u();
  
  byte[] ZJ(Zgxp paramZgxp, int paramInt, boolean paramBoolean);
  
  void ZPO();
  
  boolean ZP(Zrdu paramZrdu, String paramString, Zgxp paramZgxp);
  
  void ZPU() throws Ztku;
  
  String ZMm(String paramString);
  
  void Zx(Zsdr paramZsdr1, Zsdr paramZsdr2);
  
  Zstu ZPJ();
  
  void Zn(Zstu paramZstu);
  
  Zejb ZPa();
  
  void ZX(Zejb paramZejb);
  
  Zrte<Ze9k> ZPq();
  
  void Zf(Zrte<Ze9k> paramZrte);
  
  boolean ZP0();
  
  void Zv(boolean paramBoolean);
  
  boolean ZPx();
  
  void Zs(boolean paramBoolean);
  
  boolean ZP5();
  
  void ZS(boolean paramBoolean);
  
  int ZPD();
  
  void ZM1(int paramInt);
  
  int ZPP();
  
  void ZMu(int paramInt);
  
  boolean ZPu();
  
  void Zy(boolean paramBoolean);
  
  boolean ZP8();
  
  void Zi(boolean paramBoolean);
  
  boolean ZPn();
  
  void ZR(boolean paramBoolean);
  
  boolean ZPh();
  
  void ZH(boolean paramBoolean);
  
  boolean ZPs();
  
  void Zc(boolean paramBoolean);
  
  Zz4g ZP_();
  
  void ZK(Zz4g paramZz4g);
  
  Zmae ZPM();
  
  void ZG(Zmae paramZmae);
  
  boolean ZPj();
  
  void ZG(boolean paramBoolean);
  
  Zrte<Zefg<Zt8g>> ZPe();
  
  void Zc(Zrte<Zefg<Zt8g>> paramZrte);
  
  Zzwo<Zsdr, Zsdr> ZPR();
  
  void ZV(Zzwo<Zsdr, Zsdr> paramZzwo);
  
  boolean ZPQ();
  
  void Zq(boolean paramBoolean);
  
  boolean ZPX();
  
  Zr_4 ZPz();
  
  Zxpp ZPE();
  
  void ZD(Zxpp paramZxpp);
  
  Zrp ZPH();
  
  void ZB(Zrp paramZrp);
  
  Zsh0 ZPY();
  
  void Zv(Zsh0 paramZsh0);
  
  default Zeu4<? extends Zsh8> ZF() {
    return ZA;
  }
  
  default List<Zkq1> ZPg() {
    Zrte<Ze9k> zrte = ZPq();
    ArrayList<Zkq1> arrayList = new ArrayList(zrte.Zpu());
    int i = Zxw4.Zt();
    for (Ze9k ze9k : zrte) {
      if (ze9k != null)
        try {
          arrayList.add(ze9k.ZiB());
        } catch (Ztku ztku) {
          Zah.Zl(ztku, Zk_.UNEXPECTED);
        }  
      if (i != 0)
        break; 
    } 
    return arrayList;
  }
  
  default boolean ZPS() {
    Zrte<Ze9k> zrte = ZPq();
    byte b = 0;
    int i = Zxw4.Zt();
    while (b < zrte.Zpu()) {
      if (((Ze9k)zrte.ZdF(b)).Zil())
        return true; 
      b++;
      if (i != 0)
        break; 
    } 
    return false;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsh8.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */