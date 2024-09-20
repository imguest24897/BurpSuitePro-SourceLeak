package burp;

import burp.api.montoya.core.ByteArray;
import burp.api.montoya.core.Range;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.portswigger.Zkb;
import net.portswigger.Zli;

public class Zsyg implements ByteArray {
  private static final Zr_4 ZU;
  
  private final Zstu Zs;
  
  private final Zr_4 Zj;
  
  private static final String[] a;
  
  private static final String[] b;
  
  private Zsyg(byte[] paramArrayOfbyte, Zr_4 paramZr_4) {
    this.Zj = paramZr_4;
    this.Zs = ZU.ZZ(paramArrayOfbyte);
  }
  
  private Zsyg(Zstu paramZstu, Zr_4 paramZr_4) {
    this.Zs = paramZstu;
    this.Zj = paramZr_4;
  }
  
  public void setByte(int paramInt, byte paramByte) {
    this.Zs.Zs(paramInt, paramByte);
  }
  
  public void setByte(int paramInt1, int paramInt2) {
    this.Zs.Zs(paramInt1, (byte)paramInt2);
  }
  
  public void setBytes(int paramInt, byte[] paramArrayOfbyte) {
    boolean bool = Zsie.Zv();
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < length()) {
            try {
              if (paramInt + paramArrayOfbyte.length > length())
                throw new IllegalArgumentException(a(-31160, -24553)); 
            } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
              throw a(null);
            } 
            byte b = 0;
            while (b < paramArrayOfbyte.length) {
              this.Zs.Zs(paramInt + b, paramArrayOfbyte[b]);
              b++;
              if (!bool)
                break; 
            } 
            return;
          } 
          throw new IndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
          throw a(null);
        }  
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    throw new IndexOutOfBoundsException();
  }
  
  public void setBytes(int paramInt, int[] paramArrayOfint) {
    boolean bool = Zsie.Zv();
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < length()) {
            try {
              if (paramInt + paramArrayOfint.length > length())
                throw new IllegalArgumentException(a(-31159, -18267)); 
            } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
              throw a(null);
            } 
            byte b = 0;
            while (b < paramArrayOfint.length) {
              this.Zs.Zs(paramInt + b, (byte)paramArrayOfint[b]);
              b++;
              if (!bool)
                break; 
            } 
            return;
          } 
          throw new IndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
          throw a(null);
        }  
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    throw new IndexOutOfBoundsException();
  }
  
  public void setBytes(int paramInt, ByteArray paramByteArray) {
    setBytes(paramInt, paramByteArray.getBytes());
  }
  
  private static byte[] ZE(int[] paramArrayOfint) {
    byte[] arrayOfByte = new byte[paramArrayOfint.length];
    byte b = 0;
    boolean bool = Zsie.Z_();
    while (b < paramArrayOfint.length) {
      arrayOfByte[b] = (byte)paramArrayOfint[b];
      b++;
      if (bool)
        break; 
    } 
    return arrayOfByte;
  }
  
  public byte getByte(int paramInt) {
    return this.Zs.Zp(paramInt);
  }
  
  public byte[] getBytes() {
    return (byte[])this.Zs.ZiD().clone();
  }
  
  public ByteArray subArray(Range paramRange) {
    return subArray(paramRange.startIndexInclusive(), paramRange.endIndexExclusive());
  }
  
  public ByteArray subArray(int paramInt1, int paramInt2) {
    try {
      if (paramInt1 > paramInt2)
        throw new IllegalArgumentException(a(-31157, -3836)); 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    try {
      if (paramInt1 < length())
        try {
          if (paramInt1 >= 0)
            try {
              if (paramInt2 <= length()) {
                Zstu zstu = this.Zs.Zb(paramInt1, paramInt2);
                return ZJ(zstu, this.Zj);
              } 
              throw new IndexOutOfBoundsException();
            } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
              throw a(null);
            }  
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
          throw a(null);
        }  
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    throw new IndexOutOfBoundsException();
  }
  
  public int length() {
    return this.Zs.Zpu();
  }
  
  public int indexOf(String paramString, boolean paramBoolean, int paramInt1, int paramInt2) {
    try {
      if (paramString == null)
        throw new IllegalArgumentException(a(-31158, 14321)); 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    ByteArray byteArray = Zh(paramString);
    return indexOf(byteArray, paramBoolean, paramInt1, paramInt2);
  }
  
  public int indexOf(Pattern paramPattern) {
    Matcher matcher = paramPattern.matcher(toString());
    try {
    
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    return matcher.find() ? indexOf(matcher.group(), true, matcher.start(), length()) : -1;
  }
  
  public int indexOf(Pattern paramPattern, int paramInt1, int paramInt2) {
    Matcher matcher = paramPattern.matcher(Zkb.Zo(this.Zs.ZiD(), paramInt1, paramInt2));
    try {
    
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    return matcher.find() ? indexOf(matcher.group(), true, paramInt1 + matcher.start(), paramInt2) : -1;
  }
  
  public int indexOf(ByteArray paramByteArray, boolean paramBoolean, int paramInt1, int paramInt2) {
    try {
      if (paramByteArray == null)
        throw new IllegalArgumentException(a(-31155, 30091)); 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    try {
      if (paramInt1 < 0)
        throw new IllegalArgumentException(a(-31153, 32494)); 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    try {
      if (paramInt2 >= paramInt1)
        try {
          if (paramInt2 <= length())
            return Zli.ZZ(getBytes(), paramByteArray.getBytes(), paramBoolean, paramInt1, paramInt2); 
          throw new IllegalArgumentException(a(-31154, -32480));
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
          throw a(null);
        }  
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    throw new IllegalArgumentException(a(-31154, -32480));
  }
  
  public int countMatches(String paramString, boolean paramBoolean, int paramInt1, int paramInt2) {
    ByteArray byteArray = Zh(paramString);
    return countMatches(byteArray, paramBoolean, paramInt1, paramInt2);
  }
  
  public int countMatches(Pattern paramPattern) {
    Matcher matcher = paramPattern.matcher(toString());
    return (int)matcher.results().count();
  }
  
  public int countMatches(Pattern paramPattern, int paramInt1, int paramInt2) {
    int i = paramInt2 - paramInt1;
    String str = Zkb.Zo(this.Zs.ZiD(), paramInt1, i);
    Matcher matcher = paramPattern.matcher(str);
    return (int)matcher.results().count();
  }
  
  public int countMatches(ByteArray paramByteArray, boolean paramBoolean, int paramInt1, int paramInt2) {
    boolean bool = Zsie.Z_();
    byte b = 0;
    while (paramInt1 < paramInt2) {
      int i = indexOf(paramByteArray, paramBoolean, paramInt1, paramInt2);
      if (i != -1) {
        paramInt1 = i + paramByteArray.length();
        try {
          b++;
          if (!bool) {
            if (bool)
              break; 
            continue;
          } 
          return b;
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
          throw a(null);
        } 
      } 
      return b;
    } 
    return b;
  }
  
  public ByteArray withAppended(byte... paramVarArgs) {
    int i = this.Zs.Zpu();
    byte[] arrayOfByte = new byte[i + paramVarArgs.length];
    byte b = 0;
    boolean bool = Zsie.Zv();
    while (b < i) {
      arrayOfByte[b] = this.Zs.Zp(b);
      b++;
      if (!bool)
        break; 
    } 
    System.arraycopy(paramVarArgs, 0, arrayOfByte, i, paramVarArgs.length);
    return Zk(arrayOfByte, this.Zj);
  }
  
  public ByteArray withAppended(int... paramVarArgs) {
    byte[] arrayOfByte = new byte[paramVarArgs.length];
    byte b = 0;
    boolean bool = Zsie.Zv();
    while (b < paramVarArgs.length) {
      arrayOfByte[b] = (byte)paramVarArgs[b];
      b++;
      if (!bool)
        break; 
    } 
    return withAppended(arrayOfByte);
  }
  
  public ByteArray withAppended(String paramString) {
    try {
      if (paramString == null)
        throw new IllegalArgumentException(a(-31156, -24621)); 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    return withAppended(Zkb.Zy(paramString));
  }
  
  public ByteArray withAppended(ByteArray paramByteArray) {
    try {
      if (paramByteArray == null)
        throw new IllegalArgumentException(a(-31166, 22402)); 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    return withAppended(paramByteArray.getBytes());
  }
  
  public ByteArray copy() {
    return Zk((byte[])this.Zs.ZiD().clone(), this.Zj);
  }
  
  public ByteArray copyToTempFile() {
    Zstu zstu = this.Zj.ZZ(this.Zs.ZiD());
    return ZJ(zstu, this.Zj);
  }
  
  public int indexOf(String paramString) {
    return indexOf(paramString, true, 0, length());
  }
  
  public int indexOf(ByteArray paramByteArray, boolean paramBoolean) {
    return indexOf(paramByteArray, paramBoolean, 0, length());
  }
  
  public int indexOf(String paramString, boolean paramBoolean) {
    return indexOf(paramString, paramBoolean, 0, length());
  }
  
  public int countMatches(ByteArray paramByteArray) {
    return countMatches(paramByteArray, true, 0, length());
  }
  
  public int countMatches(String paramString) {
    return countMatches(paramString, true, 0, length());
  }
  
  public int countMatches(ByteArray paramByteArray, boolean paramBoolean) {
    return countMatches(paramByteArray, paramBoolean, 0, length());
  }
  
  public int countMatches(String paramString, boolean paramBoolean) {
    return countMatches(paramString, paramBoolean, 0, length());
  }
  
  public int indexOf(ByteArray paramByteArray) {
    return indexOf(paramByteArray, true, 0, length());
  }
  
  public String toString() {
    return Zkb.ZG(this.Zs.ZiD());
  }
  
  public Iterator<Byte> iterator() {
    return new Zl7n(this);
  }
  
  public final int hashCode() {
    return Arrays.hashCode(getBytes());
  }
  
  public final boolean equals(Object paramObject) {
    boolean bool = Zsie.Z_();
    if (paramObject instanceof ByteArray) {
      ByteArray byteArray = (ByteArray)paramObject;
      try {
        if (!bool) {
          byte[] arrayOfByte1 = getBytes();
          byte[] arrayOfByte2 = byteArray.getBytes();
          return Arrays.equals(arrayOfByte1, arrayOfByte2);
        } 
        return false;
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        throw a(null);
      } 
    } 
    return false;
  }
  
  static ByteArray ZS(int paramInt, Zr_4 paramZr_4) {
    return new Zsyg(new byte[paramInt], paramZr_4);
  }
  
  static ByteArray Zk(byte[] paramArrayOfbyte, Zr_4 paramZr_4) {
    try {
    
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    return (paramArrayOfbyte == null) ? null : new Zsyg(paramArrayOfbyte, paramZr_4);
  }
  
  static ByteArray ZQ(int[] paramArrayOfint, Zr_4 paramZr_4) {
    try {
    
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    return (paramArrayOfint == null) ? null : Zk(ZE(paramArrayOfint), paramZr_4);
  }
  
  static ByteArray Zu(String paramString, Zr_4 paramZr_4) {
    try {
    
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    return (paramString == null) ? null : new Zsyg(Zkb.Zy(paramString), paramZr_4);
  }
  
  static ByteArray ZJ(Zstu paramZstu, Zr_4 paramZr_4) {
    try {
      if (paramZstu == null)
        return null; 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    return new Zsyg(paramZstu, paramZr_4);
  }
  
  static ByteArray Zu(byte[] paramArrayOfbyte) {
    return Zk(paramArrayOfbyte, ZU);
  }
  
  static ByteArray Zh(String paramString) {
    return Zu(paramString, ZU);
  }
  
  static {
    // Byte code:
    //   0: bipush #9
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÀàM+!ö+`à$¦àQòqZqÄ¦Ä&$LÑ¥j²ã·¹Hõ6j¤¶îk±vsS\\rêÐR=ÇÚ ±h¤­èKÃW{¦£¸\õÄ_bÓî¦¾îkUÍÖGÖìc Óö5kano^è^q(>©öcéÃ Ed@«;>YÜ´¡0"Ò\\bª¤+J[X2ºûGw¦ßQðhXgGné[g8Ñ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #26
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #111
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
    //   68: ldc '^\\n4Ü¤¢N³Ù¸A8Sl#¼ä~'#?©òtvy5¦ââ²è]$/n>`OZé<þ]/'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #26
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #9
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
    //   129: putstatic burp/Zsyg.a : [Ljava/lang/String;
    //   132: bipush #9
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zsyg.b : [Ljava/lang/String;
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
    //   212: bipush #111
    //   214: goto -> 244
    //   217: bipush #51
    //   219: goto -> 244
    //   222: bipush #98
    //   224: goto -> 244
    //   227: bipush #104
    //   229: goto -> 244
    //   232: bipush #104
    //   234: goto -> 244
    //   237: bipush #72
    //   239: goto -> 244
    //   242: bipush #26
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
    //   300: new burp/Zruo
    //   303: dup
    //   304: invokespecial <init> : ()V
    //   307: putstatic burp/Zsyg.ZU : Lburp/Zr_4;
    //   310: return
  }
  
  private static IndexOutOfBoundsException a(IndexOutOfBoundsException paramIndexOutOfBoundsException) {
    return paramIndexOutOfBoundsException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFF864A) & 0xFFFF;
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
      byte b1 = 102;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsyg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */