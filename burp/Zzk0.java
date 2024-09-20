package burp;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zep;
import net.portswigger.Zk_;
import net.portswigger.Zza;

public class Zzk0 implements Ze0c {
  private static final byte[] Zq;
  
  private static final Zs68 Za;
  
  private final Ze0c ZE;
  
  private final Zt2c ZJ;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zzk0(Ze0c paramZe0c, Zt2c paramZt2c) {
    this.ZE = paramZe0c;
    this.ZJ = paramZt2c;
  }
  
  public void ZE(Zlit paramZlit, Zs68 paramZs68, byte[] paramArrayOfbyte, Zm4 paramZm4) {
    boolean bool = Zt2c.ZK();
    int i = paramZs68.Zk;
    if (ZV(paramArrayOfbyte, paramZs68))
      try {
        byte[] arrayOfByte = ZS(paramArrayOfbyte, i);
        List<String> list = ZA(arrayOfByte);
        for (String str : list) {
          byte[] arrayOfByte1 = str.getBytes(a(29154, -22660));
          this.ZE.ZE(paramZlit, Za, arrayOfByte1, paramZm4);
          this.ZJ.ZI(paramZlit, arrayOfByte1, 0, arrayOfByte1.length, paramZm4);
          if (bool)
            break; 
        } 
      } catch (Zrts zrts) {
        Zah.Zl(zrts, Zk_.COMMON_RUNTIME_FAILURE);
      } catch (IOException iOException) {
        Zah.Zl(iOException, Zk_.UNEXPECTED);
      }  
  }
  
  private List<String> ZA(byte[] paramArrayOfbyte) throws IOException {
    ArrayList<String> arrayList = new ArrayList();
    Zep zep = new Zep(new ByteArrayInputStream(paramArrayOfbyte));
    try {
      Zi(zep);
      Z_(zep);
      Za(zep);
      ZX(zep, arrayList);
    } catch (Zza zza) {
      Zah.Zl((Throwable)zza, Zk_.COMMON_RUNTIME_FAILURE);
    } 
    return arrayList;
  }
  
  private void ZX(Zep paramZep, List<String> paramList) throws IOException {
    boolean bool = Zt2c.ZK();
    try {
      boolean bool1 = false;
      while (!bool1) {
        int i = paramZep.ZZ();
        int j = i >>> 6;
        long l = (i & 0x3F);
        if (l == 63L)
          l = paramZep.Zw(); 
        switch (j) {
          case 0:
            bool1 = true;
          case 82:
            ZB(paramZep, l, paramList);
          case 37:
            Zn(paramZep, l, paramList);
          case 12:
            Zr(paramZep, l, paramList);
          case 57:
          case 71:
            ZV(paramZep, l, paramList);
            if (bool)
              break; 
            continue;
        } 
        paramZep.Zd((int)l);
        continue;
        if (bool)
          break; 
      } 
    } catch (Zza zza) {
      Zah.Zl((Throwable)zza, Zk_.UNEXPECTED);
    } 
  }
  
  private void Zn(Zep paramZep, long paramLong, List<String> paramList) throws IOException {
    byte[] arrayOfByte = paramZep.Zd((int)paramLong);
    Zep zep = new Zep(new ByteArrayInputStream(arrayOfByte));
    zep.ZZ();
    Z_(zep);
    int i = zep.Zt();
    try {
      if ((i & 0x100) != 0)
        zep.ZZ(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if ((i & 0x80) != 0)
        ZS(zep); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if ((i & 0x100) != 0)
        zep.ZZ(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if ((i & 0x400) != 0)
        zep.Zw(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if ((i & 0x200) != 0)
        zep.ZZ(); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if ((i & 0x20) != 0) {
        zep.ZI();
        zep.ZZ();
        zep.ZZ();
        zep.ZZ();
        zep.ZZ();
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      ZS(zep);
      if ((i & 0x8000) != 0)
        paramList.add(ZS(zep)); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  private void ZB(Zep paramZep, long paramLong, List<String> paramList) throws IOException {
    byte[] arrayOfByte = paramZep.Zd((int)paramLong);
    Zep zep = new Zep(new ByteArrayInputStream(arrayOfByte));
    Zd(zep);
    ZS(zep);
    ZN(zep);
    ZQ(zep);
    ZU(zep);
    Zb(zep);
    ZO(paramList, zep);
  }
  
  private void ZV(Zep paramZep, long paramLong, List<String> paramList) throws IOException {
    byte[] arrayOfByte = paramZep.Zd((int)paramLong);
    Zep zep = new Zep(new ByteArrayInputStream(arrayOfByte));
    paramList.add(ZS(zep));
  }
  
  private void Zr(Zep paramZep, long paramLong, List<String> paramList) throws IOException {
    byte[] arrayOfByte1 = paramZep.Zd((int)paramLong);
    Zep zep = new Zep(new ByteArrayInputStream(arrayOfByte1));
    boolean bool1 = false;
    boolean bool = Zt2c.ZK();
    byte[] arrayOfByte2 = Zq;
    while (!bool1) {
      int i = zep.ZI();
      if (i >= 128) {
        int j = zep.ZZ();
        arrayOfByte2 = zep.Zd(j);
      } 
      if (i == 0) {
        bool1 = true;
        if (bool)
          continue; 
        continue;
      } 
      continue;
      if (SYNTHETIC_LOCAL_VARIABLE_9 == '') {
        Zep zep1 = new Zep(new ByteArrayInputStream(arrayOfByte2));
        paramList.add(ZS(zep1));
        if (bool)
          break; 
      } 
    } 
  }
  
  private void ZO(List<String> paramList, Zep paramZep) throws IOException {
    int i = paramZep.Zg() - 1;
    byte b = 0;
    boolean bool = Zt2c.ZG();
    while (b < i) {
      int j = paramZep.Zg();
      byte[] arrayOfByte = paramZep.Zd(j);
      paramList.add(new String(arrayOfByte, a(29152, -9776)));
      b++;
      if (!bool)
        break; 
    } 
  }
  
  private void Zb(Zep paramZep) throws IOException {
    int i = paramZep.Zg() - 1;
    byte b = 0;
    boolean bool = Zt2c.ZG();
    while (b < i) {
      paramZep.Zw();
      paramZep.Zw();
      b++;
      if (!bool)
        break; 
    } 
  }
  
  private void ZU(Zep paramZep) throws IOException {
    int i = paramZep.Zg() - 1;
    byte b = 0;
    boolean bool = Zt2c.ZK();
    while (b < i) {
      paramZep.Zg();
      b++;
      if (bool)
        break; 
    } 
  }
  
  private void ZQ(Zep paramZep) throws IOException {
    int i = paramZep.Zg() - 1;
    byte b = 0;
    boolean bool = Zt2c.ZK();
    while (b < i) {
      paramZep.Zg();
      b++;
      if (bool)
        break; 
    } 
  }
  
  private void ZN(Zep paramZep) throws IOException {
    paramZep.ZZ();
    paramZep.ZZ();
  }
  
  private void Zd(Zep paramZep) throws IOException {
    paramZep.Zw();
  }
  
  private String ZS(Zep paramZep) throws IOException {
    boolean bool = Zt2c.ZK();
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    int i;
    while ((i = paramZep.ZI()) != 0) {
      byteArrayOutputStream.write(i);
      if (bool)
        break; 
    } 
    return new String(byteArrayOutputStream.toByteArray(), a(29152, -9776));
  }
  
  private void Za(Zep paramZep) throws IOException {
    paramZep.ZZ();
    paramZep.ZZ();
  }
  
  private void Z_(Zep paramZep) throws IOException {
    int i = paramZep.ZI();
    i >>>= 3;
    int j = i * 4;
    int k = j / 8;
    try {
      if (j % 8 != 0)
        k++; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramZep.Zd(k);
  }
  
  private boolean ZV(byte[] paramArrayOfbyte, Zs68 paramZs68) {
    try {
      if (paramZs68.ZH.Zj == 1026)
        try {
          if (paramArrayOfbyte.length > paramZs68.Zk);
        } catch (Zza zza) {
          throw a(null);
        }  
    } catch (Zza zza) {
      throw a(null);
    } 
    return false;
  }
  
  private void Zi(Zep paramZep) throws IOException {
    paramZep.ZI();
    paramZep.ZI();
    paramZep.ZI();
    paramZep.ZI();
    paramZep.Zw();
  }
  
  private byte[] ZS(byte[] paramArrayOfbyte, int paramInt) throws Zrts {
    // Byte code:
    //   0: invokestatic ZG : ()Z
    //   3: istore_3
    //   4: aload_1
    //   5: iload_2
    //   6: baload
    //   7: bipush #70
    //   9: if_icmpne -> 35
    //   12: aload_1
    //   13: arraylength
    //   14: iload_2
    //   15: isub
    //   16: newarray byte
    //   18: astore #4
    //   20: aload_1
    //   21: iload_2
    //   22: aload #4
    //   24: iconst_0
    //   25: aload_1
    //   26: arraylength
    //   27: iload_2
    //   28: isub
    //   29: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
    //   32: aload #4
    //   34: areturn
    //   35: aload_1
    //   36: iload_2
    //   37: baload
    //   38: bipush #67
    //   40: if_icmpne -> 167
    //   43: new java/util/zip/Inflater
    //   46: dup
    //   47: invokespecial <init> : ()V
    //   50: astore #4
    //   52: aload #4
    //   54: aload_1
    //   55: iload_2
    //   56: bipush #8
    //   58: iadd
    //   59: aload_1
    //   60: arraylength
    //   61: iload_2
    //   62: isub
    //   63: bipush #8
    //   65: isub
    //   66: invokevirtual setInput : ([BII)V
    //   69: sipush #1024
    //   72: newarray byte
    //   74: astore #5
    //   76: new java/io/ByteArrayOutputStream
    //   79: dup
    //   80: invokespecial <init> : ()V
    //   83: astore #6
    //   85: iconst_0
    //   86: istore #7
    //   88: iload #7
    //   90: bipush #8
    //   92: if_icmpge -> 113
    //   95: aload #6
    //   97: aload_1
    //   98: iload_2
    //   99: iload #7
    //   101: iadd
    //   102: baload
    //   103: invokevirtual write : (I)V
    //   106: iinc #7, 1
    //   109: iload_3
    //   110: ifne -> 88
    //   113: aload #4
    //   115: invokevirtual finished : ()Z
    //   118: ifne -> 148
    //   121: aload #4
    //   123: aload #5
    //   125: invokevirtual inflate : ([B)I
    //   128: istore #7
    //   130: aload #6
    //   132: aload #5
    //   134: iconst_0
    //   135: iload #7
    //   137: invokevirtual write : ([BII)V
    //   140: iload #7
    //   142: ifne -> 113
    //   145: goto -> 148
    //   148: goto -> 161
    //   151: astore #8
    //   153: aload #8
    //   155: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   158: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   161: aload #6
    //   163: invokevirtual toByteArray : ()[B
    //   166: areturn
    //   167: new burp/Zrts
    //   170: dup
    //   171: aload_1
    //   172: iload_2
    //   173: baload
    //   174: i2c
    //   175: sipush #29155
    //   178: sipush #821
    //   181: invokestatic a : (II)Ljava/lang/String;
    //   184: swap
    //   185: sipush #29153
    //   188: sipush #-2182
    //   191: invokestatic a : (II)Ljava/lang/String;
    //   194: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;CLjava/lang/String;)Ljava/lang/String;
    //   199: invokespecial <init> : (Ljava/lang/String;)V
    //   202: athrow
    // Exception table:
    //   from	to	target	type
    //   113	148	151	java/util/zip/DataFormatException
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc '}md@o(³Eâ(ÀWæµ)Jsp2Â»2¯ojÕjmÿ<·;P;RÔ´æ·½'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_5
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: iconst_5
    //   22: iinc #0, 1
    //   25: aload_2
    //   26: iload_0
    //   27: dup
    //   28: iload_1
    //   29: iadd
    //   30: invokevirtual substring : (II)Ljava/lang/String;
    //   33: iconst_m1
    //   34: goto -> 138
    //   37: aload #5
    //   39: swap
    //   40: iload_3
    //   41: iinc #3, 1
    //   44: swap
    //   45: aastore
    //   46: iload_0
    //   47: iload_1
    //   48: iadd
    //   49: dup
    //   50: istore_0
    //   51: iload #4
    //   53: if_icmpge -> 65
    //   56: aload_2
    //   57: iload_0
    //   58: invokevirtual charAt : (I)C
    //   61: istore_1
    //   62: goto -> 21
    //   65: ldc '`"ôND'
    //   67: dup
    //   68: astore_2
    //   69: invokevirtual length : ()I
    //   72: istore #4
    //   74: iconst_5
    //   75: istore_1
    //   76: iconst_m1
    //   77: istore_0
    //   78: bipush #20
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
    //   120: goto -> 78
    //   123: aload #5
    //   125: putstatic burp/Zzk0.a : [Ljava/lang/String;
    //   128: iconst_4
    //   129: anewarray java/lang/String
    //   132: putstatic burp/Zzk0.b : [Ljava/lang/String;
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
    //   154: if_icmpgt -> 256
    //   157: dup2
    //   158: swap
    //   159: iload #6
    //   161: dup2_x1
    //   162: caload
    //   163: swap
    //   164: iload #6
    //   166: bipush #7
    //   168: irem
    //   169: tableswitch default -> 238, 0 -> 208, 1 -> 213, 2 -> 218, 3 -> 223, 4 -> 228, 5 -> 233
    //   208: bipush #53
    //   210: goto -> 240
    //   213: bipush #127
    //   215: goto -> 240
    //   218: bipush #117
    //   220: goto -> 240
    //   223: bipush #112
    //   225: goto -> 240
    //   228: bipush #122
    //   230: goto -> 240
    //   233: bipush #60
    //   235: goto -> 240
    //   238: bipush #121
    //   240: ixor
    //   241: ixor
    //   242: i2c
    //   243: castore
    //   244: iinc #6, 1
    //   247: dup
    //   248: ifne -> 256
    //   251: dup2
    //   252: dup_x1
    //   253: goto -> 161
    //   256: dup2_x1
    //   257: pop2
    //   258: dup_x2
    //   259: iload #6
    //   261: if_icmpgt -> 157
    //   264: pop
    //   265: new java/lang/String
    //   268: dup_x1
    //   269: swap
    //   270: invokespecial <init> : ([C)V
    //   273: invokevirtual intern : ()Ljava/lang/String;
    //   276: swap
    //   277: pop
    //   278: swap
    //   279: tableswitch default -> 37, 0 -> 95
    //   296: iconst_0
    //   297: newarray byte
    //   299: putstatic burp/Zzk0.Zq : [B
    //   302: invokestatic ZG : ()Lburp/Zgv9;
    //   305: invokevirtual Zl : ()Lburp/Zs68;
    //   308: putstatic burp/Zzk0.Za : Lburp/Zs68;
    //   311: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x71E2) & 0xFFFF;
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
      byte b1 = 100;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzk0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */