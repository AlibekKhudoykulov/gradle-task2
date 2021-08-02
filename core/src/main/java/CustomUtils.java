public class CustomUtils {

    public CustomUtils() {

    }

    public static boolean isPositiveNumber(String str) {
        if (str != null) {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (((int) ch >= 48 && (int) ch <= 57)) {
                    if ((i != 0) && ((int) str.charAt(i - 1) == 45)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean isAllPositiveNumbers(String... str) {
        if (str != null && str.length != 0) {
            String[] var1 = str;
            int var2 = str.length;

            for(int var3 = 0; var3 < var2; ++var3) {
                String s = var1[var3];
                if (!CustomUtils.isPositiveNumber(s)) {
                    return false;
                }
            }

            return true;
        } else {
            return false;
        }
    }
}