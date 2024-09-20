package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.List;

class Zgoy extends Zbqc implements Zzyl, Zky2, Zeq {
  private final Zbws Zu;
  
  private final Zt0o ZX;
  
  private final Zxal Zn;
  
  private final Zqy Zq;
  
  private final Ztyg ZU;
  
  private final Zgq7 ZK;
  
  private final Zkl6 Zt;
  
  private final Ze47 Zv;
  
  private Zbup ZD;
  
  private Zmyz ZT;
  
  private static final String a;
  
  Zgoy(List<Zxkf> paramList, Zbnt paramZbnt, Ztyg paramZtyg, Zgq7 paramZgq7, Zz1z paramZz1z, Zl04 paramZl04, boolean paramBoolean, Zkl6 paramZkl6, Ze47 paramZe47) {
    this(paramList, paramZbnt, paramZtyg, paramZgq7, paramZz1z, paramZl04, paramBoolean, (String)null, paramZkl6, paramZe47);
  }
  
  Zgoy(List<Zxkf> paramList, Zbnt paramZbnt, Ztyg paramZtyg, Zgq7 paramZgq7, Zz1z paramZz1z, Zl04 paramZl04, boolean paramBoolean, String paramString, Zkl6 paramZkl6, Ze47 paramZe47) {
    this.ZU = paramZtyg;
    this.ZK = paramZgq7;
    this.Zt = paramZkl6;
    this.Zv = paramZe47;
    Zi();
    this.Zu = new Zbws();
    this.ZX = new Zt0o(this.Zu, paramList, paramString);
    this.Zu.ZL(this.ZX);
    this.ZD.setViewportView(this.Zu);
    this.Zu.Zk(this);
    this.Zu.Zc(this);
    this.Zq = paramZz1z.ZK(paramZl04);
    this.Zn = new Zxal(paramZbnt, paramZtyg, paramZgq7, paramZkl6, paramZe47);
    this.ZT.setBottomComponent((Component)this.Zn);
    this.ZT.Za(paramBoolean ? 20 : 35);
  }
  
  void ZR(List<Zxkf> paramList, String paramString) {
    this.ZX.ZY(paramList, paramString);
    this.Zn.Zo(null, paramString);
  }
  
  private void Zi() {
    this.ZT = new Zmyz();
    this.ZD = new Zbup();
    setLayout(new BorderLayout());
    this.ZT.setOrientation(0);
    this.ZT.setLeftComponent(this.ZD);
    add(this.ZT, a);
  }
  
  Zll9[] ZB() {
    return ZT((Point)null, false);
  }
  
  private Zll9[] ZT(Point paramPoint, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic Zp : ()[I
    //   3: astore_3
    //   4: aload_0
    //   5: getfield Zu : Lburp/Zbws;
    //   8: invokevirtual getSelectedRows : ()[I
    //   11: astore #5
    //   13: iload_2
    //   14: ifeq -> 24
    //   17: aload #5
    //   19: arraylength
    //   20: iconst_1
    //   21: if_icmple -> 101
    //   24: aload #5
    //   26: arraylength
    //   27: anewarray burp/Zll9
    //   30: astore #4
    //   32: iconst_0
    //   33: istore #6
    //   35: iload #6
    //   37: aload #5
    //   39: arraylength
    //   40: if_icmpge -> 97
    //   43: aload_0
    //   44: getfield ZX : Lburp/Zt0o;
    //   47: aload_0
    //   48: getfield Zu : Lburp/Zbws;
    //   51: aload #5
    //   53: iload #6
    //   55: iaload
    //   56: invokevirtual convertRowIndexToModel : (I)I
    //   59: invokevirtual Zg : (I)Lburp/Zxkf;
    //   62: astore #7
    //   64: aload #4
    //   66: iload #6
    //   68: aload #7
    //   70: invokevirtual Zl : ()Lburp/Zg6u;
    //   73: ifnonnull -> 84
    //   76: aload #7
    //   78: getfield Zy : Lburp/Zmxt;
    //   81: goto -> 89
    //   84: aload #7
    //   86: invokevirtual Zl : ()Lburp/Zg6u;
    //   89: aastore
    //   90: iinc #6, 1
    //   93: aload_3
    //   94: ifnonnull -> 35
    //   97: aload_3
    //   98: ifnonnull -> 185
    //   101: aload_1
    //   102: ifnull -> 179
    //   105: aload_0
    //   106: getfield Zu : Lburp/Zbws;
    //   109: aload_1
    //   110: invokevirtual rowAtPoint : (Ljava/awt/Point;)I
    //   113: istore #6
    //   115: iload #6
    //   117: iconst_m1
    //   118: if_icmpne -> 126
    //   121: iconst_0
    //   122: anewarray burp/Zll9
    //   125: areturn
    //   126: iconst_1
    //   127: anewarray burp/Zll9
    //   130: astore #4
    //   132: aload_0
    //   133: getfield ZX : Lburp/Zt0o;
    //   136: aload_0
    //   137: getfield Zu : Lburp/Zbws;
    //   140: iload #6
    //   142: invokevirtual convertRowIndexToModel : (I)I
    //   145: invokevirtual Zg : (I)Lburp/Zxkf;
    //   148: astore #7
    //   150: aload #4
    //   152: iconst_0
    //   153: aload #7
    //   155: invokevirtual Zl : ()Lburp/Zg6u;
    //   158: ifnonnull -> 169
    //   161: aload #7
    //   163: getfield Zy : Lburp/Zmxt;
    //   166: goto -> 174
    //   169: aload #7
    //   171: invokevirtual Zl : ()Lburp/Zg6u;
    //   174: aastore
    //   175: aload_3
    //   176: ifnonnull -> 185
    //   179: iconst_0
    //   180: anewarray burp/Zll9
    //   183: astore #4
    //   185: aload #4
    //   187: areturn
  }
  
  public void ZV(MouseEvent paramMouseEvent, Component paramComponent, Point paramPoint) {
    Zll9[] arrayOfZll9 = ZT(paramPoint, true);
    if (arrayOfZll9.length > 0)
      this.Zq.Zk(arrayOfZll9, paramMouseEvent, paramComponent, paramPoint); 
  }
  
  public void ZR(MouseEvent paramMouseEvent, int paramInt1, int paramInt2) {
    Zxkf zxkf = this.ZX.Zg(this.Zu.convertRowIndexToModel(paramInt1));
    Zll9 zll9 = (Zll9)((zxkf.Zl() == null) ? zxkf.Zy : zxkf.Zl());
    if (zll9 != null) {
      Zl4_ zl4_ = new Zl4_(Zt2m.ZF(this), this.ZU, this.ZK, zll9, this.Zt, this.Zv);
      zl4_.setVisible(true);
    } 
  }
  
  public void ZK(int paramInt1, int paramInt2) {
    this.Zn.Zo(this.ZX.Zg(this.Zu.convertRowIndexToModel(paramInt1)), this.ZX.Zm());
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    return this.Zq.ZL(paramInt, ZB());
  }
  
  static {
    // Byte code:
    //   0: bipush #100
    //   2: ldc ':d,$'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zgoy.a : Ljava/lang/String;
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
    //   80: bipush #59
    //   82: goto -> 112
    //   85: bipush #59
    //   87: goto -> 112
    //   90: bipush #28
    //   92: goto -> 112
    //   95: bipush #116
    //   97: goto -> 112
    //   100: bipush #45
    //   102: goto -> 112
    //   105: bipush #50
    //   107: goto -> 112
    //   110: bipush #16
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgoy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */