package burp;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Ztnt extends Ztn0 {
  private static final String[] Zp;
  
  private static final byte[] ZX;
  
  private static final int[] Zz;
  
  private final Map<String, Zkjm> Zm;
  
  private final Zefg<Zlwo> ZU;
  
  private final Lock ZR;
  
  private final Lock ZE;
  
  private final Zr_4 Zw;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Ztnt(Zelo paramZelo, Zr_4 paramZr_4) {
    this.Zw = paramZr_4;
    this.ZU = paramZelo.ZR9();
    this.Zm = new HashMap<>();
    int i = Zkjm.Zg();
    for (Zlwo zlwo : this.ZU) {
      if (zlwo.Zfe().Zkv())
        this.Zm.put(zlwo.Zfn(), ZV(zlwo)); 
      if (i != 0)
        break; 
    } 
    this.Zf = Zp;
    this.ZV = ZX;
    this.Zc = Zz;
    this.ZD = new RowSorter.SortKey(1, SortOrder.ASCENDING);
    this.ZZ = 4;
    ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
    this.ZR = reentrantReadWriteLock.readLock();
    this.ZE = reentrantReadWriteLock.writeLock();
    if (Zbqc.Zwu() == null)
      Zkjm.Zg(++i); 
  }
  
  public List<Zr6v> Zs() {
    try {
      this.ZR.lock();
      return this.ZU.stream().map(Ztnt::lambda$getServerAuthCredentialsList$0).toList();
    } finally {
      this.ZR.unlock();
    } 
  }
  
  public int getRowCount() {
    try {
      this.ZR.lock();
      return this.ZU.size();
    } finally {
      this.ZR.unlock();
    } 
  }
  
  public Object getValueAt(int paramInt1, int paramInt2) {
    try {
      Boolean bool;
      String str;
      this.ZR.lock();
      Zlwo zlwo = this.ZU.get(paramInt1);
      Zxp8 zxp8 = zlwo.Zfe();
      switch (paramInt2) {
        case 0:
          return Boolean.valueOf(zxp8.Zkv());
        case 1:
          str = zlwo.Zfn();
          return str;
        case 2:
          try {
            switch (zxp8.Zk0()) {
              case 1:
              
              case 2:
              
              case 3:
              
            } 
          } catch (Throwable throwable) {
            throw a(null);
          } 
          str = "";
          return str;
        case 3:
          str = zxp8.Zkh();
          return str;
        case 4:
          str = zxp8.Zkg();
          return str;
        case 5:
          str = zxp8.ZkQ();
          return str;
      } 
    } catch (Throwable throwable) {
      Zah.Zl(throwable, Zk_.UNEXPECTED);
    } finally {
      this.ZR.unlock();
    } 
    return "";
  }
  
  public void Zu(String paramString, Zkjm paramZkjm) {
    try {
      this.ZE.lock();
      ZK(paramString, paramZkjm);
    } finally {
      this.ZE.unlock();
    } 
    fireTableDataChanged();
  }
  
  public Zkjm Zz(String paramString) {
    try {
      this.ZR.lock();
      return this.Zm.get(paramString);
    } finally {
      this.ZR.unlock();
    } 
  }
  
  public Zr6v Zw(int paramInt) {
    try {
      this.ZR.lock();
      Zlwo zlwo = this.ZU.get(paramInt);
      return new Zr6v(zlwo.Zfn(), ZV(this.ZU.get(paramInt)));
    } finally {
      this.ZR.unlock();
    } 
  }
  
  public void ZL(int paramInt) {
    try {
      this.ZE.lock();
      Zlwo zlwo = this.ZU.remove(paramInt);
      this.Zm.remove(zlwo.Zfn());
    } finally {
      this.ZE.unlock();
    } 
    fireTableRowsDeleted(paramInt, paramInt);
  }
  
  public void ZK(int paramInt, String paramString, Zkjm paramZkjm) {
    try {
      this.ZE.lock();
      Zlwo zlwo = this.ZU.get(paramInt);
      Zxp8 zxp8 = zlwo.Zfe();
      if (zxp8.Zkv())
        this.Zm.remove(zlwo.Zfn()); 
      if (paramZkjm.Zr()) {
        this.Zm.put(paramString, paramZkjm);
        Zl(paramString, paramInt);
      } 
      zlwo.Zbd(paramString);
      zlwo.ZL(paramZkjm.ZF());
    } finally {
      this.ZE.unlock();
    } 
    fireTableDataChanged();
  }
  
  public void ZJ(int paramInt) {
    // Byte code:
    //   0: invokestatic ZG : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: getfield ZE : Ljava/util/concurrent/locks/Lock;
    //   8: invokeinterface lock : ()V
    //   13: aload_0
    //   14: getfield ZU : Lburp/Zefg;
    //   17: iload_1
    //   18: invokeinterface get : (I)Ljava/lang/Object;
    //   23: checkcast burp/Zlwo
    //   26: astore_3
    //   27: aload_3
    //   28: invokeinterface Zfq : ()V
    //   33: aload_3
    //   34: invokeinterface Zfe : ()Lburp/Zxp8;
    //   39: invokeinterface Zkv : ()Z
    //   44: ifeq -> 82
    //   47: aload_0
    //   48: getfield Zm : Ljava/util/Map;
    //   51: aload_3
    //   52: invokeinterface Zfn : ()Ljava/lang/String;
    //   57: aload_3
    //   58: invokestatic ZV : (Lburp/Zlwo;)Lburp/Zkjm;
    //   61: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   66: pop
    //   67: aload_0
    //   68: aload_3
    //   69: invokeinterface Zfn : ()Ljava/lang/String;
    //   74: iload_1
    //   75: invokevirtual Zl : (Ljava/lang/String;I)V
    //   78: iload_2
    //   79: ifne -> 98
    //   82: aload_0
    //   83: getfield Zm : Ljava/util/Map;
    //   86: aload_3
    //   87: invokeinterface Zfn : ()Ljava/lang/String;
    //   92: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   97: pop
    //   98: aload_0
    //   99: getfield ZE : Ljava/util/concurrent/locks/Lock;
    //   102: invokeinterface unlock : ()V
    //   107: goto -> 124
    //   110: astore #4
    //   112: aload_0
    //   113: getfield ZE : Ljava/util/concurrent/locks/Lock;
    //   116: invokeinterface unlock : ()V
    //   121: aload #4
    //   123: athrow
    //   124: aload_0
    //   125: invokevirtual fireTableDataChanged : ()V
    //   128: return
    // Exception table:
    //   from	to	target	type
    //   4	98	110	finally
  }
  
  public void ZF(List<Zr6v> paramList) {
    try {
      this.ZE.lock();
      this.Zm.clear();
      this.ZU.clear();
      paramList.forEach(this::lambda$replaceAll$1);
    } finally {
      this.ZE.unlock();
    } 
    fireTableDataChanged();
  }
  
  private void ZK(String paramString, Zkjm paramZkjm) {
    if (paramZkjm.Zn() == 4)
      return; 
    if (paramZkjm.Zr()) {
      this.Zm.put(paramString, paramZkjm);
      this.ZU.stream().filter(paramString::lambda$insertItem$2).forEach(Ztnt::lambda$insertItem$3);
    } 
    Zlwo zlwo = this.Zw.<Zlwo>ZH(new Zrsa());
    zlwo.Zbd(paramString);
    zlwo.ZL(paramZkjm.ZF());
    this.ZU.add(zlwo);
  }
  
  private void Zl(String paramString, int paramInt) {
    int i = Zkjm.Zg();
    byte b = 0;
    while (b < this.ZU.size()) {
      Zlwo zlwo = this.ZU.get(b);
      if (b != paramInt && zlwo.Zfn().equals(paramString))
        zlwo.Zfe().ZzN(false); 
      b++;
      if (i != 0)
        break; 
    } 
  }
  
  private static Zkjm ZV(Zlwo paramZlwo) {
    Zxp8 zxp8 = paramZlwo.Zfe();
    Zm4r zm4r = new Zm4r(zxp8.ZkR(), a(1811, -3903), paramZlwo.Zfn(), zxp8.Zkh());
    return new Zkjm(zxp8, zm4r);
  }
  
  private static void lambda$insertItem$3(Zlwo paramZlwo) {
    paramZlwo.Zfe().ZzN(false);
  }
  
  private static boolean lambda$insertItem$2(String paramString, Zlwo paramZlwo) {
    return paramZlwo.Zfn().equals(paramString);
  }
  
  private void lambda$replaceAll$1(Zr6v paramZr6v) {
    ZK(paramZr6v.ZE(), paramZr6v.ZO());
  }
  
  private static Zr6v lambda$getServerAuthCredentialsList$0(Zlwo paramZlwo) {
    return new Zr6v(paramZlwo.Zfn(), ZV(paramZlwo));
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ìèßÑý°@Ïö^µr£h[Õaµ¨s£¥o}^ºSÎ|E}äÓåØßî0pµ.{ïð`ît'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_5
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: iconst_4
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 141
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
    //   66: ldc 'G\\f£c²W¸ÂðôXÔøbð nÜN\\rÂLC,®@J'
    //   68: dup
    //   69: astore_2
    //   70: invokevirtual length : ()I
    //   73: istore #4
    //   75: bipush #8
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #26
    //   82: iinc #0, 1
    //   85: aload_2
    //   86: iload_0
    //   87: dup
    //   88: iload_1
    //   89: iadd
    //   90: invokevirtual substring : (II)Ljava/lang/String;
    //   93: iconst_0
    //   94: goto -> 141
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
    //   127: putstatic burp/Ztnt.a : [Ljava/lang/String;
    //   130: bipush #10
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Ztnt.b : [Ljava/lang/String;
    //   138: goto -> 300
    //   141: dup_x2
    //   142: pop
    //   143: invokevirtual toCharArray : ()[C
    //   146: dup_x1
    //   147: arraylength
    //   148: dup_x2
    //   149: pop
    //   150: iconst_0
    //   151: istore #6
    //   153: dup2_x1
    //   154: pop2
    //   155: dup_x2
    //   156: iconst_1
    //   157: if_icmpgt -> 260
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #94
    //   214: goto -> 244
    //   217: bipush #103
    //   219: goto -> 244
    //   222: bipush #67
    //   224: goto -> 244
    //   227: bipush #56
    //   229: goto -> 244
    //   232: bipush #80
    //   234: goto -> 244
    //   237: bipush #56
    //   239: goto -> 244
    //   242: bipush #115
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 164
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 160
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 38, 0 -> 97
    //   300: bipush #6
    //   302: anewarray java/lang/String
    //   305: dup
    //   306: iconst_0
    //   307: sipush #1821
    //   310: sipush #-30233
    //   313: invokestatic a : (II)Ljava/lang/String;
    //   316: aastore
    //   317: dup
    //   318: iconst_1
    //   319: sipush #1817
    //   322: sipush #16760
    //   325: invokestatic a : (II)Ljava/lang/String;
    //   328: aastore
    //   329: dup
    //   330: iconst_2
    //   331: sipush #1823
    //   334: sipush #26437
    //   337: invokestatic a : (II)Ljava/lang/String;
    //   340: aastore
    //   341: dup
    //   342: iconst_3
    //   343: sipush #1810
    //   346: sipush #-21762
    //   349: invokestatic a : (II)Ljava/lang/String;
    //   352: aastore
    //   353: dup
    //   354: iconst_4
    //   355: sipush #1820
    //   358: sipush #6605
    //   361: invokestatic a : (II)Ljava/lang/String;
    //   364: aastore
    //   365: dup
    //   366: iconst_5
    //   367: sipush #1822
    //   370: sipush #-19737
    //   373: invokestatic a : (II)Ljava/lang/String;
    //   376: aastore
    //   377: putstatic burp/Ztnt.Zp : [Ljava/lang/String;
    //   380: bipush #6
    //   382: newarray byte
    //   384: dup
    //   385: iconst_0
    //   386: iconst_3
    //   387: bastore
    //   388: dup
    //   389: iconst_1
    //   390: iconst_0
    //   391: bastore
    //   392: dup
    //   393: iconst_2
    //   394: iconst_0
    //   395: bastore
    //   396: dup
    //   397: iconst_3
    //   398: iconst_0
    //   399: bastore
    //   400: dup
    //   401: iconst_4
    //   402: iconst_0
    //   403: bastore
    //   404: dup
    //   405: iconst_5
    //   406: iconst_0
    //   407: bastore
    //   408: putstatic burp/Ztnt.ZX : [B
    //   411: bipush #6
    //   413: newarray int
    //   415: dup
    //   416: iconst_0
    //   417: bipush #10
    //   419: iastore
    //   420: dup
    //   421: iconst_1
    //   422: bipush #25
    //   424: iastore
    //   425: dup
    //   426: iconst_2
    //   427: bipush #12
    //   429: iastore
    //   430: dup
    //   431: iconst_3
    //   432: bipush #10
    //   434: iastore
    //   435: dup
    //   436: iconst_4
    //   437: bipush #10
    //   439: iastore
    //   440: dup
    //   441: iconst_5
    //   442: bipush #18
    //   444: iastore
    //   445: putstatic burp/Ztnt.Zz : [I
    //   448: return
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x71A) & 0xFFFF;
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
      byte b1 = 82;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztnt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */