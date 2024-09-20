package net.portswigger.swagger.v1.models.properties;

import java.util.ArrayList;
import java.util.List;
import net.portswigger.swagger.v1.models.Xml;

public class LongProperty extends BaseIntegerProperty {
  public static final String FORMAT;
  
  protected Long _default;
  
  protected List<Long> _enum;
  
  private static final String[] e;
  
  private static final String[] f;
  
  public LongProperty() {
    super(c(29989, -162));
  }
  
  public LongProperty _enum(Long paramLong) {
    try {
      if (this._enum == null)
        this._enum = new ArrayList<>(); 
    } catch (NumberFormatException numberFormatException) {
      throw b(null);
    } 
    try {
      if (!this._enum.contains(paramLong))
        this._enum.add(paramLong); 
    } catch (NumberFormatException numberFormatException) {
      throw b(null);
    } 
    return this;
  }
  
  public LongProperty _enum(List<Long> paramList) {
    this._enum = paramList;
    return this;
  }
  
  public static boolean isType(String paramString1, String paramString2) {
    try {
      if (c(29988, -20016).equals(paramString1))
        try {
          if (c(29991, -15181).equals(paramString2));
        } catch (NumberFormatException numberFormatException) {
          throw b(null);
        }  
    } catch (NumberFormatException numberFormatException) {
      throw b(null);
    } 
    return false;
  }
  
  public LongProperty xml(Xml paramXml) {
    setXml(paramXml);
    return this;
  }
  
  public LongProperty example(Long paramLong) {
    this.example = paramLong;
    return this;
  }
  
  public LongProperty _default(String paramString) {
    if (paramString != null)
      try {
        this._default = Long.valueOf(Long.parseLong(paramString));
      } catch (NumberFormatException numberFormatException) {} 
    return this;
  }
  
  public LongProperty _default(Long paramLong) {
    setDefault(paramLong);
    return this;
  }
  
  public LongProperty vendorExtension(String paramString, Object paramObject) {
    setVendorExtension(paramString, paramObject);
    return this;
  }
  
  public LongProperty readOnly() {
    setReadOnly(Boolean.TRUE);
    return this;
  }
  
  public Long getDefault() {
    return this._default;
  }
  
  public void setDefault(String paramString) {
    _default(paramString);
  }
  
  public void setDefault(Long paramLong) {
    this._default = paramLong;
  }
  
  public List<Long> getEnum() {
    return this._enum;
  }
  
  public void setEnum(List<Long> paramList) {
    this._enum = paramList;
  }
  
  public int hashCode() {
    byte b = 31;
    null = super.hashCode();
    try {
    
    } catch (NumberFormatException numberFormatException) {
      throw b(null);
    } 
    return 31 * null + ((this._default == null) ? 0 : this._default.hashCode());
  }
  
  public boolean equals(Object paramObject) {
    try {
      if (!super.equals(paramObject))
        return false; 
    } catch (NumberFormatException numberFormatException) {
      throw b(null);
    } 
    try {
      if (!(paramObject instanceof LongProperty))
        return false; 
    } catch (NumberFormatException numberFormatException) {
      throw b(null);
    } 
    LongProperty longProperty = (LongProperty)paramObject;
    try {
      if (this._default == null) {
        try {
          if (longProperty._default != null)
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw b(null);
        } 
      } else {
        try {
          if (!this._default.equals(longProperty._default))
            return false; 
        } catch (NumberFormatException numberFormatException) {
          throw b(null);
        } 
      } 
    } catch (NumberFormatException numberFormatException) {
      throw b(null);
    } 
    return true;
  }
  
  private static NumberFormatException b(NumberFormatException paramNumberFormatException) {
    return paramNumberFormatException;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'Ö\\f&ÕãRÈOÏ®þ'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #7
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #60
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 152
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
    //   67: ldc '1nòn\\fÝ¾Ä'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_5
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #39
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 152
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
    //   127: putstatic net/portswigger/swagger/v1/models/properties/LongProperty.e : [Ljava/lang/String;
    //   130: iconst_4
    //   131: anewarray java/lang/String
    //   134: putstatic net/portswigger/swagger/v1/models/properties/LongProperty.f : [Ljava/lang/String;
    //   137: sipush #29990
    //   140: sipush #-19044
    //   143: invokestatic c : (II)Ljava/lang/String;
    //   146: putstatic net/portswigger/swagger/v1/models/properties/LongProperty.FORMAT : Ljava/lang/String;
    //   149: goto -> 308
    //   152: dup_x2
    //   153: pop
    //   154: invokevirtual toCharArray : ()[C
    //   157: dup_x1
    //   158: arraylength
    //   159: dup_x2
    //   160: pop
    //   161: iconst_0
    //   162: istore #6
    //   164: dup2_x1
    //   165: pop2
    //   166: dup_x2
    //   167: iconst_1
    //   168: if_icmpgt -> 267
    //   171: dup2
    //   172: swap
    //   173: iload #6
    //   175: dup2_x1
    //   176: caload
    //   177: swap
    //   178: iload #6
    //   180: bipush #7
    //   182: irem
    //   183: tableswitch default -> 250, 0 -> 220, 1 -> 225, 2 -> 230, 3 -> 235, 4 -> 240, 5 -> 245
    //   220: bipush #41
    //   222: goto -> 251
    //   225: bipush #72
    //   227: goto -> 251
    //   230: bipush #120
    //   232: goto -> 251
    //   235: bipush #96
    //   237: goto -> 251
    //   240: bipush #125
    //   242: goto -> 251
    //   245: bipush #60
    //   247: goto -> 251
    //   250: iconst_5
    //   251: ixor
    //   252: ixor
    //   253: i2c
    //   254: castore
    //   255: iinc #6, 1
    //   258: dup
    //   259: ifne -> 267
    //   262: dup2
    //   263: dup_x1
    //   264: goto -> 175
    //   267: dup2_x1
    //   268: pop2
    //   269: dup_x2
    //   270: iload #6
    //   272: if_icmpgt -> 171
    //   275: pop
    //   276: new java/lang/String
    //   279: dup_x1
    //   280: swap
    //   281: invokespecial <init> : ([C)V
    //   284: invokevirtual intern : ()Ljava/lang/String;
    //   287: swap
    //   288: pop
    //   289: swap
    //   290: tableswitch default -> 39, 0 -> 97
    //   308: return
  }
  
  private static String c(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7524) & 0xFFFF;
    if (f[i] == null) {
      char[] arrayOfChar = e[i].toCharArray();
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
      byte b1 = 0;
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
      f[i] = (new String(arrayOfChar)).intern();
    } 
    return f[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\properties\LongProperty.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */