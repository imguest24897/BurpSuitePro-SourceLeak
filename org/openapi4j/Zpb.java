package org.openapi4j;

import burp.Zbqc;
import com.fasterxml.Zg.Zb;
import com.fasterxml.Zg.Zr;
import com.fasterxml.Zor.Zb;
import java.net.URL;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class Zpb {
  private final URL Zx;
  
  private final List<Zpi> Zk;
  
  private Zb ZS;
  
  private final Map<URL, Zb> ZX = new HashMap<>();
  
  private final Zp7 ZH;
  
  final String Zm;
  
  private static final String[] a;
  
  private static final String[] b;
  
  protected Zpb(URL paramURL, List<Zpi> paramList, Zb paramZb, String paramString, Zp7 paramZp7) {
    this.Zx = paramURL;
    this.Zk = paramList;
    this.ZS = paramZb;
    int[] arrayOfInt = Zh.Zy();
    this.Zm = paramString;
    this.ZH = paramZp7;
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public void ZQ() throws Zp0 {
    try {
    
    } catch (Zp0 zp0) {
      throw a(null);
    } 
    try {
      this.ZS = (this.ZS != null) ? ZO(this.Zx, this.ZS) : Ze(this.Zx);
      if (this.ZS != null) {
        ZU(this.Zx, this.ZS);
        ZM();
      } 
    } catch (Zp0 zp0) {
      throw a(null);
    } 
  }
  
  public Zb ZJ() {
    return this.ZS;
  }
  
  protected abstract Collection<Zb> Zq(Zb paramZb);
  
  private void ZU(URL paramURL, Zb paramZb) throws Zp0 {
    // Byte code:
    //   0: invokestatic Zy : ()[I
    //   3: aload_0
    //   4: aload_2
    //   5: invokevirtual Zq : (Lcom/fasterxml/Zor/Zb;)Ljava/util/Collection;
    //   8: astore #4
    //   10: new java/util/LinkedList
    //   13: dup
    //   14: aload_2
    //   15: aload_0
    //   16: getfield Zm : Ljava/lang/String;
    //   19: invokevirtual ZS : (Ljava/lang/String;)Ljava/util/List;
    //   22: invokespecial <init> : (Ljava/util/Collection;)V
    //   25: astore #5
    //   27: astore_3
    //   28: new java/util/HashSet
    //   31: dup
    //   32: invokespecial <init> : ()V
    //   35: astore #6
    //   37: aload #4
    //   39: invokeinterface iterator : ()Ljava/util/Iterator;
    //   44: astore #7
    //   46: aload #7
    //   48: invokeinterface hasNext : ()Z
    //   53: ifeq -> 231
    //   56: aload #7
    //   58: invokeinterface next : ()Ljava/lang/Object;
    //   63: checkcast com/fasterxml/Zor/Zb
    //   66: astore #8
    //   68: aload #8
    //   70: invokevirtual Zz : ()Ljava/lang/String;
    //   73: astore #9
    //   75: aload #9
    //   77: ifnonnull -> 91
    //   80: aload_3
    //   81: ifnonnull -> 46
    //   84: goto -> 91
    //   87: invokestatic a : (Lorg/openapi4j/Zp0;)Lorg/openapi4j/Zp0;
    //   90: athrow
    //   91: aload #6
    //   93: aload #9
    //   95: invokeinterface add : (Ljava/lang/Object;)Z
    //   100: ifne -> 114
    //   103: aload_3
    //   104: ifnonnull -> 46
    //   107: goto -> 114
    //   110: invokestatic a : (Lorg/openapi4j/Zp0;)Lorg/openapi4j/Zp0;
    //   113: athrow
    //   114: aload #9
    //   116: ldc '#'
    //   118: invokevirtual indexOf : (Ljava/lang/String;)I
    //   121: istore #10
    //   123: iload #10
    //   125: ifne -> 148
    //   128: aload_0
    //   129: aload_1
    //   130: aload #5
    //   132: aload #9
    //   134: invokevirtual ZQ : (Ljava/net/URL;Ljava/util/List;Ljava/lang/String;)V
    //   137: aload_3
    //   138: ifnonnull -> 227
    //   141: goto -> 148
    //   144: invokestatic a : (Lorg/openapi4j/Zp0;)Lorg/openapi4j/Zp0;
    //   147: athrow
    //   148: iload #10
    //   150: iconst_m1
    //   151: if_icmpne -> 173
    //   154: goto -> 161
    //   157: invokestatic a : (Lorg/openapi4j/Zp0;)Lorg/openapi4j/Zp0;
    //   160: athrow
    //   161: aload_1
    //   162: aload #9
    //   164: invokestatic ZO : (Ljava/net/URL;Ljava/lang/String;)Ljava/net/URL;
    //   167: astore #11
    //   169: aload_3
    //   170: ifnonnull -> 187
    //   173: aload_1
    //   174: aload #9
    //   176: iconst_0
    //   177: iload #10
    //   179: invokevirtual substring : (II)Ljava/lang/String;
    //   182: invokestatic ZO : (Ljava/net/URL;Ljava/lang/String;)Ljava/net/URL;
    //   185: astore #11
    //   187: aload_0
    //   188: aload #11
    //   190: aload #5
    //   192: aload #9
    //   194: invokevirtual ZQ : (Ljava/net/URL;Ljava/util/List;Ljava/lang/String;)V
    //   197: aload_0
    //   198: getfield ZX : Ljava/util/Map;
    //   201: aload #11
    //   203: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   208: ifne -> 227
    //   211: aload_0
    //   212: aload #11
    //   214: invokevirtual Ze : (Ljava/net/URL;)Lcom/fasterxml/Zor/Zb;
    //   217: astore #12
    //   219: aload_0
    //   220: aload #11
    //   222: aload #12
    //   224: invokevirtual ZU : (Ljava/net/URL;Lcom/fasterxml/Zor/Zb;)V
    //   227: aload_3
    //   228: ifnonnull -> 46
    //   231: return
    // Exception table:
    //   from	to	target	type
    //   75	84	87	org/openapi4j/Zp0
    //   91	107	110	org/openapi4j/Zp0
    //   123	141	144	org/openapi4j/Zp0
    //   128	154	157	org/openapi4j/Zp0
  }
  
  private void ZQ(URL paramURL, List<Zb> paramList, String paramString) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZH : Lorg/openapi4j/Zp7;
    //   4: aload_1
    //   5: aload_3
    //   6: invokevirtual Zs : (Ljava/net/URL;Ljava/lang/String;)Lorg/openapi4j/Zh;
    //   9: astore #4
    //   11: getstatic org/openapi4j/Zpl.Zo : Lcom/fasterxml/Zor/Zy6;
    //   14: invokevirtual ZD : ()Lcom/fasterxml/Zg/Zfc;
    //   17: aload #4
    //   19: invokevirtual ZE : ()Ljava/lang/String;
    //   22: invokevirtual ZP : (Ljava/lang/String;)Lcom/fasterxml/Zg/Zb;
    //   25: astore #5
    //   27: aload_2
    //   28: aload_0
    //   29: aload_3
    //   30: aload #5
    //   32: <illegal opcode> test : (Lorg/openapi4j/Zpb;Ljava/lang/String;Lcom/fasterxml/Zg/Zb;)Ljava/util/function/Predicate;
    //   37: invokeinterface removeIf : (Ljava/util/function/Predicate;)Z
    //   42: pop
    //   43: return
  }
  
  private Zb Ze(URL paramURL) throws Zp0 {
    try {
      Zb zb = Zpl.Zq(paramURL, this.Zk);
      this.ZX.put(paramURL, zb);
      return zb;
    } catch (Zp0 zp0) {
      throw zp0;
    } catch (Exception exception) {
      throw new Zp0(String.format(a(24729, 8770), new Object[] { paramURL }), exception);
    } 
  }
  
  private Zb ZO(URL paramURL, Zb paramZb) {
    this.ZX.put(paramURL, paramZb);
    return paramZb;
  }
  
  private void ZM() throws Zp0 {
    Iterator<Zh> iterator = this.ZH.ZP().iterator();
    int[] arrayOfInt = Zh.Zy();
    while (iterator.hasNext()) {
      Zh zh = iterator.next();
      Ze(zh, new HashSet<>());
      if (arrayOfInt == null)
        break; 
    } 
  }
  
  private void Ze(Zh paramZh, Set<Zh> paramSet) throws Zp0 {
    // Byte code:
    //   0: invokestatic Zy : ()[I
    //   3: astore_3
    //   4: aload_2
    //   5: aload_1
    //   6: invokeinterface add : (Ljava/lang/Object;)Z
    //   11: ifne -> 119
    //   14: new java/lang/StringBuilder
    //   17: dup
    //   18: invokespecial <init> : ()V
    //   21: astore #4
    //   23: aload_2
    //   24: invokeinterface iterator : ()Ljava/util/Iterator;
    //   29: astore #5
    //   31: aload #5
    //   33: invokeinterface hasNext : ()Z
    //   38: ifeq -> 87
    //   41: aload #5
    //   43: invokeinterface next : ()Ljava/lang/Object;
    //   48: checkcast org/openapi4j/Zh
    //   51: astore #6
    //   53: aload #4
    //   55: aload #6
    //   57: invokevirtual ZE : ()Ljava/lang/String;
    //   60: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   63: sipush #24731
    //   66: sipush #24725
    //   69: invokestatic a : (II)Ljava/lang/String;
    //   72: iconst_0
    //   73: anewarray java/lang/Object
    //   76: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   79: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   82: pop
    //   83: aload_3
    //   84: ifnonnull -> 31
    //   87: new org/openapi4j/Zp0
    //   90: dup
    //   91: sipush #24730
    //   94: sipush #3688
    //   97: invokestatic a : (II)Ljava/lang/String;
    //   100: iconst_1
    //   101: anewarray java/lang/Object
    //   104: dup
    //   105: iconst_0
    //   106: aload #4
    //   108: invokevirtual toString : ()Ljava/lang/String;
    //   111: aastore
    //   112: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   115: invokespecial <init> : (Ljava/lang/String;)V
    //   118: athrow
    //   119: aload_0
    //   120: getfield ZX : Ljava/util/Map;
    //   123: aload_1
    //   124: invokevirtual ZW : ()Ljava/net/URL;
    //   127: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   132: checkcast com/fasterxml/Zor/Zb
    //   135: astore #4
    //   137: aload_0
    //   138: aload_1
    //   139: invokevirtual Zp : ()Ljava/lang/String;
    //   142: invokevirtual Zj : (Ljava/lang/String;)Ljava/lang/String;
    //   145: astore #5
    //   147: aload #5
    //   149: ldc '/'
    //   151: invokevirtual equals : (Ljava/lang/Object;)Z
    //   154: ifeq -> 165
    //   157: aload #4
    //   159: astore #6
    //   161: aload_3
    //   162: ifnonnull -> 224
    //   165: aload #4
    //   167: aload #5
    //   169: invokevirtual Z_ : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   172: astore #6
    //   174: aload #6
    //   176: invokevirtual ZD : ()Z
    //   179: ifeq -> 224
    //   182: new org/openapi4j/Zp0
    //   185: dup
    //   186: sipush #24728
    //   189: sipush #-16107
    //   192: invokestatic a : (II)Ljava/lang/String;
    //   195: iconst_2
    //   196: anewarray java/lang/Object
    //   199: dup
    //   200: iconst_0
    //   201: aload_1
    //   202: invokevirtual Zp : ()Ljava/lang/String;
    //   205: aastore
    //   206: dup
    //   207: iconst_1
    //   208: aload_1
    //   209: invokevirtual ZW : ()Ljava/net/URL;
    //   212: aastore
    //   213: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   216: invokespecial <init> : (Ljava/lang/String;)V
    //   219: athrow
    //   220: invokestatic a : (Lorg/openapi4j/Zp0;)Lorg/openapi4j/Zp0;
    //   223: athrow
    //   224: aload #6
    //   226: aload_0
    //   227: getfield Zm : Ljava/lang/String;
    //   230: invokevirtual ZL : (Ljava/lang/String;)Lcom/fasterxml/Zor/Zb;
    //   233: astore #7
    //   235: aload #7
    //   237: ifnull -> 268
    //   240: aload_1
    //   241: invokevirtual ZW : ()Ljava/net/URL;
    //   244: aload #7
    //   246: invokevirtual Zz : ()Ljava/lang/String;
    //   249: invokestatic Zb : (Ljava/net/URL;Ljava/lang/String;)Ljava/lang/String;
    //   252: astore #8
    //   254: aload_0
    //   255: aload_0
    //   256: getfield ZH : Lorg/openapi4j/Zp7;
    //   259: aload #8
    //   261: invokevirtual Zg : (Ljava/lang/String;)Lorg/openapi4j/Zh;
    //   264: aload_2
    //   265: invokevirtual Ze : (Lorg/openapi4j/Zh;Ljava/util/Set;)V
    //   268: aload_1
    //   269: aload #6
    //   271: invokevirtual Zo : (Lcom/fasterxml/Zor/Zb;)V
    //   274: return
    // Exception table:
    //   from	to	target	type
    //   174	220	220	org/openapi4j/Zp0
  }
  
  private String Zj(String paramString) {
    int i = paramString.indexOf("#");
    return (i == -1) ? "/" : paramString.substring(i + 1);
  }
  
  private boolean lambda$addRef$0(String paramString, Zb paramZb, Zb paramZb1) {
    if (paramString.equals(paramZb1.ZL(this.Zm).Zz())) {
      ((Zr)paramZb1).Zo(a(24733, 13111), (Zb)paramZb);
      return true;
    } 
    return false;
  }
  
  private static Zp0 a(Zp0 paramZp0) {
    return paramZp0;
  }
  
  static {
    // Byte code:
    //   0: iconst_5
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'lar®²HAXùe×UhLÉxmg§K|uzjk°g&é%EÝ^À>âx\\r­hg»\+o®Þ\\bFsm£Ó!ºÿü5X[~Pz¡'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #33
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #45
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 141
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
    //   67: ldc 'O¾£d¸sIoÃ®«ÓÝ«kÌ©?!Ú´õ_­.ðÂ×¶þMU\\b:ë¹,ic§@%Xb7Ï#LC'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: bipush #47
    //   78: istore_1
    //   79: iconst_m1
    //   80: istore_0
    //   81: bipush #37
    //   83: iinc #0, 1
    //   86: aload_2
    //   87: iload_0
    //   88: dup
    //   89: iload_1
    //   90: iadd
    //   91: invokevirtual substring : (II)Ljava/lang/String;
    //   94: iconst_0
    //   95: goto -> 141
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
    //   128: putstatic org/openapi4j/Zpb.a : [Ljava/lang/String;
    //   131: iconst_5
    //   132: anewarray java/lang/String
    //   135: putstatic org/openapi4j/Zpb.b : [Ljava/lang/String;
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
    //   157: if_icmpgt -> 259
    //   160: dup2
    //   161: swap
    //   162: iload #6
    //   164: dup2_x1
    //   165: caload
    //   166: swap
    //   167: iload #6
    //   169: bipush #7
    //   171: irem
    //   172: tableswitch default -> 241, 0 -> 212, 1 -> 216, 2 -> 221, 3 -> 226, 4 -> 231, 5 -> 236
    //   212: iconst_5
    //   213: goto -> 243
    //   216: bipush #48
    //   218: goto -> 243
    //   221: bipush #35
    //   223: goto -> 243
    //   226: bipush #14
    //   228: goto -> 243
    //   231: bipush #79
    //   233: goto -> 243
    //   236: bipush #48
    //   238: goto -> 243
    //   241: bipush #21
    //   243: ixor
    //   244: ixor
    //   245: i2c
    //   246: castore
    //   247: iinc #6, 1
    //   250: dup
    //   251: ifne -> 259
    //   254: dup2
    //   255: dup_x1
    //   256: goto -> 164
    //   259: dup2_x1
    //   260: pop2
    //   261: dup_x2
    //   262: iload #6
    //   264: if_icmpgt -> 160
    //   267: pop
    //   268: new java/lang/String
    //   271: dup_x1
    //   272: swap
    //   273: invokespecial <init> : ([C)V
    //   276: invokevirtual intern : ()Ljava/lang/String;
    //   279: swap
    //   280: pop
    //   281: swap
    //   282: tableswitch default -> 39, 0 -> 98
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6099) & 0xFFFF;
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
      char c = '';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\openapi4j\Zpb.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */