package org.brotli.dec;

final class RunningState {
  static final int UNINITIALIZED = 0;
  
  static final int BLOCK_START = 1;
  
  static final int COMPRESSED_BLOCK_START = 2;
  
  static final int MAIN_LOOP = 3;
  
  static final int READ_METADATA = 4;
  
  static final int COPY_UNCOMPRESSED = 5;
  
  static final int INSERT_LOOP = 6;
  
  static final int COPY_LOOP = 7;
  
  static final int COPY_WRAP_BUFFER = 8;
  
  static final int TRANSFORM = 9;
  
  static final int FINISHED = 10;
  
  static final int CLOSED = 11;
  
  static final int WRITE = 12;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\org\brotli\dec\RunningState.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */