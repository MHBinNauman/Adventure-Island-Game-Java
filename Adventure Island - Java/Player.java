import java.util.*;

public class Player {
    String name;
    private int health;
    String[] inventory;

    public Player(String name, String[] inventory) {
        this.name = name;
        this.health = 100;
        this.inventory = inventory;
    }

    public void set_health(int h) {
        this.health = h;
    }

    public int get_health() {
        return this.health;
    }

    public void take(String New_Item) {
        New_Item = New_Item.toLowerCase();
        switch (New_Item) {
            case "sword":
                String[] clone_inventory_1 = new String[this.inventory.length + 1];
                System.arraycopy(this.inventory, 0, clone_inventory_1, 0, this.inventory.length);
                String[] s_array = {"Sword"};
                System.arraycopy(s_array, 0, clone_inventory_1, this.inventory.length, 1);
                break;
            case "fruit":
                String[] clone_inventory_2 = new String[this.inventory.length + 1];
                System.arraycopy(this.inventory, 0, clone_inventory_2, 0, this.inventory.length);
                String[] f_array = {"Fruit"};
                System.arraycopy(f_array, 0, clone_inventory_2, this.inventory.length, 1);
                break;
            case "health kit":
                String[] clone_inventory_3 = new String[this.inventory.length + 1];
                System.arraycopy(this.inventory, 0, clone_inventory_3, 0, this.inventory.length);
                String[] h_array = {"Health Kit"};
                System.arraycopy(h_array, 0, clone_inventory_3, this.inventory.length, 1);
                break;
            case "map":
                String[] clone_inventory_4 = new String[this.inventory.length + 1];
                System.arraycopy(this.inventory, 0, clone_inventory_4, 0, this.inventory.length);
                String[] m_array = {"Map"};
                System.arraycopy(m_array, 0, clone_inventory_4, this.inventory.length, 1);
                break;
            default:
                System.out.println("Invalid Inventory Item.");
                break;
        }
    }

    public void use() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the Item to be used: ");
        String Item_name = sc.nextLine();
        Item_name = Item_name.toLowerCase();
        Item_name = Item_name.trim();
        for (String inventoryItem : this.inventory) {
            if (Item_name.equals(inventoryItem)) {
                switch (Item_name) {
                    case "sword":
                        Item Sword = new Item("Sword", "Made out of iron, holding the ability to kill the monster on the third strike");
                        Sword.use();
                        break;
                    case "fruit":
                        Item Fruit = new Item("Fruit", "Revives 25% health.");
                        Fruit.use();
                        break;
                    case "health kit":
                        Item Health_kit = new Item("Health Kit", "Revives hundred percent health. It is only found outside the cave.");
                        Health_kit.use();
                        break;
                    case "map":
                        Item Map = new Item("Map", "Map allows the player to locate the sword and the Monster's cave.");
                        Map.use();
                        break;
                    default:
                        System.out.println("Invalid Inventory Item.");
                        break;
                }
            }
        }
    }
    public void move(String New_Location) {
        New_Location = New_Location.toLowerCase();
        switch(New_Location){
            case "forest":
                Location Forest = new Location("Forest", "Forest is located next to the beach where fruits are available along with stones to sharpen the sword");
                break;
            case "beach":
                Location Beach = new Location("Beach", "Beach is located next to the Forest where copies of maps are avilable");
                break;
            case "cave":
                Location Cave = new Location("Cave", "Beach is located in the forest where you have to go using the map. In the cave you have to kill the monster using your sword to win the game.");
                break;
        }
    }
}
