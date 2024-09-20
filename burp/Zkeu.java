package burp;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zkeu {
  private final FileChannel Zv;
  
  private final long Zh;
  
  private final long Zg;
  
  private int ZM;
  
  private final int ZT;
  
  private final Zlrc Zb;
  
  private MappedByteBuffer ZU;
  
  Zkeu(FileChannel paramFileChannel, long paramLong1, long paramLong2, int paramInt1, int paramInt2, int paramInt3, Zlrc paramZlrc) throws Zl4t {
    this.Zv = paramFileChannel;
    this.Zh = paramLong1;
    this.Zg = paramLong2;
    this.ZM = paramInt2;
    this.ZT = paramInt3;
    this.Zb = paramZlrc;
    this.ZU = Zc(paramInt1);
  }
  
  MappedByteBuffer Zk() {
    return this.ZU;
  }
  
  long ZC() {
    return this.Zg;
  }
  
  void ZY(long paramLong) throws Zl4t {
    if (paramLong - this.Zg > this.ZU.capacity()) {
      long l = this.Zg + this.ZU.capacity();
      while (true) {
        l += this.ZM;
        if (this.ZM < this.ZT)
          this.ZM = Math.min(this.ZM * 2, this.ZT); 
        if (l >= paramLong) {
          this.ZU = Zc(l - this.Zg);
          break;
        } 
      } 
    } 
  }
  
  private MappedByteBuffer Zc(long paramLong) throws Zl4t {
    this.Zb.ZE(this.ZM);
    long l = Math.min(paramLong, this.Zh - this.Zg);
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zuh.ZC((this.Zg + l <= this.Zh), Zqf.Zk, l, this.Zh);
    try {
      return this.Zv.map(FileChannel.MapMode.READ_WRITE, this.Zg, l);
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.COMMON_RUNTIME_FAILURE);
      Zv(iOException);
      throw new Zl4t(iOException.getMessage());
    } 
  }
  
  private void Zv(Throwable paramThrowable) {
    if (paramThrowable instanceof OutOfMemoryError)
      throw (OutOfMemoryError)paramThrowable; 
    Throwable throwable = paramThrowable.getCause();
    if (throwable == null)
      return; 
    Zv(throwable);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkeu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */