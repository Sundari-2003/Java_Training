package taxapp.comparators;

import taxapp.models.Property;

import java.util.Comparator;

public class PropertyComparator implements Comparator<Property> {

    public enum SortField {
        ID,
        PROPERTY_TAX
    }

    private SortField sortField;

    public PropertyComparator(SortField sortField) {
        this.sortField = sortField;
    }

    @Override
    public int compare(Property p1, Property p2) {
        switch (sortField) {
            case ID:
                return Integer.compare(p1.getId(), p2.getId());
            case PROPERTY_TAX:
                return Double.compare(p1.getPropertyTax(), p2.getPropertyTax());
            default:
                return 0;
        }
    }
}
