package burp;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.util.Objects;
import javax.swing.SwingUtilities;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zl0a extends Zl04 implements Zbiw, ActionListener {
  private final Zbqc Zu;
  
  private final Zbqc ZC;
  
  private final Zm9v Zq;
  
  private final WindowAdapter Zd;
  
  private Ze01[] ZW;
  
  private Zsic Zl;
  
  private boolean ZV;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zl0a(Window paramWindow, String paramString, int paramInt1, int paramInt2, Zsic paramZsic) {
    this(paramWindow, paramString, paramInt1, paramInt2, paramZsic, Zl0a::lambda$new$0);
  }
  
  public Zl0a(Window paramWindow, String paramString, int paramInt1, int paramInt2, Zsic paramZsic, Zlwz paramZlwz) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: invokevirtual getContentPane : ()Ljava/awt/Container;
    //   8: astore #8
    //   10: aload #8
    //   12: new java/awt/BorderLayout
    //   15: dup
    //   16: iconst_0
    //   17: iconst_5
    //   18: invokespecial <init> : (II)V
    //   21: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   24: aload_0
    //   25: new burp/Zbqc
    //   28: dup
    //   29: invokespecial <init> : ()V
    //   32: putfield Zu : Lburp/Zbqc;
    //   35: aload_0
    //   36: getfield Zu : Lburp/Zbqc;
    //   39: new java/awt/BorderLayout
    //   42: dup
    //   43: invokespecial <init> : ()V
    //   46: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   49: aload_0
    //   50: getfield Zu : Lburp/Zbqc;
    //   53: new javax/swing/border/EmptyBorder
    //   56: dup
    //   57: bipush #15
    //   59: bipush #15
    //   61: bipush #15
    //   63: bipush #15
    //   65: invokespecial <init> : (IIII)V
    //   68: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   71: aload_0
    //   72: getfield Zu : Lburp/Zbqc;
    //   75: iload_3
    //   76: iload #4
    //   78: invokestatic Zf : (Ljava/awt/Component;II)V
    //   81: aload #8
    //   83: aload_0
    //   84: getfield Zu : Lburp/Zbqc;
    //   87: sipush #-23708
    //   90: sipush #-26543
    //   93: invokestatic a : (II)Ljava/lang/String;
    //   96: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   99: invokestatic Zg : ()Ljava/lang/String;
    //   102: aload_0
    //   103: new burp/Zbqc
    //   106: dup
    //   107: invokespecial <init> : ()V
    //   110: putfield ZC : Lburp/Zbqc;
    //   113: astore #7
    //   115: aload_0
    //   116: getfield ZC : Lburp/Zbqc;
    //   119: new java/awt/FlowLayout
    //   122: dup
    //   123: iconst_2
    //   124: bipush #10
    //   126: iconst_5
    //   127: invokespecial <init> : (III)V
    //   130: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   133: aload_0
    //   134: getfield ZC : Lburp/Zbqc;
    //   137: new javax/swing/border/EmptyBorder
    //   140: dup
    //   141: iconst_0
    //   142: iconst_0
    //   143: iconst_5
    //   144: iconst_5
    //   145: invokespecial <init> : (IIII)V
    //   148: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   151: aload #8
    //   153: aload_0
    //   154: getfield ZC : Lburp/Zbqc;
    //   157: sipush #-23712
    //   160: sipush #4773
    //   163: invokestatic a : (II)Ljava/lang/String;
    //   166: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   169: aload_0
    //   170: new burp/Zm9v
    //   173: dup
    //   174: ldc ' '
    //   176: invokespecial <init> : (Ljava/lang/String;)V
    //   179: putfield Zq : Lburp/Zm9v;
    //   182: aload_0
    //   183: new burp/Zzvy
    //   186: dup
    //   187: aload_0
    //   188: aload #6
    //   190: invokespecial <init> : (Lburp/Zl0a;Lburp/Zlwz;)V
    //   193: putfield Zd : Ljava/awt/event/WindowAdapter;
    //   196: aload_0
    //   197: aload_2
    //   198: invokevirtual setTitle : (Ljava/lang/String;)V
    //   201: aload_0
    //   202: sipush #-23711
    //   205: sipush #21860
    //   208: invokestatic a : (II)Ljava/lang/String;
    //   211: invokevirtual setName : (Ljava/lang/String;)V
    //   214: aload_0
    //   215: invokevirtual pack : ()V
    //   218: aload_1
    //   219: ifnonnull -> 239
    //   222: aload_0
    //   223: aconst_null
    //   224: invokevirtual ZQ : (Ljava/awt/Window;)V
    //   227: aload #7
    //   229: ifnonnull -> 244
    //   232: iconst_1
    //   233: anewarray burp/Zbqc
    //   236: invokestatic Zr : ([Lburp/Zbqc;)V
    //   239: aload_0
    //   240: aload_1
    //   241: invokevirtual ZO : (Ljava/awt/Window;)V
    //   244: aload_0
    //   245: iconst_0
    //   246: invokevirtual setDefaultCloseOperation : (I)V
    //   249: aload_0
    //   250: aload_0
    //   251: getfield Zd : Ljava/awt/event/WindowAdapter;
    //   254: invokevirtual addWindowListener : (Ljava/awt/event/WindowListener;)V
    //   257: aload_0
    //   258: aload #5
    //   260: invokevirtual Zf : (Lburp/Zsic;)V
    //   263: aload_0
    //   264: iconst_1
    //   265: invokevirtual setVisible : (Z)V
    //   268: return
  }
  
  public void Zf(Zsic paramZsic) {
    this.Zl = paramZsic;
    Zbqc zbqc = paramZsic.ZT();
    this.Zu.removeAll();
    this.Zu.add(zbqc, a(-23706, -11333));
    this.Zu.revalidate();
    this.Zu.validate();
    this.Zu.repaint();
    zbqc.revalidate();
    zbqc.validate();
    String str = Zbg2.Zg();
    zbqc.repaint();
    this.ZC.removeAll();
    this.ZC.add(this.Zq);
    String[] arrayOfString = paramZsic.Ze();
    boolean[] arrayOfBoolean = paramZsic.ZX();
    int i = paramZsic.Zx();
    boolean bool = false;
    this.ZW = new Ze01[arrayOfString.length];
    Objects.requireNonNull(this.ZC);
    paramZsic.ZA().forEach(this.ZC::add);
    byte b = 0;
    while (b < this.ZW.length) {
      if (b == i)
        bool = true; 
      this.ZW[b] = (b == i) ? Zb() : new Ze01();
      this.ZW[b].addActionListener(this);
      this.ZC.add(this.ZW[b]);
      Zx(b, arrayOfString[b], arrayOfBoolean[b]);
      b++;
      if (str == null)
        break; 
    } 
    Zuh.Zv((i == -1 || bool), Zqf.Zx, i);
    paramZsic.ZC();
    if (Zbqc.Zwu() == null)
      Zbg2.ZL("iZasH"); 
  }
  
  private Ze0q Zb() {
    Ze0q ze0q = new Ze0q();
    ze0q.setName(a(-23705, 9323));
    return ze0q;
  }
  
  public void Zx(int paramInt, String paramString, boolean paramBoolean) {
    if (this.ZW == null)
      return; 
    if (paramString != null)
      this.ZW[paramInt].setText(paramString); 
    this.ZW[paramInt].setEnabled(paramBoolean);
    this.ZW[paramInt].revalidate();
  }
  
  public void ZL(int paramInt) {
    if (this.ZW != null)
      actionPerformed(new ActionEvent(this.ZW[paramInt], 1001, "")); 
  }
  
  public void ZV(String paramString) {
    this.Zq.setText(Zsw8.ZP(paramString) ? " " : paramString);
  }
  
  public void ZS() {
    SwingUtilities.invokeLater(this::lambda$close$1);
  }
  
  public Zl0a Zu() {
    return this;
  }
  
  public void ZU(boolean paramBoolean) {
    this.ZV = paramBoolean;
  }
  
  public void actionPerformed(ActionEvent paramActionEvent) {
    // Byte code:
    //   0: invokestatic Zg : ()Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZW : [Lburp/Ze01;
    //   8: ifnonnull -> 12
    //   11: return
    //   12: aload_1
    //   13: invokevirtual getSource : ()Ljava/lang/Object;
    //   16: astore_3
    //   17: iconst_0
    //   18: istore #4
    //   20: iload #4
    //   22: aload_0
    //   23: getfield ZW : [Lburp/Ze01;
    //   26: arraylength
    //   27: if_icmpge -> 71
    //   30: aload_3
    //   31: aload_0
    //   32: getfield ZW : [Lburp/Ze01;
    //   35: iload #4
    //   37: aaload
    //   38: if_acmpne -> 64
    //   41: aload_0
    //   42: getfield Zl : Lburp/Zsic;
    //   45: iload #4
    //   47: invokeinterface Zn : (I)Lburp/Zsic;
    //   52: astore #5
    //   54: aload_0
    //   55: aload #5
    //   57: invokevirtual Zz : (Lburp/Zsic;)V
    //   60: aload_2
    //   61: ifnonnull -> 71
    //   64: iinc #4, 1
    //   67: aload_2
    //   68: ifnonnull -> 20
    //   71: return
  }
  
  public void Zz(Zsic paramZsic) {
    String str = Zbg2.Zg();
    if (paramZsic == null) {
      ZS();
      if (str == null) {
        if (paramZsic != this.Zl) {
          SwingUtilities.updateComponentTreeUI(paramZsic.ZT());
          Zf(paramZsic);
        } 
        return;
      } 
      return;
    } 
    if (paramZsic != this.Zl) {
      SwingUtilities.updateComponentTreeUI(paramZsic.ZT());
      Zf(paramZsic);
    } 
  }
  
  private void lambda$close$1() {
    if (this.Zl != null)
      this.Zl.Zc(); 
    setVisible(false);
    dispose();
    removeWindowListener(this.Zd);
  }
  
  private static void lambda$new$0(Zl0a paramZl0a) {
    if (paramZl0a.ZV || Zx6o.ZY(paramZl0a, a(-23707, -10514)))
      paramZl0a.ZS(); 
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'R|J/tL\ÔXJ§\ÒüJ´\\noµªÐÜöðÍIbÜWûsV³ë?|O·\\næ®Eü1Voé1¹ý9»^jH³@w Ö'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #41
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #45
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
    //   68: ldc 'ÿ×.ô«ÝÕkóû'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #10
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #39
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
    //   129: putstatic burp/Zl0a.a : [Ljava/lang/String;
    //   132: bipush #6
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zl0a.b : [Ljava/lang/String;
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
    //   212: bipush #79
    //   214: goto -> 244
    //   217: bipush #122
    //   219: goto -> 244
    //   222: bipush #109
    //   224: goto -> 244
    //   227: bipush #123
    //   229: goto -> 244
    //   232: bipush #75
    //   234: goto -> 244
    //   237: bipush #87
    //   239: goto -> 244
    //   242: bipush #68
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
    int i = (paramInt1 ^ 0xFFFFA365) & 0xFFFF;
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
      char c = '§';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl0a.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */