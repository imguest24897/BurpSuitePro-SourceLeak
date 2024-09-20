package burp;

import java.util.List;

public class Ztr0 {
  private static final List<Double> ZZ;
  
  private final Zb_j ZW;
  
  private final Zraq Zc;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Ztr0(Zb_j paramZb_j) {
    this(paramZb_j, new Zt8p());
  }
  
  public Ztr0(Zb_j paramZb_j, Zraq paramZraq) {
    this.ZW = paramZb_j;
    this.Zc = paramZraq;
  }
  
  public List<Double> ZM() {
    return ZZ;
  }
  
  public void Zm() {
    if (Zb())
      return; 
    if (!Zr())
      return; 
    boolean bool = Zs();
    this.Zc.ZV(a(10965, 21290), String.valueOf(bool));
    Double double_ = ZK();
    this.Zc.ZV(a(10973, 6639), String.valueOf(double_));
  }
  
  private boolean Zb() {
    return (this.Zc.ZU(a(10964, -8327)) || this.Zc.ZU(a(10972, -846)));
  }
  
  public boolean Zr() {
    String str = this.ZW.Zn(a(10968, 20862));
    return (str == null) ? false : Boolean.parseBoolean(str);
  }
  
  public boolean Zs() {
    String str = this.ZW.Zn(a(10974, -8712));
    return (str == null) ? false : Boolean.parseBoolean(str);
  }
  
  public Double ZK() {
    String str = this.ZW.Zn(a(10969, 10031));
    if (str == null)
      return Double.valueOf(1.0D); 
    double d = Double.parseDouble(str);
    return Double.valueOf(ZZ.contains(Double.valueOf(d)) ? d : 1.0D);
  }
  
  public void Zt(boolean paramBoolean1, boolean paramBoolean2, double paramDouble) {
    this.ZW.ZV(a(10971, 23453), String.valueOf(paramBoolean1));
    if (paramBoolean1) {
      ZT(paramBoolean2);
      Zz(Double.valueOf(paramDouble));
    } 
  }
  
  public void ZT(boolean paramBoolean) {
    this.ZW.ZV(a(10975, -7016), String.valueOf(paramBoolean));
  }
  
  public void Zz(Double paramDouble) {
    this.ZW.ZV(a(10970, -25331), String.valueOf(paramDouble));
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'c§\\rÿð©£åÀãAó\\bì6V{Á>nznÞß¢â2×\\ná¦ÿyþ;ôX2i{cDUMV°Q¿ÎÓª¼åõ\\f¦¨>èÐµbVÍâó ô¨ÁA|w?òåÏIÕ]{È4¬ Âç{\\ré¯  mÔ^Å{Tz/¸b8ó.Ù¡Jo±°?^\\f´|&'¼¨'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #18
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #70
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
    //   68: ldc 's\\nS\\næR\\nV1²Ê4\\fJÀtSsÍÎò9u{\\rÆ½'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #19
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #27
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
    //   129: putstatic burp/Ztr0.a : [Ljava/lang/String;
    //   132: bipush #10
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Ztr0.b : [Ljava/lang/String;
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
    //   212: bipush #57
    //   214: goto -> 244
    //   217: bipush #47
    //   219: goto -> 244
    //   222: bipush #17
    //   224: goto -> 244
    //   227: bipush #35
    //   229: goto -> 244
    //   232: bipush #110
    //   234: goto -> 244
    //   237: bipush #49
    //   239: goto -> 244
    //   242: bipush #68
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
    //   300: bipush #11
    //   302: anewarray java/lang/Double
    //   305: dup
    //   306: iconst_0
    //   307: ldc2_w 0.5
    //   310: invokestatic valueOf : (D)Ljava/lang/Double;
    //   313: aastore
    //   314: dup
    //   315: iconst_1
    //   316: ldc2_w 0.75
    //   319: invokestatic valueOf : (D)Ljava/lang/Double;
    //   322: aastore
    //   323: dup
    //   324: iconst_2
    //   325: dconst_1
    //   326: invokestatic valueOf : (D)Ljava/lang/Double;
    //   329: aastore
    //   330: dup
    //   331: iconst_3
    //   332: ldc2_w 1.25
    //   335: invokestatic valueOf : (D)Ljava/lang/Double;
    //   338: aastore
    //   339: dup
    //   340: iconst_4
    //   341: ldc2_w 1.5
    //   344: invokestatic valueOf : (D)Ljava/lang/Double;
    //   347: aastore
    //   348: dup
    //   349: iconst_5
    //   350: ldc2_w 1.75
    //   353: invokestatic valueOf : (D)Ljava/lang/Double;
    //   356: aastore
    //   357: dup
    //   358: bipush #6
    //   360: ldc2_w 2.0
    //   363: invokestatic valueOf : (D)Ljava/lang/Double;
    //   366: aastore
    //   367: dup
    //   368: bipush #7
    //   370: ldc2_w 2.25
    //   373: invokestatic valueOf : (D)Ljava/lang/Double;
    //   376: aastore
    //   377: dup
    //   378: bipush #8
    //   380: ldc2_w 2.5
    //   383: invokestatic valueOf : (D)Ljava/lang/Double;
    //   386: aastore
    //   387: dup
    //   388: bipush #9
    //   390: ldc2_w 2.75
    //   393: invokestatic valueOf : (D)Ljava/lang/Double;
    //   396: aastore
    //   397: dup
    //   398: bipush #10
    //   400: ldc2_w 3.0
    //   403: invokestatic valueOf : (D)Ljava/lang/Double;
    //   406: aastore
    //   407: invokestatic of : ([Ljava/lang/Object;)Ljava/util/List;
    //   410: putstatic burp/Ztr0.ZZ : Ljava/util/List;
    //   413: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x2ADD) & 0xFFFF;
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
      char c = 'ñ';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztr0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */