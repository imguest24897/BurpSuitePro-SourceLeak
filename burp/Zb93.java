package burp;

import java.awt.Component;
import java.awt.Point;
import java.awt.Window;

class Zb93 {
  private final Zxz8 ZN;
  
  private final Zbws Zy;
  
  private final Zt_b Zp;
  
  private final Component Zt;
  
  private int[] ZR;
  
  private static final String a;
  
  Zb93(Zxz8 paramZxz8, Zbws paramZbws, Zt_b paramZt_b, Component paramComponent) {
    this.ZN = paramZxz8;
    this.Zy = paramZbws;
    this.Zp = paramZt_b;
    this.Zt = paramComponent;
  }
  
  void ZS(Point paramPoint, boolean paramBoolean) {
    int[] arrayOfInt = ZO(this.Zy, this.Zy.getSelectedRows());
    int i = this.Zy.convertRowIndexToModel(this.Zy.rowAtPoint(paramPoint));
    boolean bool = Zba8.ZKe();
    if (arrayOfInt.length == 0 || !Zz(i, arrayOfInt))
      arrayOfInt = new int[] { i }; 
    Zxjc[] arrayOfZxjc = new Zxjc[arrayOfInt.length];
    byte b = 0;
    while (b < arrayOfInt.length) {
      arrayOfZxjc[b] = this.Zp.Za(arrayOfInt[b]);
      b++;
      if (!bool)
        break; 
    } 
    this.ZR = arrayOfInt;
    Zbpy zbpy = new Zbpy(Zt2m.ZF(this.Zt), arrayOfZxjc, this.ZN, this, this::lambda$showPopupMenu$0);
    zbpy.ZB(this.Zy, paramBoolean, paramPoint);
  }
  
  private int[] ZO(Zbws paramZbws, int[] paramArrayOfint) {
    int[] arrayOfInt = new int[paramArrayOfint.length];
    byte b = 0;
    boolean bool = Zba8.ZKe();
    while (b < paramArrayOfint.length) {
      arrayOfInt[b] = paramZbws.convertRowIndexToModel(paramArrayOfint[b]);
      b++;
      if (!bool)
        break; 
    } 
    return arrayOfInt;
  }
  
  private boolean Zz(int paramInt, int[] paramArrayOfint) {
    int[] arrayOfInt = paramArrayOfint;
    int i = arrayOfInt.length;
    boolean bool = Zba8.ZKF();
    byte b = 0;
    while (b < i) {
      int j = arrayOfInt[b];
      if (paramInt == j)
        return true; 
      b++;
      if (bool)
        break; 
    } 
    return false;
  }
  
  void Zt(Zxjc paramZxjc) {
    new Zrvx(Zt2m.ZF(this.Zy), paramZxjc, this.ZN, this::lambda$showDetectionMethodsDialog$1);
  }
  
  void ZC(Window paramWindow) {
    Zn(paramWindow, new Zbku());
  }
  
  void Zw(Window paramWindow, Zvs paramZvs) {
    Zbku zbku = new Zbku();
    zbku.ZG(paramZvs);
    Zn(paramWindow, zbku);
  }
  
  private void Zn(Window paramWindow, Zbku paramZbku) {
    new Zl07(paramWindow, a, paramZbku, 150, 50);
  }
  
  private void lambda$showDetectionMethodsDialog$1() {
    this.Zp.fireTableCellUpdated(this.ZR[0], 9);
  }
  
  private void lambda$showPopupMenu$0() {
    // Byte code:
    //   0: invokestatic ZKe : ()Z
    //   3: istore_1
    //   4: aload_0
    //   5: getfield ZR : [I
    //   8: arraylength
    //   9: iconst_1
    //   10: if_icmpne -> 31
    //   13: aload_0
    //   14: getfield Zp : Lburp/Zt_b;
    //   17: aload_0
    //   18: getfield ZR : [I
    //   21: iconst_0
    //   22: iaload
    //   23: iconst_0
    //   24: invokevirtual fireTableCellUpdated : (II)V
    //   27: iload_1
    //   28: ifne -> 72
    //   31: aload_0
    //   32: getfield ZR : [I
    //   35: astore_2
    //   36: aload_2
    //   37: arraylength
    //   38: istore_3
    //   39: iconst_0
    //   40: istore #4
    //   42: iload #4
    //   44: iload_3
    //   45: if_icmpge -> 72
    //   48: aload_2
    //   49: iload #4
    //   51: iaload
    //   52: istore #5
    //   54: aload_0
    //   55: getfield Zp : Lburp/Zt_b;
    //   58: iload #5
    //   60: iload #5
    //   62: invokevirtual fireTableRowsUpdated : (II)V
    //   65: iinc #4, 1
    //   68: iload_1
    //   69: ifne -> 42
    //   72: return
  }
  
  static {
    // Byte code:
    //   0: bipush #104
    //   2: ldc '`wc:'.umx6S*$}w'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zb93.a : Ljava/lang/String;
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
    //   85: bipush #123
    //   87: goto -> 112
    //   90: bipush #108
    //   92: goto -> 112
    //   95: bipush #126
    //   97: goto -> 112
    //   100: bipush #55
    //   102: goto -> 112
    //   105: bipush #79
    //   107: goto -> 112
    //   110: bipush #43
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb93.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */