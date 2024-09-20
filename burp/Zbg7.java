package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.ButtonGroup;

class Zbg7 extends Zbg2 {
  private final Zr5w ZT;
  
  private Zm2o Zr;
  
  private Zl8w Zj;
  
  private Zm99 ZY;
  
  private ButtonGroup Zi;
  
  private Zm99 Zg;
  
  private Zm99 Zl;
  
  private Zm9v ZW;
  
  private Zmg2 ZM;
  
  private Zmg2 ZR;
  
  private Zgff Zs;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbg7(Zr5w paramZr5w) {
    this.ZT = paramZr5w;
    ZH();
    this.Zs.ZM(a(25214, -15278));
    this.ZW.setVisible(false);
    this.ZB = new String[] { a(25208, -26874), a(25215, -20089) };
    this.ZA = new boolean[] { true, true };
    this.Zh = 1;
  }
  
  public Zsic Zn(int paramInt) {
    // Byte code:
    //   0: invokestatic ZV : ()Ljava/lang/String;
    //   3: astore_2
    //   4: iload_1
    //   5: lookupswitch default -> 123, 0 -> 32, 1 -> 58
    //   32: aload_0
    //   33: getfield ZT : Lburp/Zr5w;
    //   36: invokevirtual Zt : ()Lburp/Zl04;
    //   39: sipush #25211
    //   42: sipush #-14982
    //   45: invokestatic a : (II)Ljava/lang/String;
    //   48: invokestatic ZY : (Ljava/awt/Component;Ljava/lang/Object;)Z
    //   51: ifeq -> 56
    //   54: aconst_null
    //   55: areturn
    //   56: aload_0
    //   57: areturn
    //   58: iconst_0
    //   59: istore_3
    //   60: aload_0
    //   61: invokevirtual Zy : ()Ljava/lang/String;
    //   64: astore #4
    //   66: aload #4
    //   68: invokestatic Zv : (Ljava/lang/String;)Z
    //   71: ifne -> 88
    //   74: aload_0
    //   75: getfield ZW : Lburp/Zm9v;
    //   78: iconst_1
    //   79: invokevirtual setVisible : (Z)V
    //   82: iconst_1
    //   83: istore_3
    //   84: aload_2
    //   85: ifnull -> 96
    //   88: aload_0
    //   89: getfield ZW : Lburp/Zm9v;
    //   92: iconst_0
    //   93: invokevirtual setVisible : (Z)V
    //   96: aload_0
    //   97: invokevirtual Zq : ()I
    //   100: iconst_m1
    //   101: if_icmpne -> 106
    //   104: iconst_1
    //   105: istore_3
    //   106: iload_3
    //   107: ifeq -> 114
    //   110: aload_0
    //   111: goto -> 122
    //   114: aload_0
    //   115: getfield ZT : Lburp/Zr5w;
    //   118: aload_0
    //   119: invokevirtual Zu : (Lburp/Zsic;)Lburp/Zsic;
    //   122: areturn
    //   123: iconst_0
    //   124: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   127: iload_1
    //   128: i2l
    //   129: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   132: aload_0
    //   133: areturn
  }
  
  String Zy() {
    String str = this.Zs.getText();
    return str.isEmpty() ? "*" : str;
  }
  
  int Zq() {
    return this.ZM.isSelected() ? 0 : (this.ZR.isSelected() ? 1 : -1);
  }
  
  private void ZH() {
    this.Zi = new ButtonGroup();
    this.Zr = new Zm2o();
    this.ZM = new Zmg2();
    this.ZR = new Zmg2();
    this.Zs = new Zgff();
    this.Zg = new Zm99();
    this.ZY = new Zm99();
    this.ZW = new Zm9v();
    this.Zl = new Zm99();
    this.Zj = new Zl8w();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0, 5, 0, 5, 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0, 5, 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.Zr.Zi(Zk97.DESKTOP_SETTINGS_NETWORK_TLS_CLIENT_TLS_CERTIFICATES);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.insets = new Insets(0, 0, 0, 5);
    add(this.Zr, gridBagConstraints);
    this.Zi.add(this.ZM);
    this.ZM.setText(a(25210, 26410));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZM, gridBagConstraints);
    this.Zi.add(this.ZR);
    this.ZR.setText(a(25209, -8282));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZR, gridBagConstraints);
    this.Zs.setColumns(30);
    this.Zs.ZH(Zlw9.HOST_WILDCARD);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 1;
    gridBagConstraints.anchor = 1280;
    add(this.Zs, gridBagConstraints);
    this.Zg.setText(a(25213, -20030));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.anchor = 1280;
    add(this.Zg, gridBagConstraints);
    this.ZY.setText(a(25212, -32546));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.anchor = 1280;
    add(this.ZY, gridBagConstraints);
    this.ZW.setText(a(25206, -28345));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 4;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = 23;
    add(this.ZW, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 8;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weighty = 1.0D;
    add(this.Zl, gridBagConstraints);
    this.Zj.setText(a(25207, -1531));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.Zj, gridBagConstraints);
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Óf%AêÛÿË\\tJm^âÛçº"<Ä±MIí8yZÙßJûÚUÈUÕ½°6oÙóèª\\fE=WÜ°T\ Y¸½ÍÛ\\tQÃÜå`-4^Mñ]Wg¸\\f}düm í¢)¾¶u©»O[Ù\\f(»°)¹©w»ÍLU\\f²Ú#eMº<dx§\\n%µî­§é8x¹&@Ø0fuZªUãµ)aÍéw`z\\fÑº-$-ógÞý7wÛ¤¡î6'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #123
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 143
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
    //   67: ldc 'Å[W6²ÃHàöoçÄ½ÅÒÀïJ"+UÂ m¼85§E9:òP©ê¬£Tï¼;S-îñÑÌ«¯]¦MY¸¡gûýADæÙõ/«¸êß]ÎÞP8É"rÂ¸Õä¯¶rÛïòUä·[lÈ9øTQÁÍ¬Ø½JyB¯e¹¬¨ñÝ×`|ý*¥WæçFKyÀç¾V)fGÒ'ÄlÏh· 5Õw£NfVØùwùv:Ìù;tÍpT2¼ú,þseRRÿ"ÝnPÊç.dãmõmsª¸fDË÷½Àð\\b'zÝëzX)óá¾9QX<á\àngúr´\Ad¢øïéÇ*Môi\Çe]]jÔ4Ì'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: sipush #261
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #13
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
    //   129: putstatic burp/Zbg7.a : [Ljava/lang/String;
    //   132: bipush #10
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbg7.b : [Ljava/lang/String;
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
    //   212: bipush #17
    //   214: goto -> 244
    //   217: bipush #89
    //   219: goto -> 244
    //   222: bipush #61
    //   224: goto -> 244
    //   227: bipush #107
    //   229: goto -> 244
    //   232: bipush #119
    //   234: goto -> 244
    //   237: bipush #73
    //   239: goto -> 244
    //   242: bipush #122
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
    //   283: tableswitch default -> 39, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x627F) & 0xFFFF;
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
      byte b1 = 8;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbg7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */