package burp;

import java.util.List;

public class Zsup implements Zbj6 {
  private final Zli8 ZZ;
  
  private final Ze73 ZN;
  
  private Zbj5 ZR;
  
  private Zsup(Zli8 paramZli8, Ze73 paramZe73, Zbj5 paramZbj5) {
    this.ZZ = paramZli8;
    this.ZN = paramZe73;
    this.ZR = paramZbj5;
  }
  
  public static Zsup Zs(Zli8 paramZli8, Ze73 paramZe73, Zeu9 paramZeu9) {
    if (paramZeu9 instanceof Zgd4)
      return new Zsup(paramZli8, paramZe73, paramZeu9.ZHN()); 
    Ze5n ze5n = paramZeu9.ZHN().ZfM();
    Zlk0 zlk0 = paramZeu9.ZHN().ZfJ();
    Zmvb zmvb = Zmvb.ZX();
    Zbj5 zbj5 = Zbj5.Zo(Zkmn.Zr(), zmvb, ze5n, zlk0.Zg(), 0);
    return new Zsup(paramZli8, paramZe73, zbj5);
  }
  
  public void ZJ(Zzl1 paramZzl1) {
    List<Zg8y> list = this.ZZ.Zh(paramZzl1.Z_i(), paramZzl1.Z_3());
    Ze0_ ze0_ = Ze0_.ZW(list);
    Zlk0 zlk0 = Zlk0.ZK(ze0_);
    Ze5n ze5n = Ze5n.Z_(paramZzl1.Z_3());
    String str = Zs8m.ZY();
    Zmvb zmvb = Zmvb.ZX();
    this.ZR = Zbj5.Zo(Zkmn.Zr(), zmvb, ze5n, zlk0.Zg(), 0);
    if (Zbqc.Zwu() == null)
      Zs8m.ZC("r8501b"); 
  }
  
  public boolean ZY(Zzl1 paramZzl1) {
    if (paramZzl1.Z_O().Zh())
      return false; 
    Zlve zlve = paramZzl1.Z_3();
    Ze5n ze5n = Ze5n.Z_(zlve);
    if (!this.ZR.ZfM().Zp(ze5n))
      return false; 
    List<Zg8y> list = this.ZZ.Zh(paramZzl1.Z_i(), zlve);
    Ze0_ ze0_ = Ze0_.ZW(list);
    List<Zrho> list1 = Zlk0.ZK(ze0_).Zg();
    Zkmn zkmn = this.ZR.ZfU();
    Zmvb zmvb = this.ZR.Zf3();
    Zbj5 zbj5 = Zbj5.Zo(zkmn, zmvb, ze5n, list1, 0);
    return this.ZN.<Zm9j>Zc(zbj5, Zras.ZM(Zm9j.ZA(this.ZR))).Zv();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsup.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */