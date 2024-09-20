package net.portswigger;

class Zlg {
  char[] Zr;
  
  int ZT = 0;
  
  int ZF = 0;
  
  private static final String a;
  
  public Zlg(int paramInt) {
    this.Zr = new char[paramInt];
  }
  
  public void Zv(char paramChar) {
    try {
      this.Zr[this.ZF] = paramChar;
      this.ZF = Zr(this.ZF);
      if (this.ZT != -1)
        try {
          if (this.ZF == this.ZT)
            this.ZT = -1; 
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        }  
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
  }
  
  private int Zr(int paramInt) {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (paramInt == this.Zr.length - 1) ? 0 : (paramInt + 1);
  }
  
  private int ZZ(int paramInt) {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (paramInt == 0) ? (this.Zr.length - 1) : (paramInt - 1);
  }
  
  public char[] ZU() {
    int i = ZC();
    char[] arrayOfChar = new char[i];
    byte b = 0;
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    int j;
    for (j = (this.ZT == -1) ? this.ZF : this.ZT; b < i; j = Zr(j)) {
      arrayOfChar[b] = this.Zr[j];
      b++;
    } 
    return arrayOfChar;
  }
  
  public char Zx() {
    try {
      if (Zm())
        throw new UnsupportedOperationException(a); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (this.ZT == -1)
        this.ZT = this.ZF; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    this.ZF = ZZ(this.ZF);
    return this.Zr[this.ZF];
  }
  
  public int ZC() {
    try {
      if (this.ZT == -1)
        return this.Zr.length; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (this.ZF >= this.ZT)
        return this.ZF - this.ZT; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return this.Zr.length - this.ZT + this.ZF;
  }
  
  public boolean Zm() {
    try {
    
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return (ZC() == 0);
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
  
  static {
    // Byte code:
    //   0: bipush #125
    //   2: ldc ' Q}UNS$RRbUU)uWHF1RVe\^W:R]cV]<RGeJH]:Qt'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/Zlg.a : Ljava/lang/String;
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
    //   80: bipush #15
    //   82: goto -> 112
    //   85: bipush #73
    //   87: goto -> 112
    //   90: bipush #109
    //   92: goto -> 112
    //   95: bipush #71
    //   97: goto -> 112
    //   100: bipush #69
    //   102: goto -> 112
    //   105: bipush #79
    //   107: goto -> 112
    //   110: bipush #53
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zlg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */