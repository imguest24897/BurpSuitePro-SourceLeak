package burp;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Window;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import net.portswigger.Zl0;
import net.portswigger.Zqf;
import net.portswigger.Zuh;
import net.portswigger.Zvh;

class Zba9 extends Zbv5 implements Zt3u {
  private final Zt4u ZE;
  
  private final Zr1m ZB;
  
  private final Zskh Zy;
  
  private final Zs4c Zk;
  
  private final Zezx ZN;
  
  private final Zl0 Zi;
  
  private final Set<String> ZG;
  
  private final Zg1x ZA;
  
  private final Zejy Zv;
  
  private final Ztsr Zh;
  
  private Zbws ZK;
  
  private JScrollPane Zn;
  
  private Zgf8 ZP;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zba9(Zt4u paramZt4u, Zskh paramZskh, Zs4c paramZs4c, Zezx paramZezx, Zl0 paramZl0, Ztsr paramZtsr) {
    Zuh.Zb((Zb12.ZG() || null != paramZtsr), Zqf.Zx);
    this.ZE = paramZt4u;
    this.Zy = paramZskh;
    this.Zk = paramZs4c;
    this.ZN = paramZezx;
    this.Zi = paramZl0;
    this.Zh = paramZtsr;
    this.ZB = new Zr1b(this);
    Zn();
    this.ZA = new Zg1x(paramZs4c, paramZtsr);
    Ztn7 ztn7 = new Ztn7(this.ZA);
    this.Zv = new Zejy(this.ZK, ztn7);
    this.ZG = Set.of(Zjd(), a(-30911, -26505), a(-30898, -30910));
    Objects.requireNonNull(ztn7);
    this.ZP.Zv(ztn7::Zj, 20);
    Zq();
    ZR();
    Zt2();
    int i = (int)(Zrt.Zx() * 28.0F);
    this.ZK.setPreferredScrollableViewportSize(new Dimension((this.ZK.getPreferredSize()).width, i));
  }
  
  private void Zq() {
    setName(a(-30905, 16172));
    this.ZP.setName(a(-30909, 13732));
    this.ZK.setName(a(-30906, -6616));
  }
  
  private void ZR() {
    Zr3w zr3w = new Zr3w(this);
    this.ZK.Zk(zr3w);
    Zmcr zmcr = new Zmcr(this);
    this.ZK.addKeyListener(zmcr);
  }
  
  public String Zjd() {
    return a(-30912, -4234);
  }
  
  public String ZjS() {
    String str1 = a(-30908, 25070);
    String str2 = !Zvh.ZU.ZE() ? "" : a(-30897, 16667);
    return String.format(str1, new Object[] { str2 });
  }
  
  public Component ZjY() {
    Zbkr zbkr = new Zbkr();
    zbkr.setName(a(-30899, -4806));
    zbkr.Za(a(-30910, -5036), Zk97.DESKTOP_SETTINGS_USER_INTERFACE_HOTKEYS_HOTKEYS, this.ZB, true, new String[] { a(-30907, -31398) });
    return zbkr;
  }
  
  public Collection<String> ZjD() {
    return this.ZG;
  }
  
  private void Zd() {
    Zl1c zl1c = this.Zv.Zs();
    ZJ(zl1c);
  }
  
  private void ZJ(Zl1c paramZl1c) {
    Window window = SwingUtilities.windowForComponent(this);
    Objects.requireNonNull(this.ZA);
    Zrvn zrvn = new Zrvn(window, paramZl1c, this::ZC, this.ZA::ZD);
    zrvn.setVisible(true);
  }
  
  private void ZC(Zl1c paramZl1c) {
    this.Zv.ZY(paramZl1c);
    this.ZA.Zb();
    this.Zh.ZM(false);
  }
  
  private void Zn() {
    this.ZP = new Zgf8();
    this.Zn = new JScrollPane();
    this.ZK = new Zbws();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0 };
    gridBagLayout.rowHeights = new int[] { 0, 20, 0 };
    setLayout(gridBagLayout);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 23;
    add(this.ZP, gridBagConstraints);
    this.ZK.setSelectionMode(0);
    this.Zn.setViewportView(this.ZK);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    add(this.Zn, gridBagConstraints);
  }
  
  public void Zt2() {
    this.ZA.ZT();
    this.Zv.ZV(this.ZP.getText());
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'À×a×» §4òZáß¯\\fSc3®(\\rn%¶¥vho\\rV¯)Y£»'H3v-Â¢Þ}æ-(ExÏµGÅôàÛøGC8iT3KSRsì»a\\rÅBÇ/Î;jµñc²wò¬ô4ó¦oA3OD¶ÄLìû7ÍoÖÔ\\b26ÕÇUù`ánÁ¬÷EkûµËþîIo¨µåÇý\\tNwëeóÖÏqNMf§2QàÝtHr[ï\\fÝ¢ÁïóO0Ð_r»Ëµ\\rÄà=ò¿R°-6¼k?y²5+[;çòyrâ~ZÊSN¯g^PéÙ!\\fÛÜìÔÖ¿>¸c(+Õù¬úÍW°ÊÔØíýÌ%:®pØÀÁÈH© ÂìûØ=R8Ï¥ØÓxs½Ã6pµ£ËiDR?æd¼$%,Ö+`´jÑ~ÊMñFçBtmùmDÎ$^\\b{>öÿGy»8VHïØ¬QPåçtçÔ<-ût+v­HÝÔ.èp¹ñÇ*ÔgõIôúä}U¯ Càª¶dJéØ4º".4r0ß±óø}Í=Cà°oPc¢9Æ¥°å° [\ðõ¬ºÓKiI£N¨ñ¥ãîK"p"jbP(Åò'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #18
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #29
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
    //   68: ldc '5÷4ºþÓIb 4àT®¶#©/|¯PêÉ±þàõ4R? ó¶6'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #12
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: iconst_1
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
    //   123: goto -> 82
    //   126: aload #5
    //   128: putstatic burp/Zba9.a : [Ljava/lang/String;
    //   131: bipush #11
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zba9.b : [Ljava/lang/String;
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
    //   173: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #21
    //   214: goto -> 243
    //   217: bipush #27
    //   219: goto -> 243
    //   222: iconst_4
    //   223: goto -> 243
    //   226: bipush #20
    //   228: goto -> 243
    //   231: bipush #99
    //   233: goto -> 243
    //   236: bipush #13
    //   238: goto -> 243
    //   241: bipush #42
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
    int i = (paramInt1 ^ 0xFFFF8747) & 0xFFFF;
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
      byte b1 = 95;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zba9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */