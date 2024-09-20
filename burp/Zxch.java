package burp;

import java.util.List;
import java.util.function.Predicate;

class Zxch implements Zz0g {
  private final Zmgn ZK;
  
  private final Ze9f Zk;
  
  private final Zgb6 Z_;
  
  private final Zsfb ZC;
  
  private final Zsfb Zf;
  
  private final Predicate<Zgb6> ZW;
  
  private final String ZE;
  
  private boolean Zo;
  
  private static final String a;
  
  static Zxch Za(Zmgn paramZmgn, Ze9f paramZe9f, Zgb6 paramZgb6, Zsba paramZsba, List<String> paramList) {
    Zz78 zz78 = Zz78.ZZ(paramZsba);
    return new Zxch(paramZmgn, paramZe9f, paramZgb6, Zet5.Zt(zz78.ZG(paramList)), Zet5.Zt(new Zen2(zz78.ZG(paramList))), Zgb6::ZfN, zz78.ZC());
  }
  
  static Zxch ZD(Zmgn paramZmgn, Ze9f paramZe9f, Zgb6 paramZgb6, Zs68 paramZs68) {
    Zzwy zzwy = Zzwy.ZQ(paramZs68.ZH);
    return new Zxch(paramZmgn, paramZe9f, paramZgb6, Zet5.ZV(zzwy.Zn()), Zet5.ZV(new Zen2(zzwy.Zn())), Zgb6::ZfV, zzwy.Za());
  }
  
  static Zxch ZZ(Zmgn paramZmgn, Ze9f paramZe9f, Zgb6 paramZgb6, Zsba paramZsba) {
    Zr8l zr8l = Zr8l.Zg(paramZsba);
    return new Zxch(paramZmgn, paramZe9f, paramZgb6, new Zeyo(zr8l.ZI()), new Zeyo(new Zen2(zr8l.ZI())), Zxch::lambda$webSocketMessageSyntaxStyleSelector$0, zr8l.ZE());
  }
  
  private Zxch(Zmgn paramZmgn, Ze9f paramZe9f, Zgb6 paramZgb6, Zsfb paramZsfb1, Zsfb paramZsfb2, Predicate<Zgb6> paramPredicate, String paramString) {
    this.ZK = paramZmgn;
    this.Zk = paramZe9f;
    this.Z_ = paramZgb6;
    this.ZC = paramZsfb1;
    this.Zf = paramZsfb2;
    this.ZW = paramPredicate;
    this.ZE = paramString;
  }
  
  public void Ze() {
    // Byte code:
    //   0: invokestatic ZtD : ()[Lburp/Zbqc;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Zo : Z
    //   8: ifeq -> 73
    //   11: aload_0
    //   12: invokevirtual Zu : ()Z
    //   15: ifne -> 73
    //   18: aload_0
    //   19: getfield Zk : Lburp/Ze9f;
    //   22: aconst_null
    //   23: invokevirtual Zx : (Lburp/Zmhz;)V
    //   26: aload_0
    //   27: getfield Zk : Lburp/Ze9f;
    //   30: new burp/Zey8
    //   33: dup
    //   34: invokespecial <init> : ()V
    //   37: invokevirtual ZF : (Lburp/Zmhz;)V
    //   40: aload_0
    //   41: getfield Zk : Lburp/Ze9f;
    //   44: new burp/Zbq7
    //   47: dup
    //   48: invokespecial <init> : ()V
    //   51: invokevirtual Zb : (Lburp/Zbqi;)V
    //   54: aload_0
    //   55: getfield ZK : Lburp/Zmgn;
    //   58: getstatic burp/Zxch.a : Ljava/lang/String;
    //   61: invokevirtual Zw : (Ljava/lang/String;)V
    //   64: aload_0
    //   65: iconst_0
    //   66: putfield Zo : Z
    //   69: aload_1
    //   70: ifnonnull -> 156
    //   73: aload_0
    //   74: getfield Zo : Z
    //   77: ifne -> 156
    //   80: aload_0
    //   81: invokevirtual Zu : ()Z
    //   84: ifeq -> 156
    //   87: aload_0
    //   88: getfield Zk : Lburp/Ze9f;
    //   91: aload_0
    //   92: getfield Zf : Lburp/Zsfb;
    //   95: invokevirtual Zx : (Lburp/Zmhz;)V
    //   98: aload_0
    //   99: getfield Zk : Lburp/Ze9f;
    //   102: aload_0
    //   103: getfield ZC : Lburp/Zsfb;
    //   106: invokeinterface Zk : ()Lburp/Zbqi;
    //   111: invokevirtual Zb : (Lburp/Zbqi;)V
    //   114: aload_0
    //   115: getfield ZC : Lburp/Zsfb;
    //   118: aload_0
    //   119: getfield Zk : Lburp/Ze9f;
    //   122: invokeinterface ZA : (Lburp/Ze9f;)V
    //   127: aload_0
    //   128: getfield Zf : Lburp/Zsfb;
    //   131: aload_0
    //   132: getfield Zk : Lburp/Ze9f;
    //   135: invokeinterface ZA : (Lburp/Ze9f;)V
    //   140: aload_0
    //   141: getfield ZK : Lburp/Zmgn;
    //   144: aload_0
    //   145: getfield ZE : Ljava/lang/String;
    //   148: invokevirtual Zw : (Ljava/lang/String;)V
    //   151: aload_0
    //   152: iconst_1
    //   153: putfield Zo : Z
    //   156: return
  }
  
  private boolean Zu() {
    return this.ZW.test(this.Z_);
  }
  
  private static boolean lambda$webSocketMessageSyntaxStyleSelector$0(Zgb6 paramZgb6) {
    return true;
  }
  
  static {
    // Byte code:
    //   0: bipush #29
    //   2: ldc '~}olt.rkqy'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zxch.a : Ljava/lang/String;
    //   11: goto -> 151
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
    //   29: if_icmpgt -> 125
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 108, 0 -> 80, 1 -> 85, 2 -> 89, 3 -> 94, 4 -> 98, 5 -> 103
    //   80: bipush #23
    //   82: goto -> 109
    //   85: iconst_5
    //   86: goto -> 109
    //   89: bipush #10
    //   91: goto -> 109
    //   94: iconst_5
    //   95: goto -> 109
    //   98: bipush #70
    //   100: goto -> 109
    //   103: bipush #67
    //   105: goto -> 109
    //   108: iconst_3
    //   109: ixor
    //   110: ixor
    //   111: i2c
    //   112: castore
    //   113: iinc #0, 1
    //   116: dup
    //   117: ifne -> 125
    //   120: dup2
    //   121: dup_x1
    //   122: goto -> 35
    //   125: dup2_x1
    //   126: pop2
    //   127: dup_x2
    //   128: iload_0
    //   129: if_icmpgt -> 32
    //   132: pop
    //   133: new java/lang/String
    //   136: dup_x1
    //   137: swap
    //   138: invokespecial <init> : ([C)V
    //   141: invokevirtual intern : ()Ljava/lang/String;
    //   144: swap
    //   145: pop
    //   146: swap
    //   147: pop
    //   148: goto -> 8
    //   151: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxch.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */