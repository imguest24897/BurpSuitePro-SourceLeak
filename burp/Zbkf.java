package burp;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.util.Collection;
import java.util.Set;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zbkf extends Zbv5 implements Ztbm {
  private final Zlf2 Zu;
  
  private final Zr99 ZE;
  
  private final Zskh ZN;
  
  private final Zr1m ZY;
  
  private final Collection<String> ZC;
  
  private Zboy ZX;
  
  private Zzdy Zw;
  
  private Zzdy Zj;
  
  private Zm99 Zm;
  
  private Zm99 Zq;
  
  private Zm99 Za;
  
  private Zm99 ZM;
  
  private Zgff Zk;
  
  private Ztln ZS;
  
  private Zgff Zb;
  
  private Zgff Zi;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbkf(Zlf2 paramZlf2, Zr99 paramZr99, Zskh paramZskh, Zr1m paramZr1m) {
    this.Zu = paramZlf2;
    this.ZE = paramZr99;
    this.ZN = paramZskh;
    this.ZY = paramZr1m;
    ZNo();
    this.ZC = Set.of(new String[] { 
          Zjd(), a(14827, -8021), a(14839, -18675), a(14832, -17631), a(14840, -14580), a(14837, -29509), a(14825, 11533), a(14830, 19668), a(14842, 7481), a(14829, -23106), 
          a(14817, -16529) });
    ZNj();
  }
  
  public String Zjd() {
    return a(14843, -29787);
  }
  
  public String ZjS() {
    return a(14845, 4240);
  }
  
  public Component ZjY() {
    Zbkr zbkr = new Zbkr();
    this.ZX = new Zboy(this.Zu, this.ZE, this.ZY, zbkr);
    return zbkr;
  }
  
  public Collection<String> ZjD() {
    return this.ZC;
  }
  
  public boolean ZQA() {
    return this.ZX.Zu();
  }
  
  public void ZO(boolean paramBoolean) {
    this.ZX.Zz(paramBoolean);
    Zt2();
  }
  
  public void Zt2() {
    Ztvq ztvq = this.ZX.Zx().ZM();
    this.Zj.setSelected(ztvq.Zp9());
    this.Zk.setText(ztvq.Zpk());
    int i = ztvq.Zpl();
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    String str = (i == 0) ? "" : String.valueOf(i);
    this.Zb.setText(str);
    this.Zi.setText(ztvq.ZpM());
    this.ZS.setText(ztvq.Zpp());
    this.Zw.setSelected(ztvq.Zpu());
    ZNU();
  }
  
  private void ZNU() {
    Zg5i zg5i = this.ZX.Zx();
    Ztvq ztvq = zg5i.ZM();
    if (ztvq.Zp9()) {
      String str = ztvq.Zpk();
      try {
        if (!Zgxs.Zc(str)) {
          Zmgc.INVALID_SOCKS_PROXY_HOST.ZV(this.ZN, new Object[] { str });
          this.Zj.setSelected(false);
          zg5i.ZV(false);
        } 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
      int i = ztvq.Zpl();
      try {
        if (!Zgxs.ZO(i)) {
          Zmgc.INVALID_SOCKS_PROXY_PORT.ZV(this.ZN, new Object[] { Integer.valueOf(i) });
          this.Zj.setSelected(false);
          zg5i.ZV(false);
        } 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
    } 
    try {
      if (this.Zj.isSelected())
        Zmgc.USING_SOCKS_PROXY.ZK(this.ZN, new Object[] { this.Zk.getText().trim(), this.Zb.getText().trim() }); 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
  }
  
  private static int ZX(String paramString) {
    try {
      if (paramString != null)
        try {
          if (!paramString.isEmpty());
        } catch (NumberFormatException numberFormatException) {
          throw a(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    return 0;
  }
  
  private void ZNj() {
    setName(a(14834, 22417));
    this.Zj.setName(a(14846, 16045));
    this.Zk.setName(a(14847, -13808));
    this.Zb.setName(a(14831, -11799));
    this.Zi.setName(a(14833, -6847));
    this.ZS.setName(a(14826, -10224));
    this.Zw.setName(a(14844, -17721));
  }
  
  private void ZNo() {
    this.Zq = new Zm99();
    this.Zm = new Zm99();
    this.Zb = new Zgff();
    this.Zk = new Zgff();
    this.ZM = new Zm99();
    this.Za = new Zm99();
    this.ZS = new Ztln();
    this.Zi = new Zgff();
    this.Zj = new Zzdy();
    this.Zw = new Zzdy();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0 };
    setLayout(gridBagLayout);
    this.Zq.setText(a(14836, -29763));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 2048;
    add(this.Zq, gridBagConstraints);
    this.Zm.setText(a(14828, 3306));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 2048;
    add(this.Zm, gridBagConstraints);
    this.Zb.setColumns(20);
    this.Zb.ZH(Zlw9.PORT);
    this.Zb.addKeyListener(new Ztc4(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 2048;
    add(this.Zb, gridBagConstraints);
    this.Zk.setColumns(20);
    this.Zk.ZH(Zlw9.HOST);
    this.Zk.addKeyListener(new Zexi(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 2048;
    add(this.Zk, gridBagConstraints);
    this.ZM.setText(a(14824, 26253));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 2048;
    add(this.ZM, gridBagConstraints);
    this.Za.setText(a(14841, -2711));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 2048;
    add(this.Za, gridBagConstraints);
    this.ZS.setColumns(20);
    this.ZS.addKeyListener(new Ztt9(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 2048;
    add(this.ZS, gridBagConstraints);
    this.Zi.setColumns(20);
    this.Zi.ZH(Zlw9.USERNAME);
    this.Zi.addKeyListener(new Zrl0(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 2048;
    add(this.Zi, gridBagConstraints);
    this.Zj.setText(a(14835, 29944));
    this.Zj.addActionListener(new Zzzh(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(0, 0, 5, 0);
    add(this.Zj, gridBagConstraints);
    this.Zw.setText(a(14838, 14053));
    this.Zw.addActionListener(new Zvl(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(5, 0, 0, 0);
    add(this.Zw, gridBagConstraints);
  }
  
  private void Zb(ActionEvent paramActionEvent) {
    this.ZX.Zx().ZV(this.Zj.isSelected());
    ZNU();
  }
  
  private void ZA(KeyEvent paramKeyEvent) {
    this.Zj.setSelected(false);
    Zg5i zg5i = this.ZX.Zx();
    zg5i.ZV(false);
    zg5i.Zp(this.Zk.getText().trim());
    ZNU();
  }
  
  private void Zi(KeyEvent paramKeyEvent) {
    this.Zj.setSelected(false);
    Zg5i zg5i = this.ZX.Zx();
    zg5i.ZV(false);
    try {
      int i = ZX(this.Zb.getText());
      if (i < 0)
        i = 0; 
      zg5i.ZD(i);
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.USER_ERROR);
      zg5i.ZW();
    } 
    ZNU();
  }
  
  private void ZX(KeyEvent paramKeyEvent) {
    this.Zj.setSelected(false);
    Zg5i zg5i = this.ZX.Zx();
    zg5i.ZV(false);
    zg5i.ZQ(this.Zi.getText().trim());
    ZNU();
  }
  
  private void Za(KeyEvent paramKeyEvent) {
    this.Zj.setSelected(false);
    Zg5i zg5i = this.ZX.Zx();
    zg5i.ZV(false);
    zg5i.Zh(this.ZS.getPassword());
    ZNU();
  }
  
  private void Zc(ActionEvent paramActionEvent) {
    this.ZX.Zx().ZH(this.Zw.isSelected());
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
  
  static {
    // Byte code:
    //   0: bipush #25
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '@ðfõv1·­­}ïAªnÂK^ùG  ¼s¨P¤µî$©¨©g\\bmu%§úCōÜ 7mÚ) ¬5L(»\\tn4M¬\\bºD;õVÛÈÒ·.~Å¨¤!»XH8(·¢ì÷¥©cìLùS9q~Dö_rS,²9+TgªÃ¨½á¿}ÁºHPbËÍ?\A®Þå~xmD+@BôhíÛrÞ¤\\br¨åz5¼À§'èdXÒ\\b=§©ÌF«}¿or5ëöNk"æ­ËftI3ÒÒ {:ó5Õ~\\t]ìNkººÉ¯ñÞ½ÞÌbò4(ºs@\\t\\b[N+þ©J×à÷9[Ëá(®Ì Bb)9ågÖ«V5v³ævZÊâÜ>µLÒ°uSÔ\\bbëª¿|¬oB4hò_ë ø¨~ Þ©VÙúa£µø£×&%ÝsbN(y ª2éÓè[ùµ¥,öãÅ¾&ÜnR )¹R¿¾¹+ý·-{F´ó÷Md¸Ä®eK§Ã=µÓèLþR/Öù|OTCÂÑ¥¤¿>>\\nµåä¥kº6¶^d58º­x¡«f~ôfë6îNýÇé®IAú"ó)e²¢£`mÛt[êÀðOª¢P$=ñ8%A^¢«kÁá§zYâø¬åüJ6{z¥b}ÐÝ±mÀ+#\\t{ûµé]jhËHÀ¦#ÆÄ¹yÃØ£3÷çÌrP×çcJ¸Ò×yà)P\\t1Jvw[DÜÿ\\bÆp\\t__)¸ê\\rV¬#>8o±\\bååÒàìeUæ%9î­¯#-K6ö%«ìÌ`J)Q(¸ôÊÇ<=´ä09Æ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #76
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
    //   68: ldc 'q+=}ÇY[É½¡oÕÍô¾'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #10
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #7
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
    //   129: putstatic burp/Zbkf.a : [Ljava/lang/String;
    //   132: bipush #25
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbkf.b : [Ljava/lang/String;
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
    //   212: bipush #31
    //   214: goto -> 244
    //   217: bipush #101
    //   219: goto -> 244
    //   222: bipush #16
    //   224: goto -> 244
    //   227: bipush #57
    //   229: goto -> 244
    //   232: bipush #70
    //   234: goto -> 244
    //   237: bipush #42
    //   239: goto -> 244
    //   242: bipush #105
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
    int i = (paramInt1 ^ 0x39F9) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbkf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */