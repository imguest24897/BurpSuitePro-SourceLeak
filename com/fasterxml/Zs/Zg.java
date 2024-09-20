package com.fasterxml.Zs;

import com.fasterxml.Zo.Zzb;
import com.fasterxml.Zo.Zzp;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zor.Zyo;
import com.fasterxml.Zp.Zt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;

public class Zg extends Zy {
  private static final long serialVersionUID = 1L;
  
  public Zg(Zk paramZk, Zyo<Object> paramZyo, Zt paramZt, Zzp paramZzp) {
    super(paramZk, paramZyo, paramZt, paramZzp);
  }
  
  protected Zg(Zk paramZk, Zyo<Object> paramZyo1, Zt paramZt, Zzp paramZzp, Zyo<Object> paramZyo2, Zzb paramZzb, Boolean paramBoolean) {
    super(paramZk, paramZyo1, paramZt, paramZzp, paramZyo2, paramZzb, paramBoolean);
  }
  
  protected Zg ZZ(Zyo<?> paramZyo1, Zyo<?> paramZyo2, Zt paramZt, Zzb paramZzb, Boolean paramBoolean) {
    return new Zg(this.Zp, (Zyo)paramZyo2, paramZt, this.ZK, (Zyo)paramZyo1, paramZzb, paramBoolean);
  }
  
  protected Collection<Object> Zh(Zyg paramZyg) throws IOException {
    return null;
  }
  
  protected Collection<Object> ZR(com.fasterxml.Zb.Zg paramZg, Zyg paramZyg, Collection<Object> paramCollection) throws IOException {
    if (paramCollection == null)
      paramCollection = new ArrayList(); 
    paramCollection = super.ZR(paramZg, paramZyg, paramCollection);
    try {
      if (paramCollection.isEmpty())
        return new ArrayBlockingQueue(1, false); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return new ArrayBlockingQueue(paramCollection.size(), false, paramCollection);
  }
  
  public Object Zf(com.fasterxml.Zb.Zg paramZg, Zyg paramZyg, Zt paramZt) throws IOException {
    return paramZt.ZF(paramZg, paramZyg);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zs\Zg.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */