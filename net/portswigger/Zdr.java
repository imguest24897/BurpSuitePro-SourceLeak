package net.portswigger;

import java.util.BitSet;
import java.util.EnumSet;

class Zdr {
  private static Zfh Zd(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    // Byte code:
    //   0: invokestatic Za : ()[Ljava/lang/String;
    //   3: aconst_null
    //   4: astore #4
    //   6: astore_3
    //   7: iload_0
    //   8: bipush #35
    //   10: if_icmpne -> 22
    //   13: aload_1
    //   14: iconst_2
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
    //   53: iconst_1
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
    //   92: bipush #96
    //   94: if_icmpne -> 116
    //   97: aload_2
    //   98: getstatic net/portswigger/Zfh.INTERPOLATABLE_STRING_OPENING_QUOTE : Lnet/portswigger/Zfh;
    //   101: invokevirtual contains : (Ljava/lang/Object;)Z
    //   104: ifeq -> 242
    //   107: getstatic net/portswigger/Zfh.INTERPOLATABLE_STRING_OPENING_QUOTE : Lnet/portswigger/Zfh;
    //   110: astore #4
    //   112: aload_3
    //   113: ifnonnull -> 242
    //   116: iload_0
    //   117: bipush #35
    //   119: if_icmpne -> 146
    //   122: aload_1
    //   123: iconst_4
    //   124: invokevirtual set : (I)V
    //   127: aload_2
    //   128: getstatic net/portswigger/Zfh.COMMENT : Lnet/portswigger/Zfh;
    //   131: invokevirtual contains : (Ljava/lang/Object;)Z
    //   134: ifeq -> 242
    //   137: getstatic net/portswigger/Zfh.COMMENT : Lnet/portswigger/Zfh;
    //   140: astore #4
    //   142: aload_3
    //   143: ifnonnull -> 242
    //   146: iload_0
    //   147: bipush #12
    //   149: if_icmpne -> 171
    //   152: aload_2
    //   153: getstatic net/portswigger/Zfh._TOKEN_4 : Lnet/portswigger/Zfh;
    //   156: invokevirtual contains : (Ljava/lang/Object;)Z
    //   159: ifeq -> 242
    //   162: getstatic net/portswigger/Zfh._TOKEN_4 : Lnet/portswigger/Zfh;
    //   165: astore #4
    //   167: aload_3
    //   168: ifnonnull -> 242
    //   171: iload_0
    //   172: bipush #13
    //   174: if_icmpne -> 196
    //   177: aload_2
    //   178: getstatic net/portswigger/Zfh._TOKEN_3 : Lnet/portswigger/Zfh;
    //   181: invokevirtual contains : (Ljava/lang/Object;)Z
    //   184: ifeq -> 242
    //   187: getstatic net/portswigger/Zfh._TOKEN_3 : Lnet/portswigger/Zfh;
    //   190: astore #4
    //   192: aload_3
    //   193: ifnonnull -> 242
    //   196: iload_0
    //   197: bipush #9
    //   199: if_icmpne -> 221
    //   202: aload_2
    //   203: getstatic net/portswigger/Zfh._TOKEN_2 : Lnet/portswigger/Zfh;
    //   206: invokevirtual contains : (Ljava/lang/Object;)Z
    //   209: ifeq -> 242
    //   212: getstatic net/portswigger/Zfh._TOKEN_2 : Lnet/portswigger/Zfh;
    //   215: astore #4
    //   217: aload_3
    //   218: ifnonnull -> 242
    //   221: iload_0
    //   222: bipush #32
    //   224: if_icmpne -> 242
    //   227: aload_2
    //   228: getstatic net/portswigger/Zfh._TOKEN_1 : Lnet/portswigger/Zfh;
    //   231: invokevirtual contains : (Ljava/lang/Object;)Z
    //   234: ifeq -> 242
    //   237: getstatic net/portswigger/Zfh._TOKEN_1 : Lnet/portswigger/Zfh;
    //   240: astore #4
    //   242: aload #4
    //   244: areturn
  }
  
  private static Zfh Zz(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt >= 48 && paramInt <= 57) {
      paramBitSet.set(1);
      if (paramEnumSet.contains(Zfh.UNKNOWN_STRING))
        zfh = Zfh.UNKNOWN_STRING; 
    } else if ((paramInt >= 65 && paramInt <= 90) || paramInt == 95 || (paramInt >= 97 && paramInt <= 122)) {
      paramBitSet.set(1);
      if (paramEnumSet.contains(Zfh.UNKNOWN_STRING))
        zfh = Zfh.UNKNOWN_STRING; 
    } 
    return zfh;
  }
  
  private static Zfh ZF(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
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
    //   36: iconst_2
    //   37: invokevirtual set : (I)V
    //   40: aload_3
    //   41: ifnonnull -> 80
    //   44: iload_0
    //   45: bipush #13
    //   47: if_icmpne -> 59
    //   50: aload_1
    //   51: iconst_3
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
  
  private static Zfh ZN(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 10 && paramEnumSet.contains(Zfh._TOKEN_5))
      zfh = Zfh._TOKEN_5; 
    return zfh;
  }
  
  private static Zfh Zf(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if ((paramInt >= 0 && paramInt <= 9) || paramInt == 11 || paramInt == 12 || paramInt >= 14) {
      paramBitSet.set(4);
      if (paramEnumSet.contains(Zfh.COMMENT))
        zfh = Zfh.COMMENT; 
    } 
    return zfh;
  }
  
  private static void Z_() {
    Zfw[] arrayOfZfw = { Zdr::Zd, Zdr::Zz, Zdr::ZF, Zdr::ZN, Zdr::Zf };
    Zuk.ZC.put(Zzv.StringOnlyParsing, arrayOfZfw);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zdr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */