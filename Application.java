import java.util.*;

/**
 * Created by Lori on 2/3/2017.
 */
public class Application {

    /**
     * This method verifies if there is a key called "ice cream".
     * If there is, it modifies it's value to "cherry".
     * If is null, does the same.
     * In every case it creates a new value key pair called "bread" : "butter".
     *
     * @param map the provided map.
     * @return the map modified.
     */
    private Map<String, String> topping1(Map<String, String> map) {

        String cherry;
        if (map.get("ice cream") == null) {
            cherry = valueOfStringOrCherry(map, "ice cream");
            map.put("ice cream", cherry);
        }
        else
            map.put("ice cream", "cherry");
        
        map.put("bread", "butter");
        return map;
    }
    /**
     * This method is used to verify the value of the given key.
     * If the value is null, change it to cherry.
     *
     * @param map the map in which we find the key and value.
     * @param key the key that we will verify the value from.
     * @return the modified value.
     */

    private String valueOfStringOrCherry(Map<String, String> map, String key) {
        String value = map.get(key);
        if (value == null)
            value = "cherry";
        return value;
    }

    public static void main(String[] args) {
        Application application = new Application();
        Map<String, String> map = new HashMap<String, String>();
        map.put("ice cream", "jh");
        // map.put("chocolate","dark");


        Set set = application.topping1(map).entrySet();
        Iterator itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry entry = (Map.Entry) itr.next();
            System.out.print(entry.getKey() + ":" + entry.getValue() + " ");
        }
    }
}
