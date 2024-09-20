package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.util.Collection;
import java.util.Set;
import javax.swing.ButtonGroup;
import javax.swing.JSeparator;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zbmm extends Zbv5 implements Zt3u {
  private final Zkee Zq;
  
  private final Zr1m Zy;
  
  private final Zgb6 ZS;
  
  private final Set<String> ZE;
  
  private Zmg2 ZU;
  
  private Zmg2 ZF;
  
  private ButtonGroup ZH;
  
  private Zm99 Zn;
  
  private Zm99 ZT;
  
  private Zbqc Z_;
  
  private Zbqc Zz;
  
  private Zmg2 ZA;
  
  private ButtonGroup ZL;
  
  private Zmg2 Za;
  
  private JSeparator ZV;
  
  private static Zbqc[] ZQ;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zbmm(Zkee paramZkee, Zr1m paramZr1m, Zgb6 paramZgb6) {
    this.Zq = paramZkee;
    this.Zy = paramZr1m;
    this.ZS = paramZgb6;
    this.ZE = Set.of(Zjd(), a(5486, 8279), a(5473, -31805), a(5481, -7024), a(5500, 14160), a(5482, -6712), a(5487, -1066), a(5497, 22183));
    Zbqc[] arrayOfZbqc = Zi();
    Za();
    Zt2();
    Zy();
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  private void Zy() {
    setName(a(5503, -5925));
    this.ZA.setName(a(5476, -14039));
    this.Za.setName(a(5483, 10923));
    this.ZU.setName(a(5498, 19591));
    this.ZF.setName(a(5496, 29362));
  }
  
  public String Zjd() {
    return a(5480, 6833);
  }
  
  public String ZjS() {
    return a(5474, 1688);
  }
  
  public Component ZjY() {
    Zbkr zbkr = new Zbkr();
    zbkr.ZP(a(5477, -19258), Zk97.DESKTOP_FUNCTIONS_MESSAGE_EDITOR_INSPECTOR_POSITION_AND_DISPLAY_OPTIONS, this.Zy, new String[] { a(5485, 18769), a(5502, 20253) });
    Zbqc[] arrayOfZbqc = Zi();
    if (Zbqc.Zwu() == null)
      ZZ(new Zbqc[4]); 
    return zbkr;
  }
  
  public Collection<String> ZjD() {
    return this.ZE;
  }
  
  public void Zt2() {
    Zn();
    ZO();
    this.Zq.Zw();
  }
  
  private void Zn() {
    Zbqc[] arrayOfZbqc = Zi();
    Zrpp zrpp = this.Zq.ZW();
    switch (Zg1p.ZG[zrpp.ordinal()]) {
      case 1:
        this.ZA.setSelected(true);
        if (arrayOfZbqc == null);
        return;
      case 2:
        this.Za.setSelected(true);
        if (arrayOfZbqc == null)
          break; 
        return;
    } 
    Zuh.Zb(false, Zqf.Zr);
  }
  
  private void ZO() {
    // Byte code:
    //   0: invokestatic Zi : ()[Lburp/Zbqc;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Zq : Lburp/Zkee;
    //   8: invokevirtual Z_ : ()Lburp/Zmsv;
    //   11: astore_2
    //   12: aload_2
    //   13: getstatic burp/Zmsv.AUTO_EXPAND : Lburp/Zmsv;
    //   16: if_acmpne -> 31
    //   19: aload_0
    //   20: getfield ZF : Lburp/Zmg2;
    //   23: iconst_1
    //   24: invokevirtual setSelected : (Z)V
    //   27: aload_1
    //   28: ifnonnull -> 57
    //   31: aload_2
    //   32: getstatic burp/Zmsv.COLLAPSED : Lburp/Zmsv;
    //   35: if_acmpne -> 50
    //   38: aload_0
    //   39: getfield ZU : Lburp/Zmg2;
    //   42: iconst_1
    //   43: invokevirtual setSelected : (Z)V
    //   46: aload_1
    //   47: ifnonnull -> 57
    //   50: iconst_0
    //   51: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   54: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   57: return
  }
  
  private void Zk() {
    this.ZS.Za(Zmsv.AUTO_EXPAND);
  }
  
  private void ZV() {
    this.ZS.Za(Zmsv.COLLAPSED);
  }
  
  private void ZJ() {
    this.ZS.Zi(Zrpp.LEFT);
  }
  
  private void ZS() {
    this.ZS.Zi(Zrpp.RIGHT);
  }
  
  private void Za() {
    this.ZL = new ButtonGroup();
    this.ZH = new ButtonGroup();
    this.Z_ = new Zbqc();
    this.ZT = new Zm99();
    this.ZA = new Zmg2();
    this.Za = new Zmg2();
    this.ZV = new JSeparator();
    this.Zz = new Zbqc();
    this.Zn = new Zm99();
    this.ZF = new Zmg2();
    this.ZU = new Zmg2();
    GridBagLayout gridBagLayout1 = new GridBagLayout();
    gridBagLayout1.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout1.rowHeights = new int[] { 0 };
    setLayout(gridBagLayout1);
    GridBagLayout gridBagLayout2 = new GridBagLayout();
    gridBagLayout2.columnWidths = new int[] { 0, 10, 0 };
    gridBagLayout2.rowHeights = new int[] { 0, 10, 0 };
    this.Z_.setLayout(gridBagLayout2);
    this.ZT.Ze(Zlkk.BURP_TITLE);
    this.ZT.setText(a(5484, -23188));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    this.Z_.add(this.ZT, gridBagConstraints);
    this.ZL.add(this.ZA);
    this.ZA.setText(a(5478, -2179));
    this.ZA.setIconTextGap(7);
    this.ZA.addActionListener(new Zg15(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 25;
    this.Z_.add(this.ZA, gridBagConstraints);
    this.ZL.add(this.Za);
    this.Za.setText(a(5475, 2388));
    this.Za.setIconTextGap(7);
    this.Za.addActionListener(new Zgd0(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 25;
    this.Z_.add(this.Za, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 23;
    add(this.Z_, gridBagConstraints);
    this.ZV.setOrientation(1);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 3;
    gridBagConstraints.insets = new Insets(0, 35, 0, 35);
    add(this.ZV, gridBagConstraints);
    GridBagLayout gridBagLayout3 = new GridBagLayout();
    gridBagLayout3.columnWidths = new int[] { 0, 10, 0 };
    gridBagLayout3.rowHeights = new int[] { 0, 10, 0 };
    this.Zz.setLayout(gridBagLayout3);
    this.Zn.Ze(Zlkk.BURP_TITLE);
    this.Zn.setText(a(5479, -3331));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    this.Zz.add(this.Zn, gridBagConstraints);
    this.ZH.add(this.ZF);
    this.ZF.setText(a(5472, 31654));
    this.ZF.addActionListener(new Zg9n(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 21;
    this.Zz.add(this.ZF, gridBagConstraints);
    this.ZH.add(this.ZU);
    this.ZU.setText(a(5499, 12488));
    this.ZU.setIconTextGap(7);
    this.ZU.addActionListener(new Ztuu(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 21;
    this.Zz.add(this.ZU, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zz, gridBagConstraints);
  }
  
  private void Zo(ActionEvent paramActionEvent) {
    ZV();
  }
  
  private void Zn(ActionEvent paramActionEvent) {
    ZJ();
  }
  
  private void ZL(ActionEvent paramActionEvent) {
    ZS();
  }
  
  private void Zh(ActionEvent paramActionEvent) {
    Zk();
  }
  
  public static void ZZ(Zbqc[] paramArrayOfZbqc) {
    ZQ = paramArrayOfZbqc;
  }
  
  public static Zbqc[] Zi() {
    return ZQ;
  }
  
  static {
    // Byte code:
    //   0: bipush #23
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: iconst_2
    //   10: anewarray burp/Zbqc
    //   13: ldc 'éé3n%?»Tf«ºWò¿ÅZ9½sºü3O$j] u>§Ä0Ú¤,ºïh¦çWX#°¥¤H4ÞÒZ\\nDæ¼Ûfx³Ì *ÝECÍw+K\\t¿þb47ß²\\bü2xÏX)c$üò¥óÂWÙ^ÚÈJî| Ó¢!½_7~-9,\\fQºÁ=ÇúÎ1\\b^ ØìÊ$þÁ _ÜIq¢+­~DR×6_¹ÔÈM£»K"¦\\rÍþ°y{ícde{Þá¤tc$UÌßµºãm­­ï;X±\\b¨?«}'A\\nEeög,þ ­9iò$q\\bÒ7ÂÀ¤L©$1è»nø# ([ò&iYÐ(î÷+R¸+o¬ä8ÚsÏ.Ôä û6kÃ¤À«àªÔGçºvO§\\bÓ~\\fØ+íôØC4~I©.$òUí»%\ .Q^\\f&WÊ¾TE_êÎz¦W5ÓÀÐ/Í0iÐ¿Û\\niÐ-H B?%Øy{!$ñp)iÝ´X;Ì±O8½\\r%Q]r½õ{<ZóJÓ¡zp|2é¡TÉñ`j&Bû¡çSH%\?& ÒLIWØÌûMúEù2z Â/µ]¦©àÈÿ1<&ÕÁñS]·Ëø(bhá{îçÓkuXnnCKc6õ¹>Å_¢Kø×ÂªN\\n¯F'
    //   15: dup
    //   16: astore_2
    //   17: invokevirtual length : ()I
    //   20: istore #4
    //   22: invokestatic ZZ : ([Lburp/Zbqc;)V
    //   25: bipush #6
    //   27: istore_1
    //   28: iconst_m1
    //   29: istore_0
    //   30: bipush #33
    //   32: iinc #0, 1
    //   35: aload_2
    //   36: iload_0
    //   37: dup
    //   38: iload_1
    //   39: iadd
    //   40: invokevirtual substring : (II)Ljava/lang/String;
    //   43: iconst_m1
    //   44: goto -> 150
    //   47: aload #5
    //   49: swap
    //   50: iload_3
    //   51: iinc #3, 1
    //   54: swap
    //   55: aastore
    //   56: iload_0
    //   57: iload_1
    //   58: iadd
    //   59: dup
    //   60: istore_0
    //   61: iload #4
    //   63: if_icmpge -> 75
    //   66: aload_2
    //   67: iload_0
    //   68: invokevirtual charAt : (I)C
    //   71: istore_1
    //   72: goto -> 30
    //   75: ldc '´M¹E×ÕaØÿ}8\\b3$F¼§0v"RÕ°\ÙÖî\\t»æÇù/9*}5s'
    //   77: dup
    //   78: astore_2
    //   79: invokevirtual length : ()I
    //   82: istore #4
    //   84: bipush #37
    //   86: istore_1
    //   87: iconst_m1
    //   88: istore_0
    //   89: bipush #14
    //   91: iinc #0, 1
    //   94: aload_2
    //   95: iload_0
    //   96: dup
    //   97: iload_1
    //   98: iadd
    //   99: invokevirtual substring : (II)Ljava/lang/String;
    //   102: iconst_0
    //   103: goto -> 150
    //   106: aload #5
    //   108: swap
    //   109: iload_3
    //   110: iinc #3, 1
    //   113: swap
    //   114: aastore
    //   115: iload_0
    //   116: iload_1
    //   117: iadd
    //   118: dup
    //   119: istore_0
    //   120: iload #4
    //   122: if_icmpge -> 134
    //   125: aload_2
    //   126: iload_0
    //   127: invokevirtual charAt : (I)C
    //   130: istore_1
    //   131: goto -> 89
    //   134: aload #5
    //   136: putstatic burp/Zbmm.a : [Ljava/lang/String;
    //   139: bipush #23
    //   141: anewarray java/lang/String
    //   144: putstatic burp/Zbmm.b : [Ljava/lang/String;
    //   147: goto -> 308
    //   150: dup_x2
    //   151: pop
    //   152: invokevirtual toCharArray : ()[C
    //   155: dup_x1
    //   156: arraylength
    //   157: dup_x2
    //   158: pop
    //   159: iconst_0
    //   160: istore #6
    //   162: dup2_x1
    //   163: pop2
    //   164: dup_x2
    //   165: iconst_1
    //   166: if_icmpgt -> 268
    //   169: dup2
    //   170: swap
    //   171: iload #6
    //   173: dup2_x1
    //   174: caload
    //   175: swap
    //   176: iload #6
    //   178: bipush #7
    //   180: irem
    //   181: tableswitch default -> 250, 0 -> 220, 1 -> 225, 2 -> 230, 3 -> 235, 4 -> 240, 5 -> 245
    //   220: bipush #37
    //   222: goto -> 252
    //   225: bipush #37
    //   227: goto -> 252
    //   230: bipush #37
    //   232: goto -> 252
    //   235: bipush #99
    //   237: goto -> 252
    //   240: bipush #65
    //   242: goto -> 252
    //   245: bipush #19
    //   247: goto -> 252
    //   250: bipush #104
    //   252: ixor
    //   253: ixor
    //   254: i2c
    //   255: castore
    //   256: iinc #6, 1
    //   259: dup
    //   260: ifne -> 268
    //   263: dup2
    //   264: dup_x1
    //   265: goto -> 173
    //   268: dup2_x1
    //   269: pop2
    //   270: dup_x2
    //   271: iload #6
    //   273: if_icmpgt -> 169
    //   276: pop
    //   277: new java/lang/String
    //   280: dup_x1
    //   281: swap
    //   282: invokespecial <init> : ([C)V
    //   285: invokevirtual intern : ()Ljava/lang/String;
    //   288: swap
    //   289: pop
    //   290: swap
    //   291: tableswitch default -> 47, 0 -> 106
    //   308: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x156A) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbmm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */