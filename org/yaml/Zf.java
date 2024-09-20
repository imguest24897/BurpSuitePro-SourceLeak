package org.yaml;

import java.util.Iterator;
import java.util.List;

public class Zf extends Zv<Z_z> {
  private List<Z_z> Zm;
  
  private boolean Ze = false;
  
  private static final String[] c;
  
  private static final String[] d;
  
  public Zf(Zj9 paramZj9, boolean paramBoolean, List<Z_z> paramList, Zt1 paramZt11, Zt1 paramZt12, Zp paramZp) {
    super(paramZj9, paramZt11, paramZt12, paramZp);
    if (paramList == null)
      throw new NullPointerException(a(32656, -32608)); 
    this.Zm = paramList;
    this.Zp = paramBoolean;
  }
  
  public Zjz Zo() {
    return Zjz.mapping;
  }
  
  public List<Z_z> Zk() {
    return this.Zm;
  }
  
  public void Zz(List<Z_z> paramList) {
    this.Zm = paramList;
  }
  
  public void Zo(Class<? extends Object> paramClass) {
    Iterator<Z_z> iterator = this.Zm.iterator();
    String str = Zi.ZG();
    while (iterator.hasNext()) {
      Z_z z_z = iterator.next();
      z_z.ZU().Zs(paramClass);
      if (str == null)
        break; 
    } 
  }
  
  public void Zb(Class<? extends Object> paramClass1, Class<? extends Object> paramClass2) {
    Iterator<Z_z> iterator = this.Zm.iterator();
    String str = Zi.ZG();
    while (iterator.hasNext()) {
      Z_z z_z = iterator.next();
      z_z.Zf().Zs(paramClass2);
      z_z.ZU().Zs(paramClass1);
      if (str == null)
        break; 
    } 
  }
  
  public String toString() {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: new java/lang/StringBuilder
    //   6: dup
    //   7: invokespecial <init> : ()V
    //   10: astore_3
    //   11: astore_1
    //   12: aload_0
    //   13: invokevirtual Zk : ()Ljava/util/List;
    //   16: invokeinterface iterator : ()Ljava/util/Iterator;
    //   21: astore #4
    //   23: aload #4
    //   25: invokeinterface hasNext : ()Z
    //   30: ifeq -> 150
    //   33: aload #4
    //   35: invokeinterface next : ()Ljava/lang/Object;
    //   40: checkcast org/yaml/Z_z
    //   43: astore #5
    //   45: aload_3
    //   46: sipush #32661
    //   49: sipush #-31969
    //   52: invokestatic a : (II)Ljava/lang/String;
    //   55: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   58: pop
    //   59: aload_3
    //   60: aload #5
    //   62: invokevirtual ZU : ()Lorg/yaml/Zi;
    //   65: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   68: pop
    //   69: aload_3
    //   70: sipush #32662
    //   73: sipush #19917
    //   76: invokestatic a : (II)Ljava/lang/String;
    //   79: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   82: pop
    //   83: aload #5
    //   85: invokevirtual Zf : ()Lorg/yaml/Zi;
    //   88: instanceof org/yaml/Zv
    //   91: ifeq -> 118
    //   94: aload_3
    //   95: aload #5
    //   97: invokevirtual Zf : ()Lorg/yaml/Zi;
    //   100: invokestatic identityHashCode : (Ljava/lang/Object;)I
    //   103: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   106: pop
    //   107: aload_1
    //   108: ifnonnull -> 132
    //   111: goto -> 118
    //   114: invokestatic b : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   117: athrow
    //   118: aload_3
    //   119: aload #5
    //   121: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   124: pop
    //   125: goto -> 132
    //   128: invokestatic b : (Ljava/lang/NullPointerException;)Ljava/lang/NullPointerException;
    //   131: athrow
    //   132: aload_3
    //   133: sipush #32658
    //   136: sipush #-20863
    //   139: invokestatic a : (II)Ljava/lang/String;
    //   142: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   145: pop
    //   146: aload_1
    //   147: ifnonnull -> 23
    //   150: aload_3
    //   151: invokevirtual toString : ()Ljava/lang/String;
    //   154: astore_2
    //   155: new java/lang/StringBuilder
    //   158: dup
    //   159: invokespecial <init> : ()V
    //   162: ldc '<'
    //   164: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   167: aload_0
    //   168: invokevirtual getClass : ()Ljava/lang/Class;
    //   171: invokevirtual getName : ()Ljava/lang/String;
    //   174: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   177: sipush #32657
    //   180: sipush #14847
    //   183: invokestatic a : (II)Ljava/lang/String;
    //   186: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   189: aload_0
    //   190: invokevirtual ZO : ()Lorg/yaml/Zj9;
    //   193: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   196: sipush #32660
    //   199: sipush #-923
    //   202: invokestatic a : (II)Ljava/lang/String;
    //   205: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   208: aload_2
    //   209: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   212: sipush #32659
    //   215: sipush #6058
    //   218: invokestatic a : (II)Ljava/lang/String;
    //   221: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   224: invokevirtual toString : ()Ljava/lang/String;
    //   227: areturn
    // Exception table:
    //   from	to	target	type
    //   45	111	114	java/lang/NullPointerException
    //   94	125	128	java/lang/NullPointerException
  }
  
  public void ZP(boolean paramBoolean) {
    this.Ze = paramBoolean;
  }
  
  public boolean Zv() {
    return this.Ze;
  }
  
  private static NullPointerException b(NullPointerException paramNullPointerException) {
    return paramNullPointerException;
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'v¨o\\fýßXGiñu®Oyv<H´¶²ÕxlgV¥\\tKmÈ3\\fR=='
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #28
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #56
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
    //   68: ldc 'o.ÅK¦\\b\\bÂZtn\öv'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #6
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #91
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
    //   129: putstatic org/yaml/Zf.c : [Ljava/lang/String;
    //   132: bipush #7
    //   134: anewarray java/lang/String
    //   137: putstatic org/yaml/Zf.d : [Ljava/lang/String;
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
    //   212: bipush #41
    //   214: goto -> 244
    //   217: bipush #120
    //   219: goto -> 244
    //   222: bipush #100
    //   224: goto -> 244
    //   227: bipush #86
    //   229: goto -> 244
    //   232: bipush #77
    //   234: goto -> 244
    //   237: bipush #16
    //   239: goto -> 244
    //   242: bipush #38
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
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7F90) & 0xFFFF;
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
      char c = 'ö';
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
      d[i] = (new String(arrayOfChar)).intern();
    } 
    return d[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\yaml\Zf.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */