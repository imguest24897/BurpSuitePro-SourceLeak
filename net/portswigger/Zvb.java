package net.portswigger;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Zvb {
  private final Zvz Zh = new Zvz();
  
  private InetAddress Za;
  
  private boolean ZS = false;
  
  private String Zl = "";
  
  private Zus Zf = Zus.ZN();
  
  private Zvw ZT = Zvw.Zu();
  
  private Executor Zy = Executors.newCachedThreadPool();
  
  private boolean Z_;
  
  private Zz2 Zm = new Zz2();
  
  private Integer Zi = Integer.valueOf(10485760);
  
  private Integer ZP = Integer.valueOf(10485760);
  
  public Zv_ Zi(String paramString, Zzw paramZzw, Zhb... paramVarArgs) throws IOException {
    Zmg zmg = Zmg.Zu(paramString);
    String str1 = zmg.Zm;
    int i = zmg.Zw;
    boolean bool = zmg.ZN;
    String str2 = zmg.ZV;
    Zto<Socket, List<Zhb>> zto = ZD(str1, i, bool, str2, this.Zf, this.ZT, paramVarArgs, this.Zm);
    return new Zv_(this.Zy, (Socket)zto.Zq, paramZzw, (List<Zhb>)zto.Zo, this.Z_, Zod.Ze(this.Zi, this.ZP));
  }
  
  private Zto<Socket, List<Zhb>> ZD(String paramString1, int paramInt, boolean paramBoolean, String paramString2, Zus paramZus, Zvw paramZvw, Zhb[] paramArrayOfZhb, Zz2 paramZz2) throws IOException {
    try {
    
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zrxu zrxu = (new Zq2()).Zr(this.Za).Zo(paramString1).Zc(paramInt).ZW(paramBoolean ? this.Zh.ZY(paramZz2) : new Zqc(paramZz2)).Zn();
    return Zv_.Zq(paramArrayOfZhb, zrxu, paramString2, paramZus, paramZvw);
  }
  
  public Zvb ZV(String paramString1, String paramString2) {
    this.ZT = Zvw.Zf(this.ZT, new String[] { paramString1, paramString2 });
    return this;
  }
  
  public Zvb Zq(Executor paramExecutor) {
    this.Zy = paramExecutor;
    return this;
  }
  
  public Zvb ZZ() {
    this.Z_ = true;
    return this;
  }
  
  public Zvb ZJ(boolean paramBoolean) {
    this.Zm.ZF(Boolean.valueOf(paramBoolean));
    return this;
  }
  
  public Zvb ZW(int paramInt) {
    this.Zm.Zm(Integer.valueOf(paramInt));
    return this;
  }
  
  public Zvb ZC(int paramInt) {
    this.Zm.Zw(Integer.valueOf(paramInt));
    return this;
  }
  
  public Zvb Zi() {
    this.Zi = null;
    return this;
  }
  
  public Zvb Zj(int paramInt) {
    this.ZP = Integer.valueOf(paramInt);
    return this;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zvb.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */