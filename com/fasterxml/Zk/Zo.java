package com.fasterxml.Zk;

import com.fasterxml.Zn.Zt;
import com.fasterxml.Zor.Zy7;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyv;
import com.fasterxml.Zoz.Ziz;
import java.util.Collections;
import java.util.List;

public class Zo {
  private static final Zt[] Ze;
  
  protected final Zyv Zg;
  
  protected Zy7 Za;
  
  protected List<Zt> ZX = Collections.emptyList();
  
  protected Zt[] ZT;
  
  protected Zf ZC;
  
  protected Object ZG;
  
  protected Ziz ZN;
  
  protected Zt ZK;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zo(Zyv paramZyv) {
    this.Zg = paramZyv;
  }
  
  protected void Zm(Zy7 paramZy7) {
    this.Za = paramZy7;
  }
  
  public void Za(List<Zt> paramList) {
    this.ZX = paramList;
  }
  
  public void Zr(Zt[] paramArrayOfZt) {
    try {
      if (paramArrayOfZt != null)
        try {
          if (paramArrayOfZt.length != this.ZX.size())
            throw new IllegalArgumentException(String.format(a(-11226, 23282), new Object[] { Integer.valueOf(paramArrayOfZt.length), Integer.valueOf(this.ZX.size()) })); 
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.ZT = paramArrayOfZt;
  }
  
  public void Zj(Zf paramZf) {
    this.ZC = paramZf;
  }
  
  public void ZQ(Object paramObject) {
    this.ZG = paramObject;
  }
  
  public void Zj(Ziz paramZiz) {
    try {
      if (this.ZN != null)
        throw new IllegalArgumentException(a(-11225, -24884) + this.ZN + a(-11227, 8305) + paramZiz); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.ZN = paramZiz;
  }
  
  public void ZC(Zt paramZt) {
    this.ZK = paramZt;
  }
  
  public Zyv Z_() {
    return this.Zg;
  }
  
  public List<Zt> Zz() {
    return this.ZX;
  }
  
  public Zf ZP() {
    return this.ZC;
  }
  
  public Object Ze() {
    return this.ZG;
  }
  
  public Ziz ZI() {
    return this.ZN;
  }
  
  public Zt Zg() {
    return this.ZK;
  }
  
  public Zyd<?> ZQ() {
    // Byte code:
    //   0: invokestatic Zi : ()I
    //   3: istore_1
    //   4: aload_0
    //   5: getfield ZN : Lcom/fasterxml/Zoz/Ziz;
    //   8: ifnull -> 55
    //   11: aload_0
    //   12: getfield Za : Lcom/fasterxml/Zor/Zy7;
    //   15: getstatic com/fasterxml/Zor/Zy9.CAN_OVERRIDE_ACCESS_MODIFIERS : Lcom/fasterxml/Zor/Zy9;
    //   18: invokevirtual ZB : (Lcom/fasterxml/Zor/Zy9;)Z
    //   21: ifeq -> 55
    //   24: goto -> 31
    //   27: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   30: athrow
    //   31: aload_0
    //   32: getfield ZN : Lcom/fasterxml/Zoz/Ziz;
    //   35: aload_0
    //   36: getfield Za : Lcom/fasterxml/Zor/Zy7;
    //   39: getstatic com/fasterxml/Zor/Zy9.OVERRIDE_PUBLIC_ACCESS_MODIFIERS : Lcom/fasterxml/Zor/Zy9;
    //   42: invokevirtual ZB : (Lcom/fasterxml/Zor/Zy9;)Z
    //   45: invokevirtual Zh : (Z)V
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   54: athrow
    //   55: aload_0
    //   56: getfield ZC : Lcom/fasterxml/Zk/Zf;
    //   59: ifnull -> 80
    //   62: aload_0
    //   63: getfield ZC : Lcom/fasterxml/Zk/Zf;
    //   66: aload_0
    //   67: getfield Za : Lcom/fasterxml/Zor/Zy7;
    //   70: invokevirtual Zl : (Lcom/fasterxml/Zor/Zy7;)V
    //   73: goto -> 80
    //   76: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   79: athrow
    //   80: aload_0
    //   81: getfield ZX : Ljava/util/List;
    //   84: ifnull -> 106
    //   87: aload_0
    //   88: getfield ZX : Ljava/util/List;
    //   91: invokeinterface isEmpty : ()Z
    //   96: ifeq -> 148
    //   99: goto -> 106
    //   102: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   105: athrow
    //   106: aload_0
    //   107: getfield ZC : Lcom/fasterxml/Zk/Zf;
    //   110: ifnonnull -> 140
    //   113: goto -> 120
    //   116: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   119: athrow
    //   120: aload_0
    //   121: getfield ZK : Lcom/fasterxml/Zn/Zt;
    //   124: ifnonnull -> 140
    //   127: goto -> 134
    //   130: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   133: athrow
    //   134: aconst_null
    //   135: areturn
    //   136: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   139: athrow
    //   140: getstatic com/fasterxml/Zk/Zo.Ze : [Lcom/fasterxml/Zk/Zt;
    //   143: astore_2
    //   144: iload_1
    //   145: ifne -> 215
    //   148: aload_0
    //   149: getfield ZX : Ljava/util/List;
    //   152: aload_0
    //   153: getfield ZX : Ljava/util/List;
    //   156: invokeinterface size : ()I
    //   161: anewarray com/fasterxml/Zk/Zt
    //   164: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   169: checkcast [Lcom/fasterxml/Zk/Zt;
    //   172: astore_2
    //   173: aload_0
    //   174: getfield Za : Lcom/fasterxml/Zor/Zy7;
    //   177: getstatic com/fasterxml/Zor/Zy9.CAN_OVERRIDE_ACCESS_MODIFIERS : Lcom/fasterxml/Zor/Zy9;
    //   180: invokevirtual ZB : (Lcom/fasterxml/Zor/Zy9;)Z
    //   183: ifeq -> 215
    //   186: iconst_0
    //   187: istore_3
    //   188: aload_2
    //   189: arraylength
    //   190: istore #4
    //   192: iload_3
    //   193: iload #4
    //   195: if_icmpge -> 215
    //   198: aload_2
    //   199: iload_3
    //   200: aaload
    //   201: aload_0
    //   202: getfield Za : Lcom/fasterxml/Zor/Zy7;
    //   205: invokevirtual ZC : (Lcom/fasterxml/Zor/Zy7;)V
    //   208: iinc #3, 1
    //   211: iload_1
    //   212: ifne -> 192
    //   215: aload_0
    //   216: getfield ZT : [Lcom/fasterxml/Zk/Zt;
    //   219: ifnull -> 300
    //   222: aload_0
    //   223: getfield ZT : [Lcom/fasterxml/Zk/Zt;
    //   226: arraylength
    //   227: aload_0
    //   228: getfield ZX : Ljava/util/List;
    //   231: invokeinterface size : ()I
    //   236: if_icmpeq -> 300
    //   239: goto -> 246
    //   242: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   245: athrow
    //   246: new java/lang/IllegalStateException
    //   249: dup
    //   250: sipush #-11228
    //   253: sipush #30156
    //   256: invokestatic a : (II)Ljava/lang/String;
    //   259: iconst_2
    //   260: anewarray java/lang/Object
    //   263: dup
    //   264: iconst_0
    //   265: aload_0
    //   266: getfield ZX : Ljava/util/List;
    //   269: invokeinterface size : ()I
    //   274: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   277: aastore
    //   278: dup
    //   279: iconst_1
    //   280: aload_0
    //   281: getfield ZT : [Lcom/fasterxml/Zk/Zt;
    //   284: arraylength
    //   285: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   288: aastore
    //   289: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   292: invokespecial <init> : (Ljava/lang/String;)V
    //   295: athrow
    //   296: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   299: athrow
    //   300: new com/fasterxml/Zk/Zr
    //   303: dup
    //   304: aload_0
    //   305: getfield Zg : Lcom/fasterxml/Zor/Zyv;
    //   308: invokevirtual Zf : ()Lcom/fasterxml/Zor/Zk;
    //   311: aload_0
    //   312: aload_2
    //   313: aload_0
    //   314: getfield ZT : [Lcom/fasterxml/Zk/Zt;
    //   317: invokespecial <init> : (Lcom/fasterxml/Zor/Zk;Lcom/fasterxml/Zk/Zo;[Lcom/fasterxml/Zk/Zt;[Lcom/fasterxml/Zk/Zt;)V
    //   320: areturn
    // Exception table:
    //   from	to	target	type
    //   4	24	27	java/lang/IllegalArgumentException
    //   11	48	51	java/lang/IllegalArgumentException
    //   55	73	76	java/lang/IllegalArgumentException
    //   80	99	102	java/lang/IllegalArgumentException
    //   87	113	116	java/lang/IllegalArgumentException
    //   106	127	130	java/lang/IllegalArgumentException
    //   120	136	136	java/lang/IllegalArgumentException
    //   215	239	242	java/lang/IllegalArgumentException
    //   222	296	296	java/lang/IllegalArgumentException
  }
  
  public Zr Zh() {
    return Zr.ZH(this.Zg.Zf(), this);
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'f¹BVnd¦ßµÕþos1g.®¡ó"SÏlgõºv¢É7õ2iCµí\\r<Aø¶ò®¡F¶àa7&k»¶m\\rBÍ'ÇOjHgþ£Q½³ëxC÷:íðfÎBÕZÀP£ä@0¶I^rü'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_5
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #67
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 140
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
    //   66: ldc 'TQðûò?»1MGY{g¨)£/êP¬-öj4iõç¡®YÚ[@áý/sÍá·À1KÖ@Öõ²±\\bP\\n÷ë#¤ûÆ¤­[ú^&©%nèÿW9÷A×?"ÓþUØÈ2r¡®v´zø55Ü}¤ÈÛ2»t¦M'('
    //   68: dup
    //   69: astore_2
    //   70: invokevirtual length : ()I
    //   73: istore #4
    //   75: bipush #33
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #115
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 140
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
    //   127: putstatic com/fasterxml/Zk/Zo.a : [Ljava/lang/String;
    //   130: iconst_4
    //   131: anewarray java/lang/String
    //   134: putstatic com/fasterxml/Zk/Zo.b : [Ljava/lang/String;
    //   137: goto -> 296
    //   140: dup_x2
    //   141: pop
    //   142: invokevirtual toCharArray : ()[C
    //   145: dup_x1
    //   146: arraylength
    //   147: dup_x2
    //   148: pop
    //   149: iconst_0
    //   150: istore #6
    //   152: dup2_x1
    //   153: pop2
    //   154: dup_x2
    //   155: iconst_1
    //   156: if_icmpgt -> 256
    //   159: dup2
    //   160: swap
    //   161: iload #6
    //   163: dup2_x1
    //   164: caload
    //   165: swap
    //   166: iload #6
    //   168: bipush #7
    //   170: irem
    //   171: tableswitch default -> 238, 0 -> 208, 1 -> 213, 2 -> 218, 3 -> 223, 4 -> 228, 5 -> 233
    //   208: bipush #62
    //   210: goto -> 240
    //   213: bipush #113
    //   215: goto -> 240
    //   218: bipush #40
    //   220: goto -> 240
    //   223: bipush #77
    //   225: goto -> 240
    //   228: bipush #124
    //   230: goto -> 240
    //   233: bipush #126
    //   235: goto -> 240
    //   238: bipush #95
    //   240: ixor
    //   241: ixor
    //   242: i2c
    //   243: castore
    //   244: iinc #6, 1
    //   247: dup
    //   248: ifne -> 256
    //   251: dup2
    //   252: dup_x1
    //   253: goto -> 163
    //   256: dup2_x1
    //   257: pop2
    //   258: dup_x2
    //   259: iload #6
    //   261: if_icmpgt -> 159
    //   264: pop
    //   265: new java/lang/String
    //   268: dup_x1
    //   269: swap
    //   270: invokespecial <init> : ([C)V
    //   273: invokevirtual intern : ()Ljava/lang/String;
    //   276: swap
    //   277: pop
    //   278: swap
    //   279: tableswitch default -> 38, 0 -> 97
    //   296: iconst_0
    //   297: anewarray com/fasterxml/Zk/Zt
    //   300: putstatic com/fasterxml/Zk/Zo.Ze : [Lcom/fasterxml/Zk/Zt;
    //   303: return
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFD425) & 0xFFFF;
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
      byte b1 = 78;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zk\Zo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */