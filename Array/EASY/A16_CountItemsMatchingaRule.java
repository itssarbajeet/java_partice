import java.util.List;
public class A16_CountItemsMatchingaRule {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (List<String> item : items) {
            if ((ruleKey.equals("type") && item.get(0).equals(ruleValue))
                    || (ruleKey.equals("color") && item.get(1).equals(ruleValue))
                    || (ruleKey.equals("name") && item.get(2).equals(ruleValue))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        A16_CountItemsMatchingaRule solution = new A16_CountItemsMatchingaRule();
        List<List<String>> items = List.of(
                List.of("phone", "blue", "pixel"),
                List.of("laptop", "silver", "macbook"),
                List.of("watch", "black", "rolex")
        );
 
        String ruleKey = "color";
        String ruleValue = "blue";

        int matches = solution.countMatches(items, ruleKey, ruleValue);
        System.out.println("Number of matches: " + matches);
    }
}
 
/*
 * Example 1:

Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
Output: 1
Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
Example 2:

Input: items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]], ruleKey = "type", ruleValue = "phone"
Output: 2
Explanation: There are only two items matching the given rule, which are ["phone","blue","pixel"] and ["phone","gold","iphone"]. Note that the item ["computer","silver","phone"] does not match.
 */