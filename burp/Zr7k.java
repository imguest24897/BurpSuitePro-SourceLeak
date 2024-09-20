package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zr7k extends Zrh7 {
  private final Zbep Zn;
  
  private final Zr_4 ZB;
  
  private boolean Zw = true;
  
  private final Zr1j ZJ;
  
  private Zm99 Zh;
  
  private Zm99 Zp;
  
  private Zbqc Zs;
  
  private Ze01 ZR;
  
  private Ze01 Zu;
  
  private Zedd ZH;
  
  private Zedd ZY;
  
  private Zedd ZG;
  
  private Zl8w Zb;
  
  private Zm2o ZD;
  
  private Zm99 Zo;
  
  private Zm99 Zj;
  
  private Zbqc ZL;
  
  private Zm9v Zi;
  
  private Zgff ZK;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zr7k(Zbep paramZbep, Zrgr paramZrgr, Zr_4 paramZr_4, Zr1j paramZr1j) {
    super(Zt2m.ZF(paramZbep), true, Zzv7.CONFIG_PANEL_INTERCEPTION_RULES_POPUP);
    this.Zn = paramZbep;
    this.ZB = paramZr_4;
    this.ZJ = paramZr1j;
    int[] arrayOfInt = Zr7c.Zv();
    ZN();
    this.ZD.Zi(Zk97.DESKTOP_TOOLS_PROXY_OPTIONS_INTERCEPTING_HTTP_REQUESTS_AND_RESPONSES);
    setTitle((paramZrgr == null) ? (a(292, 12398) + a(292, 12398) + (paramZbep.Z_() ? a(291, -15367) : a(296, -2918))) : (a(300, 16603) + a(300, 16603) + (paramZbep.Z_() ? a(310, -30505) : a(289, 18272))));
    String[] arrayOfString1 = Zevj.Zh;
    String[] arrayOfString2 = arrayOfString1;
    int i = arrayOfString2.length;
    int j = 0;
    while (j < i) {
      String str = arrayOfString2[j];
      this.ZH.addItem(str);
      j++;
      if (arrayOfInt != null)
        break; 
    } 
    arrayOfString2 = paramZbep.Z_() ? Zevj.ZX : Zevj.ZW;
    String[] arrayOfString3 = arrayOfString2;
    j = arrayOfString3.length;
    byte b = 0;
    while (b < j) {
      String str = arrayOfString3[b];
      this.ZG.addItem(str);
      b++;
      if (arrayOfInt != null)
        break; 
    } 
    if (paramZrgr != null)
      Zc(paramZrgr); 
    addWindowListener(new Zl35(this));
    pack();
    Zq(Zt2m.ZF(paramZbep));
  }
  
  private void Zc(Zrgr paramZrgr) {
    this.ZH.setSelectedIndex(paramZrgr.ZW());
    this.ZG.setSelectedIndex(Zsk5.Zp(this.Zn.Z_() ? Zevj.Zd : Zevj.Zc, paramZrgr.Zd()));
    ZC((ActionEvent)null);
    this.ZY.setSelectedIndex(paramZrgr.ZC());
    this.ZK.setText((paramZrgr.Zf() == null) ? "" : paramZrgr.Zf());
    this.Zw = paramZrgr.Zt();
  }
  
  private void ZN() {
    this.Zs = new Zbqc();
    this.Zb = new Zl8w();
    this.ZD = new Zm2o();
    this.Zo = new Zm99();
    this.Zj = new Zm99();
    this.ZL = new Zbqc();
    this.ZR = new Ze01();
    this.Zu = new Ze01();
    this.Zi = new Zm9v();
    this.ZG = new Zedd();
    this.ZK = new Zgff();
    this.ZH = new Zedd();
    this.ZY = new Zedd();
    this.Zh = new Zm99();
    this.Zp = new Zm99();
    setDefaultCloseOperation(2);
    this.Zs.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0 };
    this.Zs.setLayout(gridBagLayout);
    this.Zb.setText(a(294, 1072));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.weightx = 1.0D;
    this.Zs.add(this.Zb, gridBagConstraints);
    this.ZD.Zi(Zk97.DESKTOP_TOOLS_PROXY_OPTIONS_INTERCEPTING_HTTP_REQUESTS_AND_RESPONSES);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 18;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    this.Zs.add(this.ZD, gridBagConstraints);
    this.Zo.setText(a(298, 816));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    this.Zs.add(this.Zo, gridBagConstraints);
    this.Zj.setText(a(290, -4480));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1280;
    this.Zs.add(this.Zj, gridBagConstraints);
    this.ZL.setLayout(new GridLayout(1, 2, 5, 0));
    this.ZR.setText(a(297, -555));
    this.ZR.addActionListener(new Zkgg(this));
    this.ZL.add(this.ZR);
    this.Zu.setText(a(302, -3779));
    this.Zu.addActionListener(new Ztyy(this));
    this.ZL.add(this.Zu);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.anchor = 12;
    gridBagConstraints.weighty = 1.0D;
    this.Zs.add(this.ZL, gridBagConstraints);
    this.Zi.setText(a(295, -26659));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    this.Zs.add(this.Zi, gridBagConstraints);
    this.ZG.addActionListener(new Zlb2(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    this.Zs.add(this.ZG, gridBagConstraints);
    this.ZK.setColumns(30);
    this.ZK.ZH(Zlw9.SEARCH_TERM);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    this.Zs.add(this.ZK, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    this.Zs.add(this.ZH, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    this.Zs.add(this.ZY, gridBagConstraints);
    this.Zh.setText(a(293, -22320));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1280;
    this.Zs.add(this.Zh, gridBagConstraints);
    this.Zp.setText(a(299, -26529));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 1280;
    this.Zs.add(this.Zp, gridBagConstraints);
    getContentPane().add(this.Zs, a(301, 23302));
    pack();
  }
  
  private void ZH(ActionEvent paramActionEvent) {
    Zrgr zrgr;
    try {
    
    } catch (Ztrx ztrx) {
      throw a(null);
    } 
    Zgpe zgpe = this.ZB.<Zgpe>ZH(new Zz_0(this.Zw, this.ZH.getSelectedIndex(), (this.Zn.Z_() ? Zevj.Zd : Zevj.Zc)[this.ZG.getSelectedIndex()], this.ZY.getSelectedIndex(), this.ZK.getText()));
    try {
      zrgr = Zevj.Zl(zgpe, this.ZJ);
    } catch (Ztrx ztrx) {
      Zah.Zl(ztrx, Zk_.USER_ERROR);
      this.Zi.setText(ztrx.getMessage());
      return;
    } 
    setVisible(false);
    dispose();
    this.Zn.ZR(zrgr);
  }
  
  private void Zi(ActionEvent paramActionEvent) {
    setVisible(false);
    dispose();
    this.Zn.ZR((Zrgr)null);
  }
  
  private void ZC(ActionEvent paramActionEvent) {
    int[] arrayOfInt = Zr7c.Zv();
    int i = this.ZG.getSelectedIndex();
    String[] arrayOfString1 = this.Zn.Z_() ? Zevj.ZR[i] : Zevj.ZV[i];
    this.ZY.removeAllItems();
    String[] arrayOfString2 = arrayOfString1;
    int j = arrayOfString2.length;
    byte b = 0;
    while (b < j) {
      String str = arrayOfString2[b];
      this.ZY.addItem(str);
      b++;
      if (arrayOfInt != null)
        break; 
    } 
    this.ZK.setEnabled(this.Zn.Z_() ? Zevj.Zk[i] : Zevj.Zm[i]);
  }
  
  private static Ztrx a(Ztrx paramZtrx) {
    return paramZtrx;
  }
  
  static {
    // Byte code:
    //   0: bipush #17
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'i5Ù\\tp¥ý7¸ÇÞ~ô²ë¬%\ÒuÞÓó*%+Ô²mñÑ¢Ù½âýØë~ýÉCÿØÇqç±§\\rô¡}DrTéï¡MùõÃW·M\\nüV\\nÙ¢+5¿CùI¯ÔòxÜÒ+x&ÑÆ´Ê¼­ª¹\\b"\\bOhÁtäÉôÔGV¼(Ø935Ã(j/ß(÷)þ\\tñ^õUS¥·ë£Eè!\\n½V[<YÛ·òáÐmãzûZb{\\bHªî^´ãï '
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #45
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #22
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
    //   68: ldc '1,¹{"UÏ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_2
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #14
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
    //   128: putstatic burp/Zr7k.a : [Ljava/lang/String;
    //   131: bipush #17
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zr7k.b : [Ljava/lang/String;
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
    //   212: bipush #66
    //   214: goto -> 244
    //   217: bipush #17
    //   219: goto -> 244
    //   222: bipush #52
    //   224: goto -> 244
    //   227: bipush #68
    //   229: goto -> 244
    //   232: bipush #73
    //   234: goto -> 244
    //   237: bipush #100
    //   239: goto -> 244
    //   242: bipush #117
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
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x126) & 0xFFFF;
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
      byte b1 = 26;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr7k.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */