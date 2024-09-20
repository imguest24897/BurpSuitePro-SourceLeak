package burp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.zip.CRC32;
import net.portswigger.Zkb;

public class Zly1 {
  private final Zt7v<Zmg> Zc;
  
  private final Zbph ZL;
  
  private final Zsd Zu;
  
  private final Zr_4 Zd;
  
  private Zly1(Zt7v<Zmg> paramZt7v, Zbph paramZbph, Zsd paramZsd, Zr_4 paramZr_4) {
    this.Zc = paramZt7v;
    this.ZL = paramZbph;
    this.Zu = paramZsd;
    this.Zd = paramZr_4;
  }
  
  public static Zly1 Zn(Zz1i paramZz1i, Zkq4 paramZkq4, Zr_4 paramZr_4) {
    return new Zly1(paramZz1i.ZHj(), paramZkq4, Zsd.Zv(paramZkq4), paramZr_4);
  }
  
  synchronized Zeum ZS(Zxs7 paramZxs7, Zz76 paramZz76, Zmzk paramZmzk, String paramString, short paramShort) {
    if (!this.ZL.ZW(paramZxs7.Z_()))
      return Zeum.FULL_SCAN; 
    if (this.Zu.ZJ(paramZxs7.Z_()))
      return Zeum.FULL_SCAN; 
    int i = Zs(paramZmzk, paramString, paramShort, paramZxs7.Z_(), paramZz76.ZG());
    Zmg zmg = this.Zc.ZJ(i);
    if (zmg == null)
      return Zeum.FULL_SCAN; 
    Znf znf = new Znf(zmg);
    Zz1w zz1w = new Zz1w(paramZxs7.Z_(), znf, this.Zu);
    return zz1w.Zu() ? (this.Zu.Zb(paramZxs7.Z_()) ? Zeum.QUICK_SCAN : Zeum.NO_SCAN) : (zz1w.Za(paramZz76.ZC()) ? (this.Zu.Zb(paramZxs7.Z_()) ? Zeum.QUICK_SCAN : Zeum.NO_SCAN) : Zeum.FULL_SCAN);
  }
  
  public synchronized void Zu(Zxs7 paramZxs7, Zz76 paramZz76, Zmzk paramZmzk, String paramString, short paramShort, List<Zrdb> paramList) {
    Set<Integer> set = (Set)paramList.stream().map(Zly1::lambda$issuesFound$0).collect(Collectors.toSet());
    Zu(paramZxs7, paramZz76, paramZmzk, paramString, paramShort, set);
  }
  
  public synchronized void ZG(Zxs7 paramZxs7, Zz76 paramZz76, Zmzk paramZmzk, String paramString, short paramShort, Zgq<Zrdb> paramZgq) {
    HashSet<Integer> hashSet = new HashSet();
    Iterator<Zsqx<Zrdb>> iterator = paramZgq.iterator();
    boolean bool = Zg75.Zo();
    while (iterator.hasNext()) {
      Zsqx zsqx = iterator.next();
      Zx_5 zx_5 = (Zx_5)zsqx;
      hashSet.add(Integer.valueOf(zx_5.ZN().ZS()));
      if (bool)
        break; 
    } 
    Zu(paramZxs7, paramZz76, paramZmzk, paramString, paramShort, hashSet);
  }
  
  synchronized void Z_(Zxs7 paramZxs7, Zz76 paramZz76, Zmzk paramZmzk, String paramString, short paramShort, Set<Integer> paramSet) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: aload_3
    //   4: aload #4
    //   6: iload #5
    //   8: aload_2
    //   9: aload #6
    //   11: <illegal opcode> accept : (Lburp/Zz76;Ljava/util/Set;)Ljava/util/function/Consumer;
    //   16: invokevirtual ZD : (Lburp/Zxs7;Lburp/Zz76;Lburp/Zmzk;Ljava/lang/String;SLjava/util/function/Consumer;)V
    //   19: return
  }
  
  private synchronized void Zu(Zxs7 paramZxs7, Zz76 paramZz76, Zmzk paramZmzk, String paramString, short paramShort, Set<Integer> paramSet) {
    ZD(paramZxs7, paramZz76, paramZmzk, paramString, paramShort, paramSet::lambda$issuesFoundForScanAsynchronously$2);
  }
  
  private synchronized void ZD(Zxs7 paramZxs7, Zz76 paramZz76, Zmzk paramZmzk, String paramString, short paramShort, Consumer<Zz1w> paramConsumer) {
    if (!this.ZL.ZW(paramZxs7.Z_()))
      return; 
    int i = Zs(paramZmzk, paramString, paramShort, paramZxs7.Z_(), paramZz76.ZG());
    Zmg zmg = this.Zc.ZJ(i);
    if (zmg == null) {
      zmg = this.Zd.<Zmg>ZH(new Zkbp(30));
      this.Zc.ZI(i, zmg);
    } 
    Znf znf = new Znf(zmg);
    Zz1w zz1w = new Zz1w(paramZxs7.Z_(), znf, this.Zu);
    paramConsumer.accept(zz1w);
  }
  
  public static int ZQ(Zxs7 paramZxs7, Ze3n paramZe3n) {
    Zmzk zmzk = paramZe3n.Za();
    String str1 = paramZe3n.ZA().Zr();
    short s = (paramZe3n.Zp()).ZH.ZJ;
    Zs66 zs66 = paramZxs7.Z_();
    String str2 = Zz76.Zf(paramZe3n, paramZxs7).ZG();
    return Zs(zmzk, str1, s, zs66, str2);
  }
  
  public static int Zs(Zmzk paramZmzk, String paramString1, short paramShort, Zs66 paramZs66, String paramString2) {
    CRC32 cRC32 = new CRC32();
    cRC32.update(Zkb.Zy(paramZmzk.toString()));
    cRC32.update(167);
    cRC32.update(Zkb.Zy(paramString1));
    cRC32.update(167);
    cRC32.update(paramShort);
    cRC32.update(167);
    cRC32.update(paramZs66.Zk());
    cRC32.update(167);
    cRC32.update(Zkb.Zy(paramString2));
    return (int)cRC32.getValue();
  }
  
  private static void lambda$issuesFoundForScanAsynchronously$2(Set<Integer> paramSet, Zz1w paramZz1w) {
    paramZz1w.Zu(paramSet);
  }
  
  private static void lambda$issuesFoundForScan$1(Zz76 paramZz76, Set<Integer> paramSet, Zz1w paramZz1w) {
    paramZz1w.Zj(paramZz76.ZC(), paramSet);
  }
  
  private static Integer lambda$issuesFound$0(Zrdb paramZrdb) {
    return Integer.valueOf(paramZrdb.Za6().ZS());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zly1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */