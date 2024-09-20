package net.portswigger;

import java.io.IOException;

public class Zuy extends IOException {
  Zuy(IOException paramIOException) {
    super(paramIOException.getMessage(), paramIOException);
  }
  
  Zuy(String paramString) {
    super(paramString);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zuy.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */