package burp;

import java.util.ArrayList;
import java.util.List;

public class Zzih {
  private final Ze2t Zy;
  
  public final Zgfi Za;
  
  public final String Zn;
  
  public int ZD;
  
  public final int Zp;
  
  final List<Zsvc> ZV = new ArrayList<>();
  
  public Zzih(Zgfi paramZgfi, Ze2t paramZe2t) {
    this.Za = paramZgfi;
    int i = Zsvc.Zd();
    this.Zy = paramZe2t;
    this.Zn = paramZgfi.ZQ();
    this.ZD = 0;
    this.Zp = this.Zn.length();
    if (Zbqc.Zwu() == null)
      Zsvc.ZQ(++i); 
  }
  
  public char Z_() {
    return this.Zn.charAt(this.ZD);
  }
  
  public char ZO(int paramInt) {
    return this.Zn.charAt(paramInt);
  }
  
  public void Zm(Zsvc paramZsvc) {
    this.Zy.ZZ(paramZsvc, this);
  }
  
  public Zsvc Zc() {
    return ZW(0);
  }
  
  public Zsvc ZW(int paramInt) {
    int i = this.ZV.size() - 1;
    return (i < paramInt) ? null : this.ZV.get(i - paramInt);
  }
  
  public void ZQ(Zsvc paramZsvc) {
    this.ZV.add(paramZsvc);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzih.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */