package day14abstractchallange;

public class CodeChallenge {
    public static void main(String[] args) {
        scenario1(new Knight("Zoey"), new Knave("Mel"));
        scenario2(new Knave("Peggy"), new Knave("Zippy"));
    }
    private static void scenario1(Islander zoey, Islander mel) {
        // zoey says mel is a knave
        if (zoey.isTellsTruth() != mel.isAKnave()) {
            System.out.println("Contradiction!");
            // mel says neither of us is a knave
        } else if (mel.isTellsTruth() != (!zoey.isAKnave() && !mel.isAKnave())) {
            System.out.println("Contradiction!");
        } else {
            System.out.println("Valid.");
            System.out.println(zoey.getName() + " is a " + zoey.getClass().getSimpleName());
            System.out.println(mel.getName() + " is a " + mel.getClass().getSimpleName());
        }
    }
    private static void scenario2(Islander peggy, Islander zippy) {
        // peggy says only one of us is a knight
        // ^ is the Exclusive-Or operator (XOR)
        if (peggy.isTellsTruth() != (peggy.isAKnight() ^ zippy.isAKnight())) {
            System.out.println("Contradiction!");
            // zippy says only a knave would say peggy is a knave
        } else if (zippy.isTellsTruth() != (!peggy.isAKnave())) {
            System.out.println("Contradiction!");
        } else {
            System.out.println("Valid.");
            System.out.println(peggy.getName() + " is a " + peggy.getClass().getSimpleName());
            System.out.println(zippy.getName() + " is a " + zippy.getClass().getSimpleName());
        }
    }
}




