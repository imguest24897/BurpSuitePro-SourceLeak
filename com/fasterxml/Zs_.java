package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zm.Zo;
import com.fasterxml.Zor.Zyi;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class Zs_ extends Zzg<ByteBuffer> {
  public Zs_() {
    super(ByteBuffer.class);
  }
  
  public void ZR(ByteBuffer paramByteBuffer, Zf paramZf, Zyi paramZyi) throws IOException {
    if (paramByteBuffer.hasArray()) {
      int i = paramByteBuffer.position();
      paramZf.ZI(paramByteBuffer.array(), paramByteBuffer.arrayOffset() + i, paramByteBuffer.limit() - i);
      return;
    } 
    ByteBuffer byteBuffer = paramByteBuffer.asReadOnlyBuffer();
    Zo zo = new Zo(byteBuffer);
    paramZf.ZL((InputStream)zo, byteBuffer.remaining());
    zo.close();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs_.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */