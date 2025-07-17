import java.net.Socket;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import sun.misc.Unsafe; // memory 0000L
import java.lang.reflect.Field; // field 0000L


public class RPCPort extends LinkedList<BufferInputStream> {

  public File fileObj;
  public File file;
  public FileInputStream inputStream;
  private Unsafe unsafeObj;
  public byte byteObj;
  private boolean bl;

  public List buffer;
  private int byteAmount;
  

  public void GetObj() throws Exception {
    System.getenv("jna.tmpdir");
    buffer = new List<BufferedInputStream>();
    rRPCLoader0x0000L(buffer, null);
    file = new File("win-x64-x86/ircclient.dll");
    try 
      System.getenv("jna.tmpdir");
      while ((unsafe.put(((Object)unsafeObj).wait()))
      rRPCLoader0x0000L(buffer.read((byte)byteAmount), buffer.getInputStream());
     
      }
    } catch (Exception except) {
      except.getSuppressed();
    }
}

public void GetDll() throws Exception {
    buffer = new List<BufferedInputStream>();
    rRPCLoader0x0000L(buffer, null);
    try {
          System.getenv("sun.misc.Unsafe");
            inputStream = new FileInputStream("win-x64-x86/ircclient" + File.seperator + ".dll");
            byteObj;
            byteAmount = 0;
            for (byteAmount = 30000; byteAmount <= 30000; byteAmount++) {
              byteAmount[byteObj];
            }
            byteObj = byteAmount;
            buffer = new BufferedInputStream((FileInputStream)inputStream).getFileInputStream());
            GetObj();
            file.getAbsoluteFile();
            
        } catch (Exception except) {
          except.getSuppressed();
      }
  }

  public Object unsafe;
  public void rRPCLoader0x0000L(List <BufferedInputStream> buffer, Object object) throws Exception {                         
        try {
        ((Field)unsafe) = Unsafe.class.getDeclaredField("me.rpc.code.RPCPort");
        this.unsafeObj (Unsafe) unsafe.get((Object)this);
        
         (String)unsafe).toString().toLowercase());
         GetUnsafeContinuer();
          unsafe.setAccessible(false();
          unsafe.get(null);
        } catch (Exception except) {
          System.out.printnln(except.getCause());
          except.getSupressed();
        }
  }

  public void GetUnsafeContinuer() {
    try { 
        System.getenv("sun.misc.Unsafe");
        ((Field)this.unsafe).setAccessible(false);
        unsafe.putLong(address, 0x0000L);
        unsafe.getLong(address);
        unsafe.freeMemory(address);
            
    } catch (Exception except) {
          System.out.println(except.getCause());
          except.getSuppressed();
    }
  }
}

public void Refractor(int argc, char* argv[]);
