package burp;

import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zbn2 {
  private final Ztov ZJ;
  
  private final Zeu1 Zg;
  
  private final Zgb6 ZB;
  
  private final Zb0h Zm;
  
  private final Ztwv ZE;
  
  private final Zl0a ZA;
  
  private Zbgq ZZ;
  
  private Zbgh Zq;
  
  private static final String a;
  
  Zbn2(Zt4u paramZt4u, Zxgc paramZxgc, Ztov paramZtov, Zeu1 paramZeu1, Zgb6 paramZgb6, Zb0h paramZb0h, Ztwv paramZtwv, Zrn7 paramZrn7) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: invokestatic ZS : ()I
    //   7: aload_0
    //   8: aload_3
    //   9: putfield ZJ : Lburp/Ztov;
    //   12: istore #9
    //   14: aload_0
    //   15: aload #4
    //   17: putfield Zg : Lburp/Zeu1;
    //   20: aload_0
    //   21: aload #5
    //   23: putfield ZB : Lburp/Zgb6;
    //   26: aload_0
    //   27: aload #6
    //   29: putfield Zm : Lburp/Zb0h;
    //   32: aload_0
    //   33: aload #7
    //   35: putfield ZE : Lburp/Ztwv;
    //   38: aload #4
    //   40: ifnonnull -> 70
    //   43: aload_0
    //   44: new burp/Zbgq
    //   47: dup
    //   48: aload_1
    //   49: aload_0
    //   50: aload_3
    //   51: aload #8
    //   53: aload #5
    //   55: aload #6
    //   57: aload #7
    //   59: invokespecial <init> : (Lburp/Zt4u;Lburp/Zbn2;Lburp/Ztov;Lburp/Zrn7;Lburp/Zgb6;Lburp/Zb0h;Lburp/Ztwv;)V
    //   62: putfield ZZ : Lburp/Zbgq;
    //   65: iload #9
    //   67: ifne -> 91
    //   70: aload_0
    //   71: new burp/Zbgh
    //   74: dup
    //   75: aload_0
    //   76: aload_3
    //   77: aload #4
    //   79: aload #5
    //   81: aload #6
    //   83: aload #7
    //   85: invokespecial <init> : (Lburp/Zbn2;Lburp/Ztov;Lburp/Zeu1;Lburp/Zgb6;Lburp/Zb0h;Lburp/Ztwv;)V
    //   88: putfield Zq : Lburp/Zbgh;
    //   91: aload #4
    //   93: ifnull -> 192
    //   96: aload #4
    //   98: getfield Zs : Lburp/Zl0a;
    //   101: ifnull -> 192
    //   104: aload #4
    //   106: getfield Zs : Lburp/Zl0a;
    //   109: invokevirtual isShowing : ()Z
    //   112: ifeq -> 192
    //   115: aload #4
    //   117: getfield Zs : Lburp/Zl0a;
    //   120: aload_0
    //   121: getfield ZZ : Lburp/Zbgq;
    //   124: ifnonnull -> 134
    //   127: aload_0
    //   128: getfield Zq : Lburp/Zbgh;
    //   131: goto -> 138
    //   134: aload_0
    //   135: getfield ZZ : Lburp/Zbgq;
    //   138: invokevirtual Zf : (Lburp/Zsic;)V
    //   141: aload #4
    //   143: getfield Zs : Lburp/Zl0a;
    //   146: iconst_1
    //   147: invokevirtual setVisible : (Z)V
    //   150: aload_0
    //   151: aload #4
    //   153: getfield Zs : Lburp/Zl0a;
    //   156: putfield ZA : Lburp/Zl0a;
    //   159: aload_0
    //   160: getfield ZA : Lburp/Zl0a;
    //   163: ifnull -> 170
    //   166: iconst_1
    //   167: goto -> 171
    //   170: iconst_0
    //   171: getstatic net/portswigger/Zqf.Zx : Lnet/portswigger/Zqf;
    //   174: aload #4
    //   176: invokevirtual ZN : ()Ljava/lang/String;
    //   179: aload #4
    //   181: invokevirtual ZR : ()Z
    //   184: invokestatic Zk : (ZLnet/portswigger/Zqf;Ljava/lang/String;Z)V
    //   187: iload #9
    //   189: ifne -> 248
    //   192: aload_0
    //   193: new burp/Zl0a
    //   196: dup
    //   197: aload_2
    //   198: invokeinterface ZK1 : ()Lburp/Zl04;
    //   203: getstatic burp/Zbn2.a : Ljava/lang/String;
    //   206: bipush #100
    //   208: bipush #32
    //   210: aload_0
    //   211: getfield ZZ : Lburp/Zbgq;
    //   214: ifnonnull -> 224
    //   217: aload_0
    //   218: getfield Zq : Lburp/Zbgh;
    //   221: goto -> 228
    //   224: aload_0
    //   225: getfield ZZ : Lburp/Zbgq;
    //   228: invokespecial <init> : (Ljava/awt/Window;Ljava/lang/String;IILburp/Zsic;)V
    //   231: putfield ZA : Lburp/Zl0a;
    //   234: aload #4
    //   236: ifnull -> 248
    //   239: aload #4
    //   241: aload_0
    //   242: getfield ZA : Lburp/Zl0a;
    //   245: putfield Zs : Lburp/Zl0a;
    //   248: return
  }
  
  Zl0a ZN() {
    return this.ZA;
  }
  
  void Zp() {
    Zuh.Zk((this.ZA != null), Zqf.Zx, (this.Zg == null) ? "" : this.Zg.ZN(), (this.Zg != null && this.Zg.ZR()));
    if (this.Zg != null)
      this.Zg.Zk.set(false); 
    this.ZA.ZU(true);
  }
  
  Zsic Ze(Zsic paramZsic) {
    if (paramZsic == this.ZZ) {
      if (this.Zq == null)
        this.Zq = new Zbgh(this, this.ZJ, this.ZZ.ZK(), this.ZB, this.Zm, this.ZE); 
      return this.Zq;
    } 
    Zuh.Zb(false, Zqf.Zr);
    return null;
  }
  
  static {
    // Byte code:
    //   0: bipush #117
    //   2: ldc 'C;O~ar?}$9D/a'Gu/'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zbn2.a : Ljava/lang/String;
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
    //   80: bipush #122
    //   82: goto -> 112
    //   85: bipush #33
    //   87: goto -> 112
    //   90: bipush #91
    //   92: goto -> 112
    //   95: bipush #111
    //   97: goto -> 112
    //   100: bipush #52
    //   102: goto -> 112
    //   105: bipush #69
    //   107: goto -> 112
    //   110: bipush #63
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbn2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */