package com.fasterxml.Zs;

import com.fasterxml.Zb.Zd;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zh.Zd;
import com.fasterxml.Zm.Za;
import com.fasterxml.Zor.Zyg;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

public class Zu2 extends Zuy<ByteBuffer> {
  private static final long serialVersionUID = 1L;
  
  protected Zu2() {
    super(ByteBuffer.class);
  }
  
  public Zd Zb() {
    return Zd.Binary;
  }
  
  public ByteBuffer ZJ(Zg paramZg, Zyg paramZyg) throws IOException {
    byte[] arrayOfByte = paramZg.Za();
    return ByteBuffer.wrap(arrayOfByte);
  }
  
  public ByteBuffer ZD(Zg paramZg, Zyg paramZyg, ByteBuffer paramByteBuffer) throws IOException {
    Za za = new Za(paramByteBuffer);
    paramZg.Zh(paramZyg.Zs(), (OutputStream)za);
    za.close();
    return paramByteBuffer;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zu2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */