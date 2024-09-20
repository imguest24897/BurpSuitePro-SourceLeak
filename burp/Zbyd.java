package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.ButtonGroup;

class Zbyd extends Zbyv implements Zl_2 {
  private final Zz0n Zj;
  
  private final Zt4u ZG;
  
  private final Zs1b Zv;
  
  private Zm99 ZY;
  
  private ButtonGroup ZL;
  
  private Ze01 ZM;
  
  private Ze01 ZQ;
  
  private Zm2o Zd;
  
  private Zg85 Zh;
  
  private Zg85 Zr;
  
  private Zmg2 Zf;
  
  private Zmg2 Zk;
  
  private Zl8w ZB;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbyd(Zz0n paramZz0n, Zt4u paramZt4u, Zs1b paramZs1b, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: invokestatic ZI : ()Z
    //   7: aload_0
    //   8: aload_1
    //   9: putfield Zj : Lburp/Zz0n;
    //   12: aload_0
    //   13: aload_2
    //   14: putfield ZG : Lburp/Zt4u;
    //   17: aload_0
    //   18: aload_3
    //   19: putfield Zv : Lburp/Zs1b;
    //   22: istore #5
    //   24: aload_0
    //   25: invokevirtual ZH : ()V
    //   28: iload #4
    //   30: ifeq -> 49
    //   33: aload_0
    //   34: getfield ZB : Lburp/Zl8w;
    //   37: iconst_0
    //   38: invokevirtual setVisible : (Z)V
    //   41: aload_0
    //   42: getfield Zd : Lburp/Zm2o;
    //   45: iconst_0
    //   46: invokevirtual setVisible : (Z)V
    //   49: aload_3
    //   50: invokevirtual Zk : ()B
    //   53: lookupswitch default -> 101, 0 -> 80, 1 -> 93
    //   80: aload_0
    //   81: getfield Zf : Lburp/Zmg2;
    //   84: iconst_1
    //   85: invokevirtual setSelected : (Z)V
    //   88: iload #5
    //   90: ifne -> 101
    //   93: aload_0
    //   94: getfield Zk : Lburp/Zmg2;
    //   97: iconst_1
    //   98: invokevirtual setSelected : (Z)V
    //   101: aload_0
    //   102: getfield Zh : Lburp/Zg85;
    //   105: aload_3
    //   106: invokevirtual ZS : ()Ljava/util/List;
    //   109: invokestatic Zp : (Ljava/util/List;)Ljava/lang/String;
    //   112: invokevirtual setText : (Ljava/lang/String;)V
    //   115: aload_0
    //   116: getfield Zh : Lburp/Zg85;
    //   119: iconst_0
    //   120: invokevirtual setCaretPosition : (I)V
    //   123: aload_0
    //   124: getfield Zr : Lburp/Zg85;
    //   127: aload_3
    //   128: invokevirtual ZK : ()Ljava/util/List;
    //   131: invokestatic Zp : (Ljava/util/List;)Ljava/lang/String;
    //   134: invokevirtual setText : (Ljava/lang/String;)V
    //   137: aload_0
    //   138: getfield Zr : Lburp/Zg85;
    //   141: iconst_0
    //   142: invokevirtual setCaretPosition : (I)V
    //   145: return
  }
  
  public String ZW() {
    return null;
  }
  
  public void Zz(List<String> paramList) {
    // Byte code:
    //   0: invokestatic ZI : ()Z
    //   3: istore_2
    //   4: aload_1
    //   5: aload_0
    //   6: getfield Zv : Lburp/Zs1b;
    //   9: invokevirtual ZS : ()Ljava/util/List;
    //   12: if_acmpne -> 38
    //   15: aload_0
    //   16: getfield Zh : Lburp/Zg85;
    //   19: aload_1
    //   20: invokestatic Zp : (Ljava/util/List;)Ljava/lang/String;
    //   23: invokevirtual setText : (Ljava/lang/String;)V
    //   26: aload_0
    //   27: getfield Zh : Lburp/Zg85;
    //   30: iconst_0
    //   31: invokevirtual setCaretPosition : (I)V
    //   34: iload_2
    //   35: ifne -> 79
    //   38: aload_1
    //   39: aload_0
    //   40: getfield Zv : Lburp/Zs1b;
    //   43: invokevirtual ZK : ()Ljava/util/List;
    //   46: if_acmpne -> 72
    //   49: aload_0
    //   50: getfield Zr : Lburp/Zg85;
    //   53: aload_1
    //   54: invokestatic Zp : (Ljava/util/List;)Ljava/lang/String;
    //   57: invokevirtual setText : (Ljava/lang/String;)V
    //   60: aload_0
    //   61: getfield Zr : Lburp/Zg85;
    //   64: iconst_0
    //   65: invokevirtual setCaretPosition : (I)V
    //   68: iload_2
    //   69: ifne -> 79
    //   72: iconst_0
    //   73: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   76: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   79: return
  }
  
  private void ZH() {
    this.ZL = new ButtonGroup();
    this.ZB = new Zl8w();
    this.Zd = new Zm2o();
    this.Zf = new Zmg2();
    this.Zk = new Zmg2();
    this.Zh = new Zg85();
    this.ZM = new Ze01();
    this.Zr = new Zg85();
    this.ZQ = new Ze01();
    this.ZY = new Zm99();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.ZB.setText(a(3505, 30281));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZB, gridBagConstraints);
    this.Zd.Zi(Zk97.DESKTOP_OPTIONS_SESSIONS_RULE_EDITOR_USE_COOKIES_FROM_THE_SESSION_HANDLING_COOKIE_JAR);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 5;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    add(this.Zd, gridBagConstraints);
    this.ZL.add(this.Zf);
    this.Zf.setText(a(3504, -14323));
    this.Zf.addActionListener(new Zr6w(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zf, gridBagConstraints);
    this.ZL.add(this.Zk);
    this.Zk.setText(a(3507, 12945));
    this.Zk.addActionListener(new Zs10(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    add(this.Zk, gridBagConstraints);
    this.Zh.setColumns(30);
    this.Zh.setEditable(false);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 3;
    gridBagConstraints.anchor = 1280;
    add(this.Zh, gridBagConstraints);
    this.ZM.setText(a(3506, -24636));
    this.ZM.addActionListener(new Zz42(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    add(this.ZM, gridBagConstraints);
    this.Zr.setColumns(30);
    this.Zr.setEditable(false);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = 3;
    gridBagConstraints.anchor = 1280;
    add(this.Zr, gridBagConstraints);
    this.ZQ.setText(a(3509, 23200));
    this.ZQ.addActionListener(new Ze1t(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZQ, gridBagConstraints);
    this.ZY.setText(a(3508, 29285));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    add(this.ZY, gridBagConstraints);
  }
  
  private void ZM(ActionEvent paramActionEvent) {
    Window window = Zt2m.ZF(this);
    new Zrhd(window, this.Zj, this.ZG, this, this.Zv.ZS());
  }
  
  private void ZS(ActionEvent paramActionEvent) {
    Window window = Zt2m.ZF(this);
    new Zrhd(window, this.Zj, this.ZG, this, this.Zv.ZK());
  }
  
  private void Zl(ActionEvent paramActionEvent) {
    this.Zv.ZX((byte)0);
  }
  
  private void ZB(ActionEvent paramActionEvent) {
    this.Zv.ZX((byte)1);
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '\\nñ£z¼­IK9&_u¡ùO3hËÍ{Tl¡_ûô¦KãöfÍ¯ì?Ó²¯\\nì«âôAfäP§e´}n2G+Ð¦êº )îÑ¾sòdÇMlº-*Ü5I´öÛæ(­RÝä&ß8(ö|=T\V(ÎS8"ð¨Ww*sïn$ñ#£óHGßÍ(âûl¨¾Êb6ËØ]'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #30
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #72
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
    //   68: ldc 'éæ¬â)ª4ó'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_5
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #107
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
    //   128: putstatic burp/Zbyd.a : [Ljava/lang/String;
    //   131: bipush #6
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbyd.b : [Ljava/lang/String;
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
    //   158: if_icmpgt -> 259
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 241, 0 -> 212, 1 -> 216, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: iconst_5
    //   213: goto -> 243
    //   216: bipush #25
    //   218: goto -> 243
    //   221: bipush #51
    //   223: goto -> 243
    //   226: bipush #31
    //   228: goto -> 243
    //   231: bipush #123
    //   233: goto -> 243
    //   236: bipush #23
    //   238: goto -> 243
    //   241: bipush #94
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 165
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 161
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xDB0) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbyd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */