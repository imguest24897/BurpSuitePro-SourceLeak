package burp;

class Zg08 {
  private byte[] Zc;
  
  private int ZV = 0;
  
  private int Zx;
  
  Zg08(byte[] paramArrayOfbyte) {
    this.Zc = paramArrayOfbyte;
    this.Zx = paramArrayOfbyte.length;
  }
  
  void Zs(long paramLong) {
    try {
      if (paramLong >= 0L)
        try {
          if (paramLong < this.Zx) {
            this.ZV = (int)paramLong;
            return;
          } 
          throw new IndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
          throw a(null);
        }  
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    throw new IndexOutOfBoundsException();
  }
  
  String ZB() {
    int[] arrayOfInt = Zs9v.ZL();
    String str = "";
    int i;
    while ((i = Zl()) != 0) {
      str = str + str;
      if (arrayOfInt == null)
        break; 
    } 
    return str;
  }
  
  long Zr() {
    return this.ZV;
  }
  
  boolean ZA(byte[] paramArrayOfbyte) {
    int[] arrayOfInt = Zs9v.ZL();
    try {
      if (this.ZV + paramArrayOfbyte.length > this.Zx)
        return false; 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    byte b = 0;
    while (b < paramArrayOfbyte.length) {
      try {
        if (paramArrayOfbyte[b] != this.Zc[this.ZV++])
          return false; 
      } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
        throw a(null);
      } 
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    return true;
  }
  
  void Zk(byte[] paramArrayOfbyte) {
    int[] arrayOfInt = Zs9v.ZL();
    try {
      if (paramArrayOfbyte == null)
        return; 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    byte b = 0;
    while (b < paramArrayOfbyte.length) {
      paramArrayOfbyte[b] = this.Zc[this.ZV++];
      b++;
      if (arrayOfInt == null)
        break; 
    } 
  }
  
  int Zl() {
    return this.Zc[this.ZV++] & 0xFF & 0xFF;
  }
  
  int ZZ() {
    int i = Zl();
    int j = Zl();
    return i & 0xFF | (j & 0xFF) << 8;
  }
  
  long Zh() {
    int i = Zl();
    int j = Zl();
    int k = Zl();
    int m = Zl();
    return i & 0xFFL | (j & 0xFFL) << 8L | (k & 0xFFL) << 16L | (m & 0xFFL) << 24L;
  }
  
  long ZF() {
    int i = Zl();
    int j = Zl();
    int k = Zl();
    int m = Zl();
    int n = Zl();
    int i1 = Zl();
    int i2 = Zl();
    int i3 = Zl();
    int[] arrayOfInt = Zs9v.ZL();
    long l = i & 0xFFL | (j & 0xFFL) << 8L | (k & 0xFFL) << 16L | (m & 0xFFL) << 24L | (n & 0xFFL) << 32L | (i1 & 0xFFL) << 40L | (i2 & 0xFFL) << 48L | (i3 & 0xFFL) << 56L;
    try {
      if (Zbqc.Zwu() == null)
        Zs9v.ZV(new int[4]); 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw a(null);
    } 
    return l;
  }
  
  private static IndexOutOfBoundsException a(IndexOutOfBoundsException paramIndexOutOfBoundsException) {
    return paramIndexOutOfBoundsException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg08.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */