public class DoOp {
    public static String operate(String[] args) {
        try {

            if (args.length != 3) {
                throw new Exception("error");
            }
            int first = Integer.parseInt(args[0]);
            int second = Integer.parseInt(args[2]);
            switch (args[1]) {
                case "+":
                    return String.valueOf(first + second);
                case "-":
                    return String.valueOf(first - second);
                case "*":
                    return String.valueOf(first * second);
                case "/":
                    return String.valueOf(first / second);
                case "%":
                    return String.valueOf(first % second);
                default:
                    throw new Exception("error");
            }
        } catch (Exception e) {
            return "Error";
        }
    }
}
