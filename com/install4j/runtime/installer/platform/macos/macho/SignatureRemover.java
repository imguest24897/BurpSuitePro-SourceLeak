/*    */ package com.install4j.runtime.installer.platform.macos.macho;
/*    */ 
/*    */ import com.install4j.runtime.util.BinaryUtil;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.io.RandomAccessFile;
/*    */ import java.nio.ByteBuffer;
/*    */ import java.nio.channels.FileChannel;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ public class SignatureRemover
/*    */ {
/*    */   public static void removeFat(File file) throws IOException {
/* 15 */     if (file.length() < 4L) {
/* 16 */       throw new MachoFile.NoMachoException(file);
/*    */     }
/* 18 */     FatMachoFile fatMachoFile = new FatMachoFile(file);
/* 19 */     if (!fatMachoFile.isFat()) {
/* 20 */       removeThin(file);
/*    */     } else {
/* 22 */       for (FatMachoFile.Architecture architecture : fatMachoFile.getArchitectures()) {
/* 23 */         architecture.setData(removeThin(architecture.getData()));
/*    */       }
/* 25 */       fatMachoFile.write();
/*    */     } 
/*    */   }
/*    */   
/*    */   private static void removeThin(File file) throws IOException {
/* 30 */     RandomAccessFile raFile = new RandomAccessFile(file, "rw"); 
/* 31 */     try { FileChannel channel = raFile.getChannel(); 
/* 32 */       try { ByteBuffer data = ByteBuffer.allocate((int)file.length());
/* 33 */         BinaryUtil.readFully(channel, data);
/* 34 */         data = removeThin((ByteBuffer)data.position(0));
/* 35 */         raFile.seek(0L);
/* 36 */         BinaryUtil.writeFully(channel, data);
/* 37 */         raFile.setLength(data.limit());
/* 38 */         if (channel != null) channel.close();  } catch (Throwable throwable) { if (channel != null)
/* 39 */           try { channel.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }   throw throwable; }  raFile.close(); }
/*    */     catch (Throwable throwable) { try { raFile.close(); }
/*    */       catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }
/*    */        throw throwable; }
/* 43 */      } private static ByteBuffer removeThin(@NotNull ByteBuffer data) throws IOException { MachoFile machoFile = new MachoFile(data);
/* 44 */     machoFile.removeSignature();
/* 45 */     machoFile.writeHeaderAndCommands();
/* 46 */     return machoFile.getData(); }
/*    */ 
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\macos\macho\SignatureRemover.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */