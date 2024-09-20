package burp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Zt_b extends Ztn0 {
  private final List<Zxjc> Zg = new ArrayList<>((Zzu2.values()).length);
  
  private final List<Zxjc> Zw;
  
  private final Zxz8 ZA;
  
  private final Zsnq ZU;
  
  private boolean ZT;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zt_b(Zxz8 paramZxz8, Zsnq paramZsnq) {
    boolean bool = Zba8.ZKF();
    this.Zw = new ArrayList<>((Zzu2.values()).length);
    this.ZA = paramZxz8;
    this.ZU = paramZsnq;
    this.Zf = new String[] { a(2908, -22951), a(2905, 24156), a(2897, -9957), a(2900, -19459), a(2910, -10896), a(2901, -30409), a(2911, 546), a(2896, -20402), a(2903, 21027), a(2909, 19542) };
    this.ZV = new byte[] { 3, 0, 3, 3, 3, 3, 3, 0, 0, 0 };
    this.Zc = new int[] { 4, 23, 4, 4, 4, 4, 4, 7, 8, 15 };
    this.ZZ = 4;
    Zx();
    if (bool)
      Zbqc.Zr(new Zbqc[3]); 
  }
  
  public void Zx(Zbws paramZbws) {
    super.Zx(paramZbws);
    Zm2t zm2t = new Zm2t();
    paramZbws.getColumnModel().getColumn(2).setCellRenderer(zm2t);
    paramZbws.getColumnModel().getColumn(3).setCellRenderer(zm2t);
    paramZbws.getColumnModel().getColumn(4).setCellRenderer(zm2t);
    paramZbws.getColumnModel().getColumn(5).setCellRenderer(zm2t);
    paramZbws.getColumnModel().getColumn(6).setCellRenderer(zm2t);
    paramZbws.setDefaultRenderer(Boolean.class, new Zzgn(this));
  }
  
  protected Comparator<?> ZS(int paramInt) {
    return (paramInt == 7) ? new Ze4c() : super.ZS(paramInt);
  }
  
  public int getRowCount() {
    return this.Zw.size();
  }
  
  public Object getValueAt(int paramInt1, int paramInt2) {
    Zxjc zxjc = this.Zw.get(paramInt1);
    switch (paramInt2) {
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
      
    } 
    return "";
  }
  
  private String Zc(Zxjc paramZxjc) {
    boolean bool = Zba8.ZKF();
    if (paramZxjc.ZV.isEmpty())
      return ""; 
    if (paramZxjc.ZR.isEmpty())
      return a(2898, -26839); 
    if (paramZxjc.ZR.containsAll(paramZxjc.ZV))
      return a(2899, -3731); 
    StringBuilder stringBuilder = new StringBuilder();
    for (Zr3z zr3z : paramZxjc.ZR) {
      if (stringBuilder.length() > 0)
        stringBuilder.append(a(2902, -22782)); 
      stringBuilder.append(zr3z.displayName);
      if (bool)
        break; 
    } 
    return stringBuilder.toString();
  }
  
  void Zx() {
    this.Zg.clear();
    this.Zw.clear();
    boolean bool = Zba8.ZKF();
    for (Zvs zvs : this.ZU.ZK()) {
      Zxjc zxjc = new Zxjc(zvs, this.ZA);
      this.Zg.add(zxjc);
      this.Zw.add(zxjc);
      if (bool)
        break; 
    } 
    fireTableDataChanged();
  }
  
  Zxjc Za(int paramInt) {
    return (paramInt < 0 || paramInt >= this.Zw.size()) ? null : this.Zw.get(paramInt);
  }
  
  void Zl(boolean paramBoolean) {
    this.ZT = paramBoolean;
    fireTableDataChanged();
  }
  
  void ZU(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, String paramString) {
    // Byte code:
    //   0: invokestatic ZKe : ()Z
    //   3: istore #7
    //   5: iload_1
    //   6: ifne -> 27
    //   9: iload_2
    //   10: ifne -> 27
    //   13: iload_3
    //   14: ifne -> 27
    //   17: iload #4
    //   19: ifne -> 27
    //   22: iload #5
    //   24: ifeq -> 31
    //   27: iconst_1
    //   28: goto -> 32
    //   31: iconst_0
    //   32: istore #8
    //   34: aload_0
    //   35: getfield Zw : Ljava/util/List;
    //   38: invokeinterface clear : ()V
    //   43: aload_0
    //   44: getfield Zg : Ljava/util/List;
    //   47: invokeinterface iterator : ()Ljava/util/Iterator;
    //   52: astore #9
    //   54: aload #9
    //   56: invokeinterface hasNext : ()Z
    //   61: ifeq -> 284
    //   64: aload #9
    //   66: invokeinterface next : ()Ljava/lang/Object;
    //   71: checkcast burp/Zxjc
    //   74: astore #10
    //   76: iload #8
    //   78: ifne -> 85
    //   81: iconst_1
    //   82: goto -> 86
    //   85: iconst_0
    //   86: istore #11
    //   88: iload #8
    //   90: ifeq -> 230
    //   93: iload_1
    //   94: ifeq -> 121
    //   97: aload #10
    //   99: getfield Zr : Ljava/util/Set;
    //   102: getstatic burp/Zzua.PASSIVE : Lburp/Zzua;
    //   105: invokeinterface contains : (Ljava/lang/Object;)Z
    //   110: ifeq -> 121
    //   113: iconst_1
    //   114: istore #11
    //   116: iload #7
    //   118: ifne -> 230
    //   121: iload_2
    //   122: ifeq -> 149
    //   125: aload #10
    //   127: getfield Zr : Ljava/util/Set;
    //   130: getstatic burp/Zzua.LIGHT : Lburp/Zzua;
    //   133: invokeinterface contains : (Ljava/lang/Object;)Z
    //   138: ifeq -> 149
    //   141: iconst_1
    //   142: istore #11
    //   144: iload #7
    //   146: ifne -> 230
    //   149: iload_3
    //   150: ifeq -> 177
    //   153: aload #10
    //   155: getfield Zr : Ljava/util/Set;
    //   158: getstatic burp/Zzua.MEDIUM : Lburp/Zzua;
    //   161: invokeinterface contains : (Ljava/lang/Object;)Z
    //   166: ifeq -> 177
    //   169: iconst_1
    //   170: istore #11
    //   172: iload #7
    //   174: ifne -> 230
    //   177: iload #4
    //   179: ifeq -> 206
    //   182: aload #10
    //   184: getfield Zr : Ljava/util/Set;
    //   187: getstatic burp/Zzua.INTRUSIVE : Lburp/Zzua;
    //   190: invokeinterface contains : (Ljava/lang/Object;)Z
    //   195: ifeq -> 206
    //   198: iconst_1
    //   199: istore #11
    //   201: iload #7
    //   203: ifne -> 230
    //   206: iload #5
    //   208: ifeq -> 230
    //   211: aload #10
    //   213: getfield Zr : Ljava/util/Set;
    //   216: getstatic burp/Zzua.JAVASCRIPT : Lburp/Zzua;
    //   219: invokeinterface contains : (Ljava/lang/Object;)Z
    //   224: ifeq -> 230
    //   227: iconst_1
    //   228: istore #11
    //   230: iload #11
    //   232: ifeq -> 279
    //   235: aload #6
    //   237: ifnull -> 267
    //   240: aload #6
    //   242: invokevirtual isEmpty : ()Z
    //   245: ifne -> 267
    //   248: aload #10
    //   250: getfield Zi : Ljava/lang/String;
    //   253: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   256: aload #6
    //   258: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   261: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   264: ifeq -> 279
    //   267: aload_0
    //   268: getfield Zw : Ljava/util/List;
    //   271: aload #10
    //   273: invokeinterface add : (Ljava/lang/Object;)Z
    //   278: pop
    //   279: iload #7
    //   281: ifne -> 54
    //   284: aload_0
    //   285: invokevirtual fireTableDataChanged : ()V
    //   288: return
  }
  
  static {
    // Byte code:
    //   0: bipush #13
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '_®µqým¶è²¶\\nÀ²¼A¡âðÇÀ¹6iH/(ÑFÂk`&yÈÚiÈh>$SÄ½änz`µ\\bÒ\\r5ÂLæÝ¦mw²b)pyÒ´Êê)cjz\\nWw6ÄGù('
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #9
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #95
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
    //   68: ldc '6¥ßÌÝ§¡'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #6
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #30
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
    //   129: putstatic burp/Zt_b.a : [Ljava/lang/String;
    //   132: bipush #13
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zt_b.b : [Ljava/lang/String;
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
    //   174: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #10
    //   214: goto -> 243
    //   217: bipush #10
    //   219: goto -> 243
    //   222: iconst_5
    //   223: goto -> 243
    //   226: bipush #68
    //   228: goto -> 243
    //   231: bipush #11
    //   233: goto -> 243
    //   236: bipush #56
    //   238: goto -> 243
    //   241: bipush #70
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
    int i = (paramInt1 ^ 0xB55) & 0xFFFF;
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
      byte b1 = 28;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt_b.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */