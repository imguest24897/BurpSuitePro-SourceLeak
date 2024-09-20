package com.fasterxml.Zb;

import com.fasterxml.Zq6;

public abstract class Ze {
  protected int Zz;
  
  protected int Zb;
  
  protected int Zv;
  
  private static final String[] a;
  
  private static final String[] b;
  
  protected Ze() {}
  
  protected Ze(Ze paramZe) {
    this.Zz = paramZe.Zz;
    this.Zb = paramZe.Zb;
  }
  
  protected Ze(int paramInt1, int paramInt2) {
    this.Zz = paramInt1;
    this.Zb = paramInt2;
  }
  
  public abstract Ze Zf();
  
  public final boolean Zo() {
    return (this.Zz == 1);
  }
  
  public final boolean Zk() {
    return (this.Zz == 0);
  }
  
  public final boolean ZQ() {
    return (this.Zz == 2);
  }
  
  public final int Zs() {
    return this.Zv;
  }
  
  public String ZF() {
    switch (this.Zz) {
      case 0:
        return a(-18049, 17256);
      case 1:
        return a(-18052, -26669);
      case 2:
        return a(-18050, -26942);
    } 
    return "?";
  }
  
  public final int Zc() {
    return this.Zb + 1;
  }
  
  public final int Zl() {
    return (this.Zb < 0) ? 0 : this.Zb;
  }
  
  public boolean ZK() {
    return (this.Zb >= 0);
  }
  
  public abstract String Z_();
  
  public boolean ZV() {
    return (Z_() != null);
  }
  
  public Object Zb() {
    return null;
  }
  
  public void Z_(Object paramObject) {}
  
  public Zm5 Zj(Zq6 paramZq6) {
    return Zm5.Zi;
  }
  
  public String toString() {
    // Byte code:
    //   0: invokestatic ZR : ()Z
    //   3: new java/lang/StringBuilder
    //   6: dup
    //   7: bipush #64
    //   9: invokespecial <init> : (I)V
    //   12: astore_2
    //   13: istore_1
    //   14: aload_0
    //   15: getfield Zz : I
    //   18: tableswitch default -> 82, 0 -> 44, 1 -> 55, 2 -> 82
    //   44: aload_2
    //   45: ldc '/'
    //   47: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   50: pop
    //   51: iload_1
    //   52: ifeq -> 135
    //   55: aload_2
    //   56: bipush #91
    //   58: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   61: pop
    //   62: aload_2
    //   63: aload_0
    //   64: invokevirtual Zl : ()I
    //   67: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   70: pop
    //   71: aload_2
    //   72: bipush #93
    //   74: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   77: pop
    //   78: iload_1
    //   79: ifeq -> 135
    //   82: aload_2
    //   83: bipush #123
    //   85: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   88: pop
    //   89: aload_0
    //   90: invokevirtual Z_ : ()Ljava/lang/String;
    //   93: astore_3
    //   94: aload_3
    //   95: ifnull -> 121
    //   98: aload_2
    //   99: bipush #34
    //   101: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   104: pop
    //   105: aload_2
    //   106: aload_3
    //   107: invokestatic Zs : (Ljava/lang/StringBuilder;Ljava/lang/String;)V
    //   110: aload_2
    //   111: bipush #34
    //   113: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   116: pop
    //   117: iload_1
    //   118: ifeq -> 128
    //   121: aload_2
    //   122: bipush #63
    //   124: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   127: pop
    //   128: aload_2
    //   129: bipush #125
    //   131: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   134: pop
    //   135: aload_2
    //   136: invokevirtual toString : ()Ljava/lang/String;
    //   139: areturn
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'u)¢Q\\t¶2çÕ5À¢Ã6$'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #6
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #47
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 82
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
    //   67: aload #5
    //   69: putstatic com/fasterxml/Zb/Ze.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic com/fasterxml/Zb/Ze.b : [Ljava/lang/String;
    //   79: goto -> 226
    //   82: dup_x2
    //   83: pop
    //   84: invokevirtual toCharArray : ()[C
    //   87: dup_x1
    //   88: arraylength
    //   89: dup_x2
    //   90: pop
    //   91: iconst_0
    //   92: istore #6
    //   94: dup2_x1
    //   95: pop2
    //   96: dup_x2
    //   97: iconst_1
    //   98: if_icmpgt -> 199
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 181, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 166, 4 -> 171, 5 -> 176
    //   152: bipush #112
    //   154: goto -> 183
    //   157: bipush #93
    //   159: goto -> 183
    //   162: iconst_4
    //   163: goto -> 183
    //   166: bipush #94
    //   168: goto -> 183
    //   171: bipush #83
    //   173: goto -> 183
    //   176: bipush #32
    //   178: goto -> 183
    //   181: bipush #119
    //   183: ixor
    //   184: ixor
    //   185: i2c
    //   186: castore
    //   187: iinc #6, 1
    //   190: dup
    //   191: ifne -> 199
    //   194: dup2
    //   195: dup_x1
    //   196: goto -> 105
    //   199: dup2_x1
    //   200: pop2
    //   201: dup_x2
    //   202: iload #6
    //   204: if_icmpgt -> 101
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
    //   223: goto -> 39
    //   226: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFB97E) & 0xFFFF;
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
      char c = 'ç';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zb\Ze.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */