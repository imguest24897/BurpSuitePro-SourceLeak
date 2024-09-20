package burp;

import java.nio.CharBuffer;

class Zx9r extends Zxsr implements Ze4r {
  private final int Zi;
  
  private final CharBuffer Ze;
  
  Zx9r(Zkit paramZkit, long paramLong, int paramInt, Zso4 paramZso4) {
    super(paramZkit, paramLong);
    this.Zi = paramInt;
    this.Ze = paramZso4.ZF();
  }
  
  public Zeu4<Ze4r> ZF() {
    return Ze4r.ZK;
  }
  
  public int Zpu() {
    return this.Zi;
  }
  
  public void ZC(Zzdz paramZzdz) {
    paramZzdz.ZP(this);
  }
  
  public void Zb(char[] paramArrayOfchar, int paramInt) {
    Ze(0, paramArrayOfchar, paramInt, this.Zi);
  }
  
  public void Ze(int paramInt1, char[] paramArrayOfchar, int paramInt2, int paramInt3) {
    CharBuffer charBuffer = this.Ze.duplicate();
    charBuffer.position(paramInt1);
    charBuffer.get(paramArrayOfchar, paramInt2, paramInt3);
  }
  
  public Ze4r Z_(char[] paramArrayOfchar) {
    try {
      if (paramArrayOfchar.length != this.Zi)
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.Ze.duplicate().put(paramArrayOfchar);
    return this;
  }
  
  public Ze4r ZL(char[] paramArrayOfchar, int paramInt) {
    return ZH(0, paramArrayOfchar, paramInt, this.Zi);
  }
  
  public Ze4r ZH(int paramInt1, char[] paramArrayOfchar, int paramInt2, int paramInt3) {
    CharBuffer charBuffer = this.Ze.duplicate();
    charBuffer.position(paramInt1);
    String str = Zyl.ZKR();
    try {
      charBuffer.put(paramArrayOfchar, paramInt2, paramInt3);
      if (str != null)
        Zbqc.Zr(new Zbqc[2]); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return this;
  }
  
  public char ZY(int paramInt) {
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < this.Zi)
            return this.Ze.get(paramInt); 
          throw new ArrayIndexOutOfBoundsException();
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public void ZB(int paramInt, char paramChar) {
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < this.Zi) {
            this.Ze.put(paramInt, paramChar);
            return;
          } 
          throw new ArrayIndexOutOfBoundsException();
        } catch (IllegalArgumentException illegalArgumentException) {
          throw a(null);
        }  
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public String toString() {
    return this.Ze.toString();
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zx9r.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */