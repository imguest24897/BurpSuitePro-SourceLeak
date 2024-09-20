package burp;

import java.util.Set;
import java.util.stream.Collectors;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zz7n {
  private final Zbnt ZJ;
  
  private final Zzba Zd;
  
  private final Zz28 ZK;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zz7n(Zbnt paramZbnt, int paramInt, Zr69 paramZr69) {
    this.ZJ = paramZbnt;
    this.Zd = new Zzba(paramInt);
    this.ZK = paramZr69;
  }
  
  public void Zi(Zt5r paramZt5r, Set<Zszw> paramSet) {
    Zt8i zt8i = paramZt5r.ZL();
    int i = paramZt5r.Zj();
    Zrp0 zrp0 = zt8i.Zsg();
    String[] arrayOfString = Zrnc.ZD();
    Zeu9 zeu9 = zt8i.Zsu();
    Zszw zszw1 = zt8i.ZsJ();
    Zszw zszw2 = zt8i.ZsU();
    Zlru zlru = zt8i.ZsD();
    Zzxz zzxz = zt8i.ZsL();
    try {
    
    } catch (MatchException matchException) {
      throw a(null);
    } 
    try {
      Zuh.Zb((zeu9 != null), Zqf.Zk);
      if (zeu9 != null)
        try {
          if (!(zrp0 instanceof Zm72))
            try {
              if (!Zq(zrp0, zeu9)) {
                ZK(i, zrp0, zeu9, zlru, zszw1, zszw2, paramSet, zzxz.Zqe(), true);
                for (Ztrm ztrm : zzxz.ZqX()) {
                  ZK(i, zrp0, zeu9, zlru, zszw1, zszw2, paramSet, ztrm, false);
                  if (arrayOfString == null)
                    break; 
                } 
                try {
                  if (Zbqc.Zwu() == null)
                    Zrnc.Ze(new String[3]); 
                } catch (MatchException matchException) {
                  throw a(null);
                } 
                return;
              } 
              return;
            } catch (MatchException matchException) {
              throw a(null);
            }  
        } catch (MatchException matchException) {
          throw a(null);
        }  
    } catch (MatchException matchException) {
      throw a(null);
    } 
  }
  
  private void ZK(int paramInt, Zrp0 paramZrp0, Zeu9 paramZeu9, Zlru paramZlru, Zszw paramZszw1, Zszw paramZszw2, Set<Zszw> paramSet, Ztrm paramZtrm, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZD : ()[Ljava/lang/String;
    //   3: astore #10
    //   5: aload #8
    //   7: invokeinterface Zo : ()Z
    //   12: ifeq -> 20
    //   15: return
    //   16: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   19: athrow
    //   20: aload_0
    //   21: aload #8
    //   23: iload #9
    //   25: aload_3
    //   26: invokevirtual ZU : (Lburp/Ztrm;ZLburp/Zeu9;)I
    //   29: istore #11
    //   31: iconst_0
    //   32: istore #12
    //   34: aload #8
    //   36: invokeinterface iterator : ()Ljava/util/Iterator;
    //   41: astore #13
    //   43: aload #13
    //   45: invokeinterface hasNext : ()Z
    //   50: ifeq -> 366
    //   53: aload #13
    //   55: invokeinterface next : ()Ljava/lang/Object;
    //   60: checkcast burp/Zgnc
    //   63: astore #14
    //   65: iload #12
    //   67: iload #11
    //   69: if_icmplt -> 79
    //   72: goto -> 366
    //   75: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   78: athrow
    //   79: aload #14
    //   81: invokeinterface Zza : ()Lburp/Zstu;
    //   86: ifnonnull -> 109
    //   89: aload_0
    //   90: aload #8
    //   92: iload #9
    //   94: invokevirtual Zp : (Lburp/Ztrm;Z)V
    //   97: aload #10
    //   99: ifnonnull -> 366
    //   102: goto -> 109
    //   105: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   108: athrow
    //   109: aload #14
    //   111: invokeinterface ZzX : ()Lburp/Zski;
    //   116: invokeinterface ZyR : ()Lburp/Zlit;
    //   121: invokeinterface Zdz : ()Lburp/Zmzk;
    //   126: aload #14
    //   128: invokeinterface Zzk : ()Lburp/Zstu;
    //   133: iconst_2
    //   134: aload_0
    //   135: getfield ZJ : Lburp/Zbnt;
    //   138: invokestatic ZY : (Lburp/Zmzk;Lburp/Zstu;BLburp/Zbnt;)Lburp/Zz1p;
    //   141: astore #15
    //   143: aload #15
    //   145: getfield ZY : Lburp/Zsba;
    //   148: astore #16
    //   150: aload #15
    //   152: getfield ZV : Ljava/util/List;
    //   155: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   160: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   165: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   170: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   175: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   180: invokestatic toSet : ()Ljava/util/stream/Collector;
    //   183: invokeinterface collect : (Ljava/util/stream/Collector;)Ljava/lang/Object;
    //   188: checkcast java/util/Set
    //   191: astore #17
    //   193: aload #15
    //   195: aload #14
    //   197: invokeinterface Zza : ()Lburp/Zstu;
    //   202: getstatic burp/Zt0k.NO_HTML_ANALYSIS : Lburp/Zt0k;
    //   205: aload_0
    //   206: getfield ZJ : Lburp/Zbnt;
    //   209: invokestatic ZS : (Lburp/Zz1p;Lburp/Zstu;Lburp/Zt0k;Lburp/Zbnt;)Lburp/Zs68;
    //   212: astore #18
    //   214: aload_0
    //   215: getfield Zd : Lburp/Zzba;
    //   218: new burp/Zrnc
    //   221: dup
    //   222: new burp/Zkos
    //   225: dup
    //   226: iload_1
    //   227: aload_2
    //   228: invokeinterface Znq : ()Lburp/Zeu9;
    //   233: aload_3
    //   234: aload_2
    //   235: aload #4
    //   237: aload #5
    //   239: aload #6
    //   241: aload #7
    //   243: invokespecial <init> : (ILburp/Zeu9;Lburp/Zeu9;Lburp/Zrp0;Lburp/Zlru;Lburp/Zszw;Lburp/Zszw;Ljava/util/Set;)V
    //   246: new burp/Zgzr
    //   249: dup
    //   250: aload #14
    //   252: invokeinterface ZzX : ()Lburp/Zski;
    //   257: invokeinterface ZyR : ()Lburp/Zlit;
    //   262: aload #14
    //   264: invokeinterface Zzj : ()Ljava/lang/String;
    //   269: aload #17
    //   271: aload #16
    //   273: aload #14
    //   275: invokeinterface Zzk : ()Lburp/Zstu;
    //   280: aload #15
    //   282: invokevirtual ZO : ()I
    //   285: aload #14
    //   287: invokeinterface Zzk : ()Lburp/Zstu;
    //   292: invokeinterface Zpu : ()I
    //   297: invokeinterface Zb : (II)Lburp/Zstu;
    //   302: invokespecial <init> : (Lburp/Zlit;Ljava/lang/String;Ljava/util/Set;Lburp/Zsba;Lburp/Zstu;)V
    //   305: new burp/Ztpv
    //   308: dup
    //   309: aload #18
    //   311: getfield Zb : S
    //   314: aload #18
    //   316: getfield ZH : Lburp/Zk8m;
    //   319: getfield ZJ : S
    //   322: invokespecial <init> : (SS)V
    //   325: new burp/Zlxb
    //   328: dup
    //   329: iload #9
    //   331: iload #11
    //   333: iload #12
    //   335: invokespecial <init> : (ZII)V
    //   338: aload #14
    //   340: invokeinterface Zzk : ()Lburp/Zstu;
    //   345: aload #14
    //   347: invokeinterface Zza : ()Lburp/Zstu;
    //   352: invokespecial <init> : (Lburp/Zkos;Lburp/Zgzr;Lburp/Ztpv;Lburp/Zlxb;Lburp/Zstu;Lburp/Zstu;)V
    //   355: invokevirtual ZQ : (Lburp/Zrnc;)V
    //   358: iinc #12, 1
    //   361: aload #10
    //   363: ifnonnull -> 43
    //   366: return
    // Exception table:
    //   from	to	target	type
    //   5	16	16	java/lang/MatchException
    //   65	75	75	java/lang/MatchException
    //   79	102	105	java/lang/MatchException
  }
  
  private void Zp(Ztrm paramZtrm, boolean paramBoolean) {
    int i = (paramZtrm.Zw()).permanentIndex;
    String str = paramZtrm.ZzQ().stream().map(this::lambda$logUnexpectedNullResponse$1).collect(Collectors.joining(a(1430, -21466)));
    Zuh.ZT(false, Zqf.Zk, String.format(a(1428, 3927), new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(i), str }));
  }
  
  private int ZU(Ztrm paramZtrm, boolean paramBoolean, Zeu9 paramZeu9) {
    // Byte code:
    //   0: invokestatic ZD : ()[Ljava/lang/String;
    //   3: astore #4
    //   5: iload_2
    //   6: ifeq -> 33
    //   9: aload_3
    //   10: invokeinterface ZVL : ()Z
    //   15: ifne -> 33
    //   18: goto -> 25
    //   21: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   24: athrow
    //   25: iconst_1
    //   26: goto -> 34
    //   29: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   32: athrow
    //   33: iconst_0
    //   34: istore #5
    //   36: iload #5
    //   38: ifeq -> 54
    //   41: aload_1
    //   42: invokeinterface Zb : ()I
    //   47: iconst_1
    //   48: isub
    //   49: ireturn
    //   50: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   53: athrow
    //   54: iconst_0
    //   55: istore #6
    //   57: aload_1
    //   58: invokeinterface iterator : ()Ljava/util/Iterator;
    //   63: astore #7
    //   65: aload #7
    //   67: invokeinterface hasNext : ()Z
    //   72: ifeq -> 143
    //   75: aload #7
    //   77: invokeinterface next : ()Ljava/lang/Object;
    //   82: checkcast burp/Zgnc
    //   85: astore #8
    //   87: aload_0
    //   88: getfield ZK : Lburp/Zz28;
    //   91: aload #8
    //   93: invokeinterface ZzX : ()Lburp/Zski;
    //   98: invokeinterface ZyR : ()Lburp/Zlit;
    //   103: invokeinterface ZG : (Lburp/Zlit;)Z
    //   108: ifeq -> 128
    //   111: aload #8
    //   113: invokeinterface Zza : ()Lburp/Zstu;
    //   118: ifnonnull -> 135
    //   121: goto -> 128
    //   124: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   127: athrow
    //   128: iload #6
    //   130: ireturn
    //   131: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   134: athrow
    //   135: iinc #6, 1
    //   138: aload #4
    //   140: ifnonnull -> 65
    //   143: iload #6
    //   145: ireturn
    // Exception table:
    //   from	to	target	type
    //   5	18	21	java/lang/MatchException
    //   9	29	29	java/lang/MatchException
    //   36	50	50	java/lang/MatchException
    //   87	121	124	java/lang/MatchException
    //   111	131	131	java/lang/MatchException
  }
  
  private boolean Zq(Zrp0 paramZrp0, Zeu9 paramZeu9) {
    try {
      if (paramZrp0 instanceof Zm5e)
        try {
          if (paramZeu9 instanceof Zbuw);
        } catch (MatchException matchException) {
          throw a(null);
        }  
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return false;
  }
  
  public Zzba ZF() {
    return this.Zd;
  }
  
  public static int Zq(Zlk4 paramZlk4) {
    try {
      switch (Zkou.Za[paramZlk4.ordinal()]) {
        default:
          throw new MatchException(null, null);
        case 1:
        
        case 2:
        case 3:
          break;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    return 10;
  }
  
  private String lambda$logUnexpectedNullResponse$1(Zgnc paramZgnc) {
    Zz1p zz1p = Zghc.ZY(paramZgnc.ZzX().ZyR().Zdz(), paramZgnc.Zzk(), (byte)2, this.ZJ);
    try {
      if (paramZgnc.Zza() == null)
        return a(1431, 22594); 
    } catch (MatchException matchException) {
      throw a(null);
    } 
    Zs68 zs68 = Zbwc.ZS(zz1p, paramZgnc.Zza(), Zt0k.NO_HTML_ANALYSIS, this.ZJ);
    return Short.toString(zs68.Zb);
  }
  
  private static boolean lambda$addCorridorRequestsToAudit$0(Zt8g paramZt8g) {
    try {
      if (!paramZt8g.Zbf()) {
        try {
          if (paramZt8g.ZbD());
        } catch (MatchException matchException) {
          throw a(null);
        } 
        return false;
      } 
    } catch (MatchException matchException) {
      throw a(null);
    } 
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'm;Pû®ãÞ\\tè!¼ûÝQ×´onxýR!e× cmb¶ªÌ´&N\\r½Ü^7n^£¶;lp b!5A¿bHÍçè'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_4
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #105
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 81
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
    //   63: goto -> 21
    //   66: aload #5
    //   68: putstatic burp/Zz7n.a : [Ljava/lang/String;
    //   71: iconst_3
    //   72: anewarray java/lang/String
    //   75: putstatic burp/Zz7n.b : [Ljava/lang/String;
    //   78: goto -> 227
    //   81: dup_x2
    //   82: pop
    //   83: invokevirtual toCharArray : ()[C
    //   86: dup_x1
    //   87: arraylength
    //   88: dup_x2
    //   89: pop
    //   90: iconst_0
    //   91: istore #6
    //   93: dup2_x1
    //   94: pop2
    //   95: dup_x2
    //   96: iconst_1
    //   97: if_icmpgt -> 200
    //   100: dup2
    //   101: swap
    //   102: iload #6
    //   104: dup2_x1
    //   105: caload
    //   106: swap
    //   107: iload #6
    //   109: bipush #7
    //   111: irem
    //   112: tableswitch default -> 182, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 167, 4 -> 172, 5 -> 177
    //   152: bipush #32
    //   154: goto -> 184
    //   157: bipush #54
    //   159: goto -> 184
    //   162: bipush #70
    //   164: goto -> 184
    //   167: bipush #82
    //   169: goto -> 184
    //   172: bipush #64
    //   174: goto -> 184
    //   177: bipush #47
    //   179: goto -> 184
    //   182: bipush #105
    //   184: ixor
    //   185: ixor
    //   186: i2c
    //   187: castore
    //   188: iinc #6, 1
    //   191: dup
    //   192: ifne -> 200
    //   195: dup2
    //   196: dup_x1
    //   197: goto -> 104
    //   200: dup2_x1
    //   201: pop2
    //   202: dup_x2
    //   203: iload #6
    //   205: if_icmpgt -> 100
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
    //   224: goto -> 38
    //   227: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x596) & 0xFFFF;
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
      char c = 'ò';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz7n.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */