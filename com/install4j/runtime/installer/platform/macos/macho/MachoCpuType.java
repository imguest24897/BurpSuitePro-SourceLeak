/*    */ package com.install4j.runtime.installer.platform.macos.macho;
/*    */ 
/*    */ import com.install4j.runtime.util.BinaryUtil;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.io.RandomAccessFile;
/*    */ import java.nio.ByteBuffer;
/*    */ import java.nio.channels.FileChannel;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Collection;
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ public enum MachoCpuType
/*    */ {
/* 17 */   ANY(-1),
/* 18 */   X86(7),
/* 19 */   X86_64(X86.intValue | 0x1000000),
/* 20 */   ARM(12),
/* 21 */   ARM64(ARM.intValue | 0x1000000),
/* 22 */   POWERPC(12),
/* 23 */   POWERPC64(POWERPC.intValue | 0x1000000),
/* 24 */   UNKNOWN(0);
/*    */   
/*    */   private final int intValue;
/*    */   
/*    */   MachoCpuType(int intValue) {
/* 29 */     this.intValue = intValue;
/*    */   }
/*    */   
/*    */   public int getIntValue() {
/* 33 */     return this.intValue;
/*    */   }
/*    */   
/*    */   public static MachoCpuType getCpuType(int intValue) {
/* 37 */     for (MachoCpuType value : values()) {
/* 38 */       if (value.intValue == intValue) {
/* 39 */         return value;
/*    */       }
/*    */     } 
/* 42 */     return UNKNOWN;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public static Collection<MachoCpuType> getCpuTypes(File file) {
/* 47 */     if (!file.isFile()) {
/* 48 */       return Collections.emptyList();
/*    */     }
/*    */     
/* 51 */     try { FatMachoFile fatMachoFile = new FatMachoFile(file, false, false); 
/* 52 */       try { boolean fatFile = fatMachoFile.isFat();
/* 53 */         if (fatFile)
/* 54 */         { List<MachoCpuType> ret = new ArrayList<>();
/* 55 */           for (FatMachoFile.Architecture architecture : fatMachoFile.getArchitectures()) {
/* 56 */             ret.add(architecture.getCpuType());
/*    */           }
/* 58 */           Collections.sort(ret);
/* 59 */           List<MachoCpuType> list1 = ret;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */           
/* 71 */           fatMachoFile.close(); return list1; }  RandomAccessFile raFile = new RandomAccessFile(file, "r"); try { FileChannel channel = raFile.getChannel(); try { ByteBuffer data = ByteBuffer.allocate((int)file.length()); BinaryUtil.readFully(channel, data); data.clear(); MachoFile machoFile = new MachoFile(data); List<MachoCpuType> list = Collections.singletonList(machoFile.getMachoCpuType()); if (channel != null) channel.close();  raFile.close(); fatMachoFile.close(); return list; } catch (Throwable throwable) { if (channel != null)
/* 72 */               try { channel.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }   throw throwable; }  } catch (Throwable throwable) { try { raFile.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }  throw throwable; }  } catch (Throwable throwable) { try { fatMachoFile.close(); } catch (Throwable throwable1) { throwable.addSuppressed(throwable1); }  throw throwable; }  } catch (IOException e)
/* 73 */     { e.printStackTrace();
/* 74 */       return Collections.emptyList(); }
/*    */   
/*    */   }
/*    */   
/*    */   private static class Constants {
/*    */     private static final int CPU_ARCH_ABI64 = 16777216;
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtime\installer\platform\macos\macho\MachoCpuType.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */