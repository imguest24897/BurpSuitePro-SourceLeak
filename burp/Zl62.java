package burp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

public class Zl62 implements Zehc {
  private final Ze3n Zz;
  
  private final Zz_9 ZW;
  
  private static String[] ZZ;
  
  public Zl62(Ze3n paramZe3n, Zz_9 paramZz_9) {
    this.Zz = paramZe3n;
    this.ZW = paramZz_9;
  }
  
  public Ztk8 Zb() {
    List<Ztbr> list = (this.Zz.Zp()).ZN;
    list = ZS(list);
    String[] arrayOfString = Zz();
    if (list.isEmpty())
      return Ztk8.ZD(); 
    ArrayList<Ztbr> arrayList1 = new ArrayList();
    ArrayList<Ztbr> arrayList2 = new ArrayList();
    ZY(list, arrayList1, arrayList2);
    Zgq<Zgpi> zgq = new Zgq<>();
    if (this.ZW.Zr(Zzu2.TLS_COOKIE_WITHOUT_SECURE_FLAG_SET))
      Zs(arrayList1, arrayList2, (Zgq)zgq); 
    if (this.ZW.Zr(Zzu2.COOKIE_WITHOUT_HTTPONLY_FLAG))
      ZU(arrayList1, arrayList2, (Zgq)zgq); 
    if (this.ZW.Zr(Zzu2.COOKIE_SCOPED_TO_PARENT_DOMAIN))
      ZD(arrayList1, arrayList2, (Zgq)zgq); 
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[5]); 
    return Ztk8.Zy((Zgq)zgq);
  }
  
  public Zlcm ZP() {
    return Zlcm.PPR_VulnerableSetCookies;
  }
  
  private void ZY(List<Ztbr> paramList1, List<Ztbr> paramList2, List<Ztbr> paramList3) {
    // Byte code:
    //   0: invokestatic Zz : ()[Ljava/lang/String;
    //   3: astore #4
    //   5: aload_1
    //   6: invokeinterface iterator : ()Ljava/util/Iterator;
    //   11: astore #5
    //   13: aload #5
    //   15: invokeinterface hasNext : ()Z
    //   20: ifeq -> 100
    //   23: aload #5
    //   25: invokeinterface next : ()Ljava/lang/Object;
    //   30: checkcast burp/Ztbr
    //   33: astore #6
    //   35: aload #6
    //   37: invokeinterface Zq0 : ()Ljava/lang/String;
    //   42: invokevirtual length : ()I
    //   45: iconst_5
    //   46: if_icmpge -> 52
    //   49: goto -> 13
    //   52: aload #6
    //   54: invokeinterface Zqy : ()Ljava/lang/String;
    //   59: aload #6
    //   61: invokeinterface Zq0 : ()Ljava/lang/String;
    //   66: invokestatic ZE : (Ljava/lang/String;Ljava/lang/String;)Z
    //   69: ifeq -> 86
    //   72: aload_2
    //   73: aload #6
    //   75: invokeinterface add : (Ljava/lang/Object;)Z
    //   80: pop
    //   81: aload #4
    //   83: ifnull -> 95
    //   86: aload_3
    //   87: aload #6
    //   89: invokeinterface add : (Ljava/lang/Object;)Z
    //   94: pop
    //   95: aload #4
    //   97: ifnull -> 13
    //   100: return
  }
  
  private void Zs(List<Ztbr> paramList1, List<Ztbr> paramList2, Zgq<Zrdb> paramZgq) {
    if (this.Zz.Za().ZJZ()) {
      ZU(ZQ(paramList1), paramZgq, Zbsi::Zr);
      ZU(ZQ(paramList2), paramZgq, Zbsi::ZT);
    } 
  }
  
  private void ZU(List<Ztbr> paramList1, List<Ztbr> paramList2, Zgq<Zrdb> paramZgq) {
    ZU(ZT(paramList1), paramZgq, Zb46::ZA);
    ZU(ZT(paramList2), paramZgq, Zb46::Zm);
  }
  
  private void ZD(List<Ztbr> paramList1, List<Ztbr> paramList2, Zgq<Zrdb> paramZgq) {
    ZU(ZE(paramList1), paramZgq, Zre::Zc);
    ZU(ZE(paramList2), paramZgq, Zre::ZP);
  }
  
  private List<Ztbr> ZQ(List<Ztbr> paramList) {
    ArrayList<Ztbr> arrayList = new ArrayList();
    Iterator<Ztbr> iterator = paramList.iterator();
    String[] arrayOfString = Zz();
    while (iterator.hasNext()) {
      Ztbr ztbr = iterator.next();
      if (!ztbr.Zqj())
        arrayList.add(ztbr); 
      if (arrayOfString != null)
        break; 
    } 
    return arrayList;
  }
  
  private List<Ztbr> ZT(List<Ztbr> paramList) {
    ArrayList<Ztbr> arrayList = new ArrayList();
    Iterator<Ztbr> iterator = paramList.iterator();
    String[] arrayOfString = Zz();
    while (iterator.hasNext()) {
      Ztbr ztbr = iterator.next();
      if (!ztbr.ZqS())
        arrayList.add(ztbr); 
      if (arrayOfString != null)
        break; 
    } 
    return arrayList;
  }
  
  private List<Ztbr> ZE(List<Ztbr> paramList) {
    ArrayList<Ztbr> arrayList = new ArrayList();
    Iterator<Ztbr> iterator = paramList.iterator();
    String[] arrayOfString = Zz();
    while (iterator.hasNext()) {
      Ztbr ztbr = iterator.next();
      String str = ztbr.Zqu();
      if (str != null && str.length() < this.Zz.Za().ZJ1().length() && this.Zz.Za().ZJ1().toLowerCase().endsWith(str.toLowerCase()))
        arrayList.add(ztbr); 
      if (arrayOfString != null)
        break; 
    } 
    return arrayList;
  }
  
  private static List<Ztbr> ZS(List<Ztbr> paramList) {
    Date date = new Date();
    ArrayList<Ztbr> arrayList = new ArrayList();
    String[] arrayOfString = Zz();
    for (Ztbr ztbr : paramList) {
      if (ztbr.ZqU() == null || ztbr.ZqU().after(date))
        arrayList.add(ztbr); 
      if (arrayOfString != null)
        break; 
    } 
    return arrayList;
  }
  
  private void ZU(List<Ztbr> paramList, Zgq<Zrdb> paramZgq, Ztrb paramZtrb) {
    Map<String, Collection<Zl1r>> map = Zu(paramList);
    Iterator<?> iterator = (new LinkedHashSet(paramList)).iterator();
    String[] arrayOfString = Zz();
    while (iterator.hasNext()) {
      Ztbr ztbr = (Ztbr)iterator.next();
      Zvow zvow = this.Zz.Zt().Z_(map.get(ztbr.Zqy()));
      paramZgq.Zu(paramZtrb.Zv(this.Zz.Za(), this.Zz.ZN(), zvow, ztbr));
      if (arrayOfString != null)
        break; 
    } 
  }
  
  private Map<String, Collection<Zl1r>> Zu(List<Ztbr> paramList) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    Iterator<Ztbr> iterator = paramList.iterator();
    String[] arrayOfString = Zz();
    while (iterator.hasNext()) {
      Ztbr ztbr = iterator.next();
      int i = Zlt_.Zc(this.Zz.ZL().Za(), (byte)10, 0, ztbr.ZqE());
      if (i < 0)
        continue; 
      ((Collection<Zl1r>)hashMap.computeIfAbsent(ztbr.Zqy(), Zl62::lambda$highlightCookies$0)).add(Zrlp.Zj(++i, i + ztbr.Zqk().length()));
      if (arrayOfString != null)
        break; 
    } 
    return (Map)hashMap;
  }
  
  private static Collection lambda$highlightCookies$0(String paramString) {
    return new HashSet();
  }
  
  public static void ZU(String[] paramArrayOfString) {
    ZZ = paramArrayOfString;
  }
  
  public static String[] Zz() {
    return ZZ;
  }
  
  static {
    if (Zz() != null)
      ZU(new String[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl62.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */