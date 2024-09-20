package com.fasterxml.Ze;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zo.Zc;
import com.fasterxml.Zo.Zv;
import com.fasterxml.Zor.Zyc;
import com.fasterxml.Zor.Zyg;
import java.io.IOException;

public final class Ze extends Zc {
  private static final long serialVersionUID = 1L;
  
  protected final String ZS;
  
  protected final boolean ZW;
  
  protected final Zv ZL;
  
  private static final String[] c;
  
  private static final String[] d;
  
  public Ze(Zv paramZv1, String paramString, Zv paramZv2, boolean paramBoolean) {
    super(paramZv1);
    this.ZS = paramString;
    this.ZL = paramZv2;
    this.ZW = paramBoolean;
  }
  
  protected Zv Zc(Zv paramZv) {
    throw new IllegalStateException(b(18924, 22298));
  }
  
  public void ZL(Zyc paramZyc) {
    this.ZM.ZL(paramZyc);
    this.ZL.ZL(paramZyc);
  }
  
  public void ZP(Zg paramZg, Zyg paramZyg, Object paramObject) throws IOException {
    Zj(paramObject, this.ZM.Zt(paramZg, paramZyg));
  }
  
  public Object ZR(Zg paramZg, Zyg paramZyg, Object paramObject) throws IOException {
    return ZN(paramObject, Zt(paramZg, paramZyg));
  }
  
  public final void Zj(Object paramObject1, Object paramObject2) throws IOException {
    ZN(paramObject1, paramObject2);
  }
  
  public Object ZN(Object paramObject1, Object paramObject2) throws IOException {
    // Byte code:
    //   0: invokestatic ZI : ()[Ljava/lang/String;
    //   3: astore_3
    //   4: aload_2
    //   5: ifnull -> 330
    //   8: aload_0
    //   9: getfield ZW : Z
    //   12: ifeq -> 321
    //   15: goto -> 22
    //   18: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   21: athrow
    //   22: aload_2
    //   23: instanceof [Ljava/lang/Object;
    //   26: ifeq -> 100
    //   29: goto -> 36
    //   32: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   35: athrow
    //   36: aload_2
    //   37: checkcast [Ljava/lang/Object;
    //   40: checkcast [Ljava/lang/Object;
    //   43: astore #4
    //   45: aload #4
    //   47: arraylength
    //   48: istore #5
    //   50: iconst_0
    //   51: istore #6
    //   53: iload #6
    //   55: iload #5
    //   57: if_icmpge -> 96
    //   60: aload #4
    //   62: iload #6
    //   64: aaload
    //   65: astore #7
    //   67: aload #7
    //   69: ifnull -> 89
    //   72: aload_0
    //   73: getfield ZL : Lcom/fasterxml/Zo/Zv;
    //   76: aload #7
    //   78: aload_1
    //   79: invokevirtual Zj : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   82: goto -> 89
    //   85: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   88: athrow
    //   89: iinc #6, 1
    //   92: aload_3
    //   93: ifnull -> 53
    //   96: aload_3
    //   97: ifnull -> 330
    //   100: aload_2
    //   101: instanceof java/util/Collection
    //   104: ifeq -> 174
    //   107: goto -> 114
    //   110: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   113: athrow
    //   114: aload_2
    //   115: checkcast java/util/Collection
    //   118: invokeinterface iterator : ()Ljava/util/Iterator;
    //   123: astore #4
    //   125: aload #4
    //   127: invokeinterface hasNext : ()Z
    //   132: ifeq -> 170
    //   135: aload #4
    //   137: invokeinterface next : ()Ljava/lang/Object;
    //   142: astore #5
    //   144: aload #5
    //   146: ifnull -> 166
    //   149: aload_0
    //   150: getfield ZL : Lcom/fasterxml/Zo/Zv;
    //   153: aload #5
    //   155: aload_1
    //   156: invokevirtual Zj : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   159: goto -> 166
    //   162: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   165: athrow
    //   166: aload_3
    //   167: ifnull -> 125
    //   170: aload_3
    //   171: ifnull -> 330
    //   174: aload_2
    //   175: instanceof java/util/Map
    //   178: ifeq -> 253
    //   181: goto -> 188
    //   184: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   187: athrow
    //   188: aload_2
    //   189: checkcast java/util/Map
    //   192: invokeinterface values : ()Ljava/util/Collection;
    //   197: invokeinterface iterator : ()Ljava/util/Iterator;
    //   202: astore #4
    //   204: aload #4
    //   206: invokeinterface hasNext : ()Z
    //   211: ifeq -> 249
    //   214: aload #4
    //   216: invokeinterface next : ()Ljava/lang/Object;
    //   221: astore #5
    //   223: aload #5
    //   225: ifnull -> 245
    //   228: aload_0
    //   229: getfield ZL : Lcom/fasterxml/Zo/Zv;
    //   232: aload #5
    //   234: aload_1
    //   235: invokevirtual Zj : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   238: goto -> 245
    //   241: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   244: athrow
    //   245: aload_3
    //   246: ifnull -> 204
    //   249: aload_3
    //   250: ifnull -> 330
    //   253: new java/lang/IllegalStateException
    //   256: dup
    //   257: new java/lang/StringBuilder
    //   260: dup
    //   261: invokespecial <init> : ()V
    //   264: sipush #18926
    //   267: sipush #-13120
    //   270: invokestatic b : (II)Ljava/lang/String;
    //   273: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   276: aload_2
    //   277: invokevirtual getClass : ()Ljava/lang/Class;
    //   280: invokevirtual getName : ()Ljava/lang/String;
    //   283: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   286: sipush #18925
    //   289: sipush #28829
    //   292: invokestatic b : (II)Ljava/lang/String;
    //   295: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   298: aload_0
    //   299: getfield ZS : Ljava/lang/String;
    //   302: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   305: ldc '''
    //   307: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   310: invokevirtual toString : ()Ljava/lang/String;
    //   313: invokespecial <init> : (Ljava/lang/String;)V
    //   316: athrow
    //   317: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   320: athrow
    //   321: aload_0
    //   322: getfield ZL : Lcom/fasterxml/Zo/Zv;
    //   325: aload_2
    //   326: aload_1
    //   327: invokevirtual Zj : (Ljava/lang/Object;Ljava/lang/Object;)V
    //   330: aload_0
    //   331: getfield ZM : Lcom/fasterxml/Zo/Zv;
    //   334: aload_1
    //   335: aload_2
    //   336: invokevirtual ZN : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   339: areturn
    // Exception table:
    //   from	to	target	type
    //   4	15	18	java/io/IOException
    //   8	29	32	java/io/IOException
    //   67	82	85	java/io/IOException
    //   96	107	110	java/io/IOException
    //   144	159	162	java/io/IOException
    //   170	181	184	java/io/IOException
    //   223	238	241	java/io/IOException
    //   249	317	317	java/io/IOException
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '«6â,aí¯'5ÛhìQÅ#\\t+y<kÔw`·Í\\béåScåhØW.³Ò¥¢">%>ÓCÒÅoZ¨"<ü²[^b)(\\bÒ}×iÛ4LZÁ'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #34
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #83
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 82
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
    //   67: aload #5
    //   69: putstatic com/fasterxml/Ze/Ze.c : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic com/fasterxml/Ze/Ze.d : [Ljava/lang/String;
    //   79: goto -> 227
    //   82: dup_x2
    //   83: pop
    //   84: invokevirtual toCharArray : ()[C
    //   87: dup_x1
    //   88: arraylength
    //   89: dup_x2
    //   90: pop
    //   91: iconst_0
    //   92: istore #6
    //   94: dup2_x1
    //   95: pop2
    //   96: dup_x2
    //   97: iconst_1
    //   98: if_icmpgt -> 200
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #115
    //   154: goto -> 184
    //   157: bipush #37
    //   159: goto -> 184
    //   162: bipush #66
    //   164: goto -> 184
    //   167: bipush #14
    //   169: goto -> 184
    //   172: bipush #117
    //   174: goto -> 184
    //   177: bipush #122
    //   179: goto -> 184
    //   182: bipush #62
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 105
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 101
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
    //   224: goto -> 39
    //   227: return
  }
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x49EC) & 0xFFFF;
    if (d[i] == null) {
      char[] arrayOfChar = c[i].toCharArray();
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
      byte b1 = 59;
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
      d[i] = (new String(arrayOfChar)).intern();
    } 
    return d[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Ze\Ze.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */