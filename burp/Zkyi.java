package burp;

class Zkyi {
  private static final String a;
  
  static boolean Zk(Zkq7 paramZkq7, Object paramObject) {
    int i = Zegt.ZT();
    if (paramZkq7.ZF(paramObject))
      return true; 
    if (paramObject instanceof Zkq7) {
      Zkq7 zkq7 = (Zkq7)paramObject;
      if (i == 0)
        return (paramZkq7.ZML() != zkq7.ZML()) ? false : ((paramZkq7.ZM3() != zkq7.ZM3()) ? false : (((paramZkq7.ZMm() != null) ? !paramZkq7.ZMm().equals(zkq7.ZMm()) : (zkq7.ZMm() != null)) ? false : (((paramZkq7.ZMp() != null) ? !paramZkq7.ZMp().equals(zkq7.ZMp()) : (zkq7.ZMp() != null)) ? false : ((paramZkq7.ZMg() != null) ? paramZkq7.ZMg().equals(zkq7.ZMg()) : ((zkq7.ZMg() == null)))))); 
    } 
    return false;
  }
  
  static int ZK(Zkq7 paramZkq7) {
    int j = paramZkq7.ZML().ordinal();
    j = 31 * j + paramZkq7.ZM3();
    int i = Zegt.Zg();
    j = 31 * j + ((paramZkq7.ZMm() != null) ? paramZkq7.ZMm().hashCode() : 0);
    j = 31 * j + ((paramZkq7.ZMp() != null) ? paramZkq7.ZMp().hashCode() : 0);
    j = 31 * j + ((paramZkq7.ZMg() != null) ? paramZkq7.ZMg().hashCode() : 0);
    if (Zbqc.Zwu() == null)
      Zegt.Zm(++i); 
    return j;
  }
  
  static String Zj(Zkq7 paramZkq7) {
    return String.format(a, new Object[] { paramZkq7.ZMm(), paramZkq7.ZMp() });
  }
  
  static {
    // Byte code:
    //   0: bipush #86
    //   2: ldc '&\\bs [U d'{T\\fo JCHDgbGqs'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zkyi.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #35
    //   82: goto -> 112
    //   85: bipush #55
    //   87: goto -> 112
    //   90: bipush #66
    //   92: goto -> 112
    //   95: bipush #24
    //   97: goto -> 112
    //   100: bipush #125
    //   102: goto -> 112
    //   105: bipush #46
    //   107: goto -> 112
    //   110: bipush #112
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkyi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */