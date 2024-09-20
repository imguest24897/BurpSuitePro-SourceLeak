package burp;

import java.awt.Component;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Stream;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zzln {
  private final Ztwv ZR;
  
  private final Ztq1 ZD;
  
  private final Zemk Zh;
  
  private final Zr_r Zi;
  
  private final Zed0 ZB;
  
  private final Supplier<List<Zryx>> Za;
  
  private final Runnable ZN;
  
  private final Component Zy;
  
  private final AtomicBoolean Zq;
  
  private final Function<Integer, Integer> ZA;
  
  private final Zr4m ZE;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zzln(Ztwv paramZtwv, Ztq1 paramZtq1, Zemk paramZemk, Zr_r paramZr_r, Zed0 paramZed0, Supplier<List<Zryx>> paramSupplier, Consumer<List<Zmz9>> paramConsumer, Runnable paramRunnable, Function<Integer, Integer> paramFunction, Component paramComponent, Zr4m paramZr4m) {
    this.ZR = paramZtwv;
    this.ZD = paramZtq1;
    this.Zh = paramZemk;
    this.ZB = paramZed0;
    this.Za = paramSupplier;
    this.Zi = paramZr_r;
    this.ZN = paramRunnable;
    this.ZA = paramFunction;
    this.Zy = paramComponent;
    this.ZE = paramZr4m;
    this.Zq = new AtomicBoolean();
    Objects.requireNonNull(paramConsumer);
    paramZemk.ZF(paramConsumer::accept);
  }
  
  boolean Zn() {
    List<Zryx> list = this.Za.get();
    try {
      if (list != null)
        try {
          if (!list.isEmpty()) {
            try {
            
            } catch (Ze4p ze4p) {
              throw a(null);
            } 
            String str = (list.size() == 1) ? a(-6882, 20524).formatted(new Object[] { ((Zryx)list.get(0)).Zm() }) : a(-6881, -21626).formatted(new Object[] { Integer.valueOf(list.size()) });
            try {
              if (Zx6o.ZY(this.Zy, str)) {
                this.Zh.ZN(list);
                return true;
              } 
            } catch (Ze4p ze4p) {
              throw a(null);
            } 
            return false;
          } 
          return false;
        } catch (Ze4p ze4p) {
          throw a(null);
        }  
    } catch (Ze4p ze4p) {
      throw a(null);
    } 
    return false;
  }
  
  void Zp() {
    File[] arrayOfFile = Zs6n.Zp(Zg1m.BCHECK_SCRIPTS, this.Zy, a(-6887, -2709), new Zgd1(), Zlfc.FILES_AND_DIRECTORIES);
    try {
      if (arrayOfFile == null)
        return; 
    } catch (Ze4p ze4p) {
      throw a(null);
    } 
    List<Path> list = Arrays.<File>stream(arrayOfFile).map(File::toPath).toList();
    ZS(list);
  }
  
  boolean ZK() {
    // Byte code:
    //   0: invokestatic ZH : ()Ljava/lang/String;
    //   3: astore_1
    //   4: aload_0
    //   5: getfield Za : Ljava/util/function/Supplier;
    //   8: invokeinterface get : ()Ljava/lang/Object;
    //   13: checkcast java/util/List
    //   16: astore_2
    //   17: aload_2
    //   18: ifnull -> 37
    //   21: aload_2
    //   22: invokeinterface isEmpty : ()Z
    //   27: ifeq -> 43
    //   30: goto -> 37
    //   33: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   36: athrow
    //   37: iconst_0
    //   38: ireturn
    //   39: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   42: athrow
    //   43: aload_2
    //   44: invokeinterface size : ()I
    //   49: iconst_1
    //   50: if_icmpne -> 75
    //   53: aload_0
    //   54: aload_0
    //   55: aload_2
    //   56: <illegal opcode> get : (Lburp/Zzln;Ljava/util/List;)Ljava/util/function/Supplier;
    //   61: invokevirtual Zd : (Ljava/util/function/Supplier;)V
    //   64: aload_1
    //   65: ifnull -> 93
    //   68: goto -> 75
    //   71: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   74: athrow
    //   75: aload_0
    //   76: aload_0
    //   77: aload_2
    //   78: <illegal opcode> get : (Lburp/Zzln;Ljava/util/List;)Ljava/util/function/Supplier;
    //   83: invokevirtual Zd : (Ljava/util/function/Supplier;)V
    //   86: goto -> 93
    //   89: invokestatic a : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   92: athrow
    //   93: iconst_1
    //   94: ireturn
    // Exception table:
    //   from	to	target	type
    //   17	30	33	burp/Ze4p
    //   21	39	39	burp/Ze4p
    //   43	68	71	burp/Ze4p
    //   53	86	89	burp/Ze4p
  }
  
  private void Zd(Supplier<Integer> paramSupplier) {
    try {
      int i = ((Integer)paramSupplier.get()).intValue();
      try {
        if (i > 0) {
          try {
          
          } catch (Ze4p ze4p) {
            throw a(null);
          } 
          String str = (i > 1) ? a(-6889, 6971) : a(-6891, -1398);
          Zx6o.Zf(this.Zy, a(-6892, 8438), a(-6883, 30845).formatted(new Object[] { Integer.valueOf(i), str }));
        } 
      } catch (Ze4p ze4p) {
        throw a(null);
      } 
    } catch (Ze4p ze4p) {
      Zah.Zl((Throwable)ze4p, Zk_.RETHROWN);
      Zx6o.Zt(this.Zy, a(-6896, 10980), ze4p.getMessage());
    } 
  }
  
  boolean Ze() {
    return this.Zq.get();
  }
  
  boolean ZU(boolean paramBoolean) {
    List<Zryx> list = this.Za.get();
    try {
      if (list != null)
        try {
          if (!list.isEmpty()) {
            ZP(list, paramBoolean);
            return true;
          } 
          return false;
        } catch (Ze4p ze4p) {
          throw a(null);
        }  
    } catch (Ze4p ze4p) {
      throw a(null);
    } 
    return false;
  }
  
  void Zu(int paramInt) {
    int i = ((Integer)this.ZA.apply(Integer.valueOf(paramInt))).intValue();
    Zryx zryx = this.Zh.Zm(i);
    try {
    
    } catch (Ze4p ze4p) {
      throw a(null);
    } 
    ZP(Collections.singletonList(zryx), !zryx.Zl());
  }
  
  public boolean Zk() {
    List<Zmo3> list = (List)this.Za.get();
    try {
      if (list != null)
        try {
          if (!list.isEmpty()) {
            try {
            
            } catch (Ze4p ze4p) {
              throw a(null);
            } 
            Zuh.Zb((list.size() == 1), Zqf.Zr);
            this.ZB.Zn(Zt2m.ZF(this.Zy), list.get(0));
            return true;
          } 
          return false;
        } catch (Ze4p ze4p) {
          throw a(null);
        }  
    } catch (Ze4p ze4p) {
      throw a(null);
    } 
    return false;
  }
  
  boolean ZJ() {
    List list = this.Za.get();
    try {
      if (list != null)
        try {
          if (!list.isEmpty()) {
            List<Zryx> list1 = list.stream().map(this::lambda$duplicateSelectedScripts$2).toList();
            this.Zh.Za(list1);
            return true;
          } 
          return false;
        } catch (Ze4p ze4p) {
          throw a(null);
        }  
    } catch (Ze4p ze4p) {
      throw a(null);
    } 
    return false;
  }
  
  private String Zg(Zryx paramZryx) {
    byte b = 1;
    String str2 = paramZryx.Zm() + paramZryx.Zm();
    String str1 = Zbve.ZH();
    while (this.Zh.Ze(str2) != null) {
      str2 = a(-6890, -22902).formatted(new Object[] { paramZryx.Zm(), Integer.valueOf(++b) });
      if (str1 != null)
        break; 
    } 
    return str2;
  }
  
  private void ZP(List<Zryx> paramList, boolean paramBoolean) {
    List<Zryx> list = paramList.stream().filter(Zmo3::Zb).map(paramBoolean::lambda$setEnabled$3).toList();
    this.Zh.Za(list);
  }
  
  private void ZS(List<Path> paramList) {
    // Byte code:
    //   0: aload_0
    //   1: aload_0
    //   2: aload_1
    //   3: <illegal opcode> run : (Lburp/Zzln;Ljava/util/List;)Ljava/lang/Runnable;
    //   8: invokevirtual Zq : (Ljava/lang/Runnable;)V
    //   11: return
  }
  
  private void Zm(List<Path> paramList) {
    Objects.requireNonNull(this.ZD);
    List<Zryx> list = paramList.stream().map(this::Zd).flatMap(Collection::stream).map(this.ZD::ZI).toList();
    this.Zh.Za(list);
  }
  
  private List<Path> Zd(Path paramPath) {
    try {
      if (Files.isRegularFile(paramPath, new java.nio.file.LinkOption[0]))
        return List.of(paramPath); 
    } catch (Throwable throwable) {
      throw a(null);
    } 
    try {
      Stream<Path> stream = Files.walk(paramPath, 1, new java.nio.file.FileVisitOption[0]);
      try {
        List<Path> list = stream.filter(Zzln::lambda$getRegularFiles$5).sorted(Comparator.comparing(Path::getFileName)).toList();
        try {
          if (stream != null)
            stream.close(); 
        } catch (Throwable throwable) {
          throw a(null);
        } 
        return list;
      } catch (Throwable throwable) {
        if (stream != null)
          try {
            stream.close();
          } catch (Throwable throwable1) {
            throwable.addSuppressed(throwable1);
          }  
        throw throwable;
      } 
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.UNEXPECTED);
      Zrhk zrhk = Zxxy.ZZ(this.Zy).ZB(a(-6884, 4951)).ZF(iOException.getMessage()).ZN();
      zrhk.Zn();
      return Collections.emptyList();
    } 
  }
  
  private void Zq(Runnable paramRunnable) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZR : Lburp/Ztwv;
    //   4: aload_0
    //   5: aload_1
    //   6: <illegal opcode> run : (Lburp/Zzln;Ljava/lang/Runnable;)Ljava/lang/Runnable;
    //   11: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   16: pop
    //   17: return
  }
  
  private void lambda$process$6(Runnable paramRunnable) {
    this.Zq.set(true);
    this.ZN.run();
    try {
      paramRunnable.run();
    } finally {
      this.Zq.set(false);
      this.ZN.run();
    } 
  }
  
  private static boolean lambda$getRegularFiles$5(Path paramPath) {
    return Files.isRegularFile(paramPath, new java.nio.file.LinkOption[0]);
  }
  
  private void lambda$importScriptsFromPathsAsynchronously$4(List<Path> paramList) {
    Zm(paramList);
  }
  
  private static Zryx lambda$setEnabled$3(boolean paramBoolean, Zryx paramZryx) {
    return paramZryx.ZF().Zd(paramBoolean).Zr();
  }
  
  private Zryx lambda$duplicateSelectedScripts$2(Zryx paramZryx) {
    String str = Zg(paramZryx);
    return paramZryx.ZF().ZW(0).Zf(str).Zl(null).Zd(false).Za(paramZryx.Zs().replaceAll(a(-6886, 26091), a(-6888, -6500).formatted(new Object[] { str }))).Zr();
  }
  
  private Integer lambda$exportSelectedScriptsToDisk$1(List<Zryx> paramList) {
    return Integer.valueOf(this.Zi.Zj(paramList, this.ZE.ZD()));
  }
  
  private Integer lambda$exportSelectedScriptsToDisk$0(List<Zryx> paramList) {
    return Integer.valueOf(this.Zi.Zv(paramList.get(0), this.ZE.Zy()));
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  static {
    // Byte code:
    //   0: bipush #13
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'QÙÀ#\\b¨øtüB#þ´\\t,Päryÿ1Wq¯8Ã¥öõERðO^4j$ÓÔ%LÄÈÄ]²0«Xì\\tõ{fð[E¬iù 5ÈMØQ+mHk=Ô¸_epQPY)´û&òN¿¤6øëq³|Ë'¥y q\\nH®\\ro»kM\\bÀAÂ´;¶¸k¿±û1z½EòC'b &~51<ÃyÒÝýË\\f³=r¦^ÏRÙ¤° <WXÝï\X§°\\n0¹mû&kpm'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #17
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #96
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
    //   68: ldc '21/PMh*Ú¿³Æ`Ð\\tj;¥ÀTlLß$O'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #7
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #36
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
    //   129: putstatic burp/Zzln.a : [Ljava/lang/String;
    //   132: bipush #13
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zzln.b : [Ljava/lang/String;
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
    //   212: bipush #14
    //   214: goto -> 244
    //   217: bipush #61
    //   219: goto -> 244
    //   222: bipush #103
    //   224: goto -> 244
    //   227: bipush #89
    //   229: goto -> 244
    //   232: bipush #96
    //   234: goto -> 244
    //   237: bipush #40
    //   239: goto -> 244
    //   242: bipush #92
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
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE51C) & 0xFFFF;
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
      byte b1 = 33;
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzln.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */