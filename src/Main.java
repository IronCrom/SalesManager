public class Main {
    public static void main(String[] args) {
        SalesManager salesManager = new SalesManager(new int[]{0, 2, 3, 11, 5, 8});
        System.out.println("Максимальное количество продаж равно " + salesManager.max());
    }

}
