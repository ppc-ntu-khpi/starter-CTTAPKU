public class Shirt {
    public int shirtID = 7; // стандартне значення номера моделі сорочки
    public String description = "Зручна посадка, стильний крій та фірмовий принт з логотипом бренду на грудях"; // стандартний опис сорочки
    // коди кольорів: R=червоний, B=синій, G=зелений, U=невідомо
    public String color = "Blue";
    public double price = 199.99; // стандартна вартість сорочки
    public int quantityInStock = 47; // стандартна кількість на складі

    // цей метод просто виводить всю інформацію про сорочку на екран
    public void displayShirtInformation() {
        System.out.println("Shirt ID: " + shirtID);
        System.out.println("Shirt description: " + description);
        System.out.println("Color: " + color);
        System.out.println("Shirt price: $" + price);
        System.out.println("Quantity in stock: " + quantityInStock);
    } // кінець методу displayShirtInformation
} // кінець опису класу