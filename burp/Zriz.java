package burp;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Zriz {
  private static String Zp;
  
  public static <T extends Zll7> T Zq(T paramT, Zxcg<? extends T> paramZxcg, Zr_4 paramZr_4) {
    return (T)((paramT != null) ? (Object)paramT : ((paramZxcg == null) ? null : paramZr_4.<Zll7>ZH((Zsqx)paramZxcg)));
  }
  
  public static <T extends Zgkc> T ZC(T paramT, Zlfv<? extends T> paramZlfv, Zr_4 paramZr_4, Map<Zvow, Zzi8> paramMap) {
    return (T)((paramT != null) ? (Object)paramT : ((paramZlfv == null) ? null : paramZr_4.<Zgkc>ZH((Zsqx)paramZlfv.Zc(paramMap))));
  }
  
  public static Zzi8 Zy(Map<Zvow, Zzi8> paramMap, Zzi8 paramZzi8, Zvow paramZvow, Zr_4 paramZr_4) {
    if (paramZzi8 != null)
      return paramZzi8; 
    if (paramZvow == null)
      return null; 
    paramZzi8 = paramMap.get(paramZvow);
    if (paramZzi8 != null)
      return paramZzi8; 
    paramZzi8 = paramZr_4.<Zzi8>ZH(paramZvow);
    paramMap.put(paramZvow, paramZzi8);
    return paramZzi8;
  }
  
  public static Zefg<Zzi8> ZH(Map<Zvow, Zzi8> paramMap, Zefg<Zzi8> paramZefg, List<Zvow> paramList, Zr_4 paramZr_4) {
    String[] arrayOfString = Ztub.Zo();
    if (paramZefg != null)
      return paramZefg; 
    Zefg<Zzi8> zefg = Zkk.Zl(paramZr_4, Zzi8.ZP, paramList.size());
    for (Zvow zvow : paramList) {
      Zzi8 zzi8 = paramMap.get(zvow);
      if (zzi8 == null) {
        zzi8 = paramZr_4.<Zzi8>ZH(zvow);
        paramMap.put(zvow, zzi8);
      } 
      zefg.add(zzi8);
      if (arrayOfString == null)
        break; 
    } 
    return zefg;
  }
  
  public static Zefg<Zgnx> ZV(Zefg<Zgnx> paramZefg, List<Zznw> paramList, Zr_4 paramZr_4) {
    String[] arrayOfString = Ztub.Zo();
    if (paramZefg != null)
      return paramZefg; 
    Zefg<Zgnx> zefg = Zkk.Zl(paramZr_4, Zgnx.ZG, paramList.size());
    for (Zznw zznw : paramList) {
      zefg.add(paramZr_4.<Zgnx>ZH(zznw));
      if (arrayOfString == null)
        break; 
    } 
    return zefg;
  }
  
  public static Zefg<Zsdr> ZV(Zefg<Zsdr> paramZefg, Collection<String> paramCollection, Zr_4 paramZr_4) {
    String[] arrayOfString = Ztub.Zo();
    if (paramZefg != null)
      return paramZefg; 
    Zefg<Zgpi> zefg = Zkk.Zl(paramZr_4, Zsdr.Zo, paramCollection.size());
    for (String str : paramCollection) {
      zefg.add(paramZr_4.Zz(str));
      if (arrayOfString == null)
        break; 
    } 
    return (Zefg)zefg;
  }
  
  public static Map<Long, String> ZO(Zra_... paramVarArgs) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    Zra_[] arrayOfZra_ = paramVarArgs;
    String[] arrayOfString = Ztub.Zo();
    int i = arrayOfZra_.length;
    byte b = 0;
    while (b < i) {
      Zra_ zra_ = arrayOfZra_[b];
      hashMap.put(Long.valueOf(zra_.Zl), zra_.ZI);
      b++;
      if (arrayOfString == null)
        break; 
    } 
    return (Map)hashMap;
  }
  
  public static Zra_ ZG(Ztz3 paramZtz3, String paramString) {
    return new Zra_(paramZtz3.permanentIndex, paramString);
  }
  
  public static Zll7 Zi(Zll7 paramZll7) {
    return (paramZll7 == null) ? Zgid.ZO : paramZll7;
  }
  
  public static void Zj(String paramString) {
    Zp = paramString;
  }
  
  public static String ZN() {
    return Zp;
  }
  
  static {
    if (ZN() == null)
      Zj("bK0WUb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zriz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */