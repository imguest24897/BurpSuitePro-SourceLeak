package burp;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JSeparator;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentListener;
import javax.swing.text.AbstractDocument;
import javax.swing.text.DefaultCaret;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public abstract class Zbds extends Zbqc implements Zzyl, Zs7f {
  private final Zrc Zv;
  
  private final Zmgn Zs;
  
  private final Zbqc Zn;
  
  private final Zm99 Zy;
  
  private final Zb0h ZI;
  
  private int ZM;
  
  private String Zi = "";
  
  private int ZC;
  
  private boolean ZX;
  
  private boolean ZU;
  
  private static String[] Za;
  
  private static final String[] a;
  
  private static final String[] c;
  
  public Zbds(Zb0h paramZb0h, Runnable paramRunnable) {
    this.ZI = paramZb0h;
    setLayout(new BorderLayout());
    Zl(Zlkk.INSPECTOR_TABLE_BACKGROUND);
    this.ZM = Zrt.ZC();
    this.Zv = new Zrc();
    Ze9f ze9f = new Ze9f(new Zbq7(), a(5771, 10133));
    this.Zs = new Zmgn(ze9f, new Zegf());
    this.Zs.setName(a(5769, 19039));
    this.Zs.getDocument().addDocumentListener(this.Zv);
    this.Zs.setWrapStyleWord(false);
    add(this.Zs, a(5770, -3083));
    this.Zn = new Zbqc(new GridBagLayout());
    this.Zn.Zl(Zlkk.INSPECTOR_TABLE_BACKGROUND);
    String[] arrayOfString = Ze();
    add(this.Zn, a(5775, 22450));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    byte b = 0;
    if (Zg()) {
      gridBagConstraints.gridy = b++;
      gridBagConstraints.anchor = 1280;
      gridBagConstraints.fill = 2;
      gridBagConstraints.insets = new Insets(5, 0, 5, 0);
      gridBagConstraints.weightx = 1.0D;
      this.Zn.add(new JSeparator(), gridBagConstraints);
    } 
    this.Zy = new Zm99();
    this.Zy.Ze(Zlkk.ACTION_NORMAL);
    this.Zy.ZO(Zlkk.INSPECTOR_TABLE_BACKGROUND);
    this.Zy.setOpaque(true);
    this.Zy.setBorder(new EmptyBorder(5, 5, 5, 5));
    this.Zy.setIconTextGap(10);
    this.Zy.setHorizontalTextPosition(2);
    this.Zy.setHorizontalAlignment(0);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridy = b;
    gridBagConstraints.anchor = 256;
    gridBagConstraints.fill = 2;
    gridBagConstraints.weightx = 1.0D;
    this.Zn.add(this.Zy, gridBagConstraints);
    ZS();
    ZR(this.Zs, paramRunnable);
    this.Zs.updateUI();
    ZW();
    addComponentListener(new Zrix(this));
    ZZ();
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  abstract Ztz Zn();
  
  public void ZM(DefaultCaret paramDefaultCaret) {
    this.Zs.setCaret(paramDefaultCaret);
  }
  
  public void updateUI() {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial updateUI : ()V
    //   4: aload_0
    //   5: getfield Zs : Lburp/Zmgn;
    //   8: ifnull -> 38
    //   11: invokestatic ZC : ()I
    //   14: istore_1
    //   15: iload_1
    //   16: aload_0
    //   17: getfield ZM : I
    //   20: if_icmpeq -> 38
    //   23: aload_0
    //   24: iload_1
    //   25: putfield ZM : I
    //   28: aload_0
    //   29: iload_1
    //   30: <illegal opcode> run : (Lburp/Zbds;I)Ljava/lang/Runnable;
    //   35: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   38: return
  }
  
  public void Zs(String paramString) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    this.ZU = false;
    Zn().Zb(paramString);
    ZQ(paramString);
  }
  
  private void ZQ(String paramString) {
    this.Zi = paramString;
    this.ZC = ZQ();
    ZI();
  }
  
  public String Zw() {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    return !this.ZX ? this.Zi : Zn().ZY();
  }
  
  public void ZL(DocumentListener paramDocumentListener) {
    this.Zv.ZN(paramDocumentListener);
  }
  
  public void Zh() {
    this.Zs.requestFocusInWindow();
    SwingUtilities.invokeLater(this::lambda$takeFocus$1);
  }
  
  public void ZC(String paramString) {
    this.Zs.ZJ();
    try {
      this.Zs.replaceSelection(paramString);
    } finally {
      this.Zs.ZA();
    } 
  }
  
  public String ZT() {
    return this.Zs.getSelectedText();
  }
  
  public void Zl(String paramString) {
    ZC(paramString);
  }
  
  public boolean ZH() {
    return this.Zs.isEditable();
  }
  
  private void ZW() {
    this.Zy.addMouseListener(new Zmho(this));
  }
  
  private void ZS() {
    ZL(new Zzla(this));
  }
  
  private void ZF() {
    this.ZX = true;
    SwingUtilities.invokeLater(this::lambda$textModified$2);
  }
  
  private int ZQ() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zs : Lburp/Zmgn;
    //   4: invokevirtual getInsets : ()Ljava/awt/Insets;
    //   7: astore_2
    //   8: invokestatic Ze : ()[Ljava/lang/String;
    //   11: aload_2
    //   12: getfield left : I
    //   15: aload_2
    //   16: getfield right : I
    //   19: iadd
    //   20: iconst_1
    //   21: iadd
    //   22: istore_3
    //   23: aload_0
    //   24: invokevirtual getWidth : ()I
    //   27: iload_3
    //   28: isub
    //   29: istore #4
    //   31: aload_0
    //   32: getfield Zs : Lburp/Zmgn;
    //   35: invokevirtual Zi : ()Lburp/Zzkh;
    //   38: invokestatic Zj : (Lburp/Zzkh;)F
    //   41: fstore #5
    //   43: astore_1
    //   44: aload_0
    //   45: getfield Zs : Lburp/Zmgn;
    //   48: invokestatic Zy : (Lburp/Zmgw;)F
    //   51: fstore #6
    //   53: iconst_0
    //   54: istore #7
    //   56: fconst_0
    //   57: fstore #8
    //   59: iconst_0
    //   60: istore #9
    //   62: iload #9
    //   64: bipush #8
    //   66: if_icmpge -> 158
    //   69: iload #7
    //   71: aload_0
    //   72: getfield Zi : Ljava/lang/String;
    //   75: invokevirtual length : ()I
    //   78: if_icmpge -> 158
    //   81: aload_0
    //   82: getfield Zi : Ljava/lang/String;
    //   85: iload #7
    //   87: invokevirtual charAt : (I)C
    //   90: istore #10
    //   92: fload #8
    //   94: iload #10
    //   96: invokestatic ZN : (C)Z
    //   99: ifeq -> 107
    //   102: fload #6
    //   104: goto -> 109
    //   107: fload #5
    //   109: fadd
    //   110: fstore #8
    //   112: fload #8
    //   114: iload #4
    //   116: i2f
    //   117: fcmpl
    //   118: iflt -> 131
    //   121: iinc #9, 1
    //   124: fconst_0
    //   125: fstore #8
    //   127: aload_1
    //   128: ifnonnull -> 154
    //   131: iload #10
    //   133: bipush #10
    //   135: if_icmpne -> 151
    //   138: iinc #9, 1
    //   141: fconst_0
    //   142: fstore #8
    //   144: iinc #7, 1
    //   147: aload_1
    //   148: ifnonnull -> 154
    //   151: iinc #7, 1
    //   154: aload_1
    //   155: ifnonnull -> 62
    //   158: iload #7
    //   160: ifle -> 198
    //   163: iload #7
    //   165: aload_0
    //   166: getfield Zi : Ljava/lang/String;
    //   169: invokevirtual length : ()I
    //   172: if_icmpge -> 198
    //   175: aload_0
    //   176: getfield Zi : Ljava/lang/String;
    //   179: iload #7
    //   181: iconst_1
    //   182: isub
    //   183: invokevirtual charAt : (I)C
    //   186: bipush #10
    //   188: if_icmpne -> 198
    //   191: iload #7
    //   193: iconst_1
    //   194: isub
    //   195: goto -> 200
    //   198: iload #7
    //   200: ireturn
  }
  
  private void ZI() {
    String[] arrayOfString = Ze();
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    if (Zi()) {
      ZM();
      if (arrayOfString == null) {
        ZZ();
        return;
      } 
      return;
    } 
    ZZ();
  }
  
  private boolean Zi() {
    return (this.Zi.length() > this.ZC);
  }
  
  private void ZM() {
    this.Zv.Zz();
    try {
      int i = this.Zs.getCaretPosition();
      this.Zs.setText(this.ZU ? this.Zi : this.Zi.substring(0, this.ZC));
      Zo(i);
      this.ZX = false;
      this.Zy.setText(this.ZU ? a(5774, 30241) : a(5768, 10913));
      this.Zy.setIcon(Zbz3.ZK(this.ZU ? Zxpj.INSPECTOR_ARROW_UP : Zxpj.INSPECTOR_ARROW_DOWN));
      this.Zn.setVisible(true);
    } finally {
      this.Zv.ZU();
    } 
  }
  
  private void ZZ() {
    this.Zv.Zz();
    try {
      int i = this.Zs.getCaretPosition();
      this.Zs.setText(this.Zi);
      Zo(i);
      this.ZX = false;
      this.Zn.setVisible(false);
    } finally {
      this.Zv.ZU();
    } 
  }
  
  private void Zo(int paramInt) {
    this.Zs.setCaretPosition(Math.min(paramInt, this.Zs.getText().length()));
  }
  
  abstract boolean Zg();
  
  abstract void ZR(Zmgn paramZmgn, Runnable paramRunnable);
  
  public void Zx(int paramInt) {
    ((AbstractDocument)this.Zs.getDocument()).setDocumentFilter(new Zkrd(paramInt));
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    switch (paramInt) {
      case 394752:
        this.Zs.selectAll();
        return true;
      case 393472:
        if (this.Zs.isEditable()) {
          Zsn1.ZM(this, this.ZI);
          return true;
        } 
        return false;
      case 393728:
        Zsn1.ZY(this, this.ZI);
        return true;
      case 393984:
        if (this.Zs.isEditable()) {
          Zsn1.Zw(this, false, this.ZI);
          return true;
        } 
        return false;
      case 394496:
        if (this.Zs.isEditable()) {
          Zn().Ze();
          ZQ(Zn().ZY());
          this.Zs.setCaretPosition(Zn().ZZ());
          return true;
        } 
        return false;
      case 394240:
        if (this.Zs.isEditable()) {
          Zn().Zp();
          ZQ(Zn().ZY());
          this.Zs.setCaretPosition(Zn().ZZ());
          return true;
        } 
        return false;
    } 
    return false;
  }
  
  private void lambda$textModified$2() {
    this.Zi = Zw();
    this.ZC = ZQ();
    int i = this.Zs.getCaretPosition();
    if (i > this.ZC)
      this.ZU = true; 
    ZI();
    this.Zs.setCaretPosition(i);
  }
  
  private void lambda$takeFocus$1() {
    this.Zs.scrollRectToVisible(this.Zs.getBounds());
  }
  
  private void lambda$updateUI$0(int paramInt) {
    this.Zs.setFont(new Font((Zgkv.ZI()).Z_, 0, paramInt));
  }
  
  public static void Zq(String[] paramArrayOfString) {
    Za = paramArrayOfString;
  }
  
  public static String[] Ze() {
    return Za;
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_1
    //   8: anewarray java/lang/String
    //   11: iconst_0
    //   12: istore_3
    //   13: invokestatic Zq : ([Ljava/lang/String;)V
    //   16: ldc '©?âùÝîz§¾`\\r+0½jèJû)Ã2TY;\\bîZe3ûE'
    //   18: dup
    //   19: astore_2
    //   20: invokevirtual length : ()I
    //   23: istore #4
    //   25: iconst_5
    //   26: istore_1
    //   27: iconst_m1
    //   28: istore_0
    //   29: bipush #20
    //   31: iinc #0, 1
    //   34: aload_2
    //   35: iload_0
    //   36: dup
    //   37: iload_1
    //   38: iadd
    //   39: invokevirtual substring : (II)Ljava/lang/String;
    //   42: iconst_m1
    //   43: goto -> 148
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
    //   74: ldc ']îÔ\\bÝOîJÂÙ'
    //   76: dup
    //   77: astore_2
    //   78: invokevirtual length : ()I
    //   81: istore #4
    //   83: iconst_5
    //   84: istore_1
    //   85: iconst_m1
    //   86: istore_0
    //   87: bipush #24
    //   89: iinc #0, 1
    //   92: aload_2
    //   93: iload_0
    //   94: dup
    //   95: iload_1
    //   96: iadd
    //   97: invokevirtual substring : (II)Ljava/lang/String;
    //   100: iconst_0
    //   101: goto -> 148
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
    //   134: putstatic burp/Zbds.a : [Ljava/lang/String;
    //   137: bipush #6
    //   139: anewarray java/lang/String
    //   142: putstatic burp/Zbds.c : [Ljava/lang/String;
    //   145: goto -> 304
    //   148: dup_x2
    //   149: pop
    //   150: invokevirtual toCharArray : ()[C
    //   153: dup_x1
    //   154: arraylength
    //   155: dup_x2
    //   156: pop
    //   157: iconst_0
    //   158: istore #6
    //   160: dup2_x1
    //   161: pop2
    //   162: dup_x2
    //   163: iconst_1
    //   164: if_icmpgt -> 264
    //   167: dup2
    //   168: swap
    //   169: iload #6
    //   171: dup2_x1
    //   172: caload
    //   173: swap
    //   174: iload #6
    //   176: bipush #7
    //   178: irem
    //   179: tableswitch default -> 246, 0 -> 216, 1 -> 221, 2 -> 226, 3 -> 231, 4 -> 236, 5 -> 241
    //   216: bipush #99
    //   218: goto -> 248
    //   221: bipush #120
    //   223: goto -> 248
    //   226: bipush #126
    //   228: goto -> 248
    //   231: bipush #94
    //   233: goto -> 248
    //   236: bipush #110
    //   238: goto -> 248
    //   241: bipush #65
    //   243: goto -> 248
    //   246: bipush #27
    //   248: ixor
    //   249: ixor
    //   250: i2c
    //   251: castore
    //   252: iinc #6, 1
    //   255: dup
    //   256: ifne -> 264
    //   259: dup2
    //   260: dup_x1
    //   261: goto -> 171
    //   264: dup2_x1
    //   265: pop2
    //   266: dup_x2
    //   267: iload #6
    //   269: if_icmpgt -> 167
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
    int i = (paramInt1 ^ 0x168B) & 0xFFFF;
    if (c[i] == null) {
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
      byte b1 = 18;
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
      c[i] = (new String(arrayOfChar)).intern();
    } 
    return c[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbds.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */