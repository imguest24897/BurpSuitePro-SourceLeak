package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zk0o extends Zklz<Ze9k> {
  private static final Zllo<Ze9k> Zb;
  
  public static final Zekv Zh;
  
  public static final Zek9 ZF;
  
  public static final Zekb<Zl83> ZD;
  
  private static final String a;
  
  protected Zk0o() {
    super((Zm31[])null, Zb, Zz5f.ABSTRACT);
  }
  
  public Zeu4<? extends Ze9k> Z_(byte paramByte) {
    String str = Zkte.Zwh();
    Zzvm zzvm = Zzvm.Za(paramByte);
    Zuh.ZT((zzvm != null), Zqf.Zr, a);
    if (Zbqc.Zwu() == null)
      Zkte.ZU("lthIDb"); 
    return (zzvm == null) ? null : zzvm.detailsSupplier.get();
  }
  
  static {
    // Byte code:
    //   0: bipush #20
    //   2: ldc 'g\\b^vb:Ho\\fc-BnjDIO{\\n&YS:\\ncYIF~\\nbH:c\\fIoA'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zk0o.a : Ljava/lang/String;
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
    //   80: bipush #35
    //   82: goto -> 112
    //   85: bipush #125
    //   87: goto -> 112
    //   90: bipush #51
    //   92: goto -> 112
    //   95: bipush #14
    //   97: goto -> 112
    //   100: bipush #100
    //   102: goto -> 112
    //   105: bipush #123
    //   107: goto -> 112
    //   110: bipush #18
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
    //   154: new burp/Zkg5
    //   157: dup
    //   158: invokespecial <init> : ()V
    //   161: putstatic burp/Zk0o.Zb : Lburp/Zllo;
    //   164: new burp/Zekv
    //   167: dup
    //   168: iconst_1
    //   169: iconst_0
    //   170: invokespecial <init> : (II)V
    //   173: putstatic burp/Zk0o.Zh : Lburp/Zekv;
    //   176: new burp/Zek9
    //   179: dup
    //   180: iconst_2
    //   181: iconst_0
    //   182: invokespecial <init> : (IZ)V
    //   185: putstatic burp/Zk0o.ZF : Lburp/Zek9;
    //   188: new burp/Zekb
    //   191: dup
    //   192: iconst_3
    //   193: getstatic burp/Zl83.Zw : Lburp/Zeu4;
    //   196: invokespecial <init> : (ILburp/Zeu4;)V
    //   199: putstatic burp/Zk0o.ZD : Lburp/Zekb;
    //   202: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk0o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */