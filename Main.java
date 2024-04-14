public class Main {
public static void main(String[] args) {
User guest1 = new User("s29790@gmail.com");
User guest2 = new User("Jano@gmail.com");
User user1 = new User("Paweł","Januszkiewicz","małpa@gmail.com","małpa00");
guest2.guestToUser("szymon","szymon","87349");

Product p1 = new Product("Chocolate", 15, "82972893", 3);
Product p2 = new Product("Juice", 4, "7849272");
Product p3 = new Product("Milk", 7, "572884721", 9);
p2.changePrice(3);
p3.changeNumOfPieces(15);

}
}
