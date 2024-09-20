package burp;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class Zsh5 extends ByteArrayOutputStream {
  Zsh5(int paramInt) {
    super(paramInt);
  }
  
  byte ZV(int paramInt) {
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < this.count)
            return this.buf[paramInt]; 
          throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
          throw a(null);
        }  
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      throw a(null);
    } 
    throw new ArrayIndexOutOfBoundsException();
  }
  
  void Zw(int paramInt, byte paramByte) {
    try {
      if (paramInt >= 0)
        try {
          if (paramInt < this.count) {
            this.buf[paramInt] = paramByte;
            return;
          } 
          throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
          throw a(null);
        }  
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      throw a(null);
    } 
    throw new ArrayIndexOutOfBoundsException();
  }
  
  public void ZH(byte[] paramArrayOfbyte) {
    try {
      if (paramArrayOfbyte.length != this.count)
        throw new IllegalArgumentException(); 
    } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
      throw a(null);
    } 
    System.arraycopy(paramArrayOfbyte, 0, this.buf, 0, paramArrayOfbyte.length);
  }
  
  void Zc(OutputStream paramOutputStream, int paramInt1, int paramInt2) throws IOException {
    paramOutputStream.write(this.buf, paramInt1, paramInt2);
  }
  
  void Zl(int paramInt1, byte[] paramArrayOfbyte, int paramInt2) {
    System.arraycopy(this.buf, paramInt1, paramArrayOfbyte, 0, paramInt2);
  }
  
  private static ArrayIndexOutOfBoundsException a(ArrayIndexOutOfBoundsException paramArrayIndexOutOfBoundsException) {
    return paramArrayIndexOutOfBoundsException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsh5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */