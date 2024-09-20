package burp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

class Zetr {
  private final Map<Zmt5<?>, List<Class<?>>> ZI = new HashMap<>();
  
  private final Map<Class<?>, CopyOnWriteArrayList<Zb4k>> ZE = new HashMap<>();
  
  private final Zgzs ZS;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zetr(Zgzs paramZgzs) {
    this.ZS = paramZgzs;
  }
  
  synchronized void ZK(Zmt5<?>... paramVarArgs) {
    // Byte code:
    //   0: invokestatic Ze : ()Ljava/lang/String;
    //   3: aload_1
    //   4: astore_3
    //   5: astore_2
    //   6: aload_3
    //   7: arraylength
    //   8: istore #4
    //   10: iconst_0
    //   11: istore #5
    //   13: iload #5
    //   15: iload #4
    //   17: if_icmpge -> 152
    //   20: aload_3
    //   21: iload #5
    //   23: aaload
    //   24: astore #6
    //   26: aload_0
    //   27: getfield ZI : Ljava/util/Map;
    //   30: aload #6
    //   32: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   37: checkcast java/util/List
    //   40: astore #7
    //   42: aload #7
    //   44: ifnull -> 106
    //   47: aload #7
    //   49: invokeinterface iterator : ()Ljava/util/Iterator;
    //   54: astore #8
    //   56: aload #8
    //   58: invokeinterface hasNext : ()Z
    //   63: ifeq -> 90
    //   66: aload #8
    //   68: invokeinterface next : ()Ljava/lang/Object;
    //   73: checkcast java/lang/Class
    //   76: astore #9
    //   78: aload_0
    //   79: aload #6
    //   81: aload #9
    //   83: invokevirtual ZP : (Ljava/lang/Object;Ljava/lang/Class;)V
    //   86: aload_2
    //   87: ifnonnull -> 56
    //   90: aload_0
    //   91: getfield ZI : Ljava/util/Map;
    //   94: aload #6
    //   96: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   101: pop
    //   102: aload_2
    //   103: ifnonnull -> 145
    //   106: iconst_0
    //   107: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   110: aload #6
    //   112: invokeinterface getClass : ()Ljava/lang/Class;
    //   117: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   120: sipush #27106
    //   123: sipush #-8520
    //   126: invokestatic a : (II)Ljava/lang/String;
    //   129: swap
    //   130: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   135: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   138: goto -> 145
    //   141: invokestatic a : (Lburp/Zm0w;)Lburp/Zm0w;
    //   144: athrow
    //   145: iinc #5, 1
    //   148: aload_2
    //   149: ifnonnull -> 13
    //   152: return
    // Exception table:
    //   from	to	target	type
    //   90	138	141	burp/Zm0w
  }
  
  synchronized Zb4k ZR(Zmt5<?> paramZmt5) {
    // Byte code:
    //   0: new burp/Zb4k
    //   3: dup
    //   4: aload_1
    //   5: invokespecial <init> : (Lburp/Zmt5;)V
    //   8: astore_3
    //   9: aload_3
    //   10: invokevirtual ZZ : ()Ljava/lang/Class;
    //   13: astore #4
    //   15: invokestatic Ze : ()Ljava/lang/String;
    //   18: aload_0
    //   19: getfield ZE : Ljava/util/Map;
    //   22: aload #4
    //   24: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   29: checkcast java/util/concurrent/CopyOnWriteArrayList
    //   32: astore #5
    //   34: astore_2
    //   35: aload #5
    //   37: ifnonnull -> 67
    //   40: new java/util/concurrent/CopyOnWriteArrayList
    //   43: dup
    //   44: invokespecial <init> : ()V
    //   47: astore #5
    //   49: aload_0
    //   50: getfield ZE : Ljava/util/Map;
    //   53: aload #4
    //   55: aload #5
    //   57: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   62: pop
    //   63: aload_2
    //   64: ifnonnull -> 135
    //   67: aload #5
    //   69: aload_3
    //   70: invokevirtual contains : (Ljava/lang/Object;)Z
    //   73: ifeq -> 135
    //   76: goto -> 83
    //   79: invokestatic a : (Lburp/Zm0w;)Lburp/Zm0w;
    //   82: athrow
    //   83: new burp/Zm0w
    //   86: dup
    //   87: aload_1
    //   88: invokeinterface getClass : ()Ljava/lang/Class;
    //   93: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   96: aload #4
    //   98: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   101: sipush #27105
    //   104: sipush #23884
    //   107: invokestatic a : (II)Ljava/lang/String;
    //   110: dup_x2
    //   111: pop
    //   112: sipush #27107
    //   115: sipush #4228
    //   118: invokestatic a : (II)Ljava/lang/String;
    //   121: swap
    //   122: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   127: invokespecial <init> : (Ljava/lang/String;)V
    //   130: athrow
    //   131: invokestatic a : (Lburp/Zm0w;)Lburp/Zm0w;
    //   134: athrow
    //   135: aload #5
    //   137: aload_3
    //   138: invokevirtual add : (Ljava/lang/Object;)Z
    //   141: pop
    //   142: aload_0
    //   143: getfield ZI : Ljava/util/Map;
    //   146: aload_1
    //   147: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   152: invokeinterface computeIfAbsent : (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    //   157: checkcast java/util/List
    //   160: astore #6
    //   162: aload #6
    //   164: aload #4
    //   166: invokeinterface add : (Ljava/lang/Object;)Z
    //   171: pop
    //   172: aload_3
    //   173: invokestatic Zwu : ()[Lburp/Zbqc;
    //   176: ifnonnull -> 191
    //   179: ldc 'Eel9O'
    //   181: invokestatic ZE : (Ljava/lang/String;)V
    //   184: goto -> 191
    //   187: invokestatic a : (Lburp/Zm0w;)Lburp/Zm0w;
    //   190: athrow
    //   191: areturn
    // Exception table:
    //   from	to	target	type
    //   49	76	79	burp/Zm0w
    //   67	131	131	burp/Zm0w
    //   162	184	187	burp/Zm0w
  }
  
  List<Zb4k> ZR(Class<?> paramClass) {
    return this.ZE.get(paramClass);
  }
  
  private void ZP(Object paramObject, Class<?> paramClass) {
    List<Zb4k> list = ZR(paramClass);
    try {
      if (list != null) {
        list.stream().filter(paramObject::lambda$unsubscribeByEventType$1).forEach(Zb4k::ZM);
        list.removeIf(Zetr::lambda$unsubscribeByEventType$2);
      } 
    } catch (Zm0w zm0w) {
      throw a(null);
    } 
  }
  
  private static boolean lambda$unsubscribeByEventType$2(Zb4k paramZb4k) {
    try {
    
    } catch (Zm0w zm0w) {
      throw a(null);
    } 
    return !paramZb4k.Z_();
  }
  
  private static boolean lambda$unsubscribeByEventType$1(Object paramObject, Zb4k paramZb4k) {
    try {
    
    } catch (Zm0w zm0w) {
      throw a(null);
    } 
    return (paramZb4k.ZY() == paramObject);
  }
  
  private static List lambda$register$0(Zmt5 paramZmt5) {
    return new ArrayList();
  }
  
  private static Zm0w a(Zm0w paramZm0w) {
    return paramZm0w;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '6:¯É¸3mÂoõÜtPF´µþÑÿúÌ$4cÃ·¢×Þ|»«Q­|ú¦ëã8d\\tF)SÊJ\\n´ûRX;IsD"î×ÐÞYãòÈ7=|®ÉSYù÷¤'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #29
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #76
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
    //   69: putstatic burp/Zetr.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zetr.b : [Ljava/lang/String;
    //   79: goto -> 227
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
    //   98: if_icmpgt -> 200
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #26
    //   154: goto -> 184
    //   157: bipush #118
    //   159: goto -> 184
    //   162: bipush #6
    //   164: goto -> 184
    //   167: bipush #121
    //   169: goto -> 184
    //   172: bipush #105
    //   174: goto -> 184
    //   177: bipush #15
    //   179: goto -> 184
    //   182: bipush #8
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 105
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 101
    //   208: pop
    //   209: new java/lang/String
    //   212: dup_x1
    //   213: swap
    //   214: invokespecial <init> : ([C)V
    //   217: invokevirtual intern : ()Ljava/lang/String;
    //   220: swap
    //   221: pop
    //   222: swap
    //   223: pop
    //   224: goto -> 39
    //   227: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x69E3) & 0xFFFF;
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
      byte b1 = 54;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zetr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */