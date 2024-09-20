package burp;

import java.util.List;
import java.util.function.BiConsumer;
import net.portswigger.Zsy;

class Ztpf {
  private final Zkqd ZS;
  
  private final Zmhe Zg;
  
  private final Zxs7 Zk;
  
  private final Zsy ZX;
  
  private final Zgfe Z_;
  
  private final Zspd Ze;
  
  private final BiConsumer<Byte, Zsov> ZB;
  
  Ztpf(Zmhe paramZmhe, Zxs7 paramZxs7, Zbnt paramZbnt, Zmsb paramZmsb, Zsy paramZsy, Zgfe paramZgfe, Zspd paramZspd, BiConsumer<Byte, Zsov> paramBiConsumer) {
    this.Zg = paramZmhe;
    this.Zk = paramZxs7;
    this.ZX = paramZsy;
    this.Z_ = paramZgfe;
    this.Ze = paramZspd;
    this.ZB = paramBiConsumer;
    Zk8u zk8u = Zk8u.Zh(paramZmhe);
    this.ZS = new Zkqd(paramZsy, new Zxk6(paramZmsb, new Zs_a(), paramZmhe, paramZbnt, paramZsy, zk8u.ZM, paramZxs7), zk8u.ZC);
  }
  
  void ZX() {
    Ze_9.Zi(this::lambda$findXssIssues$0);
  }
  
  private List<Zsjk> ZF() {
    return this.Zk.<List<Zsjk>>Zk(new Zrrm(this));
  }
  
  private boolean Zx(byte paramByte, Zsjk paramZsjk, BiConsumer<Byte, Zsov> paramBiConsumer) {
    Zku6 zku6 = ZC(paramZsjk);
    if (zku6.Zh() && zku6.Zk((byte)2, paramByte)) {
      Zsov zsov = this.ZS.Zv(paramByte, paramZsjk, zku6.ZX(), this.Zk, zku6.ZX((byte)2, new Zxl4(paramByte)), zku6);
      if (zsov != null) {
        paramBiConsumer.accept(Byte.valueOf(paramByte), zsov);
        return true;
      } 
    } 
    return false;
  }
  
  private Zku6 ZC(Zsjk paramZsjk) {
    Zku6 zku6 = this.Z_.Zq(paramZsjk);
    if (Zsjk.FILE_UPLOAD_FILE_EXTENSION_HTML_TYPES.contains(paramZsjk) && !zku6.Zu())
      (new Zt7z(this.Zg, this.Zk, this.ZX, this.Ze)).ZS(); 
    return zku6;
  }
  
  private static boolean Ze(byte paramByte) {
    return (paramByte == 7 || paramByte == 11 || paramByte == 8 || paramByte == 9 || paramByte == 10);
  }
  
  private void lambda$findXssIssues$0(Byte paramByte) {
    String[] arrayOfString = Zlzh.Zj();
    boolean bool = Zx(paramByte.byteValue(), Zsjk.APPEND, this.ZB);
    if (!bool || Ze(paramByte.byteValue()))
      bool |= Zx(paramByte.byteValue(), Zsjk.REPLACE, this.ZB); 
    if (!bool)
      for (Zsjk zsjk : ZF()) {
        if (Zx(paramByte.byteValue(), zsjk, this.ZB) || arrayOfString != null)
          break; 
      }  
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztpf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */