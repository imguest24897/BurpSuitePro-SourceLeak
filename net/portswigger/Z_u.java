package net.portswigger;

import java.util.ArrayList;
import java.util.List;

class Z_u extends Z_j {
  private final Zv0 ZP;
  
  private final List<Zu6> ZW;
  
  public Z_u(Zv0 paramZv0) {
    this.ZP = paramZv0;
    this.ZW = new ArrayList<>();
  }
  
  public void ZY(Zs7 paramZs7) {
    paramZs7.examples().stream().map(String::valueOf).forEach(this::ZU);
  }
  
  public void ZC(Zrmr paramZrmr) {
    paramZrmr.Zmk().stream().map(String::valueOf).forEach(this::ZU);
    paramZrmr.Zm9().stream().map(String::valueOf).forEach(this::ZU);
  }
  
  public void Zz(Zzz paramZzz) {
    paramZzz.examples().stream().map(String::valueOf).forEach(this::ZU);
  }
  
  public void Zr(Zt0 paramZt0) {
    paramZt0.Zgl().stream().map(String::valueOf).forEach(this::ZU);
  }
  
  public void Zc(Zrm7 paramZrm7) {
    String str = paramZrm7.ZgH();
    ZU(str);
  }
  
  public void ZE(Zzx paramZzx) {
    String str = String.valueOf(paramZzx.Zwn());
    ZU(str);
  }
  
  public void ZI(Zoj paramZoj) {
    paramZoj.ZQO().stream().map(String::valueOf).forEach(this::ZU);
  }
  
  public void ZT(Zkv paramZkv) {
    String str = String.valueOf(paramZkv.ZNG());
    ZU(str);
  }
  
  private void ZU(String paramString) {
    boolean bool = Z_j.ZN();
    if (!this.ZW.isEmpty()) {
      List<String> list = ((Zu6)this.ZW.get(0)).Zc();
      list.add(paramString);
      if (bool) {
        list = new ArrayList<>();
        list.add(paramString);
        this.ZW.add(list::lambda$visitValue$0);
        this.ZP.ZL(this.ZW);
        this.ZP.Za(false);
        return;
      } 
      return;
    } 
    ArrayList<String> arrayList = new ArrayList();
    arrayList.add(paramString);
    this.ZW.add(arrayList::lambda$visitValue$0);
    this.ZP.ZL(this.ZW);
    this.ZP.Za(false);
  }
  
  protected void Zq(String paramString) {}
  
  private static List lambda$visitValue$0(List paramList) {
    return paramList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Z_u.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */