package burp;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zbba extends Zbbv {
  private Zr4o ZC;
  
  private Zm99 Za;
  
  private Zm99 Zh;
  
  private ButtonGroup ZU;
  
  private ButtonGroup Zq;
  
  private Zl8w ZW;
  
  private Zm99 ZE;
  
  private Zbqc Zy;
  
  private Zbqc ZA;
  
  private Zmg2 Zx;
  
  private Zmg2 Zc;
  
  private Zmg2 Zr;
  
  private Zmg2 Zl;
  
  public Zgff ZK;
  
  public Zgff ZM;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbba(Zz0n paramZz0n, Zt4u paramZt4u, Zbyw paramZbyw, Zr_4 paramZr_4, boolean paramBoolean) {
    super(paramZz0n, paramZt4u, paramZbyw, a(-12436, 8897), paramZr_4, false);
    this.Zg = this.ZC = paramZr_4.<Zgpi>ZH(new Zro9(paramZbyw.ZP().ZM(), this.ZN.ZK()));
    Zg();
    this.ZA.add(this.ZN, a(-12433, -31612));
    if (paramBoolean) {
      this.Zx.setEnabled(false);
      this.Zc.setEnabled(false);
      this.Zr.setEnabled(false);
      this.Zl.setEnabled(false);
      this.ZK.setEnabled(false);
      this.ZM.setEnabled(false);
    } 
  }
  
  private void Zg() {
    this.ZU = new ButtonGroup();
    this.Zq = new ButtonGroup();
    this.Zc = new Zmg2();
    this.Zx = new Zmg2();
    this.Zr = new Zmg2();
    this.ZE = new Zm99();
    this.ZM = new Zgff();
    this.ZA = new Zbqc();
    this.ZW = new Zl8w();
    this.Za = new Zm99();
    this.Zh = new Zm99();
    this.Zy = new Zbqc();
    this.Zl = new Zmg2();
    this.ZK = new Zgff();
    GridBagLayout gridBagLayout1 = new GridBagLayout();
    gridBagLayout1.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout1.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0 };
    setLayout(gridBagLayout1);
    this.Zq.add(this.Zc);
    this.Zc.setText(a(-12446, 5623));
    this.Zc.addActionListener(new Zgm8(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1280;
    add(this.Zc, gridBagConstraints);
    this.Zq.add(this.Zx);
    this.Zx.setSelected(true);
    this.Zx.setText(a(-12440, -15546));
    this.Zx.addActionListener(new Zr55(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(0, 0, 10, 0);
    add(this.Zx, gridBagConstraints);
    this.ZU.add(this.Zr);
    this.Zr.setSelected(true);
    this.Zr.setText(a(-12447, -15177));
    this.Zr.addActionListener(new Zlpq(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1280;
    add(this.Zr, gridBagConstraints);
    this.ZE.setText(a(-12445, 24871));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.anchor = 1280;
    add(this.ZE, gridBagConstraints);
    this.ZM.setColumns(5);
    this.ZM.setText("8");
    this.ZM.ZH(Zlw9.NUMBER);
    this.ZM.addKeyListener(new Zlnt(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.anchor = 1280;
    add(this.ZM, gridBagConstraints);
    this.ZA.setLayout(new BorderLayout());
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(15, 0, 0, 0);
    add(this.ZA, gridBagConstraints);
    this.ZW.setText(a(-12434, 24176));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZW, gridBagConstraints);
    this.Za.setText(a(-12435, 2050));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1280;
    add(this.Za, gridBagConstraints);
    this.Zh.setText(a(-12438, 4970));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1280;
    add(this.Zh, gridBagConstraints);
    GridBagLayout gridBagLayout2 = new GridBagLayout();
    gridBagLayout2.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout2.rowHeights = new int[] { 0 };
    this.Zy.setLayout(gridBagLayout2);
    this.ZU.add(this.Zl);
    this.Zl.setText(a(-12448, -20289));
    this.Zl.addActionListener(new Zrjm(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    this.Zy.add(this.Zl, gridBagConstraints);
    this.ZK.setColumns(20);
    this.ZK.addKeyListener(new Zk2v(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 1280;
    this.Zy.add(this.ZK, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(0, 0, 10, 0);
    add(this.Zy, gridBagConstraints);
  }
  
  private void Zr(ActionEvent paramActionEvent) {
    ZD((KeyEvent)null);
  }
  
  private void ZD(KeyEvent paramKeyEvent) {
    this.Zl.setSelected(true);
    String str = this.ZK.getText();
    this.ZC.ZBr(str);
    this.Zw.Z_(this.ZC.Zyv(), true);
  }
  
  private void Zt(ActionEvent paramActionEvent) {
    this.ZC.ZDX(false);
    this.Zw.Z_(this.Zg.Zyv(), true);
  }
  
  private void ZS(ActionEvent paramActionEvent) {
    this.ZC.ZDX(true);
    this.Zw.Z_(this.Zg.Zyv(), true);
  }
  
  private void ZO(ActionEvent paramActionEvent) {
    this.ZC.ZBr((String)null);
    this.Zw.Z_(-1, true);
  }
  
  private void Zz(KeyEvent paramKeyEvent) {
    int i = 0;
    try {
      i = Integer.parseInt(this.ZM.getText());
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.IGNORED);
    } 
    this.ZC.ZWd(i);
    this.Zw.Z_(this.Zg.Zyv(), true);
  }
  
  public void ZB() {
    this.Zw.Z_(this.Zg.Zyv(), true);
  }
  
  public void Zd(Zmjc paramZmjc, int paramInt) {
    paramZmjc.Zt(a(-12437, 12446) + a(-12437, 12446), this.ZK.getText());
    paramZmjc.Zt(a(-12439, 11488) + a(-12439, 11488), this.ZM.getText());
  }
  
  public void ZE(Ze9k paramZe9k, Zsh8 paramZsh8, int paramInt) {
    // Byte code:
    //   0: invokestatic ZS : ()[Ljava/lang/String;
    //   3: astore #4
    //   5: aload_1
    //   6: invokeinterface Zyi : ()Lburp/Zzvm;
    //   11: astore #5
    //   13: aload_1
    //   14: invokeinterface Zyi : ()Lburp/Zzvm;
    //   19: aload_0
    //   20: getfield Zg : Lburp/Ze9k;
    //   23: invokeinterface Zyi : ()Lburp/Zzvm;
    //   28: if_acmpne -> 39
    //   31: iconst_1
    //   32: goto -> 40
    //   35: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   38: athrow
    //   39: iconst_0
    //   40: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   43: aload #5
    //   45: getfield id : B
    //   48: i2l
    //   49: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   52: aload_0
    //   53: aload_0
    //   54: aload_1
    //   55: checkcast burp/Zr4o
    //   58: dup_x1
    //   59: putfield ZC : Lburp/Zr4o;
    //   62: putfield Zg : Lburp/Ze9k;
    //   65: aload_0
    //   66: getfield ZN : Lburp/Zbys;
    //   69: aload_0
    //   70: getfield ZC : Lburp/Zr4o;
    //   73: invokeinterface ZFB : ()Lburp/Zefg;
    //   78: invokevirtual Zm : (Lburp/Zefg;)V
    //   81: aload_0
    //   82: getfield ZK : Lburp/Zgff;
    //   85: aload_2
    //   86: iload_3
    //   87: sipush #-12442
    //   90: sipush #-31026
    //   93: invokestatic a : (II)Ljava/lang/String;
    //   96: swap
    //   97: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
    //   102: invokeinterface ZMm : (Ljava/lang/String;)Ljava/lang/String;
    //   107: invokevirtual setText : (Ljava/lang/String;)V
    //   110: aload_0
    //   111: getfield ZM : Lburp/Zgff;
    //   114: aload_2
    //   115: iload_3
    //   116: sipush #-12441
    //   119: sipush #4682
    //   122: invokestatic a : (II)Ljava/lang/String;
    //   125: swap
    //   126: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
    //   131: invokeinterface ZMm : (Ljava/lang/String;)Ljava/lang/String;
    //   136: invokevirtual setText : (Ljava/lang/String;)V
    //   139: aload_0
    //   140: getfield ZC : Lburp/Zr4o;
    //   143: invokeinterface ZFo : ()Ljava/lang/String;
    //   148: ifnonnull -> 171
    //   151: aload_0
    //   152: getfield Zr : Lburp/Zmg2;
    //   155: iconst_1
    //   156: invokevirtual setSelected : (Z)V
    //   159: aload #4
    //   161: ifnonnull -> 186
    //   164: goto -> 171
    //   167: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   170: athrow
    //   171: aload_0
    //   172: getfield Zl : Lburp/Zmg2;
    //   175: iconst_1
    //   176: invokevirtual setSelected : (Z)V
    //   179: goto -> 186
    //   182: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   185: athrow
    //   186: aload_0
    //   187: getfield ZC : Lburp/Zr4o;
    //   190: invokeinterface ZFW : ()Z
    //   195: ifeq -> 218
    //   198: aload_0
    //   199: getfield Zx : Lburp/Zmg2;
    //   202: iconst_1
    //   203: invokevirtual setSelected : (Z)V
    //   206: aload #4
    //   208: ifnonnull -> 233
    //   211: goto -> 218
    //   214: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   217: athrow
    //   218: aload_0
    //   219: getfield Zc : Lburp/Zmg2;
    //   222: iconst_1
    //   223: invokevirtual setSelected : (Z)V
    //   226: goto -> 233
    //   229: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   232: athrow
    //   233: return
    // Exception table:
    //   from	to	target	type
    //   13	35	35	java/lang/NumberFormatException
    //   40	164	167	java/lang/NumberFormatException
    //   151	179	182	java/lang/NumberFormatException
    //   186	211	214	java/lang/NumberFormatException
    //   198	226	229	java/lang/NumberFormatException
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ';°g9·¹Åi½}ÉtøÆþ³Ï³¾\\rª.6´~û½s²ýÍå[÷DB@"lÿŖ©~G­péËø9ÿßãJÜ|Knèè Ó®¸ëp0ÚÔ¤À¼¦éýG\\f/Ð-c÷x§ª¶îÎ$Yz JZdýÆ\\bCse)Y}õÏ[;âzÀ\\b,&Mív¸6DñüXè©c;½\\ti­´e»gµ¦ORä=ËB'õÃv6M¬Û*"+ch-ÞglÖTîÂ=&ì¼1¡Æ%&ò\\rÁym/ôØ]¡Ð,bÆ¸57ì¢t3­¢Xý¾FáiJá´¯A×T7ªp¢tAÕ~@Ü¶\úà0ÅE*ÛÒÃòEþÓf åY°e§ÞìL0¥ï1ëçîýW¢§Ù%kE%ì HAgÔë©Ð°Ç×÷R7Ý¾õ|'ÄÌÞ¶°\\tUÅu\\b?Ûkâ½z\\r@å#\\f+ ¹ÜÚ0{r'_ÒÙÛ.½ÂõahO)R¤ÙÇoN½c)Kw\\ny8á3½ÅãÈ¥»C\\r}íì´1 û£euAJF\\rMäÑa!0àé^Òq¯v,b§¶Ê¸-CKÝºÙ\¼5±$ÀY¾×zßÏ{i+ª?üÛxXÊ3c¦Nâh§ìË¥>Y;'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #24
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #99
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
    //   68: ldc 'À['
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_2
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #22
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
    //   128: putstatic burp/Zbba.a : [Ljava/lang/String;
    //   131: bipush #14
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbba.b : [Ljava/lang/String;
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
    //   212: bipush #12
    //   214: goto -> 244
    //   217: bipush #7
    //   219: goto -> 244
    //   222: bipush #114
    //   224: goto -> 244
    //   227: bipush #47
    //   229: goto -> 244
    //   232: bipush #71
    //   234: goto -> 244
    //   237: bipush #127
    //   239: goto -> 244
    //   242: bipush #103
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
    int i = (paramInt1 ^ 0xFFFFCF6A) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbba.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */