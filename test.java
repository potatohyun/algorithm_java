import java.util.Base64;

public class test {
    public static void main(String[] args) {
        String payload = (String) message.getPayload();
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decodedBytes = decoder.decode(payload);

        String request = new String(decodedBytes);
        log.info("Server received: {}", request);
// }




    }
    
}
