package club.zendipia.neo;

import org.neo.smartcontract.framework.SmartContract;
import org.neo.smartcontract.framework.services.neo.Storage;

public class HelloWorld extends SmartContract {
    public static byte[] Main(String[] args){
        Storage.put(Storage.currentContext(), "HELLO", "Hello World!");
        return Storage.get(Storage.currentContext(),"HELLO");
    }
}
