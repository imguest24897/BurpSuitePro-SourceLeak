package burp;

import java.util.ArrayList;
import java.util.List;

class Zget implements Zlty, Zm3g {
  private final Zm39 Zs;
  
  private final List<Ztsg> ZB;
  
  private final Zrk7 Zf;
  
  private Zes1 ZE;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zget(Zra1 paramZra1, Zr5v paramZr5v, Zm39 paramZm39) {
    this.Zs = paramZm39;
    this.ZB = new ArrayList<>();
    this.Zf = new Zrk7(paramZra1, paramZr5v, paramZm39);
    this.ZE = ZkJ();
  }
  
  public boolean ZU3() {
    return this.Zs.ZOC();
  }
  
  public void ZdC(boolean paramBoolean) {
    this.Zs.ZCX(paramBoolean);
    this.Zf.ZT(paramBoolean);
    ZkB();
  }
  
  public String ZUV() {
    String str = this.Zf.ZK().ZfI();
    return (str == null) ? "" : str;
  }
  
  public void ZY(String paramString) {
    this.Zf.ZK().ZA_(paramString);
    ZkB();
  }
  
  public String ZUT() {
    String str = this.Zf.ZK().ZOF();
    return (str == null) ? "" : str;
  }
  
  public void Zu(String paramString) {
    this.Zf.ZK().ZAP(paramString);
    ZkB();
  }
  
  public int ZUY() {
    return this.Zf.ZK().ZOP();
  }
  
  public void Zf(int paramInt) {
    this.Zf.ZK().ZDv(paramInt);
    ZkB();
  }
  
  public boolean ZUv() {
    return this.Zf.ZK().ZfH();
  }
  
  public void Zd1(boolean paramBoolean) {
    this.Zf.ZK().ZCS(paramBoolean);
    ZkB();
  }
  
  public Zes1 ZU0() {
    return this.ZE;
  }
  
  public void Z_(Ztsg paramZtsg) {
    synchronized (this.ZB) {
      this.ZB.add(paramZtsg);
    } 
  }
  
  public void ZI(Ztsg paramZtsg) {
    synchronized (this.ZB) {
      this.ZB.remove(paramZtsg);
    } 
  }
  
  public void Zd(Zmf_ paramZmf_) {
    this.Zs.ZA_(paramZmf_.Zm(a(-27929, -610), this.Zs.ZfI()));
    this.Zs.ZAP(paramZmf_.Zm(a(-27932, 28015), this.Zs.ZOF()));
    this.Zs.ZDv(paramZmf_.ZM(a(-27927, -32266), Zb_w.ZU, this.Zs.ZOP()));
    this.Zs.ZCS(paramZmf_.ZC(a(-27930, -3227), this.Zs.ZfH()));
    boolean bool = paramZmf_.ZC(a(-27933, 4753), this.Zs.ZOC());
    this.Zs.ZCX(bool);
    this.Zf.ZT(bool);
    Zes1 zes1 = ZkJ();
    if (!zes1.equals(this.ZE))
      ZkB(); 
  }
  
  public void Zl(Zg4j paramZg4j) {
    paramZg4j.Za(a(-27934, -27589), this.Zs.ZfI());
    paramZg4j.Za(a(-27935, -23255), this.Zs.ZOF());
    paramZg4j.Zr(a(-27936, -30828), Zb_w.ZU, this.Zs.ZOP());
    paramZg4j.Zh(a(-27931, 14444), this.Zs.ZfH());
    paramZg4j.Zh(a(-27928, -15021), this.Zs.ZOC());
  }
  
  private synchronized void ZkB() {
    this.ZE = ZkJ();
    ZkV();
  }
  
  private synchronized Zes1 ZkJ() {
    // Byte code:
    //   0: invokestatic Zj : ()[I
    //   3: astore_1
    //   4: new burp/Zssr
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: astore_2
    //   12: aload_0
    //   13: invokevirtual ZUY : ()I
    //   16: tableswitch default -> 175, 0 -> 44, 1 -> 48, 2 -> 57
    //   44: aload_1
    //   45: ifnull -> 187
    //   48: aload_2
    //   49: invokevirtual Zo : ()Lburp/Zssr;
    //   52: pop
    //   53: aload_1
    //   54: ifnull -> 187
    //   57: new burp/Zx6g
    //   60: dup
    //   61: aload_0
    //   62: invokevirtual ZUV : ()Ljava/lang/String;
    //   65: invokespecial <init> : (Ljava/lang/String;)V
    //   68: invokevirtual ZN : ()Lburp/Zkck;
    //   71: astore_3
    //   72: aload_3
    //   73: getfield Zt : Z
    //   76: ifne -> 88
    //   79: aload_2
    //   80: invokevirtual Zo : ()Lburp/Zssr;
    //   83: pop
    //   84: aload_1
    //   85: ifnull -> 187
    //   88: aload_2
    //   89: aload_3
    //   90: getfield ZM : Ljava/lang/String;
    //   93: invokevirtual ZM : (Ljava/lang/String;)Lburp/Zssr;
    //   96: pop
    //   97: aload_0
    //   98: invokevirtual ZUT : ()Ljava/lang/String;
    //   101: invokevirtual isEmpty : ()Z
    //   104: ifne -> 187
    //   107: new burp/Zx6g
    //   110: dup
    //   111: aload_0
    //   112: invokevirtual ZUT : ()Ljava/lang/String;
    //   115: invokespecial <init> : (Ljava/lang/String;)V
    //   118: invokevirtual ZV : ()Lburp/Zkck;
    //   121: astore #4
    //   123: aload #4
    //   125: getfield Zt : Z
    //   128: ifne -> 140
    //   131: aload_2
    //   132: invokevirtual Zo : ()Lburp/Zssr;
    //   135: pop
    //   136: aload_1
    //   137: ifnull -> 187
    //   140: aload_2
    //   141: aload #4
    //   143: getfield ZM : Ljava/lang/String;
    //   146: invokevirtual ZJ : (Ljava/lang/String;)Lburp/Zssr;
    //   149: pop
    //   150: aload #4
    //   152: getfield ZN : Ljava/lang/Integer;
    //   155: ifnull -> 171
    //   158: aload_2
    //   159: aload #4
    //   161: getfield ZN : Ljava/lang/Integer;
    //   164: invokevirtual intValue : ()I
    //   167: invokevirtual Za : (I)Lburp/Zssr;
    //   170: pop
    //   171: aload_1
    //   172: ifnull -> 187
    //   175: iconst_0
    //   176: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   179: aload_0
    //   180: invokevirtual ZUY : ()I
    //   183: i2l
    //   184: invokestatic Zv : (ZLnet/portswigger/Zqf;J)V
    //   187: aload_0
    //   188: invokevirtual ZUv : ()Z
    //   191: ifeq -> 199
    //   194: aload_2
    //   195: invokevirtual ZF : ()Lburp/Zssr;
    //   198: pop
    //   199: aload_2
    //   200: invokevirtual ZU : ()Lburp/Zes1;
    //   203: areturn
  }
  
  private void ZkV() {
    int[] arrayOfInt = Ze5r.Zj();
    for (Ztsg ztsg : this.ZB) {
      ztsg.ZC();
      if (arrayOfInt != null)
        break; 
    } 
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc ''Å"yL°v¼ôrYpÌ×7¤f7"ëf{6þUV$ ä\\t¿<¼ÿ»ë-2÷]ÑVgì\\t-pß¯]jTç°mú4aa2bsîá31D rÝ;½K¬lDÄcî8@¥w.øÿ º:Æ«AKÏw·Û¨û¶Û}ø>N·'ø@ãyº.É?n3á}sù[Æ3k1×½`Ö1Ô¹e">Ýù\!Åæ¢ºâuZTÚÒ´®2)X Ú¬ÞÈV®h9C»\\bº`jÒ¿ðÍUhê¤<$l¯7wrghäG|vpv0¼,N7ßÞOÂ÷DÜf+å*:9\\ta^¶ªë[âö¨Oùpé>sò0Þ¥5¹1j·Þý±Ê\ L]và¶\\b)2ÉiÄp¾ë1ü{àõ}¡ïËWC{ö®9ËiLs\\tÍÏ´Û£ùRÑDtÍhäAËì?\~Cé1B¼)ª+ÊóiïÁdkÞ#î:]äE4«ækúQÔÖßAndSs!¤°­Ç°1fÚÒGx'w«D\\nÎ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #57
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #127
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
    //   68: ldc '~qëñþþËVíä²lÝm°à¥\\fT®§âl\\f=åÓËPYOÈ·ú8uo2ö4w©¼BÃFOZóµQëóÍdû,Äê³¯V±#\öE!ÑFÝC°{Êb'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #45
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #98
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
    //   129: putstatic burp/Zget.a : [Ljava/lang/String;
    //   132: bipush #10
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zget.b : [Ljava/lang/String;
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
    //   159: if_icmpgt -> 259
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
    //   212: bipush #62
    //   214: goto -> 243
    //   217: bipush #90
    //   219: goto -> 243
    //   222: bipush #57
    //   224: goto -> 243
    //   227: bipush #23
    //   229: goto -> 243
    //   232: bipush #49
    //   234: goto -> 243
    //   237: bipush #11
    //   239: goto -> 243
    //   242: iconst_5
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 166
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 162
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF92E1) & 0xFFFF;
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
      byte b1 = 43;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zget.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */