package com.fasterxml.Zm;

import java.io.IOException;

public class Zz {
  public static void ZI(Throwable paramThrowable) throws Error, RuntimeException {
    try {
      if (Zx(paramThrowable)) {
        try {
          if (paramThrowable instanceof Error)
            throw (Error)paramThrowable; 
        } catch (Error error) {
          throw a(null);
        } 
        try {
          if (paramThrowable instanceof RuntimeException)
            throw (RuntimeException)paramThrowable; 
        } catch (Error error) {
          throw a(null);
        } 
        throw new RuntimeException(paramThrowable);
      } 
    } catch (Error error) {
      throw a(null);
    } 
  }
  
  private static boolean Zx(Throwable paramThrowable) {
    try {
      if (!(paramThrowable instanceof VirtualMachineError))
        try {
          if (!(paramThrowable instanceof ThreadDeath))
            try {
              if (!(paramThrowable instanceof InterruptedException))
                try {
                  if (!(paramThrowable instanceof ClassCircularityError))
                    try {
                      if (!(paramThrowable instanceof ClassFormatError))
                        try {
                          if (!(paramThrowable instanceof IncompatibleClassChangeError))
                            try {
                              if (!(paramThrowable instanceof BootstrapMethodError)) {
                                try {
                                  if (paramThrowable instanceof VerifyError);
                                } catch (RuntimeException runtimeException) {
                                  throw a(null);
                                } 
                                return false;
                              } 
                            } catch (RuntimeException runtimeException) {
                              throw a(null);
                            }  
                        } catch (RuntimeException runtimeException) {
                          throw a(null);
                        }  
                    } catch (RuntimeException runtimeException) {
                      throw a(null);
                    }  
                } catch (RuntimeException runtimeException) {
                  throw a(null);
                }  
            } catch (RuntimeException runtimeException) {
              throw a(null);
            }  
        } catch (RuntimeException runtimeException) {
          throw a(null);
        }  
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public static <T> T Zc(IOException paramIOException) {
    ZP(paramIOException);
    return null;
  }
  
  private static <E extends Throwable> void ZP(Throwable paramThrowable) throws E {
    throw (E)paramThrowable;
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zm\Zz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */