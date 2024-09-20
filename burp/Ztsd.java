package burp;

import java.util.Map;

public class Ztsd {
  final Ze1i ZL;
  
  private final Zgba Zj;
  
  private final Zx4<Zgba> ZI;
  
  private final Zx4<Map.Entry<String, Zlwx>> Zv;
  
  private final Zx4<Zlwx> Zd;
  
  private static final String a;
  
  public Ztsd(Zgba paramZgba) {
    this.Zj = paramZgba;
    this.ZL = new Ze1i();
    String[] arrayOfString = Zzkm.Zq();
    this.Zv = new Zxp(this, '{', '}', this.ZL);
    this.Zd = new Zxs(this, '[', ']', this.ZL);
    this.ZI = new Zx3(this, '{', '}', this.ZL);
    if (arrayOfString != null)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public String Zh() {
    Za(this.Zj);
    return this.ZL.toString();
  }
  
  private void Za(Zgba paramZgba) {
    String[] arrayOfString = Zzkm.Zq();
    if (paramZgba.ZT()) {
      ZU(paramZgba);
      if (arrayOfString != null) {
        if (!paramZgba.Zf().isEmpty())
          Zr(paramZgba.Zf()); 
        this.ZI.Zd(paramZgba.Zi().iterator());
        return;
      } 
      return;
    } 
    if (!paramZgba.Zf().isEmpty())
      Zr(paramZgba.Zf()); 
    this.ZI.Zd(paramZgba.Zi().iterator());
  }
  
  private void ZU(Zgba paramZgba) {
    Zr(paramZgba.Zf());
    Zlwx zlwx = paramZgba.Zj();
    Zt(zlwx);
  }
  
  private void Zt(Zlwx paramZlwx) {
    // Byte code:
    //   0: invokestatic Zq : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: invokeinterface Zi : ()Z
    //   10: ifeq -> 54
    //   13: aload_1
    //   14: invokeinterface ZG : ()Ljava/lang/String;
    //   19: ifnonnull -> 37
    //   22: aload_0
    //   23: getfield ZL : Lburp/Ze1i;
    //   26: getstatic burp/Ztsd.a : Ljava/lang/String;
    //   29: invokevirtual Z_ : (Ljava/lang/String;)Lburp/Ze1i;
    //   32: pop
    //   33: aload_2
    //   34: ifnull -> 192
    //   37: aload_0
    //   38: aload_1
    //   39: invokeinterface ZG : ()Ljava/lang/String;
    //   44: invokestatic Zw : (Ljava/lang/String;)Ljava/lang/String;
    //   47: invokevirtual ZF : (Ljava/lang/String;)V
    //   50: aload_2
    //   51: ifnull -> 192
    //   54: aload_1
    //   55: invokeinterface ZF : ()Z
    //   60: ifeq -> 80
    //   63: aload_0
    //   64: aload_1
    //   65: invokeinterface Za : ()[B
    //   70: invokestatic ZE : ([B)Ljava/lang/String;
    //   73: invokevirtual ZF : (Ljava/lang/String;)V
    //   76: aload_2
    //   77: ifnull -> 192
    //   80: aload_1
    //   81: invokeinterface ZR : ()Z
    //   86: ifeq -> 107
    //   89: aload_0
    //   90: getfield ZL : Lburp/Ze1i;
    //   93: aload_1
    //   94: invokeinterface ZD : ()J
    //   99: invokevirtual ZR : (J)Lburp/Ze1i;
    //   102: pop
    //   103: aload_2
    //   104: ifnull -> 192
    //   107: aload_1
    //   108: invokeinterface ZW : ()Z
    //   113: ifeq -> 134
    //   116: aload_0
    //   117: getfield ZL : Lburp/Ze1i;
    //   120: aload_1
    //   121: invokeinterface ZH : ()Z
    //   126: invokevirtual ZT : (Z)Lburp/Ze1i;
    //   129: pop
    //   130: aload_2
    //   131: ifnull -> 192
    //   134: aload_1
    //   135: invokeinterface ZN : ()Z
    //   140: ifeq -> 165
    //   143: aload_0
    //   144: getfield Zd : Lburp/Zx4;
    //   147: aload_1
    //   148: invokeinterface ZO : ()Ljava/util/List;
    //   153: invokeinterface iterator : ()Ljava/util/Iterator;
    //   158: invokevirtual Zd : (Ljava/util/Iterator;)V
    //   161: aload_2
    //   162: ifnull -> 192
    //   165: aload_1
    //   166: invokeinterface Zq : ()Z
    //   171: ifeq -> 192
    //   174: aload_0
    //   175: getfield Zv : Lburp/Zx4;
    //   178: aload_1
    //   179: invokeinterface Zf : ()Lburp/Zvt;
    //   184: invokeinterface iterator : ()Ljava/util/Iterator;
    //   189: invokevirtual Zd : (Ljava/util/Iterator;)V
    //   192: return
  }
  
  private void ZF(String paramString) {
    this.ZL.ZE('"').Z_(paramString).ZE('"');
  }
  
  private void Zr(String paramString) {
    ZF(paramString);
    this.ZL.ZE(':');
  }
  
  static {
    // Byte code:
    //   0: bipush #74
    //   2: ldc 'eXe'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Ztsd.a : Ljava/lang/String;
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
    //   80: bipush #65
    //   82: goto -> 112
    //   85: bipush #103
    //   87: goto -> 112
    //   90: bipush #67
    //   92: goto -> 112
    //   95: bipush #49
    //   97: goto -> 112
    //   100: bipush #88
    //   102: goto -> 112
    //   105: bipush #83
    //   107: goto -> 112
    //   110: bipush #48
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztsd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */