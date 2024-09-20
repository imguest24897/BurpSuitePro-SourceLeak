package burp;

import java.util.Objects;

public final class Zmis extends Zmip {
  private Zi2 ZE;
  
  private String ZT;
  
  private String ZR;
  
  private static final String[] b;
  
  private static final String[] c;
  
  public Zmis(Zi2 paramZi2, String paramString1, String paramString2, boolean paramBoolean) {
    super(Ztbo.API_KEY, paramString2, paramBoolean);
    this.ZE = paramZi2;
    this.ZR = paramString1;
  }
  
  public String Zk() {
    return Objects.toString(this.ZT, "");
  }
  
  public Zmis Zp(String paramString) {
    this.ZT = paramString;
    return this;
  }
  
  public Zi2 ZZ() {
    return Objects.<Zi2>requireNonNullElse(this.ZE, Zi2.HEADER);
  }
  
  public void ZI(Zi2 paramZi2) {
    this.ZE = paramZi2;
  }
  
  public String ZL() {
    return Objects.toString(this.ZR, "");
  }
  
  public void ZQ(String paramString) {
    this.ZR = paramString;
  }
  
  public String Zy() {
    try {
      if (this.ZT != null) {
        try {
          if (this.ZT.isEmpty())
            return ""; 
        } catch (MatchException matchException) {
          throw a(null);
        } 
      } else {
        return "";
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    try {
      switch (this.ZE.ordinal()) {
        default:
          throw new MatchException(null, null);
        case 0:
        
        case 1:
        case 2:
          break;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return this.ZR + "=" + this.ZR;
  }
  
  public boolean ZY() {
    return true;
  }
  
  public void ZL(Zgi paramZgi) {
    if (paramZgi instanceof Zmis) {
      Zmis zmis = (Zmis)paramZgi;
      Zp(zmis.Zk());
      ZI(zmis.ZZ());
      ZQ(zmis.ZL());
    } 
  }
  
  public String ZR() {
    return a(31385, -5868) + a(31385, -5868) + this.ZE.Zd();
  }
  
  protected boolean Zx(Zgi paramZgi) {
    try {
      if (super.Zx(paramZgi) && paramZgi instanceof Zmis) {
        Zmis zmis = (Zmis)paramZgi;
        try {
          if (zmis.ZE == this.ZE);
        } catch (MatchException matchException) {
          throw a(null);
        } 
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return false;
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (this == paramObject)
        return true; 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    try {
      if (paramObject != null) {
        try {
          if (getClass() != paramObject.getClass())
            return false; 
        } catch (MatchException matchException) {
          throw a(null);
        } 
      } else {
        return false;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    Zmis zmis = (Zmis)paramObject;
    try {
      if (super.equals(paramObject))
        try {
          if (zmis.ZE == this.ZE)
            try {
              if (Objects.equals(this.ZR, zmis.ZR))
                try {
                  if (Objects.equals(this.ZT, zmis.ZT));
                } catch (MatchException matchException) {
                  throw a(null);
                }  
            } catch (MatchException matchException) {
              throw a(null);
            }  
        } catch (MatchException matchException) {
          throw a(null);
        }  
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return false;
  }
  
  public int hashCode() {
    Zbqc[] arrayOfZbqc = Zmip.Zv();
    try {
      if (arrayOfZbqc == null)
        Zbqc.Zr(new Zbqc[5]); 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return Objects.hash(new Object[] { Integer.valueOf(super.hashCode()), this.ZE, this.ZR, this.ZT });
  }
  
  public Ztcx ZE(Zgi paramZgi) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual equals : (Ljava/lang/Object;)Z
    //   5: ifeq -> 24
    //   8: getstatic burp/Zmo.SAME_OBJECT : Lburp/Zmo;
    //   11: aload_1
    //   12: iconst_0
    //   13: anewarray java/lang/String
    //   16: invokestatic Zc : (Lburp/Zmo;Lburp/Zgi;[Ljava/lang/String;)Lburp/Ztcx;
    //   19: areturn
    //   20: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   23: athrow
    //   24: aload_0
    //   25: aload_1
    //   26: invokespecial ZE : (Lburp/Zgi;)Lburp/Ztcx;
    //   29: astore_2
    //   30: aload_2
    //   31: invokevirtual ZLR : ()Z
    //   34: ifeq -> 43
    //   37: aload_2
    //   38: areturn
    //   39: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   42: athrow
    //   43: aload_1
    //   44: dup
    //   45: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   48: pop
    //   49: astore_3
    //   50: iconst_0
    //   51: istore #4
    //   53: aload_3
    //   54: iload #4
    //   56: <illegal opcode> typeSwitch : (Ljava/lang/Object;I)I
    //   61: tableswitch default -> 92, 0 -> 106, 1 -> 286, 2 -> 323, 3 -> 360
    //   92: new java/lang/MatchException
    //   95: dup
    //   96: aconst_null
    //   97: aconst_null
    //   98: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   101: athrow
    //   102: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   105: athrow
    //   106: aload_3
    //   107: checkcast burp/Zmis
    //   110: astore #5
    //   112: aload #5
    //   114: getfield ZE : Lburp/Zi2;
    //   117: invokevirtual ordinal : ()I
    //   120: tableswitch default -> 148, 0 -> 168, 1 -> 162, 2 -> 227
    //   148: new java/lang/MatchException
    //   151: dup
    //   152: aconst_null
    //   153: aconst_null
    //   154: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   157: athrow
    //   158: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   161: athrow
    //   162: invokestatic ZL0 : ()Lburp/Ztcx;
    //   165: goto -> 369
    //   168: aload #5
    //   170: getfield ZE : Lburp/Zi2;
    //   173: aload_0
    //   174: getfield ZE : Lburp/Zi2;
    //   177: if_acmpne -> 221
    //   180: aload_0
    //   181: aload #5
    //   183: invokevirtual ZD : (Lburp/Zmis;)Z
    //   186: ifeq -> 221
    //   189: goto -> 196
    //   192: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   195: athrow
    //   196: getstatic burp/Zmo.SAME_HEADER : Lburp/Zmo;
    //   199: aload_1
    //   200: iconst_1
    //   201: anewarray java/lang/String
    //   204: dup
    //   205: iconst_0
    //   206: aload_0
    //   207: getfield ZR : Ljava/lang/String;
    //   210: aastore
    //   211: invokestatic Zc : (Lburp/Zmo;Lburp/Zgi;[Ljava/lang/String;)Lburp/Ztcx;
    //   214: goto -> 369
    //   217: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   220: athrow
    //   221: invokestatic ZL0 : ()Lburp/Ztcx;
    //   224: goto -> 369
    //   227: aload #5
    //   229: getfield ZE : Lburp/Zi2;
    //   232: aload_0
    //   233: getfield ZE : Lburp/Zi2;
    //   236: if_acmpne -> 280
    //   239: aload_0
    //   240: aload #5
    //   242: invokevirtual ZD : (Lburp/Zmis;)Z
    //   245: ifeq -> 280
    //   248: goto -> 255
    //   251: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   254: athrow
    //   255: getstatic burp/Zmo.SAME_COOKIE : Lburp/Zmo;
    //   258: aload_1
    //   259: iconst_1
    //   260: anewarray java/lang/String
    //   263: dup
    //   264: iconst_0
    //   265: aload_0
    //   266: getfield ZR : Ljava/lang/String;
    //   269: aastore
    //   270: invokestatic Zc : (Lburp/Zmo;Lburp/Zgi;[Ljava/lang/String;)Lburp/Ztcx;
    //   273: goto -> 369
    //   276: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   279: athrow
    //   280: invokestatic ZL0 : ()Lburp/Ztcx;
    //   283: goto -> 369
    //   286: aload_3
    //   287: checkcast burp/Zmi3
    //   290: astore #6
    //   292: aload_0
    //   293: invokevirtual Zl : ()Z
    //   296: ifeq -> 317
    //   299: getstatic burp/Zmo.AUTHORIZATION_HEADER : Lburp/Zmo;
    //   302: aload_1
    //   303: iconst_0
    //   304: anewarray java/lang/String
    //   307: invokestatic Zc : (Lburp/Zmo;Lburp/Zgi;[Ljava/lang/String;)Lburp/Ztcx;
    //   310: goto -> 369
    //   313: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   316: athrow
    //   317: invokestatic ZL0 : ()Lburp/Ztcx;
    //   320: goto -> 369
    //   323: aload_3
    //   324: checkcast burp/Zmi1
    //   327: astore #7
    //   329: aload_0
    //   330: invokevirtual Zl : ()Z
    //   333: ifeq -> 354
    //   336: getstatic burp/Zmo.AUTHORIZATION_HEADER : Lburp/Zmo;
    //   339: aload_1
    //   340: iconst_0
    //   341: anewarray java/lang/String
    //   344: invokestatic Zc : (Lburp/Zmo;Lburp/Zgi;[Ljava/lang/String;)Lburp/Ztcx;
    //   347: goto -> 369
    //   350: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   353: athrow
    //   354: invokestatic ZL0 : ()Lburp/Ztcx;
    //   357: goto -> 369
    //   360: aload_3
    //   361: checkcast burp/Zmiu
    //   364: astore #8
    //   366: invokestatic ZL0 : ()Lburp/Ztcx;
    //   369: areturn
    // Exception table:
    //   from	to	target	type
    //   0	20	20	java/lang/MatchException
    //   30	39	39	java/lang/MatchException
    //   53	102	102	java/lang/MatchException
    //   112	158	158	java/lang/MatchException
    //   168	189	192	java/lang/MatchException
    //   180	217	217	java/lang/MatchException
    //   227	248	251	java/lang/MatchException
    //   239	276	276	java/lang/MatchException
    //   292	313	313	java/lang/MatchException
    //   329	350	350	java/lang/MatchException
  }
  
  private boolean ZD(Zmis paramZmis) {
    try {
    
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return this.ZE.ZA() ? paramZmis.ZR.equalsIgnoreCase(this.ZR) : paramZmis.ZR.equals(this.ZR);
  }
  
  boolean Zl() {
    try {
      if (this.ZE == Zi2.HEADER)
        try {
          if (a(31386, 31300).equalsIgnoreCase(this.ZR));
        } catch (MatchException matchException) {
          throw a(null);
        }  
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return false;
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'âé´ºzÎ³,{s¿ûG÷I\\r¿ªác¤@\\ry¸u¤ü÷ÝM¾'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_2
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #8
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
    //   68: putstatic burp/Zmis.b : [Ljava/lang/String;
    //   71: iconst_3
    //   72: anewarray java/lang/String
    //   75: putstatic burp/Zmis.c : [Ljava/lang/String;
    //   78: goto -> 226
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
    //   97: if_icmpgt -> 199
    //   100: dup2
    //   101: swap
    //   102: iload #6
    //   104: dup2_x1
    //   105: caload
    //   106: swap
    //   107: iload #6
    //   109: bipush #7
    //   111: irem
    //   112: tableswitch default -> 181, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 166, 4 -> 171, 5 -> 176
    //   152: bipush #125
    //   154: goto -> 183
    //   157: bipush #94
    //   159: goto -> 183
    //   162: iconst_1
    //   163: goto -> 183
    //   166: bipush #43
    //   168: goto -> 183
    //   171: bipush #15
    //   173: goto -> 183
    //   176: bipush #67
    //   178: goto -> 183
    //   181: bipush #107
    //   183: ixor
    //   184: ixor
    //   185: i2c
    //   186: castore
    //   187: iinc #6, 1
    //   190: dup
    //   191: ifne -> 199
    //   194: dup2
    //   195: dup_x1
    //   196: goto -> 104
    //   199: dup2_x1
    //   200: pop2
    //   201: dup_x2
    //   202: iload #6
    //   204: if_icmpgt -> 100
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
    //   223: goto -> 38
    //   226: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7A98) & 0xFFFF;
    if (c[i] == null) {
      char[] arrayOfChar = b[i].toCharArray();
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
      char c = 'Õ';
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
      c[i] = (new String(arrayOfChar)).intern();
    } 
    return c[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmis.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */