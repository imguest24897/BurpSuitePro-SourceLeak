package burp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.SSLSocket;
import net.portswigger.Zdo;
import net.portswigger.Zli;

public class Zsi5 {
  private final Zbw_<?> Zc;
  
  private final Zz2j Zy;
  
  private final Zml3 Zt;
  
  private final Zbnt ZH;
  
  private final Ztwv ZT;
  
  private final Zkn ZO;
  
  private final Ztbb ZI;
  
  private final Ztae Zl;
  
  private final Zzxf Zg;
  
  private final Zey9 ZD;
  
  private final Zm6x ZZ;
  
  private final AtomicReference<Zxym> Zf;
  
  private final Zkfv Zs;
  
  private final Zzxx ZV;
  
  private Zsxd Z_;
  
  private static final String a;
  
  public Zsi5(Zbw_<?> paramZbw_, Zz2j paramZz2j, Zml3 paramZml3, Zbnt paramZbnt, Ztwv paramZtwv, Zkn paramZkn, Ztbb paramZtbb, Ztae paramZtae, Zzxf paramZzxf, Zey9 paramZey9, Zkfv paramZkfv, Zm6x paramZm6x, Zzxx paramZzxx) {
    this.Zc = paramZbw_;
    this.Zy = paramZz2j;
    this.Zt = paramZml3;
    this.ZH = paramZbnt;
    this.ZT = paramZtwv;
    this.ZO = paramZkn;
    this.ZI = paramZtbb;
    this.Zl = paramZtae;
    this.Zg = paramZzxf;
    this.ZD = paramZey9;
    this.ZZ = paramZm6x;
    this.Zs = paramZkfv;
    this.ZV = paramZzxx;
    this.Zf = new AtomicReference<>();
  }
  
  void Ze() throws Zz8h, IOException, Zs2o {
    ZR();
    ZU();
    Zi();
    Zo();
    ZZ();
    Zg();
    ZS();
    Zr();
    Zd();
    ZY();
    ZW();
    Zx();
    Ztyh.Zc();
  }
  
  private void ZR() throws Zz8h, Zs2o {
    Objects.requireNonNull(this.Zf);
    Ztyd ztyd = new Ztyd(this.Zy, this.Zc, this.Zt.Zu(), this.Zt.Zd(), this.ZH, this.ZT, this.Zl, this.Zf::set, this.ZD, this.Zs);
    ztyd.ZI();
    this.Z_ = ztyd.ZH();
    Zb6q zb6q = this.Z_.ZG().Ze();
    try {
    
    } catch (Zz8h zz8h) {
      throw a(null);
    } 
    byte[] arrayOfByte = (zb6q == null) ? null : zb6q.Za().ZiD();
    this.Zy.Zc(arrayOfByte);
  }
  
  void ZU() {
    String str = this.Z_.ZZ();
    if (str != null)
      this.Zt.Zd().Zxg(str); 
    byte b = this.Z_.Zn();
    if (b != 0)
      this.Zt.Zd().ZB(b); 
  }
  
  void Zi() {
    Zk9u zk9u = new Zk9u(this.Zy, this.Zc.ZFM());
    zk9u.ZY();
    if (zk9u.ZC())
      this.Zy.Zc(zk9u.ZT()); 
  }
  
  void Zo() {
    this.Zc.ZFN().Zu(this.Zt.Zd(), this.Zy.Zo(), this.Zy.ZO());
  }
  
  void ZW() {
    (new Zmn(this.Zy, this.Z_.ZE().toMillis(), this.Zt.Zd(), this.ZO)).ZQ();
  }
  
  void ZZ() {
    Zlbg zlbg = new Zlbg(this.Zy.Zt());
    Zz1p zz1p = this.Zy.Zk();
    Zlit zlit = (zz1p == null) ? null : zz1p.Zo;
    if (this.Zc.ZJ(zlbg, false, zlit))
      this.Zy.Zv(zlbg.ZY()); 
  }
  
  void Zg() {
    byte[] arrayOfByte1 = this.Zy.Zt();
    byte[] arrayOfByte2 = this.Zc.ZV(arrayOfByte1, this.Zy.Zo());
    if (arrayOfByte2 != arrayOfByte1) {
      arrayOfByte2 = Zsbj.ZQ(arrayOfByte2);
      this.Zy.Zv(arrayOfByte2);
    } 
  }
  
  void ZS() throws Zz87 {
    byte[] arrayOfByte1 = this.Zy.Zt();
    Zbx3 zbx3 = new Zbx3(this.Zt, this.Zc, false, arrayOfByte1, this.Zy.ZM(), this.ZH, this.Zc.ZFa().ZM(), this.ZZ, this.ZV);
    zbx3.Zl();
    byte[] arrayOfByte2 = zbx3.Zz();
    try {
      if (arrayOfByte2 != arrayOfByte1)
        try {
          if (!Arrays.equals(arrayOfByte2, arrayOfByte1))
            this.Zy.Zt(arrayOfByte2); 
        } catch (Zz87 zz87) {
          throw a(null);
        }  
    } catch (Zz87 zz87) {
      throw a(null);
    } 
  }
  
  void Zr() {
    Zeo2 zeo2 = this.Zt.Zd();
    zeo2.Zp(this.Zy.ZF());
    zeo2.Zh(this.Zy.Zv());
  }
  
  void Zd() {
    Zeo2 zeo2 = this.Zt.Zd();
    zeo2.Zo(this.Z_.ZG().ZQ());
    zeo2.ZM(this.Z_.ZL());
    zeo2.ZG(this.Z_.ZE());
  }
  
  void ZY() {
    Zeo2 zeo2 = this.Zt.Zd();
    if (this.Zg.ZE(zeo2.ZlL())) {
      Zeo2 zeo21 = this.Zc.ZFN().Zx(zeo2);
      this.Zt.Zq(zeo21);
    } 
  }
  
  void Zx() throws IOException {
    Socket socket = this.Zt.Zu();
    int i = socket.getSoTimeout();
    socket.setSoTimeout(120000);
    String[] arrayOfString = Zz2j.ZJ();
    Za(socket, socket.getOutputStream(), this.Zt.ZZ());
    Zxym zxym = this.Zf.get();
    try {
      if (zxym != null) {
        try {
          socket.setSoTimeout(i);
          zxym.Zt();
          if (arrayOfString == null) {
            Zsdz.ZW(socket);
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zsdz.ZW(socket);
  }
  
  private void Za(Socket paramSocket, OutputStream paramOutputStream, Zmzk paramZmzk) throws IOException {
    // Byte code:
    //   0: invokestatic ZJ : ()[Ljava/lang/String;
    //   3: astore #4
    //   5: aload_0
    //   6: getfield Zy : Lburp/Zz2j;
    //   9: invokevirtual Zt : ()[B
    //   12: astore #5
    //   14: aload_0
    //   15: aload_1
    //   16: aload_3
    //   17: aload #5
    //   19: invokevirtual Ze : (Ljava/net/Socket;Lburp/Zmzk;[B)Z
    //   22: ifeq -> 62
    //   25: aload_2
    //   26: getstatic net/portswigger/Zdo.Zc : [B
    //   29: invokevirtual write : ([B)V
    //   32: aload_2
    //   33: aload #5
    //   35: getstatic net/portswigger/Zdo.Z_ : [B
    //   38: arraylength
    //   39: aload #5
    //   41: arraylength
    //   42: getstatic net/portswigger/Zdo.Z_ : [B
    //   45: arraylength
    //   46: isub
    //   47: invokevirtual write : ([BII)V
    //   50: aload #4
    //   52: ifnonnull -> 75
    //   55: goto -> 62
    //   58: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   61: athrow
    //   62: aload_2
    //   63: aload #5
    //   65: invokevirtual write : ([B)V
    //   68: goto -> 75
    //   71: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   74: athrow
    //   75: aload_2
    //   76: invokevirtual flush : ()V
    //   79: return
    // Exception table:
    //   from	to	target	type
    //   14	55	58	java/io/IOException
    //   25	68	71	java/io/IOException
  }
  
  private boolean Ze(Socket paramSocket, Zmzk paramZmzk, byte[] paramArrayOfbyte) {
    boolean bool = paramSocket instanceof SSLSocket;
    if (bool) {
      SSLSocket sSLSocket = (SSLSocket)paramSocket;
      return Zw(sSLSocket, paramZmzk, paramArrayOfbyte);
    } 
    return Zli.ZB(paramArrayOfbyte, Zdo.Z_, 0);
  }
  
  private boolean Zw(SSLSocket paramSSLSocket, Zmzk paramZmzk, byte[] paramArrayOfbyte) {
    return (ZD(paramZmzk) && !ZR(paramSSLSocket)) ? Zli.ZB(paramArrayOfbyte, Zdo.Z_, 0) : false;
  }
  
  private boolean ZD(Zmzk paramZmzk) {
    return (this.ZI.ZP(paramZmzk).equals(Zxk3.HTTP_V2) && paramZmzk.ZJZ());
  }
  
  private static boolean ZR(SSLSocket paramSSLSocket) {
    return a.equals(paramSSLSocket.getApplicationProtocol());
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: bipush #100
    //   2: ldc 'D8'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zsi5.a : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #72
    //   82: goto -> 112
    //   85: bipush #110
    //   87: goto -> 112
    //   90: bipush #43
    //   92: goto -> 112
    //   95: bipush #101
    //   97: goto -> 112
    //   100: bipush #105
    //   102: goto -> 112
    //   105: bipush #34
    //   107: goto -> 112
    //   110: bipush #37
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsi5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */