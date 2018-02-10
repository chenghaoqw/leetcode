import java.util.HashMap;
import java.util.Random;

public class Q535EncodeandDecodeTinyURL {
    HashMap<String,String> map=new HashMap();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String key=new Random().nextInt(1000)+"";
        if(map.containsKey(key)) return encode(longUrl);
        map.put(key,longUrl);
        return key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}
