package net.portswigger;

import java.util.BitSet;
import java.util.EnumSet;

class Zfs {
  private static Zkd Zf(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    // Byte code:
    //   0: invokestatic Zy : ()Z
    //   3: aconst_null
    //   4: astore #4
    //   6: istore_3
    //   7: iload_0
    //   8: bipush #92
    //   10: if_icmpne -> 22
    //   13: aload_1
    //   14: iconst_3
    //   15: invokevirtual set : (I)V
    //   18: iload_3
    //   19: ifeq -> 72
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
    //   92: bipush #123
    //   94: if_icmpne -> 116
    //   97: aload_2
    //   98: getstatic net/portswigger/Zkd.VARIABLE_START : Lnet/portswigger/Zkd;
    //   101: invokevirtual contains : (Ljava/lang/Object;)Z
    //   104: ifeq -> 201
    //   107: getstatic net/portswigger/Zkd.VARIABLE_START : Lnet/portswigger/Zkd;
    //   110: astore #4
    //   112: iload_3
    //   113: ifeq -> 201
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
    //   157: iconst_1
    //   158: invokevirtual set : (I)V
    //   161: aload_2
    //   162: getstatic net/portswigger/Zkd.INTERPOLATABLE_STRING_LITERAL : Lnet/portswigger/Zkd;
    //   165: invokevirtual contains : (Ljava/lang/Object;)Z
    //   168: ifeq -> 201
    //   171: getstatic net/portswigger/Zkd.INTERPOLATABLE_STRING_LITERAL : Lnet/portswigger/Zkd;
    //   174: astore #4
    //   176: iload_3
    //   177: ifeq -> 201
    //   180: iload_0
    //   181: bipush #96
    //   183: if_icmpne -> 201
    //   186: aload_2
    //   187: getstatic net/portswigger/Zkd.INTERPOLATABLE_STRING_CLOSING_QUOTE : Lnet/portswigger/Zkd;
    //   190: invokevirtual contains : (Ljava/lang/Object;)Z
    //   193: ifeq -> 201
    //   196: getstatic net/portswigger/Zkd.INTERPOLATABLE_STRING_CLOSING_QUOTE : Lnet/portswigger/Zkd;
    //   199: astore #4
    //   201: aload #4
    //   203: areturn
  }
  
  private static Zkd ZU(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    // Byte code:
    //   0: invokestatic ZN : ()Z
    //   3: aconst_null
    //   4: astore #4
    //   6: istore_3
    //   7: iload_0
    //   8: bipush #92
    //   10: if_icmpne -> 22
    //   13: aload_1
    //   14: iconst_3
    //   15: invokevirtual set : (I)V
    //   18: iload_3
    //   19: ifne -> 82
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
    //   63: iconst_1
    //   64: invokevirtual set : (I)V
    //   67: aload_2
    //   68: getstatic net/portswigger/Zkd.INTERPOLATABLE_STRING_LITERAL : Lnet/portswigger/Zkd;
    //   71: invokevirtual contains : (Ljava/lang/Object;)Z
    //   74: ifeq -> 82
    //   77: getstatic net/portswigger/Zkd.INTERPOLATABLE_STRING_LITERAL : Lnet/portswigger/Zkd;
    //   80: astore #4
    //   82: aload #4
    //   84: areturn
  }
  
  private static Zkd ZK(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt >= 48 && paramInt <= 57) {
      paramBitSet.set(2);
      if (paramEnumSet.contains(Zkd.UNKNOWN_STRING))
        zkd = Zkd.UNKNOWN_STRING; 
    } else if ((paramInt >= 65 && paramInt <= 90) || paramInt == 95 || (paramInt >= 97 && paramInt <= 122)) {
      paramBitSet.set(2);
      if (paramEnumSet.contains(Zkd.UNKNOWN_STRING))
        zkd = Zkd.UNKNOWN_STRING; 
    } 
    return zkd;
  }
  
  private static Zkd ZY(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt >= 0) {
      paramBitSet.set(1);
      if (paramEnumSet.contains(Zkd.INTERPOLATABLE_STRING_LITERAL))
        zkd = Zkd.INTERPOLATABLE_STRING_LITERAL; 
    } 
    return zkd;
  }
  
  private static void Zk() {
    Zch[] arrayOfZch = { Zfs::Zf, Zfs::ZU, Zfs::ZK, Zfs::ZY };
    Zf0.Zo.put(Zrm4.WithinInterpolatableString, arrayOfZch);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zfs.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */