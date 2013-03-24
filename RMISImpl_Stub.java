import java.lang.reflect.Method;
import java.rmi.Remote;
import java.rmi.server.RemoteObject;
import java.rmi.server.RemoteRef;
import java.rmi.server.RemoteStub;

public final class RMISImpl_Stub extends RemoteStub
  implements RMISIntf, Remote
{
  private static final long serialVersionUID = 2L;
  private static Method $method_CliDet_0;
  private static Method $method_CliDet_key_1;
  private static Method $method_checkipp_2;
  private static Method $method_res_3;
  private static Method $method_store_4;

  static
  {
    try
    {
      $method_CliDet_0 = Remote.class.getMethod("CliDet", new Class[] { String.class, String.class, String.class });
      $method_CliDet_key_1 = Remote.class.getMethod("CliDet_key", new Class[] { String.class, String.class });
      $method_checkipp_2 = Remote.class.getMethod("checkipp", new Class[] { String.class, String.class });
      $method_res_3 = Remote.class.getMethod("res", new Class[] { String.class, String.class, String.class });
      $method_store_4 = Remote.class.getMethod("store", new Class[] { new String[0].getClass(), String.class, String.class, String.class });
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      throw new NoSuchMethodError("stub class initialization failed");
    }
  }

  public RMISImpl_Stub(RemoteRef paramRemoteRef)
  {
    super(paramRemoteRef);
  }

  public String CliDet(String paramString1, String paramString2, String paramString3)
    throws Exception
  {
    Object localObject = this.ref.invoke(this, $method_CliDet_0, new Object[] { paramString1, paramString2, paramString3 }, 8613645316050146772L);
    return (String)localObject;
  }

  public String CliDet_key(String paramString1, String paramString2)
    throws Exception
  {
    Object localObject = this.ref.invoke(this, $method_CliDet_key_1, new Object[] { paramString1, paramString2 }, 3763525818599498100L);
    return (String)localObject;
  }

  public String checkipp(String paramString1, String paramString2)
    throws Exception
  {
    Object localObject = this.ref.invoke(this, $method_checkipp_2, new Object[] { paramString1, paramString2 }, 8437370742516558820L);
    return (String)localObject;
  }

  public String res(String paramString1, String paramString2, String paramString3)
    throws Exception
  {
    Object localObject = this.ref.invoke(this, $method_res_3, new Object[] { paramString1, paramString2, paramString3 }, 7225784952642168023L);
    return (String)localObject;
  }

  public void store(String[] paramArrayOfString, String paramString1, String paramString2, String paramString3)
    throws Exception
  {
    this.ref.invoke(this, $method_store_4, new Object[] { paramArrayOfString, paramString1, paramString2, paramString3 }, 7346576855663349160L);
  }
}

/* Location:           C:\Users\satish\Downloads\preserve and audit data for security in cloud computing\preserve and audit data for security in cloud computing\code\CloudDataSecurity\
 * Qualified Name:     RMISImpl_Stub
 * JD-Core Version:    0.6.2
 */
