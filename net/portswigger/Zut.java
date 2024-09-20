package net.portswigger;

import java.util.BitSet;
import java.util.EnumSet;

class Zut {
  private static Zfh Zx(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    // Byte code:
    //   0: invokestatic Za : ()[Ljava/lang/String;
    //   3: aconst_null
    //   4: astore #4
    //   6: astore_3
    //   7: iload_0
    //   8: bipush #92
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
    //   92: bipush #123
    //   94: if_icmpne -> 116
    //   97: aload_2
    //   98: getstatic net/portswigger/Zfh.VARIABLE_START : Lnet/portswigger/Zfh;
    //   101: invokevirtual contains : (Ljava/lang/Object;)Z
    //   104: ifeq -> 201
    //   107: getstatic net/portswigger/Zfh.VARIABLE_START : Lnet/portswigger/Zfh;
    //   110: astore #4
    //   112: aload_3
    //   113: ifnonnull -> 201
    //   116: iload_0
    //   117: iflt -> 126
    //   120: iload_0
    //   121: bipush #91
    //   123: if_icmple -> 156
    //   126: iload_0
    //   127: bipush #93
    //   129: if_icmplt -> 138
    //   132: iload_0
    //   133: bipush #95
    //   135: if_icmple -> 156
    //   138: iload_0
    //   139: bipush #97
    //   141: if_icmplt -> 150
    //   144: iload_0
    //   145: bipush #122
    //   147: if_icmple -> 156
    //   150: iload_0
    //   151: bipush #124
    //   153: if_icmplt -> 180
    //   156: aload_1
    //   157: iconst_2
    //   158: invokevirtual set : (I)V
    //   161: aload_2
    //   162: getstatic net/portswigger/Zfh.INTERPOLATABLE_STRING_LITERAL : Lnet/portswigger/Zfh;
    //   165: invokevirtual contains : (Ljava/lang/Object;)Z
    //   168: ifeq -> 201
    //   171: getstatic net/portswigger/Zfh.INTERPOLATABLE_STRING_LITERAL : Lnet/portswigger/Zfh;
    //   174: astore #4
    //   176: aload_3
    //   177: ifnonnull -> 201
    //   180: iload_0
    //   181: bipush #96
    //   183: if_icmpne -> 201
    //   186: aload_2
    //   187: getstatic net/portswigger/Zfh.INTERPOLATABLE_STRING_CLOSING_QUOTE : Lnet/portswigger/Zfh;
    //   190: invokevirtual contains : (Ljava/lang/Object;)Z
    //   193: ifeq -> 201
    //   196: getstatic net/portswigger/Zfh.INTERPOLATABLE_STRING_CLOSING_QUOTE : Lnet/portswigger/Zfh;
    //   199: astore #4
    //   201: aload #4
    //   203: areturn
  }
  
  private static Zfh Zv(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
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
  
  private static Zfh Zc(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    // Byte code:
    //   0: invokestatic Za : ()[Ljava/lang/String;
    //   3: aconst_null
    //   4: astore #4
    //   6: astore_3
    //   7: iload_0
    //   8: bipush #92
    //   10: if_icmpne -> 22
    //   13: aload_1
    //   14: iconst_3
    //   15: invokevirtual set : (I)V
    //   18: aload_3
    //   19: ifnonnull -> 82
    //   22: iload_0
    //   23: iflt -> 32
    //   26: iload_0
    //   27: bipush #91
    //   29: if_icmple -> 62
    //   32: iload_0
    //   33: bipush #93
    //   35: if_icmplt -> 44
    //   38: iload_0
    //   39: bipush #95
    //   41: if_icmple -> 62
    //   44: iload_0
    //   45: bipush #97
    //   47: if_icmplt -> 56
    //   50: iload_0
    //   51: bipush #122
    //   53: if_icmple -> 62
    //   56: iload_0
    //   57: bipush #124
    //   59: if_icmplt -> 82
    //   62: aload_1
    //   63: iconst_2
    //   64: invokevirtual set : (I)V
    //   67: aload_2
    //   68: getstatic net/portswigger/Zfh.INTERPOLATABLE_STRING_LITERAL : Lnet/portswigger/Zfh;
    //   71: invokevirtual contains : (Ljava/lang/Object;)Z
    //   74: ifeq -> 82
    //   77: getstatic net/portswigger/Zfh.INTERPOLATABLE_STRING_LITERAL : Lnet/portswigger/Zfh;
    //   80: astore #4
    //   82: aload #4
    //   84: areturn
  }
  
  private static Zfh ZV(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt >= 0) {
      paramBitSet.set(2);
      if (paramEnumSet.contains(Zfh.INTERPOLATABLE_STRING_LITERAL))
        zfh = Zfh.INTERPOLATABLE_STRING_LITERAL; 
    } 
    return zfh;
  }
  
  private static void Zs() {
    Zfw[] arrayOfZfw = { Zut::Zx, Zut::Zv, Zut::Zc, Zut::ZV };
    Zuk.ZC.put(Zzv.WithinInterpolatableString, arrayOfZfw);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zut.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */