package burp;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;

public class Zg8l extends Zbqc {
  private Runnable Zk;
  
  private Zbqc Za;
  
  private Zm9t Zl;
  
  private JScrollPane ZQ;
  
  private Zl86 ZW;
  
  private Box.Filler ZM;
  
  private Box.Filler ZF;
  
  private Box.Filler ZR;
  
  private Box.Filler Zg;
  
  private Zm9b ZI;
  
  private Zem9 ZA;
  
  private Zm99 ZD;
  
  private Zbqc Zi;
  
  private Ze0q Z_;
  
  private Ze01 Zw;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zg8l(String paramString1, String paramString2, Runnable paramRunnable) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: <illegal opcode> run : ()Ljava/lang/Runnable;
    //   10: putfield Zk : Ljava/lang/Runnable;
    //   13: invokestatic ZQ : ()[I
    //   16: aload_0
    //   17: invokevirtual Zz : ()V
    //   20: astore #4
    //   22: aload_0
    //   23: getfield ZD : Lburp/Zm99;
    //   26: getstatic burp/Zt00.TITLE_BOLD_FONT : Lburp/Zt00;
    //   29: invokevirtual ZE : (Lburp/Zt00;)V
    //   32: aload_0
    //   33: getfield ZD : Lburp/Zm99;
    //   36: getstatic burp/Zlkk.BURP_TITLE : Lburp/Zlkk;
    //   39: invokevirtual Ze : (Lburp/Zlkk;)V
    //   42: getstatic burp/Zeuf.CLOSE : Lburp/Zeuf;
    //   45: getstatic burp/Zlkk.ACTION_NORMAL : Lburp/Zlkk;
    //   48: invokestatic ZC : (Lburp/Zeuf;Lburp/Zlkk;)Lburp/Ze3m;
    //   51: getstatic burp/Zmcx.EXTRA_LARGE_LINE_SIZE : Lburp/Zmcx;
    //   54: invokevirtual ZU : (Lburp/Zmcx;)Lburp/Ze3m;
    //   57: getstatic burp/Zlkk.ACTION_HOVER : Lburp/Zlkk;
    //   60: invokevirtual ZG : (Lburp/Zlkk;)Lburp/Ze3m;
    //   63: invokevirtual Z_ : ()Lburp/Ze9n;
    //   66: astore #5
    //   68: aload_0
    //   69: getfield Zl : Lburp/Zm9t;
    //   72: aload #5
    //   74: sipush #20144
    //   77: sipush #-2718
    //   80: invokestatic a : (II)Ljava/lang/String;
    //   83: aload_0
    //   84: <illegal opcode> run : (Lburp/Zg8l;)Ljava/lang/Runnable;
    //   89: invokevirtual Zv : (Lburp/Ze9n;Ljava/lang/String;Ljava/lang/Runnable;)V
    //   92: aload_1
    //   93: ifnull -> 103
    //   96: aload_1
    //   97: invokevirtual isBlank : ()Z
    //   100: ifeq -> 123
    //   103: aload_0
    //   104: getfield ZQ : Ljavax/swing/JScrollPane;
    //   107: iconst_0
    //   108: invokevirtual setVisible : (Z)V
    //   111: aload #4
    //   113: ifnull -> 151
    //   116: iconst_3
    //   117: anewarray burp/Zbqc
    //   120: invokestatic Zr : ([Lburp/Zbqc;)V
    //   123: aload_0
    //   124: getfield ZW : Lburp/Zl86;
    //   127: aload_1
    //   128: invokevirtual setText : (Ljava/lang/String;)V
    //   131: aload_0
    //   132: getfield ZQ : Ljavax/swing/JScrollPane;
    //   135: invokevirtual getVerticalScrollBar : ()Ljavax/swing/JScrollBar;
    //   138: astore #6
    //   140: aload #6
    //   142: getstatic burp/Zlkk.PANEL_BACKGROUND : Lburp/Zlkk;
    //   145: invokevirtual ZS : ()Ljava/awt/Color;
    //   148: invokevirtual setBackground : (Ljava/awt/Color;)V
    //   151: aload_0
    //   152: getfield ZI : Lburp/Zm9b;
    //   155: aload_2
    //   156: invokevirtual ZP : (Ljava/lang/String;)V
    //   159: aload_0
    //   160: getfield Zw : Lburp/Ze01;
    //   163: aload_0
    //   164: <illegal opcode> actionPerformed : (Lburp/Zg8l;)Ljava/awt/event/ActionListener;
    //   169: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   172: aload_0
    //   173: getfield Z_ : Lburp/Ze0q;
    //   176: aload_3
    //   177: <illegal opcode> actionPerformed : (Ljava/lang/Runnable;)Ljava/awt/event/ActionListener;
    //   182: invokevirtual addActionListener : (Ljava/awt/event/ActionListener;)V
    //   185: return
  }
  
  public void ZL() {
    SwingUtilities.invokeLater(this::lambda$resetDescriptionScrollToTop$4);
  }
  
  public void ZE(Runnable paramRunnable) {
    this.Zk = paramRunnable;
  }
  
  private void Zz() {
    this.Zi = new Zbqc();
    this.ZD = new Zm99();
    this.Zg = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(32767, 0));
    this.Zl = new Zm9t();
    this.ZQ = new JScrollPane();
    this.ZW = new Zl86();
    this.ZI = new Zm9b();
    this.ZA = new Zem9();
    this.Za = new Zbqc();
    this.ZF = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(32767, 0));
    this.Zw = new Ze01();
    this.ZM = new Box.Filler(new Dimension(15, 0), new Dimension(15, 0), new Dimension(15, 32767));
    this.Z_ = new Ze0q();
    this.ZR = new Box.Filler(new Dimension(0, 0), new Dimension(0, 0), new Dimension(32767, 0));
    setLayout(new GridBagLayout());
    this.Zi.setLayout(new BoxLayout(this.Zi, 2));
    this.ZD.setText(a(20145, 29181));
    this.Zi.add(this.ZD);
    this.Zi.add(this.Zg);
    this.Zi.add(this.Zl);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zi, gridBagConstraints);
    this.ZQ.setBorder((Border)null);
    this.ZQ.setHorizontalScrollBarPolicy(31);
    this.ZW.setEditable(false);
    this.ZW.setBackground(Zlkk.PANEL_BACKGROUND.ZS());
    this.ZW.setBorder((Border)null);
    this.ZW.setLineWrap(true);
    this.ZW.setRows(3);
    this.ZW.setToolTipText("");
    this.ZW.setWrapStyleWord(true);
    this.ZW.setFocusable(false);
    this.ZQ.setViewportView(this.ZW);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(20, 0, 0, 0);
    add(this.ZQ, gridBagConstraints);
    this.ZI.setText(a(20147, -9385));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(20, 0, 0, 0);
    add(this.ZI, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(20, 0, 0, 0);
    add(this.ZA, gridBagConstraints);
    this.Za.setLayout(new BoxLayout(this.Za, 2));
    this.Za.add(this.ZF);
    this.Zw.setText(a(20148, 29238));
    this.Za.add(this.Zw);
    this.Za.add(this.ZM);
    this.Z_.setText(a(20146, 19046));
    this.Za.add(this.Z_);
    this.Za.add(this.ZR);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(20, 0, 0, 0);
    add(this.Za, gridBagConstraints);
  }
  
  private void lambda$resetDescriptionScrollToTop$4() {
    JScrollBar jScrollBar = this.ZQ.getVerticalScrollBar();
    jScrollBar.setValue(0);
  }
  
  private static void lambda$new$3(Runnable paramRunnable, ActionEvent paramActionEvent) {
    paramRunnable.run();
  }
  
  private void lambda$new$2(ActionEvent paramActionEvent) {
    this.Zk.run();
  }
  
  private void lambda$new$1() {
    this.Zk.run();
  }
  
  private static void lambda$new$0() {}
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'ÄHÜI¿\\fÈ/>ÖÜ:î(,n}6 (êæù$¯4Ææ]Eóøóº6? '
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_5
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #44
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 140
    //   38: aload #5
    //   40: swap
    //   41: iload_3
    //   42: iinc #3, 1
    //   45: swap
    //   46: aastore
    //   47: iload_0
    //   48: iload_1
    //   49: iadd
    //   50: dup
    //   51: istore_0
    //   52: iload #4
    //   54: if_icmpge -> 66
    //   57: aload_2
    //   58: iload_0
    //   59: invokevirtual charAt : (I)C
    //   62: istore_1
    //   63: goto -> 21
    //   66: ldc 'ªäÐ'ñâ¤XcôìpúQò&Ç,`útÔhív@J$u'
    //   68: dup
    //   69: astore_2
    //   70: invokevirtual length : ()I
    //   73: istore #4
    //   75: bipush #17
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #59
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 140
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic burp/Zg8l.a : [Ljava/lang/String;
    //   130: iconst_5
    //   131: anewarray java/lang/String
    //   134: putstatic burp/Zg8l.b : [Ljava/lang/String;
    //   137: goto -> 296
    //   140: dup_x2
    //   141: pop
    //   142: invokevirtual toCharArray : ()[C
    //   145: dup_x1
    //   146: arraylength
    //   147: dup_x2
    //   148: pop
    //   149: iconst_0
    //   150: istore #6
    //   152: dup2_x1
    //   153: pop2
    //   154: dup_x2
    //   155: iconst_1
    //   156: if_icmpgt -> 256
    //   159: dup2
    //   160: swap
    //   161: iload #6
    //   163: dup2_x1
    //   164: caload
    //   165: swap
    //   166: iload #6
    //   168: bipush #7
    //   170: irem
    //   171: tableswitch default -> 238, 0 -> 208, 1 -> 213, 2 -> 218, 3 -> 223, 4 -> 228, 5 -> 233
    //   208: bipush #113
    //   210: goto -> 240
    //   213: bipush #101
    //   215: goto -> 240
    //   218: bipush #72
    //   220: goto -> 240
    //   223: bipush #66
    //   225: goto -> 240
    //   228: bipush #108
    //   230: goto -> 240
    //   233: bipush #68
    //   235: goto -> 240
    //   238: bipush #101
    //   240: ixor
    //   241: ixor
    //   242: i2c
    //   243: castore
    //   244: iinc #6, 1
    //   247: dup
    //   248: ifne -> 256
    //   251: dup2
    //   252: dup_x1
    //   253: goto -> 163
    //   256: dup2_x1
    //   257: pop2
    //   258: dup_x2
    //   259: iload #6
    //   261: if_icmpgt -> 159
    //   264: pop
    //   265: new java/lang/String
    //   268: dup_x1
    //   269: swap
    //   270: invokespecial <init> : ([C)V
    //   273: invokevirtual intern : ()Ljava/lang/String;
    //   276: swap
    //   277: pop
    //   278: swap
    //   279: tableswitch default -> 38, 0 -> 97
    //   296: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x4EB0) & 0xFFFF;
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
      byte b1 = 54;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg8l.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */