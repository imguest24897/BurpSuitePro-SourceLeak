package burp;

import java.util.List;
import java.util.stream.Collectors;

class Zv8m {
  private Zlit Zz;
  
  private String ZR;
  
  private String Zi;
  
  private Zsba Z_;
  
  private List<Zlou> ZA;
  
  private List<String> ZB;
  
  Zv8m(Zt68 paramZt68) {
    this.Zz = paramZt68.Zo();
    this.ZR = paramZt68.ZX();
    this.Zi = paramZt68.ZV();
    this.Z_ = paramZt68.Zr();
    this.ZA = paramZt68.Zm();
    this.ZB = paramZt68.ZP();
  }
  
  void Zg(Zk9o paramZk9o) {
    this.Zz = paramZk9o.Zf;
    this.ZR = paramZk9o.ZJ;
    this.Zi = paramZk9o.ZE;
  }
  
  void Zq(Zsba paramZsba) {
    this.Z_ = paramZsba;
  }
  
  void Zy(List<Zt8g> paramList) {
    this.ZA = (List<Zlou>)paramList.stream().map(Zlou::Zs).collect(Collectors.toList());
  }
  
  void ZH(List<String> paramList) {
    this.ZB = paramList;
  }
  
  Zt68 Za() {
    return new Zt6l(this.Zz, this.ZR, this.Zi, this.Z_, this.ZA, this.ZB);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zv8m.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */