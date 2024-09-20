package net.portswigger.swagger.v1.models.properties;

import java.util.ArrayList;
import java.util.List;
import net.portswigger.swagger.v1.models.Xml;

public class PasswordProperty extends AbstractProperty implements Property {
  public static final String TYPE;
  
  private static final String FORMAT;
  
  protected List<String> _enum;
  
  protected Integer minLength = null;
  
  protected Integer maxLength = null;
  
  protected String pattern = null;
  
  protected String _default;
  
  private static final String[] c;
  
  private static final String[] d;
  
  public PasswordProperty() {
    this.type = b(-23679, 9535);
    this.format = b(-23676, 844);
  }
  
  public PasswordProperty _enum(String paramString) {
    if (this._enum == null)
      this._enum = new ArrayList<>(); 
    if (!this._enum.contains(paramString))
      this._enum.add(paramString); 
    return this;
  }
  
  public PasswordProperty _enum(List<String> paramList) {
    this._enum = paramList;
    return this;
  }
  
  public static boolean isType(String paramString1, String paramString2) {
    return (b(-23680, 21084).equals(paramString1) && b(-23677, -9908).equals(paramString2));
  }
  
  public PasswordProperty xml(Xml paramXml) {
    setXml(paramXml);
    return this;
  }
  
  public PasswordProperty minLength(Integer paramInteger) {
    setMinLength(paramInteger);
    return this;
  }
  
  public PasswordProperty maxLength(Integer paramInteger) {
    setMaxLength(paramInteger);
    return this;
  }
  
  public PasswordProperty pattern(String paramString) {
    setPattern(paramString);
    return this;
  }
  
  public PasswordProperty _default(String paramString) {
    this._default = paramString;
    return this;
  }
  
  public PasswordProperty vendorExtension(String paramString, Object paramObject) {
    setVendorExtension(paramString, paramObject);
    return this;
  }
  
  public PasswordProperty readOnly() {
    setReadOnly(Boolean.TRUE);
    return this;
  }
  
  public Integer getMinLength() {
    return this.minLength;
  }
  
  public void setMinLength(Integer paramInteger) {
    this.minLength = paramInteger;
  }
  
  public Integer getMaxLength() {
    return this.maxLength;
  }
  
  public void setMaxLength(Integer paramInteger) {
    this.maxLength = paramInteger;
  }
  
  public String getPattern() {
    return this.pattern;
  }
  
  public void setPattern(String paramString) {
    this.pattern = paramString;
  }
  
  public String getDefault() {
    return this._default;
  }
  
  public void setDefault(String paramString) {
    this._default = paramString;
  }
  
  public List<String> getEnum() {
    return this._enum;
  }
  
  public void setEnum(List<String> paramList) {
    this._enum = paramList;
  }
  
  public int hashCode() {
    byte b = 31;
    null = super.hashCode();
    null = 31 * null + ((this._default == null) ? 0 : this._default.hashCode());
    null = 31 * null + ((this._enum == null) ? 0 : this._enum.hashCode());
    null = 31 * null + ((this.maxLength == null) ? 0 : this.maxLength.hashCode());
    null = 31 * null + ((this.minLength == null) ? 0 : this.minLength.hashCode());
    return 31 * null + ((this.pattern == null) ? 0 : this.pattern.hashCode());
  }
  
  public boolean equals(Object paramObject) {
    if (!super.equals(paramObject))
      return false; 
    if (!(paramObject instanceof PasswordProperty))
      return false; 
    PasswordProperty passwordProperty = (PasswordProperty)paramObject;
    if (this._default == null) {
      if (passwordProperty._default != null)
        return false; 
    } else if (!this._default.equals(passwordProperty._default)) {
      return false;
    } 
    if (this._enum == null) {
      if (passwordProperty._enum != null)
        return false; 
    } else if (!this._enum.equals(passwordProperty._enum)) {
      return false;
    } 
    if (this.maxLength == null) {
      if (passwordProperty.maxLength != null)
        return false; 
    } else if (!this.maxLength.equals(passwordProperty.maxLength)) {
      return false;
    } 
    if (this.minLength == null) {
      if (passwordProperty.minLength != null)
        return false; 
    } else if (!this.minLength.equals(passwordProperty.minLength)) {
      return false;
    } 
    if (this.pattern == null) {
      if (passwordProperty.pattern != null)
        return false; 
    } else if (!this.pattern.equals(passwordProperty.pattern)) {
      return false;
    } 
    return true;
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'Ãë$Ã%Òêº!\\bí³? Ùê\\b/g¦$¸z'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #6
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #104
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 167
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
    //   68: ldc '8óT[³JfÙm\\n%@Ô'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #8
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #95
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 167
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
    //   129: putstatic net/portswigger/swagger/v1/models/properties/PasswordProperty.c : [Ljava/lang/String;
    //   132: bipush #6
    //   134: anewarray java/lang/String
    //   137: putstatic net/portswigger/swagger/v1/models/properties/PasswordProperty.d : [Ljava/lang/String;
    //   140: sipush #-23675
    //   143: sipush #-9913
    //   146: invokestatic b : (II)Ljava/lang/String;
    //   149: putstatic net/portswigger/swagger/v1/models/properties/PasswordProperty.TYPE : Ljava/lang/String;
    //   152: sipush #-23678
    //   155: sipush #-22856
    //   158: invokestatic b : (II)Ljava/lang/String;
    //   161: putstatic net/portswigger/swagger/v1/models/properties/PasswordProperty.FORMAT : Ljava/lang/String;
    //   164: goto -> 324
    //   167: dup_x2
    //   168: pop
    //   169: invokevirtual toCharArray : ()[C
    //   172: dup_x1
    //   173: arraylength
    //   174: dup_x2
    //   175: pop
    //   176: iconst_0
    //   177: istore #6
    //   179: dup2_x1
    //   180: pop2
    //   181: dup_x2
    //   182: iconst_1
    //   183: if_icmpgt -> 284
    //   186: dup2
    //   187: swap
    //   188: iload #6
    //   190: dup2_x1
    //   191: caload
    //   192: swap
    //   193: iload #6
    //   195: bipush #7
    //   197: irem
    //   198: tableswitch default -> 266, 0 -> 236, 1 -> 241, 2 -> 246, 3 -> 251, 4 -> 256, 5 -> 261
    //   236: bipush #53
    //   238: goto -> 268
    //   241: bipush #20
    //   243: goto -> 268
    //   246: bipush #76
    //   248: goto -> 268
    //   251: bipush #45
    //   253: goto -> 268
    //   256: bipush #110
    //   258: goto -> 268
    //   261: bipush #66
    //   263: goto -> 268
    //   266: bipush #123
    //   268: ixor
    //   269: ixor
    //   270: i2c
    //   271: castore
    //   272: iinc #6, 1
    //   275: dup
    //   276: ifne -> 284
    //   279: dup2
    //   280: dup_x1
    //   281: goto -> 190
    //   284: dup2_x1
    //   285: pop2
    //   286: dup_x2
    //   287: iload #6
    //   289: if_icmpgt -> 186
    //   292: pop
    //   293: new java/lang/String
    //   296: dup_x1
    //   297: swap
    //   298: invokespecial <init> : ([C)V
    //   301: invokevirtual intern : ()Ljava/lang/String;
    //   304: swap
    //   305: pop
    //   306: swap
    //   307: tableswitch default -> 40, 0 -> 99
    //   324: return
  }
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFA380) & 0xFFFF;
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
      byte b1 = 125;
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
      d[i] = (new String(arrayOfChar)).intern();
    } 
    return d[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\properties\PasswordProperty.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */