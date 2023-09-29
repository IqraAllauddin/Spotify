import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Music m1 = new Music("Cardigan", new Artist("TailorSwift", "America", 9), 3.46, "SadSongs", "Folklore", new Date(4, 5, 2023));
        Music m2 = new Music("Mercy", new Artist("Shawn Mendes", "America", 8), 3.2, "SadSongs", "Red", new Date(3, 5, 2022));
        Music m3 = new Music("Willow", new Artist("TailorSwift", "America", 9), 3.56, "SadSongs", "Folklore", new Date(9, 5, 2023));
        Music m4 = new Music("SafetyNet", new Artist("ArianaGrande", "America", 9), 3.22, "SadSongs", "f4", new Date(2, 6, 2023));
        Music m5 = new Music("Willow", new Artist("TailorSwift", "America", 9), 3.56, "SadSongs", "Folklore", new Date(9, 5, 2023));
        System.out.println(m1);
        System.out.println(m4);

        if (m1.getTitle().equals(m3.getTitle())) {
            System.out.println("Songs are same");
        } else {
            System.out.println("Songs are not same ");
        }

        Music list[] = new Music[10];
        list[0] = m1;
        list[1] = m2;
        list[2] = m3;
        list[3] = m4;
        list[4] = m5;

        for(int i=0;i<5;i++){
            System.out.println(list[i]);
        }
//        System.out.println("Enter day:");
//        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();
//        System.out.println("Enter month:");
//        int month = sc.nextInt();
//        System.out.println("Enter year:");
//        int year = sc.nextInt();
//
//        Date date = new Date(day,month,year);
//        System.out.println(date);

    }
}