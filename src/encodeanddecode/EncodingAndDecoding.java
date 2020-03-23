package encodeanddecode;

import org.apache.xmlbeans.impl.util.Base64;

public class EncodingAndDecoding
{
    public static void main(String[] args)
    {

        String str="test123";
        byte[] encodedString=Base64.encode(str.getBytes());
        System.out.println("encode string:"+ new String(encodedString));

        byte[] decodedString=Base64.decode(encodedString);
        System.out.println("decoded string:"+ new String(decodedString));



    }
}
