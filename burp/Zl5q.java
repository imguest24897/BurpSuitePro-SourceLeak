package burp;

import java.awt.Font;

class Zl5q extends Zl52 {
  private Zljk ZN;
  
  private static final String c;
  
  Zl5q(Zvo6 paramZvo6, Zgb6 paramZgb6, Zzyl paramZzyl, Zvov paramZvov, Zm51 paramZm51) {
    super(paramZvo6, paramZgb6, paramZzyl, paramZvov, new Zm98());
    Zt5h zt5h = new Zt5h(this.ZI);
    ZM(zt5h, paramZgb6, paramZvov, paramZm51);
    Zzuk zzuk = new Zzuk(paramZzyl, this::Zid);
    ZA(new Zxrh(this.ZI, ZtU(), zzuk));
    this.ZI.setName(c);
  }
  
  private void ZM(Zt5h paramZt5h, Zgb6 paramZgb6, Zvov paramZvov, Zm51 paramZm51) {
    // Byte code:
    //   0: new burp/Ztsx
    //   3: dup
    //   4: aload #4
    //   6: aload_2
    //   7: <illegal opcode> get : (Lburp/Zgb6;)Ljava/util/function/Supplier;
    //   12: iconst_0
    //   13: invokespecial <init> : (Lburp/Zm51;Ljava/util/function/Supplier;I)V
    //   16: astore #5
    //   18: aload_0
    //   19: new burp/Zljk
    //   22: dup
    //   23: new burp/Ztsw
    //   26: dup
    //   27: aload #5
    //   29: invokespecial <init> : (Lburp/Zlqb;)V
    //   32: aload_3
    //   33: invokespecial <init> : (Lburp/Zlqb;Lburp/Zvov;)V
    //   36: putfield ZN : Lburp/Zljk;
    //   39: aload_0
    //   40: getfield ZN : Lburp/Zljk;
    //   43: aload_1
    //   44: invokevirtual ZS : (Ljavax/swing/ListCellRenderer;)V
    //   47: aload_0
    //   48: getfield ZN : Lburp/Zljk;
    //   51: iconst_1
    //   52: invokevirtual ZI : (Z)V
    //   55: aload_0
    //   56: getfield ZN : Lburp/Zljk;
    //   59: iconst_1
    //   60: invokevirtual ZU : (Z)V
    //   63: aload_0
    //   64: getfield ZN : Lburp/Zljk;
    //   67: iconst_1
    //   68: invokevirtual Zl : (Z)V
    //   71: aload_0
    //   72: getfield ZN : Lburp/Zljk;
    //   75: iconst_1
    //   76: invokevirtual ZG : (Z)V
    //   79: aload_0
    //   80: getfield ZN : Lburp/Zljk;
    //   83: iconst_0
    //   84: invokevirtual Zc : (Z)V
    //   87: aload_0
    //   88: getfield ZN : Lburp/Zljk;
    //   91: sipush #200
    //   94: invokevirtual ZL : (I)V
    //   97: aload_0
    //   98: getfield ZN : Lburp/Zljk;
    //   101: aload_0
    //   102: getfield ZI : Lburp/Zmgn;
    //   105: invokevirtual ZN : (Ljavax/swing/text/JTextComponent;)V
    //   108: aload_1
    //   109: aload_2
    //   110: <illegal opcode> Ze : (Lburp/Zt5h;Lburp/Zgb6;)Lburp/Zz0g;
    //   115: astore #6
    //   117: aload_2
    //   118: aload #6
    //   120: invokeinterface ZC : (Lburp/Zz0g;)V
    //   125: aload #6
    //   127: invokeinterface Ze : ()V
    //   132: return
  }
  
  public void Zr(Zzil paramZzil) {
    this.ZN.ZM(paramZzil);
  }
  
  private static void lambda$installAutoComplete$1(Zt5h paramZt5h, Zgb6 paramZgb6) {
    paramZt5h.ZI(new Font(paramZgb6.Zf8(), 0, paramZgb6.ZfF()));
  }
  
  private static Zznc lambda$installAutoComplete$0(Zgb6 paramZgb6) {
    return new Zznc(paramZgb6.Zf8(), paramZgb6.ZfC());
  }
  
  static {
    // Byte code:
    //   0: bipush #58
    //   2: ldc 'DT:\sJP|n-WG:'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zl5q.c : Ljava/lang/String;
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
    //   80: bipush #86
    //   82: goto -> 112
    //   85: bipush #31
    //   87: goto -> 112
    //   90: bipush #24
    //   92: goto -> 112
    //   95: bipush #97
    //   97: goto -> 112
    //   100: bipush #35
    //   102: goto -> 112
    //   105: bipush #70
    //   107: goto -> 112
    //   110: bipush #32
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl5q.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */