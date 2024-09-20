package burp;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

public class Zso4 {
  private final ByteBuffer Zf;
  
  private final int ZH;
  
  public Zso4(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2) {
    this.Zf = paramByteBuffer.duplicate();
    this.ZH = paramInt2;
    this.Zf.position(paramInt1);
    this.Zf.limit(paramInt1 + paramInt2);
  }
  
  public ByteBuffer ZR() {
    return this.Zf.duplicate();
  }
  
  public CharBuffer ZF() {
    return this.Zf.asCharBuffer();
  }
  
  public ShortBuffer ZA() {
    return this.Zf.asShortBuffer();
  }
  
  public IntBuffer ZB() {
    return this.Zf.asIntBuffer();
  }
  
  public LongBuffer Z_() {
    return this.Zf.asLongBuffer();
  }
  
  public void ZH(ByteBuffer paramByteBuffer) {
    try {
      if (paramByteBuffer.remaining() != this.ZH)
        throw new IllegalArgumentException(); 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.Zf.duplicate().put(paramByteBuffer.duplicate());
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zso4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */