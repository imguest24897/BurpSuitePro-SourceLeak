package burp;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseListener;
import java.awt.geom.RoundRectangle2D;
import javax.swing.BoxLayout;
import javax.swing.border.Border;

public class Zrv_ extends Zrh7 {
  private final Window Zh;
  
  private Zzml Zj;
  
  private String Zs;
  
  private Zbqc Zr;
  
  private Zm9t ZZ;
  
  private Zbqc ZM;
  
  private Zm99 Zu;
  
  private Ze0q Za;
  
  private Zl86 ZX;
  
  private static Zbqc[] ZY;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zrv_(Window paramWindow, Ztrn paramZtrn, Zzml paramZzml) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: iconst_0
    //   3: getstatic burp/Zzv7.NUMERIC_QUESTIONNAIRE_DIALOG : Lburp/Zzv7;
    //   6: invokespecial <init> : (Ljava/awt/Window;ZLburp/Zzv7;)V
    //   9: aload_0
    //   10: aload_1
    //   11: putfield Zh : Ljava/awt/Window;
    //   14: invokestatic ZG : ()[Lburp/Zbqc;
    //   17: aload_0
    //   18: invokevirtual Zm : ()V
    //   21: aload_0
    //   22: getfield ZM : Lburp/Zbqc;
    //   25: getstatic burp/Zlkk.QUESTIONNAIRE_BACKGROUND : Lburp/Zlkk;
    //   28: invokevirtual Zl : (Lburp/Zlkk;)V
    //   31: aload_0
    //   32: getfield ZX : Lburp/Zl86;
    //   35: getstatic burp/Zlkk.QUESTIONNAIRE_BACKGROUND : Lburp/Zlkk;
    //   38: invokevirtual ZL : (Lburp/Zlkk;)V
    //   41: aload_0
    //   42: getfield ZX : Lburp/Zl86;
    //   45: getstatic burp/Zt00.TITLE_BOLD_FONT : Lburp/Zt00;
    //   48: invokevirtual ZI : (Lburp/Zt00;)V
    //   51: aload_0
    //   52: getfield Zr : Lburp/Zbqc;
    //   55: getstatic burp/Zlkk.QUESTIONNAIRE_BACKGROUND : Lburp/Zlkk;
    //   58: invokevirtual Zl : (Lburp/Zlkk;)V
    //   61: aload_0
    //   62: aload_3
    //   63: aload_0
    //   64: aload_3
    //   65: <illegal opcode> ZV : (Lburp/Zrv_;Lburp/Zzml;)Lburp/Zzw8;
    //   70: invokevirtual Zd : (Lburp/Zzml;Lburp/Zzw8;)V
    //   73: aload_0
    //   74: getfield Za : Lburp/Ze0q;
    //   77: aload_3
    //   78: invokevirtual ZkO : ()Ljava/lang/String;
    //   81: invokevirtual setText : (Ljava/lang/String;)V
    //   84: aload_0
    //   85: getfield Za : Lburp/Ze0q;
    //   88: aload_3
    //   89: invokevirtual ZkW : ()Z
    //   92: invokevirtual setEnabled : (Z)V
    //   95: aload_0
    //   96: getfield Za : Lburp/Ze0q;
    //   99: aload_0
    //   100: aload_2
    //   101: <illegal opcode> actionPerformed : (Lburp/Zrv_;Lburp/Ztrn;)Ljava/awt/event/ActionListener;
    //   106: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   109: astore #4
    //   111: aload_0
    //   112: getfield ZZ : Lburp/Zm9t;
    //   115: getstatic burp/Zeuf.CLOSE : Lburp/Zeuf;
    //   118: getstatic burp/Zlkk.ACTION_NORMAL : Lburp/Zlkk;
    //   121: invokestatic ZC : (Lburp/Zeuf;Lburp/Zlkk;)Lburp/Ze3m;
    //   124: getstatic burp/Zmcx.LARGE_LINE_SIZE : Lburp/Zmcx;
    //   127: invokevirtual ZU : (Lburp/Zmcx;)Lburp/Ze3m;
    //   130: getstatic burp/Zlkk.ACTION_HOVER : Lburp/Zlkk;
    //   133: invokevirtual ZG : (Lburp/Zlkk;)Lburp/Ze3m;
    //   136: invokevirtual Z_ : ()Lburp/Ze9n;
    //   139: sipush #23650
    //   142: sipush #17239
    //   145: invokestatic a : (II)Ljava/lang/String;
    //   148: aload_2
    //   149: dup
    //   150: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   153: pop
    //   154: <illegal opcode> run : (Lburp/Ztrn;)Ljava/lang/Runnable;
    //   159: invokevirtual Zv : (Lburp/Ze9n;Ljava/lang/String;Ljava/lang/Runnable;)V
    //   162: aload_0
    //   163: getfield ZZ : Lburp/Zm9t;
    //   166: getstatic burp/Zlkk.QUESTIONNAIRE_BACKGROUND : Lburp/Zlkk;
    //   169: invokevirtual ZO : (Lburp/Zlkk;)V
    //   172: aload_0
    //   173: getfield ZZ : Lburp/Zm9t;
    //   176: getstatic burp/Zlkk.QUESTIONNAIRE_BACKGROUND : Lburp/Zlkk;
    //   179: invokevirtual ZD : (Lburp/Zlkk;)V
    //   182: aload_0
    //   183: getfield Zu : Lburp/Zm99;
    //   186: getstatic burp/Zlkk.PRIMARY_LINK : Lburp/Zlkk;
    //   189: invokevirtual Ze : (Lburp/Zlkk;)V
    //   192: aload_0
    //   193: getfield Zu : Lburp/Zm99;
    //   196: getstatic burp/Zlkk.QUESTIONNAIRE_BACKGROUND : Lburp/Zlkk;
    //   199: invokevirtual ZO : (Lburp/Zlkk;)V
    //   202: aload_0
    //   203: getfield Zu : Lburp/Zm99;
    //   206: new burp/Zrf5
    //   209: dup
    //   210: iconst_0
    //   211: iconst_0
    //   212: iconst_1
    //   213: iconst_0
    //   214: getstatic burp/Zlkk.PRIMARY_LINK : Lburp/Zlkk;
    //   217: invokespecial <init> : (IIIILburp/Zlkk;)V
    //   220: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   223: aload_0
    //   224: getfield Zu : Lburp/Zm99;
    //   227: aload_0
    //   228: aload_0
    //   229: aload_2
    //   230: <illegal opcode> run : (Lburp/Zrv_;Lburp/Ztrn;)Ljava/lang/Runnable;
    //   235: invokevirtual ZJ : (Ljava/lang/Runnable;)Ljava/awt/event/MouseListener;
    //   238: invokevirtual addMouseListener : (Ljava/awt/event/MouseListener;)V
    //   241: aload_1
    //   242: aload_0
    //   243: invokevirtual ZC : ()Ljava/awt/event/ComponentListener;
    //   246: invokevirtual addComponentListener : (Ljava/awt/event/ComponentListener;)V
    //   249: aload_0
    //   250: invokevirtual pack : ()V
    //   253: aload_0
    //   254: new java/awt/geom/RoundRectangle2D$Double
    //   257: dup
    //   258: dconst_0
    //   259: dconst_0
    //   260: aload_0
    //   261: invokevirtual getWidth : ()I
    //   264: i2d
    //   265: aload_0
    //   266: invokevirtual getHeight : ()I
    //   269: i2d
    //   270: ldc2_w 8.0
    //   273: ldc2_w 8.0
    //   276: invokespecial <init> : (DDDDDD)V
    //   279: invokevirtual setShape : (Ljava/awt/Shape;)V
    //   282: aload #4
    //   284: ifnonnull -> 294
    //   287: iconst_3
    //   288: anewarray burp/Zbqc
    //   291: invokestatic Zr : ([Lburp/Zbqc;)V
    //   294: return
  }
  
  public void ZF() {
    EventQueue.invokeLater(this::lambda$close$3);
  }
  
  public void ZP(Zzml paramZzml) {
    Zd(paramZzml, this::lambda$updateQuestion$4);
    EventQueue.invokeLater(this::lambda$updateQuestion$5);
  }
  
  private void Zd(Zzml paramZzml, Zzw8 paramZzw8) {
    this.Zj = paramZzml;
    this.Zs = null;
    this.ZX.setText(paramZzml.ZkR());
    this.Za.setText(paramZzml.ZkO());
    Zbqc zbqc = Zkg2.Zo(paramZzml, paramZzw8);
    this.Zr.removeAll();
    this.Zr.add(zbqc, a(23649, -2355));
  }
  
  private ComponentListener ZC() {
    return new Zruy(this);
  }
  
  private MouseListener ZJ(Runnable paramRunnable) {
    return new Zmdo(this, paramRunnable);
  }
  
  private void ZZ() {
    Point point = this.Zh.getLocation();
    int i = point.x + this.Zh.getWidth() - getWidth() - 20;
    int j = point.y + this.Zh.getHeight() - getHeight() - 20;
    setLocation(i, j);
  }
  
  private void Zm() {
    this.ZM = new Zbqc();
    this.ZZ = new Zm9t();
    this.Za = new Ze0q();
    this.ZX = new Zl86();
    this.Zr = new Zbqc();
    this.Zu = new Zm99();
    setDefaultCloseOperation(2);
    setCursor(new Cursor(0));
    setUndecorated(true);
    setResizable(false);
    getContentPane().setLayout(new BoxLayout(getContentPane(), 2));
    this.ZM.setLayout(new GridBagLayout());
    this.ZZ.setText("X");
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 24;
    gridBagConstraints.insets = new Insets(15, 0, 0, 18);
    this.ZM.add(this.ZZ, gridBagConstraints);
    this.Za.setText(a(23648, 11090));
    this.Za.setMargin(new Insets(7, 44, 7, 44));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.anchor = 26;
    gridBagConstraints.insets = new Insets(10, 0, 22, 20);
    this.ZM.add(this.Za, gridBagConstraints);
    this.ZX.setEditable(false);
    this.ZX.setBorder((Border)null);
    this.ZX.setColumns(30);
    this.ZX.setLineWrap(true);
    this.ZX.setWrapStyleWord(true);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    gridBagConstraints.insets = new Insets(10, 20, 10, 20);
    this.ZM.add(this.ZX, gridBagConstraints);
    this.Zr.setLayout(new BorderLayout());
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    gridBagConstraints.insets = new Insets(10, 20, 10, 20);
    this.ZM.add(this.Zr, gridBagConstraints);
    this.Zu.setText(a(23651, 24182));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.anchor = 25;
    gridBagConstraints.insets = new Insets(10, 20, 24, 0);
    this.ZM.add(this.Zu, gridBagConstraints);
    getContentPane().add(this.ZM);
    pack();
  }
  
  private void lambda$updateQuestion$5() {
    pack();
    ZZ();
    setShape(new RoundRectangle2D.Double(0.0D, 0.0D, getWidth(), getHeight(), 8.0D, 8.0D));
  }
  
  private void lambda$updateQuestion$4(String paramString) {
    this.Zs = paramString;
  }
  
  private void lambda$close$3() {
    setVisible(false);
    dispose();
  }
  
  private void lambda$new$2(Ztrn paramZtrn) {
    paramZtrn.ZP(this.Zj);
  }
  
  private void lambda$new$1(Ztrn paramZtrn, ActionEvent paramActionEvent) {
    paramZtrn.Zk(this.Zj, this.Zs);
  }
  
  private void lambda$new$0(Zzml paramZzml, String paramString) {
    if (!paramZzml.ZkW())
      this.Za.setEnabled(!paramString.isEmpty()); 
    this.Zs = paramString;
  }
  
  public static void Zp(Zbqc[] paramArrayOfZbqc) {
    ZY = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZG() {
    return ZY;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_2
    //   7: anewarray burp/Zbqc
    //   10: iconst_0
    //   11: istore_3
    //   12: ldc 'øNç 6½Ùù'
    //   14: dup
    //   15: astore_2
    //   16: invokevirtual length : ()I
    //   19: istore #4
    //   21: invokestatic Zp : ([Lburp/Zbqc;)V
    //   24: bipush #6
    //   26: istore_1
    //   27: iconst_m1
    //   28: istore_0
    //   29: bipush #33
    //   31: iinc #0, 1
    //   34: aload_2
    //   35: iload_0
    //   36: dup
    //   37: iload_1
    //   38: iadd
    //   39: invokevirtual substring : (II)Ljava/lang/String;
    //   42: iconst_m1
    //   43: goto -> 147
    //   46: aload #5
    //   48: swap
    //   49: iload_3
    //   50: iinc #3, 1
    //   53: swap
    //   54: aastore
    //   55: iload_0
    //   56: iload_1
    //   57: iadd
    //   58: dup
    //   59: istore_0
    //   60: iload #4
    //   62: if_icmpge -> 74
    //   65: aload_2
    //   66: iload_0
    //   67: invokevirtual charAt : (I)C
    //   70: istore_1
    //   71: goto -> 29
    //   74: ldc '÷4çË6Q6äë/þ\\f±'
    //   76: dup
    //   77: astore_2
    //   78: invokevirtual length : ()I
    //   81: istore #4
    //   83: iconst_5
    //   84: istore_1
    //   85: iconst_m1
    //   86: istore_0
    //   87: bipush #37
    //   89: iinc #0, 1
    //   92: aload_2
    //   93: iload_0
    //   94: dup
    //   95: iload_1
    //   96: iadd
    //   97: invokevirtual substring : (II)Ljava/lang/String;
    //   100: iconst_0
    //   101: goto -> 147
    //   104: aload #5
    //   106: swap
    //   107: iload_3
    //   108: iinc #3, 1
    //   111: swap
    //   112: aastore
    //   113: iload_0
    //   114: iload_1
    //   115: iadd
    //   116: dup
    //   117: istore_0
    //   118: iload #4
    //   120: if_icmpge -> 132
    //   123: aload_2
    //   124: iload_0
    //   125: invokevirtual charAt : (I)C
    //   128: istore_1
    //   129: goto -> 87
    //   132: aload #5
    //   134: putstatic burp/Zrv_.a : [Ljava/lang/String;
    //   137: iconst_4
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zrv_.b : [Ljava/lang/String;
    //   144: goto -> 304
    //   147: dup_x2
    //   148: pop
    //   149: invokevirtual toCharArray : ()[C
    //   152: dup_x1
    //   153: arraylength
    //   154: dup_x2
    //   155: pop
    //   156: iconst_0
    //   157: istore #6
    //   159: dup2_x1
    //   160: pop2
    //   161: dup_x2
    //   162: iconst_1
    //   163: if_icmpgt -> 264
    //   166: dup2
    //   167: swap
    //   168: iload #6
    //   170: dup2_x1
    //   171: caload
    //   172: swap
    //   173: iload #6
    //   175: bipush #7
    //   177: irem
    //   178: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #113
    //   218: goto -> 248
    //   221: bipush #9
    //   223: goto -> 248
    //   226: bipush #33
    //   228: goto -> 248
    //   231: bipush #68
    //   233: goto -> 248
    //   236: bipush #15
    //   238: goto -> 248
    //   241: bipush #75
    //   243: goto -> 248
    //   246: bipush #28
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 170
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 166
    //   272: pop
    //   273: new java/lang/String
    //   276: dup_x1
    //   277: swap
    //   278: invokespecial <init> : ([C)V
    //   281: invokevirtual intern : ()Ljava/lang/String;
    //   284: swap
    //   285: pop
    //   286: swap
    //   287: tableswitch default -> 46, 0 -> 104
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5C60) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrv_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */