package burp;

import java.util.List;
import java.util.Map;

public class Zt69 implements Zlfv<Zzq1> {
  private final Zll7 Zq;
  
  private final Zxcg<?> ZS;
  
  private final Zzi8 Zl;
  
  private final Zvow Ze;
  
  private final Zb0p ZO;
  
  private final Zsnv ZU;
  
  private final Zzj5 ZJ;
  
  private final List<Zsjh<?>> ZA;
  
  private static String ZV;
  
  public Zt69(Zxcg<?> paramZxcg, Zvow paramZvow, List<Zsjh<?>> paramList) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: new java/util/ArrayList
    //   8: dup
    //   9: invokespecial <init> : ()V
    //   12: putfield ZA : Ljava/util/List;
    //   15: getstatic burp/Zrrh.SUITE_COLLABORATOR_USED : Lburp/Zrrh;
    //   18: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   21: aload_0
    //   22: aconst_null
    //   23: putfield Zq : Lburp/Zll7;
    //   26: aload_0
    //   27: aload_1
    //   28: putfield ZS : Lburp/Zxcg;
    //   31: aload_0
    //   32: aconst_null
    //   33: putfield Zl : Lburp/Zzi8;
    //   36: aload_0
    //   37: aload_2
    //   38: putfield Ze : Lburp/Zvow;
    //   41: aload_0
    //   42: getfield ZA : Ljava/util/List;
    //   45: aload_3
    //   46: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   51: pop
    //   52: aload_0
    //   53: aconst_null
    //   54: putfield ZO : Lburp/Zb0p;
    //   57: aload_0
    //   58: aconst_null
    //   59: putfield ZU : Lburp/Zsnv;
    //   62: aload_0
    //   63: aconst_null
    //   64: putfield ZJ : Lburp/Zzj5;
    //   67: invokestatic Zj : ()Ljava/lang/String;
    //   70: aconst_null
    //   71: astore #5
    //   73: aload_3
    //   74: invokeinterface iterator : ()Ljava/util/Iterator;
    //   79: astore #6
    //   81: astore #4
    //   83: aload #6
    //   85: invokeinterface hasNext : ()Z
    //   90: ifeq -> 147
    //   93: aload #6
    //   95: invokeinterface next : ()Ljava/lang/Object;
    //   100: checkcast burp/Zsjh
    //   103: astore #7
    //   105: aload #5
    //   107: ifnonnull -> 124
    //   110: aload #7
    //   112: invokeinterface ZP : ()Ljava/lang/String;
    //   117: astore #5
    //   119: aload #4
    //   121: ifnull -> 142
    //   124: aload #5
    //   126: aload #7
    //   128: invokeinterface ZP : ()Ljava/lang/String;
    //   133: invokevirtual equals : (Ljava/lang/Object;)Z
    //   136: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   139: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   142: aload #4
    //   144: ifnull -> 83
    //   147: return
  }
  
  public Zsqx<Zzq1> Zc(Map<Zvow, Zzi8> paramMap) {
    return new Zril(this, paramMap);
  }
  
  public static void ZL(String paramString) {
    ZV = paramString;
  }
  
  public static String Zj() {
    return ZV;
  }
  
  static {
    if (Zj() != null)
      ZL("Y4nI1b"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt69.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */