package burp;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Zep extends FileWriter {
  private long ZU;
  
  public Zep(File paramFile) throws IOException {
    super(paramFile);
  }
  
  public void write(int paramInt) throws IOException {
    super.write(paramInt);
    this.ZU++;
  }
  
  public void write(char[] paramArrayOfchar, int paramInt1, int paramInt2) throws IOException {
    super.write(paramArrayOfchar, paramInt1, paramInt2);
    this.ZU += paramInt2;
  }
  
  public void write(String paramString, int paramInt1, int paramInt2) throws IOException {
    super.write(paramString, paramInt1, paramInt2);
    this.ZU += paramInt2;
  }
  
  long ZK() {
    return this.ZU;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zep.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */