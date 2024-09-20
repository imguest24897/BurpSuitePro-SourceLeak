package burp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;
import net.portswigger.Zrzt;
import net.portswigger.Zvy;

public class Ze12 implements Zehc {
  private final Zz_9 Zw;
  
  private final Ze3n ZG;
  
  private static final String a;
  
  public Ze12(Zz_9 paramZz_9, Ze3n paramZe3n) {
    this.Zw = paramZz_9;
    this.ZG = paramZe3n;
  }
  
  public Ztk8 Zb() {
    Zgq<Zgpi> zgq = new Zgq<>();
    try {
      if (this.Zw.Zr(Zzu2.SESSION_TOKEN_IN_URL)) {
        List<Zlou> list = Zr();
        try {
          if (Zepo.ZE(list))
            ZG(list, (Zgq)zgq); 
        } catch (Exception exception) {
          throw a(null);
        } 
      } 
      if (this.Zw.Zr(Zzu2.BASE_64_ENCODED_DATA_IN_PARAMETER)) {
        List<Zlou> list = Zu();
        try {
          if (Zepo.ZE(list))
            Zt(list, (Zgq)zgq); 
        } catch (Exception exception) {
          throw a(null);
        } 
      } 
      if (this.Zw.Zr(Zzu2.SQL_STATEMENT_IN_REQUEST_PARAMETER)) {
        List<Zl1r> list = ZQ();
        try {
          if (Zepo.ZE(list))
            zgq.Zu((Zsqx)ZN(list)); 
        } catch (Exception exception) {
          throw a(null);
        } 
      } 
      if (this.Zw.Zr(Zzu2.SERIALIZED_OBJECT_IN_HTTP_MESSAGE)) {
        Zxem zxem = new Zxem(this.ZG, this.Zw.ZqM());
        zgq.ZF((Zgq)zxem.ZU());
      } 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
    } 
    return Ztk8.Zy((Zgq)zgq);
  }
  
  public Zlcm ZP() {
    return Zlcm.PPR_VulnerableRequestParameters;
  }
  
  private List<Zlou> Zr() {
    ArrayList<Zlou> arrayList = new ArrayList();
    Iterator<Zlou> iterator = this.ZG.ZA().Zc().iterator();
    int[] arrayOfInt = Zt67.Zw();
    while (iterator.hasNext()) {
      Zlou zlou = iterator.next();
      if (zlou.Zx == Zrdu.URL_PARAM && Zmhb.ZE(zlou.ZA, zlou.Zr))
        arrayList.add(zlou); 
      if (arrayOfInt == null)
        break; 
    } 
    return arrayList;
  }
  
  private void ZG(List<Zlou> paramList, Zgq<Zrdb> paramZgq) {
    HashMap<Object, Object> hashMap = new HashMap<>();
    LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
    int[] arrayOfInt = Zt67.Zw();
    for (Zlou zlou : paramList) {
      ((Collection<Zl1r>)hashMap.computeIfAbsent(zlou.ZA, Ze12::lambda$reportSessionTokenInUrlIssues$0)).add(Zrlp.Zj(zlou.ZE, zlou.ZV));
      linkedHashSet.add(zlou.ZA);
      if (arrayOfInt == null)
        break; 
    } 
    for (String str : linkedHashSet) {
      Zvow zvow = this.ZG.Zt().ZK((Collection<Zl1r>)hashMap.get(str));
      paramZgq.Zu(Zsry.Zf(this.ZG.Za(), this.ZG.ZN(), zvow, (byte)1, str, Collections.singleton(this.ZG.ZA().ZF().toString())));
      if (arrayOfInt == null)
        break; 
    } 
  }
  
  private List<Zlou> Zu() {
    ArrayList<Zlou> arrayList = new ArrayList();
    Iterator<Zlou> iterator = this.ZG.ZA().Zc().iterator();
    int[] arrayOfInt = Zt67.Zw();
    while (iterator.hasNext()) {
      Zlou zlou = iterator.next();
      if (Zzia.ZD(zlou))
        continue; 
      if (Zu(Zrzt.ZJ(zlou.Zr)))
        arrayList.add(zlou); 
      if (arrayOfInt == null)
        break; 
    } 
    return arrayList;
  }
  
  private boolean Zu(String paramString) {
    byte[] arrayOfByte = Zkb.Zy(paramString);
    return (arrayOfByte.length >= 16 && Zvy.Z_(arrayOfByte));
  }
  
  private void Zt(List<Zlou> paramList, Zgq<Zrdb> paramZgq) {
    HashMap<Object, Object> hashMap1 = new HashMap<>();
    HashMap<Object, Object> hashMap2 = new HashMap<>();
    LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
    null = paramList.iterator();
    int[] arrayOfInt = Zt67.Zw();
    while (null.hasNext()) {
      Zlou zlou = null.next();
      Collection<Zl1r> collection = (Collection)hashMap1.computeIfAbsent(zlou.ZA, Ze12::lambda$reportSessionTokenInUrlIssues$0);
      collection.add(Zrlp.Zj(zlou.ZE, zlou.ZV));
      Collection<String> collection1 = (Collection)hashMap2.computeIfAbsent(zlou.ZA, Ze12::lambda$reportBase64EncodedDataInParameterIssues$2);
      collection1.add(ZG(zlou));
      linkedHashSet.add(zlou.ZA);
      if (arrayOfInt == null)
        break; 
    } 
    for (String str : linkedHashSet) {
      Zvow zvow = this.ZG.Zt().ZK((Collection<Zl1r>)hashMap1.get(str));
      paramZgq.Zu(Zvfo.Zu(this.ZG.Za(), this.ZG.ZN(), zvow, str, (Collection<String>)hashMap2.get(str)));
      if (arrayOfInt == null)
        break; 
    } 
  }
  
  private List<Zl1r> ZQ() {
    ArrayList<Zl1r> arrayList = new ArrayList();
    Iterator<Zlou> iterator = this.ZG.ZA().Zc().iterator();
    int[] arrayOfInt = Zt67.Zw();
    while (iterator.hasNext()) {
      Zlou zlou = iterator.next();
      Zt67.ZA(zlou.Zr.toLowerCase(), zlou.ZE, arrayList);
      if (arrayOfInt == null)
        break; 
    } 
    return arrayList;
  }
  
  private Zsqx<Zrdb> ZN(List<Zl1r> paramList) {
    return Zgzb.Zm(this.ZG.Za(), this.ZG.ZN(), this.ZG.Zt().ZK(paramList));
  }
  
  private String ZG(Zlou paramZlou) {
    byte[] arrayOfByte = Zvy.Zt(Zkb.Zy(Zrzt.ZJ(paramZlou.Zr)));
    String str = Zkb.ZG(arrayOfByte).replace("\r", "").replace("\n", "").replace("\t", "");
    return paramZlou.ZA + paramZlou.ZA + a;
  }
  
  private static Collection lambda$reportBase64EncodedDataInParameterIssues$2(String paramString) {
    return new LinkedHashSet();
  }
  
  private static Collection lambda$reportSessionTokenInUrlIssues$0(String paramString) {
    return new HashSet();
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #98
    //   2: ldc 'w\\b'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Ze12.a : Ljava/lang/String;
    //   11: goto -> 153
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #90
    //   82: goto -> 111
    //   85: bipush #40
    //   87: goto -> 111
    //   90: bipush #74
    //   92: goto -> 111
    //   95: bipush #82
    //   97: goto -> 111
    //   100: bipush #108
    //   102: goto -> 111
    //   105: bipush #94
    //   107: goto -> 111
    //   110: iconst_4
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze12.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */