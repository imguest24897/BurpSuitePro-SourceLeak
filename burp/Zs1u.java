package burp;

import java.awt.Component;

class Zs1u implements Ztcr {
  private final Zehb ZT;
  
  private final Zsvy ZI;
  
  private final Zlte ZQ;
  
  private static final String a;
  
  Zs1u(Zg94 paramZg94, Zehb paramZehb, Zznu paramZznu, Zsvy paramZsvy) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_2
    //   6: putfield ZT : Lburp/Zehb;
    //   9: invokestatic Z_ : ()[I
    //   12: aload_0
    //   13: aload #4
    //   15: putfield ZI : Lburp/Zsvy;
    //   18: new burp/Zt8v
    //   21: dup
    //   22: aload_1
    //   23: aload_2
    //   24: invokespecial <init> : (Lburp/Zg94;Lburp/Zehb;)V
    //   27: astore #6
    //   29: aload_0
    //   30: invokestatic Zp : ()Lburp/Zrxv;
    //   33: invokevirtual Zh : ()Lburp/Zrxv;
    //   36: invokevirtual ZP : ()Lburp/Zrxv;
    //   39: invokevirtual ZQ : ()Lburp/Zrxv;
    //   42: invokevirtual ZX : ()Lburp/Zrxv;
    //   45: invokevirtual ZV : ()Lburp/Zrxv;
    //   48: invokevirtual ZI : ()Lburp/Zrxv;
    //   51: invokevirtual Zs : ()Lburp/Zrxv;
    //   54: invokevirtual ZA : ()Lburp/Zrxv;
    //   57: invokevirtual ZG : ()Lburp/Zrxv;
    //   60: aload #6
    //   62: invokevirtual ZO : (Lburp/Zgwj;)Lburp/Zrxv;
    //   65: aload_3
    //   66: invokevirtual Ze : (Lburp/Zzc2;)Lburp/Zrxv;
    //   69: invokevirtual ZW : ()Lburp/Zlte;
    //   72: putfield ZQ : Lburp/Zlte;
    //   75: astore #5
    //   77: aload_0
    //   78: getfield ZQ : Lburp/Zlte;
    //   81: getstatic burp/Zs1u.a : Ljava/lang/String;
    //   84: invokeinterface setName : (Ljava/lang/String;)V
    //   89: aload_0
    //   90: getfield ZQ : Lburp/Zlte;
    //   93: getstatic burp/Ztal.WRAPPED : Lburp/Ztal;
    //   96: invokeinterface Zr : (Lburp/Ztal;)V
    //   101: aload_1
    //   102: invokeinterface ZEi : ()I
    //   107: istore #7
    //   109: aload_1
    //   110: invokeinterface ZI : ()Lburp/Zefg;
    //   115: astore #8
    //   117: aload #8
    //   119: invokeinterface isEmpty : ()Z
    //   124: ifeq -> 141
    //   127: aload_0
    //   128: getfield ZQ : Lburp/Zlte;
    //   131: invokeinterface ZF : ()V
    //   136: aload #5
    //   138: ifnonnull -> 155
    //   141: aload #8
    //   143: aload_0
    //   144: aload_2
    //   145: <illegal opcode> accept : (Lburp/Zs1u;Lburp/Zehb;)Ljava/util/function/Consumer;
    //   150: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   155: aload_0
    //   156: getfield ZQ : Lburp/Zlte;
    //   159: iload #7
    //   161: invokeinterface setSelectedIndex : (I)V
    //   166: return
  }
  
  Component Zc() {
    return this.ZQ.ZO();
  }
  
  boolean ZA() {
    return (this.ZQ.getTabCount() > 1);
  }
  
  void ZU(Zmx paramZmx) {
    this.ZQ.addTab(paramZmx.Zc(), this.ZT.Zz(paramZmx));
  }
  
  public void ZQ(Component paramComponent) {
    this.ZI.Ze(this.ZQ.indexOfComponent(paramComponent));
  }
  
  private void lambda$new$0(Zehb paramZehb, Zmx paramZmx) {
    this.ZQ.addTab(paramZmx.Zc(), paramZehb.Zz(paramZmx));
  }
  
  static {
    // Byte code:
    //   0: bipush #20
    //   2: ldc '~\2\\bNe[68RS'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zs1u.a : Ljava/lang/String;
    //   11: goto -> 153
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
    //   29: if_icmpgt -> 127
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
    //   80: bipush #120
    //   82: goto -> 111
    //   85: bipush #101
    //   87: goto -> 111
    //   90: bipush #9
    //   92: goto -> 111
    //   95: iconst_4
    //   96: goto -> 111
    //   99: bipush #38
    //   101: goto -> 111
    //   104: bipush #103
    //   106: goto -> 111
    //   109: bipush #71
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs1u.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */