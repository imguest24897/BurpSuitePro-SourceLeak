package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class Zbe0 extends Zbv5 implements ActionListener, Zky2 {
  private final Zm1n Zc;
  
  private final Zbnt ZI;
  
  private final Zr_4 ZS;
  
  private final Zt_l ZW;
  
  private final Zbws ZH;
  
  private final Zkj9 Zy;
  
  private final Zepe ZY;
  
  private final Zepe Zw;
  
  private final Zepe ZB;
  
  private final Zepe Zq;
  
  private final Zepe Zt;
  
  private final Zepe Zo;
  
  private final Zepe ZL;
  
  private final Zepe Zi;
  
  private final Zgqd ZF;
  
  private Zm2o Zv;
  
  private Zmyw Zn;
  
  private Ze01 ZN;
  
  private Ze01 ZG;
  
  private Ze01 Zg;
  
  private Ze01 Zu;
  
  private Ze01 Zl;
  
  private Zl8w ZK;
  
  private Zbkc Zb;
  
  private Zbup ZU;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbe0(Zm1n paramZm1n, Zz0n paramZz0n, Zt4u paramZt4u, Zerg paramZerg, Zgb6 paramZgb6, Zbnt paramZbnt, Zxzh paramZxzh, Ztwv paramZtwv, Zr_4 paramZr_4, Ztyg paramZtyg, Zgq7 paramZgq7, Zlr9 paramZlr9, Ze4m paramZe4m, Zey9 paramZey9) {
    this.Zc = paramZm1n;
    this.ZI = paramZbnt;
    this.ZS = paramZr_4;
    this.ZF = new Zgqd(paramZxzh, paramZz0n, paramZt4u, paramZerg, paramZgb6, paramZbnt, paramZtwv, paramZr_4, paramZtyg, paramZgq7, paramZlr9, paramZe4m, paramZey9);
    ZS();
    this.Zu.setName(a(28740, 28306));
    this.ZW = new Zt_l(paramZm1n.ZA());
    this.ZH = new Zbws(this.ZW);
    this.ZH.Zk(this);
    this.ZU.setViewportView(this.ZH);
    this.ZU.Zy(this.ZH);
    this.Zy = new Zkj9();
    this.Zw = ZJ(Zlf9.ACTION_USE_COOKIES.description);
    this.ZY = ZJ(Zlf9.ACTION_SET_PARAM.description);
    this.Zt = ZJ(Zlf9.ACTION_VALIDATE_SESSION.description);
    this.Zq = ZJ(Zlf9.ACTION_PROMPT_FOR_BROWSER_RECOVERY.description);
    this.ZB = ZJ(Zlf9.ACTION_RUN_MACRO.description);
    this.Zo = ZJ(Zlf9.ACTION_RUN_POST_REQUEST_MACRO.description);
    this.ZL = ZJ(Zlf9.ACTION_INVOKE_BURP_EXTENSION.description);
    this.Zi = ZJ(Zlf9.ACTION_SET_HEADER.description);
  }
  
  private Zepe ZJ(String paramString) {
    Zepe zepe = new Zepe(paramString);
    zepe.addActionListener(this);
    this.Zy.add(zepe);
    return zepe;
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic ZI : ()Z
    //   3: istore_2
    //   4: aload_1
    //   5: invokevirtual getSource : ()Ljava/lang/Object;
    //   8: astore_3
    //   9: aload_3
    //   10: aload_0
    //   11: getfield Zw : Lburp/Zepe;
    //   14: if_acmpne -> 36
    //   17: aload_0
    //   18: new burp/Zs1b
    //   21: dup
    //   22: aload_0
    //   23: getfield ZS : Lburp/Zr_4;
    //   26: invokespecial <init> : (Lburp/Zr_4;)V
    //   29: invokevirtual Zu : (Lburp/Zb81;)V
    //   32: iload_2
    //   33: ifne -> 233
    //   36: aload_3
    //   37: aload_0
    //   38: getfield ZY : Lburp/Zepe;
    //   41: if_acmpne -> 63
    //   44: aload_0
    //   45: new burp/Zs1m
    //   48: dup
    //   49: aload_0
    //   50: getfield ZS : Lburp/Zr_4;
    //   53: invokespecial <init> : (Lburp/Zr_4;)V
    //   56: invokevirtual Zu : (Lburp/Zb81;)V
    //   59: iload_2
    //   60: ifne -> 233
    //   63: aload_3
    //   64: aload_0
    //   65: getfield Zq : Lburp/Zepe;
    //   68: if_acmpne -> 90
    //   71: aload_0
    //   72: new burp/Zs1q
    //   75: dup
    //   76: aload_0
    //   77: getfield ZS : Lburp/Zr_4;
    //   80: invokespecial <init> : (Lburp/Zr_4;)V
    //   83: invokevirtual Zu : (Lburp/Zb81;)V
    //   86: iload_2
    //   87: ifne -> 233
    //   90: aload_3
    //   91: aload_0
    //   92: getfield ZB : Lburp/Zepe;
    //   95: if_acmpne -> 121
    //   98: aload_0
    //   99: new burp/Zs1h
    //   102: dup
    //   103: aload_0
    //   104: getfield ZS : Lburp/Zr_4;
    //   107: aload_0
    //   108: getfield ZI : Lburp/Zbnt;
    //   111: invokespecial <init> : (Lburp/Zr_4;Lburp/Zbnt;)V
    //   114: invokevirtual Zu : (Lburp/Zb81;)V
    //   117: iload_2
    //   118: ifne -> 233
    //   121: aload_3
    //   122: aload_0
    //   123: getfield Zt : Lburp/Zepe;
    //   126: if_acmpne -> 152
    //   129: aload_0
    //   130: new burp/Zs1e
    //   133: dup
    //   134: aload_0
    //   135: getfield ZS : Lburp/Zr_4;
    //   138: aload_0
    //   139: getfield ZI : Lburp/Zbnt;
    //   142: invokespecial <init> : (Lburp/Zr_4;Lburp/Zbnt;)V
    //   145: invokevirtual Zu : (Lburp/Zb81;)V
    //   148: iload_2
    //   149: ifne -> 233
    //   152: aload_3
    //   153: aload_0
    //   154: getfield Zo : Lburp/Zepe;
    //   157: if_acmpne -> 183
    //   160: aload_0
    //   161: new burp/Zs17
    //   164: dup
    //   165: aload_0
    //   166: getfield ZS : Lburp/Zr_4;
    //   169: aload_0
    //   170: getfield ZI : Lburp/Zbnt;
    //   173: invokespecial <init> : (Lburp/Zr_4;Lburp/Zbnt;)V
    //   176: invokevirtual Zu : (Lburp/Zb81;)V
    //   179: iload_2
    //   180: ifne -> 233
    //   183: aload_3
    //   184: aload_0
    //   185: getfield ZL : Lburp/Zepe;
    //   188: if_acmpne -> 210
    //   191: aload_0
    //   192: new burp/Zs12
    //   195: dup
    //   196: aload_0
    //   197: getfield ZS : Lburp/Zr_4;
    //   200: invokespecial <init> : (Lburp/Zr_4;)V
    //   203: invokevirtual Zu : (Lburp/Zb81;)V
    //   206: iload_2
    //   207: ifne -> 233
    //   210: aload_3
    //   211: aload_0
    //   212: getfield Zi : Lburp/Zepe;
    //   215: if_acmpne -> 233
    //   218: aload_0
    //   219: new burp/Zs1v
    //   222: dup
    //   223: aload_0
    //   224: getfield ZS : Lburp/Zr_4;
    //   227: invokespecial <init> : (Lburp/Zr_4;)V
    //   230: invokevirtual Zu : (Lburp/Zb81;)V
    //   233: return
  }
  
  private void Zu(Zb81 paramZb81) {
    boolean bool = Zlf9.Zr();
    if (paramZb81.ZX()) {
      Zr7q zr7q = new Zr7q(this.ZW, paramZb81, true, Zt2m.ZF(this), this.Zc.Zq(), this.ZF);
      zr7q.setVisible(true);
      if (bool) {
        this.ZW.Zx(paramZb81);
        return;
      } 
      return;
    } 
    this.ZW.Zx(paramZb81);
  }
  
  private void ZS() {
    this.Zu = new Ze01();
    this.ZN = new Ze01();
    this.Zl = new Ze01();
    this.Zg = new Ze01();
    this.ZG = new Ze01();
    this.ZK = new Zl8w();
    this.Zb = new Zbkc();
    this.Zn = new Zmyw();
    this.ZU = new Zbup();
    this.Zv = new Zm2o();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0 };
    setLayout(gridBagLayout);
    this.Zu.setText(a(28737, -20071));
    this.Zu.setToolTipText(a(28742, 30471));
    this.Zu.addActionListener(new Zsyd(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.Zu, gridBagConstraints);
    this.ZN.setText(a(28748, 13609));
    this.ZN.setToolTipText(a(28766, -26205));
    this.ZN.addActionListener(new Zrwx(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.ZN, gridBagConstraints);
    this.Zl.setText(a(28744, 8673));
    this.Zl.setToolTipText(a(28743, -10791));
    this.Zl.addActionListener(new Zgdv(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.Zl, gridBagConstraints);
    this.Zg.setText(a(28741, 30849));
    this.Zg.setToolTipText(a(28751, -14078));
    this.Zg.addActionListener(new Zl_s(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.Zg, gridBagConstraints);
    this.ZG.setText(a(28738, -28330));
    this.ZG.setToolTipText(a(28739, -13597));
    this.ZG.addActionListener(new Zl_8(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.ZG, gridBagConstraints);
    this.ZK.setText(a(28747, 12539));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZK, gridBagConstraints);
    this.Zb.Zx(a(28750, 30778));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 21;
    add(this.Zb, gridBagConstraints);
    this.Zn.setLeftComponent(this.ZU);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridheight = 9;
    gridBagConstraints.fill = 1;
    add(this.Zn, gridBagConstraints);
    this.Zv.Zi(Zk97.DESKTOP_OPTIONS_SESSIONS_RULE_EDITOR_RULE_ACTIONS);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.anchor = 23;
    add(this.Zv, gridBagConstraints);
  }
  
  private void Zq(ActionEvent paramActionEvent) {
    int i = this.ZH.getSelectedRow();
    if (i == -1 || i == this.ZH.getRowCount() - 1)
      return; 
    this.ZW.Zq(i);
    this.ZH.getSelectionModel().setSelectionInterval(i + 1, i + 1);
  }
  
  private void Zo(ActionEvent paramActionEvent) {
    int i = this.ZH.getSelectedRow();
    if (i < 1)
      return; 
    this.ZW.Zq(i - 1);
    this.ZH.getSelectionModel().setSelectionInterval(i - 1, i - 1);
  }
  
  private void Zu(ActionEvent paramActionEvent) {
    int i = this.ZH.getSelectedRow();
    if (i == -1)
      return; 
    if (0 != Zx6o.Zc(Zt2m.ZF(this), a(28746, -30466), a(28736, 22262), new String[] { a(28749, 13223), a(28745, 5460) }1))
      return; 
    this.ZW.ZG(i);
    if (i >= this.ZH.getRowCount())
      i--; 
    if (i >= 0 && i < this.ZH.getRowCount())
      this.ZH.getSelectionModel().setSelectionInterval(i, i); 
  }
  
  private void ZS(ActionEvent paramActionEvent) {
    int i = this.ZH.getSelectedRow();
    if (i == -1)
      return; 
    Zb81 zb81 = this.ZW.ZD(i);
    Zr7q zr7q = new Zr7q(this.ZW, zb81, false, Zt2m.ZF(this), this.Zc.Zq(), this.ZF);
    zr7q.setVisible(true);
  }
  
  private void ZU(ActionEvent paramActionEvent) {
    this.Zy.show(this.Zu, 0, this.Zu.getHeight());
  }
  
  public void Zv(MouseEvent paramMouseEvent, int paramInt1, int paramInt2) {
    if (paramInt2 != 0)
      return; 
    Zb81 zb81 = this.ZW.ZD(paramInt1);
    zb81.Zr(!zb81.Zj());
    this.ZW.fireTableCellUpdated(paramInt1, 0);
  }
  
  static {
    // Byte code:
    //   0: bipush #17
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'aº8ªLRÙ=öjHªyUô¨ã$EÉç.£à\\b¼ñ#KÂ>ëaGJWü\\tçN[ÊbWÓÑ#ð·²rol9-ÎÑè=}m!Ì«\\n¡¯ÔD¥[ZÊñ3ÒÄ£ÆmaJú¹QÜD¥ÌéÍ¡i¯E+/.ÐËºÑ;Hº¯&ªk2ëu<$í5I^,%&?ÏøÅ£Ï2\\nÑ °ß`®Vw. \\bKËmÁÃM"Øáaº½è>Ü4ùþ-Ã6úgV?ªk¿?¿Nqf¬IÌ"\2â/ºKñ$qqWRä÷/JïTQ)%,Z¾°[¾Ý\AªpZbô¯ÿ4V»ÕþyÚPÚ¥]@°×úº­'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #12
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #63
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc '\1?ÔÍ~áÙ&yÎ_ð°öð?>'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_3
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #12
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/Zbe0.a : [Ljava/lang/String;
    //   131: bipush #17
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbe0.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #56
    //   214: goto -> 244
    //   217: bipush #51
    //   219: goto -> 244
    //   222: bipush #61
    //   224: goto -> 244
    //   227: bipush #89
    //   229: goto -> 244
    //   232: bipush #67
    //   234: goto -> 244
    //   237: bipush #16
    //   239: goto -> 244
    //   242: bipush #37
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x704E) & 0xFFFF;
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
      byte b1 = 39;
      int j = (paramInt2 & 0xFF) - b1;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - b1;
      if (k < 0)
        k += 256; 
      for (byte b2 = 0; b2 < arrayOfChar.length; b2++) {
        int m = b2 % 2;
        if (m == 0) {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b2]) & 0xFF;
        } else {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b2]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbe0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */