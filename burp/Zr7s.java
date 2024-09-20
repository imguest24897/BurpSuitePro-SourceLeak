package burp;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;

class Zr7s extends Zrh7 {
  private final Zg8q ZA;
  
  private final Zmo2 Zk;
  
  private Zm2o Zs;
  
  private Zbkc Zc;
  
  private Zzdy ZH;
  
  private Zl8w Zx;
  
  private Zm99 ZX;
  
  private Zbqc Zl;
  
  private Zm99 Zy;
  
  private Zm99 Zg;
  
  private Zbqc Zt;
  
  private Zgff Zi;
  
  private Zgff Za;
  
  private Zgff Zo;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zr7s(Window paramWindow, Zmo2 paramZmo2, Ze4m paramZe4m, Zmzk paramZmzk, byte[] paramArrayOfbyte, Zt84 paramZt84, Zgb6 paramZgb6, Zbnt paramZbnt, Zb0h paramZb0h, Ztwv paramZtwv, Zr_4 paramZr_4, Zey9 paramZey9) {
    super(paramWindow, true, Zzv7.CUSTOM_PARAM_UI_DIALOG);
    this.Zk = paramZmo2;
    Zi();
    setTitle(a(28389, -29754));
    this.Zi.setText(paramZmo2.ZuR());
    this.Za.setText(paramZmo2.Zun());
    this.Zo.setText(paramZmo2.Zu0());
    this.ZA = new Zg8q(a(28393, 17129), paramZmo2.Zu7(), paramZe4m, paramZmzk, paramArrayOfbyte, paramZt84, paramZgb6, paramZbnt, paramZb0h, paramZtwv, paramZr_4, paramZey9);
    this.Zt.add(this.ZA, a(28399, -30037));
    this.ZH.setSelected(paramZmo2.ZuY());
    pack();
    Zq(paramWindow);
  }
  
  Zkk3 Zw() {
    return this.ZA.ZF();
  }
  
  String ZE() {
    return this.Zi.getText();
  }
  
  String Zp() {
    return this.Za.getText();
  }
  
  String ZX() {
    return this.Zo.getText();
  }
  
  private void Zi() {
    this.Zl = new Zbqc();
    this.ZX = new Zm99();
    this.Zi = new Zgff();
    this.Zt = new Zbqc();
    this.Zx = new Zl8w();
    this.Zc = new Zbkc();
    this.Zs = new Zm2o();
    this.ZH = new Zzdy();
    this.Zy = new Zm99();
    this.Zg = new Zm99();
    this.Za = new Zgff();
    this.Zo = new Zgff();
    setDefaultCloseOperation(0);
    this.Zl.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 15, 0, 15, 0, 15, 0 };
    gridBagLayout.rowHeights = new int[] { 
        0, 10, 0, 10, 0, 10, 0, 10, 0, 10, 
        0, 10, 0 };
    this.Zl.setLayout(gridBagLayout);
    this.ZX.setText(a(28392, -29771));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    this.Zl.add(this.ZX, gridBagConstraints);
    this.Zi.setColumns(25);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 1280;
    this.Zl.add(this.Zi, gridBagConstraints);
    this.Zt.setLayout(new BorderLayout());
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 12;
    gridBagConstraints.gridwidth = 7;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    gridBagConstraints.insets = new Insets(10, 0, 0, 0);
    this.Zl.add(this.Zt, gridBagConstraints);
    this.Zx.setText(a(28398, -28763));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 1280;
    gridBagConstraints.weightx = 1.0D;
    this.Zl.add(this.Zx, gridBagConstraints);
    this.Zc.Zx(a(28397, -25407));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 5;
    gridBagConstraints.anchor = 23;
    this.Zl.add(this.Zc, gridBagConstraints);
    this.Zs.Zi(Zk97.DESKTOP_OPTIONS_SESSIONS_MACRO_EDITOR_CUSTOM_PARAMETER_LOCATIONS_IN_RESPONSE);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridheight = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    this.Zl.add(this.Zs, gridBagConstraints);
    this.ZH.setText(a(28395, 13303));
    this.ZH.addActionListener(new Zk2r(this));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 10;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(5, 0, 0, 0);
    this.Zl.add(this.ZH, gridBagConstraints);
    this.Zy.setText(a(28388, -6200));
    this.Zy.setToolTipText("");
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    this.Zl.add(this.Zy, gridBagConstraints);
    this.Zg.setText(a(28396, 9862));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    this.Zl.add(this.Zg, gridBagConstraints);
    this.Za.setColumns(25);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 23;
    this.Zl.add(this.Za, gridBagConstraints);
    this.Zo.setColumns(25);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 23;
    this.Zl.add(this.Zo, gridBagConstraints);
    getContentPane().add(this.Zl, a(28394, 22534));
    pack();
  }
  
  private void ZF(ActionEvent paramActionEvent) {
    this.Zk.Znt(this.ZH.isSelected());
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'â&Å[<ïTü9:¹$¥¢^"°'m¬;&ÅÎj6U¬Ëbj²×5¦ÊÄÂ0l)è>h\;ì.n»àâ*«yR7[Ç)[æÌÑW¥Ú{«rA¼°Ü>ñÌ\\tM×Ë^hå¾ðÚëÞ"\\rtÖ^/ÙGÓ»Amvâ*,ÞI»RáWBèPm%CM¯zaÊ«Ñ²ÔÖS9m2_Òó¼(wT|Ü©­¢àøQuxÄÕmOÆ[`åb«Ø|@6¥9þg!ôöØÓ\ãyäd»üP!ÏbHÕxª\~Fº¢zE%EÞB?ðoZëAvSÆ&¯® ýqÅÎ\"fÃßi\\n¨"tnKâdä[Ñ;¨Xo ë>Ó`¶;Ã ÿÝÀ¨\\tär¦;¬¾«æfUÀ<«%vÖsõ®uÔO¤c*t/±oOv÷Fz¸{a-\\t>'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #23
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #69
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
    //   68: ldc 'ÝwVÖèã$ZõÙ*#fb÷ýÕ±¥"Ø/^ÎÅÆ·³S¡èÙ_u÷X*Xøþ²ùCZ¿Ï/'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #23
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #18
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
    //   129: putstatic burp/Zr7s.a : [Ljava/lang/String;
    //   132: bipush #10
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zr7s.b : [Ljava/lang/String;
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
    //   212: bipush #13
    //   214: goto -> 244
    //   217: bipush #75
    //   219: goto -> 244
    //   222: bipush #119
    //   224: goto -> 244
    //   227: bipush #33
    //   229: goto -> 244
    //   232: bipush #94
    //   234: goto -> 244
    //   237: bipush #119
    //   239: goto -> 244
    //   242: bipush #33
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
    int i = (paramInt1 ^ 0x6EED) & 0xFFFF;
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
      char c = 'Ä';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr7s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */