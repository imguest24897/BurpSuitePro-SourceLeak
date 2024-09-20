package burp;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Zrlp {
  private static String[] Zq;
  
  private static final String[] b;
  
  private static final String[] c;
  
  public static String ZY(String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    Zn(stringBuilder, paramString);
    return stringBuilder.toString();
  }
  
  public static void Zn(StringBuilder paramStringBuilder, String paramString) {
    ZO(paramStringBuilder, paramString, true);
  }
  
  public static void ZO(StringBuilder paramStringBuilder, String paramString, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic Zi : ()[Ljava/lang/String;
    //   3: astore_3
    //   4: iconst_0
    //   5: istore #4
    //   7: iload #4
    //   9: aload_1
    //   10: invokevirtual length : ()I
    //   13: if_icmpge -> 261
    //   16: aload_1
    //   17: iload #4
    //   19: invokevirtual charAt : (I)C
    //   22: istore #5
    //   24: iload #5
    //   26: bipush #10
    //   28: if_icmpne -> 52
    //   31: aload_0
    //   32: sipush #14206
    //   35: sipush #-7460
    //   38: invokestatic a : (II)Ljava/lang/String;
    //   41: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: pop
    //   45: iinc #4, 1
    //   48: aload_3
    //   49: ifnonnull -> 7
    //   52: iload #5
    //   54: bipush #13
    //   56: if_icmpne -> 104
    //   59: iload #4
    //   61: iconst_1
    //   62: iadd
    //   63: aload_1
    //   64: invokevirtual length : ()I
    //   67: if_icmpge -> 104
    //   70: aload_1
    //   71: iload #4
    //   73: iconst_1
    //   74: iadd
    //   75: invokevirtual charAt : (I)C
    //   78: bipush #10
    //   80: if_icmpne -> 104
    //   83: aload_0
    //   84: sipush #14194
    //   87: sipush #31600
    //   90: invokestatic a : (II)Ljava/lang/String;
    //   93: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: pop
    //   97: iinc #4, 2
    //   100: aload_3
    //   101: ifnonnull -> 7
    //   104: iload #5
    //   106: bipush #13
    //   108: if_icmpne -> 118
    //   111: iinc #4, 1
    //   114: aload_3
    //   115: ifnonnull -> 7
    //   118: iload #5
    //   120: bipush #9
    //   122: if_icmpne -> 146
    //   125: aload_0
    //   126: sipush #14192
    //   129: sipush #26782
    //   132: invokestatic a : (II)Ljava/lang/String;
    //   135: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   138: pop
    //   139: iinc #4, 1
    //   142: aload_3
    //   143: ifnonnull -> 7
    //   146: iload #5
    //   148: bipush #32
    //   150: if_icmpne -> 167
    //   153: aload_0
    //   154: ldc ' '
    //   156: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   159: pop
    //   160: iinc #4, 1
    //   163: aload_3
    //   164: ifnonnull -> 7
    //   167: iload #4
    //   169: istore #6
    //   171: iload #6
    //   173: aload_1
    //   174: invokevirtual length : ()I
    //   177: if_icmpge -> 226
    //   180: aload_1
    //   181: iload #6
    //   183: invokevirtual charAt : (I)C
    //   186: istore #5
    //   188: iload #5
    //   190: bipush #32
    //   192: if_icmpeq -> 226
    //   195: iload #5
    //   197: bipush #13
    //   199: if_icmpeq -> 226
    //   202: iload #5
    //   204: bipush #10
    //   206: if_icmpeq -> 226
    //   209: iload #5
    //   211: bipush #9
    //   213: if_icmpne -> 219
    //   216: goto -> 226
    //   219: iinc #6, 1
    //   222: aload_3
    //   223: ifnonnull -> 171
    //   226: iload_2
    //   227: ifeq -> 243
    //   230: aload_0
    //   231: aload_1
    //   232: iload #4
    //   234: iload #6
    //   236: invokestatic ZO : (Ljava/lang/StringBuilder;Ljava/lang/String;II)V
    //   239: aload_3
    //   240: ifnonnull -> 253
    //   243: aload_0
    //   244: aload_1
    //   245: iload #4
    //   247: iload #6
    //   249: invokevirtual append : (Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;
    //   252: pop
    //   253: iload #6
    //   255: istore #4
    //   257: aload_3
    //   258: ifnonnull -> 7
    //   261: return
  }
  
  public static void ZV(Writer paramWriter, byte[] paramArrayOfbyte) throws IOException {
    ZD(paramWriter, paramArrayOfbyte, 0, paramArrayOfbyte.length, false, true);
  }
  
  public static void ZE(Writer paramWriter, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, boolean paramBoolean) throws IOException {
    ZD(paramWriter, paramArrayOfbyte, paramInt1, paramInt2, paramBoolean, true);
  }
  
  public static void ZD(Writer paramWriter, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) throws IOException {
    // Byte code:
    //   0: iload_2
    //   1: istore #7
    //   3: invokestatic Zi : ()[Ljava/lang/String;
    //   6: iconst_0
    //   7: istore #8
    //   9: astore #6
    //   11: iload #7
    //   13: iload_3
    //   14: if_icmpge -> 412
    //   17: aload_1
    //   18: iload #7
    //   20: baload
    //   21: istore #9
    //   23: iload #9
    //   25: bipush #10
    //   27: if_icmpne -> 86
    //   30: iload #4
    //   32: ifeq -> 55
    //   35: goto -> 42
    //   38: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   41: athrow
    //   42: iload #8
    //   44: iconst_3
    //   45: if_icmpge -> 75
    //   48: goto -> 55
    //   51: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   54: athrow
    //   55: aload_0
    //   56: sipush #14194
    //   59: sipush #31600
    //   62: invokestatic a : (II)Ljava/lang/String;
    //   65: invokevirtual write : (Ljava/lang/String;)V
    //   68: goto -> 75
    //   71: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   74: athrow
    //   75: iinc #8, 1
    //   78: iinc #7, 1
    //   81: aload #6
    //   83: ifnonnull -> 11
    //   86: iload #9
    //   88: bipush #13
    //   90: if_icmpne -> 182
    //   93: iload #7
    //   95: iconst_1
    //   96: iadd
    //   97: iload_3
    //   98: if_icmpge -> 182
    //   101: goto -> 108
    //   104: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   107: athrow
    //   108: aload_1
    //   109: iload #7
    //   111: iconst_1
    //   112: iadd
    //   113: baload
    //   114: bipush #10
    //   116: if_icmpne -> 182
    //   119: goto -> 126
    //   122: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   125: athrow
    //   126: iload #4
    //   128: ifeq -> 151
    //   131: goto -> 138
    //   134: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   137: athrow
    //   138: iload #8
    //   140: iconst_3
    //   141: if_icmpge -> 171
    //   144: goto -> 151
    //   147: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   150: athrow
    //   151: aload_0
    //   152: sipush #14194
    //   155: sipush #31600
    //   158: invokestatic a : (II)Ljava/lang/String;
    //   161: invokevirtual write : (Ljava/lang/String;)V
    //   164: goto -> 171
    //   167: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   170: athrow
    //   171: iinc #8, 1
    //   174: iinc #7, 2
    //   177: aload #6
    //   179: ifnonnull -> 11
    //   182: iload #9
    //   184: bipush #13
    //   186: if_icmpne -> 204
    //   189: iinc #7, 1
    //   192: aload #6
    //   194: ifnonnull -> 11
    //   197: goto -> 204
    //   200: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   203: athrow
    //   204: iload #9
    //   206: bipush #9
    //   208: if_icmpne -> 239
    //   211: aload_0
    //   212: sipush #14198
    //   215: sipush #-31074
    //   218: invokestatic a : (II)Ljava/lang/String;
    //   221: invokevirtual write : (Ljava/lang/String;)V
    //   224: iinc #7, 1
    //   227: aload #6
    //   229: ifnonnull -> 11
    //   232: goto -> 239
    //   235: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   238: athrow
    //   239: iload #9
    //   241: bipush #32
    //   243: if_icmpne -> 267
    //   246: aload_0
    //   247: ldc ' '
    //   249: invokevirtual write : (Ljava/lang/String;)V
    //   252: iinc #7, 1
    //   255: aload #6
    //   257: ifnonnull -> 11
    //   260: goto -> 267
    //   263: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   266: athrow
    //   267: iconst_0
    //   268: istore #8
    //   270: iload #7
    //   272: istore #10
    //   274: iload #10
    //   276: iload_3
    //   277: if_icmpge -> 350
    //   280: aload_1
    //   281: iload #10
    //   283: baload
    //   284: istore #9
    //   286: iload #9
    //   288: bipush #32
    //   290: if_icmpeq -> 350
    //   293: iload #9
    //   295: bipush #13
    //   297: if_icmpeq -> 350
    //   300: goto -> 307
    //   303: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   306: athrow
    //   307: iload #9
    //   309: bipush #10
    //   311: if_icmpeq -> 350
    //   314: goto -> 321
    //   317: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   320: athrow
    //   321: iload #9
    //   323: bipush #9
    //   325: if_icmpne -> 342
    //   328: goto -> 335
    //   331: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   334: athrow
    //   335: goto -> 350
    //   338: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   341: athrow
    //   342: iinc #10, 1
    //   345: aload #6
    //   347: ifnonnull -> 274
    //   350: iload #5
    //   352: ifeq -> 376
    //   355: aload_0
    //   356: aload_1
    //   357: iload #7
    //   359: iload #10
    //   361: invokestatic ZZ : (Ljava/io/Writer;[BII)V
    //   364: aload #6
    //   366: ifnonnull -> 403
    //   369: goto -> 376
    //   372: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   375: athrow
    //   376: iload #7
    //   378: istore #11
    //   380: iload #11
    //   382: iload #10
    //   384: if_icmpge -> 403
    //   387: aload_0
    //   388: aload_1
    //   389: iload #11
    //   391: baload
    //   392: invokevirtual write : (I)V
    //   395: iinc #11, 1
    //   398: aload #6
    //   400: ifnonnull -> 380
    //   403: iload #10
    //   405: istore #7
    //   407: aload #6
    //   409: ifnonnull -> 11
    //   412: return
    // Exception table:
    //   from	to	target	type
    //   23	35	38	java/io/IOException
    //   30	48	51	java/io/IOException
    //   42	68	71	java/io/IOException
    //   86	101	104	java/io/IOException
    //   93	119	122	java/io/IOException
    //   108	131	134	java/io/IOException
    //   126	144	147	java/io/IOException
    //   138	164	167	java/io/IOException
    //   182	197	200	java/io/IOException
    //   204	232	235	java/io/IOException
    //   239	260	263	java/io/IOException
    //   286	300	303	java/io/IOException
    //   293	314	317	java/io/IOException
    //   307	328	331	java/io/IOException
    //   321	338	338	java/io/IOException
    //   350	369	372	java/io/IOException
  }
  
  private static void ZO(StringBuilder paramStringBuilder, String paramString, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: invokestatic Zi : ()[Ljava/lang/String;
    //   3: astore #4
    //   5: iload_2
    //   6: iload_3
    //   7: if_icmpge -> 136
    //   10: aload_1
    //   11: iload_2
    //   12: invokevirtual charAt : (I)C
    //   15: istore #5
    //   17: bipush #60
    //   19: iload #5
    //   21: if_icmpne -> 43
    //   24: aload_0
    //   25: sipush #14199
    //   28: sipush #9081
    //   31: invokestatic a : (II)Ljava/lang/String;
    //   34: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   37: pop
    //   38: aload #4
    //   40: ifnonnull -> 128
    //   43: bipush #62
    //   45: iload #5
    //   47: if_icmpne -> 69
    //   50: aload_0
    //   51: sipush #14207
    //   54: sipush #-27516
    //   57: invokestatic a : (II)Ljava/lang/String;
    //   60: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   63: pop
    //   64: aload #4
    //   66: ifnonnull -> 128
    //   69: bipush #38
    //   71: iload #5
    //   73: if_icmpne -> 95
    //   76: aload_0
    //   77: sipush #14193
    //   80: sipush #-14640
    //   83: invokestatic a : (II)Ljava/lang/String;
    //   86: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   89: pop
    //   90: aload #4
    //   92: ifnonnull -> 128
    //   95: iload #5
    //   97: bipush #32
    //   99: if_icmplt -> 109
    //   102: iload #5
    //   104: bipush #127
    //   106: if_icmple -> 121
    //   109: aload_0
    //   110: bipush #46
    //   112: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   115: pop
    //   116: aload #4
    //   118: ifnonnull -> 128
    //   121: aload_0
    //   122: iload #5
    //   124: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   127: pop
    //   128: iinc #2, 1
    //   131: aload #4
    //   133: ifnonnull -> 5
    //   136: return
  }
  
  public static void ZZ(Writer paramWriter, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException {
    // Byte code:
    //   0: invokestatic Zi : ()[Ljava/lang/String;
    //   3: astore #4
    //   5: iload_2
    //   6: iload_3
    //   7: if_icmpge -> 192
    //   10: aload_1
    //   11: iload_2
    //   12: baload
    //   13: istore #5
    //   15: bipush #60
    //   17: iload #5
    //   19: if_icmpne -> 47
    //   22: aload_0
    //   23: sipush #14195
    //   26: sipush #-16319
    //   29: invokestatic a : (II)Ljava/lang/String;
    //   32: invokevirtual write : (Ljava/lang/String;)V
    //   35: aload #4
    //   37: ifnonnull -> 184
    //   40: goto -> 47
    //   43: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   46: athrow
    //   47: bipush #62
    //   49: iload #5
    //   51: if_icmpne -> 86
    //   54: goto -> 61
    //   57: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   60: athrow
    //   61: aload_0
    //   62: sipush #14197
    //   65: sipush #-5994
    //   68: invokestatic a : (II)Ljava/lang/String;
    //   71: invokevirtual write : (Ljava/lang/String;)V
    //   74: aload #4
    //   76: ifnonnull -> 184
    //   79: goto -> 86
    //   82: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   85: athrow
    //   86: bipush #38
    //   88: iload #5
    //   90: if_icmpne -> 125
    //   93: goto -> 100
    //   96: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   99: athrow
    //   100: aload_0
    //   101: sipush #14196
    //   104: sipush #30725
    //   107: invokestatic a : (II)Ljava/lang/String;
    //   110: invokevirtual write : (Ljava/lang/String;)V
    //   113: aload #4
    //   115: ifnonnull -> 184
    //   118: goto -> 125
    //   121: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   124: athrow
    //   125: iload #5
    //   127: bipush #32
    //   129: if_icmplt -> 153
    //   132: goto -> 139
    //   135: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   138: athrow
    //   139: iload #5
    //   141: bipush #127
    //   143: if_icmple -> 171
    //   146: goto -> 153
    //   149: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   152: athrow
    //   153: aload_0
    //   154: bipush #46
    //   156: invokevirtual write : (I)V
    //   159: aload #4
    //   161: ifnonnull -> 184
    //   164: goto -> 171
    //   167: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   170: athrow
    //   171: aload_0
    //   172: iload #5
    //   174: invokevirtual write : (I)V
    //   177: goto -> 184
    //   180: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   183: athrow
    //   184: iinc #2, 1
    //   187: aload #4
    //   189: ifnonnull -> 5
    //   192: return
    // Exception table:
    //   from	to	target	type
    //   15	40	43	java/io/IOException
    //   22	54	57	java/io/IOException
    //   47	79	82	java/io/IOException
    //   61	93	96	java/io/IOException
    //   86	118	121	java/io/IOException
    //   100	132	135	java/io/IOException
    //   125	146	149	java/io/IOException
    //   139	164	167	java/io/IOException
    //   153	177	180	java/io/IOException
  }
  
  public static long ZC() {
    return (long)(Math.random() * 9.223372036854776E18D);
  }
  
  public static String ZF(Zrdb paramZrdb) {
    return paramZrdb.getClass().toString();
  }
  
  public static boolean Zy(Zbx0 paramZbx0, Collection<Zgkc> paramCollection) {
    String[] arrayOfString = Zi();
    for (Zgkc zgkc : paramCollection) {
      if (zgkc.ZR(paramZbx0))
        return true; 
      if (arrayOfString == null)
        break; 
    } 
    return false;
  }
  
  public static Zl1r ZJ(Zkv8 paramZkv8) {
    return Zj((paramZkv8.Zw()).Z_, (paramZkv8.Zw()).Z_ + (paramZkv8.Zw()).Ze.length);
  }
  
  public static Zl1r Zj(int paramInt1, int paramInt2) {
    return new Zl1r(paramInt1, paramInt2);
  }
  
  public static Zl1r Zh(int[] paramArrayOfint) {
    return (paramArrayOfint == null) ? null : Zj(paramArrayOfint[0], paramArrayOfint[1]);
  }
  
  public static List<Zl1r> Zc(List<int[]> paramList) {
    String[] arrayOfString = Zi();
    if (paramList == null)
      return null; 
    ArrayList<Zl1r> arrayList = new ArrayList(paramList.size());
    for (int[] arrayOfInt : paramList) {
      if (arrayOfInt != null)
        arrayList.add(Zj(arrayOfInt[0], arrayOfInt[1])); 
      if (arrayOfString == null)
        break; 
    } 
    return arrayList;
  }
  
  public static Zefg<Zzi8> Ze(Zr_4 paramZr_4, Zvow... paramVarArgs) {
    return Ze(paramZr_4, Arrays.asList(paramVarArgs));
  }
  
  private static Zefg<Zzi8> Ze(Zr_4 paramZr_4, List<Zvow> paramList) {
    Zefg<Zzi8> zefg = Zkk.Zl(paramZr_4, Zzi8.ZP, paramList.size());
    Iterator<Zvow> iterator = paramList.iterator();
    String[] arrayOfString = Zi();
    while (iterator.hasNext()) {
      Zvow zvow = iterator.next();
      if (zvow != null)
        zefg.add(paramZr_4.<Zzi8>ZH(zvow)); 
      if (arrayOfString == null)
        break; 
    } 
    return zefg;
  }
  
  public static Zefg<Zgkc> Zo(Zr_4 paramZr_4, List<Zlfv<? extends Zgkc>> paramList) {
    Zefg<Zgkc> zefg = Zkk.Zl(paramZr_4, Zgkc.ZO, paramList.size());
    HashMap<Object, Object> hashMap = new HashMap<>();
    Iterator<Zlfv<? extends Zgkc>> iterator = paramList.iterator();
    String[] arrayOfString = Zi();
    while (iterator.hasNext()) {
      Zlfv<Zgkc> zlfv = (Zlfv)iterator.next();
      zefg.add(paramZr_4.<Zgkc>ZH(zlfv.Zc((Map)hashMap)));
      if (arrayOfString == null)
        break; 
    } 
    return zefg;
  }
  
  public static Zefg<Zgkc> ZE(Zr_4 paramZr_4, Zefg<Zgkc> paramZefg, List<Zlfv<? extends Zgkc>> paramList) {
    return (paramZefg != null) ? paramZefg : Zo(paramZr_4, paramList);
  }
  
  public static Zt7v<Zsdr> Zk(Zr_4 paramZr_4, Zt7v<Zsdr> paramZt7v, Map<Long, String> paramMap) {
    return (paramZt7v != null) ? paramZt7v : ZY(paramZr_4, paramMap);
  }
  
  public static Zt7v<Zsdr> ZY(Zr_4 paramZr_4, Map<Long, String> paramMap) {
    // Byte code:
    //   0: aload_0
    //   1: new burp/Ze4j
    //   4: dup
    //   5: getstatic burp/Zsdr.Zo : Lburp/Zk_l;
    //   8: invokespecial <init> : (Lburp/Zeu4;)V
    //   11: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   16: checkcast burp/Zt7v
    //   19: astore_3
    //   20: invokestatic Zi : ()[Ljava/lang/String;
    //   23: aload_1
    //   24: invokeinterface entrySet : ()Ljava/util/Set;
    //   29: invokeinterface iterator : ()Ljava/util/Iterator;
    //   34: astore #5
    //   36: astore_2
    //   37: aload #5
    //   39: invokeinterface hasNext : ()Z
    //   44: ifeq -> 140
    //   47: aload #5
    //   49: invokeinterface next : ()Ljava/lang/Object;
    //   54: checkcast java/util/Map$Entry
    //   57: astore #6
    //   59: aload #6
    //   61: invokeinterface getKey : ()Ljava/lang/Object;
    //   66: checkcast java/lang/Long
    //   69: astore #4
    //   71: aload #6
    //   73: invokeinterface getValue : ()Ljava/lang/Object;
    //   78: ifnonnull -> 98
    //   81: aload_3
    //   82: aload #4
    //   84: invokevirtual longValue : ()J
    //   87: aconst_null
    //   88: invokeinterface ZI : (JLburp/Zgpi;)Lburp/Zgpi;
    //   93: pop
    //   94: aload_2
    //   95: ifnonnull -> 136
    //   98: aload_3
    //   99: aload #4
    //   101: invokevirtual longValue : ()J
    //   104: aload_0
    //   105: new burp/Zkk0
    //   108: dup
    //   109: aload #6
    //   111: invokeinterface getValue : ()Ljava/lang/Object;
    //   116: checkcast java/lang/String
    //   119: invokespecial <init> : (Ljava/lang/String;)V
    //   122: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   127: checkcast burp/Zsdr
    //   130: invokeinterface ZI : (JLburp/Zgpi;)Lburp/Zgpi;
    //   135: pop
    //   136: aload_2
    //   137: ifnonnull -> 37
    //   140: aload_3
    //   141: areturn
  }
  
  public static void ZB(String[] paramArrayOfString) {
    Zq = paramArrayOfString;
  }
  
  public static String[] Zi() {
    return Zq;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: bipush #10
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'ÈÊ{\\f£l%tÏìuèãå÷¯¯\úÅK-Ý%Òµ»sô mÈ¬{À£_CtììèÐå¯a$ÄJ'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_1
    //   19: anewarray java/lang/String
    //   22: bipush #19
    //   24: istore_1
    //   25: invokestatic ZB : ([Ljava/lang/String;)V
    //   28: iconst_m1
    //   29: istore_0
    //   30: bipush #89
    //   32: iinc #0, 1
    //   35: aload_2
    //   36: iload_0
    //   37: dup
    //   38: iload_1
    //   39: iadd
    //   40: invokevirtual substring : (II)Ljava/lang/String;
    //   43: iconst_m1
    //   44: goto -> 149
    //   47: aload #5
    //   49: swap
    //   50: iload_3
    //   51: iinc #3, 1
    //   54: swap
    //   55: aastore
    //   56: iload_0
    //   57: iload_1
    //   58: iadd
    //   59: dup
    //   60: istore_0
    //   61: iload #4
    //   63: if_icmpge -> 75
    //   66: aload_2
    //   67: iload_0
    //   68: invokevirtual charAt : (I)C
    //   71: istore_1
    //   72: goto -> 30
    //   75: ldc 'T  ¥ØA5'
    //   77: dup
    //   78: astore_2
    //   79: invokevirtual length : ()I
    //   82: istore #4
    //   84: iconst_4
    //   85: istore_1
    //   86: iconst_m1
    //   87: istore_0
    //   88: bipush #83
    //   90: iinc #0, 1
    //   93: aload_2
    //   94: iload_0
    //   95: dup
    //   96: iload_1
    //   97: iadd
    //   98: invokevirtual substring : (II)Ljava/lang/String;
    //   101: iconst_0
    //   102: goto -> 149
    //   105: aload #5
    //   107: swap
    //   108: iload_3
    //   109: iinc #3, 1
    //   112: swap
    //   113: aastore
    //   114: iload_0
    //   115: iload_1
    //   116: iadd
    //   117: dup
    //   118: istore_0
    //   119: iload #4
    //   121: if_icmpge -> 133
    //   124: aload_2
    //   125: iload_0
    //   126: invokevirtual charAt : (I)C
    //   129: istore_1
    //   130: goto -> 88
    //   133: aload #5
    //   135: putstatic burp/Zrlp.b : [Ljava/lang/String;
    //   138: bipush #10
    //   140: anewarray java/lang/String
    //   143: putstatic burp/Zrlp.c : [Ljava/lang/String;
    //   146: goto -> 308
    //   149: dup_x2
    //   150: pop
    //   151: invokevirtual toCharArray : ()[C
    //   154: dup_x1
    //   155: arraylength
    //   156: dup_x2
    //   157: pop
    //   158: iconst_0
    //   159: istore #6
    //   161: dup2_x1
    //   162: pop2
    //   163: dup_x2
    //   164: iconst_1
    //   165: if_icmpgt -> 268
    //   168: dup2
    //   169: swap
    //   170: iload #6
    //   172: dup2_x1
    //   173: caload
    //   174: swap
    //   175: iload #6
    //   177: bipush #7
    //   179: irem
    //   180: tableswitch default -> 250, 0 -> 220, 1 -> 225, 2 -> 230, 3 -> 235, 4 -> 240, 5 -> 245
    //   220: bipush #82
    //   222: goto -> 252
    //   225: bipush #126
    //   227: goto -> 252
    //   230: bipush #16
    //   232: goto -> 252
    //   235: bipush #104
    //   237: goto -> 252
    //   240: bipush #69
    //   242: goto -> 252
    //   245: bipush #59
    //   247: goto -> 252
    //   250: bipush #14
    //   252: ixor
    //   253: ixor
    //   254: i2c
    //   255: castore
    //   256: iinc #6, 1
    //   259: dup
    //   260: ifne -> 268
    //   263: dup2
    //   264: dup_x1
    //   265: goto -> 172
    //   268: dup2_x1
    //   269: pop2
    //   270: dup_x2
    //   271: iload #6
    //   273: if_icmpgt -> 168
    //   276: pop
    //   277: new java/lang/String
    //   280: dup_x1
    //   281: swap
    //   282: invokespecial <init> : ([C)V
    //   285: invokevirtual intern : ()Ljava/lang/String;
    //   288: swap
    //   289: pop
    //   290: swap
    //   291: tableswitch default -> 47, 0 -> 105
    //   308: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x3776) & 0xFFFF;
    if (c[i] == null) {
      char[] arrayOfChar = b[i].toCharArray();
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
      byte b1 = 104;
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
      c[i] = (new String(arrayOfChar)).intern();
    } 
    return c[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrlp.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */