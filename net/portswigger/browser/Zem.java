package net.portswigger.browser;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zem implements Zjg {
  public BufferedImage Z_(byte[] paramArrayOfbyte) {
    boolean bool = Zv();
    try {
      ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(paramArrayOfbyte);
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.UNEXPECTED);
      throw new IllegalArgumentException(iOException);
    } finally {
      ZQ(bool);
    } 
  }
  
  private boolean Zv() {
    boolean bool = ImageIO.getUseCache();
    ZQ(false);
    return bool;
  }
  
  private void ZQ(boolean paramBoolean) {
    ImageIO.setUseCache(paramBoolean);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zem.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */