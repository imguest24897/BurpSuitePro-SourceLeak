package net.portswigger;

import java.util.BitSet;
import java.util.EnumSet;

class Zo4 {
  private static Zfh ZW(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    // Byte code:
    //   0: invokestatic Za : ()[Ljava/lang/String;
    //   3: aconst_null
    //   4: astore #4
    //   6: astore_3
    //   7: iload_0
    //   8: bipush #35
    //   10: if_icmpne -> 22
    //   13: aload_1
    //   14: iconst_3
    //   15: invokevirtual set : (I)V
    //   18: aload_3
    //   19: ifnonnull -> 72
    //   22: iload_0
    //   23: bipush #65
    //   25: if_icmplt -> 34
    //   28: iload_0
    //   29: bipush #90
    //   31: if_icmple -> 52
    //   34: iload_0
    //   35: bipush #95
    //   37: if_icmpeq -> 52
    //   40: iload_0
    //   41: bipush #97
    //   43: if_icmplt -> 72
    //   46: iload_0
    //   47: bipush #122
    //   49: if_icmpgt -> 72
    //   52: aload_1
    //   53: iconst_2
    //   54: invokevirtual set : (I)V
    //   57: aload_2
    //   58: getstatic net/portswigger/Zfh.UNKNOWN_STRING : Lnet/portswigger/Zfh;
    //   61: invokevirtual contains : (Ljava/lang/Object;)Z
    //   64: ifeq -> 72
    //   67: getstatic net/portswigger/Zfh.UNKNOWN_STRING : Lnet/portswigger/Zfh;
    //   70: astore #4
    //   72: iload_0
    //   73: iflt -> 91
    //   76: aload_2
    //   77: getstatic net/portswigger/Zfh.UNKNOWN : Lnet/portswigger/Zfh;
    //   80: invokevirtual contains : (Ljava/lang/Object;)Z
    //   83: ifeq -> 91
    //   86: getstatic net/portswigger/Zfh.UNKNOWN : Lnet/portswigger/Zfh;
    //   89: astore #4
    //   91: iload_0
    //   92: bipush #65
    //   94: if_icmplt -> 103
    //   97: iload_0
    //   98: bipush #90
    //   100: if_icmple -> 121
    //   103: iload_0
    //   104: bipush #95
    //   106: if_icmpeq -> 121
    //   109: iload_0
    //   110: bipush #97
    //   112: if_icmplt -> 145
    //   115: iload_0
    //   116: bipush #122
    //   118: if_icmpgt -> 145
    //   121: aload_1
    //   122: iconst_5
    //   123: invokevirtual set : (I)V
    //   126: aload_2
    //   127: getstatic net/portswigger/Zfh.REQUEST_NAME : Lnet/portswigger/Zfh;
    //   130: invokevirtual contains : (Ljava/lang/Object;)Z
    //   133: ifeq -> 296
    //   136: getstatic net/portswigger/Zfh.REQUEST_NAME : Lnet/portswigger/Zfh;
    //   139: astore #4
    //   141: aload_3
    //   142: ifnonnull -> 296
    //   145: iload_0
    //   146: bipush #10
    //   148: if_icmpne -> 170
    //   151: aload_2
    //   152: getstatic net/portswigger/Zfh.NEWLINE : Lnet/portswigger/Zfh;
    //   155: invokevirtual contains : (Ljava/lang/Object;)Z
    //   158: ifeq -> 296
    //   161: getstatic net/portswigger/Zfh.NEWLINE : Lnet/portswigger/Zfh;
    //   164: astore #4
    //   166: aload_3
    //   167: ifnonnull -> 296
    //   170: iload_0
    //   171: bipush #35
    //   173: if_icmpne -> 200
    //   176: aload_1
    //   177: iconst_1
    //   178: invokevirtual set : (I)V
    //   181: aload_2
    //   182: getstatic net/portswigger/Zfh.COMMENT : Lnet/portswigger/Zfh;
    //   185: invokevirtual contains : (Ljava/lang/Object;)Z
    //   188: ifeq -> 296
    //   191: getstatic net/portswigger/Zfh.COMMENT : Lnet/portswigger/Zfh;
    //   194: astore #4
    //   196: aload_3
    //   197: ifnonnull -> 296
    //   200: iload_0
    //   201: bipush #12
    //   203: if_icmpne -> 225
    //   206: aload_2
    //   207: getstatic net/portswigger/Zfh._TOKEN_4 : Lnet/portswigger/Zfh;
    //   210: invokevirtual contains : (Ljava/lang/Object;)Z
    //   213: ifeq -> 296
    //   216: getstatic net/portswigger/Zfh._TOKEN_4 : Lnet/portswigger/Zfh;
    //   219: astore #4
    //   221: aload_3
    //   222: ifnonnull -> 296
    //   225: iload_0
    //   226: bipush #13
    //   228: if_icmpne -> 250
    //   231: aload_2
    //   232: getstatic net/portswigger/Zfh._TOKEN_3 : Lnet/portswigger/Zfh;
    //   235: invokevirtual contains : (Ljava/lang/Object;)Z
    //   238: ifeq -> 296
    //   241: getstatic net/portswigger/Zfh._TOKEN_3 : Lnet/portswigger/Zfh;
    //   244: astore #4
    //   246: aload_3
    //   247: ifnonnull -> 296
    //   250: iload_0
    //   251: bipush #9
    //   253: if_icmpne -> 275
    //   256: aload_2
    //   257: getstatic net/portswigger/Zfh._TOKEN_2 : Lnet/portswigger/Zfh;
    //   260: invokevirtual contains : (Ljava/lang/Object;)Z
    //   263: ifeq -> 296
    //   266: getstatic net/portswigger/Zfh._TOKEN_2 : Lnet/portswigger/Zfh;
    //   269: astore #4
    //   271: aload_3
    //   272: ifnonnull -> 296
    //   275: iload_0
    //   276: bipush #32
    //   278: if_icmpne -> 296
    //   281: aload_2
    //   282: getstatic net/portswigger/Zfh._TOKEN_1 : Lnet/portswigger/Zfh;
    //   285: invokevirtual contains : (Ljava/lang/Object;)Z
    //   288: ifeq -> 296
    //   291: getstatic net/portswigger/Zfh._TOKEN_1 : Lnet/portswigger/Zfh;
    //   294: astore #4
    //   296: aload #4
    //   298: areturn
  }
  
  private static Zfh Za(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if ((paramInt >= 0 && paramInt <= 9) || paramInt == 11 || paramInt == 12 || paramInt >= 14) {
      paramBitSet.set(1);
      if (paramEnumSet.contains(Zfh.COMMENT))
        zfh = Zfh.COMMENT; 
    } 
    return zfh;
  }
  
  private static Zfh ZF(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt >= 48 && paramInt <= 57) {
      paramBitSet.set(2);
      if (paramEnumSet.contains(Zfh.UNKNOWN_STRING))
        zfh = Zfh.UNKNOWN_STRING; 
    } else if ((paramInt >= 65 && paramInt <= 90) || paramInt == 95 || (paramInt >= 97 && paramInt <= 122)) {
      paramBitSet.set(2);
      if (paramEnumSet.contains(Zfh.UNKNOWN_STRING))
        zfh = Zfh.UNKNOWN_STRING; 
    } 
    return zfh;
  }
  
  private static Zfh Zc(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    // Byte code:
    //   0: invokestatic Za : ()[Ljava/lang/String;
    //   3: aconst_null
    //   4: astore #4
    //   6: astore_3
    //   7: iload_0
    //   8: iflt -> 17
    //   11: iload_0
    //   12: bipush #9
    //   14: if_icmple -> 35
    //   17: iload_0
    //   18: bipush #11
    //   20: if_icmpeq -> 35
    //   23: iload_0
    //   24: bipush #12
    //   26: if_icmpeq -> 35
    //   29: iload_0
    //   30: bipush #14
    //   32: if_icmplt -> 44
    //   35: aload_1
    //   36: iconst_3
    //   37: invokevirtual set : (I)V
    //   40: aload_3
    //   41: ifnonnull -> 80
    //   44: iload_0
    //   45: bipush #13
    //   47: if_icmpne -> 59
    //   50: aload_1
    //   51: iconst_4
    //   52: invokevirtual set : (I)V
    //   55: aload_3
    //   56: ifnonnull -> 80
    //   59: iload_0
    //   60: bipush #10
    //   62: if_icmpne -> 80
    //   65: aload_2
    //   66: getstatic net/portswigger/Zfh._TOKEN_5 : Lnet/portswigger/Zfh;
    //   69: invokevirtual contains : (Ljava/lang/Object;)Z
    //   72: ifeq -> 80
    //   75: getstatic net/portswigger/Zfh._TOKEN_5 : Lnet/portswigger/Zfh;
    //   78: astore #4
    //   80: iload_0
    //   81: bipush #13
    //   83: if_icmpne -> 101
    //   86: aload_2
    //   87: getstatic net/portswigger/Zfh._TOKEN_5 : Lnet/portswigger/Zfh;
    //   90: invokevirtual contains : (Ljava/lang/Object;)Z
    //   93: ifeq -> 101
    //   96: getstatic net/portswigger/Zfh._TOKEN_5 : Lnet/portswigger/Zfh;
    //   99: astore #4
    //   101: aload #4
    //   103: areturn
  }
  
  private static Zfh Zv(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 10 && paramEnumSet.contains(Zfh._TOKEN_5))
      zfh = Zfh._TOKEN_5; 
    return zfh;
  }
  
  private static Zfh ZL(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt >= 48 && paramInt <= 57) {
      paramBitSet.set(5);
      if (paramEnumSet.contains(Zfh.REQUEST_NAME))
        zfh = Zfh.REQUEST_NAME; 
    } else if ((paramInt >= 65 && paramInt <= 90) || paramInt == 95 || (paramInt >= 97 && paramInt <= 122)) {
      paramBitSet.set(5);
      if (paramEnumSet.contains(Zfh.REQUEST_NAME))
        zfh = Zfh.REQUEST_NAME; 
    } 
    return zfh;
  }
  
  private static void Zj() {
    Zfw[] arrayOfZfw = { Zo4::ZW, Zo4::Za, Zo4::ZF, Zo4::Zc, Zo4::Zv, Zo4::ZL };
    Zuk.ZC.put(Zzv.RequestNaming, arrayOfZfw);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zo4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */