package com.install4j.runtime.installer.platform.macos.macho;

import java.io.IOException;
import java.nio.ByteBuffer;

interface Part {
  void read(ByteBuffer paramByteBuffer, boolean paramBoolean) throws IOException;
  
  void write(ByteBuffer paramByteBuffer, boolean paramBoolean) throws IOException;
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\macos\macho\Part.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */