package burp;

import java.io.IOException;
import java.net.Socket;
import java.util.Objects;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLSocket;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zlb7 implements Zxrx {
  private static final Zkd1 Zb;
  
  private static final Socket Zc;
  
  private final Zrgd Zw;
  
  private final Zbw_<?> Zf;
  
  private final Zkl6 ZE;
  
  private final Zgb6 Zo;
  
  private final Zskh ZI;
  
  private final Zzxf Zj;
  
  private final Ztwv ZS;
  
  private final Zkn ZW;
  
  private final String ZX;
  
  private final Zzw0 Zx;
  
  private final Zmdb ZC;
  
  private final Zrpo Zz;
  
  private final Zm6x ZF;
  
  private final Ze6o Zh;
  
  private final Ztae ZQ;
  
  private final Zzxx ZP;
  
  private final Ze47 Zq;
  
  private static final String a;
  
  public Zlb7(Zrgd paramZrgd, Zbw_<?> paramZbw_, Zkl6 paramZkl6, Zgb6 paramZgb6, Zskh paramZskh, Zzxf paramZzxf, Ztwv paramZtwv, Zkn paramZkn, Zr3p paramZr3p, String paramString, Ze6o paramZe6o, Zzw0 paramZzw0, Zmdb paramZmdb, Zm6x paramZm6x, Zs_y paramZs_y, Zlcx paramZlcx, Ze47 paramZe47) {
    this.Zw = paramZrgd;
    this.Zf = paramZbw_;
    this.ZE = paramZkl6;
    this.Zo = paramZgb6;
    this.Zj = paramZzxf;
    this.ZI = paramZskh;
    this.ZS = paramZtwv;
    this.ZW = paramZkn;
    this.ZX = paramString;
    this.Zh = paramZe6o;
    this.Zx = paramZzw0;
    this.ZC = paramZmdb;
    this.Zq = paramZe47;
    this.ZF = paramZm6x;
    this.Zz = new Zlci(paramZbw_.ZFM(), paramZbw_.ZFY());
    this.ZP = new Zzxx(paramZgb6, paramZrgd, paramZkl6.Zq(), paramZkl6.Zd(), paramZlcx);
    this.ZQ = Ztae.Zm(paramZbw_, paramZr3p, paramZm6x, paramZs_y, this.ZP);
  }
  
  public Zb2f ZD(Socket paramSocket, Zi8 paramZi8, boolean paramBoolean1, boolean paramBoolean2, Zs9s paramZs9s) {
    Objects.requireNonNull(paramZs9s);
    return new Zb2f(this.Zw, this.Zf, paramSocket, paramZi8, paramBoolean1, paramBoolean2, paramZs9s, paramZs9s::ZK, paramZs9s, this.Zh, this.Zo, this.ZI, this.ZS, this, new Zxa1(this.Zf, this.ZE, this.ZS, this.Zw, this.ZW, this.Zo, this.Zj, this.ZQ, this.ZF, this.Zx, this.ZP, this.Zq), this.ZX);
  }
  
  public void ZA(Socket paramSocket, Zi8 paramZi8, boolean paramBoolean, Zs9s paramZs9s) {
    String[] arrayOfString = Zz2j.ZJ();
    try {
      if (paramBoolean && paramSocket instanceof SSLSocket) {
        SSLSocket sSLSocket = (SSLSocket)paramSocket;
        sSLSocket.setEnabledProtocols(paramZs9s.ZH());
      } 
    } catch (SSLHandshakeException sSLHandshakeException) {
      throw a(null);
    } 
    try {
      if (paramBoolean && paramSocket instanceof SSLSocket) {
        SSLSocket sSLSocket = (SSLSocket)paramSocket;
        if (paramZs9s.Zb()) {
          sSLSocket.setHandshakeApplicationProtocolSelector(Zb);
          try {
            try {
              sSLSocket.startHandshake();
            } catch (SSLHandshakeException sSLHandshakeException) {
              Zah.Zl(sSLHandshakeException, Zk_.IGNORED);
              (new Zk8v(sSLHandshakeException, paramZi8, null, paramZs9s.ZS(), this.Zf)).Z_();
            } 
            if (a.equals(sSLSocket.getApplicationProtocol())) {
              Zrot zrot = this.ZC.ZB(sSLSocket);
              try {
                zrot.Z_(new Zkfx(this, sSLSocket, paramZi8, paramBoolean, paramZs9s));
                zrot.Ze();
                if (arrayOfString == null)
                  ZD(paramSocket, paramZi8, paramBoolean, false, paramZs9s).run(); 
              } catch (SSLHandshakeException sSLHandshakeException) {
                throw a(null);
              } 
              return;
            } 
            ZD(paramSocket, paramZi8, paramBoolean, false, paramZs9s).run();
          } catch (IOException iOException) {
            try {
              Zah.Zl(iOException, Zk_.IGNORED);
              this.Zz.ZM(iOException, paramSocket);
              if (arrayOfString == null) {
                ZD(paramSocket, paramZi8, paramBoolean, false, paramZs9s).run();
                return;
              } 
            } catch (SSLHandshakeException sSLHandshakeException) {
              throw a(null);
            } 
          } 
          return;
        } 
      } 
    } catch (SSLHandshakeException sSLHandshakeException) {
      throw a(null);
    } 
    ZD(paramSocket, paramZi8, paramBoolean, false, paramZs9s).run();
  }
  
  static {
    // Byte code:
    //   0: bipush #54
    //   2: ldc '>4'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zlb7.a : Ljava/lang/String;
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
    //   80: bipush #96
    //   82: goto -> 112
    //   85: bipush #48
    //   87: goto -> 112
    //   90: bipush #75
    //   92: goto -> 112
    //   95: bipush #53
    //   97: goto -> 112
    //   100: bipush #114
    //   102: goto -> 112
    //   105: bipush #22
    //   107: goto -> 112
    //   110: bipush #9
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
    //   154: new burp/Zkd1
    //   157: dup
    //   158: invokespecial <init> : ()V
    //   161: putstatic burp/Zlb7.Zb : Lburp/Zkd1;
    //   164: new burp/Zr2k
    //   167: dup
    //   168: invokespecial <init> : ()V
    //   171: putstatic burp/Zlb7.Zc : Ljava/net/Socket;
    //   174: return
  }
  
  private static SSLHandshakeException a(SSLHandshakeException paramSSLHandshakeException) {
    return paramSSLHandshakeException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlb7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */