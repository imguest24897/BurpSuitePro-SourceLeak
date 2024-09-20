/*    */ package com.install4j.runtime.util;
/*    */ 
/*    */ import java.io.EOFException;
/*    */ import java.io.File;
/*    */ import java.io.FileInputStream;
/*    */ import java.io.IOException;
/*    */ import java.nio.ByteBuffer;
/*    */ import java.nio.channels.FileChannel;
/*    */ import java.nio.channels.ReadableByteChannel;
/*    */ import java.nio.channels.WritableByteChannel;
/*    */ 
/*    */ public class BinaryUtil
/*    */ {
/*    */   public static short swap(short x) {
/* 15 */     return (short)(x << 8 | x >> 8 & 0xFF);
/*    */   }
/*    */ 
/*    */   
/*    */   public static int swap(int x) {
/* 20 */     return swap((short)x) << 16 | 
/* 21 */       swap((short)(x >> 16)) & 0xFFFF;
/*    */   }
/*    */   
/*    */   public static long align(long val, long alignment) {
/* 25 */     return (val / alignment + ((val % alignment > 0L) ? 1L : 0L)) * alignment;
/*    */   }
/*    */   
/*    */   public static void writeFully(WritableByteChannel channel, ByteBuffer data) throws IOException {
/* 29 */     while (data.position() < data.limit()) {
/* 30 */       channel.write(data);
/*    */     }
/*    */   }
/*    */   
/*    */   public static void readFully(ReadableByteChannel channel, ByteBuffer data) throws IOException {
/* 35 */     while (data.position() < data.limit()) {
/* 36 */       if (channel.read(data) == -1) {
/* 37 */         throw new EOFException();
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/*    */   public static ByteBuffer readToBuffer(File file) throws IOException {
/* 43 */     ByteBuffer ret = ByteBuffer.allocate((int)file.length());
/* 44 */     FileInputStream in = new FileInputStream(file);
/* 45 */     FileChannel channel = in.getChannel();
/* 46 */     readFully(channel, ret);
/* 47 */     channel.close();
/* 48 */     in.close();
/* 49 */     return (ByteBuffer)ret.position(0);
/*    */   }
/*    */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\install4j\runtim\\util\BinaryUtil.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */