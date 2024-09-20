package burp;

import com.twitter.hpack.Decoder;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Ze55 {
  private final Decoder Ze;
  
  private byte[] ZA;
  
  public Ze55(Zl6g paramZl6g) {
    this.Ze = new Decoder(paramZl6g.Ze(), paramZl6g.ZQ());
  }
  
  public List<Zges> ZZ(byte[] paramArrayOfbyte) throws Zzt7 {
    return ZF(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public List<Zges> ZF(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws Zzt7 {
    LinkedList<Zges> linkedList = new LinkedList();
    Zbqc[] arrayOfZbqc = Zl6g.ZJ();
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    InputStream inputStream = (this.ZA != null) ? Zf(this.ZA, paramArrayOfbyte, paramInt1, paramInt2) : new ByteArrayInputStream(paramArrayOfbyte, paramInt1, paramInt2);
    try {
      try {
        this.Ze.decode(inputStream, linkedList::lambda$decode$0);
      } catch (IOException iOException) {
        throw a(null);
      } 
      this.ZA = (inputStream.available() > 0) ? inputStream.readAllBytes() : null;
      if (arrayOfZbqc != null)
        Zbqc.Zr(new Zbqc[1]); 
      return linkedList;
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.COMMON_RUNTIME_FAILURE);
      throw new Zzt7(Zlxi.COMPRESSION_ERROR);
    } 
  }
  
  private static InputStream Zf(byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, int paramInt1, int paramInt2) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    byteArrayOutputStream.write(paramArrayOfbyte1, 0, paramArrayOfbyte1.length);
    byteArrayOutputStream.write(paramArrayOfbyte2, paramInt1, paramInt2);
    return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
  }
  
  private static void lambda$decode$0(List<Zges> paramList, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, boolean paramBoolean) {
    paramList.add(new Zges(paramArrayOfbyte1, paramArrayOfbyte2));
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze55.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */