package burp;

import java.awt.Component;
import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Ze65 implements Zll9, Zgzj<Ze65> {
  private final Zgnc Zw;
  
  private final String ZI;
  
  private final String ZG;
  
  private final String Zj;
  
  private final boolean Zi;
  
  private final long Zh;
  
  private final int Ze;
  
  private final int ZP;
  
  private final String ZR;
  
  private final String Zk;
  
  private static final String a;
  
  public Ze65(Zgnc paramZgnc, Zbnt paramZbnt) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: invokestatic ZJx : ()[I
    //   7: aload_0
    //   8: aload_1
    //   9: putfield Zw : Lburp/Zgnc;
    //   12: astore_3
    //   13: aload_1
    //   14: invokeinterface ZzX : ()Lburp/Zski;
    //   19: invokeinterface ZyR : ()Lburp/Zlit;
    //   24: astore #4
    //   26: aload_0
    //   27: aload #4
    //   29: invokeinterface Zd1 : ()Ljava/lang/String;
    //   34: putfield ZI : Ljava/lang/String;
    //   37: aload_0
    //   38: aload_1
    //   39: invokeinterface Zzj : ()Ljava/lang/String;
    //   44: putfield ZG : Ljava/lang/String;
    //   47: aload_0
    //   48: aload #4
    //   50: invokeinterface Zd4 : ()[B
    //   55: invokestatic ZG : ([B)Ljava/lang/String;
    //   58: putfield Zj : Ljava/lang/String;
    //   61: aload_0
    //   62: getstatic burp/Ze65.a : Ljava/lang/String;
    //   65: aload_0
    //   66: getfield ZG : Ljava/lang/String;
    //   69: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   72: ifne -> 92
    //   75: aload #4
    //   77: invokeinterface Zds : ()Z
    //   82: ifeq -> 100
    //   85: goto -> 92
    //   88: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   91: athrow
    //   92: iconst_1
    //   93: goto -> 101
    //   96: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   99: athrow
    //   100: iconst_0
    //   101: putfield Zi : Z
    //   104: aload_0
    //   105: aload_1
    //   106: invokeinterface Zz5 : ()J
    //   111: putfield Zh : J
    //   114: aload_1
    //   115: invokeinterface Zza : ()Lburp/Zstu;
    //   120: astore #5
    //   122: aload #5
    //   124: ifnull -> 206
    //   127: aload #4
    //   129: aload #5
    //   131: getstatic burp/Zt0k.HTML_ANALYSIS : Lburp/Zt0k;
    //   134: aload_2
    //   135: invokestatic Zt : (Lburp/Zlit;Lburp/Zstu;Lburp/Zt0k;Lburp/Zbnt;)Lburp/Zs68;
    //   138: astore #6
    //   140: aload_0
    //   141: aload #6
    //   143: getfield Zb : S
    //   146: putfield Ze : I
    //   149: aload_0
    //   150: aload #6
    //   152: getfield Zs : I
    //   155: putfield ZP : I
    //   158: aload_0
    //   159: aload #6
    //   161: getfield ZH : Lburp/Zk8m;
    //   164: getfield Zj : S
    //   167: invokestatic Zm : (S)Ljava/lang/String;
    //   170: putfield ZR : Ljava/lang/String;
    //   173: aload_0
    //   174: aload #6
    //   176: getfield Zd : Ljava/util/List;
    //   179: ifnonnull -> 191
    //   182: ldc ''
    //   184: goto -> 199
    //   187: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   190: athrow
    //   191: aload #6
    //   193: getfield Zd : Ljava/util/List;
    //   196: invokestatic ZN : (Ljava/util/List;)Ljava/lang/String;
    //   199: putfield Zk : Ljava/lang/String;
    //   202: aload_3
    //   203: ifnull -> 233
    //   206: aload_0
    //   207: iconst_0
    //   208: putfield Ze : I
    //   211: aload_0
    //   212: iconst_0
    //   213: putfield ZP : I
    //   216: aload_0
    //   217: aconst_null
    //   218: putfield ZR : Ljava/lang/String;
    //   221: aload_0
    //   222: aconst_null
    //   223: putfield Zk : Ljava/lang/String;
    //   226: goto -> 233
    //   229: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   232: athrow
    //   233: return
    // Exception table:
    //   from	to	target	type
    //   26	85	88	java/lang/UnsupportedOperationException
    //   75	96	96	java/lang/UnsupportedOperationException
    //   140	187	187	java/lang/UnsupportedOperationException
    //   199	226	229	java/lang/UnsupportedOperationException
  }
  
  public Zski ZS() {
    return this.Zw.ZzX();
  }
  
  public Zmzk Zod() {
    return this.Zw.ZzX().ZyR().Zdz();
  }
  
  public Zstu Zos() {
    return this.Zw.Zzk();
  }
  
  public Zstu ZoO() {
    return this.Zw.Zza();
  }
  
  public boolean ZoZ() {
    return false;
  }
  
  public long ZoB() {
    return this.Zw.Zz5();
  }
  
  public Zmfj Zq(Zkl6 paramZkl6, Zm6x paramZm6x) {
    Zuh.Zb(false, Zqf.ZC);
    throw new UnsupportedOperationException();
  }
  
  public List<Component> Zof() {
    Zuh.Zb(false, Zqf.ZC);
    throw new UnsupportedOperationException();
  }
  
  public Zepe Zl(Component paramComponent) {
    Zuh.Zb(false, Zqf.ZC);
    throw new UnsupportedOperationException();
  }
  
  public Zlit ZlL() {
    return this.Zw.ZzX().ZyR();
  }
  
  public Zeew Ze2() {
    return Zeew.SCANNER;
  }
  
  public short Zl7() {
    return (short)this.Ze;
  }
  
  public int Zlq() {
    return ZoO().Zpu();
  }
  
  public String ZIx() {
    return null;
  }
  
  public String Zq() {
    return this.ZI;
  }
  
  public String Zo() {
    return this.ZG;
  }
  
  public String Zr() {
    return this.Zj;
  }
  
  public boolean ZG() {
    return this.Zi;
  }
  
  public long Zv() {
    return this.Zh;
  }
  
  public int Zf() {
    return this.ZP;
  }
  
  public String ZA() {
    return this.ZR;
  }
  
  public String ZM() {
    return this.Zk;
  }
  
  public boolean Zd(Zmjx<Ze65> paramZmjx, String paramString) {
    return paramZmjx.Z_(this, paramString);
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
  
  static {
    // Byte code:
    //   0: bipush #112
    //   2: ldc 'z[\\n'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Ze65.a : Ljava/lang/String;
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
    //   80: bipush #90
    //   82: goto -> 112
    //   85: bipush #56
    //   87: goto -> 112
    //   90: bipush #120
    //   92: goto -> 112
    //   95: bipush #46
    //   97: goto -> 112
    //   100: bipush #42
    //   102: goto -> 112
    //   105: bipush #115
    //   107: goto -> 112
    //   110: bipush #10
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze65.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */