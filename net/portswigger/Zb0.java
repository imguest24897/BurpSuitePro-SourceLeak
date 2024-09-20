package net.portswigger;

import java.util.BitSet;
import java.util.EnumSet;

class Zb0 {
  private static Zkd Zz(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: aconst_null
    //   4: astore #4
    //   6: istore_3
    //   7: iload_0
    //   8: bipush #35
    //   10: if_icmpne -> 22
    //   13: aload_1
    //   14: iconst_1
    //   15: invokevirtual set : (I)V
    //   18: iload_3
    //   19: ifne -> 72
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
    //   53: iconst_3
    //   54: invokevirtual set : (I)V
    //   57: aload_2
    //   58: getstatic net/portswigger/Zkd.UNKNOWN_STRING : Lnet/portswigger/Zkd;
    //   61: invokevirtual contains : (Ljava/lang/Object;)Z
    //   64: ifeq -> 72
    //   67: getstatic net/portswigger/Zkd.UNKNOWN_STRING : Lnet/portswigger/Zkd;
    //   70: astore #4
    //   72: iload_0
    //   73: iflt -> 91
    //   76: aload_2
    //   77: getstatic net/portswigger/Zkd.UNKNOWN : Lnet/portswigger/Zkd;
    //   80: invokevirtual contains : (Ljava/lang/Object;)Z
    //   83: ifeq -> 91
    //   86: getstatic net/portswigger/Zkd.UNKNOWN : Lnet/portswigger/Zkd;
    //   89: astore #4
    //   91: iload_0
    //   92: bipush #96
    //   94: if_icmpne -> 116
    //   97: aload_2
    //   98: getstatic net/portswigger/Zkd.INTERPOLATABLE_STRING_OPENING_QUOTE : Lnet/portswigger/Zkd;
    //   101: invokevirtual contains : (Ljava/lang/Object;)Z
    //   104: ifeq -> 242
    //   107: getstatic net/portswigger/Zkd.INTERPOLATABLE_STRING_OPENING_QUOTE : Lnet/portswigger/Zkd;
    //   110: astore #4
    //   112: iload_3
    //   113: ifne -> 242
    //   116: iload_0
    //   117: bipush #35
    //   119: if_icmpne -> 146
    //   122: aload_1
    //   123: iconst_4
    //   124: invokevirtual set : (I)V
    //   127: aload_2
    //   128: getstatic net/portswigger/Zkd.COMMENT : Lnet/portswigger/Zkd;
    //   131: invokevirtual contains : (Ljava/lang/Object;)Z
    //   134: ifeq -> 242
    //   137: getstatic net/portswigger/Zkd.COMMENT : Lnet/portswigger/Zkd;
    //   140: astore #4
    //   142: iload_3
    //   143: ifne -> 242
    //   146: iload_0
    //   147: bipush #12
    //   149: if_icmpne -> 171
    //   152: aload_2
    //   153: getstatic net/portswigger/Zkd._TOKEN_4 : Lnet/portswigger/Zkd;
    //   156: invokevirtual contains : (Ljava/lang/Object;)Z
    //   159: ifeq -> 242
    //   162: getstatic net/portswigger/Zkd._TOKEN_4 : Lnet/portswigger/Zkd;
    //   165: astore #4
    //   167: iload_3
    //   168: ifne -> 242
    //   171: iload_0
    //   172: bipush #13
    //   174: if_icmpne -> 196
    //   177: aload_2
    //   178: getstatic net/portswigger/Zkd._TOKEN_3 : Lnet/portswigger/Zkd;
    //   181: invokevirtual contains : (Ljava/lang/Object;)Z
    //   184: ifeq -> 242
    //   187: getstatic net/portswigger/Zkd._TOKEN_3 : Lnet/portswigger/Zkd;
    //   190: astore #4
    //   192: iload_3
    //   193: ifne -> 242
    //   196: iload_0
    //   197: bipush #9
    //   199: if_icmpne -> 221
    //   202: aload_2
    //   203: getstatic net/portswigger/Zkd._TOKEN_2 : Lnet/portswigger/Zkd;
    //   206: invokevirtual contains : (Ljava/lang/Object;)Z
    //   209: ifeq -> 242
    //   212: getstatic net/portswigger/Zkd._TOKEN_2 : Lnet/portswigger/Zkd;
    //   215: astore #4
    //   217: iload_3
    //   218: ifne -> 242
    //   221: iload_0
    //   222: bipush #32
    //   224: if_icmpne -> 242
    //   227: aload_2
    //   228: getstatic net/portswigger/Zkd._TOKEN_1 : Lnet/portswigger/Zkd;
    //   231: invokevirtual contains : (Ljava/lang/Object;)Z
    //   234: ifeq -> 242
    //   237: getstatic net/portswigger/Zkd._TOKEN_1 : Lnet/portswigger/Zkd;
    //   240: astore #4
    //   242: aload #4
    //   244: areturn
  }
  
  private static Zkd ZB(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: aconst_null
    //   4: astore #4
    //   6: istore_3
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
    //   36: iconst_1
    //   37: invokevirtual set : (I)V
    //   40: iload_3
    //   41: ifne -> 80
    //   44: iload_0
    //   45: bipush #13
    //   47: if_icmpne -> 59
    //   50: aload_1
    //   51: iconst_2
    //   52: invokevirtual set : (I)V
    //   55: iload_3
    //   56: ifne -> 80
    //   59: iload_0
    //   60: bipush #10
    //   62: if_icmpne -> 80
    //   65: aload_2
    //   66: getstatic net/portswigger/Zkd._TOKEN_5 : Lnet/portswigger/Zkd;
    //   69: invokevirtual contains : (Ljava/lang/Object;)Z
    //   72: ifeq -> 80
    //   75: getstatic net/portswigger/Zkd._TOKEN_5 : Lnet/portswigger/Zkd;
    //   78: astore #4
    //   80: iload_0
    //   81: bipush #13
    //   83: if_icmpne -> 101
    //   86: aload_2
    //   87: getstatic net/portswigger/Zkd._TOKEN_5 : Lnet/portswigger/Zkd;
    //   90: invokevirtual contains : (Ljava/lang/Object;)Z
    //   93: ifeq -> 101
    //   96: getstatic net/portswigger/Zkd._TOKEN_5 : Lnet/portswigger/Zkd;
    //   99: astore #4
    //   101: aload #4
    //   103: areturn
  }
  
  private static Zkd ZW(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 10 && paramEnumSet.contains(Zkd._TOKEN_5))
      zkd = Zkd._TOKEN_5; 
    return zkd;
  }
  
  private static Zkd Zr(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt >= 48 && paramInt <= 57) {
      paramBitSet.set(3);
      if (paramEnumSet.contains(Zkd.UNKNOWN_STRING))
        zkd = Zkd.UNKNOWN_STRING; 
    } else if ((paramInt >= 65 && paramInt <= 90) || paramInt == 95 || (paramInt >= 97 && paramInt <= 122)) {
      paramBitSet.set(3);
      if (paramEnumSet.contains(Zkd.UNKNOWN_STRING))
        zkd = Zkd.UNKNOWN_STRING; 
    } 
    return zkd;
  }
  
  private static Zkd Zy(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if ((paramInt >= 0 && paramInt <= 9) || paramInt == 11 || paramInt == 12 || paramInt >= 14) {
      paramBitSet.set(4);
      if (paramEnumSet.contains(Zkd.COMMENT))
        zkd = Zkd.COMMENT; 
    } 
    return zkd;
  }
  
  private static void ZR() {
    Zch[] arrayOfZch = { Zb0::Zz, Zb0::ZB, Zb0::ZW, Zb0::Zr, Zb0::Zy };
    Zf0.Zo.put(Zrm4.StringOnlyParsing, arrayOfZch);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zb0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */