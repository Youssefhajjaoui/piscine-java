
public class CleanExtract {

    public static String extract(String s) {
        String[] res = s.split("\\|");
        StringBuilder name = new StringBuilder();
        for (String segment : res) {
            String Cleaned;
            int first = segment.indexOf(".");
            int last = segment.lastIndexOf(".");
            if (first > -1) {
                if (first == last) {
                    Cleaned = segment.substring(first + 1);
                } else {
                    Cleaned = segment.substring(first + 1, last);
                }
            } else {
                Cleaned = segment;
            }

            Cleaned = Cleaned.trim();
            if (!Cleaned.isEmpty()) {
                if (name.length() > 0) {
                    name.append(" ");
                }
                name.append(Cleaned);
            }
        }

        return name.toString();
    }
}
