package com.fasterxml.Z_;

import com.fasterxml.Zb.Zd;
import com.fasterxml.Zb.Zg;
import com.fasterxml.Zb.Zl;
import com.fasterxml.Zor.Zyg;
import com.fasterxml.Zs.Zuy;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.spi.FileSystemProvider;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

public class Zr extends Zuy<Path> {
  private static final long serialVersionUID = 1L;
  
  private static final boolean ZK;
  
  public Zr() {
    super(Path.class);
  }
  
  public Path Zz(Zg paramZg, Zyg paramZyg) throws IOException {
    URI uRI;
    int[] arrayOfInt = Zf.ZZ();
    try {
      if (!paramZg.ZL(Zl.VALUE_STRING))
        return (Path)paramZyg.ZB(Path.class, paramZg); 
    } catch (URISyntaxException uRISyntaxException) {
      throw a(null);
    } 
    String str = paramZg.ZR();
    try {
      if (str.indexOf(':') < 0)
        return Paths.get(str, new String[0]); 
    } catch (URISyntaxException uRISyntaxException) {
      throw a(null);
    } 
    try {
      if (ZK)
        try {
          if (str.length() >= 2)
            try {
              if (Character.isLetter(str.charAt(0)))
                try {
                  if (str.charAt(1) == ':')
                    return Paths.get(str, new String[0]); 
                } catch (URISyntaxException uRISyntaxException) {
                  throw a(null);
                }  
            } catch (URISyntaxException uRISyntaxException) {
              throw a(null);
            }  
        } catch (URISyntaxException uRISyntaxException) {
          throw a(null);
        }  
    } catch (URISyntaxException uRISyntaxException) {
      throw a(null);
    } 
    try {
      uRI = new URI(str);
    } catch (URISyntaxException uRISyntaxException) {
      return (Path)paramZyg.Zs(ZX(), str, uRISyntaxException);
    } 
    try {
      return Paths.get(uRI);
    } catch (FileSystemNotFoundException fileSystemNotFoundException) {
      try {
        String str1 = uRI.getScheme();
        for (FileSystemProvider fileSystemProvider : ServiceLoader.<FileSystemProvider>load(FileSystemProvider.class)) {
          if (fileSystemProvider.getScheme().equalsIgnoreCase(str1))
            return fileSystemProvider.getPath(uRI); 
          if (arrayOfInt == null)
            break; 
        } 
        return (Path)paramZyg.Zs(ZX(), str, fileSystemNotFoundException);
      } catch (ServiceConfigurationError serviceConfigurationError) {
        serviceConfigurationError.addSuppressed(fileSystemNotFoundException);
        return (Path)paramZyg.Zs(ZX(), str, serviceConfigurationError);
      } 
    } catch (Exception exception) {
      return (Path)paramZyg.Zs(ZX(), str, exception);
    } 
  }
  
  static {
    boolean bool = false;
    for (File file : File.listRoots()) {
      String str = file.getPath();
      try {
        if (str.length() >= 2)
          try {
            if (Character.isLetter(str.charAt(0)) && str.charAt(1) == ':') {
              bool = true;
              break;
            } 
          } catch (FileSystemNotFoundException fileSystemNotFoundException) {
            throw a(null);
          }  
      } catch (FileSystemNotFoundException fileSystemNotFoundException) {
        throw a(null);
      } 
    } 
    ZK = bool;
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Z_\Zr.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */