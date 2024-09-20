package burp;

import javax.swing.ButtonGroup;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

abstract class Zbb_ extends Zbv5 implements Zr6x {
  protected final Zbkk ZK;
  
  protected final ButtonGroup ZD = new ButtonGroup();
  
  protected final Zzdy Z_;
  
  protected final Zl8w ZX;
  
  protected final Zm99 ZJ;
  
  protected final Zbkc Zw;
  
  protected final Zmg2 ZQ;
  
  protected final Zmg2 ZN;
  
  protected final Zmg2 ZL;
  
  protected final Zmg2 Zn;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbb_() {
    Zbqc[] arrayOfZbqc = Zbb4.ZH();
    this.Z_ = new Zzdy();
    this.ZJ = new Zm99();
    this.Zn = new Zmg2();
    this.ZN = new Zmg2();
    this.ZQ = new Zmg2();
    this.ZL = new Zmg2();
    this.Zw = new Zbkc();
    this.ZX = new Zl8w();
    this.ZK = new Zbkk();
    this.ZK.ZB(Zk97.DESKTOP_TOOLS_INTRUDER_OPTIONS_HANDLING_REDIRECTIONS_DURING_ATTACKS, this, a(-17984, -31751));
    if (arrayOfZbqc == null)
      Zbqc.Zr(new Zbqc[4]); 
  }
  
  public Zmae Zy() {
    if (this.ZL.isSelected())
      return Zmae.NEVER_FOLLOW; 
    if (this.Zn.isSelected())
      return Zmae.FOLLOW_ON_SITE; 
    if (this.ZN.isSelected())
      return Zmae.FOLLOW_IN_SCOPE; 
    if (this.ZQ.isSelected())
      return Zmae.ALWAYS_FOLLOW; 
    Zuh.Zb(false, Zqf.Zx);
    return Zmae.NEVER_FOLLOW;
  }
  
  public void Zr(Zsh8 paramZsh8) {
    // Byte code:
    //   0: invokestatic ZH : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: getstatic burp/Zsit.ZT : [I
    //   7: aload_1
    //   8: invokeinterface ZPM : ()Lburp/Zmae;
    //   13: invokevirtual ordinal : ()I
    //   16: iaload
    //   17: tableswitch default -> 96, 1 -> 48, 2 -> 60, 3 -> 72, 4 -> 84
    //   48: aload_0
    //   49: getfield ZL : Lburp/Zmg2;
    //   52: iconst_1
    //   53: invokevirtual setSelected : (Z)V
    //   56: aload_2
    //   57: ifnonnull -> 112
    //   60: aload_0
    //   61: getfield Zn : Lburp/Zmg2;
    //   64: iconst_1
    //   65: invokevirtual setSelected : (Z)V
    //   68: aload_2
    //   69: ifnonnull -> 112
    //   72: aload_0
    //   73: getfield ZN : Lburp/Zmg2;
    //   76: iconst_1
    //   77: invokevirtual setSelected : (Z)V
    //   80: aload_2
    //   81: ifnonnull -> 112
    //   84: aload_0
    //   85: getfield ZQ : Lburp/Zmg2;
    //   88: iconst_1
    //   89: invokevirtual setSelected : (Z)V
    //   92: aload_2
    //   93: ifnonnull -> 112
    //   96: iconst_0
    //   97: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   100: aload_1
    //   101: invokeinterface ZPM : ()Lburp/Zmae;
    //   106: getfield displayName : Ljava/lang/String;
    //   109: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   112: aload_0
    //   113: getfield Z_ : Lburp/Zzdy;
    //   116: aload_1
    //   117: invokeinterface ZPj : ()Z
    //   122: invokevirtual setSelected : (Z)V
    //   125: return
  }
  
  public void ZX(Zsh8 paramZsh8) {
    paramZsh8.ZG(Zy());
    paramZsh8.ZG(this.Z_.isSelected());
  }
  
  public void ZP(Zb_j paramZb_j) {
    Zmg2[] arrayOfZmg2 = { this.ZL, this.Zn, this.ZN, this.ZQ };
    Zv(arrayOfZmg2, paramZb_j);
    paramZb_j.ZR(Zeew.INTRUDER, a(-17977, 20870), this.Z_.isSelected() ? a(-17979, 24005) : a(-17982, 22711));
  }
  
