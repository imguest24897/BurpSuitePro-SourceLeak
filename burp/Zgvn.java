package burp;

import java.awt.Component;
import java.util.List;
import java.util.Optional;

public interface Zgvn extends Ztql, Ztvo {
  public static final Zgvn Zv = new Zs4a();
  
  void Zr();
  
  void Zs(Zrdb paramZrdb);
  
  List<Zesk> ZY();
  
  List<Component> Z_(List<Zesk> paramList, Zezw paramZezw);
  
  void ZI(Ztj3 paramZtj3);
  
  void ZC(Ztj3 paramZtj3);
  
  List<Zg_8> Zo();
  
  Zgq<Zrdb> ZI(Zz1i paramZz1i, Ze3n paramZe3n, Zmfj paramZmfj);
  
  Zgq<Zrdb> Zz(Zz1i paramZz1i, Ze3n paramZe3n, Zmfj paramZmfj, Zxs7 paramZxs7, Ztpx paramZtpx, int paramInt);
  
  Zlzj Zi(String paramString, int paramInt);
  
  int ZT();
  
  List<String> Zu();
  
  Zg0h ZO(String paramString);
  
  List<String> Ze();
  
  Zrun ZT(String paramString);
  
  List<String> ZL();
  
  Zkaj ZL(String paramString);
  
  List<Zryx> Zd();
  
  Zryx ZD(String paramString, boolean paramBoolean);
  
  boolean ZR();
  
  void ZB(Zmzk paramZmzk, Zstu paramZstu1, Zstu paramZstu2, Zzvh paramZzvh);
  
  void Za(Zmzk paramZmzk, Zbr paramZbr, Zstu paramZstu, Zzvh paramZzvh);
  
  default List<Zsvm> ZQ() {
    return Zd().stream().filter(Zryx::Zl).map(Zmo3::Zq).filter(Optional::isPresent).map(Optional::get).toList();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgvn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */