import java.util.*;
public class Main {
    public static void main(String[] args) {
        List<Map<String, Object>> dataList = new ArrayList<>();



        Map<String,Object> appleMap=new LinkedHashMap<>();
        appleMap.put("Items","Apple");
        appleMap.put("Price",20.00);
        appleMap.put("Quantity",10.0);

        dataList.add(appleMap);

        Map<String,Object> orangeMap=new LinkedHashMap<>();
        orangeMap.put("Items","Orange");
        orangeMap.put("Price",21.99);
        orangeMap.put("Quantity",10.0);

        dataList.add(orangeMap);


        for (var x:dataList) {
            String items= (String) x.get("Items");
            double price= (double) x.get("Price");
            double quantity= (double) x.get("Quantity");
            double subTotal = price * quantity;


        System.out.println("Items: " + items + " Price: " + price + " Quantity: " + quantity + " SubTotal: " + subTotal);
        }

        double totalPurchase=0;
        for (var x:dataList) {
            String items= (String) x.get("Items");
            double price= (double) x.get("Price");
            double quantity= (double) x.get("Quantity");
            totalPurchase+=price*quantity;

        }
        System.out.println("Your Purchase total : " + totalPurchase);

    }
}
