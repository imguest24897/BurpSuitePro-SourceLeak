package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.Collection;
import java.util.Locale;
import java.util.Set;
import javax.swing.ButtonGroup;

public class Zba6 extends Zbv5 implements Zt3u {
  private final Zr1m ZN;
  
  private final Zqe Zl;
  
  private final Zggn ZO;
  
  private final Set<String> Zy;
  
  private ButtonGroup ZT;
  
  private Zzdy Zk;
  
  private Zzdy ZL;
  
  private Zzdy ZX;
  
  private Zzdy ZW;
  
  private Zzdy Zu;
  
  private Zzdy ZR;
  
  private Zzdy ZH;
  
  private Zzdy Zo;
  
  private Zzdy Zc;
  
  private Zl8w Zg;
  
  private Zbqc ZJ;
  
  private static boolean Za;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zba6(Zqe paramZqe, Zr1m paramZr1m) {
    this(paramZqe, paramZr1m, (Zggn)null);
  }
  
  public Zba6(Zqe paramZqe, Zr1m paramZr1m, Zggn paramZggn) {
    this.Zl = paramZqe;
    this.ZN = paramZr1m;
    this.ZO = paramZggn;
    this.Zy = Set.of(new String[] { 
          Zjd(), a(-30282, 8233), a(-30285, 15498), a(-30283, 30368), a(-30300, -24936), a(-30281, 31068), a(-30274, 29589), a(-30303, -26768), a(-30279, 2055), a(-30273, 30788), 
          a(-30302, 7890) });
    Zd();
    setName(a(-30286, -26784));
    Zt2();
  }
  
  public String Zjd() {
    return a(-30287, -18245);
  }
  
  public String ZjS() {
    return a(-30284, 9325);
  }
  
  public Component ZjY() {
    Zbkr zbkr = new Zbkr();
    zbkr.ZM(Zjd().toLowerCase(Locale.ENGLISH), Zk97.DESKTOP_TOOLS_SEQUENCER_OPTIONS_TOKEN_ANALYSIS, this.ZN, this, true, new String[] { a(-30275, -3219) });
    return zbkr;
  }
  
  public Collection<String> ZjD() {
    return this.Zy;
  }
  
  public void Zt2() {
    this.ZX.setSelected(this.Zl.ZGJ());
    this.ZW.setSelected(this.Zl.ZGv());
    this.ZR.setSelected(this.Zl.ZGB());
    this.ZH.setSelected(this.Zl.ZGP());
    this.Zo.setSelected(this.Zl.ZGu());
    this.Zu.setSelected(this.Zl.ZGx());
    this.Zc.setSelected(this.Zl.ZGf());
    this.ZL.setSelected(this.Zl.ZGe());
    this.Zk.setSelected(this.Zl.ZGd());
    ZQ();
  }
  
  private void ZQ() {
    if (this.ZO != null)
      this.ZO.Zf(); 
  }
  
  private void Zd() {
    this.ZT = new ButtonGroup();
    this.ZX = new Zzdy();
    this.ZW = new Zzdy();
    this.Zg = new Zl8w();
    this.ZJ = new Zbqc();
    this.Zu = new Zzdy();
    this.ZH = new Zzdy();
    this.Zo = new Zzdy();
    this.ZR = new Zzdy();
    this.Zc = new Zzdy();
    this.ZL = new Zzdy();
    this.Zk = new Zzdy();
    GridBagLayout gridBagLayout1 = new GridBagLayout();
    gridBagLayout1.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout1.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout1);
    this.ZX.setText(a(-30288, -14724));
    this.ZX.addActionListener(new Zgip(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 18;
    add(this.ZX, gridBagConstraints);
    this.ZW.setText(a(-30297, -12136));
    this.ZW.addActionListener(new Zka6(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 18;
    add(this.ZW, gridBagConstraints);
    this.Zg.setText(a(-30277, -13962));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 9;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.Zg, gridBagConstraints);
    GridBagLayout gridBagLayout2 = new GridBagLayout();
    gridBagLayout2.columnWidths = new int[] { 0, 20, 0 };
    gridBagLayout2.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    this.ZJ.setLayout(gridBagLayout2);
    this.Zu.setText(a(-30299, 19994));
    this.Zu.addActionListener(new Zzcp(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 18;
    this.ZJ.add(this.Zu, gridBagConstraints);
    this.ZH.setText(a(-30304, 13341));
    this.ZH.addActionListener(new Zgn5(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 18;
    this.ZJ.add(this.ZH, gridBagConstraints);
    this.Zo.setText(a(-30301, -12768));
    this.Zo.addActionListener(new Zke2(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 18;
    this.ZJ.add(this.Zo, gridBagConstraints);
    this.ZR.setText(a(-30298, 29083));
    this.ZR.addActionListener(new Zrfw(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 18;
    this.ZJ.add(this.ZR, gridBagConstraints);
    this.Zc.setText(a(-30276, -5420));
    this.Zc.addActionListener(new Zrhw(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 18;
    this.ZJ.add(this.Zc, gridBagConstraints);
    this.ZL.setText(a(-30278, 4988));
    this.ZL.addActionListener(new Zeis(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 18;
    this.ZJ.add(this.ZL, gridBagConstraints);
    this.Zk.setText(a(-30280, -3549));
    this.Zk.addActionListener(new Zgtt(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 18;
    this.ZJ.add(this.Zk, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 18;
    add(this.ZJ, gridBagConstraints);
  }
  
  private void ZG(ActionEvent paramActionEvent) {
    this.Zl.ZK9(this.ZX.isSelected());
    ZQ();
  }
  
  private void Zo(ActionEvent paramActionEvent) {
    this.Zl.ZKP(this.ZW.isSelected());
    ZQ();
  }
  
  private void ZM(ActionEvent paramActionEvent) {
    this.Zl.ZKx(this.ZR.isSelected());
    ZQ();
  }
  
  private void ZF(ActionEvent paramActionEvent) {
    this.Zl.ZKa(this.ZH.isSelected());
    ZQ();
  }
  
  private void Zw(ActionEvent paramActionEvent) {
    this.Zl.ZKI(this.Zo.isSelected());
    ZQ();
  }
  
  private void Zx(ActionEvent paramActionEvent) {
    this.Zl.ZK_(this.Zu.isSelected());
    ZQ();
  }
  
  private void Zj(ActionEvent paramActionEvent) {
    this.Zl.ZK3(this.Zc.isSelected());
    ZQ();
  }
  
  private void ZW(ActionEvent paramActionEvent) {
    this.Zl.ZKw(this.ZL.isSelected());
    ZQ();
  }
  
  private void Zi(ActionEvent paramActionEvent) {
    this.Zl.ZKu(this.Zk.isSelected());
    ZQ();
  }
  
  public static void ZY(boolean paramBoolean) {
    Za = paramBoolean;
  }
  
  public static boolean ZT() {
    return Za;
  }
  
  public static boolean ZY() {
    boolean bool = ZT();
    return !bool;
  }
  
  static {
    // Byte code:
    //   0: bipush #24
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ':)6)Ó_ßY2Y¶C[¿sí^¢ë:Ë7Z2ÏhåUR>ék|14Xë|ñÿ®Z%î#òúî03[Ú­\\tôªr; t}ÞÀA»~éDã±9vY5e3Y¶ñÁ¤\\nHa'ÓNÏo m¦Éð'®ÛTK:N¾ûì¾\!>°R:1Ó×#Ð¸<~*ÀaYN\íó]Õ¸.×(/¶\\t³Føì\\bv(\\tG_ù§· 6wÕnó{öYÌ¶ÀÁ\\tmËæG=^fuE@ÛE]Ê°AA!:¢¥\\bð·#^@µëÓÎB1AkW \\bSÐÔU½ï¤YõÚ}5^©©~'K¡¦UL¹EÙ úèqD¸ÞñÉ/i¨\\n°cíÝâC;æ[6ÑÛ{[8#³u\\rÅ'\\fÿ¥ÑKÕ@q\\r\\r °.í±o\\n6ó&u\\f4é}ö¢pIýhþÛá¯/kn³ô\\n<­~!aÕÐ\\rÊéwÂp2*1tÆ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #80
    //   20: istore_1
    //   21: iconst_1
    //   22: iconst_m1
    //   23: istore_0
    //   24: invokestatic ZY : (Z)V
    //   27: bipush #81
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
    //   72: ldc '®­wXBO¯m¡\\tEßlî¨!O+±'
    //   74: dup
    //   75: astore_2
    //   76: invokevirtual length : ()I
    //   79: istore #4
    //   81: bipush #11
    //   83: istore_1
    //   84: iconst_m1
    //   85: istore_0
    //   86: bipush #94
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
    //   133: putstatic burp/Zba6.a : [Ljava/lang/String;
    //   136: bipush #24
    //   138: anewarray java/lang/String
    //   141: putstatic burp/Zba6.b : [Ljava/lang/String;
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
    //   216: bipush #69
    //   218: goto -> 248
    //   221: bipush #14
    //   223: goto -> 248
    //   226: bipush #39
    //   228: goto -> 248
    //   231: bipush #114
    //   233: goto -> 248
    //   236: bipush #46
    //   238: goto -> 248
    //   241: bipush #108
    //   243: goto -> 248
    //   246: bipush #91
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
    int i = (paramInt1 ^ 0xFFFF89B4) & 0xFFFF;
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
      char c = 'Ì';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zba6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */