package net.portswigger;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;

public class Zq1 implements Zl0 {
  public File ZJ(String paramString1, String paramString2) {
    return new File(paramString1, paramString2);
  }
  
  public File Zh(File paramFile, String paramString) {
    return new File(paramFile, paramString);
  }
  
  public File Zg(String paramString) {
    return new File(paramString);
  }
  
  public File ZH(String paramString1, String paramString2, File paramFile) throws IOException {
    return File.createTempFile(paramString1, paramString2, paramFile);
  }
  
  public InputStream ZO(File paramFile) throws FileNotFoundException {
    return new FileInputStream(paramFile);
  }
  
  public OutputStream Zp(File paramFile) throws FileNotFoundException {
    return new FileOutputStream(paramFile);
  }
  
  public OutputStream Zp(File paramFile, boolean paramBoolean) throws FileNotFoundException {
    return new FileOutputStream(paramFile, paramBoolean);
  }
  
  public OutputStream Zr(String paramString, boolean paramBoolean) throws FileNotFoundException {
    return new FileOutputStream(paramString, paramBoolean);
  }
  
  public Reader Za(File paramFile) throws FileNotFoundException {
    return new FileReader(paramFile);
  }
  
  public OutputStreamWriter ZT(File paramFile) throws IOException {
    return new FileWriter(paramFile);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zq1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */