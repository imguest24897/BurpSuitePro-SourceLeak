package burp;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Set;

public class Zlfh {
  private static final Set<Zery> ZP;
  
  private static final ThreadLocal<DateFormat> ZV;
  
  private static final String a;
  
  public static void ZB(Zrp6 paramZrp6, String paramString, Object... paramVarArgs) {
    boolean bool = Zrp6.ZB();
    if (Zszd.ZF.ZY(paramZrp6)) {
      String str1 = (paramVarArgs.length == 0) ? paramString : String.format(paramString, paramVarArgs);
      String str2 = Thread.currentThread().getName() + " " + Thread.currentThread().getName();
      for (Zery zery : ZP) {
        if (zery.ZQ(paramZrp6))
          zery.ZI(str2, str1); 
        if (!bool)
          break; 
      } 
    } 
  }
  
  public static void ZL(Zery paramZery) {
    if (paramZery != null)
      ZP.add(paramZery); 
  }
  
  public static boolean ZU() {
    return Zszd.ZF.ZY(Zrp6.DEBUG);
  }
  
  public static boolean ZL() {
    return Zszd.ZF.ZY(Zrp6.TRACE);
  }
  
  private static DateFormat lambda$static$0() {
    return new SimpleDateFormat(a);
  }
  
  static {
    // Byte code:
    //   0: bipush #78
    //   2: ldc 'o\\rjA5Tk+'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zlfh.a : Ljava/lang/String;
    //   11: goto -> 154
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
    //   29: if_icmpgt -> 128
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
    //   80: bipush #105
    //   82: goto -> 112
    //   85: bipush #11
    //   87: goto -> 112
    //   90: bipush #30
    //   92: goto -> 112
    //   95: bipush #98
    //   97: goto -> 112
    //   100: bipush #54
    //   102: goto -> 112
    //   105: bipush #96
    //   107: goto -> 112
    //   110: bipush #8
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: new java/util/LinkedHashSet
    //   157: dup
    //   158: invokespecial <init> : ()V
    //   161: putstatic burp/Zlfh.ZP : Ljava/util/Set;
    //   164: <illegal opcode> get : ()Ljava/util/function/Supplier;
    //   169: invokestatic withInitial : (Ljava/util/function/Supplier;)Ljava/lang/ThreadLocal;
    //   172: putstatic burp/Zlfh.ZV : Ljava/lang/ThreadLocal;
    //   175: getstatic burp/Zszd.Zu : Z
    //   178: ifeq -> 214
    //   181: getstatic burp/Zlfh.ZP : Ljava/util/Set;
    //   184: new burp/Zery
    //   187: dup
    //   188: getstatic burp/Zszd.ZF : Lburp/Zrp6;
    //   191: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   194: getstatic burp/Zszd.ZJ : Z
    //   197: ifne -> 204
    //   200: iconst_1
    //   201: goto -> 205
    //   204: iconst_0
    //   205: invokespecial <init> : (Lburp/Zrp6;Ljava/io/OutputStream;Z)V
    //   208: invokeinterface add : (Ljava/lang/Object;)Z
    //   213: pop
    //   214: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlfh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */