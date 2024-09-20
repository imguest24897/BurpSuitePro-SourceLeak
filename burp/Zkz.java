package burp;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.util.Arrays;

class Zkz implements Transferable {
  private static final DataFlavor[] Zz = new DataFlavor[] { DataFlavor.stringFlavor, DataFlavor.allHtmlFlavor };
  
  private final String ZS;
  
  public Zkz(String paramString) {
    this.ZS = paramString;
  }
  
  public DataFlavor[] getTransferDataFlavors() {
    return Zz;
  }
  
  public boolean isDataFlavorSupported(DataFlavor paramDataFlavor) {
    return Arrays.<DataFlavor>asList(Zz).contains(paramDataFlavor);
  }
  
  public Object getTransferData(DataFlavor paramDataFlavor) throws UnsupportedFlavorException {
    try {
      if (!isDataFlavorSupported(paramDataFlavor))
        throw new UnsupportedFlavorException(paramDataFlavor); 
    } catch (UnsupportedFlavorException unsupportedFlavorException) {
      throw a(null);
    } 
    return this.ZS;
  }
  
  private static UnsupportedFlavorException a(UnsupportedFlavorException paramUnsupportedFlavorException) {
    return paramUnsupportedFlavorException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */