public class Event
{
    int id;
    String packageName;
    String[] specifications;
    String costRange;
    
    public Event(final int id, final String packageName, final String[] specs, final String cost) {
        this.id = id;
        this.packageName = packageName;
        this.specifications = specs;
        this.costRange = cost;
    }
}