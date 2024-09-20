package burp;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import net.portswigger.Zkb;

public class Zz36 {
  private final Zski ZT;
  
  private final String Zz;
  
  private Zz36(Zski paramZski, String paramString) {
    this.ZT = paramZski;
    this.Zz = paramString;
  }
  
  public static Zz36 Zc(Zmrv paramZmrv) {
    return Zz(paramZmrv, Zszj.IGNORE);
  }
  
  public static Zz36 Ze(Zmrv paramZmrv, Zszj paramZszj) {
    return Zz(paramZmrv, paramZszj);
  }
  
  private static Zz36 Zz(Zmrv paramZmrv, Zszj paramZszj) {
    Zg8y zg8y = paramZmrv.ZHO();
    Zski zski = Ze((zg8y == null) ? Collections.<Ze7n>emptyList() : zg8y.Zh(), paramZmrv.ZHZ(), paramZszj);
    String str = null;
    if (zg8y instanceof Zm3y) {
      Zm3y zm3y = (Zm3y)zg8y;
      str = Zd(zm3y.ZC());
    } 
    return new Zz36(zski, str);
  }
  
  static Zski Ze(List<? extends Ze7n> paramList, Zlat paramZlat, Zszj paramZszj) {
    Zski zski = Zl(paramZlat);
    if (zski == null)
      return null; 
    StringBuilder stringBuilder = new StringBuilder(Zkb.ZG(zski.ZyR().Zd4()));
    stringBuilder.append('?');
    LinkedList<String> linkedList = new LinkedList<>(Zy(zski.ZyR(), paramList));
    stringBuilder.append(linkedList.stream().sorted().collect(Collectors.joining("&")));
    Zax zax = new Zax(zski.ZyR().Zdz(), Zkb.Zy(stringBuilder.toString()));
    String str = paramZszj.ZM(zski.Zyb()) ? zski.Zyb() : null;
    return Zski.ZO(zax, str);
  }
  
  private static Zski Zl(Zlat paramZlat) {
    Zlve zlve = paramZlat.ZE();
    Zmfc<?> zmfc = zlve.ZJ();
    Optional<Zt70> optional = zlve.ZO();
    return (zmfc.Zb() != null) ? zmfc.Zb() : (optional.isPresent() ? ((Zt70)optional.get()).Zj() : null);
  }
  
  private static List<String> Zy(Zlit paramZlit, List<? extends Ze7n> paramList) {
    if (!paramZlit.Zds())
      return Collections.emptyList(); 
    Zyf zyf = Zyf.Zy(paramZlit.ZdC());
    List<Zt8g> list = Zeex.ZW(Zrdu.URL_PARAM, zyf, 0, zyf.Zpu(), Zsba.URL_ENCODED, null);
    return (List<String>)list.stream().map(paramList::lambda$getUrlParameters$0).collect(Collectors.toList());
  }
  
  private static String Zq(Zt8g paramZt8g, List<? extends Ze7n> paramList) {
    Objects.requireNonNull(paramZt8g);
    return paramList.stream().filter(paramZt8g::lambda$getUrlParameterValue$1).findFirst().map(Zz36::lambda$getUrlParameterValue$2).orElseGet(paramZt8g::Zbn);
  }
  
  private static String Zd(Collection<Zzjv> paramCollection) {
    return paramCollection.stream().map(Zzjv::ZxZ).collect(Collectors.joining("|"));
  }
  
  public Zkmn Za() {
    return Zkmn.ZQ(this.ZT);
  }
  
  public Zmvb Zr() {
    return Zmvb.ZE(this.Zz);
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zz36 zz36 = (Zz36)paramObject;
    return (Objects.equals(this.ZT, zz36.ZT) && Objects.equals(this.Zz, zz36.Zz));
  }
  
  public int hashCode() {
    int[] arrayOfInt = Zm0f.Zf();
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[2]); 
    return Objects.hash(new Object[] { this.ZT, this.Zz });
  }
  
  private static String lambda$getUrlParameterValue$2(Ze7n paramZe7n) {
    return Objects.<String>requireNonNullElse(paramZe7n.Ze(), "");
  }
  
  private static boolean lambda$getUrlParameterValue$1(Zt8g paramZt8g, Ze7n paramZe7n) {
    return Objects.equals(paramZe7n.ZW(), paramZt8g.Zns());
  }
  
  private static String lambda$getUrlParameters$0(List paramList, Zt8g paramZt8g) {
    return paramZt8g.Zns() + "=" + paramZt8g.Zns();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz36.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */