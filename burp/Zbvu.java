package burp;

import java.awt.BorderLayout;
import java.awt.event.MouseEvent;
import java.util.function.Consumer;
import javax.swing.BorderFactory;

public class Zbvu extends Zbqc {
  private static final Ze9n Zl;
  
  private static final Ze9n ZU;
  
  private static final Ze9n ZC;
  
  private static final Ze9n Zz;
  
  private Consumer<Boolean> ZP;
  
  private Zl86 ZO;
  
  private Zm9t ZW;
  
  private Zm9t Zj;
  
  private Zm9t ZY;
  
  private Zm9t ZB;
  
  private Zbqc Zy;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbvu(Runnable paramRunnable1, Runnable paramRunnable2) {
    // Byte code:
    //   0: aload_0
    //   1: new java/awt/BorderLayout
    //   4: dup
    //   5: invokespecial <init> : ()V
    //   8: invokespecial <init> : (Ljava/awt/LayoutManager;)V
    //   11: aload_0
    //   12: invokevirtual Zg : ()V
    //   15: aload_0
    //   16: getfield ZW : Lburp/Zm9t;
    //   19: getstatic burp/Zbvu.ZC : Lburp/Ze9n;
    //   22: aconst_null
    //   23: aload_0
    //   24: aload_1
    //   25: <illegal opcode> run : (Lburp/Zbvu;Ljava/lang/Runnable;)Ljava/lang/Runnable;
    //   30: invokevirtual Zv : (Lburp/Ze9n;Ljava/lang/String;Ljava/lang/Runnable;)V
    //   33: aload_0
    //   34: getfield Zj : Lburp/Zm9t;
    //   37: getstatic burp/Zbvu.Zz : Lburp/Ze9n;
    //   40: aconst_null
    //   41: aload_0
    //   42: aload_2
    //   43: <illegal opcode> run : (Lburp/Zbvu;Ljava/lang/Runnable;)Ljava/lang/Runnable;
    //   48: invokevirtual Zv : (Lburp/Ze9n;Ljava/lang/String;Ljava/lang/Runnable;)V
    //   51: aload_0
    //   52: iconst_0
    //   53: invokevirtual setOpaque : (Z)V
    //   56: aload_0
    //   57: iconst_1
    //   58: invokevirtual Zv : (Z)V
    //   61: return
  }
  
  public void Zj(String paramString) {
    this.ZO.setText(paramString);
  }
  
  public void Zm(Consumer<Boolean> paramConsumer) {
    this.ZP = paramConsumer;
  }
  
  public void Zv(boolean paramBoolean) {
    this.ZY.setEnabled(paramBoolean);
    this.ZB.setEnabled(paramBoolean);
    this.Zy.setVisible(false);
  }
  
  private void ZD() {
    this.ZP.accept(Boolean.valueOf(true));
  }
  
  private void Zi() {
    this.ZP.accept(Boolean.valueOf(false));
  }
  
  private void Zg() {
    this.ZO = new Zl8x();
    this.ZO.ZL(Zlkk.COLLAPSIBLE_COMPONENT_BACKGROUND);
    this.ZO.setBorder(BorderFactory.createEmptyBorder(0, 0, 5, 0));
    this.ZO.setEditable(false);
    this.ZO.setCaret(new Zmjt());
    this.ZO.setLineWrap(true);
    this.ZO.setWrapStyleWord(true);
    this.ZY = new Zm9t();
    this.ZY.ZE(Zl, (String)null, this::lambda$initComponents$2);
    this.ZY.setName(a(28273, 12623));
    this.ZY.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 10));
    this.ZB = new Zm9t();
    this.ZB.ZE(ZU, (String)null, this::lambda$initComponents$3);
    this.ZB.setName(a(28279, 28206));
    this.ZB.setBorder(BorderFactory.createEmptyBorder());
    this.ZW = new Zm9t();
    this.ZW.setName(a(28275, 25782));
    this.ZW.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));
    this.Zj = new Zm9t();
    this.Zj.setName(a(28277, -22905));
    Zbqc zbqc1 = new Zbqc(new BorderLayout());
    zbqc1.add(this.ZW, a(28274, -17481));
    zbqc1.add(this.Zj, a(28281, -29991));
    this.Zy = new Zbqc(new BorderLayout());
    this.Zy.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 10));
    this.Zy.setOpaque(false);
    this.Zy.add(this.ZY, a(28276, -25583));
    this.Zy.add(this.ZB, a(28280, -7864));
    Zbqc zbqc2 = new Zbqc(new BorderLayout());
    zbqc2.setOpaque(false);
    zbqc2.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
    zbqc2.add(this.Zy, a(28276, -25583));
    zbqc2.add(zbqc1, a(28280, -7864));
    Zem9 zem9 = new Zem9();
    zem9.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
    Zbqc zbqc3 = new Zbqc(new BorderLayout());
    zbqc3.setOpaque(false);
    zbqc3.add(zem9, a(28272, -22502));
    zbqc3.add(zbqc2);
    add(this.ZO);
    add(zbqc3, a(28278, -21169));
  }
  
  private void lambda$initComponents$3(MouseEvent paramMouseEvent) {
    Zi();
  }
  
  private void lambda$initComponents$2(MouseEvent paramMouseEvent) {
    ZD();
  }
  
  private void lambda$new$1(Runnable paramRunnable) {
    paramRunnable.run();
    this.Zj.ZI();
  }
  
  private void lambda$new$0(Runnable paramRunnable) {
    paramRunnable.run();
    this.ZW.ZI();
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'N¥½÷(_T'À\\n/¨2\\n<FfjÇmrÞ \\fßæÃ³é¶dî6! ;¦ªW-îÜ4Ùûût?fþøZ<üëøEpÎ¬k­×I Ë´Çî0³ù/ûÞnêÁ@#Ér^)óJÖvëÜ7uÑGÉÏpµC±á­7(õ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #25
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #57
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
    //   68: ldc '¸U895'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_4
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #35
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
    //   128: putstatic burp/Zbvu.a : [Ljava/lang/String;
    //   131: bipush #10
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbvu.b : [Ljava/lang/String;
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
    //   212: bipush #14
    //   214: goto -> 244
    //   217: bipush #48
    //   219: goto -> 244
    //   222: bipush #10
    //   224: goto -> 244
    //   227: bipush #100
    //   229: goto -> 244
    //   232: bipush #120
    //   234: goto -> 244
    //   237: bipush #117
    //   239: goto -> 244
    //   242: bipush #84
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
    //   300: getstatic burp/Zeuf.THUMBS_UP : Lburp/Zeuf;
    //   303: getstatic burp/Zlkk.ACTION_NORMAL : Lburp/Zlkk;
    //   306: invokestatic ZC : (Lburp/Zeuf;Lburp/Zlkk;)Lburp/Ze3m;
    //   309: getstatic burp/Zlkk.RADIO_BAR_ACTIVE_FOREGROUND : Lburp/Zlkk;
    //   312: invokevirtual Zc : (Lburp/Zlkk;)Lburp/Ze3m;
    //   315: getstatic burp/Zlkk.RADIO_BAR_INACTIVE_HOVER_FOREGROUND : Lburp/Zlkk;
    //   318: invokevirtual ZG : (Lburp/Zlkk;)Lburp/Ze3m;
    //   321: getstatic burp/Zmcx.LARGE_LINE_SIZE : Lburp/Zmcx;
    //   324: invokevirtual ZU : (Lburp/Zmcx;)Lburp/Ze3m;
    //   327: invokevirtual Z_ : ()Lburp/Ze9n;
    //   330: putstatic burp/Zbvu.Zl : Lburp/Ze9n;
    //   333: getstatic burp/Zeuf.THUMBS_DOWN : Lburp/Zeuf;
    //   336: getstatic burp/Zlkk.ACTION_NORMAL : Lburp/Zlkk;
    //   339: invokestatic ZC : (Lburp/Zeuf;Lburp/Zlkk;)Lburp/Ze3m;
    //   342: getstatic burp/Zlkk.RADIO_BAR_ACTIVE_FOREGROUND : Lburp/Zlkk;
    //   345: invokevirtual Zc : (Lburp/Zlkk;)Lburp/Ze3m;
    //   348: getstatic burp/Zlkk.RADIO_BAR_INACTIVE_HOVER_FOREGROUND : Lburp/Zlkk;
    //   351: invokevirtual ZG : (Lburp/Zlkk;)Lburp/Ze3m;
    //   354: getstatic burp/Zmcx.LARGE_LINE_SIZE : Lburp/Zmcx;
    //   357: invokevirtual ZU : (Lburp/Zmcx;)Lburp/Ze3m;
    //   360: invokevirtual Z_ : ()Lburp/Ze9n;
    //   363: putstatic burp/Zbvu.ZU : Lburp/Ze9n;
    //   366: getstatic burp/Zeuf.DELETE : Lburp/Zeuf;
    //   369: getstatic burp/Zlkk.ACTION_NORMAL : Lburp/Zlkk;
    //   372: invokestatic ZC : (Lburp/Zeuf;Lburp/Zlkk;)Lburp/Ze3m;
    //   375: getstatic burp/Zlkk.ACTION_HOVER : Lburp/Zlkk;
    //   378: invokevirtual ZG : (Lburp/Zlkk;)Lburp/Ze3m;
    //   381: getstatic burp/Zlkk.ACTION_PRESSED : Lburp/Zlkk;
    //   384: invokevirtual Zc : (Lburp/Zlkk;)Lburp/Ze3m;
    //   387: getstatic burp/Zlkk.ACTION_PRESSED : Lburp/Zlkk;
    //   390: invokevirtual Zr : (Lburp/Zlkk;)Lburp/Ze3m;
    //   393: getstatic burp/Zmcx.LARGE_LINE_SIZE : Lburp/Zmcx;
    //   396: invokevirtual ZU : (Lburp/Zmcx;)Lburp/Ze3m;
    //   399: invokevirtual Z_ : ()Lburp/Ze9n;
    //   402: putstatic burp/Zbvu.ZC : Lburp/Ze9n;
    //   405: getstatic burp/Zeuf.RESTORE_DEFAULTS : Lburp/Zeuf;
    //   408: getstatic burp/Zlkk.ACTION_NORMAL : Lburp/Zlkk;
    //   411: invokestatic ZC : (Lburp/Zeuf;Lburp/Zlkk;)Lburp/Ze3m;
    //   414: getstatic burp/Zlkk.ACTION_HOVER : Lburp/Zlkk;
    //   417: invokevirtual ZG : (Lburp/Zlkk;)Lburp/Ze3m;
    //   420: getstatic burp/Zlkk.ACTION_PRESSED : Lburp/Zlkk;
    //   423: invokevirtual Zc : (Lburp/Zlkk;)Lburp/Ze3m;
    //   426: getstatic burp/Zlkk.ACTION_PRESSED : Lburp/Zlkk;
    //   429: invokevirtual Zr : (Lburp/Zlkk;)Lburp/Ze3m;
    //   432: getstatic burp/Zmcx.LARGE_LINE_SIZE : Lburp/Zmcx;
    //   435: invokevirtual ZU : (Lburp/Zmcx;)Lburp/Ze3m;
    //   438: invokevirtual Z_ : ()Lburp/Ze9n;
    //   441: putstatic burp/Zbvu.Zz : Lburp/Ze9n;
    //   444: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6E71) & 0xFFFF;
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
      char c = 'Ä';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbvu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */