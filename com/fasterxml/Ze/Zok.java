package com.fasterxml.Ze;

import com.fasterxml.Zb.Zg;
import com.fasterxml.Zo.Zl;
import com.fasterxml.Zo.Zv;
import com.fasterxml.Zor.Zo;
import com.fasterxml.Zor.Zy_;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zym;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zor.Zyp;
import com.fasterxml.Zoz.Ziz;
import java.io.IOException;
import java.util.BitSet;

public class Zok {
  protected final Zg ZW;
  
  protected final Zyg ZI;
  
  protected final Zz Zo;
  
  protected final Object[] Zc;
  
  protected int Zl;
  
  protected int Ze;
  
  protected final BitSet ZQ;
  
  protected Zu ZH;
  
  protected Object Zq;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zok(Zg paramZg, Zyg paramZyg, int paramInt, Zz paramZz) {
    this.ZW = paramZg;
    this.ZI = paramZyg;
    this.Zl = paramInt;
    this.Zo = paramZz;
    this.Zc = new Object[paramInt];
    String[] arrayOfString = Z_.ZI();
    if (paramInt < 32) {
      this.ZQ = null;
      if (arrayOfString != null) {
        this.ZQ = new BitSet();
        return;
      } 
      return;
    } 
    this.ZQ = new BitSet();
  }
  
  public Object[] Zd(Zv[] paramArrayOfZv) throws Zy_ {
    // Byte code:
    //   0: invokestatic ZI : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Zl : I
    //   8: ifle -> 137
    //   11: aload_0
    //   12: getfield ZQ : Ljava/util/BitSet;
    //   15: ifnonnull -> 90
    //   18: goto -> 25
    //   21: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   24: athrow
    //   25: aload_0
    //   26: getfield Ze : I
    //   29: istore_3
    //   30: iconst_0
    //   31: istore #4
    //   33: aload_0
    //   34: getfield Zc : [Ljava/lang/Object;
    //   37: arraylength
    //   38: istore #5
    //   40: iload #4
    //   42: iload #5
    //   44: if_icmpge -> 86
    //   47: iload_3
    //   48: iconst_1
    //   49: iand
    //   50: ifne -> 75
    //   53: aload_0
    //   54: getfield Zc : [Ljava/lang/Object;
    //   57: iload #4
    //   59: aload_0
    //   60: aload_1
    //   61: iload #4
    //   63: aaload
    //   64: invokevirtual ZW : (Lcom/fasterxml/Zo/Zv;)Ljava/lang/Object;
    //   67: aastore
    //   68: goto -> 75
    //   71: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   74: athrow
    //   75: iinc #4, 1
    //   78: iload_3
    //   79: iconst_1
    //   80: ishr
    //   81: istore_3
    //   82: aload_2
    //   83: ifnull -> 40
    //   86: aload_2
    //   87: ifnull -> 137
    //   90: aload_0
    //   91: getfield Zc : [Ljava/lang/Object;
    //   94: arraylength
    //   95: istore_3
    //   96: iconst_0
    //   97: istore #4
    //   99: aload_0
    //   100: getfield ZQ : Ljava/util/BitSet;
    //   103: iload #4
    //   105: invokevirtual nextClearBit : (I)I
    //   108: dup
    //   109: istore #4
    //   111: iload_3
    //   112: if_icmpge -> 137
    //   115: aload_0
    //   116: getfield Zc : [Ljava/lang/Object;
    //   119: iload #4
    //   121: aload_0
    //   122: aload_1
    //   123: iload #4
    //   125: aaload
    //   126: invokevirtual ZW : (Lcom/fasterxml/Zo/Zv;)Ljava/lang/Object;
    //   129: aastore
    //   130: iinc #4, 1
    //   133: aload_2
    //   134: ifnull -> 99
    //   137: aload_0
    //   138: getfield ZI : Lcom/fasterxml/Zor/Zyg;
    //   141: getstatic com/fasterxml/Zor/Zyp.FAIL_ON_NULL_CREATOR_PROPERTIES : Lcom/fasterxml/Zor/Zyp;
    //   144: invokevirtual Zg : (Lcom/fasterxml/Zor/Zyp;)Z
    //   147: ifeq -> 222
    //   150: iconst_0
    //   151: istore_3
    //   152: iload_3
    //   153: aload_1
    //   154: arraylength
    //   155: if_icmpge -> 222
    //   158: aload_0
    //   159: getfield Zc : [Ljava/lang/Object;
    //   162: iload_3
    //   163: aaload
    //   164: ifnonnull -> 215
    //   167: aload_1
    //   168: iload_3
    //   169: aaload
    //   170: astore #4
    //   172: aload_0
    //   173: getfield ZI : Lcom/fasterxml/Zor/Zyg;
    //   176: aload #4
    //   178: sipush #-13132
    //   181: sipush #19954
    //   184: invokestatic a : (II)Ljava/lang/String;
    //   187: iconst_2
    //   188: anewarray java/lang/Object
    //   191: dup
    //   192: iconst_0
    //   193: aload #4
    //   195: invokevirtual ZT : ()Ljava/lang/String;
    //   198: aastore
    //   199: dup
    //   200: iconst_1
    //   201: aload_1
    //   202: iload_3
    //   203: aaload
    //   204: invokevirtual Zt : ()I
    //   207: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   210: aastore
    //   211: invokevirtual Zu : (Lcom/fasterxml/Zor/Zo;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
    //   214: pop
    //   215: iinc #3, 1
    //   218: aload_2
    //   219: ifnull -> 152
    //   222: aload_0
    //   223: getfield Zc : [Ljava/lang/Object;
    //   226: areturn
    // Exception table:
    //   from	to	target	type
    //   4	18	21	com/fasterxml/Zor/Zy_
    //   47	68	71	com/fasterxml/Zor/Zy_
  }
  
  protected Object ZW(Zv paramZv) throws Zy_ {
    Object object = paramZv.ZP();
    try {
      if (object != null)
        return this.ZI.ZQ(paramZv.ZP(), (Zo)paramZv, null); 
    } catch (Zym zym) {
      throw a(null);
    } 
    try {
      if (paramZv.ZW())
        this.ZI.Zu((Zo)paramZv, a(-13130, -31826), new Object[] { paramZv.ZT(), Integer.valueOf(paramZv.Zt()) }); 
    } catch (Zym zym) {
      throw a(null);
    } 
    try {
      if (this.ZI.Zg(Zyp.FAIL_ON_MISSING_CREATOR_PROPERTIES))
        this.ZI.Zu((Zo)paramZv, a(-13129, 24671), new Object[] { paramZv.ZT(), Integer.valueOf(paramZv.Zt()) }); 
    } catch (Zym zym) {
      throw a(null);
    } 
    try {
      Object object1 = paramZv.Zj().Zk(this.ZI);
      if (object1 != null)
        return object1; 
      Zyo zyo = paramZv.ZD();
      return zyo.Zk(this.ZI);
    } catch (Zym zym) {
      Ziz ziz = paramZv.ZQ();
      try {
        if (ziz != null)
          zym.Zc(ziz.ZE(), paramZv.ZT()); 
      } catch (Zym zym1) {
        throw a(null);
      } 
      throw zym;
    } 
  }
  
  public boolean Zw(String paramString) throws IOException {
    try {
      if (this.Zo != null)
        try {
          if (paramString.equals(this.Zo.ZV.Zb())) {
            this.Zq = this.Zo.ZB(this.ZW, this.ZI);
            return true;
          } 
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    return false;
  }
  
  public Object ZS(Zyg paramZyg, Object paramObject) throws IOException {
    String[] arrayOfString = Z_.ZI();
    try {
      if (this.Zo != null) {
        if (this.Zq != null) {
          Zw zw = paramZyg.Zi(this.Zq, this.Zo.Zj, this.Zo.ZL);
          zw.ZE(paramObject);
          Zv zv = this.Zo.Zm;
          try {
            if (zv != null)
              return zv.ZN(paramObject, this.Zq); 
          } catch (IOException iOException) {
            throw a(null);
          } 
          try {
            if (arrayOfString != null) {
              paramZyg.ZF(this.Zo, paramObject);
              return paramObject;
            } 
          } catch (IOException iOException) {
            throw a(null);
          } 
          return paramObject;
        } 
      } else {
        return paramObject;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramZyg.ZF(this.Zo, paramObject);
    return paramObject;
  }
  
  protected Zu ZD() {
    return this.ZH;
  }
  
  public boolean Zr(Zv paramZv, Object paramObject) {
    // Byte code:
    //   0: invokestatic ZI : ()[Ljava/lang/String;
    //   3: aload_1
    //   4: invokevirtual Zt : ()I
    //   7: istore #4
    //   9: astore_3
    //   10: aload_0
    //   11: getfield Zc : [Ljava/lang/Object;
    //   14: iload #4
    //   16: aload_2
    //   17: aastore
    //   18: aload_0
    //   19: getfield ZQ : Ljava/util/BitSet;
    //   22: ifnonnull -> 91
    //   25: aload_0
    //   26: getfield Ze : I
    //   29: istore #5
    //   31: iload #5
    //   33: iconst_1
    //   34: iload #4
    //   36: ishl
    //   37: ior
    //   38: istore #6
    //   40: iload #5
    //   42: iload #6
    //   44: if_icmpeq -> 87
    //   47: aload_0
    //   48: iload #6
    //   50: putfield Ze : I
    //   53: aload_0
    //   54: dup
    //   55: getfield Zl : I
    //   58: iconst_1
    //   59: isub
    //   60: dup_x1
    //   61: putfield Zl : I
    //   64: ifgt -> 87
    //   67: aload_0
    //   68: getfield Zo : Lcom/fasterxml/Ze/Zz;
    //   71: ifnull -> 81
    //   74: aload_0
    //   75: getfield Zq : Ljava/lang/Object;
    //   78: ifnull -> 85
    //   81: iconst_1
    //   82: goto -> 86
    //   85: iconst_0
    //   86: ireturn
    //   87: aload_3
    //   88: ifnull -> 126
    //   91: aload_0
    //   92: getfield ZQ : Ljava/util/BitSet;
    //   95: iload #4
    //   97: invokevirtual get : (I)Z
    //   100: ifne -> 126
    //   103: aload_0
    //   104: getfield ZQ : Ljava/util/BitSet;
    //   107: iload #4
    //   109: invokevirtual set : (I)V
    //   112: aload_0
    //   113: dup
    //   114: getfield Zl : I
    //   117: iconst_1
    //   118: isub
    //   119: dup_x1
    //   120: putfield Zl : I
    //   123: ifgt -> 126
    //   126: iconst_0
    //   127: ireturn
  }
  
  public void ZR(Zv paramZv, Object paramObject) {
    this.ZH = new Zn(this.ZH, paramObject, paramZv);
  }
  
  public void Zk(Zl paramZl, String paramString, Object paramObject) {
    this.ZH = new Zy(this.ZH, paramObject, paramZl, paramString);
  }
  
  public void ZM(Object paramObject1, Object paramObject2) {
    this.ZH = new Zt(this.ZH, paramObject2, paramObject1);
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
    //   8: ldc '¡3Ç$Õ'VïhHmE VÓí¼jhÿè8®ïÒð¬|hêT©>ñÑmàã^QË·¿Å/¼+¨\=¨ï*¤\\f¶ y<]HJÊ!RämO?É%]¼×mJ#üÄ,.KC¤IâÓ¯În£ØêÎ|Ðùõ,ìØkÝ°èÃQ[ýuÝpç¬èÎ)qßt´9 öë¸×aå(rXâCc1%/­¯PßÇÍÍHZ&[1w8ö°ø¯-ouX¸wÙhö,¨æ[Gý¼3ôh·ïeÊ^³Øë&Â¢®òBl²Íeå:Ê¬à'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #49
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #87
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
    //   69: putstatic com/fasterxml/Ze/Zok.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic com/fasterxml/Ze/Zok.b : [Ljava/lang/String;
    //   79: goto -> 226
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
    //   98: if_icmpgt -> 199
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 181, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 171, 5 -> 176
    //   152: bipush #53
    //   154: goto -> 183
    //   157: bipush #110
    //   159: goto -> 183
    //   162: bipush #127
    //   164: goto -> 183
    //   167: iconst_5
    //   168: goto -> 183
    //   171: bipush #11
    //   173: goto -> 183
    //   176: bipush #110
    //   178: goto -> 183
    //   181: bipush #98
    //   183: ixor
    //   184: ixor
    //   185: i2c
    //   186: castore
    //   187: iinc #6, 1
    //   190: dup
    //   191: ifne -> 199
    //   194: dup2
    //   195: dup_x1
    //   196: goto -> 105
    //   199: dup2_x1
    //   200: pop2
    //   201: dup_x2
    //   202: iload #6
    //   204: if_icmpgt -> 101
    //   207: pop
    //   208: new java/lang/String
    //   211: dup_x1
    //   212: swap
    //   213: invokespecial <init> : ([C)V
    //   216: invokevirtual intern : ()Ljava/lang/String;
    //   219: swap
    //   220: pop
    //   221: swap
    //   222: pop
    //   223: goto -> 39
    //   226: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFCCB6) & 0xFFFF;
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
      char c = 'ê';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Ze\Zok.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */