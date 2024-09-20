package burp;

import java.io.ByteArrayOutputStream;

class Zewk {
  private final ByteArrayOutputStream ZE = new ByteArrayOutputStream();
  
  byte[] Zl() {
    return this.ZE.toByteArray();
  }
  
  void ZE(int paramInt) {
    this.ZE.write((byte)(0xFF & paramInt));
  }
  
  void Z_(int paramInt) {
    this.ZE.write(-64);
    this.ZE.write((byte)paramInt);
  }
  
  void Zb() {
    this.ZE.write(-64);
    this.ZE.write(12);
  }
  
  void ZO(long paramLong) {
    this.ZE.write((byte)(int)(paramLong >> 24L & 0xFFL));
    this.ZE.write((byte)(int)(paramLong >> 16L & 0xFFL));
    this.ZE.write((byte)(int)(paramLong >> 8L & 0xFFL));
    this.ZE.write((byte)(int)(paramLong & 0xFFL));
  }
  
  void ZQ(int paramInt) {
    this.ZE.write((byte)(paramInt >> 8 & 0xFF));
    this.ZE.write((byte)(paramInt & 0xFF));
  }
  
  private void ZH(byte[] paramArrayOfbyte) {
    ZE((byte)paramArrayOfbyte.length);
    byte[] arrayOfByte = paramArrayOfbyte;
    boolean bool = Zbjt.ZA();
    int i = arrayOfByte.length;
    byte b = 0;
    while (b < i) {
      byte b1 = arrayOfByte[b];
      ZE(b1);
      b++;
      if (bool)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zewk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */