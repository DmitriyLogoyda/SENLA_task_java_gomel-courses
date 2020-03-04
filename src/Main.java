public class Main {
    private static int check = 1;
    public static void main(String[] args) {
        Menu menu = new Menu();
        while (check != 0){
            check = menu.menu();
        }
    }
}
