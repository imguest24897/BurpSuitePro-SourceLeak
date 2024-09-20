package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zbms extends Zbv5 {
  private Zgvc ZB;
  
  private ButtonGroup ZH;
  
  private Zzdy Zd;
  
  private Zzdy ZD;
  
  private Zzdy Zi;
  
  private Zl8w ZK;
  
  private Zm2o Zm;
  
  private Zm99 Zx;
  
  private Zm99 Zq;
  
  private Zm99 Zk;
  
  private Zm9v ZP;
  
  private Zm9v Zt;
  
  private Zbkc Zs;
  
  private Zmg2 ZF;
  
  private Zmg2 Zg;
  
  private Zmg2 Zc;
  
  private Zgff ZJ;
  
  private Zgff Zo;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbms(Zgvc paramZgvc) {
    this.ZB = paramZgvc;
    Zb();
    Zz((KeyEvent)null);
    ZH((ActionEvent)null);
    ZB((KeyEvent)null);
    ZJ((ActionEvent)null);
    Zc((ActionEvent)null);
  }
  
  byte Zf() {
    if (this.ZF.isSelected())
      return 0; 
    if (this.Zc.isSelected())
      return 2; 
    if (this.Zg.isSelected())
      return 1; 
    Zuh.Zb(false, Zqf.Zx);
    return 0;
  }
  
  private void Zb() {
    this.ZH = new ButtonGroup();
    this.Zx = new Zm99();
    this.Zo = new Zgff();
    this.Zq = new Zm99();
    this.Zc = new Zmg2();
    this.Zg = new Zmg2();
    this.ZF = new Zmg2();
    this.ZD = new Zzdy();
    this.Zi = new Zzdy();
    this.Zd = new Zzdy();
    this.Zk = new Zm99();
    this.ZJ = new Zgff();
    this.ZP = new Zm9v();
    this.Zt = new Zm9v();
    this.ZK = new Zl8w();
    this.Zs = new Zbkc();
    this.Zm = new Zm2o();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 
        0, 5, 0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.Zx.setText(a(29841, 14704));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    add(this.Zx, gridBagConstraints);
    this.Zo.setColumns(5);
    this.Zo.setText("2");
    this.Zo.ZH(Zlw9.NUMBER);
    this.Zo.addKeyListener(new Zb4x(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.anchor = 1280;
    add(this.Zo, gridBagConstraints);
    this.Zq.setText(a(29842, 10985));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    add(this.Zq, gridBagConstraints);
    this.ZH.add(this.Zc);
    this.Zc.setText(a(29844, -5247));
    this.Zc.addActionListener(new Zza6(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 1280;
    add(this.Zc, gridBagConstraints);
    this.ZH.add(this.Zg);
    this.Zg.setText(a(29855, -6537));
    this.Zg.addActionListener(new Zmgo(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 1280;
    add(this.Zg, gridBagConstraints);
    this.ZH.add(this.ZF);
    this.ZF.setSelected(true);
    this.ZF.setText(a(29845, 22184));
    this.ZF.addActionListener(new Zlfx(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 1280;
    add(this.ZF, gridBagConstraints);
    this.ZD.setSelected(true);
    this.ZD.setText(a(29851, -19821));
    this.ZD.addActionListener(new Zlec(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 1280;
    add(this.ZD, gridBagConstraints);
    this.Zi.setSelected(true);
    this.Zi.setText(a(29850, -16179));
    this.Zi.addActionListener(new Zx_y(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 14;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(0, 0, 10, 0);
    add(this.Zi, gridBagConstraints);
    this.Zd.setSelected(true);
    this.Zd.setText(a(29843, 7594));
    this.Zd.addActionListener(new Zee(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    add(this.Zd, gridBagConstraints);
    this.Zk.setText(a(29840, 15965));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 1280;
    add(this.Zk, gridBagConstraints);
    this.ZJ.setColumns(5);
    this.ZJ.setText("4");
    this.ZJ.ZH(Zlw9.NUMBER);
    this.ZJ.addKeyListener(new Zlho(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 6;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.anchor = 1280;
    add(this.ZJ, gridBagConstraints);
    this.ZP.setText(a(29848, 349));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 16;
    gridBagConstraints.anchor = 1280;
    add(this.ZP, gridBagConstraints);
    this.Zt.setText(a(29849, 30222));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 8;
    gridBagConstraints.gridy = 18;
    gridBagConstraints.anchor = 1280;
    add(this.Zt, gridBagConstraints);
    this.ZK.setText(a(29846, 31972));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZK, gridBagConstraints);
    this.Zs.Zx(a(29847, 25656));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.anchor = 21;
    add(this.Zs, gridBagConstraints);
    this.Zm.Zi(Zk97.DESKTOP_FUNCTIONS_CONTENT_DISCOVERY_DISCOVERY_ENGINE);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    add(this.Zm, gridBagConstraints);
  }
  
  private void Zz(KeyEvent paramKeyEvent) {
    try {
      int i = Integer.parseInt(this.ZJ.getText());
      try {
        if (i > 0) {
          try {
            if (i > 255)
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
      this.ZP.setVisible(false);
      this.ZB.ZB(i);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.USER_ERROR);
      this.ZP.setVisible(true);
    } 
  }
  
  private void ZH(ActionEvent paramActionEvent) {
    this.ZB.ZW(this.Zi.isSelected());
    this.Zo.setEnabled(this.Zi.isSelected());
  }
  
  private void ZB(KeyEvent paramKeyEvent) {
    try {
      int i = Integer.parseInt(this.Zo.getText());
      try {
        if (i > 0) {
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
      this.Zt.setVisible(false);
      this.ZB.Zp(i);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.USER_ERROR);
      this.Zt.setVisible(true);
    } 
  }
  
  private void Zt(ActionEvent paramActionEvent) {
    this.ZB.ZS((byte)0);
  }
  
  private void Zu(ActionEvent paramActionEvent) {
    this.ZB.ZS((byte)2);
  }
  
  private void Zv(ActionEvent paramActionEvent) {
    this.ZB.ZS((byte)1);
  }
  
  private void ZJ(ActionEvent paramActionEvent) {
    this.ZB.ZB(this.Zd.isSelected());
  }
  
  private void Zc(ActionEvent paramActionEvent) {
    this.ZB.ZR(this.ZD.isSelected());
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #13
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '\\fÍzñ·ð7ÎÕÀ· *j/>$z¥¶&fQêÒa?¾9N0ðï¢Hk(¿Í6ö9Jd±f\\fZéËæZ}D»°êtì·åÜüØÒ3_ÉWÕ°ÇÁ¬UñkÄ52SÅ<\\f¶Ú|g£¸ò;øJÉR¦IY[XSZJ¤îãt½b& p¢ÑB}K_GÁ¡ÖìØ,ØùýÁ2|jIí`Di6ÞØÉPD­¸&eÌ¥å{Kø5\\rWE 7BÉè±iÈ\\t6¥×$¬;Þ4cü½\\tväÊ3!\\fx \\n2ñÆ _®nôûWÏR+ãJhZQ¯ÉÿX#Øu¦h&×ÄÂ%JU;ÑÃ½ì¿Ý\\nøÒm\\r~æZ3°äõZaï'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #40
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #127
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
    //   68: ldc 'ÁÚdE+]ñù8Ø½Ï4XÛ'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #13
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
    //   129: putstatic burp/Zbms.a : [Ljava/lang/String;
    //   132: bipush #13
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbms.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 259
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
    //   212: bipush #26
    //   214: goto -> 243
    //   217: bipush #77
    //   219: goto -> 243
    //   222: bipush #80
    //   224: goto -> 243
    //   227: bipush #50
    //   229: goto -> 243
    //   232: bipush #6
    //   234: goto -> 243
    //   237: bipush #99
    //   239: goto -> 243
    //   242: iconst_5
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7493) & 0xFFFF;
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
      char c = 'ª';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbms.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */