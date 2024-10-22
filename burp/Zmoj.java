package burp;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zmoj {
  private final String ZV;
  
  private final String ZU;
  
  private long[] ZZ;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zmoj(String paramString) {
    this.ZV = paramString;
    String str = (new File(paramString)).getName();
    this.ZU = str.isEmpty() ? a(31658, 19989) : str;
    ZY();
  }
  
  public String ZV() {
    return this.ZV;
  }
  
  List<Zrbn> ZO(char[] paramArrayOfchar, Zbl2 paramZbl2) {
    ArrayList<Zrbn> arrayList = new ArrayList();
    Iterator<Ztkn> iterator = Zl().iterator();
    String str = Zgkj.ZV();
    while (iterator.hasNext()) {
      Ztkn ztkn = iterator.next();
      ZS(arrayList, paramArrayOfchar, paramZbl2, ztkn);
      if (str != null)
        break; 
    } 
    return arrayList;
  }
  
  private void ZS(List<Zrbn> paramList, char[] paramArrayOfchar, Zbl2 paramZbl2, Ztkn paramZtkn) {
    String str = Zgkj.ZV();
    Provider provider = null;
    try {
      provider = ZW(paramZtkn);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.IGNORED);
    } 
    try {
      if (provider == null)
        return; 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    try {
      KeyStore keyStore = KeyStore.getInstance(a(31659, 23842), provider);
      keyStore.load(null, paramArrayOfchar);
      Enumeration<String> enumeration = keyStore.aliases();
      while (enumeration.hasMoreElements()) {
        try {
          Zrbn zrbn = paramZbl2.Zs(paramZtkn, enumeration.nextElement(), new String(paramArrayOfchar));
          try {
            if (!paramList.contains(zrbn))
              paramList.add(zrbn); 
          } catch (Throwable throwable) {
            throw a(null);
          } 
        } catch (Throwable throwable) {
          Zah.Zl(throwable, Zk_.UNEXPECTED);
          if (str != null)
            break; 
        } 
      } 
    } catch (KeyStoreException keyStoreException) {
      Zah.Zl(keyStoreException, Zk_.COMMON_RUNTIME_FAILURE);
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.UNEXPECTED);
    } 
  }
  
  Provider ZW(Ztkn paramZtkn) throws Throwable {
    try {
      Class<?> clazz = Class.forName(a(31656, 1600));
      Constructor<?> constructor1 = clazz.getDeclaredConstructor(new Class[] { String.class });
      constructor1.setAccessible(true);
      Object object = constructor1.newInstance(new Object[] { a(31653, 32565) + a(31653, 32565) });
      Constructor<?> constructor2 = Class.forName(a(31652, 27242)).getDeclaredConstructor(new Class[] { clazz });
      constructor2.setAccessible(true);
      return (Provider)constructor2.newInstance(new Object[] { object });
    } catch (ClassNotFoundException classNotFoundException) {
      Zah.Zl(classNotFoundException, Zk_.COMMON_RUNTIME_FAILURE);
      throw new Zrxy();
    } 
  }
  
  boolean Zr() {
    String str = Zgkj.ZV();
    for (Ztkn ztkn : Zl()) {
      try {
        if (null != ZW(ztkn))
          return true; 
      } catch (Throwable throwable) {
        Zah.Zl(throwable, Zk_.IGNORED);
      } 
      if (str != null)
        break; 
    } 
    return false;
  }
  
  private void ZY() {
    try {
      Class<?> clazz1 = Zmoj.class.getClassLoader().loadClass(a(31660, 30639));
      Class<?> clazz2 = Zmoj.class.getClassLoader().loadClass(a(31661, -29335));
      Method method1 = clazz1.getMethod(a(31663, -10133), new Class[] { String.class, String.class, clazz2, boolean.class });
      Object object1 = method1.invoke(null, new Object[] { this.ZV, a(31657, 21352), null, Boolean.valueOf(false) });
      Method method2 = clazz1.getMethod(a(31654, -3426), new Class[] { boolean.class });
      Object object2 = method2.invoke(object1, new Object[] { Boolean.valueOf(true) });
      this.ZZ = (long[])object2;
    } catch (Exception exception) {
      Zah.ZU(exception, a(31662, -3243), Zk_.COMMON_RUNTIME_FAILURE);
    } 
  }
  
  private List<Ztkn> Zl() {
    // Byte code:
    //   0: invokestatic ZV : ()Ljava/lang/String;
    //   3: astore_1
    //   4: new java/util/ArrayList
    //   7: dup
    //   8: invokespecial <init> : ()V
    //   11: astore_2
    //   12: aload_0
    //   13: getfield ZZ : [J
    //   16: ifnull -> 72
    //   19: aload_0
    //   20: getfield ZZ : [J
    //   23: astore_3
    //   24: aload_3
    //   25: arraylength
    //   26: istore #4
    //   28: iconst_0
    //   29: istore #5
    //   31: iload #5
    //   33: iload #4
    //   35: if_icmpge -> 68
    //   38: aload_3
    //   39: iload #5
    //   41: laload
    //   42: lstore #6
    //   44: aload_2
    //   45: aload_0
    //   46: getfield ZV : Ljava/lang/String;
    //   49: lload #6
    //   51: l2i
    //   52: invokestatic Zt : (Ljava/lang/String;I)Lburp/Ztkn;
    //   55: invokeinterface add : (Ljava/lang/Object;)Z
    //   60: pop
    //   61: iinc #5, 1
    //   64: aload_1
    //   65: ifnull -> 31
    //   68: aload_1
    //   69: ifnull -> 131
    //   72: aload_2
    //   73: aload_0
    //   74: getfield ZV : Ljava/lang/String;
    //   77: invokestatic Zg : (Ljava/lang/String;)Lburp/Ztkn;
    //   80: invokeinterface add : (Ljava/lang/Object;)Z
    //   85: pop
    //   86: iconst_0
    //   87: istore_3
    //   88: iload_3
    //   89: bipush #8
    //   91: if_icmpge -> 131
    //   94: aload_2
    //   95: aload_0
    //   96: getfield ZV : Ljava/lang/String;
    //   99: iload_3
    //   100: invokestatic Zt : (Ljava/lang/String;I)Lburp/Ztkn;
    //   103: invokeinterface add : (Ljava/lang/Object;)Z
    //   108: pop
    //   109: aload_2
    //   110: aload_0
    //   111: getfield ZV : Ljava/lang/String;
    //   114: iload_3
    //   115: invokestatic ZT : (Ljava/lang/String;I)Lburp/Ztkn;
    //   118: invokeinterface add : (Ljava/lang/Object;)Z
    //   123: pop
    //   124: iinc #3, 1
    //   127: aload_1
    //   128: ifnull -> 88
    //   131: aload_2
    //   132: areturn
  }
  
  static boolean Zi(String paramString) {
    Zmoj zmoj = new Zmoj(paramString);
    return zmoj.Zr();
  }
  
  static List<Zrbn> ZP(String paramString, char[] paramArrayOfchar, Zbl2 paramZbl2) {
    Zmoj zmoj = new Zmoj(paramString);
    return zmoj.ZO(paramArrayOfchar, paramZbl2);
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  static {
    // Byte code:
    //   0: bipush #11
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '.Å Ôz,ùÅîßg\ñUHýèÞä8qeH8¨\\býAÙ0ß0jY­Ôñæ\\r4!8  vC/\\t{'.£WÕB DoY?áôr_Èm·"ëmKN=ìñÇ¶¿";Miñ¥NiíÇI3ø5ç÷ÝÑ[#¥â§ÉÌfW*){Åün; 9§_èºg 9|c}?8·k%E\\f°8×ø5[éY\\r3Di`mj«Êz±PüÏúÕREÔeKËÓÞÇ#_¼ñ¦£¥7«}'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #34
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #59
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 142
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
    //   68: ldc 'ù\\rÆ[dåË¨¹G)$'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: iconst_2
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #61
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 142
    //   98: aload #5
    //   100: swap
    //   101: iload_3
    //   102: iinc #3, 1
    //   105: swap
    //   106: aastore
    //   107: iload_0
    //   108: iload_1
    //   109: iadd
    //   110: dup
    //   111: istore_0
    //   112: iload #4
    //   114: if_icmpge -> 126
    //   117: aload_2
    //   118: iload_0
    //   119: invokevirtual charAt : (I)C
    //   122: istore_1
    //   123: goto -> 81
    //   126: aload #5
    //   128: putstatic burp/Zmoj.a : [Ljava/lang/String;
    //   131: bipush #11
    //   133: anewarray java/lang/String
    //   136: putstatic burp/Zmoj.b : [Ljava/lang/String;
    //   139: goto -> 300
    //   142: dup_x2
    //   143: pop
    //   144: invokevirtual toCharArray : ()[C
    //   147: dup_x1
    //   148: arraylength
    //   149: dup_x2
    //   150: pop
    //   151: iconst_0
    //   152: istore #6
    //   154: dup2_x1
    //   155: pop2
    //   156: dup_x2
    //   157: iconst_1
    //   158: if_icmpgt -> 259
    //   161: dup2
    //   162: swap
    //   163: iload #6
    //   165: dup2_x1
    //   166: caload
    //   167: swap
    //   168: iload #6
    //   170: bipush #7
    //   172: irem
    //   173: tableswitch default -> 241, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: bipush #74
    //   214: goto -> 243
    //   217: bipush #127
    //   219: goto -> 243
    //   222: iconst_3
    //   223: goto -> 243
    //   226: bipush #42
    //   228: goto -> 243
    //   231: bipush #102
    //   233: goto -> 243
    //   236: bipush #119
    //   238: goto -> 243
    //   241: bipush #17
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 165
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 161
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 40, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7BAC) & 0xFFFF;
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
      char c = 'Ô';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmoj.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */