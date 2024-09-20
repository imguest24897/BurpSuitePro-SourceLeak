package net.portswigger;

import java.io.Closeable;
import java.io.IOException;
import java.util.function.Consumer;

public class Zo8 implements Closeable {
  private final Znm ZG;
  
  private final Zrxu Zy;
  
  private final Zus ZK;
  
  private final String ZV;
  
  private final Consumer<Zti> Zt;
  
  private Zo8(Znm paramZnm, Zrxu paramZrxu, Zus paramZus, String paramString, Consumer<Zti> paramConsumer) {
    this.ZG = paramZnm;
    this.Zy = paramZrxu;
    this.ZK = paramZus;
    this.ZV = (paramString == null) ? "" : paramString;
    this.Zt = paramConsumer;
  }
  
  public Zfn ZR(String paramString1, String paramString2) {
    return new Zfn(this, paramString1, paramString2);
  }
  
  public void close() throws IOException {
    this.ZG.ZD();
  }
  
  public boolean ZZ() {
    return this.ZG.ZK();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zo8.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */