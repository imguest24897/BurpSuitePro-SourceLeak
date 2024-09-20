package burp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.PatternSyntaxException;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Ztwm {
  private static final String[] a;
  
  private static final String[] b;
  
  static void ZW(Zz4g paramZz4g, Zs4f paramZs4f) throws IOException {
    paramZs4f.Zk(a(32182, -13565), paramZz4g.Zvz());
    paramZs4f.Zk(a(32164, 23755), paramZz4g.Zvd());
    paramZs4f.Zk(a(32179, -32551), paramZz4g.Zvg());
    paramZs4f.Zk(a(32183, 3300), paramZz4g.Zvc());
    Zl8c[] arrayOfZl8c = paramZz4g.Zvb();
    String str = Zrrq.Zq();
    if (arrayOfZl8c != null) {
      Zl8c[] arrayOfZl8c1 = arrayOfZl8c;
      int i = arrayOfZl8c1.length;
      byte b = 0;
      while (b < i) {
        Zl8c zl8c = arrayOfZl8c1[b];
        zl8c.ZS(paramZs4f);
        b++;
        if (str != null)
          break; 
      } 
    } 
    paramZs4f.Zk(a(32173, -21045), paramZz4g.Zv_());
    paramZs4f.Zb(a(32160, 24145), paramZz4g.Zvf());
    Zkk3[] arrayOfZkk3 = paramZz4g.ZvZ();
    if (arrayOfZkk3 != null) {
      Zkk3[] arrayOfZkk31 = arrayOfZkk3;
      int i = arrayOfZkk31.length;
      byte b = 0;
      while (b < i) {
        Zkk3 zkk3 = arrayOfZkk31[b];
        paramZs4f.ZX(a(32180, -14429), zkk3);
        b++;
        if (str != null)
          break; 
      } 
    } 
    boolean[] arrayOfBoolean = paramZz4g.ZvW();
    if (arrayOfBoolean != null) {
      boolean[] arrayOfBoolean1 = arrayOfBoolean;
      int i = arrayOfBoolean1.length;
      byte b = 0;
      while (b < i) {
        boolean bool = arrayOfBoolean1[b];
        paramZs4f.Zk(a(32174, -7057), bool);
        b++;
        if (str != null)
          break; 
      } 
    } 
    try {
      paramZs4f.Zk(a(32169, 20277), paramZz4g.ZvO());
      paramZs4f.Zk(a(32161, -12830), paramZz4g.Zvp());
      paramZs4f.Zk(a(32165, 728), paramZz4g.Zva());
      paramZs4f.Zk(a(32177, 3333), paramZz4g.ZvF());
      if (Zbqc.Zwu() == null)
        Zrrq.Zt("jeAMRc"); 
    } catch (IOException iOException) {
      throw a(null);
    } 
  }
  
  public static Zz4g ZH(String paramString, Zgyp paramZgyp, Zr_4 paramZr_4) throws IOException, Ze27 {
    String str = Zrrq.Zq();
    Zgyp zgyp = paramZgyp.Zm(paramString);
    try {
      if (zgyp == null)
        return null; 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    Zz4g zz4g = paramZr_4.<Zz4g>ZH(new Zrrq());
    zz4g.ZVW(zgyp.Zq(a(32171, -20002)).booleanValue());
    zz4g.ZVm(zgyp.Zq(a(32172, 23755)).booleanValue());
    zz4g.ZV_(zgyp.Zq(a(32181, -13064)).booleanValue());
    zz4g.ZVC(zgyp.Zq(a(32167, 83)).booleanValue());
    ArrayList<Zl8c> arrayList = new ArrayList();
    if (zz4g.Zvc()) {
      label66: while (true) {
        String str1 = zgyp.ZW("g");
        if (str1 == null)
          break; 
        try {
          Zl8c zl8c = paramZr_4.<Zl8c>ZH(new Zz46(str1));
          arrayList.add(zl8c);
        } catch (PatternSyntaxException patternSyntaxException) {
          Zah.Zl(patternSyntaxException, Zk_.UNEXPECTED);
        } 
        if (str != null)
          break label66; 
      } 
    } else {
      do {
        byte[] arrayOfByte1 = zgyp.ZI("g");
        if (arrayOfByte1 == null)
          break; 
        Zl8c zl8c = paramZr_4.<Zl8c>ZH(new Zms3(arrayOfByte1));
        arrayList.add(zl8c);
      } while (str == null);
    } 
    if (arrayList.size() > 0) {
      Zl8c[] arrayOfZl8c = new Zl8c[arrayList.size()];
      arrayList.toArray(arrayOfZl8c);
      zz4g.Zz(arrayOfZl8c);
    } 
    zz4g.ZVu(zgyp.Zq(a(32178, -16906)).booleanValue());
    Boolean bool = zgyp.Zq(a(32175, -29156));
    try {
    
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    boolean bool1 = (bool == null) ? false : bool.booleanValue();
    bool = zgyp.Zq(a(32162, -19751));
    try {
    
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    boolean bool2 = (bool == null) ? false : bool.booleanValue();
    bool = zgyp.Zq(a(32168, -24647));
    try {
    
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    boolean bool3 = (bool == null) ? false : bool.booleanValue();
    byte[] arrayOfByte = zgyp.ZI(a(32187, 11176));
    zz4g.Zv(zgyp.ZM(a(32170, -4941)).shortValue());
    ZW(zgyp, zz4g, bool3, bool1, arrayOfByte, bool2, paramZr_4);
    ArrayList<Zkk3> arrayList1 = new ArrayList();
    do {
      Zkk3 zkk3 = Zkk3.Za(a(32163, 21290), zgyp, paramZr_4);
      if (zkk3 == null)
        break; 
      arrayList1.add(zkk3);
    } while (str == null);
    if (arrayList1.size() > 0) {
      Zg05[] arrayOfZg05 = (Zg05[])arrayList1.stream().map(Zkk3::Z_).toArray(Ztwm::lambda$deserialise$0);
      zz4g.ZQ(arrayOfZg05);
    } 
    ArrayList<Boolean> arrayList2 = new ArrayList();
    do {
      bool = zgyp.Zq(a(32186, -25070));
      if (bool == null)
        break; 
      arrayList2.add(bool);
    } while (str == null);
    if (arrayList2.size() > 0) {
      boolean[] arrayOfBoolean = new boolean[arrayList2.size()];
      byte b = 0;
      while (b < arrayOfBoolean.length) {
        arrayOfBoolean[b] = ((Boolean)arrayList2.get(b)).booleanValue();
        b++;
        if (str != null)
          break; 
      } 
      zz4g.Zd(arrayOfBoolean);
    } 
    zz4g.ZVx(zgyp.Zq(a(32166, -14776)).booleanValue());
    zz4g.ZV5(zgyp.Zq(a(32176, -3750)).booleanValue());
    zz4g.ZVG(zgyp.Zq(a(32184, 8650)).booleanValue());
    zz4g.ZVa(zgyp.Zq(a(32185, 30967)).booleanValue());
    zgyp.ZE();
    return zz4g;
  }
  
  private static void ZW(Zgyp paramZgyp, Zz4g paramZz4g, boolean paramBoolean1, boolean paramBoolean2, byte[] paramArrayOfbyte, boolean paramBoolean3, Zr_4 paramZr_4) throws IOException, Ze27 {
    // Byte code:
    //   0: invokestatic Zq : ()Ljava/lang/String;
    //   3: astore #7
    //   5: iload_2
    //   6: ifeq -> 150
    //   9: new java/util/ArrayList
    //   12: dup
    //   13: invokespecial <init> : ()V
    //   16: astore #8
    //   18: aload_0
    //   19: ldc 'e'
    //   21: invokeinterface ZW : (Ljava/lang/String;)Ljava/lang/String;
    //   26: astore #9
    //   28: aload #9
    //   30: ifnonnull -> 36
    //   33: goto -> 95
    //   36: aload #8
    //   38: new burp/Zkk3
    //   41: dup
    //   42: aload #9
    //   44: iload_3
    //   45: aload #4
    //   47: iload #5
    //   49: aload #6
    //   51: new burp/Zxlb
    //   54: dup
    //   55: invokespecial <init> : ()V
    //   58: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   63: checkcast burp/Zg05
    //   66: aload #6
    //   68: invokespecial <init> : (Ljava/lang/String;Z[BZLburp/Zg05;Lburp/Zr_4;)V
    //   71: invokeinterface add : (Ljava/lang/Object;)Z
    //   76: pop
    //   77: goto -> 90
    //   80: astore #10
    //   82: aload #10
    //   84: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   87: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   90: aload #7
    //   92: ifnull -> 18
    //   95: aload #8
    //   97: invokeinterface size : ()I
    //   102: ifle -> 145
    //   105: aload #8
    //   107: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   112: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   117: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   122: <illegal opcode> apply : ()Ljava/util/function/IntFunction;
    //   127: invokeinterface toArray : (Ljava/util/function/IntFunction;)[Ljava/lang/Object;
    //   132: checkcast [Lburp/Zg05;
    //   135: astore #9
    //   137: aload_1
    //   138: aload #9
    //   140: invokeinterface ZQ : ([Lburp/Zg05;)V
    //   145: aload #7
    //   147: ifnull -> 272
    //   150: new java/util/ArrayList
    //   153: dup
    //   154: invokespecial <init> : ()V
    //   157: astore #8
    //   159: aload_0
    //   160: ldc 'e'
    //   162: invokeinterface ZI : (Ljava/lang/String;)[B
    //   167: astore #9
    //   169: aload #9
    //   171: ifnonnull -> 177
    //   174: goto -> 222
    //   177: aload #8
    //   179: new burp/Zkk3
    //   182: dup
    //   183: aload #9
    //   185: aload #4
    //   187: iload #5
    //   189: aload #6
    //   191: new burp/Zxlb
    //   194: dup
    //   195: invokespecial <init> : ()V
    //   198: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   203: checkcast burp/Zg05
    //   206: aload #6
    //   208: invokespecial <init> : ([B[BZLburp/Zg05;Lburp/Zr_4;)V
    //   211: invokeinterface add : (Ljava/lang/Object;)Z
    //   216: pop
    //   217: aload #7
    //   219: ifnull -> 159
    //   222: aload #8
    //   224: invokeinterface size : ()I
    //   229: ifle -> 272
    //   232: aload #8
    //   234: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   239: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   244: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   249: <illegal opcode> apply : ()Ljava/util/function/IntFunction;
    //   254: invokeinterface toArray : (Ljava/util/function/IntFunction;)[Ljava/lang/Object;
    //   259: checkcast [Lburp/Zg05;
    //   262: astore #9
    //   264: aload_1
    //   265: aload #9
    //   267: invokeinterface ZQ : ([Lburp/Zg05;)V
    //   272: return
    // Exception table:
    //   from	to	target	type
    //   36	77	80	java/util/regex/PatternSyntaxException
  }
  
  static boolean Zy(Zz4g paramZz4g, Object paramObject) {
    try {
      if (Zewd.ZI(paramZz4g, (Zgpi)paramObject))
        return true; 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    try {
      if (paramObject != null) {
        try {
          if (paramZz4g.getClass() != paramObject.getClass())
            return false; 
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        } 
      } else {
        return false;
      } 
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    Zz4g zz4g = (Zz4g)paramObject;
    try {
      if (paramZz4g.Zvz() == zz4g.Zvz())
        try {
          if (paramZz4g.Zvd() == zz4g.Zvd())
            try {
              if (paramZz4g.Zvg() == zz4g.Zvg())
                try {
                  if (paramZz4g.Zvc() == zz4g.Zvc())
                    try {
                      if (paramZz4g.Zv_() == zz4g.Zv_())
                        try {
                          if (paramZz4g.Zvf() == zz4g.Zvf())
                            try {
                              if (paramZz4g.ZvO() == zz4g.ZvO())
                                try {
                                  if (paramZz4g.Zvp() == zz4g.Zvp())
                                    try {
                                      if (paramZz4g.Zva() == zz4g.Zva())
                                        try {
                                          if (paramZz4g.ZvF() == zz4g.ZvF())
                                            try {
                                              if (Arrays.equals((Object[])paramZz4g.Zvb(), (Object[])zz4g.Zvb()))
                                                try {
                                                  if (Arrays.equals((Object[])paramZz4g.ZvZ(), (Object[])zz4g.ZvZ()))
                                                    try {
                                                      if (Arrays.equals(paramZz4g.ZvW(), zz4g.ZvW()));
                                                    } catch (PatternSyntaxException patternSyntaxException) {
                                                      throw a(null);
                                                    }  
                                                } catch (PatternSyntaxException patternSyntaxException) {
                                                  throw a(null);
                                                }  
                                            } catch (PatternSyntaxException patternSyntaxException) {
                                              throw a(null);
                                            }  
                                        } catch (PatternSyntaxException patternSyntaxException) {
                                          throw a(null);
                                        }  
                                    } catch (PatternSyntaxException patternSyntaxException) {
                                      throw a(null);
                                    }  
                                } catch (PatternSyntaxException patternSyntaxException) {
                                  throw a(null);
                                }  
                            } catch (PatternSyntaxException patternSyntaxException) {
                              throw a(null);
                            }  
                        } catch (PatternSyntaxException patternSyntaxException) {
                          throw a(null);
                        }  
                    } catch (PatternSyntaxException patternSyntaxException) {
                      throw a(null);
                    }  
                } catch (PatternSyntaxException patternSyntaxException) {
                  throw a(null);
                }  
            } catch (PatternSyntaxException patternSyntaxException) {
              throw a(null);
            }  
        } catch (PatternSyntaxException patternSyntaxException) {
          throw a(null);
        }  
    } catch (PatternSyntaxException patternSyntaxException) {
      throw a(null);
    } 
    return false;
  }
  
  private static Zg05[] lambda$deserialise$0(int paramInt) {
    return new Zg05[paramInt];
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #28
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc 'BB4¡ ïsMz;$¡3³³oæ óytB¥ÕÆªý¡3ëÏTÎ~í£TÛQ&4ó< L1.È®3S\¥>[ «('
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: iconst_3
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #87
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
    //   67: ldc 'º'½&'
    //   69: dup
    //   70: astore_2
    //   71: invokevirtual length : ()I
    //   74: istore #4
    //   76: iconst_2
    //   77: istore_1
    //   78: iconst_m1
    //   79: istore_0
    //   80: bipush #68
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
    //   127: putstatic burp/Ztwm.a : [Ljava/lang/String;
    //   130: bipush #28
    //   132: anewarray java/lang/String
    //   135: putstatic burp/Ztwm.b : [Ljava/lang/String;
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
    //   212: bipush #113
    //   214: goto -> 244
    //   217: bipush #118
    //   219: goto -> 244
    //   222: bipush #69
    //   224: goto -> 244
    //   227: bipush #12
    //   229: goto -> 244
    //   232: bipush #10
    //   234: goto -> 244
    //   237: bipush #73
    //   239: goto -> 244
    //   242: bipush #63
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
    //   283: tableswitch default -> 39, 0 -> 97
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x7DA0) & 0xFFFF;
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
      char c = '§';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztwm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */