package net.portswigger;

class Zkk implements Zak {
  final Object ZD;
  
  final Zi7 ZO;
  
  final Ztj Zt;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zkk(Ztj paramZtj, Object paramObject, Zi7 paramZi7) {}
  
  public void ZJ(Zkr paramZkr) {
    Zuh.ZT(false, Zqf.ZC, paramZkr.ZI);
  }
  
  public void ZT(Zrmx paramZrmx) {
    // Byte code:
    //   0: invokestatic ZT : ()I
    //   3: aload_1
    //   4: getfield ZP : Ljava/util/List;
    //   7: invokeinterface iterator : ()Ljava/util/Iterator;
    //   12: astore_3
    //   13: istore_2
    //   14: aload_3
    //   15: invokeinterface hasNext : ()Z
    //   20: ifeq -> 217
    //   23: aload_3
    //   24: invokeinterface next : ()Ljava/lang/Object;
    //   29: checkcast net/portswigger/Zmx
    //   32: astore #4
    //   34: aload #4
    //   36: getfield ZW : Ljava/lang/reflect/Field;
    //   39: aload_0
    //   40: getfield ZD : Ljava/lang/Object;
    //   43: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   46: astore #5
    //   48: aload #5
    //   50: ifnonnull -> 163
    //   53: aload_1
    //   54: getfield Zc : Lnet/portswigger/Znu;
    //   57: getfield ZW : Lnet/portswigger/Zrx_;
    //   60: aload #4
    //   62: getfield ZV : Ljava/lang/String;
    //   65: invokevirtual ZW : (Ljava/lang/String;)Lnet/portswigger/Zm7;
    //   68: getfield ZN : Ljava/lang/String;
    //   71: astore #6
    //   73: aload #6
    //   75: ifnull -> 102
    //   78: aload #6
    //   80: sipush #-4084
    //   83: sipush #-2634
    //   86: invokestatic a : (II)Ljava/lang/String;
    //   89: invokevirtual equals : (Ljava/lang/Object;)Z
    //   92: ifne -> 159
    //   95: goto -> 102
    //   98: invokestatic a : (Ljava/lang/IllegalAccessException;)Ljava/lang/IllegalAccessException;
    //   101: athrow
    //   102: aload_0
    //   103: getfield Zt : Lnet/portswigger/Ztj;
    //   106: getfield ZJ : Ljava/util/function/Consumer;
    //   109: new net/portswigger/Zum
    //   112: dup
    //   113: sipush #-4083
    //   116: sipush #16993
    //   119: invokestatic a : (II)Ljava/lang/String;
    //   122: iconst_2
    //   123: anewarray java/lang/Object
    //   126: dup
    //   127: iconst_0
    //   128: aload #4
    //   130: getfield ZV : Ljava/lang/String;
    //   133: aastore
    //   134: dup
    //   135: iconst_1
    //   136: aload_1
    //   137: getfield Zp : Ljava/lang/reflect/Type;
    //   140: aastore
    //   141: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   144: invokespecial <init> : (Ljava/lang/String;)V
    //   147: invokeinterface accept : (Ljava/lang/Object;)V
    //   152: goto -> 159
    //   155: invokestatic a : (Ljava/lang/IllegalAccessException;)Ljava/lang/IllegalAccessException;
    //   158: athrow
    //   159: iload_2
    //   160: ifeq -> 14
    //   163: aload_0
    //   164: getfield ZO : Lnet/portswigger/Zi7;
    //   167: aload #4
    //   169: getfield ZV : Ljava/lang/String;
    //   172: aload_0
    //   173: getfield Zt : Lnet/portswigger/Ztj;
    //   176: aload #4
    //   178: getfield Ze : Ljava/lang/reflect/Type;
    //   181: aload #5
    //   183: aload #4
    //   185: getfield Ze : Ljava/lang/reflect/Type;
    //   188: invokestatic ZD : (Ljava/lang/reflect/Type;)Ljava/lang/reflect/Type;
    //   191: invokevirtual Zk : (Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/reflect/Type;)Lnet/portswigger/Zrmq;
    //   194: invokeinterface ZN : (Ljava/lang/String;Lnet/portswigger/Zd4;)Lnet/portswigger/Zrmq;
    //   199: pop
    //   200: goto -> 213
    //   203: astore #5
    //   205: aload #5
    //   207: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   210: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   213: iload_2
    //   214: ifeq -> 14
    //   217: return
    // Exception table:
    //   from	to	target	type
    //   34	159	203	java/lang/IllegalAccessException
    //   73	95	98	java/lang/IllegalAccessException
    //   78	152	155	java/lang/IllegalAccessException
    //   163	200	203	java/lang/IllegalAccessException
  }
  
  private static IllegalAccessException a(IllegalAccessException paramIllegalAccessException) {
    return paramIllegalAccessException;
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'WY2.N4 S¨³ÀÆïr\\fÊö#Ê¦¤ø¹Q|§Fxã¤u:Ó¾Kd'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_4
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #11
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 81
    //   38: aload #5
    //   40: swap
    //   41: iload_3
    //   42: iinc #3, 1
    //   45: swap
    //   46: aastore
    //   47: iload_0
    //   48: iload_1
    //   49: iadd
    //   50: dup
    //   51: istore_0
    //   52: iload #4
    //   54: if_icmpge -> 66
    //   57: aload_2
    //   58: iload_0
    //   59: invokevirtual charAt : (I)C
    //   62: istore_1
    //   63: goto -> 21
    //   66: aload #5
    //   68: putstatic net/portswigger/Zkk.a : [Ljava/lang/String;
    //   71: iconst_2
    //   72: anewarray java/lang/String
    //   75: putstatic net/portswigger/Zkk.b : [Ljava/lang/String;
    //   78: goto -> 227
    //   81: dup_x2
    //   82: pop
    //   83: invokevirtual toCharArray : ()[C
    //   86: dup_x1
    //   87: arraylength
    //   88: dup_x2
    //   89: pop
    //   90: iconst_0
    //   91: istore #6
    //   93: dup2_x1
    //   94: pop2
    //   95: dup_x2
    //   96: iconst_1
    //   97: if_icmpgt -> 200
    //   100: dup2
    //   101: swap
    //   102: iload #6
    //   104: dup2_x1
    //   105: caload
    //   106: swap
    //   107: iload #6
    //   109: bipush #7
    //   111: irem
    //   112: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #112
    //   154: goto -> 184
    //   157: bipush #105
    //   159: goto -> 184
    //   162: bipush #24
    //   164: goto -> 184
    //   167: bipush #16
    //   169: goto -> 184
    //   172: bipush #16
    //   174: goto -> 184
    //   177: bipush #34
    //   179: goto -> 184
    //   182: bipush #27
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 104
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 100
    //   208: pop
    //   209: new java/lang/String
    //   212: dup_x1
    //   213: swap
    //   214: invokespecial <init> : ([C)V
    //   217: invokevirtual intern : ()Ljava/lang/String;
    //   220: swap
    //   221: pop
    //   222: swap
    //   223: pop
    //   224: goto -> 38
    //   227: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFF00C) & 0xFFFF;
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
      byte b1 = 47;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zkk.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */