package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Zliq {
  final Zvs ZH;
  
  private final List<Zxov> Zz = new ArrayList<>();
  
  Zliq(Zvs paramZvs, Zxov paramZxov) {
    this.ZH = paramZvs;
    this.Zz.add(paramZxov);
  }
  
  public void Zj(Zxov paramZxov) {
    this.Zz.add(paramZxov);
  }
  
  public Zxlj Zo() {
    Zn();
    List<Zlp9> list = (new Zzi9(this.Zz)).ZM();
    Zbqc[] arrayOfZbqc = Ztxo.Z_();
    ArrayList<Zxov> arrayList = new ArrayList();
    for (Zxov zxov : this.Zz) {
      if (list.contains(zxov.ZR.Zy.ZN()))
        Zs(zxov, arrayList); 
      if (arrayOfZbqc != null)
        break; 
    } 
    return new Zxlj(arrayList);
  }
  
  private void Zn() {
    ArrayList<Ztxo> arrayList = new ArrayList();
    byte b = 0;
    Zbqc[] arrayOfZbqc = Ztxo.Z_();
    while (b < this.Zz.size()) {
      Zxov zxov = this.Zz.get(b);
      if (!Zb(arrayList, zxov) && (zxov.ZR.ZO.ZA() == Zb25.HTTP || zxov.ZR.ZO.ZA() == Zb25.HTTPS)) {
        Zq(zxov);
        arrayList.add(zxov.Zg);
        b = 0;
      } 
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  private void Zq(Zxov paramZxov) {
    Zbqc[] arrayOfZbqc = Ztxo.Z_();
    Iterator<Zxov> iterator = this.Zz.iterator();
    while (iterator.hasNext()) {
      Zxov zxov = iterator.next();
      if (zxov.ZR.ZO.ZA() == Zb25.DNS && paramZxov.Zg.Zg(zxov.Zg))
        iterator.remove(); 
      if (arrayOfZbqc != null)
        break; 
    } 
  }
  
  private boolean Zb(List<Ztxo> paramList, Zxov paramZxov) {
    Zbqc[] arrayOfZbqc = Ztxo.Z_();
    for (Ztxo ztxo : paramList) {
      if (paramZxov.Zg.Zg(ztxo))
        return true; 
      if (arrayOfZbqc != null)
        break; 
    } 
    return false;
  }
  
  static void Zs(Zxov paramZxov, List<Zxov> paramList) {
    Zbqc[] arrayOfZbqc = Ztxo.Z_();
    Iterator<Zxov> iterator = paramList.iterator();
    while (iterator.hasNext()) {
      Zxov zxov = iterator.next();
      if (paramZxov.Zg.Zg(zxov.Zg)) {
        if (paramZxov.ZR.ZO.ZA() != Zb25.DNS) {
          iterator.remove();
          paramList.add(paramZxov);
        } 
        return;
      } 
      if (arrayOfZbqc != null)
        break; 
    } 
    paramList.add(paramZxov);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zliq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */