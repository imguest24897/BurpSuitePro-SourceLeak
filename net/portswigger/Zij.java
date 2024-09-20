package net.portswigger;

import java.nio.ByteBuffer;

public interface Zij {
  public static final Zij ZQ = new Zhl();
  
  static Zij Za(byte[] paramArrayOfbyte) {
    return ZE(ByteBuffer.wrap(paramArrayOfbyte));
  }
  
  static Zij ZE(ByteBuffer paramByteBuffer) {
    return new Zn7(paramByteBuffer);
  }
  
  int Zpu();
  
  void Zo(int paramInt1, byte[] paramArrayOfbyte, int paramInt2);
  
  default byte[] ZiH() {
    byte[] arrayOfByte = new byte[Zpu()];
    Zo(0, arrayOfByte, Zpu());
    return arrayOfByte;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zij.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */