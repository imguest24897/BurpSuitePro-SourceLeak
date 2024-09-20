package burp;

import com.twitter.hpack.Encoder;
import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Ze0y {
  private final Encoder Zi;
  
  private final Zl6g Zs;
  
  private int ZQ;
  
  public Ze0y(Zl6g paramZl6g) {
    this.Zi = new Encoder(paramZl6g.ZQ());
    this.Zs = paramZl6g;
    this.ZQ = paramZl6g.ZQ();
  }
  
  public byte[] ZY(List<Zges> paramList) throws Zzt7 {
    Zbqc[] arrayOfZbqc = Zl6g.ZJ();
    try {
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      int i = this.Zs.ZQ();
      try {
        if (this.ZQ != i) {
          this.ZQ = i;
          this.Zi.setMaxHeaderTableSize(byteArrayOutputStream, this.ZQ);
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      for (Zges zges : paramList) {
        this.Zi.encodeHeader(byteArrayOutputStream, zges.ZN().getBytes(StandardCharsets.US_ASCII), zges.ZR().getBytes(StandardCharsets.US_ASCII), false);
        if (arrayOfZbqc != null)
          break; 
      } 
      if (Zbqc.Zwu() == null)
        Zl6g.Zs(new Zbqc[3]); 
      return byteArrayOutputStream.toByteArray();
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      throw new Zzt7(Zlxi.COMPRESSION_ERROR);
    } 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze0y.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */