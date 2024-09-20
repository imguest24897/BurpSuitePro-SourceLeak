package burp;

import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import javax.net.ssl.SSLSocketFactory;

public class Zziw implements Zml3 {
  private static final AtomicInteger Zw = new AtomicInteger();
  
  private final Zz2j ZT;
  
  private final Zs9s ZE;
  
  private final Zxoo ZH;
  
  private final Supplier<InetAddress> ZI;
  
  private final int ZR;
  
  private Socket Zp;
  
  private Zeo2 Zz;
  
  private boolean ZP;
  
  private boolean Z_;
  
  Zziw(Zz2j paramZz2j, Socket paramSocket, Zs9s paramZs9s, Zxoo paramZxoo, Supplier<InetAddress> paramSupplier) {
    this.ZT = paramZz2j;
    this.Zp = paramSocket;
    this.ZE = paramZs9s;
    this.ZH = paramZxoo;
    this.ZI = paramSupplier;
    this.ZR = Zw.getAndIncrement();
  }
  
  public Zsmh Zf() {
    return this.ZT.ZH();
  }
  
  public byte[] ZC() {
    return this.ZT.ZA();
  }
  
  public byte[] Zh() {
    return this.ZT.Zt();
  }
  
  public Zz1p Zi() {
    return this.ZT.Zk();
  }
  
  public Zs68 ZP() {
    return this.ZT.Zo();
  }
  
  public Zeo2 Zd() {
    return this.Zz;
  }
  
  public void Zq(Zeo2 paramZeo2) {
    this.Zz = paramZeo2;
  }
  
  public int ZR() {
    return this.Zp.getLocalPort();
  }
  
  public InetAddress ZX() {
    return this.ZI.get();
  }
  
  public boolean Zp() {
    return this.ZP;
  }
  
  public boolean Zn() {
    return (null != this.ZT.ZU());
  }
  
  public Socket Zu() {
    return this.Zp;
  }
  
  public Zs9s ZL() {
    return this.ZE;
  }
  
  public SSLSocketFactory ZP(String paramString, int paramInt) {
    return this.ZH.ZP(paramString, paramInt);
  }
  
  public int ZD() {
    return this.ZR;
  }
  
  public void Z_(boolean paramBoolean) {
    this.ZP = paramBoolean;
  }
  
  public void ZH(boolean paramBoolean) {
    this.Z_ = paramBoolean;
  }
  
  public boolean ZJ() {
    return this.Z_;
  }
  
  public Zmzk ZZ() {
    return this.ZT.Zx();
  }
  
  void Zj(Socket paramSocket) {
    this.Zp = paramSocket;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zziw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */