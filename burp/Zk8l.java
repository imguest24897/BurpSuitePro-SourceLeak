package burp;

import java.io.File;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zze;

public class Zk8l implements Zkma<Zlu6> {
  private static final Zspn Zk = new Zspn();
  
  private final Zl_d ZV;
  
  private final Zedc Zm;
  
  public Zk8l(Zl_d paramZl_d, Zedc paramZedc) {
    this.ZV = paramZl_d;
    this.Zm = paramZedc;
  }
  
  public void ZX(Zr_4 paramZr_4, File paramFile, Zlu6 paramZlu6, String paramString1, String paramString2) throws Zev3 {
    ZH(paramZr_4, paramFile, paramZlu6, paramString1, paramString2, Zl2m.ZO);
  }
  
  public void ZH(Zr_4 paramZr_4, File paramFile, Zlu6 paramZlu6, String paramString1, String paramString2, Zl2m paramZl2m) throws Zev3 {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: aload_2
    //   3: aload_3
    //   4: aload #4
    //   6: aload #5
    //   8: aload #6
    //   10: invokevirtual ZG : (Lburp/Zr_4;Ljava/io/File;Lburp/Zlu6;Ljava/lang/String;Ljava/lang/String;Lburp/Zl2m;)V
    //   13: aload_3
    //   14: invokevirtual Zg : ()Z
    //   17: ifne -> 34
    //   20: aload_3
    //   21: invokevirtual ZP : ()Z
    //   24: ifeq -> 62
    //   27: goto -> 34
    //   30: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   33: athrow
    //   34: aload_2
    //   35: invokestatic ZF : (Ljava/io/File;)Z
    //   38: pop
    //   39: aload_3
    //   40: invokevirtual ZP : ()Z
    //   43: ifeq -> 62
    //   46: goto -> 53
    //   49: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   52: athrow
    //   53: aload_3
    //   54: invokevirtual ZQ : ()Ljava/lang/RuntimeException;
    //   57: athrow
    //   58: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   61: athrow
    //   62: return
    // Exception table:
    //   from	to	target	type
    //   0	27	30	burp/Zev3
    //   20	46	49	burp/Zev3
    //   34	58	58	burp/Zev3
  }
  
  private void ZG(Zr_4 paramZr_4, File paramFile, Zlu6 paramZlu6, String paramString1, String paramString2, Zl2m paramZl2m) throws Zev3 {
    Zkit zkit = Zkit.Za(paramFile, Long.MAX_VALUE, 32768, 134217728, 1073741824, Zlrc.Za, Zk9w.ON_CLOSE);
    try {
      Zze.Zd(paramFile);
      this.ZV.Zo();
      Za(paramZr_4);
      Ztg8 ztg8 = Zgjv.Zi(paramZr_4, zkit, paramZlu6, paramZl2m, Zsa2.Zo);
      zkit.ZP(ztg8.Zw(paramZr_4.<Zzir>Zj(Zzir.Zg)));
      if (paramZlu6.Zg())
        return; 
      Zb(paramZr_4, zkit, ztg8, paramZlu6, paramString2, paramString1);
      ZI(zkit, paramString1, paramZlu6);
    } catch (RuntimeException runtimeException) {
      Zah.Zl(runtimeException, Zk_.IGNORED);
      paramZlu6.ZM(runtimeException);
    } finally {
      Zy(zkit);
      this.ZV.ZN(false);
    } 
  }
  
  private void Za(Zr_4 paramZr_4) {
    try {
      if (!paramZr_4.Zi())
        (new Zsks(paramZr_4)).ZK(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public void Zb(Zr_4 paramZr_4, Zkit paramZkit, Ztg8 paramZtg8, Zlu6 paramZlu6, String paramString1, String paramString2) {
    this.Zm.ZQ(paramZr_4, paramZkit, paramZtg8, paramZlu6, paramString1, paramString2).Zp();
  }
  
  private void ZI(Zkit paramZkit, String paramString, Zlu6 paramZlu6) {
    Zzir zzir = paramZkit.<Zzir>Zj(Zzir.Zg);
    try {
      zzir.ZSM(paramString);
      if (paramZlu6.ZS())
        zzir.ZvC().ZG(null); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    try {
      if (paramZlu6.Zm()) {
        zzir.Zvl().ZG().ZG(null);
        zzir.Zvl().Zd(false);
      } 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    Zeh6 zeh6 = zzir.Zvj();
    try {
      if (zeh6.ZEi() >= zeh6.Ziv().size())
        zeh6.ZI9(0); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    zeh6.Ziv().forEach(Zk8l::lambda$fixupProjectData$0);
  }
  
  private void Zy(Zkit paramZkit) {
    try {
      if (paramZkit != null)
        paramZkit.close(); 
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
    } 
  }
  
  private static void lambda$fixupProjectData$0(Zlx1 paramZlx1) {
    paramZlx1.Zn(Zk);
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk8l.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */