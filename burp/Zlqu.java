package burp;

import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class Zlqu extends Zlq3 {
  static final Set<Predicate<Zkg8>> Zz;
  
  private static final String[] c;
  
  private static final String[] d;
  
  public Zlqu(Zbnt paramZbnt) {
    super(paramZbnt);
  }
  
  protected boolean ZJ(Zkum paramZkum) {
    return Zz.stream().anyMatch(paramZkum::lambda$handlesClickable$0);
  }
  
  protected boolean Zs(Zmy9 paramZmy9) {
    return !paramZmy9.ZN();
  }
  
  protected Optional<? extends Zg8y> ZT(Zlit paramZlit, Zkum paramZkum) {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual Zr : ()Lnet/portswigger/browser/Zel;
    //   4: invokeinterface ZD : ()Ljava/lang/String;
    //   9: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   12: astore #4
    //   14: invokestatic ZB : ()Ljava/lang/String;
    //   17: aload #4
    //   19: astore #5
    //   21: iconst_m1
    //   22: istore #6
    //   24: astore_3
    //   25: aload #5
    //   27: invokevirtual hashCode : ()I
    //   30: lookupswitch default -> 221, -1377687758 -> 177, -1191214428 -> 88, 97 -> 160, 3002509 -> 136, 97692013 -> 112, 100358090 -> 201
    //   88: aload #5
    //   90: sipush #-6180
    //   93: sipush #-28099
    //   96: invokestatic b : (II)Ljava/lang/String;
    //   99: invokevirtual equals : (Ljava/lang/Object;)Z
    //   102: ifeq -> 221
    //   105: iconst_0
    //   106: istore #6
    //   108: aload_3
    //   109: ifnonnull -> 221
    //   112: aload #5
    //   114: sipush #-6183
    //   117: sipush #3953
    //   120: invokestatic b : (II)Ljava/lang/String;
    //   123: invokevirtual equals : (Ljava/lang/Object;)Z
    //   126: ifeq -> 221
    //   129: iconst_1
    //   130: istore #6
    //   132: aload_3
    //   133: ifnonnull -> 221
    //   136: aload #5
    //   138: sipush #-6190
    //   141: sipush #-27569
    //   144: invokestatic b : (II)Ljava/lang/String;
    //   147: invokevirtual equals : (Ljava/lang/Object;)Z
    //   150: ifeq -> 221
    //   153: iconst_2
    //   154: istore #6
    //   156: aload_3
    //   157: ifnonnull -> 221
    //   160: aload #5
    //   162: ldc 'a'
    //   164: invokevirtual equals : (Ljava/lang/Object;)Z
    //   167: ifeq -> 221
    //   170: iconst_3
    //   171: istore #6
    //   173: aload_3
    //   174: ifnonnull -> 221
    //   177: aload #5
    //   179: sipush #-6185
    //   182: sipush #11853
    //   185: invokestatic b : (II)Ljava/lang/String;
    //   188: invokevirtual equals : (Ljava/lang/Object;)Z
    //   191: ifeq -> 221
    //   194: iconst_4
    //   195: istore #6
    //   197: aload_3
    //   198: ifnonnull -> 221
    //   201: aload #5
    //   203: sipush #-6177
    //   206: sipush #-19155
    //   209: invokestatic b : (II)Ljava/lang/String;
    //   212: invokevirtual equals : (Ljava/lang/Object;)Z
    //   215: ifeq -> 221
    //   218: iconst_5
    //   219: istore #6
    //   221: iload #6
    //   223: tableswitch default -> 325, 0 -> 260, 1 -> 272, 2 -> 284, 3 -> 296, 4 -> 316, 5 -> 316
    //   260: aload_0
    //   261: getstatic burp/Zz3o.IFRAME : Lburp/Zz3o;
    //   264: aload_1
    //   265: aload_2
    //   266: invokevirtual Zj : (Lburp/Zz3o;Lburp/Zlit;Lburp/Zkum;)Ljava/util/Optional;
    //   269: goto -> 328
    //   272: aload_0
    //   273: getstatic burp/Zz3o.FRAME : Lburp/Zz3o;
    //   276: aload_1
    //   277: aload_2
    //   278: invokevirtual Zj : (Lburp/Zz3o;Lburp/Zlit;Lburp/Zkum;)Ljava/util/Optional;
    //   281: goto -> 328
    //   284: aload_0
    //   285: getstatic burp/Zz3o.IMAGE_MAP_AREA : Lburp/Zz3o;
    //   288: aload_1
    //   289: aload_2
    //   290: invokevirtual ZP : (Lburp/Zz3o;Lburp/Zlit;Lburp/Zkum;)Ljava/util/Optional;
    //   293: goto -> 328
    //   296: aload_0
    //   297: getstatic burp/Zz3o.ANCHOR : Lburp/Zz3o;
    //   300: aload_1
    //   301: aload_2
    //   302: invokevirtual ZP : (Lburp/Zz3o;Lburp/Zlit;Lburp/Zkum;)Ljava/util/Optional;
    //   305: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   310: invokevirtual filter : (Ljava/util/function/Predicate;)Ljava/util/Optional;
    //   313: goto -> 328
    //   316: aload_0
    //   317: aload_1
    //   318: aload_2
    //   319: invokevirtual Zw : (Lburp/Zlit;Lburp/Zkum;)Ljava/util/Optional;
    //   322: goto -> 328
    //   325: invokestatic empty : ()Ljava/util/Optional;
    //   328: areturn
  }
  
  private Optional<Zg8y> Zj(Zz3o paramZz3o, Zlit paramZlit, Zkum paramZkum) {
    return Zh(paramZlit, paramZkum.Zr(), b(-6181, 6078)).map(paramZz3o::lambda$buildFrameOutboundEdge$1);
  }
  
  private Optional<Zm3y> ZP(Zz3o paramZz3o, Zlit paramZlit, Zkum paramZkum) {
    // Byte code:
    //   0: aload_0
    //   1: aload_2
    //   2: aload_3
    //   3: invokevirtual ZE : (Lburp/Zlit;Lburp/Zkum;)Ljava/util/Optional;
    //   6: aload_0
    //   7: aload_3
    //   8: <illegal opcode> get : (Lburp/Zlqu;Lburp/Zkum;)Ljava/util/function/Supplier;
    //   13: invokevirtual or : (Ljava/util/function/Supplier;)Ljava/util/Optional;
    //   16: aload_0
    //   17: aload_1
    //   18: aload_2
    //   19: aload_3
    //   20: <illegal opcode> get : (Lburp/Zlqu;Lburp/Zz3o;Lburp/Zlit;Lburp/Zkum;)Ljava/util/function/Supplier;
    //   25: invokevirtual or : (Ljava/util/function/Supplier;)Ljava/util/Optional;
    //   28: aload_0
    //   29: aload_3
    //   30: <illegal opcode> get : (Lburp/Zlqu;Lburp/Zkum;)Ljava/util/function/Supplier;
    //   35: invokevirtual or : (Ljava/util/function/Supplier;)Ljava/util/Optional;
    //   38: aload_0
    //   39: aload_3
    //   40: <illegal opcode> get : (Lburp/Zlqu;Lburp/Zkum;)Ljava/util/function/Supplier;
    //   45: invokevirtual or : (Ljava/util/function/Supplier;)Ljava/util/Optional;
    //   48: areturn
  }
  
  private Optional<Zm3y> Zp(Zz3o paramZz3o, Zlit paramZlit, Zkum paramZkum) {
    // Byte code:
    //   0: aload_0
    //   1: aload_2
    //   2: aload_3
    //   3: invokevirtual Zr : ()Lnet/portswigger/browser/Zel;
    //   6: sipush #-6178
    //   9: sipush #13275
    //   12: invokestatic b : (II)Ljava/lang/String;
    //   15: invokevirtual Zh : (Lburp/Zlit;Lnet/portswigger/browser/Zel;Ljava/lang/String;)Ljava/util/Optional;
    //   18: aload_1
    //   19: aload_3
    //   20: <illegal opcode> apply : (Lburp/Zz3o;Lburp/Zkum;)Ljava/util/function/Function;
    //   25: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   28: areturn
  }
  
  private Optional<Zm3y> ZH(Zkum paramZkum) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual Zr : ()Lnet/portswigger/browser/Zel;
    //   5: sipush #-6179
    //   8: sipush #-4347
    //   11: invokestatic b : (II)Ljava/lang/String;
    //   14: invokevirtual ZC : (Lnet/portswigger/browser/Zel;Ljava/lang/String;)Ljava/util/Optional;
    //   17: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   22: invokevirtual filter : (Ljava/util/function/Predicate;)Ljava/util/Optional;
    //   25: aload_0
    //   26: aload_1
    //   27: <illegal opcode> apply : (Lburp/Zlqu;Lburp/Zkum;)Ljava/util/function/Function;
    //   32: invokevirtual map : (Ljava/util/function/Function;)Ljava/util/Optional;
    //   35: areturn
  }
  
  private Zm3y lambda$buildJavascriptHrefOutboundEdge$8(Zkum paramZkum, String paramString) {
    return Zn(Zz3o.CLICKABLE, paramZkum);
  }
  
  private static boolean lambda$buildJavascriptHrefOutboundEdge$7(String paramString) {
    return paramString.toLowerCase().startsWith(b(-6184, 19817));
  }
  
  private static Zm3y lambda$buildHrefOutboundEdge$6(Zz3o paramZz3o, Zkum paramZkum, Zski paramZski) {
    return (new Zt49(paramZz3o, paramZkum.Zr(), paramZski)).ZM(paramZkum.Zk()).ZJ(paramZkum.Zp().Zm()).ZL();
  }
  
  private Optional lambda$buildRequestableOutboundEdge$5(Zkum paramZkum) {
    return Zd(paramZkum);
  }
  
  private Optional lambda$buildRequestableOutboundEdge$4(Zkum paramZkum) {
    return ZH(paramZkum);
  }
  
  private Optional lambda$buildRequestableOutboundEdge$3(Zz3o paramZz3o, Zlit paramZlit, Zkum paramZkum) {
    return Zp(paramZz3o, paramZlit, paramZkum);
  }
  
  private Optional lambda$buildRequestableOutboundEdge$2(Zkum paramZkum) {
    return Zo(paramZkum);
  }
  
  private static Zg8y lambda$buildFrameOutboundEdge$1(Zz3o paramZz3o, Zski paramZski) {
    return (new Zkkb<>(paramZz3o, paramZski)).Zl();
  }
  
  private static boolean lambda$handlesClickable$0(Zkum paramZkum, Predicate<Zkum> paramPredicate) {
    return paramPredicate.test(paramZkum);
  }
  
  static {
    // Byte code:
    //   0: bipush #16
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '4¡ÖÍ¤±àÚK\\fcè^4¯¨ççk$ðzá*FªC1ªë Ìëª\\tôçºi§r¯«1ò,7¤ïûnD\\ra²eXWLf|"W'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_4
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
    //   66: ldc 'aý¤ÇY£Ç'
    //   68: dup
    //   69: astore_2
    //   70: invokevirtual length : ()I
    //   73: istore #4
    //   75: bipush #6
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #9
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
    //   127: putstatic burp/Zlqu.c : [Ljava/lang/String;
    //   130: bipush #16
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Zlqu.d : [Ljava/lang/String;
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
    //   212: bipush #84
    //   214: goto -> 244
    //   217: bipush #8
    //   219: goto -> 244
    //   222: bipush #48
    //   224: goto -> 244
    //   227: bipush #58
    //   229: goto -> 244
    //   232: bipush #114
    //   234: goto -> 244
    //   237: bipush #45
    //   239: goto -> 244
    //   242: bipush #76
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
    //   300: sipush #-6187
    //   303: sipush #-29004
    //   306: invokestatic b : (II)Ljava/lang/String;
    //   309: invokestatic Zc : (Ljava/lang/String;)Ljava/util/function/Predicate;
    //   312: sipush #-6189
    //   315: sipush #18768
    //   318: invokestatic b : (II)Ljava/lang/String;
    //   321: invokestatic Zc : (Ljava/lang/String;)Ljava/util/function/Predicate;
    //   324: sipush #-6188
    //   327: sipush #27280
    //   330: invokestatic b : (II)Ljava/lang/String;
    //   333: invokestatic Zc : (Ljava/lang/String;)Ljava/util/function/Predicate;
    //   336: ldc 'a'
    //   338: invokestatic Zc : (Ljava/lang/String;)Ljava/util/function/Predicate;
    //   341: sipush #-6191
    //   344: sipush #-30893
    //   347: invokestatic b : (II)Ljava/lang/String;
    //   350: invokestatic Zc : (Ljava/lang/String;)Ljava/util/function/Predicate;
    //   353: sipush #-6186
    //   356: sipush #26218
    //   359: invokestatic b : (II)Ljava/lang/String;
    //   362: invokestatic Zc : (Ljava/lang/String;)Ljava/util/function/Predicate;
    //   365: sipush #-6182
    //   368: sipush #-8328
    //   371: invokestatic b : (II)Ljava/lang/String;
    //   374: invokestatic Zq : (Ljava/lang/String;)Ljava/util/function/Predicate;
    //   377: sipush #-6192
    //   380: sipush #-28042
    //   383: invokestatic b : (II)Ljava/lang/String;
    //   386: invokestatic Zq : (Ljava/lang/String;)Ljava/util/function/Predicate;
    //   389: invokeinterface or : (Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    //   394: invokeinterface and : (Ljava/util/function/Predicate;)Ljava/util/function/Predicate;
    //   399: invokestatic of : (Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Set;
    //   402: putstatic burp/Zlqu.Zz : Ljava/util/Set;
    //   405: return
  }
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE7D4) & 0xFFFF;
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
      char c = '¶';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlqu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */