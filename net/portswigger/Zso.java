package net.portswigger;

import java.util.BitSet;
import java.util.EnumSet;

class Zso {
  private static Zkd Zc(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
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
    //   92: iflt -> 101
    //   95: iload_0
    //   96: bipush #33
    //   98: if_icmple -> 107
    //   101: iload_0
    //   102: bipush #35
    //   104: if_icmplt -> 131
    //   107: aload_1
    //   108: iconst_1
    //   109: invokevirtual set : (I)V
    //   112: aload_2
    //   113: getstatic net/portswigger/Zkd.LITERAL_STRING : Lnet/portswigger/Zkd;
    //   116: invokevirtual contains : (Ljava/lang/Object;)Z
    //   119: ifeq -> 152
    //   122: getstatic net/portswigger/Zkd.LITERAL_STRING : Lnet/portswigger/Zkd;
    //   125: astore #4
    //   127: iload_3
    //   128: ifeq -> 152
    //   131: iload_0
    //   132: bipush #34
    //   134: if_icmpne -> 152
    //   137: aload_2
    //   138: getstatic net/portswigger/Zkd.LITERAL_STRING_CLOSING_QUOTE : Lnet/portswigger/Zkd;
    //   141: invokevirtual contains : (Ljava/lang/Object;)Z
    //   144: ifeq -> 152
    //   147: getstatic net/portswigger/Zkd.LITERAL_STRING_CLOSING_QUOTE : Lnet/portswigger/Zkd;
    //   150: astore #4
    //   152: aload #4
    //   154: areturn
  }
  
  private static Zkd Zg(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 92)
      paramBitSet.set(3); 
    if ((paramInt >= 0 && paramInt <= 33) || paramInt >= 35) {
      paramBitSet.set(1);
      if (paramEnumSet.contains(Zkd.LITERAL_STRING))
        zkd = Zkd.LITERAL_STRING; 
    } 
    return zkd;
  }
  
  private static Zkd ZR(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
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
  
  private static Zkd Zb(int paramInt, BitSet paramBitSet, EnumSet<Zkd> paramEnumSet) {
    Zkd zkd = null;
    if (paramInt == 34) {
      paramBitSet.set(1);
      if (paramEnumSet.contains(Zkd.LITERAL_STRING))
        zkd = Zkd.LITERAL_STRING; 
    } 
    return zkd;
  }
  
  private static void Zp() {
    Zch[] arrayOfZch = { Zso::Zc, Zso::Zg, Zso::ZR, Zso::Zb };
    Zf0.Zo.put(Zrm4.WithinLiteralString, arrayOfZch);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zso.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */