public class Program {
    public static void main(String[] args) {
        String l = String.valueOf(Integer.MIN_VALUE);
        System.out.print(Program.Decode("256-"));
    }
    public static Integer Decode(String nm){
        return Integer.decode(nm);
    }
}