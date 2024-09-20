package burp;

public class Zsz implements Zk8x {
  private static final String[] a;
  
  private static final String[] b;
  
  public Short ZT(Zstu paramZstu, Zm7o paramZm7o) {
    int i = Zi(paramZstu, paramZm7o);
    int[] arrayOfInt = Zesg.Zj();
    int j = Zz(paramZstu, i);
    if (i < paramZstu.Zpu() && j < paramZstu.Zpu() && j >= 0 && Zd(paramZstu, i, j)) {
      if (ZN(paramZstu, ++i, j))
        return Short.valueOf((short)262); 
      int k = ZJ(paramZstu, i, j);
      if (Zo(paramZstu, i, k, j)) {
        String str = paramZstu.Zb(i, k).Zis().toLowerCase();
        return Zq(str) ? Short.valueOf((short)256) : Short.valueOf((short)262);
      } 
    } 
    if (Zbqc.Zwu() == null)
      Zesg.ZG(new int[2]); 
    return Short.valueOf((short)1);
  }
  
  private int Zi(Zstu paramZstu, Zm7o paramZm7o) {
    int[] arrayOfInt = Zesg.Zj();
    int i = paramZm7o.Zz();
    while (i < paramZstu.Zpu() && paramZstu.Zp(i) <= 32) {
      i++;
      if (arrayOfInt == null)
        break; 
    } 
    return i;
  }
  
  private int Zz(Zstu paramZstu, int paramInt) {
    int[] arrayOfInt = Zesg.Zj();
    int i = paramZstu.Zpu() - 1;
    while (i > paramInt && paramZstu.Zp(i) <= 32) {
      i--;
      if (arrayOfInt == null)
        break; 
    } 
    return i;
  }
  
  private boolean Zd(Zstu paramZstu, int paramInt1, int paramInt2) {
    return (paramZstu.Zp(paramInt1) == 60 && paramZstu.Zp(paramInt2) == 62);
  }
  
  private boolean ZN(Zstu paramZstu, int paramInt1, int paramInt2) {
    int i = Zlt_.ZT(paramZstu, (byte)62, paramInt1, paramInt2 + 1);
    return (i == paramInt2) ? ((paramZstu.Zp(paramInt2 - 1) == 47)) : false;
  }
  
  private int ZJ(Zstu paramZstu, int paramInt1, int paramInt2) {
    int[] arrayOfInt = Zesg.Zj();
    int i = paramInt1;
    while (i < paramInt2 && paramZstu.Zp(i) != 62 && paramZstu.Zp(i) != 32) {
      i++;
      if (arrayOfInt == null)
        break; 
    } 
    return i;
  }
  
  private boolean Zo(Zstu paramZstu, int paramInt1, int paramInt2, int paramInt3) {
    int[] arrayOfInt = Zesg.Zj();
    int i = paramInt3;
    while (i > paramInt2 && paramZstu.Zp(i) != 47) {
      i--;
      if (arrayOfInt == null)
        break; 
    } 
    return (paramZstu.Zp(i) != 47) ? false : (ZK(paramInt1, paramInt2, ++i, paramInt3) ? false : (!Zd(paramZstu, paramInt1, paramInt2, i, paramInt3)));
  }
  
  private boolean ZK(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return (paramInt2 - paramInt1 == 0 || paramInt2 - paramInt1 != paramInt4 - paramInt3);
  }
  
  private boolean Zd(Zstu paramZstu, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return !Zlt_.ZC(paramZstu, paramInt1, paramInt2, paramZstu, paramInt3, paramInt4);
  }
  
  private boolean Zq(String paramString) {
    return (paramString.equals(a(-4737, -22867)) || paramString.equals(a(-4740, 24774)) || paramString.equals(a(-4767, -30175)) || paramString.equals(a(-4739, -27126)) || paramString.equals(a(-4741, 3725)) || paramString.equals(a(-4742, -3581)) || paramString.equals(a(-4750, 31039)) || paramString.equals("a") || paramString.equals(a(-4768, 10586)) || paramString.equals("p") || paramString.equals(a(-4748, 29644)) || paramString.equals(a(-4743, -20430)) || paramString.equals(a(-4745, 15118)) || paramString.equals(a(-4744, 28072)) || paramString.equals(a(-4747, 19590)) || paramString.equals(a(-4746, 32276)) || paramString.equals(a(-4749, -925)) || paramString.equals(a(-4738, -25869)) || paramString.equals(a(-4752, 32717)) || paramString.equals(a(-4751, 2633)));
  }
  
  static {
    // Byte code:
    //   0: bipush #18
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '!¹Y\\b>_DÛ}w{xLC°¶ÅCEg-q$¹Vj/ÝÿY§#ÒJc­;+×6Õý¨ã]pÚ:qÇ«èeùÆ\\b6Ååô/I '
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_5
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #17
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
    //   67: ldc '\\fùÿæ¾°'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_3
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #70
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
    //   97: aload #5
    //   99: swap
    //   100: iload_3
    //   101: iinc #3, 1
    //   104: swap
    //   105: aastore
    //   106: iload_0
    //   107: iload_1
    //   108: iadd
    //   109: dup
    //   110: istore_0
    //   111: iload #4
    //   113: if_icmpge -> 125
    //   116: aload_2
    //   117: iload_0
    //   118: invokevirtual charAt : (I)C
    //   121: istore_1
    //   122: goto -> 80
    //   125: aload #5
    //   127: putstatic burp/Zsz.a : [Ljava/lang/String;
    //   130: bipush #18
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zsz.b : [Ljava/lang/String;
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
    //   212: bipush #112
    //   214: goto -> 244
    //   217: bipush #17
    //   219: goto -> 244
    //   222: bipush #96
    //   224: goto -> 244
    //   227: bipush #99
    //   229: goto -> 244
    //   232: bipush #91
    //   234: goto -> 244
    //   237: bipush #127
    //   239: goto -> 244
    //   242: bipush #35
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
    //   283: tableswitch default -> 39, 0 -> 97
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFED71) & 0xFFFF;
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
      byte b1 = 89;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */