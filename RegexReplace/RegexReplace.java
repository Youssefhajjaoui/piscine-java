
public class RegexReplace {
    public static String removeUnits(String s) {
        return s.replaceAll("(?<=\\d)(cm|€)(?=\\s|$)", "");

    }

    public static String obfuscateEmail(String s) {
        String[] parts = s.split("@");
        if (parts.length != 2) {
            return s; // not a valid email, return as is
        }

        String username = parts[0];
        String domain = parts[1];

        // --- handle username ---
        if (username.contains(".") || username.contains("-") || username.contains("_")) {
            String[] userParts = username.split("[.-_]", 2);
            if (userParts.length == 2) {
                char sep = username.charAt(userParts[0].length());
                String stars = "*".repeat(userParts[1].length());
                username = userParts[0] + sep + stars;
            }
        } else {
            if (username.length() > 3) {
                username = username.substring(0, 3) + "*".repeat(username.length() - 3);
            }
        }

        // --- handle domain ---
        String[] domainParts = domain.split("\\.");
        if (domainParts.length == 3) {
            domainParts[0] = "*".repeat(domainParts[0].length());
            domainParts[1] = "*".repeat(domainParts[1].length());
        } else if (domainParts.length == 2) {
            String tld = domainParts[1];
            if (!(tld.equals("com") || tld.equals("org") || tld.equals("net"))) {
                domainParts[0] = "*".repeat(domainParts[0].length());
                domainParts[1] = "*".repeat(domainParts[1].length());
            } else {
                domainParts[0] = "*".repeat(domainParts[0].length());
            }
        }

        domain = String.join(".", domainParts);
        return username + "@" + domain;
    }

}