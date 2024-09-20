package burp;

import java.util.ArrayList;
import java.util.List;

class Zzm5 {
  boolean ZR(Zku6 paramZku6, Zs68 paramZs68) {
    return !ZV(paramZku6, paramZs68).isEmpty();
  }
  
  List<Zlzy> ZV(Zku6 paramZku6, Zs68 paramZs68) {
    String str = Zmuh.Zb();
    ArrayList<Zlzy> arrayList = new ArrayList();
    if (paramZku6 == null || !paramZku6.Zh())
      return arrayList; 
    Zehq zehq = (new Zlqv()).Zc(paramZs68);
    for (Zkv8 zkv8 : paramZku6.ZP((byte)2)) {
      if (!Zn(zkv8))
        continue; 
      Zn(zehq, zkv8, arrayList);
      if (str != null)
        break; 
    } 
    return arrayList;
  }
  
  private void Zn(Zehq paramZehq, Zkv8 paramZkv8, List<Zlzy> paramList) {
    String str = Zmuh.Zb();
    for (Zmcj zmcj : paramZehq.ZD) {
      if (Zw(paramZkv8, zmcj.Zk, zmcj.Zp) && !ZS(paramZkv8, paramZehq.ZV))
        paramList.add(new Zlzy(paramZkv8, zmcj)); 
      if (str != null)
        break; 
    } 
  }
  
  private boolean ZS(Zkv8 paramZkv8, List<Zlrh> paramList) {
    String str = Zmuh.Zb();
    for (Zlrh zlrh : paramList) {
      if (Zw(paramZkv8, zlrh.ZN, zlrh.Zg))
        return true; 
      if (str != null)
        break; 
    } 
    return false;
  }
  
  private boolean Zw(Zkv8 paramZkv8, int paramInt1, int paramInt2) {
    return ((paramZkv8.Zw()).Z_ >= paramInt1 && (paramZkv8.Zw()).Z_ <= paramInt2);
  }
  
  private boolean Zn(Zkv8 paramZkv8) {
    return ((paramZkv8.Zw()).ZX == 19 || (paramZkv8.Zw()).ZX == 20 || (paramZkv8.Zw()).ZX == 21 || (paramZkv8.Zw()).ZX == 22 || (paramZkv8.Zw()).ZX == 6 || (paramZkv8.Zw()).ZX == 4 || (paramZkv8.Zw()).ZX == 5 || (paramZkv8.Zw()).ZX == 7 || (paramZkv8.Zw()).ZX == 12 || (paramZkv8.Zw()).ZX == 13 || (paramZkv8.Zw()).ZX == 14 || (paramZkv8.Zw()).ZX == 15 || (paramZkv8.Zw()).ZX == 8 || (paramZkv8.Zw()).ZX == 9 || (paramZkv8.Zw()).ZX == 10 || (paramZkv8.Zw()).ZX == 11);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzm5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */