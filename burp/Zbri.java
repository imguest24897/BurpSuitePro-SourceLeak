package burp;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zbri extends Zbg2 {
  private final Zr8_ Zk;
  
  private Zl8w ZX;
  
  private Zl8w Zm;
  
  private Zl8w ZZ;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zbri(Zr8_ paramZr8_, String paramString, boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: invokestatic Zs : ()I
    //   7: aload_0
    //   8: aload_1
    //   9: putfield Zk : Lburp/Zr8_;
    //   12: aload_0
    //   13: invokevirtual Zq : ()V
    //   16: iconst_0
    //   17: istore #6
    //   19: istore #5
    //   21: aload_2
    //   22: ifnull -> 71
    //   25: aload_0
    //   26: getfield ZZ : Lburp/Zl8w;
    //   29: sipush #28000
    //   32: sipush #12727
    //   35: invokestatic a : (II)Ljava/lang/String;
    //   38: invokevirtual setText : (Ljava/lang/String;)V
    //   41: aload_0
    //   42: getfield ZX : Lburp/Zl8w;
    //   45: aload_2
    //   46: invokevirtual setText : (Ljava/lang/String;)V
    //   49: aload_0
    //   50: getfield ZX : Lburp/Zl8w;
    //   53: iconst_1
    //   54: invokevirtual setVisible : (Z)V
    //   57: aload_0
    //   58: getfield Zm : Lburp/Zl8w;
    //   61: ldc ' '
    //   63: invokevirtual setText : (Ljava/lang/String;)V
    //   66: iload #5
    //   68: ifne -> 228
    //   71: iload_3
    //   72: ifeq -> 141
    //   75: aload_0
    //   76: getfield ZZ : Lburp/Zl8w;
    //   79: sipush #28015
    //   82: sipush #29594
    //   85: invokestatic a : (II)Ljava/lang/String;
    //   88: invokevirtual setText : (Ljava/lang/String;)V
    //   91: aload_0
    //   92: getfield ZX : Lburp/Zl8w;
    //   95: getstatic burp/Zrgs.SAVE_PROJECT_DATA_CORRUPTION_DETECTED : Lburp/Zrgs;
    //   98: iconst_0
    //   99: anewarray java/lang/Object
    //   102: invokevirtual ZN : ([Ljava/lang/Object;)Ljava/lang/String;
    //   105: invokevirtual setText : (Ljava/lang/String;)V
    //   108: aload_0
    //   109: getfield ZX : Lburp/Zl8w;
    //   112: iconst_1
    //   113: invokevirtual setVisible : (Z)V
    //   116: aload_0
    //   117: getfield Zm : Lburp/Zl8w;
    //   120: getstatic burp/Zrgs.SAVE_PROJECT_RESTART_MESSAGE : Lburp/Zrgs;
    //   123: iconst_0
    //   124: anewarray java/lang/Object
    //   127: invokevirtual ZN : ([Ljava/lang/Object;)Ljava/lang/String;
    //   130: invokevirtual setText : (Ljava/lang/String;)V
    //   133: iconst_1
    //   134: istore #6
    //   136: iload #5
    //   138: ifne -> 228
    //   141: iload #4
    //   143: ifeq -> 184
    //   146: aload_0
    //   147: getfield ZZ : Lburp/Zl8w;
    //   150: sipush #28007
    //   153: sipush #25206
    //   156: invokestatic a : (II)Ljava/lang/String;
    //   159: invokevirtual setText : (Ljava/lang/String;)V
    //   162: aload_0
    //   163: getfield ZX : Lburp/Zl8w;
    //   166: iconst_0
    //   167: invokevirtual setVisible : (Z)V
    //   170: aload_0
    //   171: getfield Zm : Lburp/Zl8w;
    //   174: ldc ' '
    //   176: invokevirtual setText : (Ljava/lang/String;)V
    //   179: iload #5
    //   181: ifne -> 228
    //   184: aload_0
    //   185: getfield ZZ : Lburp/Zl8w;
    //   188: sipush #28003
    //   191: sipush #-18892
    //   194: invokestatic a : (II)Ljava/lang/String;
    //   197: invokevirtual setText : (Ljava/lang/String;)V
    //   200: aload_0
    //   201: getfield ZX : Lburp/Zl8w;
    //   204: iconst_0
    //   205: invokevirtual setVisible : (Z)V
    //   208: aload_0
    //   209: getfield Zm : Lburp/Zl8w;
    //   212: getstatic burp/Zrgs.SAVE_PROJECT_RESTART_MESSAGE : Lburp/Zrgs;
    //   215: iconst_0
    //   216: anewarray java/lang/Object
    //   219: invokevirtual ZN : ([Ljava/lang/Object;)Ljava/lang/String;
    //   222: invokevirtual setText : (Ljava/lang/String;)V
    //   225: iconst_1
    //   226: istore #6
    //   228: aload_0
    //   229: iload #6
    //   231: ifeq -> 265
    //   234: iconst_2
    //   235: anewarray java/lang/String
    //   238: dup
    //   239: iconst_0
    //   240: sipush #28014
    //   243: sipush #-20804
    //   246: invokestatic a : (II)Ljava/lang/String;
    //   249: aastore
    //   250: dup
    //   251: iconst_1
    //   252: sipush #28005
    //   255: sipush #-20392
    //   258: invokestatic a : (II)Ljava/lang/String;
    //   261: aastore
    //   262: goto -> 281
    //   265: iconst_1
    //   266: anewarray java/lang/String
    //   269: dup
    //   270: iconst_0
    //   271: sipush #28002
    //   274: sipush #-9114
    //   277: invokestatic a : (II)Ljava/lang/String;
    //   280: aastore
    //   281: putfield ZB : [Ljava/lang/String;
    //   284: aload_0
    //   285: iload #6
    //   287: ifeq -> 304
    //   290: iconst_2
    //   291: newarray boolean
    //   293: dup
    //   294: iconst_0
    //   295: iconst_1
    //   296: bastore
    //   297: dup
    //   298: iconst_1
    //   299: iconst_1
    //   300: bastore
    //   301: goto -> 311
    //   304: iconst_1
    //   305: newarray boolean
    //   307: dup
    //   308: iconst_0
    //   309: iconst_1
    //   310: bastore
    //   311: putfield ZA : [Z
    //   314: aload_0
    //   315: iconst_0
    //   316: putfield Zh : I
    //   319: return
  }
  
  public Zsic Zn(int paramInt) {
    switch (paramInt) {
      case 0:
        return null;
      case 1:
        return this.Zk.ZY(this);
    } 
    Zuh.Zv(false, Zqf.Zk, paramInt);
    return this;
  }
  
  private void Zq() {
    this.ZZ = new Zl8w();
    this.ZX = new Zl8w();
    this.Zm = new Zl8w();
    GridBagLayout gridBagLayout = new GridBagLayout();
    gridBagLayout.columnWidths = new int[] { 0 };
    gridBagLayout.rowHeights = new int[] { 0, 5, 0, 5, 0 };
    setLayout(gridBagLayout);
    this.ZZ.setText(a(28001, 28722));
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.insets = new Insets(5, 0, 0, 0);
    add(this.ZZ, gridBagConstraints);
    this.ZX.setText(a(28004, -2990));
    this.ZX.Zl(true);
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    add(this.ZX, gridBagConstraints);
    this.Zm.setColumns(20);
    this.Zm.setRows(5);
    this.Zm.setText(a(28006, 27154));
    gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.fill = 2;
    gridBagConstraints.anchor = 23;
    gridBagConstraints.weightx = 1.0D;
    gridBagConstraints.weighty = 1.0D;
    add(this.Zm, gridBagConstraints);
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'f¢ÝÓ£­Á%Ôâ6G{>×>Ñ±liý.T\\nó%U@µðl\\tÔ1,Oqi¹\\bøYªÍþOiÏ-tªþM\\botÂÃ5Ó~{ÐìNù'ÄËlÛ\\tÁMc>ªNÆk_´¤'ØlûÈ dtÙ]ÚîF'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #27
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
    //   68: ldc '`ÙïéwNõ\\b0îC6)\\f¸Ûm:§_B7»%3'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #14
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #16
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
    //   129: putstatic burp/Zbri.a : [Ljava/lang/String;
    //   132: bipush #10
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zbri.b : [Ljava/lang/String;
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
    //   212: bipush #36
    //   214: goto -> 244
    //   217: bipush #102
    //   219: goto -> 244
    //   222: bipush #64
    //   224: goto -> 244
    //   227: bipush #90
    //   229: goto -> 244
    //   232: bipush #119
    //   234: goto -> 244
    //   237: bipush #110
    //   239: goto -> 244
    //   242: bipush #90
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
    int i = (paramInt1 ^ 0x6D67) & 0xFFFF;
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
      byte b1 = 35;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbri.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */