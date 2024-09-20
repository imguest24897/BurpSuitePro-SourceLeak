package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zm2;

public class Zbax extends Zbv5 implements Zky2 {
  private final Zz0n Zx;
  
  private final Zt4u Zc;
  
  private final Zskh Zd;
  
  private final Zli1 ZF;
  
  private final Ztn0 ZK;
  
  private Zbws ZM;
  
  private final Ztjq Zq;
  
  private final String Zs;
  
  private final Zk97 Zr;
  
  private final Zr_4 ZG;
  
  private int Zb = -1;
  
  private final Zbnt ZI;
  
  private Zmyw ZS;
  
  private Ze01 Za;
  
  private Ze01 Zu;
  
  private Ze01 Zj;
  
  private Ze01 Zv;
  
  private Ze01 ZT;
  
  private Zbup ZQ;
  
  private static int ZR;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbax(Zz0n paramZz0n, Zt4u paramZt4u, Zskh paramZskh, Zli1 paramZli1, String paramString, Zk97 paramZk97, Zbnt paramZbnt, Zr_4 paramZr_4) {
    this(paramZz0n, paramZt4u, paramZskh, paramZli1, Ztjq.Zr, paramString, paramZk97, paramZbnt, paramZr_4);
  }
  
  Zbax(Zz0n paramZz0n, Zt4u paramZt4u, Zskh paramZskh, Zli1 paramZli1, Ztjq paramZtjq, String paramString, Zk97 paramZk97, Zbnt paramZbnt, Zr_4 paramZr_4) {
    this.Zx = paramZz0n;
    this.Zc = paramZt4u;
    this.Zd = paramZskh;
    this.ZF = paramZli1;
    this.Zq = paramZtjq;
    this.Zs = paramString;
    this.Zr = paramZk97;
    this.ZI = paramZbnt;
    this.ZG = paramZr_4;
    Zf();
    this.ZK = paramZli1.ZAJ();
    try {
      this.ZM = new Zbws(this.ZK);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.UNEXPECTED);
      this.ZM = ZB();
    } 
    this.ZM.Zk(this);
    this.ZQ.setViewportView(this.ZM);
    Zx();
  }
  
  private void Zx() {
    this.ZM.setName(a(6659, -14322));
    this.Za.setName(a(6668, -13325));
  }
  
  private Zbws ZB() {
    return new Zbws(new Zt_g(this));
  }
  
  void ZE(String paramString, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic Zt : ()I
    //   3: istore_3
    //   4: aload_1
    //   5: ifnull -> 92
    //   8: aload_0
    //   9: getfield ZG : Lburp/Zr_4;
    //   12: new burp/Zlkh
    //   15: dup
    //   16: iconst_1
    //   17: aload_1
    //   18: iload_2
    //   19: invokespecial <init> : (ZLjava/lang/String;Z)V
    //   22: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   27: checkcast burp/Zg55
    //   30: astore #4
    //   32: aload_0
    //   33: getfield Zb : I
    //   36: iconst_m1
    //   37: if_icmpne -> 77
    //   40: aload_0
    //   41: getfield Zq : Lburp/Ztjq;
    //   44: aload_0
    //   45: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   48: aload_0
    //   49: getfield ZF : Lburp/Zli1;
    //   52: invokeinterface ZAg : ()I
    //   57: invokeinterface ZX : (Ljava/awt/Window;I)V
    //   62: aload_0
    //   63: getfield ZF : Lburp/Zli1;
    //   66: aload #4
    //   68: invokeinterface ZZ : (Lburp/Zg55;)V
    //   73: iload_3
    //   74: ifeq -> 92
    //   77: aload_0
    //   78: getfield ZF : Lburp/Zli1;
    //   81: aload #4
    //   83: aload_0
    //   84: getfield Zb : I
    //   87: invokeinterface ZO : (Lburp/Zg55;I)V
    //   92: aload_0
    //   93: iconst_m1
    //   94: putfield Zb : I
    //   97: return
  }
  
  public Zk97 ZD() {
    return this.Zr;
  }
  
  private void Zf() {
    this.Za = new Ze01();
    this.Zu = new Ze01();
    this.ZT = new Ze01();
    this.Zv = new Ze01();
    this.ZS = new Zmyw();
    this.ZQ = new Zbup();
    this.Zj = new Ze01();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.Za.setText(a(6658, 30808));
    this.Za.setToolTipText(a(6665, 30986));
    this.Za.addActionListener(new Ze2g(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.Za, gridBagConstraints);
    this.Zu.setText(a(6671, 18784));
    this.Zu.setToolTipText(a(6663, -26818));
    this.Zu.addActionListener(new Zkuj(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.Zu, gridBagConstraints);
    this.ZT.setText(a(6667, -664));
    this.ZT.setToolTipText(a(6660, 5946));
    this.ZT.addActionListener(new Ztmf(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.ZT, gridBagConstraints);
    this.Zv.setText(a(6656, -10704));
    this.Zv.setToolTipText(a(6657, -24842));
    this.Zv.addActionListener(new Zeml(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.Zv, gridBagConstraints);
    this.ZS.setLeftComponent(this.ZQ);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 9;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZS, gridBagConstraints);
    this.Zj.setText(a(6664, 308));
    this.Zj.addActionListener(new Zt1u(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.Zj, gridBagConstraints);
  }
  
  private void ZN(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic ZM : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: getfield ZM : Lburp/Zbws;
    //   8: invokevirtual getSelectedRows : ()[I
    //   11: astore_3
    //   12: aload_3
    //   13: ifnull -> 21
    //   16: aload_3
    //   17: arraylength
    //   18: ifne -> 22
    //   21: return
    //   22: iconst_0
    //   23: istore #4
    //   25: iload #4
    //   27: aload_3
    //   28: arraylength
    //   29: if_icmpge -> 103
    //   32: aload_0
    //   33: getfield ZM : Lburp/Zbws;
    //   36: aload_3
    //   37: iload #4
    //   39: iaload
    //   40: iload #4
    //   42: isub
    //   43: invokevirtual convertRowIndexToModel : (I)I
    //   46: istore #5
    //   48: iload #5
    //   50: aload_0
    //   51: getfield Zb : I
    //   54: if_icmpne -> 66
    //   57: aload_0
    //   58: iconst_m1
    //   59: putfield Zb : I
    //   62: iload_2
    //   63: ifne -> 85
    //   66: iload #5
    //   68: aload_0
    //   69: getfield Zb : I
    //   72: if_icmpge -> 85
    //   75: aload_0
    //   76: dup
    //   77: getfield Zb : I
    //   80: iconst_1
    //   81: isub
    //   82: putfield Zb : I
    //   85: aload_0
    //   86: getfield ZF : Lburp/Zli1;
    //   89: iload #5
    //   91: invokeinterface Zl : (I)V
    //   96: iinc #4, 1
    //   99: iload_2
    //   100: ifne -> 25
    //   103: return
  }
  
  private void ZH(ActionEvent paramActionEvent) {
    int i = this.ZM.getSelectedRow();
    if (i == -1)
      return; 
    i = this.ZM.convertRowIndexToModel(i);
    this.Zb = i;
    Zg55 zg55 = this.ZF.Zs(this.Zb);
    Zrv0 zrv0 = new Zrv0(this, a(6662, -14526) + a(6662, -14526), zg55, this.Zx.ZD(), this.ZI);
    zrv0.setVisible(true);
  }
  
  private void ZR(ActionEvent paramActionEvent) {
    Zrv0 zrv0 = new Zrv0(this, a(6666, -27794) + a(6666, -27794), null, this.Zx.ZD(), this.ZI);
    zrv0.setVisible(true);
  }
  
  private void Zp(ActionEvent paramActionEvent) {
    Zm2.ZC(Zrrh.TARGET_SCOPE_SCOPE_RULE_PASTE_URL);
    String str = this.Zx.ZD().Zp();
    if (str == null || str.isEmpty())
      return; 
    Zm5t zm5t = new Zm5t(str, this.ZI);
    if (!zm5t.ZK()) {
      String str1 = String.format(a(6669, -26435), new Object[] { zm5t.ZW(), zm5t.ZB() ? a(6670, 23829) : "." });
      this.Zd.Zl(Zkqn.INFORMATION, str1);
      return;
    } 
    Zg55 zg55 = this.ZG.<Zg55>ZH(new Zlkh(true, zm5t.ZW(), false));
    this.Zq.ZX(Zt2m.ZF(this), this.ZF.ZAg());
    this.ZF.ZZ(zg55);
  }
  
  private void Zd(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: getstatic burp/Zrrh.TARGET_SCOPE_SCOPE_RULE_LOAD : Lburp/Zrrh;
    //   3: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   6: invokestatic Zt : ()I
    //   9: getstatic burp/Zg1m.CONFIG : Lburp/Zg1m;
    //   12: aload_0
    //   13: getfield Zc : Lburp/Zt4u;
    //   16: aload_0
    //   17: iconst_0
    //   18: invokestatic ZP : (Lburp/Zg1m;Lburp/Zmjm;Ljava/awt/Component;I)Ljava/io/File;
    //   21: astore_3
    //   22: istore_2
    //   23: aload_3
    //   24: ifnull -> 220
    //   27: aload_3
    //   28: aload_0
    //   29: getfield Zx : Lburp/Zz0n;
    //   32: invokeinterface ZM : ()Lnet/portswigger/Zl0;
    //   37: invokestatic ZJ : (Ljava/io/File;Lnet/portswigger/Zl0;)Ljava/util/List;
    //   40: astore #4
    //   42: aload #4
    //   44: invokeinterface iterator : ()Ljava/util/Iterator;
    //   49: astore #5
    //   51: aload #5
    //   53: invokeinterface hasNext : ()Z
    //   58: ifeq -> 207
    //   61: aload #5
    //   63: invokeinterface next : ()Ljava/lang/Object;
    //   68: checkcast java/lang/String
    //   71: astore #6
    //   73: aload #6
    //   75: invokevirtual isEmpty : ()Z
    //   78: ifeq -> 88
    //   81: goto -> 51
    //   84: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   87: athrow
    //   88: new burp/Zm5t
    //   91: dup
    //   92: aload #6
    //   94: aload_0
    //   95: getfield ZI : Lburp/Zbnt;
    //   98: invokespecial <init> : (Ljava/lang/String;Lburp/Zbnt;)V
    //   101: astore #7
    //   103: aload #7
    //   105: invokevirtual ZK : ()Z
    //   108: ifeq -> 176
    //   111: aload_0
    //   112: getfield ZG : Lburp/Zr_4;
    //   115: new burp/Zlkh
    //   118: dup
    //   119: iconst_1
    //   120: aload #7
    //   122: invokevirtual ZW : ()Ljava/lang/String;
    //   125: iconst_0
    //   126: invokespecial <init> : (ZLjava/lang/String;Z)V
    //   129: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   134: checkcast burp/Zg55
    //   137: astore #8
    //   139: aload_0
    //   140: getfield Zq : Lburp/Ztjq;
    //   143: aload_0
    //   144: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   147: aload_0
    //   148: getfield ZF : Lburp/Zli1;
    //   151: invokeinterface ZAg : ()I
    //   156: invokeinterface ZX : (Ljava/awt/Window;I)V
    //   161: aload_0
    //   162: getfield ZF : Lburp/Zli1;
    //   165: aload #8
    //   167: invokeinterface ZZ : (Lburp/Zg55;)V
    //   172: iload_2
    //   173: ifeq -> 203
    //   176: getstatic burp/Zmgc.PREFIX_INVALID_URL : Lburp/Zmgc;
    //   179: aload_0
    //   180: getfield Zd : Lburp/Zskh;
    //   183: iconst_1
    //   184: anewarray java/lang/Object
    //   187: dup
    //   188: iconst_0
    //   189: aload #6
    //   191: aastore
    //   192: invokevirtual ZK : (Lburp/Zskh;[Ljava/lang/Object;)Ljava/lang/String;
    //   195: pop
    //   196: goto -> 203
    //   199: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   202: athrow
    //   203: iload_2
    //   204: ifeq -> 51
    //   207: goto -> 220
    //   210: astore #4
    //   212: aload #4
    //   214: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   217: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   220: return
    // Exception table:
    //   from	to	target	type
    //   27	207	210	java/lang/Exception
    //   73	84	84	java/lang/Exception
    //   139	196	199	java/lang/Exception
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    this.Za.setEnabled(paramBoolean);
    this.Zu.setEnabled(paramBoolean);
    this.Zj.setEnabled(paramBoolean);
    this.ZT.setEnabled(paramBoolean);
    this.Zv.setEnabled(paramBoolean);
    this.ZM.setEnabled(paramBoolean);
  }
  
  public void Zv(MouseEvent paramMouseEvent, int paramInt1, int paramInt2) {
    if (paramInt2 != 0)
      return; 
    paramInt1 = this.ZM.convertRowIndexToModel(paramInt1);
    Zg55 zg55 = this.ZF.Zs(paramInt1);
    zg55.ZKe(!zg55.ZaS());
    this.ZK.fireTableCellUpdated(paramInt1, 0);
    this.ZF.ZC(null);
  }
  
  public static void ZV(int paramInt) {
    ZR = paramInt;
  }
  
  public static int ZM() {
    return ZR;
  }
  
  public static int Zt() {
    int i = ZM();
    return (i == 0) ? 116 : 0;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #15
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: bipush #62
    //   9: iconst_0
    //   10: istore_3
    //   11: invokestatic ZV : (I)V
    //   14: ldc 'FÃ`öD­^\\b2èäAêÅÑ#ç}÷Ýl(^Ûq2­7oHw'ð<j\\rúg$§H,ýØ>ÑyìÓG7_4,tÝ¿ÕÈ;èQ£þ.ÈG?W÷E©8i.í!ï¯\\t5Y³¥É-*èj.fª\\fMS+õµÓé2ÁD¥VeÒ,u8µîíKMÌ#udßªwiìiB&<Ö:è¾É;¿0Íy¯\\tå@88é).#WKOv`!FoÂüï`¦¸éy¶Hÿfë\\rÿçÔI¹=µÉ'
    //   16: dup
    //   17: astore_2
    //   18: invokevirtual length : ()I
    //   21: istore #4
    //   23: iconst_4
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: iconst_5
    //   28: iinc #0, 1
    //   31: aload_2
    //   32: iload_0
    //   33: dup
    //   34: iload_1
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 146
    //   43: aload #5
    //   45: swap
    //   46: iload_3
    //   47: iinc #3, 1
    //   50: swap
    //   51: aastore
    //   52: iload_0
    //   53: iload_1
    //   54: iadd
    //   55: dup
    //   56: istore_0
    //   57: iload #4
    //   59: if_icmpge -> 71
    //   62: aload_2
    //   63: iload_0
    //   64: invokevirtual charAt : (I)C
    //   67: istore_1
    //   68: goto -> 27
    //   71: ldc ' ö³Í<)xÑ"³)ãªøv°ìöÈ0ÿZ)o'¥»v°$a£ÛF@¬'
    //   73: dup
    //   74: astore_2
    //   75: invokevirtual length : ()I
    //   78: istore #4
    //   80: bipush #22
    //   82: istore_1
    //   83: iconst_m1
    //   84: istore_0
    //   85: bipush #127
    //   87: iinc #0, 1
    //   90: aload_2
    //   91: iload_0
    //   92: dup
    //   93: iload_1
    //   94: iadd
    //   95: invokevirtual substring : (II)Ljava/lang/String;
    //   98: iconst_0
    //   99: goto -> 146
    //   102: aload #5
    //   104: swap
    //   105: iload_3
    //   106: iinc #3, 1
    //   109: swap
    //   110: aastore
    //   111: iload_0
    //   112: iload_1
    //   113: iadd
    //   114: dup
    //   115: istore_0
    //   116: iload #4
    //   118: if_icmpge -> 130
    //   121: aload_2
    //   122: iload_0
    //   123: invokevirtual charAt : (I)C
    //   126: istore_1
    //   127: goto -> 85
    //   130: aload #5
    //   132: putstatic burp/Zbax.a : [Ljava/lang/String;
    //   135: bipush #15
    //   137: anewarray java/lang/String
    //   140: putstatic burp/Zbax.b : [Ljava/lang/String;
    //   143: goto -> 304
    //   146: dup_x2
    //   147: pop
    //   148: invokevirtual toCharArray : ()[C
    //   151: dup_x1
    //   152: arraylength
    //   153: dup_x2
    //   154: pop
    //   155: iconst_0
    //   156: istore #6
    //   158: dup2_x1
    //   159: pop2
    //   160: dup_x2
    //   161: iconst_1
    //   162: if_icmpgt -> 264
    //   165: dup2
    //   166: swap
    //   167: iload #6
    //   169: dup2_x1
    //   170: caload
    //   171: swap
    //   172: iload #6
    //   174: bipush #7
    //   176: irem
    //   177: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #126
    //   218: goto -> 248
    //   221: bipush #80
    //   223: goto -> 248
    //   226: bipush #108
    //   228: goto -> 248
    //   231: bipush #21
    //   233: goto -> 248
    //   236: bipush #51
    //   238: goto -> 248
    //   241: bipush #44
    //   243: goto -> 248
    //   246: bipush #69
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 169
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 165
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 43, 0 -> 102
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x1A0A) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      char c = 'í';
      int j = (paramInt2 & 0xFF) - c;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - c;
      if (k < 0)
        k += 256; 
      for (byte b = 0; b < arrayOfChar.length; b++) {
        int m = b % 2;
        if (m == 0) {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b]) & 0xFF;
        } else {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbax.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */