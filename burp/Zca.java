package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zca extends Zni implements Zk94 {
  @Zzvo(1)
  private final Zstu ZM;
  
  @Zzvo(2)
  private final Zstu ZW;
  
  public Zca(Zstu paramZstu1, Zstu paramZstu2) {
    Zuh.Zb((paramZstu1 != null), Zqf.Zv);
    this.ZM = paramZstu1;
    this.ZW = paramZstu2;
  }
  
  public Zstu ZZX() {
    return this.ZM;
  }
  
  public Zstu ZZZ() {
    return this.ZW;
  }
  
  public Zk94 ZO(Zr_4 paramZr_4) {
    Zbqc[] arrayOfZbqc = Zelr.ZZ();
    Zstu zstu1 = (this.ZM == null) ? null : this.ZM.Zp(paramZr_4);
    Zstu zstu2 = (this.ZW == null) ? null : this.ZW.Zp(paramZr_4);
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[1]); 
    return paramZr_4.<Zk94>ZH(new Zelr(zstu1, zstu2));
  }
  
  public Zeu4<? extends Zk94> ZF() {
    return ZR;
  }
  
  public boolean equals(Object paramObject) {
    return Zse6.Z_(this, paramObject);
  }
  
  public int hashCode() {
    return Zse6.ZP(this);
  }
  
  public String toString() {
    return ZZ1();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zca.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */