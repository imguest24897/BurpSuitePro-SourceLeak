package burp;

import java.util.Collections;
import net.portswigger.Zen;
import net.portswigger.Zkb;
import net.portswigger.Zli;
import net.portswigger.Zsy;

class Zecz {
  static Zx_5 ZY(Zen paramZen, Zlit paramZlit, Zxs7 paramZxs7, Zewx paramZewx, Ze3n paramZe3n1, Ze3n paramZe3n2, Zbnt paramZbnt, Zsy paramZsy, Zb6q paramZb6q) {
    Zs68 zs68 = Zbwc.Zt((Zlit)null, paramZb6q.Za(), Zt0k.NO_HTML_ANALYSIS, paramZbnt);
    byte[] arrayOfByte1 = Zkb.Zy(paramZen.toString());
    Ztqp ztqp = new Ztqp(paramZewx.Zh(), paramZb6q, null, null);
    ztqp.ZK(zs68.ZH);
    (new Zlv9(paramZb6q, arrayOfByte1, 0, paramZb6q.ZF(), (byte)2, paramZsy)).ZL(ztqp);
    Zbqc[] arrayOfZbqc = Zb9e.ZI();
    Zs2i zs2i = paramZewx.Zu(paramZxs7);
    Zvow zvow1 = paramZe3n1.ZI().Zp(zs2i.ZE()).Zz(Zd(arrayOfByte1, zs2i));
    Zvow zvow2 = paramZe3n2.ZI().Zp(paramZe3n2.ZA().ZD()).Zo(paramZb6q);
    for (Zkv8 zkv8 : ztqp.ZP((byte)2)) {
      zvow2.Zf(Zrlp.ZJ(zkv8));
      if (arrayOfZbqc == null) {
        Zbqc.Zr(new Zbqc[5]);
        break;
      } 
    } 
    byte[] arrayOfByte2 = paramZlit.Zd4();
    return new Zx_5(Zzu2.INPUT_RETRIEVAL_STORED, (byte)0, 0, Collections.emptyMap(), Collections.singletonList(new Zm1m(new Zz25(paramZewx.Zh(), 0), zvow1, zvow2, arrayOfByte2, Zkb.Zy(paramZe3n2.ZN()))), (byte)3, (byte)1, paramZe3n1.Zod(), arrayOfByte2, paramZxs7);
  }
  
  private static Zl1r Zd(byte[] paramArrayOfbyte, Zs2i paramZs2i) {
    int[] arrayOfInt = paramZs2i.Zm();
    if (arrayOfInt != null) {
      int i = Zli.ZZ(paramZs2i.ZE(), paramArrayOfbyte, false, arrayOfInt[0], arrayOfInt[1]);
      return (i != -1) ? Zrlp.Zj(i, i + paramArrayOfbyte.length) : Zrlp.Zj(arrayOfInt[0], arrayOfInt[1]);
    } 
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zecz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */