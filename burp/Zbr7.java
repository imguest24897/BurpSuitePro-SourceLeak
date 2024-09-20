package burp;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import javax.swing.BorderFactory;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zbr7 extends Zbg2 {
  private final Ztyg Zm;
  
  private final AtomicReference<Zbdf> Zj;
  
  private final Zbdf Za;
  
  private final Zg5e Zx;
  
  private final Zb04 Zk;
  
  private final Zbxw Zc;
  
  private final List<Zgib> Zz = new ArrayList<>();
  
  private final Zbdx Zt;
  
  private Zzdy Zd;
  
  private Zl8w Zr;
  
  private Zm99 ZU;
  
  private Zm99 ZY;
  
  private Zbqc ZP;
  
  private Zbqc ZE;
  
  private Zg85 ZD;
  
  private Zg85 ZN;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbr7(Zb04 paramZb04, Ztyg paramZtyg, Zgq7 paramZgq7, Zey9 paramZey9) {
    this(paramZb04, paramZtyg, paramZgq7, false, "", -1, false, paramZey9.ZY(null, new byte[0]));
  }
  
  Zbr7(Zb04 paramZb04, Ztyg paramZtyg, Zgq7 paramZgq7, Zmo7 paramZmo7, Zey9 paramZey9) {
    this(paramZb04, paramZtyg, paramZgq7, false, paramZmo7.Zk().Zd1(), paramZmo7.Zk().Zda(), paramZmo7.Zk().Zdr(), paramZey9.ZY(paramZmo7.Zk().Zdz(), paramZmo7.ZL()));
  }
  
  Zbr7(Zb04 paramZb04, Ztyg paramZtyg, Zgq7 paramZgq7, Zk75 paramZk75, Zma9 paramZma9, Zey9 paramZey9) {
    this(paramZb04, paramZtyg, paramZgq7, true, paramZk75.Zi, paramZk75.ZU, paramZk75.Zo, paramZey9.ZY(null, paramZk75.ZI));
    paramZb04.Zt(paramZma9.ZM.errorMessage);
    String str = Zxpo.Zv();
    try {
      switch (Zz3f.Zy[paramZma9.ZM.ordinal()]) {
        case 1:
          try {
            this.Zx.ZE(paramZk75, paramZma9);
            ZH().ZN(paramZma9.ZK, Zgu3.HTTP_RESPONSE);
            this.Zt.Zg(0, 0, Zto4.RESPONSE);
            if (str == null);
          } catch (NumberFormatException numberFormatException) {
            throw a(null);
          } 
          return;
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
          try {
            if (this.Zj.getAndSet(null) != null)
              try {
                Zp();
                this.Zt.Zq();
                if (str == null)
                  break; 
              } catch (NumberFormatException numberFormatException) {
                throw a(null);
              }  
          } catch (NumberFormatException numberFormatException) {
            throw a(null);
          } 
          return;
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    Zuh.ZT(false, Zqf.Zr, paramZma9.ZM.toString());
  }
  
  Zbr7(Zb04 paramZb04, Ztyg paramZtyg, Zgq7 paramZgq7, Zlit paramZlit, Zk75 paramZk75, Zey9 paramZey9) {
    this(paramZb04, paramZtyg, paramZgq7, true, paramZlit.Zd1(), paramZlit.Zda(), paramZlit.Zdr(), paramZey9.ZY(paramZlit.Zdz(), paramZk75.ZI));
  }
  
  private Zbr7(Zb04 paramZb04, Ztyg paramZtyg, Zgq7 paramZgq7, boolean paramBoolean1, String paramString, int paramInt, boolean paramBoolean2, Zefx paramZefx) {
    this.Zk = paramZb04;
    this.Zm = paramZtyg;
    this.Zj = new AtomicReference<>();
    this.Zx = new Zg5e();
    ZM();
    Zr96 zr96 = new Zr96();
    try {
      this.Za = paramZtyg.Z_(zr96, Zeew.REPEATER, true, EnumSet.of(Zgu3.HTTP_REQUEST), false, Zb9b.Zx);
      this.Za.setName(a(-7733, -11178));
      this.Zc = new Zbxw(a(-7737, -28394), this.Za, this::ZH);
      this.Zt = paramZgq7.ZP(Zxff.WS_CONNECTION_WIZARD).ZE(new Zgib[] { this.Zc }).ZJ(this.Zz).Zo().Zl();
      this.ZP.add(this.Zt, a(-7735, -29165));
      this.ZD.setText(paramString);
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    try {
      this.ZN.setText((paramInt == -1) ? "" : ("" + paramInt));
      this.Zd.setSelected(paramBoolean2);
      this.Za.ZA(paramZefx, Zgsq.HIDDEN);
      (new String[3])[0] = a(-7742, -9017);
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    this.ZB = new String[] { null, paramBoolean1 ? a(-7738, 27180) : a(-7729, -1686), a(-7732, 3035) };
    this.ZA = new boolean[] { true, true, true };
  }
  
  public Zsic Zn(int paramInt) {
    try {
      switch (paramInt) {
        case 0:
        
        case 1:
        
        case 2:
        
      } 
    } catch (NumberFormatException numberFormatException) {
      throw a(null);
    } 
    Zuh.Zv(false, Zqf.Zk, paramInt);
    return this;
  }
  
  private Zsic Zb() {
    this.Zk.ZC();
    this.Zk.Zh(1, false);
    this.Zk.Zh(2, false);
    return this.Zk.Zt(new Zk75(this.ZD.getText(), ZG(this.ZN.getText()), this.Zd.isSelected(), Zt6s.Zu(this.Za.Zi())));
  }
  
  private Zbdf ZH() {
    Zbdf zbdf = this.Zj.get();
    if (zbdf == null) {
      zbdf = this.Zm.Z_(this.Zx, Zeew.REPEATER, false, EnumSet.of(Zgu3.HTTP_RESPONSE), false, Zb9b.Zx);
      this.Zj.set(zbdf);
      Zp();
      this.Zz.add(new Zbxw(a(-7743, 29124), zbdf, this::ZH));
      this.Zt.Zq();
    } 
    return zbdf;
  }
  
  private void Zp() {
    this.Zc.Zp(this.Zt);
    this.Zz.forEach(this::lambda$resetPanes$0);
    this.Zz.clear();
  }
  
  private Zsmh ZH(Zsmh paramZsmh, Zgsq paramZgsq) {
    Ztuo ztuo = new Ztuo(paramZgsq);
    paramZsmh.Zh(ztuo);
    return ztuo.ZB();
  }
  
  private static int ZG(String paramString) {
    try {
      int i = Integer.parseInt(paramString.trim());
      try {
        if (i > 0 && i < 65536)
          return i; 
      } catch (NumberFormatException numberFormatException) {
        throw a(null);
      } 
    } catch (NumberFormatException numberFormatException) {
      Zah.Zl(numberFormatException, Zk_.IGNORED);
    } 
    return -1;
  }
  
  private void ZM() {
    this.ZE = new Zbqc();
    this.Zr = new Zl8w();
    this.ZU = new Zm99();
    this.ZD = new Zg85();
    this.ZY = new Zm99();
    this.ZN = new Zg85();
    this.Zd = new Zzdy();
    this.ZP = new Zbqc();
    setLayout(new BorderLayout());
    this.ZE.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    this.ZE.setLayout(gridBagLayout);
    this.Zr.setText(a(-7734, -27752));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    this.ZE.add(this.Zr, gridBagConstraints);
    this.ZU.setText(a(-7731, -24942));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 21;
    this.ZE.add(this.ZU, gridBagConstraints);
    this.ZD.setColumns(30);
    this.ZD.setName(a(-7724, -16118));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 21;
    this.ZE.add(this.ZD, gridBagConstraints);
    this.ZY.setText(a(-7744, 11025));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 21;
    this.ZE.add(this.ZY, gridBagConstraints);
    this.ZN.setColumns(10);
    this.ZN.setName(a(-7730, 28997));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 21;
    this.ZE.add(this.ZN, gridBagConstraints);
    this.Zd.setText(a(-7741, 24703));
    this.Zd.setName(a(-7740, -6128));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 21;
    this.ZE.add(this.Zd, gridBagConstraints);
    add(this.ZE, a(-7739, 28818));
    this.ZP.setLayout(new BorderLayout());
    add(this.ZP, a(-7736, -1794));
  }
  
  private void lambda$resetPanes$0(Zgib paramZgib) {
    paramZgib.Zp(this.Zt);
  }
  
  private static NumberFormatException a(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
  
  static {
    // Byte code:
    //   0: bipush #17
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ' ¢&Y:,\\tÐ?ùÆ+o!c`iã(qÄòbÓ\\r§'hß\\r?×iôã`Æ-Ñ'%&Æ^\\rßÐùµû²E\\bPª¨{r4VAdî5\\tã/9qÒ\\fîuq"U!¦õ¦Eµ¢fàw)¾'êYÎ¹Ö[]·G;ëÅ®{v¥B0®è@½Ðcw·æ¦:|Úu$ÛÇàïÇwö½á¥òküÌÕz&Õë{ù&o['
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #25
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #90
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
    //   68: ldc '.Ê¢³¦ëiÂØ²qdBs_¶®.&ôË~õXn:Â¯Á`í\z{Í³ÒçqØ}¦ óO:c¦ '
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #42
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
    //   129: putstatic burp/Zbr7.a : [Ljava/lang/String;
    //   132: bipush #17
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbr7.b : [Ljava/lang/String;
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
    //   212: bipush #86
    //   214: goto -> 244
    //   217: bipush #46
    //   219: goto -> 244
    //   222: bipush #18
    //   224: goto -> 244
    //   227: bipush #67
    //   229: goto -> 244
    //   232: bipush #70
    //   234: goto -> 244
    //   237: bipush #50
    //   239: goto -> 244
    //   242: bipush #48
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
    int i = (paramInt1 ^ 0xFFFFE1C4) & 0xFFFF;
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
      char c = 'ø';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbr7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */