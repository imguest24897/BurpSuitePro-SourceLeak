package burp;

import java.awt.Component;
import java.awt.event.ActionEvent;

public abstract class Zl4o extends Zl04 implements Zsma {
  private final Zk97 Zv;
  
  private final Zerv Zz;
  
  private Zx8l[] Za;
  
  private final boolean ZN;
  
  private Zbqc Zn;
  
  protected Ze01 Zs;
  
  protected Ze01 Zl;
  
  private Zm9v ZR;
  
  private Zbc_ ZB;
  
  private static boolean Zq;
  
  private static final String[] a;
  
  private static final String[] b;
  
  protected Zl4o(String paramString, Zk97 paramZk97, Zerv paramZerv, boolean paramBoolean) {
    this.Zv = paramZk97;
    this.Zz = paramZerv;
    this.ZN = paramBoolean;
    ZhD();
    setTitle(paramString);
    ZhA();
    this.ZR.setName(a(16895, 4804));
    this.Zl.setName(a(16891, -3891));
    setDefaultCloseOperation(2);
  }
  
  private void ZhA() {
    Zrf5 zrf5 = new Zrf5(1, 0, 0, 0, Zlkk.RIBBON_PANEL_BORDER);
    this.Zn.setBorder(zrf5);
  }
  
  protected void Zd(Zx8l... paramVarArgs) {
    this.Za = paramVarArgs;
    this.ZB.ZA(this.Zz, Zlkk.RIBBON_PANEL_BORDER, paramVarArgs);
  }
  
  public void Zg(Component paramComponent) {
    // Byte code:
    //   0: aload_0
    //   1: sipush #130
    //   4: bipush #47
    //   6: invokestatic Zf : (Ljava/awt/Component;II)V
    //   9: invokestatic Zht : ()Z
    //   12: aload_0
    //   13: invokevirtual pack : ()V
    //   16: istore_2
    //   17: aload_1
    //   18: ifnonnull -> 30
    //   21: aload_0
    //   22: aconst_null
    //   23: invokevirtual ZQ : (Ljava/awt/Window;)V
    //   26: iload_2
    //   27: ifne -> 38
    //   30: aload_0
    //   31: aload_1
    //   32: invokestatic ZF : (Ljava/awt/Component;)Ljava/awt/Window;
    //   35: invokevirtual ZO : (Ljava/awt/Window;)V
    //   38: aload_0
    //   39: iconst_1
    //   40: invokevirtual setVisible : (Z)V
    //   43: return
  }
  
  public void ZP(int paramInt) {
    this.ZB.Zp(this.Za[paramInt]);
  }
  
  public void ZA(int paramInt) {
    this.ZB.Za(this.Za[paramInt]);
  }
  
  public void Zi(int paramInt) {
    this.ZB.ZX(this.Za[paramInt]);
  }
  
  public void Ze(String paramString) {
    this.ZR.setText(paramString);
  }
  
  public void Zq() {
    setVisible(false);
    dispose();
  }
  
  protected abstract void Zhi();
  
  protected abstract void ZhY();
  
  private void ZhD() {
    // Byte code:
    //   0: aload_0
    //   1: new burp/Zbc_
    //   4: dup
    //   5: invokespecial <init> : ()V
    //   8: putfield ZB : Lburp/Zbc_;
    //   11: invokestatic Zht : ()Z
    //   14: aload_0
    //   15: new burp/Zbqc
    //   18: dup
    //   19: invokespecial <init> : ()V
    //   22: putfield Zn : Lburp/Zbqc;
    //   25: new burp/Zm2o
    //   28: dup
    //   29: invokespecial <init> : ()V
    //   32: astore_3
    //   33: istore_1
    //   34: aload_0
    //   35: new burp/Zm9v
    //   38: dup
    //   39: invokespecial <init> : ()V
    //   42: putfield ZR : Lburp/Zm9v;
    //   45: new burp/Zbqc
    //   48: dup
    //   49: invokespecial <init> : ()V
    //   52: astore #4
    //   54: aload_0
    //   55: aload_0
    //   56: getfield ZN : Z
    //   59: ifeq -> 72
    //   62: new burp/Ze0q
    //   65: dup
    //   66: invokespecial <init> : ()V
    //   69: goto -> 79
    //   72: new burp/Ze01
    //   75: dup
    //   76: invokespecial <init> : ()V
    //   79: putfield Zs : Lburp/Ze01;
    //   82: aload_0
    //   83: new burp/Ze01
    //   86: dup
    //   87: invokespecial <init> : ()V
    //   90: putfield Zl : Lburp/Ze01;
    //   93: aload_0
    //   94: iconst_3
    //   95: invokevirtual setDefaultCloseOperation : (I)V
    //   98: aload_0
    //   99: invokevirtual getContentPane : ()Ljava/awt/Container;
    //   102: aload_0
    //   103: getfield ZB : Lburp/Zbc_;
    //   106: sipush #16893
    //   109: sipush #28149
    //   112: invokestatic a : (II)Ljava/lang/String;
    //   115: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   118: new java/awt/GridBagLayout
    //   121: dup
    //   122: invokespecial <init> : ()V
    //   125: astore #5
    //   127: aload #5
    //   129: iconst_5
    //   130: newarray int
    //   132: dup
    //   133: iconst_0
    //   134: iconst_0
    //   135: iastore
    //   136: dup
    //   137: iconst_1
    //   138: iconst_5
    //   139: iastore
    //   140: dup
    //   141: iconst_2
    //   142: iconst_0
    //   143: iastore
    //   144: dup
    //   145: iconst_3
    //   146: iconst_5
    //   147: iastore
    //   148: dup
    //   149: iconst_4
    //   150: iconst_0
    //   151: iastore
    //   152: putfield columnWidths : [I
    //   155: aload #5
    //   157: iconst_1
    //   158: newarray int
    //   160: dup
    //   161: iconst_0
    //   162: iconst_0
    //   163: iastore
    //   164: putfield rowHeights : [I
    //   167: aload_0
    //   168: getfield Zn : Lburp/Zbqc;
    //   171: aload #5
    //   173: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   176: aload_3
    //   177: aload_0
    //   178: getfield Zv : Lburp/Zk97;
    //   181: invokevirtual Zi : (Lburp/Zk97;)V
    //   184: new java/awt/GridBagConstraints
    //   187: dup
    //   188: invokespecial <init> : ()V
    //   191: astore_2
    //   192: aload_2
    //   193: iconst_0
    //   194: putfield gridx : I
    //   197: aload_2
    //   198: iconst_0
    //   199: putfield gridy : I
    //   202: aload_2
    //   203: bipush #21
    //   205: putfield anchor : I
    //   208: aload_2
    //   209: new java/awt/Insets
    //   212: dup
    //   213: iconst_0
    //   214: bipush #10
    //   216: iconst_0
    //   217: iconst_0
    //   218: invokespecial <init> : (IIII)V
    //   221: putfield insets : Ljava/awt/Insets;
    //   224: aload_0
    //   225: getfield Zn : Lburp/Zbqc;
    //   228: aload_3
    //   229: aload_2
    //   230: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   233: new java/awt/GridBagConstraints
    //   236: dup
    //   237: invokespecial <init> : ()V
    //   240: astore_2
    //   241: aload_2
    //   242: iconst_2
    //   243: putfield gridx : I
    //   246: aload_2
    //   247: iconst_0
    //   248: putfield gridy : I
    //   251: aload_2
    //   252: bipush #22
    //   254: putfield anchor : I
    //   257: aload_2
    //   258: dconst_1
    //   259: putfield weightx : D
    //   262: aload_0
    //   263: getfield Zn : Lburp/Zbqc;
    //   266: aload_0
    //   267: getfield ZR : Lburp/Zm9v;
    //   270: aload_2
    //   271: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   274: aload #4
    //   276: new java/awt/GridLayout
    //   279: dup
    //   280: iconst_1
    //   281: iconst_2
    //   282: bipush #15
    //   284: iconst_0
    //   285: invokespecial <init> : (IIII)V
    //   288: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   291: aload_0
    //   292: getfield Zs : Lburp/Ze01;
    //   295: sipush #16890
    //   298: sipush #27496
    //   301: invokestatic a : (II)Ljava/lang/String;
    //   304: invokevirtual setText : (Ljava/lang/String;)V
    //   307: aload_0
    //   308: getfield Zs : Lburp/Ze01;
    //   311: sipush #16889
    //   314: sipush #3318
    //   317: invokestatic a : (II)Ljava/lang/String;
    //   320: invokevirtual setName : (Ljava/lang/String;)V
    //   323: aload_0
    //   324: getfield Zs : Lburp/Ze01;
    //   327: aload_0
    //   328: <illegal opcode> actionPerformed : (Lburp/Zl4o;)Ljava/awt/event/ActionListener;
    //   333: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   336: aload_0
    //   337: getfield Zl : Lburp/Ze01;
    //   340: sipush #16894
    //   343: sipush #-1977
    //   346: invokestatic a : (II)Ljava/lang/String;
    //   349: invokevirtual setText : (Ljava/lang/String;)V
    //   352: aload_0
    //   353: getfield Zl : Lburp/Ze01;
    //   356: aload_0
    //   357: <illegal opcode> actionPerformed : (Lburp/Zl4o;)Ljava/awt/event/ActionListener;
    //   362: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   365: aload_0
    //   366: getfield ZN : Z
    //   369: ifeq -> 396
    //   372: aload #4
    //   374: aload_0
    //   375: getfield Zl : Lburp/Ze01;
    //   378: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   381: pop
    //   382: aload #4
    //   384: aload_0
    //   385: getfield Zs : Lburp/Ze01;
    //   388: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   391: pop
    //   392: iload_1
    //   393: ifne -> 416
    //   396: aload #4
    //   398: aload_0
    //   399: getfield Zs : Lburp/Ze01;
    //   402: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   405: pop
    //   406: aload #4
    //   408: aload_0
    //   409: getfield Zl : Lburp/Ze01;
    //   412: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   415: pop
    //   416: new java/awt/GridBagConstraints
    //   419: dup
    //   420: invokespecial <init> : ()V
    //   423: astore_2
    //   424: aload_2
    //   425: iconst_4
    //   426: putfield gridx : I
    //   429: aload_2
    //   430: iconst_0
    //   431: putfield gridy : I
    //   434: aload_2
    //   435: new java/awt/Insets
    //   438: dup
    //   439: iconst_5
    //   440: bipush #10
    //   442: iconst_5
    //   443: bipush #10
    //   445: invokespecial <init> : (IIII)V
    //   448: putfield insets : Ljava/awt/Insets;
    //   451: aload_0
    //   452: getfield Zn : Lburp/Zbqc;
    //   455: aload #4
    //   457: aload_2
    //   458: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   461: aload_0
    //   462: invokevirtual getContentPane : ()Ljava/awt/Container;
    //   465: aload_0
    //   466: getfield Zn : Lburp/Zbqc;
    //   469: sipush #16888
    //   472: sipush #23565
    //   475: invokestatic a : (II)Ljava/lang/String;
    //   478: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   481: aload_0
    //   482: invokevirtual pack : ()V
    //   485: return
  }
  
  private void Zj(ActionEvent paramActionEvent) {
    Zhi();
  }
  
  private void Zi(ActionEvent paramActionEvent) {
    ZhY();
  }
  
  public static void Zi(boolean paramBoolean) {
    Zq = paramBoolean;
  }
  
  public static boolean Zht() {
    return Zq;
  }
  
  public static boolean Zhv() {
    boolean bool = Zht();
    return !bool;
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: iconst_1
    //   10: ldc '@jÃÀ,W¸¤ç÷w\\n\\fo2mt'¹Þàf~,=|« ùZÃ"³<iIª{"ÉG[\\b3¹è;²«sÀH\\tN¥iek]°½{'
    //   12: dup
    //   13: astore_2
    //   14: invokevirtual length : ()I
    //   17: istore #4
    //   19: invokestatic Zi : (Z)V
    //   22: bipush #24
    //   24: istore_1
    //   25: iconst_m1
    //   26: istore_0
    //   27: bipush #64
    //   29: iinc #0, 1
    //   32: aload_2
    //   33: iload_0
    //   34: dup
    //   35: iload_1
    //   36: iadd
    //   37: invokevirtual substring : (II)Ljava/lang/String;
    //   40: iconst_m1
    //   41: goto -> 147
    //   44: aload #5
    //   46: swap
    //   47: iload_3
    //   48: iinc #3, 1
    //   51: swap
    //   52: aastore
    //   53: iload_0
    //   54: iload_1
    //   55: iadd
    //   56: dup
    //   57: istore_0
    //   58: iload #4
    //   60: if_icmpge -> 72
    //   63: aload_2
    //   64: iload_0
    //   65: invokevirtual charAt : (I)C
    //   68: istore_1
    //   69: goto -> 27
    //   72: ldc 'Lóðó£EêØ$9p'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #6
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #11
    //   88: iinc #0, 1
    //   91: aload_2
    //   92: iload_0
    //   93: dup
    //   94: iload_1
    //   95: iadd
    //   96: invokevirtual substring : (II)Ljava/lang/String;
    //   99: iconst_0
    //   100: goto -> 147
    //   103: aload #5
    //   105: swap
    //   106: iload_3
    //   107: iinc #3, 1
    //   110: swap
    //   111: aastore
    //   112: iload_0
    //   113: iload_1
    //   114: iadd
    //   115: dup
    //   116: istore_0
    //   117: iload #4
    //   119: if_icmpge -> 131
    //   122: aload_2
    //   123: iload_0
    //   124: invokevirtual charAt : (I)C
    //   127: istore_1
    //   128: goto -> 86
    //   131: aload #5
    //   133: putstatic burp/Zl4o.a : [Ljava/lang/String;
    //   136: bipush #7
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zl4o.b : [Ljava/lang/String;
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
    //   216: bipush #32
    //   218: goto -> 248
    //   221: bipush #76
    //   223: goto -> 248
    //   226: bipush #82
    //   228: goto -> 248
    //   231: bipush #64
    //   233: goto -> 248
    //   236: bipush #91
    //   238: goto -> 248
    //   241: bipush #58
    //   243: goto -> 248
    //   246: bipush #29
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
    //   287: tableswitch default -> 44, 0 -> 103
    //   304: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x41FB) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl4o.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */