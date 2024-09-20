package burp;

import java.util.List;
import java.util.Optional;

public class Zke implements Zr9e {
  private static final List<String> ZV;
  
  private final Zepp Zh;
  
  private final Zxy0 ZQ;
  
  private String ZF = "";
  
  private String Zx = "";
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zke(Zepp paramZepp, Zxy0 paramZxy0) {
    this.Zh = paramZepp;
    this.ZQ = paramZxy0;
  }
  
  public void Zh(Zska paramZska) {
    // Byte code:
    //   0: invokestatic Zw : ()Z
    //   3: istore_2
    //   4: aload_1
    //   5: invokevirtual ZX : ()I
    //   8: bipush #27
    //   10: if_icmpne -> 28
    //   13: aload_0
    //   14: aload_1
    //   15: invokevirtual Zu : ()Ljava/lang/String;
    //   18: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   21: putfield ZF : Ljava/lang/String;
    //   24: iload_2
    //   25: ifne -> 80
    //   28: aload_1
    //   29: bipush #26
    //   31: bipush #60
    //   33: invokevirtual Zm : (IC)Z
    //   36: ifeq -> 49
    //   39: aload_0
    //   40: ldc '<'
    //   42: putfield Zx : Ljava/lang/String;
    //   45: iload_2
    //   46: ifne -> 80
    //   49: aload_1
    //   50: bipush #26
    //   52: sipush #-32607
    //   55: sipush #22645
    //   58: invokestatic a : (II)Ljava/lang/String;
    //   61: invokevirtual ZO : (ILjava/lang/String;)Z
    //   64: ifeq -> 80
    //   67: aload_0
    //   68: sipush #-32579
    //   71: sipush #-13996
    //   74: invokestatic a : (II)Ljava/lang/String;
    //   77: putfield Zx : Ljava/lang/String;
    //   80: return
  }
  
  public boolean ZQ(Zska paramZska, Ze7g paramZe7g) {
    if (Zy(paramZska))
      return this.Zh.ZQ(paramZska, paramZe7g); 
    if (ZS(paramZska))
      return this.ZQ.ZQ(paramZska, paramZe7g); 
    boolean bool = paramZska.Zm(26, '>');
    if (bool) {
      Zkrk zkrk = new Zkrk(this.ZF, "<".equals(this.Zx));
      return (zkrk.Zx() && !zkrk.Zi());
    } 
    return false;
  }
  
  public boolean Za(Zska paramZska, Ze7g paramZe7g) {
    if (Zy(paramZska))
      return this.Zh.Za(paramZska, paramZe7g); 
    if (ZS(paramZska))
      return this.ZQ.Za(paramZska, paramZe7g); 
    boolean bool = paramZska.ZO(26, a(-32579, -13996));
    if (bool) {
      Optional<Zska> optional = paramZe7g.Zs(paramZska);
      if (optional.isPresent()) {
        Zkrk zkrk = new Zkrk(((Zska)optional.get()).Zu(), false);
        return (zkrk.ZB() && !zkrk.Zi());
      } 
    } 
    return false;
  }
  
  public boolean Zu(Zska paramZska, Ze7g paramZe7g) {
    if (Zy(paramZska))
      return this.Zh.Zu(paramZska, paramZe7g); 
    if (ZS(paramZska))
      return this.ZQ.Zu(paramZska, paramZe7g); 
    boolean bool = (paramZska.Zm(26, '>') || paramZska.ZO(26, a(-32605, 18534))) ? true : false;
    if (bool) {
      Zkrk zkrk = new Zkrk(this.ZF, "<".equals(this.Zx));
      return (zkrk.ZB() || zkrk.Zi());
    } 
    return false;
  }
  
  public boolean ZO(Zska paramZska, Ze7g paramZe7g) {
    return Zy(paramZska) ? this.Zh.ZO(paramZska, paramZe7g) : (ZS(paramZska) ? this.ZQ.ZO(paramZska, paramZe7g) : ((paramZe7g.Zs() == paramZska && paramZska.ZE())));
  }
  
  private static boolean Zy(Zska paramZska) {
    return (paramZska.ZO() == 2);
  }
  
  private static boolean ZS(Zska paramZska) {
    return (paramZska.ZO() == 1);
  }
  
  static {
    // Byte code:
    //   0: bipush #17
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '¹TéMmÈI|^¤½nð»!£xELp+ëÁGØ°¥5<i¦ÓÓ5)J­éW{@x'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #37
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
    //   67: ldc 'ÏëP'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #6
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #13
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
    //   128: putstatic burp/Zke.a : [Ljava/lang/String;
    //   131: bipush #17
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zke.b : [Ljava/lang/String;
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
    //   158: if_icmpgt -> 260
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #122
    //   214: goto -> 244
    //   217: bipush #102
    //   219: goto -> 244
    //   222: bipush #34
    //   224: goto -> 244
    //   227: bipush #57
    //   229: goto -> 244
    //   232: bipush #42
    //   234: goto -> 244
    //   237: bipush #68
    //   239: goto -> 244
    //   242: bipush #40
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 165
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 161
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
    //   300: bipush #14
    //   302: anewarray java/lang/String
    //   305: dup
    //   306: iconst_0
    //   307: sipush #-32596
    //   310: sipush #-14340
    //   313: invokestatic a : (II)Ljava/lang/String;
    //   316: aastore
    //   317: dup
    //   318: iconst_1
    //   319: sipush #-32599
    //   322: sipush #22787
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: aastore
    //   329: dup
    //   330: iconst_2
    //   331: sipush #-32608
    //   334: sipush #-18967
    //   337: invokestatic a : (II)Ljava/lang/String;
    //   340: aastore
    //   341: dup
    //   342: iconst_3
    //   343: sipush #-32604
    //   346: sipush #-30252
    //   349: invokestatic a : (II)Ljava/lang/String;
    //   352: aastore
    //   353: dup
    //   354: iconst_4
    //   355: sipush #-32594
    //   358: sipush #4697
    //   361: invokestatic a : (II)Ljava/lang/String;
    //   364: aastore
    //   365: dup
    //   366: iconst_5
    //   367: sipush #-32602
    //   370: sipush #-17691
    //   373: invokestatic a : (II)Ljava/lang/String;
    //   376: aastore
    //   377: dup
    //   378: bipush #6
    //   380: sipush #-32598
    //   383: sipush #-8754
    //   386: invokestatic a : (II)Ljava/lang/String;
    //   389: aastore
    //   390: dup
    //   391: bipush #7
    //   393: sipush #-32600
    //   396: sipush #-5894
    //   399: invokestatic a : (II)Ljava/lang/String;
    //   402: aastore
    //   403: dup
    //   404: bipush #8
    //   406: sipush #-32595
    //   409: sipush #-30380
    //   412: invokestatic a : (II)Ljava/lang/String;
    //   415: aastore
    //   416: dup
    //   417: bipush #9
    //   419: sipush #-32601
    //   422: sipush #-7507
    //   425: invokestatic a : (II)Ljava/lang/String;
    //   428: aastore
    //   429: dup
    //   430: bipush #10
    //   432: sipush #-32597
    //   435: sipush #-3975
    //   438: invokestatic a : (II)Ljava/lang/String;
    //   441: aastore
    //   442: dup
    //   443: bipush #11
    //   445: sipush #-32606
    //   448: sipush #17551
    //   451: invokestatic a : (II)Ljava/lang/String;
    //   454: aastore
    //   455: dup
    //   456: bipush #12
    //   458: sipush #-32593
    //   461: sipush #17754
    //   464: invokestatic a : (II)Ljava/lang/String;
    //   467: aastore
    //   468: dup
    //   469: bipush #13
    //   471: sipush #-32603
    //   474: sipush #24571
    //   477: invokestatic a : (II)Ljava/lang/String;
    //   480: aastore
    //   481: invokestatic of : ([Ljava/lang/Object;)Ljava/util/List;
    //   484: putstatic burp/Zke.ZV : Ljava/util/List;
    //   487: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF80AD) & 0xFFFF;
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
      byte b1 = 9;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zke.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */