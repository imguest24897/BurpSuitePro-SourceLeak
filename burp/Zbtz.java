package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zbtz extends Zbg2 implements Ztep {
  private final Zz9c ZN;
  
  private final Zt90 Zz;
  
  private final Zbtl ZU;
  
  private Zbkc ZV;
  
  private Zl8w ZR;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbtz(Zz9c paramZz9c, Zt90 paramZt90, Zkce paramZkce, Zbtl paramZbtl) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: invokestatic Zr : ()Ljava/lang/String;
    //   7: aload_0
    //   8: aload_1
    //   9: putfield ZN : Lburp/Zz9c;
    //   12: astore #5
    //   14: aload_0
    //   15: aload_2
    //   16: putfield Zz : Lburp/Zt90;
    //   19: aload_0
    //   20: aload #4
    //   22: putfield ZU : Lburp/Zbtl;
    //   25: invokestatic ZG : ()Z
    //   28: ifeq -> 50
    //   31: getstatic java/lang/System.out : Ljava/io/PrintStream;
    //   34: aload_3
    //   35: invokevirtual ZD : ()Ljava/lang/String;
    //   38: invokevirtual println : (Ljava/lang/String;)V
    //   41: aload_0
    //   42: invokevirtual Zc : ()V
    //   45: aload #5
    //   47: ifnonnull -> 65
    //   50: aload_0
    //   51: invokevirtual Zl : ()V
    //   54: aload_0
    //   55: getfield ZR : Lburp/Zl8w;
    //   58: aload_3
    //   59: invokevirtual ZD : ()Ljava/lang/String;
    //   62: invokevirtual setText : (Ljava/lang/String;)V
    //   65: aload_0
    //   66: iconst_3
    //   67: anewarray java/lang/String
    //   70: dup
    //   71: iconst_0
    //   72: sipush #9584
    //   75: sipush #-26122
    //   78: invokestatic a : (II)Ljava/lang/String;
    //   81: aastore
    //   82: dup
    //   83: iconst_1
    //   84: sipush #9586
    //   87: sipush #-27351
    //   90: invokestatic a : (II)Ljava/lang/String;
    //   93: aastore
    //   94: dup
    //   95: iconst_2
    //   96: sipush #9587
    //   99: sipush #21739
    //   102: invokestatic a : (II)Ljava/lang/String;
    //   105: aastore
    //   106: putfield ZB : [Ljava/lang/String;
    //   109: aload_0
    //   110: iconst_3
    //   111: newarray boolean
    //   113: dup
    //   114: iconst_0
    //   115: iconst_1
    //   116: bastore
    //   117: dup
    //   118: iconst_1
    //   119: iconst_1
    //   120: bastore
    //   121: dup
    //   122: iconst_2
    //   123: iconst_1
    //   124: bastore
    //   125: putfield ZA : [Z
    //   128: aload_0
    //   129: iconst_1
    //   130: putfield Zh : I
    //   133: return
  }
  
  public Zsic Zn(int paramInt) {
    switch (paramInt) {
      case 0:
        return Zx6o.ZY(this.ZN.ZU(), a(9585, 31193)) ? null : this;
      case 1:
        return this.ZU;
      case 2:
        return new Zbtx(this.ZN, this.Zz, this.ZU);
    } 
    Zuh.Zv(false, Zqf.Zk, paramInt);
    return this;
  }
  
  public void Zc() {
    this.ZN.Zf();
  }
  
  private void Zl() {
    this.ZV = new Zbkc();
    this.ZR = new Zl8w();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0 };
    setLayout(gridBagLayout);
    this.ZV.Zx(a(9588, 17915));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = 23;
    add(this.ZV, gridBagConstraints);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    add(this.ZR, gridBagConstraints);
  }
  
  public boolean Zu() {
    return false;
  }
  
  public Zsic Zp(String paramString) {
    return null;
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '¼Ã9Ä!±9VíRñÞ£ÒÆ^ÐÈWc| {Vµ1Ù^éy«ª¶. 8¤Q'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #6
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #56
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
    //   64: goto -> 22
    //   67: ldc 'æå¼Q¿¨ñ\\n»>Q³/¤JÀ6>^Ç[Ì?ºa'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #17
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #87
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 141
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
    //   128: putstatic burp/Zbtz.a : [Ljava/lang/String;
    //   131: iconst_5
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zbtz.b : [Ljava/lang/String;
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
    //   212: bipush #82
    //   214: goto -> 244
    //   217: bipush #60
    //   219: goto -> 244
    //   222: bipush #68
    //   224: goto -> 244
    //   227: bipush #29
    //   229: goto -> 244
    //   232: bipush #64
    //   234: goto -> 244
    //   237: bipush #111
    //   239: goto -> 244
    //   242: bipush #6
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
    //   283: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x2570) & 0xFFFF;
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
      char c = 'Ø';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbtz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */