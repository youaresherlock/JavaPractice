package advance;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.RandomAccess;

public class ChannelTest {
    public static void main(String[] args) throws IOException {
        /*
        NIO:Channel
        Channel 通道是双向的，可读可写
         */
        RandomAccessFile aFile = new RandomAccessFile("nio-data.txt", "rw");
        FileChannel inChannel = aFile.getChannel(); // 建立通道
        ByteBuffer buf = ByteBuffer.allocate(48);

        int bytesRead = inChannel.read(buf); // 写入Buffer
        while(bytesRead != -1){
            System.out.println("Read " + bytesRead);
            buf.flip(); // 切换读模式
            while(buf.hasRemaining()) {
                System.out.print((char)buf.get());  // 读取Buffer
            }
            buf.clear();  // 清除数据
            bytesRead = inChannel.read(buf);
        }
        aFile.close();
    }
}






































