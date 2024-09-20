package burp;

import java.util.ArrayList;
import java.util.List;

public class Zsiw {
  private final List<Zlou> ZB;
  
  private final List<Zlou> Za;
  
  private static Zbqc[] Zg;
  
  public Zsiw(List<Zlou> paramList) {
    this.ZB = paramList;
    this.Za = new ArrayList<>();
  }
  
  public List<Zlou> Zc() {
    return this.ZB;
  }
  
  public boolean ZX() {
    return this.ZB.isEmpty();
  }
  
  public void ZK(Zx8_ paramZx8_) {
    Zbqc[] arrayOfZbqc = ZB();
    for (Zmwr zmwr : paramZx8_.ZZp()) {
      Zlou zlou = Zk(zmwr);
      if (zlou != null && zmwr.Zh1() != null && !zmwr.Zh1().equals(zlou.Zr))
        this.Za.add(zlou); 
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  public boolean ZE() {
    Zbqc[] arrayOfZbqc = ZB();
    if (this.ZB.isEmpty())
      return false; 
    for (Zlou zlou : this.ZB) {
      if (ZY(zlou))
        return false; 
      if (arrayOfZbqc != null)
        break; 
    } 
    return true;
  }
  
  public void Z_(List<Zl1r> paramList) {
    Zbqc[] arrayOfZbqc = ZB();
    for (Zlou zlou : this.ZB) {
      paramList.add(new Zl1r(zlou.ZE, zlou.ZV));
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  public void Zt(List<Zl1r> paramList) {
    Zbqc[] arrayOfZbqc = ZB();
    for (Zlou zlou : this.ZB) {
      paramList.add(new Zl1r(zlou.ZP, zlou.ZV));
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  private Zlou Zk(Zmwr paramZmwr) {
    Zbqc[] arrayOfZbqc = ZB();
    if (paramZmwr == null || paramZmwr.ZhK() != Zl2w.HIDDEN)
      return null; 
    for (Zlou zlou : this.ZB) {
      if (paramZmwr.Zh4() != null && paramZmwr.Zh4().equals(zlou.ZA))
        return zlou; 
      if (arrayOfZbqc != null)
        break; 
    } 
    return null;
  }
  
  private boolean ZY(Zlou paramZlou) {
    Zbqc[] arrayOfZbqc = ZB();
    for (Zlou zlou : this.Za) {
      if (zlou.Zx == paramZlou.Zx && zlou.ZA != null && zlou.ZA.equals(paramZlou.ZA))
        return true; 
      if (arrayOfZbqc != null)
        break; 
    } 
    return false;
  }
  
  public static void ZC(Zbqc[] paramArrayOfZbqc) {
    Zg = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZB() {
    return Zg;
  }
  
  static {
    if (ZB() != null)
      ZC(new Zbqc[2]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsiw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */