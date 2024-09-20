package burp;

import java.util.List;
import net.portswigger.Zkb;

public class Zkk {
  private static int ZJ;
  
  public static <T extends Zgpi> Zefg<T> Zl(Zr_4 paramZr_4, Zeu4<T> paramZeu4, int paramInt) {
    Zl_p<T> zl_p = new Zl_p<>(paramZeu4);
    Zgw2<T> zgw2 = new Zgw2<>(zl_p, paramZeu4, paramInt);
    return paramZr_4.<Zefg<T>>ZH(zgw2);
  }
  
  public static <T extends Zgpi> Zefg<T> ZV(Zr_4 paramZr_4, Zeu4<T> paramZeu4) {
    Zl_p<T> zl_p = new Zl_p<>(paramZeu4);
    return paramZr_4.<Zefg<T>>ZH(zl_p.Zq());
  }
  
  public static <T extends Zgpi> Zefg<T> Zy(Zr_4 paramZr_4, Zeu4<T> paramZeu4, int paramInt) {
    Zkdo<T> zkdo = new Zkdo<>(paramZeu4);
    Zr5p<T> zr5p = new Zr5p<>(zkdo, paramZeu4, paramInt);
    return paramZr_4.<Zefg<T>>ZH(zr5p);
  }
  
  public static <T extends Zgpi> Zefg<T> ZX(Zkit paramZkit, Zeu4<T> paramZeu4, Zx2h<T> paramZx2h) {
    Zrte<T> zrte = paramZx2h.Zt();
    int i = Zn();
    int j = paramZx2h.size();
    Zkdo<T> zkdo = new Zkdo<>(paramZeu4);
    Zr5p<T> zr5p = new Zr5p<>(zkdo, paramZeu4, zrte, j);
    if (i == 0)
      Zbqc.Zr(new Zbqc[4]); 
    return paramZkit.<Zefg<T>>ZH(zr5p);
  }
  
  public static <T extends Zgpi<T>> Zefg<T> Zx(Zr_4 paramZr_4, Zeu4<T> paramZeu4, List<T> paramList) {
    if (paramList == null)
      return null; 
    Zefg<Zgpi> zefg = Zl(paramZr_4, paramZeu4, paramList.size());
    zefg.addAll(paramList);
    return (Zefg)zefg;
  }
  
  private static void lambda$makeListOfByteArrays$2(Zefg<Zstu> paramZefg, Zr_4 paramZr_4, String paramString) {
    paramZefg.add(paramZr_4.ZZ(Zkb.Zy(paramString)));
  }
  
  private static void lambda$makeListOfByteArrays$1(Zefg<Zstu> paramZefg, Zr_4 paramZr_4, String paramString) {
    paramZefg.add(paramZr_4.ZZ(Zkb.Zy(paramString)));
  }
  
  private static void lambda$makeListOfByteArrays$0(Zefg<Zstu> paramZefg, Zr_4 paramZr_4, byte[] paramArrayOfbyte) {
    paramZefg.add(paramZr_4.ZZ(paramArrayOfbyte));
  }
  
  public static void Ze(int paramInt) {
    ZJ = paramInt;
  }
  
  public static int Zn() {
    return ZJ;
  }
  
  public static int ZZ() {
    int i = Zn();
    return (i == 0) ? 3 : 0;
  }
  
  static {
    if (ZZ() != 0)
      Ze(41); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */