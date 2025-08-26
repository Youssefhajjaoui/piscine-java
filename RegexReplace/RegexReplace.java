public class RegexReplace {
    public static String removeUnits(String s) {
        return s.replaceAll("(?<=\\d)(cm|€)(?=\\s*)", "");

    }

    public static String obfuscateEmail(String s) {
        String[] parts = s.split("@");
        if (parts.length != 2)
            return s;
        String username = parts[0];
        String domain = parts[1];
        if (username.contains(".") || username.contains("-") || username.contains("_")) {
            username = username.replaceAll("([-._]).", "$1*");
        } else {
            if (username.length() > 3) {
                username = username.substring(0, username.length() - 3) + "***";
            }
        }
        String[] domainParts = domain.split("\\.");
        if (domainParts.length == 3) {
            domainParts[0] = "***";
            domainParts[2] = "***";
        } else if (domainParts.length == 2) {
            String tld = domainParts[1];
            if (!(tld.equals("com") || tld.equals("org") || tld.equals("net"))) {
                domainParts[0] = "***";
                domainParts[1] = "***";
            }
        }

        domain = String.join(".", domainParts);
        return username + "@" + domain;
    }
}