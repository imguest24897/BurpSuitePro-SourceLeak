package burp;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;

public class Zrpd {
  private static final Class[] ZV;
  
  private final InputStream ZW;
  
  private final byte[] ZI;
  
  private boolean ZK;
  
  private List<Object> ZZ;
  
  private String[] Zo;
  
  private int Zs;
  
  private int[] Zy;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zrpd(byte[] paramArrayOfbyte) {
    this.ZI = paramArrayOfbyte;
    this.ZW = new ByteArrayInputStream(paramArrayOfbyte);
  }
  
  private void Zu() {
    this.ZZ = new ArrayList();
    Class[] arrayOfClass = ZV;
    int[] arrayOfInt = Zzlm.ZV();
    int i = arrayOfClass.length;
    byte b = 0;
    while (b < i) {
      Class clazz = arrayOfClass[b];
      ZA(clazz);
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    this.Zo = new String[255];
    this.Zs = 0;
    this.Zy = new int[16];
  }
  
  static boolean Zq(byte[] paramArrayOfbyte) {
    return (paramArrayOfbyte.length > 1 && paramArrayOfbyte[0] == -1 && paramArrayOfbyte[1] == 1);
  }
  
  Zzlm Zr() throws Exception {
    int[] arrayOfInt = Zzlm.ZV();
    try {
      if (Zs() == 255 && Zs() == 1) {
        Zu();
        Zk2x zk2x = Zh();
        boolean bool = false;
        try {
          if (!this.ZK) {
            switch (this.ZW.available()) {
              case 0:
                bool = false;
                try {
                  if (arrayOfInt == null) {
                    Zbqc.Zr(new Zbqc[5]);
                  } else {
                    return new Zzlm((byte)2, zk2x, this.ZK, bool, this.ZI);
                  } 
                } catch (Exception exception) {
                  throw a(null);
                } 
              case 20:
              case 32:
                bool = true;
                try {
                  if (arrayOfInt == null)
                    break; 
                } catch (Exception exception) {
                  throw a(null);
                } 
                return new Zzlm((byte)2, zk2x, this.ZK, bool, this.ZI);
            } 
            this.ZK = true;
          } 
        } catch (Exception exception) {
          throw a(null);
        } 
        return new Zzlm((byte)2, zk2x, this.ZK, bool, this.ZI);
      } 
    } catch (Exception exception) {
      throw a(null);
    } 
    throw new Exception(a(-20883, -4584));
  }
  
  private Zk2x Zh() {
    int[] arrayOfInt = Zzlm.ZV();
    try {
      if (this.ZK)
        return new Zk2x((byte)0, null); 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      Object object3;
      int k;
      Object object2;
      int j;
      Object object1;
      int n;
      Zk2x[] arrayOfZk2x1;
      ArrayList<Zk2x> arrayList;
      String str;
      byte[] arrayOfByte;
      int m;
      Zk2x[] arrayOfZk2x3;
      byte b1;
      Zk2x[] arrayOfZk2x2;
      int i1;
      byte b2;
      Zk2x[] arrayOfZk2x4;
      byte b3;
      int i = this.ZW.read();
      switch (i) {
        case 1:
          return new Zk2x((byte)1, Integer.valueOf(ZQ()));
        case 2:
          return new Zk2x((byte)2, Integer.valueOf(ZH()));
        case 3:
          return new Zk2x((byte)3, Integer.valueOf(Zs()));
        case 4:
          return new Zk2x((byte)4, Character.valueOf((char)Zs()));
        case 5:
          return new Zk2x((byte)5, Zk());
        case 6:
          return new Zk2x((byte)6, Long.valueOf(ZJ()));
        case 7:
          return new Zk2x((byte)7, Double.valueOf(ZV()));
        case 8:
          return new Zk2x((byte)8, Float.valueOf(ZZ()));
        case 9:
          return new Zk2x((byte)9, new Zmuz(Zi(), false));
        case 10:
          return new Zk2x((byte)9, new Zmuz(ZH(), true));
        case 11:
          object3 = Zn();
          n = ZH();
          return new Zk2x((byte)11, new Z_(object3, n));
        case 12:
          return new Zk2x((byte)9, new Zmuz());
        case 15:
          return new Zk2x((byte)15, new Zbl0(Zh(), Zh()));
        case 16:
          return new Zk2x((byte)16, new Zxap(Zh(), Zh(), Zh()));
        case 20:
          object3 = Zn();
          n = ZH();
          arrayOfZk2x3 = new Zk2x[n];
          b2 = 0;
          while (b2 < n) {
            arrayOfZk2x3[b2] = Zh();
            b2++;
            if (arrayOfInt == null)
              break; 
          } 
          return new Zk2x((byte)20, new Zt5g(object3, arrayOfZk2x3));
        case 21:
          k = ZH();
          arrayOfZk2x1 = new Zk2x[k];
          b1 = 0;
          while (b1 < k) {
            arrayOfZk2x1[b1] = new Zk2x((byte)5, Zk());
            b1++;
            if (arrayOfInt == null)
              break; 
          } 
          return new Zk2x((byte)20, new Zt5g(String.class, arrayOfZk2x1));
        case 22:
          k = ZH();
          arrayList = new ArrayList(k);
          b1 = 0;
          while (b1 < k) {
            try {
              if (!this.ZK) {
                arrayList.add(Zh());
                b1++;
                if (arrayOfInt == null)
                  break; 
              } 
            } catch (Exception exception) {
              throw a(null);
            } 
          } 
          return new Zk2x((byte)22, arrayList);
        case 23:
        case 24:
          k = ZH();
          arrayList = new ArrayList<>(k);
          b1 = 0;
          while (b1 < k) {
            arrayList.add(new Zk2x((byte)126, new Zk2x[] { Zh(), Zh() }));
            b1++;
            if (arrayOfInt == null)
              break; 
          } 
          arrayOfZk2x2 = new Zk2x[arrayList.size()];
          arrayList.toArray(arrayOfZk2x2);
          return new Zk2x(127, arrayOfZk2x2);
        case 25:
          return new Zk2x((byte)25, Zn());
        case 27:
          return new Zk2x((byte)27, new Zg_7(ZV(), (byte)Zi()));
        case 28:
          return new Zk2x((byte)27, new Zg_7(0.0D, (byte)0));
        case 30:
        case 31:
          return new Zk2x((byte)5, Zq(i));
        case 40:
          object2 = Zn();
          str = Zk();
          return (object2 != null) ? new Zk2x((byte)50, new Zb8h(Zkb.Zy(str))) : new Zk2x((byte)100, null);
        case 50:
          j = ZH();
          arrayOfByte = new byte[j];
          this.ZW.read(arrayOfByte, 0, j);
          return new Zk2x((byte)50, new Zb8h(arrayOfByte));
        case 60:
          object1 = Zn();
          m = ZH();
          i1 = ZH();
          try {
            if (i1 > m)
              throw new Exception(a(-20884, 26220)); 
          } catch (Exception exception) {
            throw a(null);
          } 
          arrayOfZk2x4 = new Zk2x[m];
          b3 = 0;
          while (b3 < m) {
            arrayOfZk2x4[b3] = new Zk2x((byte)100, null);
            b3++;
            if (arrayOfInt == null)
              break; 
          } 
          b3 = 0;
          while (b3 < i1 && !this.ZK) {
            int i2 = ZH();
            try {
              if (i2 < m)
                try {
                  if (i2 >= 0) {
                    arrayOfZk2x4[i2] = Zh();
                    b3++;
                    if (arrayOfInt == null)
                      break; 
                    continue;
                  } 
                  throw new Exception(a(-20881, -11075));
                } catch (Exception exception) {
                  throw a(null);
                }  
            } catch (Exception exception) {
              throw a(null);
            } 
            throw new Exception(a(-20881, -11075));
          } 
          return new Zk2x((byte)20, new Zt5g(object1, arrayOfZk2x4));
        case 100:
          return new Zk2x((byte)100, null);
        case 101:
          return new Zk2x((byte)5, "");
        case 102:
          return new Zk2x((byte)2, Integer.valueOf(0));
        case 103:
          return new Zk2x((byte)103, Boolean.valueOf(true));
        case 104:
          return new Zk2x((byte)103, Boolean.valueOf(false));
      } 
      a(-20886, 23043);
      throw new Exception(a(-20886, 23043) + a(-20886, 23043) + i + a(-20888, -7845) + Integer.toString(i, 16));
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
      this.ZK = true;
      return new Zk2x((byte)0, null);
    } 
  }
  
  private int Zs() throws Exception {
    int i = this.ZW.read();
    try {
      if (i == -1)
        throw new Exception(a(-20882, -9626)); 
    } catch (Exception exception) {
      throw a(null);
    } 
    return i;
  }
  
  public int ZQ() throws Exception {
    ZL(2);
    return (short)(this.Zy[0] | this.Zy[1] << 8);
  }
  
  private int Zi() throws Exception {
    ZL(4);
    return this.Zy[0] | this.Zy[1] << 8 | this.Zy[2] << 16 | this.Zy[3] << 24;
  }
  
  private int ZH() throws Exception {
    return Zx();
  }
  
  private int Zx() throws Exception {
    int i = 0;
    byte b = 0;
    while (true) {
      if (b == 35)
        throw new Exception(a(-20887, -8255)); 
      byte b1 = (byte)Zs();
      i |= (b1 & Byte.MAX_VALUE) << b;
      b += 7;
      if ((b1 & 0x80) == 0)
        return i; 
    } 
  }
  
  private long ZJ() throws Exception {
    ZL(8);
    long l1 = 0xFFFFFFFFL & (this.Zy[0] | this.Zy[1] << 8 | this.Zy[2] << 16 | this.Zy[3] << 24);
    long l2 = 0xFFFFFFFFL & (this.Zy[4] | this.Zy[5] << 8 | this.Zy[6] << 16 | this.Zy[7] << 24);
    return l2 << 32L | l1;
  }
  
  private double ZV() throws Exception {
    return Double.longBitsToDouble(ZJ());
  }
  
  private float ZZ() throws Exception {
    ZL(4);
    int i = this.Zy[0] | this.Zy[1] << 8 | this.Zy[2] << 16 | this.Zy[3] << 24;
    return Float.intBitsToFloat(i);
  }
  
  private String Zk() throws Exception {
    int i = Zx();
    try {
      if (i < 0)
        throw new Exception(a(-20885, -16625)); 
    } catch (Exception exception) {
      throw a(null);
    } 
    try {
      if (i == 0)
        return ""; 
    } catch (Exception exception) {
      throw a(null);
    } 
    byte[] arrayOfByte = new byte[i];
    this.ZW.read(arrayOfByte, 0, i);
    return Zkb.ZG(arrayOfByte);
  }
  
  private Object Zn() throws Exception {
    int i = Zs();
    if (i == 43) {
      int j = ZH();
      return this.ZZ.get(j);
    } 
    String str = Zk();
    Zxxa zxxa = new Zxxa(str);
    ZA(zxxa);
    return zxxa;
  }
  
  String Zq(int paramInt) throws Exception {
    if (paramInt == 31) {
      int i = Zs();
      return this.Zo[i];
    } 
    String str = Zk();
    ZT(str);
    return str;
  }
  
  private void ZA(Object paramObject) {
    this.ZZ.add(paramObject);
  }
  
  private void ZT(String paramString) {
    if (this.Zs == 255)
      this.Zs = 0; 
    this.Zo[this.Zs] = paramString;
    this.Zs++;
  }
  
  private void ZL(int paramInt) throws Exception {
    byte b = 0;
    do {
      this.Zy[b++] = Zs();
    } while (b < paramInt);
  }
  
  static {
    // Byte code:
    //   0: bipush #8
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'âp¤WÍ2°ó/)ó\\tÐÁäÍà"7 ÌèKÆ\Y|fiC'ÎT±3AË|¥Ð¿]C|<4ÞÅñö¨é¡æ]«Ü·rTJ}ÔFÊ´\\fûëUë\\rN±|ÌÓ¥ç@§SçÖÍ\\bb4¾. [O¼}é«PÆ,'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #20
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #75
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
    //   68: ldc 'E\\fù`cz@¼HØ£òCU«²"âøD÷ÏÚÇ®¸¦»À&®¾f¤\\f}l¦Ro¿2'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #21
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #79
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
    //   129: putstatic burp/Zrpd.a : [Ljava/lang/String;
    //   132: bipush #8
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zrpd.b : [Ljava/lang/String;
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
    //   212: bipush #40
    //   214: goto -> 244
    //   217: bipush #72
    //   219: goto -> 244
    //   222: bipush #27
    //   224: goto -> 244
    //   227: bipush #21
    //   229: goto -> 244
    //   232: bipush #71
    //   234: goto -> 244
    //   237: bipush #127
    //   239: goto -> 244
    //   242: bipush #122
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
    //   300: iconst_4
    //   301: anewarray java/lang/Class
    //   304: dup
    //   305: iconst_0
    //   306: ldc java/lang/Object
    //   308: aastore
    //   309: dup
    //   310: iconst_1
    //   311: ldc java/lang/Integer
    //   313: aastore
    //   314: dup
    //   315: iconst_2
    //   316: ldc java/lang/String
    //   318: aastore
    //   319: dup
    //   320: iconst_3
    //   321: ldc java/lang/Boolean
    //   323: aastore
    //   324: putstatic burp/Zrpd.ZV : [Ljava/lang/Class;
    //   327: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFAE6A) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrpd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */