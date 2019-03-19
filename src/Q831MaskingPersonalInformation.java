public class Q831MaskingPersonalInformation {
    public String maskPII(String S) {
        String result = "";
        if (S.contains("@")) {
            int index = S.indexOf("@");
            result += S.substring(0, 1);
            result += "*****";
            result += S.substring(index - 1, index);
            result += "@";
            result += S.substring(index + 1);
            result = result.toLowerCase();
        } else {
            String digst = S.replaceAll("\\D+", "");
            String local = "***-***-" + digst.substring(digst.length() - 4);
            if (digst.length() == 10) return local;
            for (int i = 0; i < digst.length() - 10; i++) result += "*";
            result = "+" + result + "-" + local;
        }
        return result;
    }
}