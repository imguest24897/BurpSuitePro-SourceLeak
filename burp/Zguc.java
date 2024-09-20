package burp;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import javax.imageio.ImageIO;
import net.portswigger.Zah;
import net.portswigger.Zk_;

class Zguc {
  static int ZL(Zmnm paramZmnm, Zrdb paramZrdb, boolean paramBoolean) {
    return Math.min(ZT(paramZrdb, paramBoolean), paramZmnm.ZOg());
  }
  
  static Zlah ZQ(Zrdb paramZrdb, byte paramByte1, byte paramByte2, boolean paramBoolean) {
    int i = ZT(paramZrdb, paramBoolean);
    int j = Zf(paramByte1, paramByte2);
    if (i < j) {
    
    } else {
    
    } 
    return new Zlah(paramByte1, paramByte2);
  }
  
  static boolean ZI(Zmnm paramZmnm, Object paramObject) {
    int[] arrayOfInt = Zlah.ZRg();
    if (paramObject instanceof Zmnm) {
      Zmnm zmnm = (Zmnm)paramObject;
      if (arrayOfInt == null)
        return zmnm.ZF(paramZmnm) ? true : ((Objects.equals(paramZmnm.ZOe(), zmnm.ZOe()) && Objects.equals(paramZmnm.ZOD(), zmnm.ZOD()) && Objects.equals(paramZmnm.ZOQ(), zmnm.ZOQ()))); 
    } 
    return false;
  }
  
  static int ZJ(Zmnm paramZmnm) {
    return Objects.hash(new Object[] { paramZmnm.ZOe(), paramZmnm.ZOD(), paramZmnm.ZOQ() });
  }
  
  private static int ZT(Zrdb paramZrdb, boolean paramBoolean) {
    return (paramZrdb == null) ? 9999 : Zf(paramBoolean ? paramZrdb.ZaJ() : paramZrdb.Zaw(), paramBoolean ? paramZrdb.Zac() : paramZrdb.Zak());
  }
  
  static int Zf(byte paramByte1, byte paramByte2) {
    return (paramByte1 == 0 || paramByte2 == 0) ? 9999 : Zb3i.ZE(paramByte1, paramByte2);
  }
  
  static Zebg ZY(List<Zrdb> paramList, boolean paramBoolean) {
    byte b1 = 0;
    byte b2 = 0;
    byte b3 = 0;
    byte b4 = 0;
    int[] arrayOfInt = Zlah.ZRg();
    for (Zrdb zrdb : paramList) {
      switch (paramBoolean ? zrdb.ZaJ() : zrdb.Zaw()) {
        case 4:
          b1++;
        case 3:
          b2++;
        case 2:
          b3++;
        case 1:
          b4++;
          break;
      } 
      continue;
      if (arrayOfInt != null)
        break; 
    } 
    return new Zebg(b1, b2, b3, b4);
  }
  
  static BufferedImage Zp(Zstu paramZstu) {
    try {
      if (paramZstu == null)
        return null; 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      return ImageIO.read(new ByteArrayInputStream(paramZstu.ZiD()));
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.UNEXPECTED);
      return null;
    } 
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zguc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */