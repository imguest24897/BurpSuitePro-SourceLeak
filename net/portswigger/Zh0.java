package net.portswigger;

import java.util.BitSet;
import java.util.EnumSet;

class Zh0 {
  private static Zfh ZS(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
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
    //   92: iflt -> 101
    //   95: iload_0
    //   96: bipush #33
    //   98: if_icmple -> 107
    //   101: iload_0
    //   102: bipush #35
    //   104: if_icmplt -> 131
    //   107: aload_1
    //   108: iconst_2
    //   109: invokevirtual set : (I)V
    //   112: aload_2
    //   113: getstatic net/portswigger/Zfh.LITERAL_STRING : Lnet/portswigger/Zfh;
    //   116: invokevirtual contains : (Ljava/lang/Object;)Z
    //   119: ifeq -> 152
    //   122: getstatic net/portswigger/Zfh.LITERAL_STRING : Lnet/portswigger/Zfh;
    //   125: astore #4
    //   127: aload_3
    //   128: ifnonnull -> 152
    //   131: iload_0
    //   132: bipush #34
    //   134: if_icmpne -> 152
    //   137: aload_2
    //   138: getstatic net/portswigger/Zfh.LITERAL_STRING_CLOSING_QUOTE : Lnet/portswigger/Zfh;
    //   141: invokevirtual contains : (Ljava/lang/Object;)Z
    //   144: ifeq -> 152
    //   147: getstatic net/portswigger/Zfh.LITERAL_STRING_CLOSING_QUOTE : Lnet/portswigger/Zfh;
    //   150: astore #4
    //   152: aload #4
    //   154: areturn
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
  
  private static Zfh Zt(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 92)
      paramBitSet.set(3); 
    if ((paramInt >= 0 && paramInt <= 33) || paramInt >= 35) {
      paramBitSet.set(2);
      if (paramEnumSet.contains(Zfh.LITERAL_STRING))
        zfh = Zfh.LITERAL_STRING; 
    } 
    return zfh;
  }
  
  private static Zfh Zp(int paramInt, BitSet paramBitSet, EnumSet<Zfh> paramEnumSet) {
    Zfh zfh = null;
    if (paramInt == 34) {
      paramBitSet.set(2);
      if (paramEnumSet.contains(Zfh.LITERAL_STRING))
        zfh = Zfh.LITERAL_STRING; 
    } 
    return zfh;
  }
  
  private static void Zv() {
    Zfw[] arrayOfZfw = { Zh0::ZS, Zh0::Zv, Zh0::Zt, Zh0::Zp };
    Zuk.ZC.put(Zzv.WithinLiteralString, arrayOfZfw);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zh0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */