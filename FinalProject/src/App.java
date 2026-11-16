public class App {
    public static void main(String[] args) throws Exception {
        
        
        System.out.println("############");
        System.out.println("#S...#.....#");
        System.out.println("#.##.#.##M.#");
        System.out.println("#..M...#...#");
        System.out.println("###.########");
        System.out.println("#P..M....#.#");
        System.out.println("#.####.#..E#");
        System.out.println("############");
        
        String row = "#S...#";

        char first = row.charAt(0);
        char start = row.charAt(1);
        int size = row.length();

        if (row.charAt (1) == 'S') {
            System.out.println("found the start");
            
            row = "#S...#.....#";
            int walls = 0;
        }
    }
}
