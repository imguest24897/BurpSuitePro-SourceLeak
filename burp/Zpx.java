package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Zpx extends Zni implements Zzq1 {
  @Zzvo(32)
  private final Zll7 Za;
  
  @Zzvo(33)
  private Zzi8 Zy;
  
  @Zzvo(34)
  private Zb0p ZC;
  
  @Zzvo(35)
  private Zsnv Zt;
  
  @Zzvo(36)
  private Zzj5 Zh;
  
  public Zpx(Zll7 paramZll7, Zzi8 paramZzi8, Zb0p paramZb0p, Zsnv paramZsnv, Zzj5 paramZzj5) {
    this.Za = paramZll7;
    this.Zy = paramZzi8;
    this.ZC = paramZb0p;
    this.Zt = paramZsnv;
    this.Zh = paramZzj5;
  }
  
  public Zehu Zu2() {
    return new Zgls(this);
  }
  
  public void Zi(Zz_r paramZz_r) {
    paramZz_r.Zg(Zeew.SCANNER, this.Zy);
  }
  
  public boolean ZR(Zbx0 paramZbx0) {
    return paramZbx0.Zp(this.Zy);
  }
  
  public Zzi8 ZRm() {
    return this.Zy;
  }
  
  public void Zg(Zb03 paramZb03) {
    paramZb03.ZC(this.Zy);
  }
  
  public Zll7 Zub() {
    return Zriz.Zi(this.Za);
  }
  
  public int Zuj() {
    return 2;
  }
  
  public void ZY(Zb_h paramZb_h) {
    Zbxq.ZC(this, paramZb_h);
  }
  
  public Zeu4<? extends Zgkc> ZF() {
    return (Zeu4<? extends Zgkc>)ZN;
  }
  
  public List<Ztkk> ZRH() {
    ArrayList<Zb0p> arrayList = new ArrayList();
    if (this.ZC != null)
      arrayList.add(this.ZC); 
    if (this.Zt != null)
      arrayList.add(this.Zt); 
    if (this.Zh != null)
      arrayList.add(this.Zh); 
    return (List)arrayList;
  }
  
  public Zsnv ZRs() {
    return this.Zt;
  }
  
  public String ZR0() {
    return (this.ZC == null && this.Zt == null && this.Zh == null) ? null : ((this.ZC != null) ? this.ZC.ZN() : ((this.Zt != null) ? this.Zt.ZN() : this.Zh.ZN()));
  }
  
  public Zte7 ZC(Zr9a paramZr9a) {
    return paramZr9a.Zf(this);
  }
  
  public Zte7 Zq(Zr9a paramZr9a) {
    return ZC(paramZr9a);
  }
  
  public Zzk5 Zu(Zgkc paramZgkc, Zz1h paramZz1h) {
    if (paramZgkc instanceof Zzq1) {
      Zzq1 zzq1 = (Zzq1)paramZgkc;
      if (this.ZC == null && zzq1.ZRL() != null) {
        if (!Zbxq.ZJ(this, zzq1))
          return Zzk5.ADD_OUT_OF_BAND_EVIDENCE; 
        this.ZC = zzq1.ZRL();
        return Zzk5.OUT_OF_BAND_EVIDENCE_MUTATED;
      } 
      if (this.Zt == null && zzq1.ZRs() != null) {
        if (!Zbxq.ZJ(this, zzq1))
          return Zzk5.ADD_OUT_OF_BAND_EVIDENCE; 
        this.Zt = zzq1.ZRs();
        return Zzk5.OUT_OF_BAND_EVIDENCE_MUTATED;
      } 
      if (this.Zh == null && zzq1.ZRg() != null) {
        if (!Zbxq.ZJ(this, zzq1))
          return Zzk5.ADD_OUT_OF_BAND_EVIDENCE; 
        this.Zh = zzq1.ZRg();
        return Zzk5.OUT_OF_BAND_EVIDENCE_MUTATED;
      } 
      return Zzk5.EVIDENCE_EXISTS;
    } 
    return Zzk5.CONTINUE;
  }
  
  public Zr1s ZI(Consumer<Zzq1> paramConsumer) {
    paramConsumer.accept(this);
    return Zr1s.Zf;
  }
  
  public Zb0p ZRL() {
    return this.ZC;
  }
  
  public Zzj5 ZRg() {
    return this.Zh;
  }
  
  public void Zi(Zzi8 paramZzi8) {
    this.Zy = paramZzi8;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zpx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */