package burp;

import java.util.function.Consumer;
import java.util.function.Supplier;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zk3 {
  private static final String a;
  
  static boolean Zg(Object paramObject, Zxtd paramZxtd, Zt7v<Zxtd> paramZt7v) {
    if (!(paramObject instanceof Zefg)) {
      Zuh.Zb(false, Zqf.Zk);
      return false;
    } 
    Zefg zefg = (Zefg)paramObject;
    Zxtd zxtd = (paramZxtd != null) ? paramZxtd : paramZt7v.ZJ(zefg.size());
    return (zxtd != null && zxtd.Zm(zefg));
  }
  
  static void ZD(Object paramObject, Zxtd paramZxtd, Zt7v<Zxtd> paramZt7v, Consumer<Zxtd> paramConsumer, Zr_4 paramZr_4) {
    // Byte code:
    //   0: invokestatic ZSR : ()Z
    //   3: istore #5
    //   5: aload_0
    //   6: instanceof burp/Zefg
    //   9: ifne -> 20
    //   12: iconst_0
    //   13: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   16: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   19: return
    //   20: aload_0
    //   21: checkcast burp/Zefg
    //   24: astore #6
    //   26: aload #6
    //   28: invokeinterface size : ()I
    //   33: istore #7
    //   35: aload_1
    //   36: ifnull -> 43
    //   39: aload_1
    //   40: goto -> 55
    //   43: aload_2
    //   44: iload #7
    //   46: i2l
    //   47: invokeinterface ZJ : (J)Lburp/Zgpi;
    //   52: checkcast burp/Zxtd
    //   55: astore #8
    //   57: aload #8
    //   59: ifnonnull -> 128
    //   62: aload_2
    //   63: invokeinterface Zx1 : ()I
    //   68: iconst_3
    //   69: if_icmplt -> 108
    //   72: aload_3
    //   73: aload #4
    //   75: new burp/Zb6i
    //   78: dup
    //   79: aload_2
    //   80: invokeinterface ZPN : ()Ljava/util/Collection;
    //   85: aload #6
    //   87: invokespecial <init> : (Ljava/util/Collection;Lburp/Zefg;)V
    //   90: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   95: checkcast burp/Zxtd
    //   98: invokeinterface accept : (Ljava/lang/Object;)V
    //   103: iload #5
    //   105: ifne -> 137
    //   108: aload_2
    //   109: iload #7
    //   111: i2l
    //   112: aload #6
    //   114: invokestatic Zx : (Lburp/Zefg;)Lburp/Zxtd;
    //   117: invokeinterface ZI : (JLburp/Zgpi;)Lburp/Zgpi;
    //   122: pop
    //   123: iload #5
    //   125: ifne -> 137
    //   128: aload #8
    //   130: aload #6
    //   132: invokeinterface ZG : (Ljava/lang/Object;)V
    //   137: return
  }
  
  static String Zq(Zt7v<Zxtd> paramZt7v, Zxtd paramZxtd, Supplier<String> paramSupplier) {
    return a + a;
  }
  
  static {
    // Byte code:
    //   0: bipush #104
    //   2: ldc 'TkG/v<RkTs'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zk3.a : Ljava/lang/String;
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
    //   80: bipush #81
    //   82: goto -> 112
    //   85: bipush #102
    //   87: goto -> 112
    //   90: bipush #72
    //   92: goto -> 112
    //   95: bipush #38
    //   97: goto -> 112
    //   100: bipush #92
    //   102: goto -> 112
    //   105: bipush #33
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
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk3.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */