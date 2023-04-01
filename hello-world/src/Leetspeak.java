public class Leetspeak extends Encoder {

    public String encode(String source) {
        String result = "";
        if (source == null)
            return result;
        result = source;
        result = result.replace('a', '4');
        result = result.replace('A', '4');
        result = result.replace('e', '3');
        result = result.replace('E', '3');
        result = result.replace("m", "/^^\\");
        result = result.replace("M", "/^^\\");
        result = result.replace('o', '0');
        result = result.replace('O', '0');
        result = result.replace("u", "(_)");
        result = result.replace("U", "(_)");
        result = result.replace('l', '1');
        result = result.replace('L', '1');

        return result;
    }

}

abstract class Encoder {
    public abstract String encode(String source);
}