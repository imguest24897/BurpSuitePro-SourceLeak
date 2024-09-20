package net.portswigger.swagger.v1.models.properties;

import java.util.ArrayList;
import java.util.List;
import net.portswigger.swagger.v1.models.Xml;

public class UUIDProperty extends AbstractProperty implements Property {
  protected List<String> _enum;
  
  protected Integer minLength = null;
  
  protected Integer maxLength = null;
  
  protected String pattern = null;
  
  protected String _default;
  
  private static final String[] c;
  
  private static final String[] d;
  
  public UUIDProperty() {
    this.type = b(-20571, -667);
    this.format = b(-20569, 24562);
  }
  
  public UUIDProperty _enum(String paramString) {
    if (this._enum == null)
      this._enum = new ArrayList<>(); 
    if (!this._enum.contains(paramString))
      this._enum.add(paramString); 
    return this;
  }
  
  public UUIDProperty _enum(List<String> paramList) {
    this._enum = paramList;
    return this;
  }
  
  public static boolean isType(String paramString1, String paramString2) {
    return (b(-20570, 27033).equals(paramString1) && b(-20572, -6664).equals(paramString2));
  }
  
  public UUIDProperty xml(Xml paramXml) {
    setXml(paramXml);
    return this;
  }
  
  public UUIDProperty minLength(Integer paramInteger) {
    setMinLength(paramInteger);
    return this;
  }
  
  public UUIDProperty maxLength(Integer paramInteger) {
    setMaxLength(paramInteger);
    return this;
  }
  
  public UUIDProperty pattern(String paramString) {
    setPattern(paramString);
    return this;
  }
  
  public UUIDProperty _default(String paramString) {
    this._default = paramString;
    return this;
  }
  
  public UUIDProperty vendorExtension(String paramString, Object paramObject) {
    setVendorExtension(paramString, paramObject);
    return this;
  }
  
  public UUIDProperty readOnly() {
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
    if (!(paramObject instanceof UUIDProperty))
      return false; 
    UUIDProperty uUIDProperty = (UUIDProperty)paramObject;
    if (this._default == null) {
      if (uUIDProperty._default != null)
        return false; 
    } else if (!this._default.equals(uUIDProperty._default)) {
      return false;
    } 
    if (this._enum == null) {
      if (uUIDProperty._enum != null)
        return false; 
    } else if (!this._enum.equals(uUIDProperty._enum)) {
      return false;
    } 
    if (this.maxLength == null) {
      if (uUIDProperty.maxLength != null)
        return false; 
    } else if (!this.maxLength.equals(uUIDProperty.maxLength)) {
      return false;
    } 
    if (this.minLength == null) {
      if (uUIDProperty.minLength != null)
        return false; 
    } else if (!this.minLength.equals(uUIDProperty.minLength)) {
      return false;
    } 
    if (this.pattern == null) {
      if (uUIDProperty.pattern != null)
        return false; 
    } else if (!this.pattern.equals(uUIDProperty.pattern)) {
      return false;
    } 
    return true;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'ú~óÃÃÑ'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #6
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: iconst_5
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 138
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
    //   63: goto -> 22
    //   66: ldc 'ÂÀks.'
    //   68: dup
    //   69: astore_2
    //   70: invokevirtual length : ()I
    //   73: istore #4
    //   75: iconst_4
    //   76: istore_1
    //   77: iconst_m1
    //   78: istore_0
    //   79: iconst_4
    //   80: iinc #0, 1
    //   83: aload_2
    //   84: iload_0
    //   85: dup
    //   86: iload_1
    //   87: iadd
    //   88: invokevirtual substring : (II)Ljava/lang/String;
    //   91: iconst_0
    //   92: goto -> 138
    //   95: aload #5
    //   97: swap
    //   98: iload_3
    //   99: iinc #3, 1
    //   102: swap
    //   103: aastore
    //   104: iload_0
    //   105: iload_1
    //   106: iadd
    //   107: dup
    //   108: istore_0
    //   109: iload #4
    //   111: if_icmpge -> 123
    //   114: aload_2
    //   115: iload_0
    //   116: invokevirtual charAt : (I)C
    //   119: istore_1
    //   120: goto -> 79
    //   123: aload #5
    //   125: putstatic net/portswigger/swagger/v1/models/properties/UUIDProperty.c : [Ljava/lang/String;
    //   128: iconst_4
    //   129: anewarray java/lang/String
    //   132: putstatic net/portswigger/swagger/v1/models/properties/UUIDProperty.d : [Ljava/lang/String;
    //   135: goto -> 296
    //   138: dup_x2
    //   139: pop
    //   140: invokevirtual toCharArray : ()[C
    //   143: dup_x1
    //   144: arraylength
    //   145: dup_x2
    //   146: pop
    //   147: iconst_0
    //   148: istore #6
    //   150: dup2_x1
    //   151: pop2
    //   152: dup_x2
    //   153: iconst_1
    //   154: if_icmpgt -> 255
    //   157: dup2
    //   158: swap
    //   159: iload #6
    //   161: dup2_x1
    //   162: caload
    //   163: swap
    //   164: iload #6
    //   166: bipush #7
    //   168: irem
    //   169: tableswitch default -> 237, 0 -> 208, 1 -> 213, 2 -> 218, 3 -> 222, 4 -> 227, 5 -> 232
    //   208: bipush #43
    //   210: goto -> 239
    //   213: bipush #120
    //   215: goto -> 239
    //   218: iconst_3
    //   219: goto -> 239
    //   222: bipush #111
    //   224: goto -> 239
    //   227: bipush #42
    //   229: goto -> 239
    //   232: bipush #39
    //   234: goto -> 239
    //   237: bipush #94
    //   239: ixor
    //   240: ixor
    //   241: i2c
    //   242: castore
    //   243: iinc #6, 1
    //   246: dup
    //   247: ifne -> 255
    //   250: dup2
    //   251: dup_x1
    //   252: goto -> 161
    //   255: dup2_x1
    //   256: pop2
    //   257: dup_x2
    //   258: iload #6
    //   260: if_icmpgt -> 157
    //   263: pop
    //   264: new java/lang/String
    //   267: dup_x1
    //   268: swap
    //   269: invokespecial <init> : ([C)V
    //   272: invokevirtual intern : ()Ljava/lang/String;
    //   275: swap
    //   276: pop
    //   277: swap
    //   278: tableswitch default -> 38, 0 -> 95
    //   296: return
  }
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFAFA6) & 0xFFFF;
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
      char c = 'ø';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v1\models\properties\UUIDProperty.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */