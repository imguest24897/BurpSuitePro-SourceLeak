package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.util.Collection;
import java.util.Set;

public class Zbkn extends Zbv5 implements Ztbm, Zky2 {
  private final Zz0n ZF;
  
  private final Zt4u ZQ;
  
  private final Zgb6 Zw;
  
  private final Zskh Zy;
  
  private final Zbl2 ZI;
  
  private final Zxl_ ZV;
  
  private final Zsxk Zm;
  
  private final Ztwv ZJ;
  
  private final Zr_4 Zc;
  
  private final Zr_4 Zd;
  
  private final Zr1m ZX;
  
  private final Collection<String> Zq;
  
  private Zbws Za;
  
  private Zxpx Zk;
  
  private Zmyw Zn;
  
  private Ze01 ZK;
  
  private Ze01 ZB;
  
  private Ze01 Zg;
  
  private Ze01 Zz;
  
  private Zbup Zf;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbkn(Zz0n paramZz0n, Zt4u paramZt4u, Zgb6 paramZgb6, Zskh paramZskh, Zbl2 paramZbl2, Zxl_ paramZxl_, Zsxk paramZsxk, Ztwv paramZtwv, Zr_4 paramZr_41, Zr_4 paramZr_42, Zr1m paramZr1m) {
    this.ZF = paramZz0n;
    this.ZQ = paramZt4u;
    this.Zw = paramZgb6;
    this.Zy = paramZskh;
    this.ZI = paramZbl2;
    this.ZV = paramZxl_;
    this.Zm = paramZsxk;
    this.ZJ = paramZtwv;
    this.Zc = paramZr_41;
    this.Zd = paramZr_42;
    this.ZX = paramZr1m;
    Zmp();
    this.Zq = Set.of(Zjd(), a(21545, 22695), a(21539, 27157), a(21544, 30083), a(21547, 26480), a(21564, -10267), a(21538, -11591), a(21565, -28004), a(21562, -27761), a(21537, -24860));
    ZmI();
  }
  
  public String Zjd() {
    return a(21566, 26072);
  }
  
  public String ZjS() {
    return a(21542, 6635);
  }
  
  public Component ZjY() {
    Zbkr zbkr = new Zbkr();
    this.Zk = new Zxpx(this.ZV, this.Zm, this.Zc, this.Zd, zbkr, this.ZX);
    this.Za = new Zbws(this.Zk.ZA().Zy());
    this.Za.setName(a(21546, 6848));
    this.Za.Zk(this);
    this.Zf.setViewportView(this.Za);
    return zbkr;
  }
  
  public Collection<String> ZjD() {
    return this.Zq;
  }
  
  public boolean ZQA() {
    return this.Zk.ZJ();
  }
  
  public void ZO(boolean paramBoolean) {
    this.Zk.Zn(paramBoolean);
    Zt2();
  }
  
  public void Zt2() {
    Zt0f zt0f = this.Zk.ZA().Zy();
    this.Za.ZL(zt0f);
    zt0f.fireTableDataChanged();
  }
  
  public void Zv(MouseEvent paramMouseEvent, int paramInt1, int paramInt2) {
    if (paramInt2 != 0)
      return; 
    this.Zk.ZA().Za(paramInt1);
  }
  
  public void ZR(MouseEvent paramMouseEvent, int paramInt1, int paramInt2) {
    Zgtc zgtc = this.Zk.ZA().ZD(paramInt1);
    Zrbx zrbx = zgtc.Zj();
    Zl0v zl0v = new Zl0v(Zt2m.ZF(this.Za), a(21563, -11227) + a(21563, -11227) + zrbx.Zl(), zrbx.Zc.toString(), this.Zw, this.ZF.ZD(), this.ZJ);
    zl0v.setVisible(true);
  }
  
  private void ZmI() {
    setName(a(21536, 30978));
  }
  
  private void Zmp() {
    this.ZK = new Ze01();
    this.Zz = new Ze01();
    this.Zg = new Ze01();
    this.ZB = new Ze01();
    this.Zn = new Zmyw();
    this.Zf = new Zbup();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.ZK.setText(a(21561, 845));
    this.ZK.setToolTipText(a(21543, 13833));
    this.ZK.addActionListener(new Zgtf(this));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.ZK, gridBagConstraints);
    this.Zz.setText(a(21548, 26462));
    this.Zz.setToolTipText(a(21551, 13241));
    this.Zz.addActionListener(new Zr8n(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.Zz, gridBagConstraints);
    this.Zg.setText(a(21540, 22955));
    this.Zg.setToolTipText(a(21550, -13969));
    this.Zg.addActionListener(new Ztvt(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.Zg, gridBagConstraints);
    this.ZB.setText(a(21560, -6155));
    this.ZB.setToolTipText(a(21541, 31849));
    this.ZB.addActionListener(new Zshx(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    add(this.ZB, gridBagConstraints);
    this.Zn.setLeftComponent(this.Zf);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 7;
    gridBagConstraints.fill = 1;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zn, gridBagConstraints);
  }
  
  private void ZV(ActionEvent paramActionEvent) {
    Zryr zryr = this.Zk.ZA();
    new Zr5w(this.ZF, this.ZQ, this.Zw, this.Zy, zryr, this.ZI, this.ZJ, zryr.Zv(), Zt2m.ZF(this));
  }
  
  private void Zz(ActionEvent paramActionEvent) {
    int i = this.Za.getSelectedRow();
    if (i == -1)
      return; 
    if (!Zx6o.ZY(this, a(21549, -26605)))
      return; 
    this.Zk.ZA().ZR(i);
    if (i >= this.Za.getRowCount())
      i--; 
    if (i >= 0 && i < this.Za.getRowCount())
      this.Za.getSelectionModel().setSelectionInterval(i, i); 
  }
  
  private void Zt(ActionEvent paramActionEvent) {
    int i = this.Za.getSelectedRow();
    if (i < 1)
      return; 
    this.Zk.ZA().Zv(i);
    this.Za.getSelectionModel().setSelectionInterval(i - 1, i - 1);
  }
  
  private void ZT(ActionEvent paramActionEvent) {
    int i = this.Za.getSelectedRow();
    if (i == -1 || i == this.Za.getRowCount() - 1)
      return; 
    this.Zk.ZA().Zo(i);
    this.Za.getSelectionModel().setSelectionInterval(i + 1, i + 1);
  }
  
  static {
    // Byte code:
    //   0: bipush #23
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÇñÕT°êxÁf£XJsøÙf\\r¤Ë½¿ÞlO³õý@£©·LÓH¶xkÖß½]àð¾\\bóø¡°ÅÒÏ1Ê3ä=\\rm2^×2Eû¥Ñê3ä2ç]gÉãÁEn>·R¥+TóíÂ¢BÌÀk4 (/£bé~Oj\\t×WÔo¥/ôÛüø=5K -ãÏ{¤RåtÇ,ä'WÙPù@üÄh¸«[B üáÅ¯^È¤wõ¹0¿¤¡éCv ÐàmëÛýL\\nÆïsò3GpÒKRáêo_FÀjò7cgN°W×¼mÍµ""z<`l"Çu·Ý.±`Ö¬¹«jôþ;KY¨í7BtãcÎ­æƀçlyy´Y°B\\râ\\bR¢v%s»¸#×kêIïç\AÝ¾Í$uCÁl®¬U=T-ÀÞ øý÷³hÚT«Ö\\n «_ýU ñù)î%¥Ä%³²¾Ó©~³*!vÚ Ð%òÖm+Ð6±®Q;7N.>áø,"®ÿ%¸Ñv3ÑbZ\\rÐ5$ÄÂ}Êçz`lM9yÑUºê¿°8ù&ÖëÀßCn< ØV·ý¬´[c®Úw¯æ.ë¾,A»×#ÿÀò¹;Â2©æ}õqræo5qÅµÍU¹?°þAGó¼~¸í=YûaBê[-»íw6îÄÉnlyÅÊ8½C Y°T4²,ñÑè/Z+ê¤Õ¥"¦FûÜ#"?2rlÈ-¢¨ï¥à&ÑÒ'çRòìWÕh,{Cÿ2(ÿÄjY _£¹UÞ6¨]»cm%\\r¾¢yrä;¡C*z,-[o©ÃÛïTH1hYæîx®£3yÂbÀd?è\_ÖÎ¾\\tú~Í\\bêcÐïß-iÀ?\\nÑYÃù¾O£'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #16
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: iconst_4
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 23
    //   67: ldc 'Åßù:TT}Ûó`¨¿ðÿJJó]·ki'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_4
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #52
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
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
    //   127: putstatic burp/Zbkn.a : [Ljava/lang/String;
    //   130: bipush #23
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zbkn.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #69
    //   214: goto -> 244
    //   217: bipush #58
    //   219: goto -> 244
    //   222: bipush #51
    //   224: goto -> 244
    //   227: bipush #98
    //   229: goto -> 244
    //   232: bipush #9
    //   234: goto -> 244
    //   237: bipush #18
    //   239: goto -> 244
    //   242: bipush #76
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 39, 0 -> 97
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5428) & 0xFFFF;
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
      byte b1 = 117;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbkn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */