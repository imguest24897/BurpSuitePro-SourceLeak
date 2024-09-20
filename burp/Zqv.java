package burp;

import java.util.Locale;
import net.portswigger.Zkb;

class Zqv implements Zg5o {
  private final Zefx ZN;
  
  private final String Zi;
  
  private final boolean Zg;
  
  boolean Ze;
  
  String Zz;
  
  private Zqv(Zefx paramZefx, String paramString, boolean paramBoolean) {
    this.ZN = paramZefx;
    this.Zi = paramString;
    this.Zg = paramBoolean;
  }
  
  public void Zs(Zr6q paramZr6q) {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zg : Z
    //   4: ifeq -> 19
    //   7: aload_0
    //   8: getfield Zi : Ljava/lang/String;
    //   11: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   16: goto -> 34
    //   19: aload_0
    //   20: getfield Zi : Ljava/lang/String;
    //   23: getstatic java/util/Locale.US : Ljava/util/Locale;
    //   26: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   29: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
    //   34: astore_2
    //   35: aload_0
    //   36: aload_0
    //   37: getfield ZN : Lburp/Zefx;
    //   40: invokeinterface ZG : ()Ljava/util/List;
    //   45: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   50: aload_0
    //   51: aload_2
    //   52: <illegal opcode> test : (Lburp/Zqv;Ljava/lang/String;)Ljava/util/function/Predicate;
    //   57: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   62: invokeinterface findFirst : ()Ljava/util/Optional;
    //   67: aload_2
    //   68: <illegal opcode> apply : (Ljava/lang/String;)Ljava/util/function/Function;
    //   73: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   76: aconst_null
    //   77: invokevirtual orElse : (Ljava/lang/Object;)Ljava/lang/Object;
    //   80: checkcast java/lang/String
    //   83: putfield Zz : Ljava/lang/String;
    //   86: aload_0
    //   87: aload_0
    //   88: getfield Zz : Ljava/lang/String;
    //   91: ifnull -> 98
    //   94: iconst_1
    //   95: goto -> 99
    //   98: iconst_0
    //   99: putfield Ze : Z
    //   102: return
  }
  
  public void ZS(Zr6h paramZr6h) {
    this.Ze = paramZr6h.ZK().stream().filter(Zqv::lambda$visit$2).map(Zqv::lambda$visit$3).anyMatch(this::lambda$visit$4);
  }
  
  private boolean lambda$visit$4(String paramString) {
    return this.Zg ? paramString.equals(this.Zi) : paramString.equalsIgnoreCase(this.Zi);
  }
  
  private static String lambda$visit$3(Ztnz paramZtnz) {
    return Zkb.ZG(paramZtnz.Ze);
  }
  
  private static boolean lambda$visit$2(Ztnz paramZtnz) {
    return (paramZtnz.ZM != null);
  }
  
  private static String lambda$visit$1(String paramString1, String paramString2) {
    return paramString2.substring(paramString1.length()).trim();
  }
  
  private boolean lambda$visit$0(String paramString1, String paramString2) {
    String str = this.Zg ? paramString2 : paramString2.toLowerCase(Locale.US);
    return str.startsWith(paramString1);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zqv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */