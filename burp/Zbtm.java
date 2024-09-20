package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.KeyEvent;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zbtm extends Zbg2 {
  private final Zzlr Zr;
  
  private final int Zx;
  
  private Zm2o Zj;
  
  private Zl8w Zt;
  
  private Zm99 ZX;
  
  private Zm99 Zq;
  
  private Zm99 ZV;
  
  private Zm99 Zm;
  
  private Zm9v ZD;
  
  private Zm9v Zn;
  
  private Zm9v ZZ;
  
  private Zbkc ZS;
  
  private Zgff Z_;
  
  private Zgff Zf;
  
  private Zgff ZU;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbtm(Zzlr paramZzlr, int paramInt) {
    this.Zr = paramZzlr;
    this.Zx = paramInt;
    ZF();
    this.ZZ.setVisible(false);
    this.Zn.setVisible(false);
    this.ZD.setVisible(false);
    this.ZS.Zx(a(-30708, 26097) + a(-30708, 26097));
    this.ZB = new String[] { a(-30709, -19848), a(-30707, -2108) };
    this.ZA = new boolean[] { true, true };
    this.Zh = 1;
  }
  
  private void ZF() {
    this.Zq = new Zm99();
    this.ZZ = new Zm9v();
    this.Zf = new Zgff();
    this.ZV = new Zm99();
    this.Zm = new Zm99();
    this.Z_ = new Zgff();
    this.ZU = new Zgff();
    this.ZD = new Zm9v();
    this.Zn = new Zm9v();
    this.ZX = new Zm99();
    this.Zt = new Zl8w();
    this.Zj = new Zm2o();
    this.ZS = new Zbkc();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0 };
    setLayout(gridBagLayout);
    this.Zq.setText(a(-30710, 539));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    add(this.Zq, gridBagConstraints);
    this.ZZ.setText(a(-30705, -21305));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    add(this.ZZ, gridBagConstraints);
    this.Zf.setColumns(5);
    this.Zf.setText("5");
    this.Zf.ZH(Zlw9.NUMBER);
    this.Zf.addKeyListener(new Zxnx(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    add(this.Zf, gridBagConstraints);
    this.ZV.setText(a(-30715, 10832));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 1280;
    add(this.ZV, gridBagConstraints);
    this.Zm.setText(a(-30706, -15315));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1280;
    add(this.Zm, gridBagConstraints);
    this.Z_.setColumns(5);
    this.Z_.setText("3");
    this.Z_.ZH(Zlw9.NUMBER);
    this.Z_.addKeyListener(new Zss3(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    add(this.Z_, gridBagConstraints);
    this.ZU.setColumns(5);
    this.ZU.setText(a(-30712, -24463));
    this.ZU.ZH(Zlw9.NUMBER);
    this.ZU.addKeyListener(new Zlj(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    add(this.ZU, gridBagConstraints);
    this.ZD.setText(a(-30711, -17687));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 1280;
    add(this.ZD, gridBagConstraints);
    this.Zn.setText(a(-30711, -17687));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1280;
    add(this.Zn, gridBagConstraints);
    this.ZX.setText(" ");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weighty = 1.0D;
    add(this.ZX, gridBagConstraints);
    this.Zt.setText(a(-30716, 25587));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zt, gridBagConstraints);
    this.Zj.Zi(Zk97.DESKTOP_TOOLS_TARGET_SITE_MAP_COMPARING_SITE_MAP_SOURCES);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 5;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    add(this.Zj, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZS, gridBagConstraints);
  }
  
  private void ZC(KeyEvent paramKeyEvent) {
    try {
      int i = Integer.parseInt(this.Z_.getText());
      try {
        if (i >= 0) {
          try {
            if (i > 20)
              throw new Exception(); 
          } catch (Exception exception) {
            throw a(null);
          } 
        } else {
          throw new Exception();
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      this.Zn.setVisible(false);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.USER_ERROR);
      this.Zn.setVisible(true);
    } 
  }
  
  private void ZV(KeyEvent paramKeyEvent) {
    try {
      int i = Integer.parseInt(this.ZU.getText());
      try {
        if (i >= 0) {
          try {
            if (i > 600000)
              throw new Exception(); 
          } catch (Exception exception) {
            throw a(null);
          } 
        } else {
          throw new Exception();
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      this.ZD.setVisible(false);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.USER_ERROR);
      this.ZD.setVisible(true);
    } 
  }
  
  private void Zv(KeyEvent paramKeyEvent) {
    try {
      int i = Integer.parseInt(this.Zf.getText());
      try {
        if (i >= 1) {
          try {
            if (i > 50)
              throw new Exception(); 
          } catch (Exception exception) {
            throw a(null);
          } 
        } else {
          throw new Exception();
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      this.ZZ.setVisible(false);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.USER_ERROR);
      this.ZZ.setVisible(true);
    } 
  }
  
  public Zsic Zn(int paramInt) {
    try {
      Zl6 zl6;
      switch (paramInt) {
        case 0:
          return this.Zr.Zw(this);
        case 1:
          zl6 = this.Zr.Zh(this.Zx);
          try {
            try {
              zl6.ZH = Integer.parseInt(this.Zf.getText());
              if (zl6.ZH >= 1) {
                try {
                  if (zl6.ZH > 50)
                    throw new Exception(); 
                } catch (Exception exception) {
                  throw a(null);
                } 
              } else {
                throw new Exception();
              } 
            } catch (Exception exception) {
              throw a(null);
            } 
            try {
              zl6.Zk = Integer.parseInt(this.Z_.getText());
              if (zl6.Zk >= 0) {
                try {
                  if (zl6.Zk > 20)
                    throw new Exception(); 
                } catch (Exception exception) {
                  throw a(null);
                } 
              } else {
                throw new Exception();
              } 
            } catch (Exception exception) {
              throw a(null);
            } 
            try {
              zl6.Zw = Integer.parseInt(this.ZU.getText());
              if (zl6.Zw >= 0)
                try {
                  if (zl6.Zw <= 600000)
                    return this.Zr.ZV(this); 
                  throw new Exception();
                } catch (Exception exception) {
                  throw a(null);
                }  
            } catch (Exception exception) {
              throw a(null);
            } 
            throw new Exception();
          } catch (Exception exception) {
            Zah.Zl(exception, Zk_.USER_ERROR);
            return this;
          } 
      } 
    } catch (Exception exception) {
      throw a(null);
    } 
    Zuh.Zv(false, Zqf.Zk, paramInt);
    return this;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '­&ë9\\t¾¶BøLãK\\rÒwílÆléi©l%§l¿t+xÍ4T ëïkØfû/Ú-I²"ÿ |L[TÂ\\rlõ:<ê\\t-AÔi´2$ Ë4ß°kÊñHÓ\\nät¾ÏâûÃí'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #58
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 142
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
    //   64: goto -> 22
    //   67: ldc '<<Úuùq#üV2aÅã¤®»#'Ù©\\r\ï5÷]Ù¶čÙóÈï*ÛºbÖkÝÔÞEýyóø|ÁêÞ*6¦ýï\\b²²½Nîo=8üD#¦@÷)Å·ä×Åná.¾G8Ìà¼9¾f¯¡!Ãë²h»S;À}sZ¼òÒ\\rk}@ý¯AðùÖ6Í½vÊ5^¬Qdq§F|÷³(¨xsÅ/=ýú¶\\t¿#ÝÏmòm/J¯>HÛcÐîö\\bÎzÑä\\n|H_mß ëÁ·òÅZædì{SKaL%[Ö0ÁRLN&u¢Rh/û³é¿ )qÃY¡âBkD>?1Tõa¦\\f\\rÌöIÆ/'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #34
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #64
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
    //   128: putstatic burp/Zbtm.a : [Ljava/lang/String;
    //   131: bipush #10
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbtm.b : [Ljava/lang/String;
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
    //   212: bipush #55
    //   214: goto -> 244
    //   217: bipush #88
    //   219: goto -> 244
    //   222: bipush #58
    //   224: goto -> 244
    //   227: bipush #54
    //   229: goto -> 244
    //   232: bipush #67
    //   234: goto -> 244
    //   237: bipush #17
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
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF880D) & 0xFFFF;
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
      byte b1 = 108;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbtm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */