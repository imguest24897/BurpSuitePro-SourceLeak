package com.fasterxml.Zn;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zor.Zk;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zz0;
import java.io.IOException;

public class Zc extends Zz0<Object> {
  private static final long serialVersionUID = 1L;
  
  protected final Zk Zz;
  
  protected final String ZI;
  
  public Zc(Zk paramZk, String paramString) {
    super(Object.class);
    this.Zz = paramZk;
    this.ZI = paramString;
  }
  
  public void serialize(Object paramObject, Zf paramZf, Zyi paramZyi) throws IOException {
    paramZyi.Zm(this.Zz, this.ZI);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zn\Zc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */