package burp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class Ze0s implements Zti0 {
  private FileWriter ZJ;
  
  Ze0s(File paramFile) throws IOException {
    this.ZJ = new FileWriter(paramFile);
  }
  
  public void ZK(String paramString) throws IOException {
    this.ZJ.append(paramString);
  }
  
  public void ZY() throws IOException {
    this.ZJ.flush();
    this.ZJ.close();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ze0s.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */