package burp;

import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zat;
import net.portswigger.Zb4;
import net.portswigger.Zby;
import net.portswigger.Zcp;
import net.portswigger.Zf9;
import net.portswigger.Zg7;
import net.portswigger.Zg9;
import net.portswigger.Zgu;
import net.portswigger.Zht;
import net.portswigger.Zif;
import net.portswigger.Zk_;
import net.portswigger.Znn;
import net.portswigger.Zrme;
import net.portswigger.Zs_;
import net.portswigger.Zsb;
import net.portswigger.Ztj;
import net.portswigger.Zu0;
import net.portswigger.Zzw;

public class Zeuu implements Zg9 {
  static final List<Class<?>> ZC;
  
  private final Zrdl<Zbfm> ZO;
  
  private final Zsmj ZD = new Zsmj(Zrf1.Za);
  
  private final Ztj Zi;
  
  private final Zr18 ZP;
  
  private static final String a;
  
  private Zeuu(Zem0 paramZem0, Ztj paramZtj, Zr18 paramZr18) {
    this.ZO = Zb_p.ZZ(Zra1.EXECUTION_MODE_DESKTOP, new Zm6u(paramZem0));
    this.Zi = paramZtj;
    this.ZP = paramZr18;
  }
  
  public static Zby<Zeuu> ZI(Zem0 paramZem0, Zs_ paramZs_, List<Zcp> paramList, Zr18 paramZr18) {
    // Byte code:
    //   0: new net/portswigger/Za6
    //   3: dup
    //   4: getstatic net/portswigger/Zrx7.PRO : Lnet/portswigger/Zrx7;
    //   7: aload_0
    //   8: aload_3
    //   9: <illegal opcode> apply : (Lburp/Zem0;Lburp/Zr18;)Ljava/util/function/Function;
    //   14: ldc burp/Zeuu
    //   16: invokespecial <init> : (Lnet/portswigger/Zrx7;Ljava/util/function/Function;Ljava/lang/Class;)V
    //   19: aload_1
    //   20: invokevirtual Z_ : (Lnet/portswigger/Zs_;)Lnet/portswigger/Za6;
    //   23: getstatic net/portswigger/Zd0.Za : Lnet/portswigger/Zd0;
    //   26: invokevirtual Zw : (Lnet/portswigger/Zd0;)Lnet/portswigger/Za6;
    //   29: getstatic net/portswigger/Zd0.Zj : Lnet/portswigger/Zd0;
    //   32: invokevirtual Zw : (Lnet/portswigger/Zd0;)Lnet/portswigger/Za6;
    //   35: new burp/Zt4e
    //   38: dup
    //   39: invokespecial <init> : ()V
    //   42: invokevirtual Zw : (Lnet/portswigger/Zd0;)Lnet/portswigger/Za6;
    //   45: astore #4
    //   47: aload_2
    //   48: aload #4
    //   50: dup
    //   51: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   54: pop
    //   55: <illegal opcode> accept : (Lnet/portswigger/Za6;)Ljava/util/function/Consumer;
    //   60: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   65: getstatic burp/Zeuu.ZC : Ljava/util/List;
    //   68: aload #4
    //   70: dup
    //   71: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   74: pop
    //   75: <illegal opcode> accept : (Lnet/portswigger/Za6;)Ljava/util/function/Consumer;
    //   80: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   85: aload #4
    //   87: invokevirtual Zy : ()Lnet/portswigger/Zby;
    //   90: areturn
  }
  
  public Zht ZW(Zf9 paramZf9) {
    return ((Zbfm)this.ZO.ZO()).Z_(paramZf9);
  }
  
  public Zgu Zx(String paramString1, String paramString2, Integer paramInteger) {
    try {
      try {
      
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      boolean bool = (paramString2 != null) ? (Integer.parseInt(paramString2) + 1) : false;
      try {
      
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      int i = (paramInteger != null) ? paramInteger.intValue() : Integer.MAX_VALUE;
      return ((Zbfm)this.ZO.ZO()).Ze(Integer.parseInt(paramString1), bool, i);
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.RETHROWN);
      throw new Zrme(a);
    } 
  }
  
  @Zsb(ZH = "DELETE", ZL = "carlos_montoya", Ze = true)
  public void ZL() {
    this.ZP.Z_(Zmg9.DELETE_REQUEST_TO_DESKTOP_API);
  }
  
  public Zg7 Zl() {
    return this.ZD;
  }
  
  public Zb4<Zu0, Zzw> Zw(Zat paramZat, Znn paramZnn, Zif paramZif) {
    return Zb4.Zn(new Zb_2(this, paramZnn));
  }
  
  private static Zeuu lambda$productionFactory$0(Zem0 paramZem0, Zr18 paramZr18, Ztj paramZtj) {
    return new Zeuu(paramZem0, paramZtj, paramZr18);
  }
  
  static {
    // Byte code:
    //   0: bipush #53
    //   2: ldc '70_PZU^;_TG7'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zeuu.a : Ljava/lang/String;
    //   11: goto -> 152
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
    //   29: if_icmpgt -> 126
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 99, 5 -> 104
    //   80: bipush #75
    //   82: goto -> 110
    //   85: bipush #107
    //   87: goto -> 110
    //   90: bipush #28
    //   92: goto -> 110
    //   95: iconst_4
    //   96: goto -> 110
    //   99: bipush #74
    //   101: goto -> 110
    //   104: bipush #6
    //   106: goto -> 110
    //   109: iconst_4
    //   110: ixor
    //   111: ixor
    //   112: i2c
    //   113: castore
    //   114: iinc #0, 1
    //   117: dup
    //   118: ifne -> 126
    //   121: dup2
    //   122: dup_x1
    //   123: goto -> 35
    //   126: dup2_x1
    //   127: pop2
    //   128: dup_x2
    //   129: iload_0
    //   130: if_icmpgt -> 32
    //   133: pop
    //   134: new java/lang/String
    //   137: dup_x1
    //   138: swap
    //   139: invokespecial <init> : ([C)V
    //   142: invokevirtual intern : ()Ljava/lang/String;
    //   145: swap
    //   146: pop
    //   147: swap
    //   148: pop
    //   149: goto -> 8
    //   152: iconst_4
    //   153: anewarray java/lang/Class
    //   156: dup
    //   157: iconst_0
    //   158: ldc net/portswigger/Zzu
    //   160: aastore
    //   161: dup
    //   162: iconst_1
    //   163: ldc net/portswigger/Z_g
    //   165: aastore
    //   166: dup
    //   167: iconst_2
    //   168: ldc net/portswigger/Zgx
    //   170: aastore
    //   171: dup
    //   172: iconst_3
    //   173: ldc net/portswigger/Zrxc
    //   175: aastore
    //   176: invokestatic asList : ([Ljava/lang/Object;)Ljava/util/List;
    //   179: putstatic burp/Zeuu.ZC : Ljava/util/List;
    //   182: return
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeuu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */