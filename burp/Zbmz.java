package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.function.Consumer;

public class Zbmz extends Zbv5 implements Zsnh {
  private final Zrmh ZM;
  
  private final boolean ZT;
  
  private final Consumer<Boolean> Zh;
  
  private Zm99 Zf;
  
  private Zm99 ZO;
  
  private Zm9t Zg;
  
  private Zzdy ZD;
  
  private Zedd Zk;
  
  private Zl8w ZB;
  
  private Zm9v ZK;
  
  private Zl8w Zs;
  
  private Zbkc ZV;
  
  private Zg85 ZC;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbmz(Zrmh paramZrmh, boolean paramBoolean, Consumer<Boolean> paramConsumer) {
    this.ZM = paramZrmh;
    this.ZT = paramBoolean;
    this.Zh = paramConsumer;
    ZDR();
    ZDZ();
    this.Zg.Zv(Ze3m.ZC(Zeuf.SETTINGS, Zlkk.ACTION_NORMAL).ZU(Zmcx.LARGE_LINE_SIZE).ZG(Zlkk.ACTION_HOVER).Z_(), a(21081, 6212), this::ZD3);
  }
  
  private void ZDZ() {
    Zbq0[] arrayOfZbq0 = Zbq0.values();
    int j = arrayOfZbq0.length;
    int i = Zbmj.Zca();
    byte b = 0;
    while (b < j) {
      Zbq0 zbq0 = arrayOfZbq0[b];
      this.Zk.addItem(zbq0.name);
      b++;
      if (i != 0)
        break; 
    } 
  }
  
  public String ZZ() {
    return this.ZV.Zr();
  }
  
  public Zk97 ZR() {
    return Zk97.DESKTOP_SCANNING_CRAWL_OPTIONS_CRAWL_OPTIMIZATION;
  }
  
  public String Zq() {
    return a(21085, -5274);
  }
  
  public Zmf_ Zn() {
    Zzkm zzkm = new Zzkm();
    this.ZM.Zl(zzkm);
    return zzkm.ZV(new String[] { a(21086, -25240) });
  }
  
  public String ZE() {
    return a(21084, 14561);
  }
  
  public void Zt2() {
    try {
      this.ZC.setText(String.valueOf(this.ZM.Zz7()));
      this.Zk.setSelectedItem((this.ZM.Zzz()).name);
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    this.Zk.setEnabled(!this.ZM.ZzA());
    this.Zs.setText((this.ZM.Zzz()).description);
    this.ZD.setSelected(this.ZM.Zzf());
    ZDJ();
  }
  
  private int ZDJ() {
    // Byte code:
    //   0: invokestatic Zca : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield ZC : Lburp/Zg85;
    //   8: invokevirtual getText : ()Ljava/lang/String;
    //   11: invokestatic parseInt : (Ljava/lang/String;)I
    //   14: istore_2
    //   15: iload_2
    //   16: iflt -> 32
    //   19: iload_2
    //   20: bipush #30
    //   22: if_icmple -> 66
    //   25: goto -> 32
    //   28: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   31: athrow
    //   32: aload_0
    //   33: getfield ZK : Lburp/Zm9v;
    //   36: sipush #21082
    //   39: sipush #-8584
    //   42: invokestatic a : (II)Ljava/lang/String;
    //   45: invokevirtual setText : (Ljava/lang/String;)V
    //   48: aload_0
    //   49: getfield ZK : Lburp/Zm9v;
    //   52: iconst_1
    //   53: invokevirtual setVisible : (Z)V
    //   56: aload_0
    //   57: getfield ZM : Lburp/Zrmh;
    //   60: invokeinterface Zz7 : ()I
    //   65: ireturn
    //   66: iload_2
    //   67: ifne -> 105
    //   70: aload_0
    //   71: getfield ZK : Lburp/Zm9v;
    //   74: sipush #21075
    //   77: sipush #-26469
    //   80: invokestatic a : (II)Ljava/lang/String;
    //   83: invokevirtual setText : (Ljava/lang/String;)V
    //   86: aload_0
    //   87: getfield ZK : Lburp/Zm9v;
    //   90: iconst_1
    //   91: invokevirtual setVisible : (Z)V
    //   94: iload_1
    //   95: ifeq -> 168
    //   98: goto -> 105
    //   101: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   104: athrow
    //   105: iload_2
    //   106: bipush #10
    //   108: if_icmple -> 153
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   117: athrow
    //   118: aload_0
    //   119: getfield ZK : Lburp/Zm9v;
    //   122: sipush #21077
    //   125: sipush #23262
    //   128: invokestatic a : (II)Ljava/lang/String;
    //   131: invokevirtual setText : (Ljava/lang/String;)V
    //   134: aload_0
    //   135: getfield ZK : Lburp/Zm9v;
    //   138: iconst_1
    //   139: invokevirtual setVisible : (Z)V
    //   142: iload_1
    //   143: ifeq -> 168
    //   146: goto -> 153
    //   149: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   152: athrow
    //   153: aload_0
    //   154: getfield ZK : Lburp/Zm9v;
    //   157: iconst_0
    //   158: invokevirtual setVisible : (Z)V
    //   161: goto -> 168
    //   164: invokestatic a : (Ljava/lang/NumberFormatException;)Ljava/lang/NumberFormatException;
    //   167: athrow
    //   168: iload_2
    //   169: ireturn
    //   170: astore_2
    //   171: aload_2
    //   172: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   175: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   178: aload_0
    //   179: getfield ZK : Lburp/Zm9v;
    //   182: sipush #21073
    //   185: sipush #-29196
    //   188: invokestatic a : (II)Ljava/lang/String;
    //   191: invokevirtual setText : (Ljava/lang/String;)V
    //   194: aload_0
    //   195: getfield ZK : Lburp/Zm9v;
    //   198: iconst_1
    //   199: invokevirtual setVisible : (Z)V
    //   202: aload_0
    //   203: getfield ZM : Lburp/Zrmh;
    //   206: invokeinterface Zz7 : ()I
    //   211: ireturn
    // Exception table:
    //   from	to	target	type
    //   4	65	170	java/lang/NumberFormatException
    //   15	25	28	java/lang/NumberFormatException
    //   66	98	101	java/lang/NumberFormatException
    //   66	169	170	java/lang/NumberFormatException
    //   70	111	114	java/lang/NumberFormatException
    //   105	146	149	java/lang/NumberFormatException
    //   118	161	164	java/lang/NumberFormatException
  }
  
  private Zbq0 Zt() {
    String str = (String)this.Zk.getSelectedItem();
    Zbq0 zbq0 = Zbq0.Zd(str);
    if (zbq0 == null)
      zbq0 = Zbq0.NORMAL; 
    return zbq0;
  }
  
  private void ZD3() {
    Zrhe zrhe = new Zrhe(Zt2m.ZF(this), this.ZM, this.ZT);
    try {
      zrhe.setVisible(true);
      if (zrhe.ZY()) {
        try {
        
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        } 
        this.Zk.setEnabled(!this.ZM.ZzA());
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
  }
  
  private void ZDR() {
    this.ZV = new Zbkc();
    this.ZB = new Zl8w();
    this.Zf = new Zm99();
    this.ZC = new Zg85();
    this.ZK = new Zm9v();
    this.ZO = new Zm99();
    this.Zk = new Zedd();
    this.Zg = new Zm9t();
    this.Zs = new Zl8w();
    this.ZD = new Zzdy();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0 };
    setLayout(gridBagLayout);
    this.ZV.Zx(a(21074, 1662));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 21;
    add(this.ZV, gridBagConstraints);
    this.ZB.setText(a(21083, 28100));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZB, gridBagConstraints);
    this.Zf.setText(a(21072, -18097));
    this.Zf.setHorizontalTextPosition(10);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1280;
    add(this.Zf, gridBagConstraints);
    this.ZC.setColumns(4);
    this.ZC.addKeyListener(new Ztjz(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1280;
    add(this.ZC, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    add(this.ZK, gridBagConstraints);
    this.ZO.setText(a(21080, -29941));
    this.ZO.setHorizontalTextPosition(10);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 1280;
    add(this.ZO, gridBagConstraints);
    this.Zk.addActionListener(new Zrok(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    add(this.Zk, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 23;
    add(this.Zg, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    add(this.Zs, gridBagConstraints);
    this.ZD.setText(a(21087, 32737));
    this.ZD.addActionListener(new Zlcy(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    add(this.ZD, gridBagConstraints);
  }
  
  private void Zd(KeyEvent paramKeyEvent) {
    this.ZM.ZR(ZDJ());
  }
  
  private void ZS(ActionEvent paramActionEvent) {
    Zbq0 zbq0 = Zt();
    this.ZM.Zz(zbq0);
    this.Zs.setText(zbq0.description);
  }
  
  private void Zh(ActionEvent paramActionEvent) {
    boolean bool = this.ZD.isSelected();
    this.ZM.ZM(bool);
    this.Zh.accept(Boolean.valueOf(bool));
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
  
  static {
    // Byte code:
    //   0: bipush #13
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¼¹ibÌ{@-rÊ¾µ¤>¥d¡'Q\cèÙ«]ÄÆÙÛÏ"z|zB»B+õhm,´_6P¶yl¾õ)¸0[EÐ}u·Q· "2ÀOªnpþàde7|í©«¼¬ÜM1ý[7ÓñÆP/B&pÚÄ}-ÓµP¿PPÖêÊZãME\t?ëtS¢ùRãÙÍOüU¥nù`½nìÛ0ÊÚë®~§ÀLmÒø>@Èav&Â´¯¼=,äÐ+[Ð3ÞÝÙèKðªk:f);$£çû'A/ª\\rûÂ´\BÿÊw£O ¼B-»©`Vt\¼,ø&\À´òSåÙ4\QeUD¢¤Kô#'òÚ²ì"ðÝ=Ç CÄ\\f¢²mXpIëöÆmïÒM«®\\r¸.\\nû4#¦]ÎW÷èl^ÐF­÷fåá/íÉoO÷¾bµe=­(Ð½ÕNàG ÉläÆ2¤ý'\\rª%¹éãIªñy[®`¨iÖ{Cp[RSBÎH\\f=5$-\\bZQÏÚ]Æð!Ô!~pÍ3±ÓÿöUgä´¶\\rÂl¢6Ë_aÜs§!é>'\\rX¢'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #17
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #122
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
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
    //   68: ldc 'Nzï°ºè6ógÒ¾<Eë´=ø<Q§Ïl]4õÍÁà­MÉEâÙÌÎq,$ó*p,ò-Q¿Ï`|Ê-äg±ør,N`^qk'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #18
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #40
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zbmz.a : [Ljava/lang/String;
    //   132: bipush #13
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbmz.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #78
    //   214: goto -> 244
    //   217: bipush #58
    //   219: goto -> 244
    //   222: bipush #29
    //   224: goto -> 244
    //   227: bipush #92
    //   229: goto -> 244
    //   232: bipush #15
    //   234: goto -> 244
    //   237: bipush #78
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
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5259) & 0xFFFF;
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
      byte b1 = 66;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbmz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */