package net.portswigger;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;

public interface Zl0 {
  File ZJ(String paramString1, String paramString2);
  
  File Zh(File paramFile, String paramString);
  
  File Zg(String paramString);
  
  File ZH(String paramString1, String paramString2, File paramFile) throws IOException;
  
  InputStream ZO(File paramFile) throws FileNotFoundException;
  
  OutputStream Zp(File paramFile) throws FileNotFoundException;
  
  OutputStream Zp(File paramFile, boolean paramBoolean) throws FileNotFoundException;
  
  OutputStream Zr(String paramString, boolean paramBoolean) throws FileNotFoundException;
  
  Reader Za(File paramFile) throws FileNotFoundException;
  
  OutputStreamWriter ZT(File paramFile) throws IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zl0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */