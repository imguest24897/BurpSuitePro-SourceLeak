package burp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zca;
import net.portswigger.Zia;
import net.portswigger.Zk_;
import net.portswigger.Zmg;

class Zxfe {
  static Zia ZP(Zzi8 paramZzi8, Zey9 paramZey9) {
    Zbqc[] arrayOfZbqc = Zl7o.Zx();
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    if (Zbqc.Zwu() == null)
      Zl7o.ZF(new Zbqc[5]); 
    return new Zia(Zmg.Zz(paramZzi8.ZlL().toString()).toString(), Zo(true, paramZzi8.ZB(paramZzi8.Zod(), paramZey9), paramZzi8.ZaC()), (paramZzi8.ZoO() == null) ? null : Zo(false, paramZzi8.ZoO().ZiD(), paramZzi8.Zae()), paramZzi8.ZaY(), paramZzi8.ZoB(), paramZzi8.ZIx());
  }
  
  private static Zca[] Zo(boolean paramBoolean, byte[] paramArrayOfbyte, Zefg<Zrrc> paramZefg) {
    ArrayList<Zca> arrayList = new ArrayList();
    try {
      Zzgr.ZD(paramBoolean, paramArrayOfbyte, new Zs09(arrayList), paramZefg);
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.RETHROWN);
      throw new RuntimeException(iOException);
    } 
    return arrayList.<Zca>toArray(new Zca[0]);
  }
  
  private static List<Zia> ZD(Zefg<Zzi8> paramZefg, Zey9 paramZey9) {
    ArrayList<Zia> arrayList = new ArrayList();
    Iterator<Zzi8> iterator = paramZefg.iterator();
    Zbqc[] arrayOfZbqc = Zl7o.Zx();
    while (iterator.hasNext()) {
      Zzi8 zzi8 = iterator.next();
      arrayList.add(ZP(zzi8, paramZey9));
      if (arrayOfZbqc == null)
        break; 
    } 
    return arrayList;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxfe.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */