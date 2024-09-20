package net.portswigger;

import java.nio.ByteBuffer;

class Zn7 implements Zij {
  final ByteBuffer Zx;
  
  Zn7(ByteBuffer paramByteBuffer) {}
  
  public int Zpu() {
    return this.Zx.limit();
  }
  
  public void Zo(int paramInt1, byte[] paramArrayOfbyte, int paramInt2) {
    this.Zx.position(paramInt1);
    this.Zx.get(paramArrayOfbyte, 0, paramInt2);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zn7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */