package burp;

import java.nio.ByteBuffer;
import java.util.List;

class Zt2j {
  private final Zbip ZL;
  
  Zt2j(Zbip paramZbip) {
    this.ZL = paramZbip;
  }
  
  void ZQ(List<Zsp> paramList, int paramInt, ByteBuffer paramByteBuffer) {
    int i = Zztf.Zg();
    while (paramByteBuffer.remaining() > 0) {
      int j = Math.min(paramByteBuffer.remaining(), this.ZL.Zw());
      byte[] arrayOfByte = new byte[j];
      paramByteBuffer.get(arrayOfByte);
      Zs3 zs3 = new Zs3(paramInt, Zz0x.Zh, arrayOfByte);
      paramList.add(zs3);
      if (i == 0)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt2j.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */