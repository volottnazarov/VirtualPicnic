public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        System.out.println(controller.fruitList);
        System.out.println("Общее кол-во фруктов: " + controller.totalFruit);
        System.out.println("Самое длинное название фрукта: " + controller.maxLengthName + " => "
                + controller.maxLengthName.length() + " букв");

        controller.printFruit(controller.fruitMap);
        System.out.println("Самый популярный фрукт: " + controller.popularFruit);


    }
}