  public void Zs(Zb_j paramZb_j) {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray burp/Zmg2
    //   4: dup
    //   5: iconst_0
    //   6: aload_0
    //   7: getfield ZL : Lburp/Zmg2;
    //   10: aastore
    //   11: dup
    //   12: iconst_1
    //   13: aload_0
    //   14: getfield Zn : Lburp/Zmg2;
    //   17: aastore
    //   18: dup
    //   19: iconst_2
    //   20: aload_0
    //   21: getfield ZN : Lburp/Zmg2;
    //   24: aastore
    //   25: dup
    //   26: iconst_3
    //   27: aload_0
    //   28: getfield ZQ : Lburp/Zmg2;
    //   31: aastore
    //   32: astore_3
    //   33: invokestatic ZH : ()[Lburp/Zbqc;
    //   36: aload_3
    //   37: aload_1
    //   38: invokestatic Za : ([Lburp/Zmg2;Lburp/Zb_j;)V
    //   41: astore_2
    //   42: aload_1
    //   43: getstatic burp/Zeew.INTRUDER : Lburp/Zeew;
    //   46: sipush #-17981
    //   49: sipush #4366
    //   52: invokestatic a : (II)Ljava/lang/String;
    //   55: invokeinterface Zl : (Lburp/Zeew;Ljava/lang/String;)Ljava/lang/String;
    //   60: astore #4
    //   62: aload #4
    //   64: ifnonnull -> 79
    //   67: aload_0
    //   68: getfield Z_ : Lburp/Zzdy;
    //   71: iconst_0
    //   72: invokevirtual setSelected : (Z)V
    //   75: aload_2
    //   76: ifnonnull -> 100
    //   79: aload_0
    //   80: getfield Z_ : Lburp/Zzdy;
    //   83: aload #4
    //   85: sipush #-17978
    //   88: sipush #-16668
    //   91: invokestatic a : (II)Ljava/lang/String;
    //   94: invokevirtual equals : (Ljava/lang/Object;)Z
    //   97: invokevirtual setSelected : (Z)V
    //   100: invokestatic Zwu : ()[Lburp/Zbqc;
    //   103: ifnonnull -> 113
    //   106: iconst_4
    //   107: anewarray burp/Zbqc
    //   110: invokestatic Zl : ([Lburp/Zbqc;)V
    //   113: return
  }
  
  public void ZNH() {
    this.ZL.setSelected(true);
    this.Z_.setSelected(false);
  }
  
  private static void Zv(Zmg2[] paramArrayOfZmg2, Zb_j paramZb_j) {
    // Byte code:
    //   0: iconst_m1
    //   1: istore_3
    //   2: invokestatic ZH : ()[Lburp/Zbqc;
    //   5: iconst_0
    //   6: istore #4
    //   8: astore_2
    //   9: iload #4
    //   11: aload_0
    //   12: arraylength
    //   13: if_icmpge -> 40
    //   16: aload_0
    //   17: iload #4
    //   19: aaload
    //   20: invokevirtual isSelected : ()Z
    //   23: ifeq -> 33
    //   26: iload #4
    //   28: istore_3
    //   29: aload_2
    //   30: ifnonnull -> 40
    //   33: iinc #4, 1
    //   36: aload_2
    //   37: ifnonnull -> 9
    //   40: iload_3
    //   41: iconst_m1
    //   42: if_icmpeq -> 67
    //   45: aload_1
    //   46: getstatic burp/Zeew.INTRUDER : Lburp/Zeew;
    //   49: sipush #-17980
    //   52: sipush #-4595
    //   55: invokestatic a : (II)Ljava/lang/String;
    //   58: iload_3
    //   59: invokestatic toString : (I)Ljava/lang/String;
    //   62: invokeinterface ZR : (Lburp/Zeew;Ljava/lang/String;Ljava/lang/String;)V
    //   67: return
  }
  
  private static void Za(Zmg2[] paramArrayOfZmg2, Zb_j paramZb_j) {
    try {
      paramArrayOfZmg2[Integer.parseInt(paramZb_j.Zl(Zeew.INTRUDER, a(-17983, 7747)))].setSelected(true);
      return;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
      paramArrayOfZmg2[0].setSelected(true);
      return;
    } 
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'æh²õ)j)«txó4X©Uk¢ªSYqIò¨ùÑ©èz¿ÌÎhÐ hjõÕUõ#X5ëP<1¡\\t(A\\faì/Âù«Kþ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #20
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
    //   67: ldc '_NAmûGä3ÐÖõ]3cX\\rl\\nÆ.¸Î'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #25
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #68
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
    //   128: putstatic burp/Zbb_.a : [Ljava/lang/String;
    //   131: bipush #8
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zbb_.b : [Ljava/lang/String;
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
    //   173: tableswitch default -> 241, 0 -> 212, 1 -> 216, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: iconst_3
    //   213: goto -> 243
    //   216: bipush #19
    //   218: goto -> 243
    //   221: bipush #23
    //   223: goto -> 243
    //   226: bipush #85
    //   228: goto -> 243
    //   231: bipush #115
    //   233: goto -> 243
    //   236: bipush #76
    //   238: goto -> 243
    //   241: bipush #89
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
    //   282: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFB9C5) & 0xFFFF;
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
      byte b1 = 105;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbb_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */