package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Zxmv extends Zxsr implements Zzq1 {
  Zxmv(Zkit paramZkit, long paramLong) {
    super(paramZkit, paramLong);
  }
  
  public Zehu Zu2() {
    return new Zrg0(this);
  }
  
  public void Zi(Zz_r paramZz_r) {
    paramZz_r.Zg(Zeew.SCANNER, this.Za.<Zll9>ZJ(this, (Zekb)Zksi.ZS));
  }
  
  public boolean ZR(Zbx0 paramZbx0) {
    return paramZbx0.Zp(this.Za.<Zll9>ZJ(this, (Zekb)Zksi.ZS));
  }
  
  public Zzi8 ZRm() {
    return this.Za.<Zzi8>ZJ(this, Zksi.ZS);
  }
  
  public void Zg(Zb03 paramZb03) {
    paramZb03.ZC(this.Za.<Zzi8>ZJ(this, Zksi.ZS));
  }
  
  public Zll7 Zub() {
    return Zriz.Zi(this.Za.<Zll7>ZJ(this, Zksi.Zi));
  }
  
  public int Zuj() {
    return 2;
  }
  
  public void ZY(Zb_h paramZb_h) {
    Zbxq.ZC(this, paramZb_h);
  }
  
  public Zeu4<? extends Zgkc> ZF() {
    return (Zeu4)ZN;
  }
  
  public List<Ztkk> ZRH() {
    Zb0p zb0p = this.Za.<Zb0p>ZJ(this, Zksi.Zo);
    Zsnv zsnv = this.Za.<Zsnv>ZJ(this, Zksi.ZQ);
    Zzj5 zzj5 = this.Za.<Zzj5>ZJ(this, Zksi.Zu);
    ArrayList<Zb0p> arrayList = new ArrayList();
    if (zb0p != null)
      arrayList.add(zb0p); 
    if (zsnv != null)
      arrayList.add(zsnv); 
    if (zzj5 != null)
      arrayList.add(zzj5); 
    return (List)arrayList;
  }
  
  public Zsnv ZRs() {
    return this.Za.<Zsnv>ZJ(this, Zksi.ZQ);
  }
  
  public Zb0p ZRL() {
    return this.Za.<Zb0p>ZJ(this, Zksi.Zo);
  }
  
  public Zzj5 ZRg() {
    return this.Za.<Zzj5>ZJ(this, Zksi.Zu);
  }
  
  public void Zi(Zzi8 paramZzi8) {
    this.Za.Zq(this, Zksi.ZS, paramZzi8);
  }
  
  public String ZR0() {
    return (ZRL() == null && ZRs() == null && ZRg() == null) ? null : ((ZRL() != null) ? ZRL().ZN() : ((ZRs() != null) ? ZRs().ZN() : ZRg().ZN()));
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
      if (ZRL() == null && zzq1.ZRL() != null) {
        if (!Zbxq.ZJ(this, zzq1))
          return Zzk5.ADD_OUT_OF_BAND_EVIDENCE; 
        Zb0p zb0p = paramZz1h.<Zb0p>Zz(zzq1.ZRL());
        this.Za.Zq(this, Zksi.Zo, zb0p);
        return Zzk5.OUT_OF_BAND_EVIDENCE_MUTATED;
      } 
      if (ZRs() == null && zzq1.ZRs() != null) {
        if (!Zbxq.ZJ(this, zzq1))
          return Zzk5.ADD_OUT_OF_BAND_EVIDENCE; 
        Zsnv zsnv = paramZz1h.<Zsnv>Zz(zzq1.ZRs());
        this.Za.Zq(this, Zksi.ZQ, zsnv);
        return Zzk5.OUT_OF_BAND_EVIDENCE_MUTATED;
      } 
      if (ZRg() == null && zzq1.ZRg() != null) {
        if (!Zbxq.ZJ(this, zzq1))
          return Zzk5.ADD_OUT_OF_BAND_EVIDENCE; 
        Zzj5 zzj5 = paramZz1h.<Zzj5>Zz(zzq1.ZRg());
        this.Za.Zq(this, Zksi.Zu, zzj5);
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
  
  static Zkit Zq(Zxmv paramZxmv) {
    return paramZxmv.Za;
  }
  
  static Zkit Zw(Zxmv paramZxmv) {
    return paramZxmv.Za;
  }
  
  static Zkit ZE(Zxmv paramZxmv) {
    return paramZxmv.Za;
  }
  
  static Zkit Zv(Zxmv paramZxmv) {
    return paramZxmv.Za;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxmv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */