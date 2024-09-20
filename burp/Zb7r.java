package burp;

import java.util.Comparator;

public class Zb7r extends Zbqc {
  private static final Comparator<Zb2e> Zl;
  
  private static final Comparator<Zb2e> ZJ;
  
  private static final Comparator<Zb2e> ZW;
  
  private final Zs2g ZA;
  
  private final Zbc9 ZO;
  
  private final Zk2_ ZS;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zb7r(int paramInt, Ztwv paramZtwv, Zs0g paramZs0g, Zgso paramZgso, Zg0s paramZg0s, Zs2g paramZs2g, Zz6v paramZz6v, Zzvb paramZzvb, Zrny paramZrny) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload #6
    //   7: putfield ZA : Lburp/Zs2g;
    //   10: invokestatic Zj : ()Ljava/lang/String;
    //   13: aload_0
    //   14: new burp/Zbc9
    //   17: dup
    //   18: iconst_2
    //   19: anewarray java/awt/Component
    //   22: dup
    //   23: iconst_0
    //   24: getstatic burp/Zgzq.SITE_MAP_EMPTY_PANEL_ICON : Lburp/Zgzq;
    //   27: sipush #-7687
    //   30: sipush #27361
    //   33: invokestatic a : (II)Ljava/lang/String;
    //   36: invokestatic ZK : (Lburp/Zgzq;Ljava/lang/String;)Lburp/Zltn;
    //   39: sipush #-7688
    //   42: sipush #-9613
    //   45: invokestatic a : (II)Ljava/lang/String;
    //   48: invokevirtual Za : (Ljava/lang/String;)Lburp/Zltn;
    //   51: invokevirtual Zi : ()Lburp/Zbcg;
    //   54: aastore
    //   55: dup
    //   56: iconst_1
    //   57: getstatic burp/Zgzq.SITE_MAP_EMPTY_PANEL_ICON : Lburp/Zgzq;
    //   60: sipush #-7681
    //   63: sipush #-3231
    //   66: invokestatic a : (II)Ljava/lang/String;
    //   69: invokestatic ZK : (Lburp/Zgzq;Ljava/lang/String;)Lburp/Zltn;
    //   72: sipush #-7686
    //   75: sipush #-21023
    //   78: invokestatic a : (II)Ljava/lang/String;
    //   81: invokevirtual Za : (Ljava/lang/String;)Lburp/Zltn;
    //   84: invokevirtual Zi : ()Lburp/Zbcg;
    //   87: aastore
    //   88: invokespecial <init> : ([Ljava/awt/Component;)V
    //   91: putfield ZO : Lburp/Zbc9;
    //   94: new burp/Zzpo
    //   97: dup
    //   98: invokespecial <init> : ()V
    //   101: iconst_3
    //   102: anewarray burp/Zmk7
    //   105: dup
    //   106: iconst_0
    //   107: getstatic burp/Ztnl.Zm : Lburp/Zmk7;
    //   110: aastore
    //   111: dup
    //   112: iconst_1
    //   113: getstatic burp/Ztnl.ZK : Lburp/Zmk7;
    //   116: aastore
    //   117: dup
    //   118: iconst_2
    //   119: getstatic burp/Ztnl.Zn : Lburp/Zmk7;
    //   122: aastore
    //   123: invokevirtual ZG : ([Lburp/Zmk7;)Lburp/Zzpo;
    //   126: aload_0
    //   127: getfield ZO : Lburp/Zbc9;
    //   130: invokevirtual Zw : (Ljava/awt/Component;)Lburp/Zzpo;
    //   133: bipush #50
    //   135: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   138: invokevirtual Zz : (Ljava/lang/Integer;)Lburp/Zzpo;
    //   141: invokevirtual Zv : ()Lburp/Zzpo;
    //   144: getstatic burp/Zb7r.Zl : Ljava/util/Comparator;
    //   147: getstatic burp/Zb7r.ZJ : Ljava/util/Comparator;
    //   150: invokeinterface thenComparing : (Ljava/util/Comparator;)Ljava/util/Comparator;
    //   155: getstatic burp/Zb7r.ZW : Ljava/util/Comparator;
    //   158: invokeinterface thenComparing : (Ljava/util/Comparator;)Ljava/util/Comparator;
    //   163: invokevirtual Zt : (Ljava/util/Comparator;)Lburp/Zzpo;
    //   166: aload #7
    //   168: aload #8
    //   170: <illegal opcode> accept : (Lburp/Zz6v;Lburp/Zzvb;)Ljava/util/function/Consumer;
    //   175: invokevirtual ZN : (Ljava/util/function/Consumer;)Lburp/Zzpo;
    //   178: getstatic burp/Zlkk.BACKGROUND : Lburp/Zlkk;
    //   181: invokevirtual Zs : (Lburp/Zlkk;)Lburp/Zzpo;
    //   184: iconst_2
    //   185: invokevirtual Zj : (I)Lburp/Zzpo;
    //   188: invokevirtual ZA : ()Lburp/Zzpo;
    //   191: iconst_0
    //   192: invokevirtual Zm : (Z)Lburp/Zzpo;
    //   195: astore #11
    //   197: astore #10
    //   199: aload_0
    //   200: new java/awt/BorderLayout
    //   203: dup
    //   204: invokespecial <init> : ()V
    //   207: invokevirtual setLayout : (Ljava/awt/LayoutManager;)V
    //   210: aload_0
    //   211: new burp/Zk2_
    //   214: dup
    //   215: aload_2
    //   216: aload_3
    //   217: aload #4
    //   219: aload #5
    //   221: new burp/Ztos
    //   224: dup
    //   225: invokestatic Ze : ()Lburp/Zt1_;
    //   228: invokespecial <init> : (Lburp/Zt3y;)V
    //   231: aload #11
    //   233: aload #9
    //   235: invokespecial <init> : (Lburp/Ztwv;Lburp/Zs0g;Lburp/Zgso;Lburp/Zg0s;Lburp/Ztos;Lburp/Zzpo;Lburp/Zrny;)V
    //   238: putfield ZS : Lburp/Zk2_;
    //   241: new burp/Zstm
    //   244: dup
    //   245: new burp/Zm5f
    //   248: dup
    //   249: aload_0
    //   250: getfield ZS : Lburp/Zk2_;
    //   253: iload_1
    //   254: invokespecial <init> : (Lburp/Zbof;I)V
    //   257: invokespecial <init> : (Lburp/Zzbt;)V
    //   260: astore #12
    //   262: aload_0
    //   263: getfield ZS : Lburp/Zk2_;
    //   266: aload #12
    //   268: invokevirtual Zi : (Lburp/Zzbt;)V
    //   271: aload_0
    //   272: aload_0
    //   273: getfield ZS : Lburp/Zk2_;
    //   276: invokevirtual ZE : ()Ljava/awt/Component;
    //   279: sipush #-7682
    //   282: sipush #-28684
    //   285: invokestatic a : (II)Ljava/lang/String;
    //   288: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   291: aload #10
    //   293: ifnull -> 303
    //   296: iconst_4
    //   297: anewarray burp/Zbqc
    //   300: invokestatic Zr : ([Lburp/Zbqc;)V
    //   303: return
  }
  
  public void Zp() {
    this.ZA.Zl(this.ZS);
  }
  
  public void Zt() {
    this.ZA.Zu(this.ZS);
  }
  
  public void Zs(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: <illegal opcode> run : (Lburp/Zb7r;Z)Ljava/lang/Runnable;
    //   7: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   10: return
  }
  
  private void lambda$setCrawling$4(boolean paramBoolean) {
    this.ZO.Zv(paramBoolean ? 1 : 0);
  }
  
  private static void lambda$new$3(Zz6v paramZz6v, Zzvb paramZzvb, Zb2e paramZb2e) {
    paramZz6v.Z_(a(-7685, -27904));
    paramZzvb.Zv(paramZb2e);
  }
  
  private static String lambda$static$2(Zb2e paramZb2e) {
    return Zrf1.Za.ZK(paramZb2e.ZBf()).ZZV();
  }
  
  private static Byte lambda$static$1(Zb2e paramZb2e) {
    return Byte.valueOf(paramZb2e.ZBf().Zac());
  }
  
  private static Byte lambda$static$0(Zb2e paramZb2e) {
    return Byte.valueOf(paramZb2e.ZBf().ZaJ());
  }
  
  static {
    // Byte code:
    //   0: bipush #6
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÉVuí wïÓçÔG3WvtÙÚ< D±70¥$)áÎÃÃxÇ9i¥?cOLd<&:îxH{A·(ý´QÿÛð6í¶pÆÉp$µV8QJó"¬jÚKPý'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #17
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #73
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
    //   68: ldc 'ª]G*KFøâ%»j.ÅuÂÙ)À¿Ð\\r®ÑZ*7ÌC×ÊÓÊÇç¹I¦ ûâÒDÖÆðò|äQÏ$_ÔÆ\\t[õy¥1¦/ø'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #6
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #122
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
    //   129: putstatic burp/Zb7r.a : [Ljava/lang/String;
    //   132: bipush #6
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zb7r.b : [Ljava/lang/String;
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
    //   212: bipush #67
    //   214: goto -> 244
    //   217: bipush #41
    //   219: goto -> 244
    //   222: bipush #10
    //   224: goto -> 244
    //   227: bipush #17
    //   229: goto -> 244
    //   232: bipush #112
    //   234: goto -> 244
    //   237: bipush #54
    //   239: goto -> 244
    //   242: bipush #36
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
    //   300: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   305: invokestatic reverseOrder : ()Ljava/util/Comparator;
    //   308: invokestatic comparing : (Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;
    //   311: putstatic burp/Zb7r.Zl : Ljava/util/Comparator;
    //   314: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   319: invokestatic reverseOrder : ()Ljava/util/Comparator;
    //   322: invokestatic comparing : (Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;
    //   325: putstatic burp/Zb7r.ZJ : Ljava/util/Comparator;
    //   328: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   333: invokestatic comparing : (Ljava/util/function/Function;)Ljava/util/Comparator;
    //   336: putstatic burp/Zb7r.ZW : Ljava/util/Comparator;
    //   339: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE1FA) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb7r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */