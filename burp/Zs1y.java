package burp;

import java.lang.management.ThreadMXBean;
import java.util.Collections;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zs1y implements Zk8d {
  private final List<Zehc> ZD;
  
  private final Ze3n Zh;
  
  private final Zz1m<Zt1o> ZA;
  
  private static String[] Zz;
  
  private Zs1y(List<Zehc> paramList, Ze3n paramZe3n, Zz1m<Zt1o> paramZz1m) {
    this.ZD = paramList;
    this.Zh = paramZe3n;
    this.ZA = paramZz1m;
  }
  
  public Ztk8 ZN() {
    // Byte code:
    //   0: invokestatic Zh : ()[Ljava/lang/String;
    //   3: astore_1
    //   4: invokestatic getThreadMXBean : ()Ljava/lang/management/ThreadMXBean;
    //   7: astore_2
    //   8: aload_0
    //   9: getfield ZD : Ljava/util/List;
    //   12: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   17: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   22: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   27: aload_0
    //   28: aload_2
    //   29: <illegal opcode> apply : (Lburp/Zs1y;Ljava/lang/management/ThreadMXBean;)Ljava/util/function/Function;
    //   34: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   39: invokestatic ZD : ()Lburp/Ztk8;
    //   42: <illegal opcode> apply : ()Ljava/util/function/BinaryOperator;
    //   47: invokeinterface reduce : (Ljava/lang/Object;Ljava/util/function/BinaryOperator;)Ljava/lang/Object;
    //   52: checkcast burp/Ztk8
    //   55: aload_1
    //   56: ifnonnull -> 66
    //   59: iconst_3
    //   60: anewarray burp/Zbqc
    //   63: invokestatic Zr : ([Lburp/Zbqc;)V
    //   66: areturn
  }
  
  public static Zk8d ZS(Ze3n paramZe3n, Zehc paramZehc, Zz1m<Zt1o> paramZz1m) {
    return ZC(paramZe3n, Collections.singletonList(paramZehc), paramZz1m);
  }
  
  public static Zk8d ZC(Ze3n paramZe3n, List<Zehc> paramList, Zz1m<Zt1o> paramZz1m) {
    return new Zs1y(paramList, paramZe3n, paramZz1m);
  }
  
  private Ztk8 lambda$get$0(ThreadMXBean paramThreadMXBean, Zehc paramZehc) {
    try {
      Zzl5.Zj(this.ZA, this.Zh.Zm(), paramZehc);
      return paramZehc.Zb();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return Ztk8.ZD();
    } 
  }
  
  public static void ZK(String[] paramArrayOfString) {
    Zz = paramArrayOfString;
  }
  
  public static String[] Zh() {
    return Zz;
  }
  
  static {
    if (Zh() == null)
      ZK(new String[5]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs1y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */